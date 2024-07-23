package User_Account;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {
    private UserManager um;

    @Before
    public void setUp() {
        um = new UserManager();
        um.addUser(new User("Alice", "password123"));
        um.addUser(new User("Bob", "securePass"));
    }

    @Test
    public void testSuccessLogin(){
        User user = um.login("Alice", "password123");
        assertNotNull(user);
        assertEquals("Alice", user.getUsername());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoginFailure() {
        User user = um.login("Alice", "wrongPassword");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoginNonexistentUser() {
        User user = um.login("Charlie", "password123");
    }
}