package app.controller;

import app.model.AppModel;
import app.view.AppView;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppController extends AbstractController {

//    private AppModel model;
//    private AppView view;

//    public AppController() {
//        this.model = new AppModel();
//        this.view = new AppView();
//    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView model = new ModelAndView("HelloWorldPage");
        model.addObject("msg", "hello world");

        return model;
    }

//    public void start() {
//        model.start();
//        view.start();
//    }
}
