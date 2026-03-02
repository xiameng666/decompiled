import java.util.Locale;

final class igwv extends igvx {
    final byte[] e;
    private final int f;
    private final int g;

    public igwv(igvt igvt0, String s) {
        super(igvt0, s);
        igvv igvv0 = igvt0.e();
        igwt igwt0 = new igwt(igvt0, "LocDefType", 8);
        this.e(igwt0);
        this.f = (short)(((Short)igwt0.b()));
        igvw igvw0 = new igvw(igvt0, "LocSize");
        this.e(igvw0);
        int v = (short)(((Short)igvw0.b()));
        this.g = v;
        this.e(new igvy(igvt0, "Contents", v * 8));
        igvt0.g(igvv0);
        this.e = igvt0.h(v + 2);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return this.e;
    }

    @Override  // igvx
    public final String toString() {
        return String.format(Locale.UK, "LOC1 %1$d, %2$d", ((int)this.f), ((int)this.g));
    }
}

