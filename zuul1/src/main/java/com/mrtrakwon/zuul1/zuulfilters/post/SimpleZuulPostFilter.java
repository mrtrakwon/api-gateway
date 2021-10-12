package com.mrtrakwon.zuul1.zuulfilters.post;

import com.mrtrakwon.zuul1.zuulfilters.pre.SimpleZuulPreFilter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.POST_TYPE;

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
