public final class cjmk {
    public static void a(cjmh cjmh0) {
        cjmj cjmj0 = cjmj.a;
        if(cjmj0.b != null) {
            throw new IllegalArgumentException("Setting loggerService after it was already set");
        }
        cjmj0.b = cjmh0;
    }
}

