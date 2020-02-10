package yncrea.lab05.web;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import yncrea.lab05.core.config.AppConfig;
import yncrea.lab05.core.config.DBConfig;
import yncrea.lab05.web.config.WSConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        ServletRegistration.Dynamic cxfServlet= servletContext.addServlet("cxfServlet",new CXFServlet());
        cxfServlet.addMapping("/services/*");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        Class<?>[] arrayRootConfigClass={AppConfig.class, DBConfig.class, WSConfig.class};
        return arrayRootConfigClass;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        String[] arrayServletMapping={"/"};
        return arrayServletMapping;
    }
}
