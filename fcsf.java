import android.content.Context;

public final class fcsf {
    public static final baun a;
    private final Context b;
    private final fced c;

    static {
        fcsf.a = new fcgf(new String[]{"WearBackupCapabilitySetter"});
    }

    public fcsf(Context context0, fced fced0) {
        this.b = context0;
        this.c = fced0;
    }

    public final gmcd a() {
        boolean z = aqzy.a(this.b);
        fcsf.a.j("Updating backup capability to %b", new Object[]{Boolean.valueOf(z)});
        evql evql0 = z ? this.c.f("com.google.android.gms.wearable.companion_backup_settings_wear_app") : this.c.i("com.google.android.gms.wearable.companion_backup_settings_wear_app");
        evql0.b(new fcsd());
        evql0.A(new fcse());
        return fhra.b(evql0);
    }
}

