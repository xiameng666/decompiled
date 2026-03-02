import java.util.List;

public final class gbll implements gblg {
    public final omn a;
    public final oko b;

    public gbll(omn omn0) {
        this.a = omn0;
        this.b = new gblj(this);
        new gblk(this);
    }

    @Override  // gblg
    public final List a(String s) {
        gbli gbli0 = new gbli(s);
        return (List)oqj.b(this.a, true, false, gbli0);
    }
}

