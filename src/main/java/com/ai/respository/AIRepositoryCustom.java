package com.ai.respository;

import com.ai.entity.ObjectDetails;

import java.util.List;

public interface AIRepositoryCustom {

    public List<ObjectDetails> findObjectTag(String imageId);
}
