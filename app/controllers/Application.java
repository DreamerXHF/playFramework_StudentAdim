package controllers;

import play.*;
import play.mvc.*;


public class Application extends Controller {

    public static void index() {
        String user = Security.connected();
        render(user);
    }
    public static void studentadmin(){
        render();
    }
}
