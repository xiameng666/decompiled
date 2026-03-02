public class kmg extends kle {
    private final String c;

    public kmg(String s, CharSequence charSequence0) {
        super(s, charSequence0);
        this.c = s;
        if(s.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("type must not be empty");
    }

    @Override  // kle
    public final String a() {
        return this.c;
    }
}

