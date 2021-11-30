import com.example.cs3318_a03.VerifyEmail;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class emailTests {
    @Test
    public void noEmailEntry(){
        assertEquals("Email Entry Required!", VerifyEmail.verify(""));
    }

}
