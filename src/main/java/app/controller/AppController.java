package app.controller;

import app.model.AppModel;
import app.view.AppView;

public class AppController {

    private AppModel model;
    private AppView view;

    public AppController() {
        this.model = new AppModel();
        this.view = new AppView();
    }

    public void start() {
        model.start();
        view.start();
    }
}
