package project.rol;

// Roller
public enum ERoles {
    ADMIN(1,"admin"),USER(2,"user");

    // Key
    private final Integer key;
    private final String value;

    // Constructor (Parametreli constructor)
   private ERoles(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    // GETTER
    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
