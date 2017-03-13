package com.leonlu.code.sample.webapp.ws.configuration;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

/**
 * Created by vkotagiri on 3/9/17.
 */
@Component
public class SimpleCORSFilter implements Filter {

    @Override
    public final void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain) throws IOException, ServletException {
        final HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        // response.setHeader("Access-Control-Allow-Origin", "http://54.164.175.61");

        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, WWW-Authenticate, Authorization, Origin, Content-Type, Version");
        response.setHeader("Access-Control-Expose-Headers", "X-Requested-With, WWW-Authenticate, Authorization, Origin, Content-Type");
        // response.setHeader("Access-Control-Allow-Credentials", "true");

        chain.doFilter(req, res);
    }

    @Override
    public void init(final FilterConfig filterConfig) {
    }

    @Override
    public void destroy() {
    }

}
