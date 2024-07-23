package User_Account;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private User user;

    @Before
    public void setUp() {
        this.user = new User("Alice", "password123");
    }

    @Test
    public void testUserCreation(){
        assertEquals("Alice", user.getUsername());
        assertEquals("password123", user.getPassword());
    }

    @Test
    public void testUserModification(){
        user.setUsername("Bob");
        assertEquals("Bob", user.getUsername());
        user.setPassword("newPassword123");
        assertEquals("newPassword123", user.getPassword());
    }

}