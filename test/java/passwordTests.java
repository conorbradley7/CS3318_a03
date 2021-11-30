import com.example.cs3318_a03.NoPasswordException;
import com.example.cs3318_a03.ShortPasswordException;
import com.example.cs3318_a03.VerifyPassword;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class passwordTests {
    @Test
    public void noPasswordEntry(){
        assertThrows(NoPasswordException.class, () -> VerifyPassword.verifyInput(""), "No Password input SHOULD throw error");
    }
    @Test
    public void shortPassword(){
        assertThrows(ShortPasswordException.class, () -> VerifyPassword.shortPassword("123456"), "Short password SHOULD throw error");
    }
}
