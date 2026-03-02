import java.util.Locale;

public final class futq implements fwxy {
    private final fvwz a;

    public futq(fvwz fvwz0) {
        this.a = fvwz0;
    }

    @Override  // fwxy
    public final void a() {
    }

    @Override  // fwxy
    public final void b(fwxx fwxx0) {
        String s = String.format(Locale.US, "isCc=%b, conf=%f, veh_conf=%f, integ50=%s, integ75=%s, notif=%b, hash=%s", Boolean.valueOf(fwxx0.e), ((float)fwxx0.a), ((float)fwxx0.b), ((float)fwxx0.c), ((float)fwxx0.d), Boolean.valueOf(false), String.format(Locale.US, "%08x%08x%08x%08x", Float.floatToIntBits(fwxx0.a), Float.floatToIntBits(fwxx0.b), Float.floatToIntBits(fwxx0.c), Float.floatToIntBits(fwxx0.d)));
        fvwx fvwx0 = new fvwx(0x76, this.a.f(), null, s, -1, -1, -1);
        this.a.a(fvwx0);
    }
}

