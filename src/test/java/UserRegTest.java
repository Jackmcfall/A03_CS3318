import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRegTest {

    @Test
    public void getUserReg(){
        UserReg userReg = new UserReg();
        assertEquals(0.0, userReg.getEmail(), 0.0);

    }

}
