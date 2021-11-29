import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegTest {

    @Test
    public void getUserReg(){
        UserReg userReg = new UserReg();
        assertEquals(0.0, userReg.getEmail(), 0.0);

    }

    @Test
    public void getUserPassword(){
        UserReg password = new UserReg();
        assertEquals(0.0, password.getUserPassword(), 0.0);
    }

}
