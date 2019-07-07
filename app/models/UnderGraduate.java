package models;

import play.data.validation.*;
import play.db.jpa.*;

import javax.persistence.*;

@Entity
public class UnderGraduate extends Model {
    @Required
    public String name;
    @Required
    @Password
    public String password;
    @Required
    public double cost;
    public UnderGraduate(String name,String password,double cost){
        this.name = name;
        this.password = password;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name;
    }
}
