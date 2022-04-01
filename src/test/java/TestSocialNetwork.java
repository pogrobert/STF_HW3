import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSocialNetwork {
    @Test
    public void testLoadFeed() throws Exception {
        assertEquals(new SocialNetwork().loadFeed(true), "Feed loaded");
        assertEquals(new SocialNetwork().loadFeed(false), "Unable to load");
    }

    @Test
    public void testAddFriend() {
        assertEquals(new SocialNetwork().addFriend(false), "Request denied");
        assertEquals(new SocialNetwork().addFriend(true), "New Friend Added");
    }

    @Test
    public void testAddPost() {
        assertEquals(new SocialNetwork().addPost("New Post"), "New Post");
        assertEquals(new SocialNetwork().addPost(""), "Empty String");
    }

    @Test
    public void deleteAccount() {
        assertEquals(new SocialNetwork().deleteAccount("1234", "1234"), "Successfully deleted");
        assertEquals(new SocialNetwork().deleteAccount("1234", "123"), "Incorrect Password");
    }
}
