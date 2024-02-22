package src.oops_13_Jan_2024.Encapsulation;

public class Lab152 {
    public static void main(String[] args) {

        // Hidden
        vwoLoginFixed vwoLogin = new vwoLoginFixed("admin","admin");
        // Hidden

        boolean check = vwoLogin.isLoggedIn("admin","password");
        String u = vwoLogin.getUsername();
//        String u = vwoLogin.getPassword();
//        vwoLogin.password = "?";
        System.out.println(u);
        System.out.println(check);

        /// vwoLogin.pramod();




    }
}



class vwoLoginFixed{

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private void pramod(){
        System.out.println("I am private");
    }


    // data members / variables

    private String username;
    private String password;

    vwoLoginFixed(String u, String p){
        this.password = p;
        this.username = u;
    }

    boolean isLoggedIn(String username, String password){

        pramod();

        if(this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN!!");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }

    }










}