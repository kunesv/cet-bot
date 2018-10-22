package cz.sprinters.cb;

import java.util.UUID;

public class Input {
    private UUID userId;
    private String value;

    public Input(UUID userId, String value) {
        this.userId = userId;
        this.value = value;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
