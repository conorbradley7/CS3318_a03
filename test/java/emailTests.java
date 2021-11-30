import com.example.cs3318_a03.VerifyEmail;
import com.example.cs3318_a03.NoEmailException;
import com.example.cs3318_a03.PoorlyFormedEmailException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class emailTests {
    @Test
    public void noEmailEntry(){
        assertThrows(NoEmailException.class, () -> VerifyEmail.verifyInput(""), "No Email input SHOULD throw error");
    }
    @Test
    public void poorlyFormedEmail(){
        assertThrows(PoorlyFormedEmailException.class, () -> VerifyEmail.verifyForm("dhgved"), "Poorly Formed Email input SHOULD throw error");
    }


}
