public enum ajol {
    UNKNOWN,
    GRANTED,
    REJECTED;

    public static ajol a(String s) {
        return (ajol)Enum.valueOf(ajol.class, s);
    }
}

