package Utils;

public class Helper {
    
    public static String UserLogin(String username){
        String password = "";
        switch (username){
            case "kraken":
                password = "kraken";
                break;
            default:
                password = "kraken123";
        }
        return password;
    }
}
