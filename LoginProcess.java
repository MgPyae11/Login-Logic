public class LoginProcess {

  public static void main(String[] args) {
    String userName="mg pyae";
    String userPassword="178245";

    if (userName=="mg pyae" && userPassword=="178245") {
      System.out.println("Login Success.");
    }else if (userName=="mg pyae") {
      System.out.println("Your password is wrong.");
    }else if (userPassword=="178245") {
      System.out.println("Your user name is wrong.");
    }else{
      System.out.println("Both of your user name and password are wrong.");
    }
  }
}