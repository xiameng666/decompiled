import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.TWR;

public final class eitp {
    public static final bboh a;
    protected static final long b;
    protected static final long c;

    static {
        eitp.a = bboh.b("HeterodyneSyncScheduler", bbcu.al);
        eitp.b = TimeUnit.MINUTES.toSeconds(30L);
        eitp.c = TimeUnit.DAYS.toSeconds(7L);
    }

    public static Bundle a(gnzv gnzv0) {
        return eitp.g(gnzv0, null);
    }

    public static void b(Context context0, gnzv gnzv0, String s) {
        eitp.d(context0, 1L, 2L, "PhenotypeSyncImmediately", gnzv0, s);
    }

    public static void c(Context context0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("SchedulerPrefs", 0).edit();
        sharedPreferences$Editor0.clear();
        sharedPreferences$Editor0.apply();
        int v = new Random().nextInt(0x3804);
        ((ggtj)eitp.a.h()).x("Cancel all previously scheduled polling");
        cljp.a(context0).c("com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator");
        ((ggtj)eitp.a.h()).G("Scheduling Phenotype for first execution %d seconds from now (%d)", v + 60, System.currentTimeMillis());
        clkn clkn0 = new clkn();
        clkn0.e(((long)(v + 55)), ((long)(v + 65)));
        clkn0.j = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        clkn0.p = true;
        clkn0.t("PhenotypePeriodicSync");
        clkn0.y(0, 1);
        clkn0.x(0, 0);
        clkn0.i(false);
        clkn0.u = eitp.a(gnzv.b);
        eitp.e(context0, clkn0.a());
    }

    public static void d(Context context0, long v, long v1, String s, gnzv gnzv0, String s1) {
        ((ggtj)eitp.a.h()).Z("Scheduling Phenotype for a %s(%d, %s) one off with window [%d, %d] in seconds", s, Integer.valueOf(gnzv0.x), s1, Long.valueOf(v), Long.valueOf(v1));
        clkn clkn0 = new clkn();
        clkn0.e(v, v1);
        clkn0.j = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        clkn0.t(s);
        clkn0.p = true;
        clkn0.v(1);
        clkn0.y(0, 1);
        clkn0.x(0, 0);
        clkn0.i(false);
        clkn0.u = eitp.g(gnzv0, s1);
        eitp.e(context0, clkn0.a());
    }

    public static void e(Context context0, cllp cllp0) {
        cljp.a(context0).f(cllp0);
        if(((Boolean)cjnd.b.mr()).booleanValue()) {
            cjnd cjnd0 = cjnd.a();
            gdqs gdqs0 = cjnd0.c.k("syncTaskScheduled");
            try {
                cjnd0.h(new cjmq(cjnd0, cllp0));
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(gdqs0, throwable0);
                throw throwable0;
            }
            if(gdqs0 != null) {
                gdqs0.close();
            }
        }
    }

    public static void f(Context context0, String s, int v) {
        long v5;
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("SchedulerPrefs", 0);
        long v1 = sharedPreferences0.getLong("scheduledPeriodSec", -1L);
        hxmk hxmk0 = hxmk.a;
        long v2 = hxmk0.c().e();
        if(Long.compare(v1, v2) != 0) {
            long v3 = hxly.a.f().a();
            long v4 = eitp.b;
            if(v2 >= v4) {
                v4 = eitp.c;
                v5 = v2 <= v4 ? v2 : v4;
            }
            else {
                v5 = v4;
            }
            ((ggtj)eitp.a.h()).K("Scheduling a periodic sync task every %d seconds, with flex of %d seconds", v5, v3);
            clkq clkq0 = new clkq();
            clkq0.a = v5;
            clkq0.j = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
            clkq0.v(1);
            clkq0.p = true;
            clkq0.b = v3;
            clkq0.y(0, 1);
            clkq0.x(0, 0);
            clkq0.i(false);
            clkq0.t("PhenotypePeriodicSync");
            clkq0.u = eitp.a(gnzv.b);
            if(hxmk0.c().u()) {
                clkq0.x(0, 1);
            }
            if(hxmk0.c().v()) {
                clkq0.y(0, 0);
            }
            eitp.e(context0, clkq0.a());
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putLong("scheduledPeriodSec", v5);
            sharedPreferences$Editor0.apply();
        }
        if(!"PhenotypeAdaptiveSync".equals(s) && v != 0) {
            return;
        }
        long v6 = hxmk0.c().a();
        long v7 = v6 >= eitp.b ? v6 : eitp.b;
        ((ggtj)eitp.a.h()).K("Scheduling adaptive one off task with window [%d, %d] in seconds", v7, eitp.c);
        clkn clkn0 = new clkn();
        clkn0.e(v7, eitp.c);
        clkn0.j = "com.google.android.gms.phenotype.service.sync.PhenotypeConfigurator";
        clkn0.t("PhenotypeAdaptiveSync");
        clkn0.u = eitp.a(gnzv.c);
        clkn0.p = true;
        clkn0.v(1);
        clkn0.y(0, 1);
        clkn0.x(0, 1);
        clkn0.i(false);
        eitp.e(context0, clkn0.a());
    }

    private static Bundle g(gnzv gnzv0, String s) {
        Bundle bundle0 = new Bundle(1);
        bundle0.putInt("fetchReason", gnzv0.x);
        if(s != null) {
            bundle0.putString("fetchPackage", s);
        }
        return bundle0;
    }
}

