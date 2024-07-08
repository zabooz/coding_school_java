package konfektion;

public enum SizeBot {
    HELLO("Hy I'm  Fashion Goddess Babsi. I'm here to help you find your perfect size! Please anwser the questions below!"),
    BUSTSIZE("Enter your Bust circumference"),
    HEIGHT("Enter your Height"),
    GENDER("Are you a boy(enter 0) or a girl(enter 1)");

    private final String message;

    SizeBot(String message) {
        this.message = message;
    }

    public String getMessage() {

        return message;

    }

}
