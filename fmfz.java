import java.security.InvalidParameterException;

public enum fmfz {
    DEFAULT_RENDERING_TYPE(0),
    TOMBSTONE(1),
    OVERLAY(2),
    INVALID(3);

    public static final fmfz[] e;
    public static final fmfz[] f;
    public final int g;

    static {
        fmfz.e = new fmfz[]{fmfz.a, fmfz.c};
        fmfz.f = new fmfz[]{fmfz.a, fmfz.b};
    }

    private fmfz(int v1) {
        this.g = v1;
    }

    public static fmfz a(int v) {
        fmfz fmfz0 = (fmfz)ggch.k(fmfz.values()).c(new fmfy(v)).g();
        if(fmfz0 != null) {
            return fmfz0;
        }
        throw new InvalidParameterException("Invalid ElementType.");
    }
}

