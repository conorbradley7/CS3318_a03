import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class emailTests {
    @Test
    public void noEmailEntry(){
        assertEquals("", SignUpController.getEmail());_
    }

}
