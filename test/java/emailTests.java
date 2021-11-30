import com.example.cs3318_a03.VerifyEmail;
import com.example.cs3318_a03.noEmailException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class emailTests {
    @Test
    public void noEmailEntry(){
        assertThrows(noEmailException.class, () -> VerifyEmail.doTests(""), "No Email input SHOULD throw error");
    }
    @Test
    public void poorlyFormedEmail(){
        assertThrows(poorlyFormedEmail.class, () -> VerifyEmail.doTests(""), "Poorly Formed Email input SHOULD throw error");
    }


}
