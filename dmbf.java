import android.content.Context;

public final class dmbf implements dmba {
    private final Context a;

    public dmbf(Context context0) {
        ibuq.f(context0, "context");
        super();
        this.a = context0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 74, "Cannot evaluate this filter, because it is not an NFC Status filter.", new Object[0]);
        hjsz hjsz0 = hjwe0.b == 74 ? ((hjsz)hjwe0.c) : hjsz.b;
        ibuq.e(hjsz0, "getDoubleTapPowerGestureSettingFilter(...)");
        gtmx gtmx0 = ftrk.a(this.a);
        return new hfuh(hjsz0.c, hjsz.a).contains(gtmx0);
    }
}

