import java.util.concurrent.Executor;

public final class bpsj {
    public static final bboh a;
    public final Executor b;
    public final bnla c;
    public final fqwt d;

    static {
        bpsj.a = bboh.b("SyncedDeviceSecretsProv", bbcu.eD);
    }

    public bpsj(Executor executor0, bnla bnla0, fqwt fqwt0) {
        this.b = executor0;
        this.c = bnla0;
        this.d = fqwt0;
    }

    public final gdta a(gsyz gsyz0, gtap gtap0, gtad gtad0) {
        boolean z = gtap0.e.size() == 0x30 || gtap0.f.size() == 0x20;
        return gdta.g(this.d.a(gtap0)).i(new bpsi(this, gsyz0, gtad0, z), this.b);
    }
}

