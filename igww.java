import java.util.Locale;

final class igww extends igvx {
    final byte[] e;
    private final short f;

    public igww(igvt igvt0, String s) {
        super(igvt0, s);
        igvv igvv0 = igvt0.e();
        igwt igwt0 = new igwt(igvt0, "LocDefType", 8);
        this.e(igwt0);
        this.f = (short)(((Short)igwt0.b()));
        this.e(new igvy(igvt0, "Contents", 0x30));
        igvt0.g(igvv0);
        this.e = igvt0.h(7);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return this.e;
    }

    @Override  // igvx
    public final String toString() {
        return String.format(Locale.UK, "LOC2 %1$d", ((short)this.f));
    }
}

