public enum bwcj {
    UNKNOWN,
    GOOGLE_AUTH_EXCEPTION,
    NO_CONNECTION,
    INVALID_LINK,
    INVALID_ARGUMENT;

    static {
        bwcj.f = arr_bwcj;
        ibsn.a(arr_bwcj);
    }

    public static bwcj a(String s) {
        return (bwcj)Enum.valueOf(bwcj.class, s);
    }
}

