import com.google.android.gms.common.api.ApiMetadata;

public final class azug {
    public final aztj a;
    public final aztm b;
    public final aztd c;
    public final bbdp d;
    private static final azug e;

    static {
        azug.e = azug.a().a();
    }

    public azug() {
        throw null;
    }

    public azug(aztj aztj0, aztm aztm0, aztd aztd0, bbdp bbdp0) {
        this.a = aztj0;
        this.b = aztm0;
        this.c = aztd0;
        this.d = bbdp0;
    }

    public static azuf a() {
        azuf azuf0 = new azuf();
        azuf0.e(bbdp.a);
        return azuf0;
    }

    public static azuf b(ApiMetadata apiMetadata0) {
        azuf azuf0 = new azuf();
        azuf0.e(bbdp.a);
        azuf0.b(apiMetadata0);
        return azuf0;
    }

    public static azug c() {
        return hrnb.a.c().w() ? azug.a().a() : azug.e;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof azug) && this.a.equals(((azug)object0).a) && this.b.equals(((azug)object0).b) && this.c.equals(((azug)object0).c) && this.d.equals(((azug)object0).d);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() ^ (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "RequestContext{callerInfo=" + this.a + ", complianceMetadata=" + this.b + ", apiInfo=" + this.c + ", moduleId=" + this.d + "}";
    }
}

