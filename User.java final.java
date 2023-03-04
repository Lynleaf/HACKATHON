import java.util.Scanner;
public class User {
    private String username;
    private String password;
    private int view;
    private String name;
    Scanner sc = new Scanner(System.in);
    public User(String u, String p){
        username = u;
        password = p;
        view = 1;
        name = "Anonymous";
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }
    public int getViewnum(){
        return view;
    }
    public void setViewnum(int v){
        view = v;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println();
    }
}
