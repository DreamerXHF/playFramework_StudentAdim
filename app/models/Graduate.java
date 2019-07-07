package models;

import play.data.validation.*;
import play.db.jpa.*;

import javax.persistence.*;

@Entity
public class Graduate extends Model {
    @Required
    public String name;
    @Required
    @Password
    @MaxSize(value = 16,message = "最多不超过16个字符")
    @MinSize(value = 6,message = "最小不少于6个字符")
    public String password;
    @Required
    public double  cost;
    public Graduate(String name,String password,double cost){
        this.name = name;
        this.password = password;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name;
    }

}
