import android.content.Context;
import com.google.android.gms.backup.BackupOptInSettings;
import com.google.android.gms.common.Feature;

public final class aqhi extends azts implements aqga {
    public static final azta_api a;
    private static final azss b;
    private static final azsy c;

    static {
        azss azss0 = new azss();
        aqhi.b = azss0;
        aqhg aqhg0 = new aqhg();
        aqhi.c = aqhg0;
        aqhi.a = new azta_api("G1Backup.API", aqhg0, azss0);
    }

    public aqhi(Context context0) {
        super(context0, aqhi.a, azsx.s, aztr_settings.a);
    }

    @Override  // aqga
    public final evql b(boolean z, String s, BackupOptInSettings backupOptInSettings0) {
        azzc azzc0 = new azzc();
        azzc0.a = new aqhe(this, z, s, backupOptInSettings0);
        azzc0.c = new Feature[]{aqfy.b};
        azzc0.d = 10216;
        return this.jn(azzc0.a());
    }

    @Override  // aqga
    public final evql c(boolean z) {
        azzc azzc0 = new azzc();
        azzc0.a = new aqhf(z);
        azzc0.c = new Feature[]{aqfy.e};
        azzc0.d = 10213;
        return this.jn(azzc0.a());
    }

    @Override  // aqga
    public final evql d(boolean z, String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new aqhc(z, s);
        azzc0.c = new Feature[]{aqfy.a};
        azzc0.d = 10205;
        return this.jn(azzc0.a());
    }

    @Override  // aqga
    public final evql e() {
        azzc azzc0 = new azzc();
        azzc0.a = new aqhb();
        azzc0.c = new Feature[]{aqfy.a};
        azzc0.d = 10207;
        return this.iG(azzc0.a());
    }

    @Override  // aqga
    public final evql f() {
        azzc azzc0 = new azzc();
        azzc0.a = new aqha();
        azzc0.c = new Feature[]{aqfy.e};
        azzc0.d = 10215;
        return this.iG(azzc0.a());
    }

    @Override  // aqga
    public final evql g() {
        azzc azzc0 = new azzc();
        azzc0.a = new aqhd();
        azzc0.c = new Feature[]{aqfy.a};
        azzc0.d = 10209;
        return this.iG(azzc0.a());
    }
}

