package com.csys.workflow.config;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this workflow file, choose Tools | workflows
 * and open the workflow in the editor.
 */

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Farouk
 */
public class ExposedResourceMessageBundleSource extends ReloadableResourceBundleMessageSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExposedResourceMessageBundleSource.class);

    @Override
    protected Properties loadProperties(Resource resource, String fileName) throws IOException {

        LOGGER.info("Load " + fileName);
        return super.loadProperties(resource, fileName);
    }

    /**
     * Gets all messages for presented Locale.
     *
     * @param locale user request's locale
     * @return all messages
     */
    public Properties getMessages(Locale locale) {
        return getMergedProperties(locale).getProperties();
    }
}

