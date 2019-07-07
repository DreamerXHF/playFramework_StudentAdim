package controllers;

import models.UnderGraduate;
import play.mvc.*;

@With(Security.class)
public class UnderGraduates extends CRUD {
    @Check("studentmodify")
    public void Modify(String id){
    }

    public static void studentsadmin(){
        render();
    }


}
