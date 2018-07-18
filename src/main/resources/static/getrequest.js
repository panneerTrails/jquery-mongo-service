$( document ).ready(function() {
	
	var url = window.location;

	// GET REQUEST
	$("#getBtn").click(function(event){
		event.preventDefault();
		ajaxGet();
	});
	
	// DO GET
	function ajaxGet(){
        var tag=$("#tag").val();
        var finalUrl = "http://localhost:9095" + "/AIService/getObjectDetails/"+tag;
        $.ajax({
            type : "GET",
            dataType: 'json',
            url : finalUrl,
            success: function(result){
                    $.each(result, function(i, imgObjects){
                        var objectDetails = "ImageId=" + imgObjects.imageId + " <br\>";
                        $('#getResultDiv .list-group').append('<li><h4 class="list-group-item">'+objectDetails+'</h4></li>')
                        $('#getResultDiv .list-group').append('<li><h4 class="list-group-item">'+imgObjects.objecttag +'</h4></li>')
                    });
                }
        });
    }
})