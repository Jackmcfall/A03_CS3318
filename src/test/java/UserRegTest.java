import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegTest {

    @Test
    public void getEmailTest(){
        UserReg email = new UserReg();
        assertEquals(0, email.getEmail(), 0);

    }

    @Test
    public void acceptPasswordWith7Characters(){
        UserReg password = new UserReg();
        assertEquals(0, password.getUserPassword(), 0);
    }

    @Test
    public void getUserPassword(){
        UserReg password = new UserReg();
        assertEquals(0, password.getUserPassword(), 0);
    }

}
