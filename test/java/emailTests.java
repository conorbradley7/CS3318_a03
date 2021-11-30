import com.example.cs3318_a03.VerifyEmail;
import com.example.cs3318_a03.noEmailException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class emailTests {
    @Test
    public void noEmailEntry(){
        assertThrows(noEmailException.class, () -> VerifyEmail.verifyInput(""), "No Email input SHOULD throw error");
    }


}
