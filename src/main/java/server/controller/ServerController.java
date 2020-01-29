package server.controller;

import server.model.ServerModel;
import server.view.ServerView;

public class ServerController {

    private ServerModel sv_model;
    private ServerView sv_view;

    public ServerController() {

    }

    public void start() {
        sv_model.start();
        sv_view.start();
    }
}
