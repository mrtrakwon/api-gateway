package com.mrtrakwon.zuulv1.zuulfilters.post;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SimpleZuulPostFilter extends ZuulFilter {

    private final static Logger logger = LoggerFactory.getLogger(SimpleZuulPostFilter.class);

    @Override
    public String filterType() {
        logger.debug(this.getClass() + ", call filterType method");
        return POST_TYPE;
    }

    @Override
    public int filterOrder() {
        logger.debug(this.getClass() + ",call filterOrder method ");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        logger.debug(this.getClass() + ", call shouldFilter method ");
        return false;
    }

    @Override
    public Object run() throws ZuulException {
        logger.debug(this.getClass()+", call run method");
        return null;
    }
}
