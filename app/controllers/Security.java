package controllers;

public class Security extends Secure.Security{
    static boolean authenticate(String username,String password) {
        boolean ret = username != null && password != null
                && (username.equals("root") && password.equals("abc"));
        session.put("currentUser", username);
        return ret;
    }
    public static boolean check(String profile) {
        if (Security.isConnected()) {
            String user = Security.connected();
            boolean rst = false;
            if (profile.equals("studentmodify")&& user.equals("root"))
                rst = true;
            return rst;
        } else {
            return false;
        }
    }
}
