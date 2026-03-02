import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Binder;
import android.os.RemoteException;
import android.provider.Settings.Secure;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.BackupOptInSettings;
import com.google.android.gms.backup.g1.backup.G1BackupApiChimeraService;
import com.google.android.gms.backup.g1.backup.G1BackupApiStub.1;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.concurrent.TimeUnit;

public final class arvz extends asam implements cjug {
    public static final aqql a;
    public final G1BackupApiChimeraService b;
    private final String c;
    private final String d;
    private final aqjl e;
    private final asdc f;
    private final cjts g;
    private final aqee h;
    private final aqjk i;
    private final GetServiceRequest j;
    private final aqys k;
    private final arvy l;

    static {
        arvz.a = new aqql(new String[]{"G1BackupApi"});
    }

    public arvz(G1BackupApiChimeraService g1BackupApiChimeraService0, cjts cjts0, GetServiceRequest getServiceRequest0, String s, String s1) {
        this.e = aqjl.a;
        this.f = asdc.a;
        this.c = s;
        this.d = s1;
        this.b = g1BackupApiChimeraService0;
        this.g = cjts0;
        this.h = new aqee(g1BackupApiChimeraService0);
        this.i = new aqjk(g1BackupApiChimeraService0);
        this.j = getServiceRequest0;
        this.l = new arvy(this);
        this.k = new aqys(g1BackupApiChimeraService0);
    }

    @Override  // asan
    public final int a(ApiMetadata apiMetadata0) {
        hqje hqje0 = hqje.a;
        if(hqje0.m().A()) {
            hfuo hfuo0 = hqje0.m().m().b;
            G1BackupApiChimeraService g1BackupApiChimeraService0 = this.b;
            if(!hfuo0.contains(g1BackupApiChimeraService0.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
                throw new RemoteException("API not supported for this caller.");
            }
            if(!this.f(apiMetadata0)) {
                return 1;
            }
            boolean z = this.n() && this.h(apiMetadata0);
            long v = hqje0.m().g();
            long v1 = TimeUnit.DAYS.toMillis(v);
            if(System.currentTimeMillis() - new bakc(g1BackupApiChimeraService0, "BackupDeviceState", true).getLong("lastFullBackupPassTimeMs", 0L) > v1) {
                return z ? 3 : 4;
            }
            return z ? 0 : 2;
        }
        return 5;
    }

    @Override  // asan
    public final void c(azxs azxs0, boolean z, String s, BackupOptInSettings backupOptInSettings0, ApiMetadata apiMetadata0) {
        if(!hqje.a.m().n().b.contains(this.j.f)) {
            azxs0.a(Status.g);
            return;
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.af);
        azuf0.g(bbdq.l);
        azuf0.d(this.c);
        azuf0.c(this.d);
        arvx arvx0 = new arvx(azxs0, z, s, backupOptInSettings0, azuf0.a());
        this.g.b(arvx0);
    }

    @Override  // asan
    public final void d(boolean z, ApiMetadata apiMetadata0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = new bakc(this.b, "backup_settings", true).edit();
        sharedPreferences$Editor0.putBoolean("use_mobile_data", z);
        sharedPreferences$Editor0.apply();
        Intent intent0 = new Intent("com.google.android.gms.backup.ACTION_BACKUP_NETWORK_SETTINGS_CHANGED").setPackage("com.google.android.gms");
        this.b.sendBroadcast(intent0);
    }

    @Override  // asan
    public final void e(boolean z, String s, ApiMetadata apiMetadata0) {
        Intent intent0;
        Account account0 = this.h.a();
        if(account0 != null && account0.name != null && account0.name.equals(s)) {
        label_4:
            G1BackupApiChimeraService g1BackupApiChimeraService0 = this.b;
            this.f.a(g1BackupApiChimeraService0, z);
            aqys aqys0 = this.k;
            ProtoLiteBuilder hftp0 = aqra.b();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidr.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gidr)hftp1.b_message).c = (z ? 5 : 6) - 1;
            ((gidr)hftp1.b_message).b |= 1;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp0.b_message;
            gidr gidr0 = (gidr)hftp1.N_build();
            gidr0.getClass();
            ghys0.H = gidr0;
            ghys0.c |= 0x400;
            aqys0.x(hftp0, ghyr.O, 0);
            aqjl aqjl0 = this.e;
            if(aqjl0.n(g1BackupApiChimeraService0)) {
                intent0 = z ? IntentOperation.getStartIntent(g1BackupApiChimeraService0, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED") : IntentOperation.getStartIntent(g1BackupApiChimeraService0, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_DISABLED");
            }
            else if(z) {
                aqjl0.h(g1BackupApiChimeraService0, true);
                intent0 = IntentOperation.getStartIntent(g1BackupApiChimeraService0, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED");
            }
            else {
                intent0 = IntentOperation.getStartIntent(g1BackupApiChimeraService0, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_DISABLED");
            }
            if(intent0 != null) {
                g1BackupApiChimeraService0.startService(intent0);
            }
        }
        else if(!z) {
            z = false;
            goto label_4;
        }
    }

    @Override  // asan
    public final boolean f(ApiMetadata apiMetadata0) {
        return this.i.i();
    }

    @Override  // asan
    public final boolean g(ApiMetadata apiMetadata0) {
        return new bakc(this.b, "backup_settings", true).getBoolean("use_mobile_data", false);
    }

    @Override  // asan
    public final boolean h(ApiMetadata apiMetadata0) {
        return this.f.h(this.b);
    }

    @Override  // asan
    public final void i(asah asah0) {
        long v = 0L;
        if(hqje.N() && hqje.a.m().aw()) {
            arvz.a.m("Deprecated backup MMS now call", new Object[0]);
            return;
        }
        if(hqje.H()) {
            G1BackupApiChimeraService g1BackupApiChimeraService0 = this.b;
            long v1 = Settings.Secure.getLong(g1BackupApiChimeraService0.getContentResolver(), "backup_now_mms_backup_last_requested", 0L);
            if(v1 > 0L) {
                v = System.currentTimeMillis() - v1;
            }
            Settings.Secure.putLong(g1BackupApiChimeraService0.getContentResolver(), "backup_now_mms_backup_last_requested", System.currentTimeMillis());
        }
        this.k.l(3, v / 1000L);
        G1BackupApiStub.1 g1BackupApiStub$10 = new G1BackupApiStub.1(this, new bblf(new bblg(10)), asah0);
        Intent intent0 = new Intent();
        intent0.setClassName(this.l.a.b, "com.google.android.gms.backup.mms.MmsBackupService");
        intent0.putExtra("resultReceiver", g1BackupApiStub$10);
        this.l.a.b.startService(intent0);
    }

    @Override  // asan
    public final void j(boolean z) {
        G1BackupApiChimeraService g1BackupApiChimeraService0 = this.b;
        SharedPreferences.Editor sharedPreferences$Editor0 = new bakc(g1BackupApiChimeraService0, "g1_shared_prefs", true).edit();
        sharedPreferences$Editor0.putBoolean("use_mobile_data_for_mms", z);
        sharedPreferences$Editor0.apply();
        Intent intent0 = z ? IntentOperation.getStartIntent(g1BackupApiChimeraService0, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_SCHEDULE_CHANGED") : IntentOperation.getStartIntent(g1BackupApiChimeraService0, "com.google.android.gms.backup.transport.component.MmsBackupSchedulerIntentOperation", "com.google.android.gms.backup.ACTION_MMS_BACKUP_DISABLED");
        if(intent0 != null) {
            g1BackupApiChimeraService0.startService(intent0);
        }
    }

    @Override  // asan
    public final long k() {
        hfuo hfuo0 = hqje.a.m().o().b;
        G1BackupApiChimeraService g1BackupApiChimeraService0 = this.b;
        if(hfuo0.contains(g1BackupApiChimeraService0.getPackageManager().getNameForUid(Binder.getCallingUid()))) {
            return new bakc(g1BackupApiChimeraService0, "BackupDeviceState", true).getLong("lastFullBackupPassTimeMs", 0L);
        }
        throw new RemoteException("API not supported for this caller.");
    }

    @Override  // asan
    public final boolean l() {
        return new bakc(this.b, "g1_shared_prefs", true).getBoolean("use_mobile_data_for_mms", false);
    }

    @Override  // asan
    public final boolean m() {
        long v = this.i.b("--");
        return v != 0L && v != 1L;
    }

    @Override  // asan
    public final boolean n() {
        return this.e.n(this.b);
    }
}

