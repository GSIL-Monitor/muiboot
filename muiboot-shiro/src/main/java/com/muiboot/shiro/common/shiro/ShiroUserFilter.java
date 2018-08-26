package com.muiboot.shiro.common.shiro;;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 75631 on 2018/8/26.
 */
public class ShiroUserFilter extends UserFilter {
    private static final Logger log = LoggerFactory.getLogger(ShiroUserFilter.class);
    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        if(isAjax(request)){
            HttpServletResponse res= (HttpServletResponse) response;
            res.setStatus(HttpServletResponse.SC_SEE_OTHER);
            res.sendError(HttpServletResponse.SC_SEE_OTHER,"登陆超时");
        }else{
            this.saveRequestAndRedirectToLogin(request, response);
        }
        return false;
    }

    public static boolean isAjax(ServletRequest request){
        String header = ((HttpServletRequest) request).getHeader("X-Requested-With");
        if("XMLHttpRequest".equalsIgnoreCase(header)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
