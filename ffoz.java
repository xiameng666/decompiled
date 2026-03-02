import android.app.PendingIntent;
import android.app.StatsManager.StatsUnavailableException;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.UserManager;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.westworld.AppContextProvider;
import com.google.android.gms.westworld.FetchOperation;
import j..time.Duration;
import j..time.Instant;
import j..time.temporal.ChronoUnit;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jeb.synthetic.FIN;

public final class ffoz {
    public static final int a;
    private static faii b;

    static {
        bboh.b("WestworldUtils", bbcu.ea);
        ffoz.b = null;
    }

    public static int a(Context context0) {
        igyu igyu0 = (igyu)ffpx.c(context0).a().get();
        return (igyu0.b & 8) == 0 ? -1 : igyu0.f;
    }

    public static long b(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            return packageManager0.getPackageInfo("com.google.android.os.statsd", 0x40000000).getLongVersionCode();
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return -1L;
        }
    }

    static SharedPreferences c(Context context0) {
        return context0.getSharedPreferences("com.google.android.westworld", 0);
    }

    public static SharedPreferences d(Context context0) {
        return context0.getSharedPreferences("westworld.statsd", 0);
    }

    static res e(long v) {
        return res.b(((int)(v - iabs.b() >> 8 & 15L)));
    }

    static String f(long v) {
        return ((int)(v - iabs.b() >> 15 & 7L)) == 1 ? "com.google.android.as.oss" : "";
    }

    static List g(rew rew0) {
        List list0 = new ArrayList();
        int v = rew0.i;
        int v1 = rfc.a(v);
        int v2 = 1;
        if(v1 == 0) {
            v1 = 1;
        }
        long v3 = 0L;
        long v4 = rew0.h ? 1L : 0L;
        long v5 = rew0.g ? 1L : 0L;
        if(rew0.f) {
            v3 = 1L;
        }
        long v6 = (long)(v1 - 1);
        long v7 = v6 + v6 + v4;
        long v8 = v7 + v7 + v5;
        long v9 = (rfc.a(v) == 0 ? 1 : rfc.a(v)) - 1 <= 0 ? ((long)(res.b(rew0.e) == null ? res.a : res.b(rew0.e)).h) : 6L;
        long v10 = (rew0.b & 2) == 0 ? iabi.b() : ((long)(hlqe.b(rew0.d) == null ? hlqe.a : hlqe.b(rew0.d)).f);
        int v11 = rem.a(rew0.c);
        if(v11 != 0) {
            v2 = v11;
        }
        long v12 = (((v8 + v8 + v3 << 4) + v9 << 4) + v10 << 4) + ((long)(v2 - 1));
        list0.add(Long.valueOf(iabs.b() + v12));
        if(rew0.j) {
            list0.add(Long.valueOf(iabs.b() + (v12 | 0x4000L)));
        }
        return list0;
    }

    static boolean h(faik faik0, String s) {
        evql evql0 = faik0.cn(s);
        try {
            evrg.o(evql0, iaby.b(), TimeUnit.MILLISECONDS);
            return evql0.n() && evql0.j() != null && ((Boolean)evql0.j()).booleanValue();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    static boolean i(long v) {
        return ((int)(v - iabs.b() >> 13 & 1L)) == 1;
    }

    static boolean j(Context context0) {
        try {
            evql evql0 = faih.a(context0).cp();
            azui azui0 = (azui)evrg.o(evql0, iaby.b(), TimeUnit.MILLISECONDS);
            if(evql0.n() && azui0 != null) {
                UserManager userManager0 = (UserManager)context0.getSystemService("user");
                return userManager0 == null || userManager0.getUserCount() <= 1 ? azui0.q() : false;
            }
            return false;
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    static boolean k(long v) {
        return ((int)(v - iabs.b() >> 14 & 1L)) == 1;
    }

    public static boolean l(faik faik0) {
        evql evql0 = faik0.cp();
        try {
            evrg.o(evql0, iaby.b(), TimeUnit.MILLISECONDS);
            return evql0.n() && evql0.j() != null && ((azui)evql0.j()).p() == 3;
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    public static boolean m(faik faik0) {
        return ffoz.h(faik0, "WESTWORLD");
    }

    static boolean n(Context context0) {
        iaav.b();
        return bbnp.m(context0);
    }

    public static boolean o() {
        return iaby.j() && iaas.a.b().b();
    }

    public static boolean p(faik faik0) {
        evql evql0 = faik0.cq();
        try {
            evrg.o(evql0, iaby.b(), TimeUnit.MILLISECONDS);
            return !evql0.n() || evql0.j() == null ? false : ((azui)evql0.j()).s();
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
        return false;
    }

    static boolean q(String s, ayvf ayvf0) {
        if(iacm.a.d().h()) {
            if(s.equals("WESTWORLD")) {
                return iabc.a.b().a();
            }
            return s.equals("WESTWORLD_METADATA") ? iabc.a.b().b() : false;
        }
        SharedPreferences sharedPreferences0 = ffoz.c(AppContextProvider.b());
        try {
            return sharedPreferences0.getBoolean("clearcut_add_external_ids_log_source_" + s, false);
        }
        catch(ClassCastException unused_ex) {
            ayvf0.d("ClassCastException").a(0L, 1L, ayvf.b);
            return false;
        }
    }

    static int[] r(ayvf ayvf0) {
        try {
            long[] arr_v = ((StatsManager)AppContextProvider.b().getSystemService("stats")).getRegisteredExperimentIds();
            if(arr_v == null) {
                ayvf0.d("NullExperimentsList").a(0L, 1L, ayvf.b);
                return new int[0];
            }
            if(arr_v.length == 0) {
                ayvf0.d("EmptyExperimentsList").a(0L, 1L, ayvf.b);
            }
            else {
                ayvf0.d("NonEmptyExperimentsList").a(0L, 1L, ayvf.b);
            }
            int[] arr_v1 = new int[arr_v.length];
            for(int v = 0; v < arr_v.length; ++v) {
                arr_v1[v] = (int)arr_v[v];
            }
            return arr_v1;
        }
        catch(StatsManager.StatsUnavailableException unused_ex) {
            ayvf0.d("StatsManagerError").a(0L, 1L, ayvf.b);
            return new int[0];
        }
    }

    public static void s(Context context0) {
        Class class0 = ffoz.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        einq einq0 = new einq(context0);
        evql evql0 = einq0.i("com.google.android.westworld", 1, new String[]{"WESTWORLD", "WESTWORLD_METADATA", "INCIDENT_REPORT", "PERFETTO", "WESTWORLD_COUNTERS", "PIXEL_SAFETY_METRICS_KEYED_BY_HWID_ONLY"}, new int[0]);
        try {
            evrg.o(evql0, hrle.a.c().c(), TimeUnit.MILLISECONDS);
            if(evql0.n()) {
                new ffox(einq0, context0).h("");
                FIN.finallyExec$NT(v);
                return;
            }
            FIN.finallyExec$NT(v);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            FIN.finallyCodeBegin$NT(v);
        }
    }

    public static void t(long v, Context context0) {
        StatsManager statsManager0 = (StatsManager)context0.getSystemService("stats");
        if(statsManager0 == null) {
            return;
        }
        ffoz.z(statsManager0, v, context0);
    }

    static int u(long v) {
        int v1 = rem.a(((int)(v - iabs.b() & 15L)));
        return v1 == 0 ? 1 : v1;
    }

    static void v(ayvf ayvf0, ProtoLiteBuilder hftp0, hlqe hlqe0, ayud ayud0) {
        azts azts0 = new azts(AppContextProvider.b(), new faig());
        evql evql0 = azts0.cn(iaap.a.b().a());
        try {
            evrg.o(evql0, iaby.b(), TimeUnit.MILLISECONDS);
            goto label_6;
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
            return;
        label_6:
            if(evql0.n() && evql0.j() != null && ((Boolean)evql0.j()).booleanValue()) {
                igyv igyv0 = new igyv();
                int[] arr_v = null;
                if(iacm.j()) {
                    if(ffoz.q(ayud0.h, ayvf0)) {
                        arr_v = ffoz.r(ayvf0);
                    }
                    ayvm ayvm0 = fhbe.b(AppContextProvider.b(), igyv0);
                    faid faid0 = new faid(arr_v, hlqe0.f, ayvm0, ayud0);
                    azts0.cw(iaap.c(), ((MessageLite)hftp0.N_build()), faid0);
                    return;
                }
                String s = iaap.c();
                ProtoLiteMessage hftv0 = hftp0.N_build();
                if(ffoz.q(ayud0.h, ayvf0)) {
                    arr_v = ffoz.r(ayvf0);
                }
                ayvm ayvm1 = fhbe.b(AppContextProvider.b(), igyv0);
                azts0.cy(s, ((MessageLite)hftv0), arr_v, hlqe0.f, ayvm1, ayud0);
            }
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
    }

    static void w(faik faik0, ProtoLiteBuilder hftp0, hlqe hlqe0, ayud ayud0, ayud ayud1) {
        evql evql0 = faik0.cn("PIXEL_SAFETY_METRICS_KEYED_BY_HWID_ONLY");
        try {
            evrg.o(evql0, iaby.b(), TimeUnit.MILLISECONDS);
            goto label_5;
        }
        catch(ExecutionException unused_ex) {
            Thread.currentThread().interrupt();
            return;
        label_5:
            if(evql0.n() && evql0.j() != null && ((Boolean)evql0.j()).booleanValue()) {
                igyv igyv0 = new igyv();
                ayvm ayvm0 = fhbe.b(AppContextProvider.b(), igyv0);
                ayud ayud2 = !hzfr.c() || !ffql.d(faik0) ? ayud0 : ayud1;
                if(iacm.j()) {
                    faid faid0 = new faid(null, hlqe0.f, ayvm0, ayud2);
                    faik0.cw("PIXEL_SAFETY_METRICS_KEYED_BY_HWID_ONLY", ((MessageLite)hftp0.N_build()), faid0);
                    return;
                }
                faik0.cy("PIXEL_SAFETY_METRICS_KEYED_BY_HWID_ONLY", ((MessageLite)hftp0.N_build()), null, hlqe0.f, ayvm0, ayud2);
            }
        }
        catch(TimeoutException | InterruptedException unused_ex) {
        }
    }

    public static int x(Context context0) {
        int v;
        frli frli0 = ffpx.c(context0);
        igyu igyu0 = (igyu)frli0.a().get();
        if((igyu0.b & 4) == 0) {
            v = new SecureRandom().nextInt(500000000);
            ((glyq)frli0.b(new ffot(v), gmap.a)).u();
        }
        else {
            v = igyu0.e;
        }
        Instant instant0 = Instant.ofEpochMilli(System.currentTimeMillis()).truncatedTo(ChronoUnit.DAYS);
        long v1 = ((long)v) + instant0.getEpochSecond() / 86400L;
        long v2 = v1 / iacj.b() % iacj.a.c().b();
        if(iacm.f()) {
            hfwn hfwn0 = hfyg.b(instant0.minus(Duration.ofDays(v1 % iacj.b())));
            if((igyu0.b & 8) == 0 || ((long)igyu0.f) != v2 || (igyu0.b & 0x20) == 0 || !((ProtoLiteMessage)(igyu0.h == null ? hfwn.a : igyu0.h)).equals(hfwn0)) {
                ((glyq)frli0.b(new ffou(v2, hfwn0), gmap.a)).u();
                return (int)v2;
            }
        }
        else if((igyu0.b & 8) == 0 || ((long)igyu0.f) != v2) {
            ((glyq)frli0.b(new ffov(v2), gmap.a)).u();
        }
        return (int)v2;
    }

    public static void y() {
        if(ffoz.b == null) {
            ffoz.b = new ffoy();
        }
    }

    static void z(StatsManager statsManager0, long v, Context context0) {
        Class class0 = ffoz.class;
        __monitor_enter(class0);
        int v1 = FIN.finallyOpen$NT();
        Intent intent0 = new Intent("com.android.server.stats.action.TRIGGER_COLLECTION");
        intent0.putExtra("FETCH_CONFIG_ID", v);
        int v2 = v == iabs.b() ? 0 : ((int)(v % 0x7FFFFFFFL));
        PendingIntent pendingIntent0 = IntentOperation.getPendingIntent(context0, FetchOperation.class, intent0, v2, 0xA000000);
        try {
            statsManager0.setFetchReportsOperation(pendingIntent0, v);
            FIN.finallyExec$NT(v1);
        }
        catch(StatsManager.StatsUnavailableException unused_ex) {
            FIN.finallyCodeBegin$NT(v1);
        }
    }
}

