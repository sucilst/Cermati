package Utils;

public interface database {
 static String getPassword(String username) {
        String password = "";

        switch (username) {
            case "kraken":
                password = "kraken";
                break;

            case "febri":
                password = "alterra123";
                break;

            case "setio":
                password = "setio";
                break;
            default:
                System.out.println("Username invalid");

        }

        return password;
    }
}