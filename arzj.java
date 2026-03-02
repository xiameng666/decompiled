import android.content.Context;
import android.content.Intent;
import android.provider.Settings.Secure;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.g1.restore.G1RestoreApiChimeraService;
import com.google.android.gms.backup.g1.restore.G1RestoreApiStub.1;
import com.google.android.gms.backup.g1.restore.VerifyAutoRestoreIntentOperation;
import com.google.android.gms.backup.g1.restore.mms.StartMmsRestoreIntentOperation;
import com.google.android.gms.backup.g1.restore.photos.StartPhotosRestoreIntentOperation;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class arzj extends asao implements cjug {
    public static final aqql a;
    private final String b;
    private final String c;
    private final asdc d;
    private final G1RestoreApiChimeraService e;
    private final cjts f;

    static {
        arzj.a = new aqql(new String[]{"G1RestoreApi"});
    }

    public arzj(G1RestoreApiChimeraService g1RestoreApiChimeraService0, cjts cjts0, String s, String s1) {
        this.d = asdc.a;
        this.b = s;
        this.c = s1;
        this.e = g1RestoreApiChimeraService0;
        this.f = cjts0;
    }

    @Override  // asap
    public final void a(boolean z) {
        Context context0 = this.e.getApplicationContext();
        this.d.c(context0, z);
    }

    @Override  // asap
    public final void c(boolean z) {
        Context context0 = this.e.getApplicationContext();
        this.d.f(context0, z);
    }

    @Override  // asap
    public final boolean d() {
        return hqje.a.m().D();
    }

    @Override  // asap
    public final void e(boolean z, boolean z1) {
        if(hqje.O() && hqje.z()) {
            arzj.a.m("Mms restore invoke attempt via legacy interface", new Object[0]);
            return;
        }
        if(z) {
            this.d.d(this.e, false);
            this.d.b(this.e, false);
        }
        if(z1) {
            G1RestoreApiChimeraService g1RestoreApiChimeraService0 = this.e;
            Settings.Secure.putInt(g1RestoreApiChimeraService0.getContentResolver(), "mms_restore_enabled", 0);
            Intent intent0 = IntentOperation.getStartIntent(g1RestoreApiChimeraService0, VerifyAutoRestoreIntentOperation.class, "com.google.android.gms.backup.g1.VERIFY_AUTO_RESTORE");
            if(intent0 != null) {
                g1RestoreApiChimeraService0.startService(intent0);
            }
        }
        else {
            G1RestoreApiChimeraService g1RestoreApiChimeraService1 = this.e;
            this.d.c(g1RestoreApiChimeraService1, true);
            Intent intent1 = IntentOperation.getStartIntent(g1RestoreApiChimeraService1, StartMmsRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_MMS_RESTORE");
            if(intent1 != null) {
                g1RestoreApiChimeraService1.startService(intent1);
            }
        }
    }

    @Override  // asap
    public final void f(boolean z, boolean z1) {
        if(z) {
            this.d.g(this.e, false);
            this.d.e(this.e, false);
        }
        if(z1) {
            G1RestoreApiChimeraService g1RestoreApiChimeraService0 = this.e;
            Settings.Secure.putInt(g1RestoreApiChimeraService0.getContentResolver(), "photos_restore_enabled", 0);
            Intent intent0 = IntentOperation.getStartIntent(g1RestoreApiChimeraService0, VerifyAutoRestoreIntentOperation.class, "com.google.android.gms.backup.g1.VERIFY_AUTO_RESTORE");
            if(intent0 != null) {
                g1RestoreApiChimeraService0.startService(intent0);
            }
        }
        else {
            G1RestoreApiChimeraService g1RestoreApiChimeraService1 = this.e;
            this.d.f(g1RestoreApiChimeraService1, true);
            Intent intent1 = IntentOperation.getStartIntent(g1RestoreApiChimeraService1, StartPhotosRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_PHOTOS_RESTORE");
            if(intent1 != null) {
                g1RestoreApiChimeraService1.startService(intent1);
            }
        }
    }

    @Override  // asap
    public final void g(String s) {
        Settings.Secure.putString(this.e.getApplicationContext().getContentResolver(), "restore_ancestor_id", s);
    }

    @Override  // asap
    public final void h(asaw asaw0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.af);
        azuf0.g(bbdq.l);
        azuf0.d(this.b);
        azuf0.c(this.c);
        arzl arzl0 = new arzl(asaw0, s, azuf0.a());
        this.f.b(arzl0);
    }

    @Override  // asap
    public final void i(boolean z, asax asax0) {
        if(hqje.O() && hqje.z()) {
            arzj.a.m("Mms restore invoke attempt via legacy interface", new Object[0]);
            asax0.a(Status.d, ApiMetadata.b);
            return;
        }
        G1RestoreApiStub.1 g1RestoreApiStub$10 = new G1RestoreApiStub.1(this, new bblf(new bblg(10)), asax0);
        if(z) {
            this.d.d(this.e, false);
            this.d.b(this.e, false);
        }
        G1RestoreApiChimeraService g1RestoreApiChimeraService0 = this.e;
        this.d.c(g1RestoreApiChimeraService0, true);
        Intent intent0 = IntentOperation.getStartIntent(g1RestoreApiChimeraService0, StartMmsRestoreIntentOperation.class, "com.google.android.gms.backup.g1.START_MMS_RESTORE");
        if(intent0 != null) {
            intent0.putExtra("resultReceiver", g1RestoreApiStub$10);
            g1RestoreApiChimeraService0.startService(intent0);
        }
    }
}

