import org.junit.jupiter.api.Test;

public class passwordTests {
    @Test
    public void noPasswordEntry(){
        assertThrows(noPasswordException.class, () -> VerifyPassword.verifyInput(""), "No Password input SHOULD throw error");
    }
}
