public class kle extends Exception {
    public final String a;
    public final CharSequence b;

    public kle(String s, CharSequence charSequence0) {
        ibuq.f(s, "type");
        super((charSequence0 == null ? null : charSequence0.toString()));
        this.a = s;
        this.b = charSequence0;
    }

    public String a() {
        return this.a;
    }
}

