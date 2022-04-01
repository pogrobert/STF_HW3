import java.util.Objects;

public class SocialNetwork {
    public String loadFeed(boolean networkConnection) {
        if (!networkConnection) {
            return "Unable to load";
        }

        return "Feed loaded";
    }

    public String addFriend(boolean acceptRequest) {
        if (!acceptRequest) {
            return "Request denied";
        }

        return "New Friend Added";
    }

    public String addPost(String text) {
        if (text.isEmpty()) {
            return "Empty String";
        }

        return text;
    }

    public String deleteAccount(String inputtedPassword, String actualPassword) {
        if (!Objects.equals(inputtedPassword, actualPassword)) {
            return "Incorrect Password";
        }

        return "Successfully deleted";
    }
}
