public class kln extends Exception {
    public final CharSequence a;
    private final String b;

    public kln(String s, CharSequence charSequence0) {
        ibuq.f(s, "type");
        super((charSequence0 == null ? null : charSequence0.toString()));
        this.b = s;
        this.a = charSequence0;
    }

    public String a() {
        return this.b;
    }
}

