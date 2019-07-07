package controllers;

import models.*;

public class Graduates extends CRUD {
    public static void studentsadmin(){
        render();
    }
    public static void Search(String id){
        Graduate object = Graduate.findById(Long.parseLong(id));
        render("@Search",object);
    }
    public static void Update(String id){
        Graduate object = Graduate.findById(Long.parseLong(id));
        render("@Update",object);
    }
}
