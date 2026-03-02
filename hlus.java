// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class hlus extends Enum {
    public static final enum hlus a;
    public static final enum hlus b;
    public static final enum hlus c;
    public final gged_interceptors d;
    public final gged_interceptors e;
    public final gged_interceptors f;
    private static final hlus[] g;

    static {
        gged_interceptors gged0 = gged_interceptors.m("https", "http");
        ibuq.e(gged0, "of(...)");
        gged_interceptors gged1 = gged_interceptors.m("www.google.com", "google.com");
        ibuq.e(gged1, "of(...)");
        gged_interceptors gged2 = gged_interceptors.m("android", "find");
        ibuq.e(gged2, "of(...)");
        hlus.a = new hlus("GOOGLE", 0, gged0, gged1, gged2);
        gged_interceptors gged3 = gged_interceptors.m("https", "http");
        ibuq.e(gged3, "of(...)");
        gged_interceptors gged4 = gged_interceptors.m("www.android.com", "android.com");
        ibuq.e(gged4, "of(...)");
        gged_interceptors gged5 = gged_interceptors.l("find");
        ibuq.e(gged5, "of(...)");
        hlus.b = new hlus("ANDROID", 1, gged3, gged4, gged5);
        gged_interceptors gged6 = gged_interceptors.l("android");
        ibuq.e(gged6, "of(...)");
        gged_interceptors gged7 = gged_interceptors.l("find");
        ibuq.e(gged7, "of(...)");
        ibuq.e(ggna.a, "of(...)");
        hlus.c = new hlus("ANDROID_NATIVE", 2, gged6, gged7, ggna.a);
        hlus[] arr_hlus = {hlus.a, hlus.b, hlus.c};
        hlus.g = arr_hlus;
        ibsn.a(arr_hlus);
    }

    private hlus(String s, int v, gged_interceptors gged0, gged_interceptors gged1, gged_interceptors gged2) {
        super(s, v);
        this.d = gged0;
        this.e = gged1;
        this.f = gged2;
    }

    public static hlus[] values() {
        return (hlus[])hlus.g.clone();
    }
}

