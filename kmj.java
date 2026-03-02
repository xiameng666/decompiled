public class kmj extends kln {
    private final String b;

    public kmj(String s, CharSequence charSequence0) {
        super(s, charSequence0);
        this.b = s;
        if(s.length() > 0) {
            return;
        }
        throw new IllegalArgumentException("type must not be empty");
    }

    @Override  // kln
    public final String a() {
        return this.b;
    }
}

