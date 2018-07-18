package com.ai.service;

import com.ai.entity.ObjectDetails;
import com.ai.respository.AIRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AIService.class);

    @Autowired
    private AIRepository aiRepository;

    public List<ObjectDetails> getObjectDetails(String tag) {
        LOGGER.info("AIService::Inside getObjectDetails:::");
        return aiRepository.findObjectTag(tag);
    }
}
