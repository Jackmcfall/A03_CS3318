public class Password {
    public Password(String password) {
    }

    public String accept(String password){
        if (password.length() < 7){
            System.out.println("Character must be at least 7 characters long");
        }

        else {
            return password;
        }
        return password;
    }

}
