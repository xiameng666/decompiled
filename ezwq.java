import android.content.Context;
import android.os.SystemClock;
import android.telecom.TelecomManager;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.SystemUpdateStatus;

public final class ezwq {
    public static final baun a;
    public static final ezwf b;
    public static final ezwf c;
    public static final ezwf d;
    public static final ezwf e;
    public static final ezwf f;
    private static final ezwe g;
    private static final ggfp h;

    static {
        ezwq.a = fabk.c("Installation");
        ezwe ezwe0 = new ezwe("config.flag.");
        ezwq.g = ezwe0;
        ezwq.b = ezwe0.d("maintenance_window", "", hvzy.q);
        ezwq.c = ezwe0.c("battery_threshold", Long.valueOf(40L), hvzy.b);
        ezwq.d = ezwe0.c("min_battery_threshold", Long.valueOf(20L), hvzy.r);
        ezwq.e = new ezwe("config.flag.download_").c("min_data_space", Long.valueOf(0x1F400000L), hvzv.e);
        ezwq.f = new ezwe("config.flag.installation_").d("auto_reboot_device_encryption_types", "unencrypted", hwab.b);
        ezwq.h = ggfp.O(Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(15), Integer.valueOf(23), Integer.valueOf(273), Integer.valueOf(529), new Integer[]{((int)785)});
    }

    public static int a(Context context0) {
        return ezwc.h(context0) ? ezwj.f().intValue() : ezwj.e().intValue();
    }

    public static long b(Context context0, SystemUpdateStatus systemUpdateStatus0, long v, long v1, long v2) {
        if(hwcb.f() && ((long)ezwj.j()) == 4L) {
            if(!hwcb.g()) {
                return hwcb.d();
            }
            boolean z = ezwq.h(context0, systemUpdateStatus0, v, v1, v2);
            if(z && ezwc.l(context0)) {
                return hwcb.a.e().l();
            }
            if(z && systemUpdateStatus0.F == -1L) {
                return hwcb.c();
            }
            if(z) {
                return systemUpdateStatus0.F == -1L ? hwcb.d() : systemUpdateStatus0.F + hwcb.c() - v1;
            }
            return hwcb.d();
        }
        return hvzz.a.d().c();
    }

    public static ezwb c(Context context0, SystemUpdateStatus systemUpdateStatus0, long v, long v1) {
        boolean z;
        long v6;
        SystemUpdateStatus systemUpdateStatus1 = systemUpdateStatus0;
        long v2 = System.currentTimeMillis();
        long v3 = systemUpdateStatus1.n;
        long v4 = SystemClock.elapsedRealtime();
        ezwv ezwv0 = ezwv.a(context0, v3);
        int v5 = ezwv0.a;
        if(v5 != 3 && v5 != 4) {
            ezww ezww0 = ezwq.g();
            if(!ezwu.c(systemUpdateStatus1) && !systemUpdateStatus1.h.b && !ezww0.g(v2) && v5 != 1 && !systemUpdateStatus1.D.a && (!hwcb.f() || ((long)ezwj.j()) != 4L || v2 - v3 < hwcb.b())) {
                return new ezwb(531, ezww0.c(v2), true);
            }
            if(ezwc.a(context0) < ezwq.a(context0)) {
                return ezwc.h(context0) ? new ezwb(275, hvzz.b()) : new ezwb(275, ((long)ezwk.d()));
            }
            if(!ezwu.c(systemUpdateStatus1) && v5 == 0 && !systemUpdateStatus1.h.a && !systemUpdateStatus1.D.a && !ezwu.d(context0)) {
                if(hwcb.f() && ((long)ezwj.j()) == 4L) {
                    v6 = v4;
                    z = ezwq.d(context0, systemUpdateStatus1, v2, v6, v1);
                    systemUpdateStatus1 = systemUpdateStatus0;
                }
                else {
                    v6 = v4;
                    systemUpdateStatus1 = systemUpdateStatus0;
                    z = ezwc.i(context0, systemUpdateStatus1, v2, v6, ((Long)ezwo.e(hwab.f, Long.class)).longValue(), hvzz.a.d().b(), ezwk.b().longValue(), ezwk.c().longValue());
                }
                if(!z) {
                    ActivityStatus activityStatus0 = systemUpdateStatus1.r;
                    if(activityStatus0.a && v >= 0L && (activityStatus0.c >= 0L && v >= activityStatus0.c)) {
                        ezwq.a.h("Ignoring idle check: system update activity has been foregrounded since last user approval", new Object[0]);
                        return !systemUpdateStatus1.l || systemUpdateStatus1.D.a ? new ezwb(273, 0L) : new ezwb(787, hvzz.a.d().f());
                    }
                    if(ezwq.h.contains(Integer.valueOf(activityStatus0.e)) && (activityStatus0.d >= 0L && v2 - activityStatus0.d <= hvxg.a.c().a())) {
                        ezwq.a.h("Ignoring idle check: update was progressing when the system update activity was last backgrounded", new Object[0]);
                        return !systemUpdateStatus1.l || systemUpdateStatus1.D.a ? new ezwb(273, 0L) : new ezwb(787, hvzz.a.d().f());
                    }
                    if(v >= 0L && v2 - v <= hvxg.b()) {
                        long v7 = hvxg.b();
                        ezwq.a.h("Ignoring idle check: User approval given less than " + v7 + " ms ago", new Object[0]);
                        return !systemUpdateStatus1.l || systemUpdateStatus1.D.a ? new ezwb(273, 0L) : new ezwb(787, hvzz.a.d().f());
                    }
                    return new ezwb(1043, ezwq.b(context0, systemUpdateStatus1, v2, v6, v1));
                }
            }
            return !systemUpdateStatus1.l || systemUpdateStatus1.D.a ? new ezwb(273, 0L) : new ezwb(787, hvzz.a.d().f());
        }
        return new ezwb(0x513, ezwv0.b, true);
    }

    public static boolean d(Context context0, SystemUpdateStatus systemUpdateStatus0, long v, long v1, long v2) {
        if(ezwq.h(context0, systemUpdateStatus0, v, v1, v2)) {
            if(hwcb.g()) {
                hwcb hwcb0 = hwcb.a;
                long v3 = hwcb0.e().m();
                if(v - systemUpdateStatus0.n >= v3) {
                    if(ezwq.i(v1, v2, hwcb0.e().c())) {
                        return ezwc.l(context0) ? false : systemUpdateStatus0.F != -1L && v1 >= systemUpdateStatus0.F + hwcb.c();
                    }
                    return true;
                }
                return ezwc.l(context0) ? false : systemUpdateStatus0.F != -1L && v1 >= systemUpdateStatus0.F + hwcb.c();
            }
            return true;
        }
        return false;
    }

    public static boolean e() {
        return hwcb.f() && ((long)ezwj.j()) == 4L;
    }

    public static boolean f(Context context0, SystemUpdateStatus systemUpdateStatus0) {
        TelecomManager telecomManager0 = (TelecomManager)context0.getSystemService("telecom");
        if(telecomManager0 != null && telecomManager0.isInCall()) {
            if(hvzz.a.d().h()) {
                return !systemUpdateStatus0.C;
            }
            return ((long)ezwj.j()) == 4L ? true : systemUpdateStatus0.D.a && !systemUpdateStatus0.C;
        }
        return false;
    }

    public static ezww g() {
        ezww ezww0 = ezww.d(((String)ezwo.d(hvzy.q, String.class)));
        return ezww0.h() ? ezww0 : ezww.b;
    }

    private static boolean h(Context context0, SystemUpdateStatus systemUpdateStatus0, long v, long v1, long v2) {
        long v3 = (long)(((Long)ezwo.e(hwab.d, Long.class)));
        hwcb hwcb0 = hwcb.a;
        if(ezwq.i(v1, v2, hwcb0.e().b()) && !ezwc.j(context0)) {
            return systemUpdateStatus0.p != -1L && systemUpdateStatus0.p + v3 >= v1 ? ezwc.i(context0, systemUpdateStatus0, v, v1, hwcb0.e().j(), v3, ezwk.b().longValue(), ezwk.c().longValue()) : false;
        }
        return ezwc.i(context0, systemUpdateStatus0, v, v1, hwcb0.e().j(), v3, ezwk.b().longValue(), ezwk.c().longValue());
    }

    private static boolean i(long v, long v1, long v2) {
        return v1 >= hwcb.a.e().a() && v < v2;
    }
}

