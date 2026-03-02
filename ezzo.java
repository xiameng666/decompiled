import com.google.android.gms.update.SystemUpdateStatus;

public final class ezzo extends ezyn {
    private final ezxs g;
    private final ccmg h;

    public ezzo(fagj fagj0) {
        super("pending", fagj0);
        this.g = (ezxs)ezxs.l.b();
        this.h = new ccmp();
    }

    @Override  // ezyj
    public final ezyi a() {
        ezxs ezxs0 = this.g;
        SystemUpdateStatus systemUpdateStatus0 = ezxs0.b();
        String s = systemUpdateStatus0.a;
        if(gfta.c(s)) {
            ezxs0.u(0, -1.0);
            return new ezyi("finished-execution", fagj.b(new fagh[0]));
        }
        this.h.a(bbdg.nQ);
        if(systemUpdateStatus0.b) {
            fagi fagi0 = new fagi();
            fagi0.e(ezzn.g, s);
            return new ezyi("non-streaming-process-package", fagi0.a());
        }
        return new ezyi("pre-download-validate", fagj.b(new fagh[0]));
    }
}

