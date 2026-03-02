import android.app.PendingIntent;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RecoverySystem;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.provider.Settings.Global;
import android.text.format.Formatter;
import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.growth.UpgradeInviteEligibilityParams;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.ExpeditedUpdateStatus;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.UpdateDescription;
import com.google.android.gms.update.UpdateInfo;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import com.google.android.gms.update.control.InstallationControl.ActivityStartedReceiver;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import j..util.concurrent.ThreadLocalRandom;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ezxs {
    private static final fagf A;
    private static final fagf B;
    private static final fagf C;
    private static final fagf D;
    private static final fagf E;
    private static final fagf F;
    private static final fagl G;
    private static final fagf H;
    private static final fagf I;
    private static final fagf J;
    private static final fagf K;
    private static final fagp L;
    private static final fagf M;
    private static final fagu N;
    private static final fagp O;
    private static final fagf P;
    private static final fagp Q;
    private static final fagl R;
    private static final fagp S;
    private static final fagp T;
    private static final fagp U;
    private static final fagp V;
    private static final fagf W;
    private static final fagf X;
    private static final fagf Y;
    private static final ggfp Z;
    public static final baun a;
    private final DevicePolicyManager aa;
    private final bbib ab;
    public static final fagu b;
    public static final fagp c;
    public static final fagp d;
    public static final fagf e;
    public static final fagl f;
    public static final fagp g;
    public static final fagp h;
    @Deprecated
    public static final fagf i;
    public static final fagl j;
    public static final fagf k;
    public static final fage l;
    public final Context m;
    public final fagt n;
    public final ezxn o;
    public final ezxl p;
    public final esaa q;
    private static final long r;
    private static final long s;
    private static final ggfp t;
    private static final fagp u;
    private static final fagf v;
    private static final fagl w;
    private static final fagl x;
    private static final fagg y;
    private static final fagp z;

    static {
        ezxs.a = fabk.d("InstallationControl");
        ezxs.r = TimeUnit.SECONDS.toMillis(1L);
        ezxs.s = TimeUnit.HOURS.toMillis(1L);
        ezxs.t = ggfp.K(Integer.valueOf(0x210), Integer.valueOf(0x110));
        ezxs.b = new fagu("control.installation.current_update_url", "");
        Long long0 = (long)0L;
        ezxs.u = new fagp("control.installation.update_url_changed_at", long0);
        Long long1 = (long)-1L;
        ezxs.c = new fagp("control.installation.device_policy_updated_at", long1);
        Boolean boolean0 = Boolean.valueOf(false);
        ezxs.v = new fagf("control.installation.download_approved", boolean0);
        ezxs.d = new fagp("control.installation.reboot_approved_at", long1);
        ezxs.e = new fagf("control.installation.is_user_initiated_reboot_approval", boolean0);
        Integer integer0 = (int)0;
        ezxs.f = new fagl("control.installation.status", integer0);
        Integer integer1 = (int)-1;
        ezxs.w = new fagl("control.installation.update_engine_status", integer1);
        ezxs.x = new fagl("control.installation.update_engine_completion_code", integer1);
        ezxs.y = new fagg("control.installation.progress", ((double)-1.0));
        ezxs.z = new fagp("control.installation.progress_notified_at", long0);
        ezxs.A = new fagf("control.installation.download_paused_by_user", boolean0);
        ezxs.B = new fagf("control.installation.download_auto_resumed", boolean0);
        ezxs.C = new fagf("control.installation.ab_installation_paused_by_user", boolean0);
        ezxs.D = new fagf("control.installation.download_ignore_network_condition", boolean0);
        ezxs.E = new fagf("control.installation.download_ignore_offpeak_window", boolean0);
        ezxs.F = new fagf("control.installation.download_ignore_device_idle_condition", boolean0);
        ezxs.G = new fagl("control.installation.download_allowed_network", integer1);
        ezxs.H = new fagf("control.installation.ab_installation_ignore_device_idle_condition", boolean0);
        ezxs.I = new fagf("control.installation.installation_ignore_maintenance_window", boolean0);
        ezxs.J = new fagf("control.installation.ignore_server_postpone_ab_installation_config", boolean0);
        ezxs.K = new fagf("control.installation.ignore_optional_post_install", boolean0);
        ezxs.L = new fagp("control.installation.last_user_approval_time", long1);
        ezxs.M = new fagf("control.installation.is_streaming", boolean0);
        ezxs.N = new fagu("control.installation.local_package_file_path", "");
        ezxs.O = new fagp("control.installation.activity_started_at", long1);
        ezxs.P = new fagf("control.installation.activity_started_from_setup_wizard", boolean0);
        ezxs.Q = new fagp("control.installation.activity_backgrounded_at", long1);
        ezxs.R = new fagl("control.installation.last_activity_backgrounding_update_status", integer0);
        ezxs.S = new fagp("control.installation.auto_reboot_approved_at", long1);
        ezxs.T = new fagp("control.installation.auto_reboot_start_time", long1);
        ezxs.U = new fagp("control.installation.auto_reboot_end_time", long1);
        ezxs.g = new fagp("control.installation.reboot_with_resume_failure_count", long0);
        ezxs.h = new fagp("control.installation.prepare_auto_sim_unlock_failure_count", long0);
        ezxs.V = new fagp("control.installation.download_first_started_time", long1);
        ezxs.W = new fagf("control.installation.is_in_ab_post_installation_step", boolean0);
        ezxs.i = new fagf("control.installation.reboot_with_resume_prepared", boolean0);
        ezxs.X = new fagf("control.installation.upgrade_party_eligible", boolean0);
        ezxs.Y = new fagf("control.installation.upgrade_party_check_complete", boolean0);
        ezxs.j = new fagl("control.installation.switch_slot_failure_count", integer0);
        ezxs.Z = ggfp.K(integer0, Integer.valueOf(5));
        ezxs.k = new fagf("control.installation.encountered_recovery_system_install_exception", boolean0);
        ezxs.l = new ezxr();
    }

    public ezxs(Context context0) {
        this.m = context0;
        this.n = (fagt)fagt.a.b();
        this.aa = (DevicePolicyManager)context0.getSystemService("device_policy");
        this.o = (ezxn)ezxn.b.b();
        this.ab = new bbib(context0);
        this.p = (ezxl)ezxl.h.b();
        esaa esaa0 = new esaa(context0, 1, "update-popup-dialog-start", null, "com.google.android.gms");
        this.q = esaa0;
        esaa0.j(false);
    }

    public final boolean A() {
        fagt fagt0 = this.n;
        String s = (String)fagt0.b(ezxs.b);
        String s1 = gfta.b(ezwj.r());
        fagt0.e(new fagh[]{new fagh(ezxs.b, s1)});
        if(!ezxs.H(s).equals(ezxs.H(s1))) {
            ezxs.a.h("Update URL changed from \"%s\" to \"%s\".", new Object[]{s, s1});
            fagt0.e(new fagh[]{new fagh(ezxs.u, System.currentTimeMillis())});
            this.n();
            this.h(((boolean)(s1.isEmpty() ^ 1)));
            if(hvyi.c()) {
                ChimeraGcmTaskService.e(this.m);
            }
            return true;
        }
        return false;
    }

    public final boolean B(Context context0) {
        if(hwbg.a.c().d()) {
            Long long0 = (Long)this.n.b(ezxs.h);
            if(((long)long0) >= hwbg.b()) {
                Object[] arr_object = {long0, hwbg.b()};
                ezxs.a.m("Disabling auto SIM unlocking due to failure count (%d) exceeding threshold (%d).", arr_object);
                return false;
            }
            return ezwc.e(context0);
        }
        return false;
    }

    public final boolean C() {
        return hwcs.a.e().d() && this.b().c == 0x60B && ezwx.b(System.currentTimeMillis() - this.b().n) > 0;
    }

    public final boolean D(Context context0) {
        return this.E(context0) ? ezwc.d(context0).isEmpty() || this.B(context0) : false;
    }

    public final boolean E(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        hwbm hwbm0 = hwbm.a;
        if(hwbm0.c().k()) {
            Long long0 = (Long)this.n.b(ezxs.g);
            if(((long)long0) >= hwbm.b()) {
                Object[] arr_object = {long0, hwbm.b()};
                ezxs.a.m("Disabling resume-on-reboot due to failure count (%d) exceeding threshold (%d).", arr_object);
                return false;
            }
        }
        if(hwbm.d()) {
            packageManager0.hasSystemFeature("android.hardware.reboot_escrow");
            return !hwbm0.c().d() || ezwc.f();
        }
        return false;
    }

    public static boolean F(int v) {
        return ezxs.t.contains(Integer.valueOf(v));
    }

    final void G(bvmj bvmj0) {
        if(ezwn.a().booleanValue()) {
            fagt fagt0 = this.n;
            fagf fagf0 = ezxs.X;
            if(!((Boolean)fagt0.b(fagf0)).booleanValue()) {
                ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
                moduleManager$FeatureCheck0.checkFeatureAtAnyVersion(new Feature("growth_upgradeparty", -1L).a);
                if(ModuleManager.get(this.m).checkFeaturesAreAvailable(moduleManager$FeatureCheck0) == 0) {
                    fagt0.e(new fagh[]{new fagh(fagf0, Boolean.valueOf(ezxs.K(bvmj0)))});
                }
                else {
                    ezxs.a.h("Upgrade party module not ready.", new Object[0]);
                }
                fagt0.e(new fagh[]{new fagh(ezxs.Y, Boolean.valueOf(true))});
                this.o.a(0x72);
            }
        }
    }

    private static String H(String s) {
        Uri uri0 = Uri.parse(s);
        return uri0 == null ? s : uri0.getPath();
    }

    private final void I(long v) {
        PendingIntent pendingIntent0 = ezye.f(this.m);
        this.ab.j("NotificationActionControl-Alarm", 0, v, pendingIntent0);
    }

    private final boolean J() {
        return this.D(this.m) && ezwc.n(this.m);
    }

    private static final boolean K(bvmj bvmj0) {
        UpgradeInviteEligibilityParams upgradeInviteEligibilityParams0 = new UpgradeInviteEligibilityParams(0);
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{azig.a};
        azzc0.a = new bvrb(((bvrd)bvmj0), upgradeInviteEligibilityParams0);
        azzc0.d = 0x6CFF;
        evql evql0 = ((azts)bvmj0).iG(azzc0.a());
        gfsx gfsx0 = gfqx.a;
        try {
            evrg.o(evql0, 10L, TimeUnit.SECONDS);
            gfsx0 = gfsx.l(((Boolean)evql0.j()));
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception1) {
            ezxs.a.n("Upgrade party eligibility check failed from waiting.", exception1, new Object[0]);
        }
        catch(IllegalStateException | evqj exception0) {
            ezxs.a.n("Upgrade party eligibility check failed when getting result.", exception0, new Object[0]);
        }
        if(gfsx0.i()) {
            return ((Boolean)gfsx0.d()).booleanValue();
        }
        ezxs.a.m("Upgrade invite eligibility check call timed out.", new Object[0]);
        return false;
    }

    private static final List L(DownloadOptions downloadOptions0) {
        List list0 = new ArrayList();
        Boolean boolean0 = Boolean.valueOf(true);
        if(downloadOptions0.a) {
            list0.add(new fagh(ezxs.D, boolean0));
        }
        if(downloadOptions0.b) {
            list0.add(new fagh(ezxs.E, boolean0));
        }
        if(downloadOptions0.c) {
            list0.add(new fagh(ezxs.F, boolean0));
        }
        if(hwdj.c()) {
            int v = downloadOptions0.d;
            if(v != -1) {
                list0.add(new fagh(ezxs.G, v));
            }
            return list0;
        }
        list0.add(new fagh(ezxs.G, ((int)-1)));
        return list0;
    }

    public final long a() {
        return (long)(((Long)this.n.b(ezxs.L)));
    }

    public final SystemUpdateStatus b() {
        boolean z9;
        InstallationOptions installationOptions1;
        boolean z5;
        int v9;
        UpdateInfo updateInfo0;
        long v5;
        fagp fagp1;
        String s1;
        fage fage0 = ezxl.h;
        ezxl ezxl0 = (ezxl)fage0.b();
        fagt fagt0 = this.n;
        long v = (long)(((Long)fagt0.b(ezxs.c)));
        if(v == -1L) {
            v = (long)(((Long)fagt0.b(ezxs.u)));
        }
        long v1 = (long)(((Long)fagt0.b(ezxs.O)));
        boolean z = v1 != -1L && ezxs.s + v1 >= System.currentTimeMillis();
        long v2 = (long)(((Long)fagt0.b(ezxs.Q)));
        String s = (String)fagt0.b(ezxs.N);
        boolean z1 = hvzw.a.c().g() && !gfta.c(s);
        if(!z1) {
            s = (String)fagt0.b(ezxs.b);
        }
        fagp fagp0 = ezxs.u;
        long v3 = (long)(((Long)fagt0.b(fagp0)));
        long v4 = TimeUnit.DAYS.toMillis(ezwh.a().longValue()) - (System.currentTimeMillis() - v3);
        Context context0 = this.m;
        boolean z2 = ezwy.d(context0, v3);
        if(((long)ezwh.a()) < 0L || ezwy.c(context0)) {
            v4 = -1L;
        }
        ExpeditedUpdateStatus expeditedUpdateStatus0 = new ExpeditedUpdateStatus(z2, v4);
        gfsx gfsx0 = faaa.a();
        if(gfsx0.i()) {
            hlnk hlnk0 = ((hlnn)gfsx0.d()).f;
            if(hlnk0 == null) {
                hlnk0 = hlnk.a;
            }
            s1 = s;
            fagp1 = fagp0;
            v5 = v1;
            updateInfo0 = new UpdateInfo(true, hlnk0.e, hlnk0.f, (hlnk0.c.size() <= 0 ? "" : ((String)hlnk0.c.get(0))));
        }
        else {
            s1 = s;
            fagp1 = fagp0;
            v5 = v1;
            updateInfo0 = new UpdateInfo(false, "", "", "");
        }
        boolean z3 = ezwy.b(context0, v3, expeditedUpdateStatus0);
        int v6 = (int)(((Integer)fagt0.b(ezxs.f)));
        int v7 = (int)(((Integer)fagt0.b(ezxs.w)));
        int v8 = (int)(((Integer)fagt0.b(ezxs.x)));
        double f = (double)(((Double)fagt0.b(ezxs.y)));
        DownloadOptions downloadOptions0 = new DownloadOptions(((Boolean)fagt0.b(ezxs.D)).booleanValue(), ((Boolean)fagt0.b(ezxs.E)).booleanValue(), ((Boolean)fagt0.b(ezxs.F)).booleanValue(), ((int)(((Integer)fagt0.b(ezxs.G)))));
        InstallationOptions installationOptions0 = new InstallationOptions(((Boolean)fagt0.b(ezxs.H)).booleanValue(), ((Boolean)fagt0.b(ezxs.I)).booleanValue(), ((Boolean)fagt0.b(ezxs.J)).booleanValue(), ((Boolean)fagt0.b(ezxs.K)).booleanValue());
        boolean z4 = ((Boolean)fagt0.b(ezxs.v)).booleanValue();
        if(((long)(((Long)fagt0.b(ezxs.d)))) == ((ezxl)fage0.b()).b()) {
            v9 = v7;
            z5 = true;
        }
        else {
            v9 = v7;
            z5 = false;
        }
        boolean z6 = ((Boolean)fagt0.b(ezxs.A)).booleanValue();
        boolean z7 = ((Boolean)fagt0.b(ezxs.C)).booleanValue();
        boolean z8 = ((Boolean)fagt0.b(ezxs.M)).booleanValue();
        long v10 = ezxl0.a();
        long v11 = (long)(((Long)ezxl0.j.b(ezxl.c)));
        if(z && ((Boolean)fagt0.b(ezxs.P)).booleanValue()) {
            installationOptions1 = installationOptions0;
            z9 = true;
        }
        else {
            installationOptions1 = installationOptions0;
            z9 = false;
        }
        ActivityStatus activityStatus0 = new ActivityStatus(z, z9, v5, v2, ((int)(((Integer)fagt0.b(ezxs.R)))));
        long v12 = ((long)(((Long)fagt0.b(fagp1)))) + ezwd.h();
        String s2 = (String)ezwo.d(hvzy.m, String.class);
        boolean z10 = ezwj.d().booleanValue();
        long v13 = (long)(((Long)fagt0.b(ezxs.S)));
        String s3 = ezwk.e();
        UpdateDescription updateDescription0 = new UpdateDescription(ezwj.p(), ((String)ezwo.d(hvzy.f, String.class)), (hvxz.c() || hwci.a.b().a() && ((long)ezwj.h()) > 0L ? Formatter.formatFileSize(context0, ezwj.h().longValue()) : ((String)ezwo.d(hvzy.L, String.class))), "");
        long v14 = 0L;
        boolean z11 = this.y(context0);
        boolean z12 = this.z();
        boolean z13 = this.D(context0) && ezwc.n(context0) && ((ezxl)fage0.b()).p() && !((ezxl)fage0.b()).o();
        boolean z14 = ((Boolean)fagt0.b(ezxs.B)).booleanValue();
        boolean z15 = ((Boolean)fagt0.b(ezxs.e)).booleanValue();
        long v15 = (long)(((Long)fagt0.b(ezxs.T)));
        long v16 = ezxl0.e();
        int v17 = (int)(((Integer)fagt0.b(ezxs.j)));
        if(((long)ezwj.h()) > 0L) {
            v14 = (long)ezwj.h();
        }
        boolean z16 = ((Boolean)fagt0.b(ezxs.W)).booleanValue();
        return !ezwn.a().booleanValue() || !((Boolean)fagt0.b(ezxs.X)).booleanValue() ? new SystemUpdateStatus(s1, z1, v6, v9, v8, f, downloadOptions0, installationOptions1, z4, z5, z6, z7, z8, v3, v10, v11, v, activityStatus0, v12, s2, z10, v13, s3, updateDescription0, z11, z12, z13, z14, z15, expeditedUpdateStatus0, v15, v16, v17, v14, z16, false, ((Boolean)fagt0.b(ezxs.Y)).booleanValue(), Bundle.EMPTY, updateInfo0, z3) : new SystemUpdateStatus(s1, z1, v6, v9, v8, f, downloadOptions0, installationOptions1, z4, z5, z6, z7, z8, v3, v10, v11, v, activityStatus0, v12, s2, z10, v13, s3, updateDescription0, z11, z12, z13, z14, z15, expeditedUpdateStatus0, v15, v16, v17, v14, z16, true, ((Boolean)fagt0.b(ezxs.Y)).booleanValue(), Bundle.EMPTY, updateInfo0, z3);
    }

    public final List c(InstallationOptions installationOptions0) {
        List list0 = new ArrayList();
        Boolean boolean0 = Boolean.valueOf(true);
        if(installationOptions0.a) {
            list0.add(new fagh(ezxs.H, boolean0));
        }
        if(installationOptions0.b) {
            list0.add(new fagh(ezxs.I, boolean0));
        }
        if(installationOptions0.c) {
            list0.add(new fagh(ezxs.J, boolean0));
        }
        list0.add(new fagh(ezxs.K, Boolean.valueOf(installationOptions0.d)));
        return list0;
    }

    public final void d(DownloadOptions downloadOptions0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new fagh(ezxs.v, Boolean.valueOf(true)));
        arrayList0.add(new fagh(ezxs.L, System.currentTimeMillis()));
        arrayList0.addAll(ezxs.L(downloadOptions0));
        this.n.d(arrayList0);
        this.o.a(103);
    }

    public final void e(InstallationOptions installationOptions0) {
        ArrayList arrayList0 = new ArrayList();
        Long long0 = ((ezxl)ezxl.h.b()).b();
        arrayList0.add(new fagh(ezxs.d, long0));
        arrayList0.add(new fagh(ezxs.e, Boolean.valueOf(true)));
        arrayList0.addAll(this.c(installationOptions0));
        this.n.d(arrayList0);
        this.o.a(105);
    }

    public final void f() {
        this.o.a(0x70);
    }

    public final void g(boolean z) {
        long v10;
        Long long5;
        ezxl ezxl1;
        long v7;
        long v6;
        long v4;
        long v3;
        ezww ezww0;
        long v;
        try {
            v = System.currentTimeMillis();
            ezww0 = ezww.d(ezwk.e());
        }
        catch(ezwa unused_ex) {
            Object[] arr_object = {ezwk.e()};
            ezxs.a.f("Unable to parse restart time window: %s.", arr_object);
            return;
        }
        SystemUpdateStatus systemUpdateStatus0 = this.b();
        Context context0 = this.m;
        if(z || ezwy.d(context0, systemUpdateStatus0.n) && this.y(context0) && ezxs.F(systemUpdateStatus0.c) && !this.z()) {
            if(!this.J()) {
                Object[] arr_object1 = {Boolean.valueOf(hwbm.d())};
                ezxs.a.h("Resume on reboot feature enabled: %s.", arr_object1);
            }
            else if(!this.p.p()) {
                ((ezxl)ezxl.h.b()).g(ReceiverIntentOperation.a(context0));
            }
            long v1 = (z ? hvzz.a.d().d() : TimeUnit.HOURS.toMillis(hvyx.a.b().a())) + v;
            if(ezww0.g(v1)) {
                ezxs.a.h("Auto restart time (%d) already in restart window (%s)", new Object[]{v1, ezwk.e()});
            }
            else {
                v1 += ezww0.c(v1);
                if(hwbj.a.b().a() && !z || this.J()) {
                    long v2 = hwbm.a.c().a();
                    TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
                    if(!ezww0.h()) {
                        v3 = v2;
                        v4 = 0L;
                    }
                    else if(ezww0.f()) {
                        v3 = v2;
                        v4 = TimeUnit.DAYS.toMillis(1L);
                    }
                    else {
                        v3 = v2;
                        v4 = ezww0.d <= ezww0.c ? TimeUnit.MINUTES.toMillis(0x5A0L - ezww0.c + ezww0.d) : TimeUnit.MINUTES.toMillis(ezww0.d - ezww0.c);
                    }
                    long v5 = Math.min(v3, timeUnit0.toMinutes(v4 / 2L));
                    if(v5 == 0L) {
                        v6 = 0L;
                    }
                    else {
                        v6 = ThreadLocalRandom.current().nextLong(v5);
                        Long long0 = v6;
                        fagv.a.f(long0);
                        long0.getClass();
                    }
                    ezxs.a.h("Adding random delay of %d minutes to scheduled reboot.", new Object[]{v6});
                    v1 += TimeUnit.MINUTES.toMillis(v6);
                }
            }
            this.I(v1);
            Long long1 = v1;
            ezxs.a.h("%s reboot for: %d", new Object[]{(z ? "User-scheduled" : "System-scheduled"), long1});
            fagt fagt0 = this.n;
            fagh[] arr_fagh = new fagh[3];
            Long long2 = this.p.b();
            arr_fagh[0] = new fagh(ezxs.S, long2);
            arr_fagh[1] = new fagh(ezxs.T, long1);
            fagp fagp0 = ezxs.U;
            if(ezww0.h()) {
                v7 = ezww0.f() ? 0x7FFFFFFFFFFFFFFFL : ezww.a(v1, TimeUnit.MINUTES.toMillis(ezww0.d));
            }
            else {
                v7 = 0L;
            }
            arr_fagh[2] = new fagh(fagp0, ((long)(v1 + v7)));
            fagt0.e(arr_fagh);
            ((ezxn)ezxn.b.b()).a(0x6F);
        }
        if(this.z()) {
            if(ezxs.F(systemUpdateStatus0.c) && ezww0.g(v)) {
                fagt fagt1 = this.n;
                fagp fagp1 = ezxs.T;
                if(v >= ((long)(((Long)fagt1.b(fagp1)))) && !z) {
                    long v8 = ezww0.c(v);
                    if(v8 <= 0L) {
                        v8 = ezww0.c(v + 1L);
                    }
                    long v9 = v8 + v;
                    fagh[] arr_fagh1 = new fagh[3];
                    ezxl ezxl0 = this.p;
                    Long long3 = ezxl0.b();
                    arr_fagh1[0] = new fagh(ezxs.S, long3);
                    Long long4 = v9;
                    arr_fagh1[1] = new fagh(fagp1, long4);
                    fagp fagp2 = ezxs.U;
                    if(!ezww0.h()) {
                        ezxl1 = ezxl0;
                        long5 = long4;
                        v10 = 0L;
                    }
                    else if(ezww0.f()) {
                        ezxl1 = ezxl0;
                        long5 = long4;
                        v10 = 0x7FFFFFFFFFFFFFFFL;
                    }
                    else {
                        ezxl1 = ezxl0;
                        long5 = long4;
                        long v11 = TimeUnit.MINUTES.toMillis(ezww0.d);
                        Calendar calendar0 = Calendar.getInstance();
                        calendar0.setTimeInMillis(v);
                        if(Long.compare(ezww.b(v), ezww.b(ezww0.d)) > 0) {
                            calendar0.add(5, 1);
                        }
                        if(ezww0.g(v)) {
                            calendar0.add(5, 1);
                        }
                        calendar0.set(11, ((int)TimeUnit.MILLISECONDS.toHours(v11)));
                        calendar0.set(12, ((int)(TimeUnit.MILLISECONDS.toMinutes(v11) % 60L)));
                        calendar0.set(13, 0);
                        v10 = calendar0.getTimeInMillis() - v;
                    }
                    arr_fagh1[2] = new fagh(fagp2, ((long)(v + v10)));
                    fagt1.e(arr_fagh1);
                    ((ezxn)ezxn.b.b()).a(0x6F);
                    baun baun0 = ezxs.a;
                    baun0.h("Re-attempt to restart the device at: %d.", new Object[]{long5});
                    this.I(v9);
                    if(this.D(context0) && ezwc.n(context0) && (!ezxl1.o() || !ezxl.q(context0))) {
                        baun0.h("Resume-on-reboot conditions not met. Re-scheduled for next time window.", new Object[0]);
                        return;
                    }
                    if(ezwq.f(context0, systemUpdateStatus0)) {
                        baun0.h("Delaying scheduled system update reboot for call.", new Object[0]);
                        return;
                    }
                    this.q.b();
                    baun0.h("Starting countdown dialog", new Object[0]);
                    context0.startActivity(new Intent("android.settings.SYSTEM_UPDATE_COMPLETE").setPackage("com.google.android.gms").addFlags(0x50048000).putExtra("send_activity_started_broadcast", true).putExtra("type", 2));
                    jwe.b(context0, new InstallationControl.ActivityStartedReceiver(this), new IntentFilter("com.google.android.gms.update.ACTION_POPUP_DIALOG_STARTED"), 4);
                }
            }
            return;
        }
        ezxs.a.j("Auto reboot not scheduled (probably because of expiry or device reboot).", new Object[0]);
    }

    public final void h(boolean z) {
        if(z) {
            long v = (long)(((Long)this.n.b(ezxs.u)));
            this.aa.notifyPendingSystemUpdate(v);
            return;
        }
        this.aa.notifyPendingSystemUpdate(-1L);
    }

    public final void i() {
        this.A();
        if(ezwn.a().booleanValue()) {
            this.G(new bvrd(this.m));
        }
    }

    public final void j() {
        if(hwcp.a.b().a()) {
            fagt fagt0 = this.n;
            fagp fagp0 = ezxs.V;
            if(((long)(((Long)fagt0.b(fagp0)))) < 0L) {
                fagt0.e(new fagh[]{new fagh(fagp0, System.currentTimeMillis())});
                this.o.a(0x74);
            }
        }
    }

    public final void k() {
        this.n.e(new fagh[]{new fagh(ezxs.W, Boolean.valueOf(true))});
    }

    public final void l() {
        this.n.e(new fagh[]{new fagh(ezxs.C, Boolean.valueOf(true))});
        this.o.a(108);
    }

    public final void m() {
        this.n.e(new fagh[]{new fagh(ezxs.A, Boolean.valueOf(true))});
        this.o.a(106);
    }

    public final void n() {
        this.n.c(new fagn[]{ezxs.H, ezxs.C, ezxs.c, ezxs.v, ezxs.D, ezxs.E, ezxs.F, ezxs.G, ezxs.B, ezxs.A, ezxs.I, ezxs.J, ezxs.K, ezxs.L, ezxs.R, ezxs.M, ezxs.y, ezxs.z, ezxs.d, ezxs.e, ezxs.X, ezxs.Y, ezxs.i, ezxs.f, ezxs.x, ezxs.w, ezxs.S, ezxs.T, ezxs.U, ezxs.k, ezxs.g, ezxs.j, ezxs.h, ezxs.W, ezxs.V});
        this.o.a(102);
        if(hvyi.c()) {
            ChimeraGcmTaskService.e(this.m);
        }
    }

    public final void o() {
        PendingIntent pendingIntent0 = ezye.f(this.m);
        this.ab.a(pendingIntent0);
        this.n.c(new fagn[]{ezxs.S, ezxs.e, ezxs.T, ezxs.U});
    }

    public final void p() {
        this.n.c(new fagn[]{ezxs.d, ezxs.e});
    }

    public final void q(InstallationOptions installationOptions0) {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new fagh(ezxs.C, Boolean.valueOf(false)));
        arrayList0.add(new fagh(ezxs.L, System.currentTimeMillis()));
        arrayList0.addAll(this.c(installationOptions0));
        this.n.d(arrayList0);
        this.o.a(109);
    }

    public final void r() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(new fagh(ezxs.B, Boolean.valueOf(true)));
        arrayList0.add(new fagh(ezxs.A, Boolean.valueOf(false)));
        this.n.d(arrayList0);
        this.o.a(0x71);
    }

    public final void s(DownloadOptions downloadOptions0) {
        ArrayList arrayList0 = new ArrayList();
        Boolean boolean0 = Boolean.valueOf(false);
        arrayList0.add(new fagh(ezxs.B, boolean0));
        arrayList0.add(new fagh(ezxs.A, boolean0));
        arrayList0.add(new fagh(ezxs.L, System.currentTimeMillis()));
        arrayList0.addAll(ezxs.L(downloadOptions0));
        this.n.d(arrayList0);
        this.o.a(107);
    }

    public final void t(ActivityStatus activityStatus0) {
        if(activityStatus0.a) {
            this.n.e(new fagh[]{new fagh(ezxs.O, System.currentTimeMillis()), new fagh(ezxs.P, Boolean.valueOf(activityStatus0.b))});
            this.n.c(new fagn[]{ezxs.Q, ezxs.R});
        }
        else {
            fagh[] arr_fagh = new fagh[2];
            arr_fagh[0] = new fagh(ezxs.Q, System.currentTimeMillis());
            Integer integer0 = (Integer)this.n.b(ezxs.f);
            arr_fagh[1] = new fagh(ezxs.R, integer0);
            this.n.e(arr_fagh);
            this.n.c(new fagn[]{ezxs.O, ezxs.P});
        }
        ((ezxn)ezxn.b.b()).a(110);
    }

    public final void u(int v, double f) {
        fagt fagt0 = this.n;
        long v1 = SystemClock.elapsedRealtime();
        fagp fagp0 = ezxs.z;
        long v2 = (long)(((Long)fagt0.b(fagp0)));
        int v3 = (int)(((Integer)fagt0.b(ezxs.f)));
        fagh[] arr_fagh = new fagh[2];
        Integer integer0 = v;
        arr_fagh[0] = new fagh(ezxs.f, integer0);
        Double double0 = f;
        arr_fagh[1] = new fagh(ezxs.y, double0);
        fagt0.e(arr_fagh);
        if(v3 == v && v1 - v2 < ezxs.r && v1 >= v2) {
            return;
        }
        ezxs.a.h("Installation progress updated to (0x%03X, %.3f).", new Object[]{integer0, double0});
        fagt0.e(new fagh[]{new fagh(fagp0, v1)});
        this.o.a(100);
    }

    public final void v(boolean z) {
        this.n.e(new fagh[]{new fagh(ezxs.M, Boolean.valueOf(z))});
    }

    public final void w() {
        if(this.J() && !this.p.p()) {
            Integer integer0 = (int)this.b().c;
            if(!ezxs.Z.contains(integer0)) {
                try {
                    ((ezxl)ezxl.h.b()).g(ReceiverIntentOperation.a(this.m));
                }
                catch(IOException iOException0) {
                    ezxs.a.n("Unable to prepare resume on reboot.", iOException0, new Object[0]);
                }
                return;
            }
        }
        ggfp ggfp0 = ezxs.Z;
        if(ggfp0.contains(Integer.valueOf(this.b().c)) && this.p.p()) {
            try {
                ezxl ezxl0 = (ezxl)ezxl.h.b();
                ezxl.a.h("Cancel resume on reboot.", new Object[0]);
                Context context0 = ezxl0.i;
                ezxl.a.d("ClearPrepareForUnattendedUpdate.", new Object[0]);
                try {
                    RecoverySystem.clearPrepareForUnattendedUpdate(context0);
                }
                catch(Throwable throwable0) {
                    if(!(throwable0 instanceof NoSuchMethodError)) {
                        throw throwable0;
                    }
                    try {
                        Boolean boolean0 = (Boolean)RecoverySystem.class.getMethod("clearPrepareForUnattendedUpdate", Context.class).invoke(null, context0);
                        ezxl.a.d("Legacy ClearPrepareForUnattendedUpdate finished with: %s", new Object[]{boolean0});
                    }
                    catch(NoSuchMethodException | IllegalAccessException | InvocationTargetException exception0) {
                        ezxl.a.g("ClearPrepareForUnattendedUpdate with exception.", exception0, new Object[0]);
                    }
                    ezxl0.j.c(new fagn[]{ezxl.g, ezxl.e});
                    return;
                }
                ezxl0.j.c(new fagn[]{ezxl.g, ezxl.e});
            }
            catch(IOException iOException1) {
                ezxs.a.n("Unable to cancel resume on reboot.", iOException1, new Object[0]);
            }
            return;
        }
        if(!this.p.p() && !ggfp0.contains(Integer.valueOf(this.b().c))) {
            this.J();
        }
    }

    public final void x(int v, int v1) {
        fagt fagt0 = this.n;
        fagl fagl0 = ezxs.w;
        if(((int)(((Integer)fagt0.b(fagl0)))) == v && ((int)(((Integer)fagt0.b(ezxs.x)))) == v1) {
            return;
        }
        fagt0.e(new fagh[]{new fagh(fagl0, v), new fagh(ezxs.x, v1)});
        this.o.a(101);
    }

    public final boolean y(Context context0) {
        if(ezwy.c(context0)) {
            ezxs.a.j("User has disabled automatic update. We should not auto reboot.", new Object[0]);
            return false;
        }
        if(hvzz.a.d().i() && Settings.Global.getInt(context0.getContentResolver(), "ota_disable_automatic_update", 0) != 0) {
            return false;
        }
        if(this.D(context0)) {
            return true;
        }
        if(hwbm.a.c().h() && !ezwc.n(context0) && (ezwc.d(context0).isEmpty() || this.B(context0))) {
            return true;
        }
        String s = SystemProperties.get("ro.crypto.state", "");
        return gfud.e(',').d().n(((String)ezwo.e(hwab.b, String.class))).contains(s);
    }

    public final boolean z() {
        return this.p.b() == ((long)(((Long)this.n.b(ezxs.S)))) && System.currentTimeMillis() <= ((long)(((Long)this.n.b(ezxs.U))));
    }
}

