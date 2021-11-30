import com.example.cs3318_a03.VerifyEmail;
import com.example.cs3318_a03.noEmailException;
import com.example.cs3318_a03.poorlyFormedEmailException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class emailTests {
    @Test
    public void noEmailEntry(){
        assertThrows(noEmailException.class, () -> VerifyEmail.verifyInput(""), "No Email input SHOULD throw error");
    }
    @Test
    public void poorlyFormedEmail(){
        assertThrows(poorlyFormedEmailException.class, () -> VerifyEmail.verifyForm("dhgved"), "Poorly Formed Email input SHOULD throw error");
    }


}
