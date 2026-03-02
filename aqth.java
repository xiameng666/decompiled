import android.content.Context;

public final class aqth {
    private final aqtf a;

    public aqth(aqtf aqtf0) {
        this.a = aqtf0;
    }

    public static aqth a(Context context0) {
        return new aqth(new aqtf(context0));
    }

    public final void b(aqtw aqtw0, aqtv aqtv0, aqvd aqvd0) {
        this.a.b().a(aqtw0, aqtv0, aqvd0);
    }

    public final void c(aqvd aqvd0) {
        this.a.b().b(aqvd0);
    }

    @Deprecated
    public final void d(fpth fpth0, aqvd aqvd0) {
        this.a.a().a.a(new aqti(fpth0), 9, aqvd0);
    }

    @Deprecated
    public final boolean e(fpth fpth0, aqvd aqvd0) {
        return this.a.a().a.b(new aqtj(fpth0), 8, aqvd0);
    }
}

