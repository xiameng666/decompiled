import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.ExpeditedUpdateStatus;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class ezwd {
    public static final ezwf a;
    public static final ezwf b;
    public static final ezwf c;
    public static final ezwf d;
    public static final ezwf e;
    public static final ezwf f;
    private static final ezwe g;
    private static final ezwe h;

    static {
        fabk.c("Download");
        ezwe ezwe0 = new ezwe("config.flag.download_");
        ezwd.g = ezwe0;
        ezwe ezwe1 = new ezwe("config.flag.");
        ezwd.h = ezwe1;
        ezwd.a = ezwe0.c("min_cache_space", Long.valueOf(0x6400000L), hvzv.d);
        ezwd.b = ezwe1.d("offpeak_download_window", "", hvzy.C);
        ezwd.c = ezwe1.c("offpeak_download_max_trying_days", Long.valueOf(0x7FFFFFFFL), hvzy.A);
        ezwd.d = ezwe1.b("offpeak_download_operator_restricted", Boolean.valueOf(false), hvzy.B);
        ezwd.e = ezwe1.d("zero_rate_apn_capability", "", hvzy.X);
        ezwd.f = ezwe1.c("mobile_network_delay", Long.valueOf(0L), hvzy.s);
    }

    public static ezwb a(Context context0, gfsx gfsx0, SystemUpdateStatus systemUpdateStatus0) {
        long v = systemUpdateStatus0.n;
        ExpeditedUpdateStatus expeditedUpdateStatus0 = systemUpdateStatus0.D;
        long v1 = System.currentTimeMillis();
        ezwv ezwv0 = ezwv.a(context0, v);
        if(ezwy.b(context0, v, expeditedUpdateStatus0) && !systemUpdateStatus0.i) {
            return new ezwb(0x70B, hvzt.a.g().c());
        }
        if(systemUpdateStatus0.k && !expeditedUpdateStatus0.a) {
            return new ezwb(0x60B, hvzt.a.g().k());
        }
        if(gfta.c(ezwj.n()) && !ezwu.d(context0)) {
            long v2 = systemUpdateStatus0.o;
            if(Long.compare(v2, 0L) == 0) {
                return new ezwb(0x50B, Math.max(TimeUnit.MINUTES.toMillis(15L), ezwj.g().longValue()));
            }
            if(v1 < ((long)ezwj.g()) + v2) {
                return new ezwb(0x50B, ((long)ezwj.g()) + v2 - v1);
            }
        }
        boolean z = !hwdj.a.b().b();
        if(!ezwc.k(context0) && ezwc.a(context0) >= (ezwc.h(context0) ? ((Long)ezwo.d(hvzy.h, Long.class)).intValue() : ((Long)ezwo.d(hvzy.g, Long.class)).intValue())) {
            if(gfsx0.i()) {
                long v3 = ezwd.h();
                int v4 = 0;
                boolean z1 = Long.compare(v3, 0L) > 0 && v3 + v > v1;
                ggfp ggfp0 = hwdj.c() ? ((fabv)gfsx0.d()).a(context0) : ggnj.a;
                if(((fabv)gfsx0.d()).b(context0)) {
                    if(systemUpdateStatus0.B) {
                        return new ezwb(0xC0B, hvzt.f());
                    }
                    if(!ezwu.c(systemUpdateStatus0)) {
                        DownloadOptions downloadOptions0 = systemUpdateStatus0.g;
                        if(!downloadOptions0.a) {
                            int v5 = ezwv0.a;
                            if(v5 != 0) {
                                v4 = v5;
                            }
                            else if(z1 && (!hwdj.c() || !ggfp0.contains(Integer.valueOf(downloadOptions0.d)))) {
                                return new ezwb(0x80B, hvzt.f());
                            }
                            if(TimeUnit.DAYS.toMillis(((Long)ezwo.d(hvzy.A, Long.class)).longValue()) + v > v1) {
                                ezww ezww0 = ezww.d(((String)ezwo.d(hvzy.C, String.class)));
                                if(!ezww0.h()) {
                                    ezww0 = ezww.b;
                                }
                                if(!ezww0.g(v1) && !downloadOptions0.b && !expeditedUpdateStatus0.a && v4 != 1) {
                                    return new ezwb(0x10B, ezww0.c(v1));
                                }
                                if(((Boolean)ezwo.d(hvzy.B, Boolean.class)).booleanValue() && !gfta.b(((TelephonyManager)context0.getSystemService("phone")).getSimOperator()).equalsIgnoreCase(avra.h(context0))) {
                                    return new ezwb(0x30B, hvzt.a.g().j());
                                }
                            }
                            if(!((Boolean)ezwo.c(hvzv.b, Boolean.class)).booleanValue()) {
                                Object object0 = gfsx0.d();
                                gfsx gfsx1 = gfsx.l(((ConnectivityManager)context0.getSystemService("connectivity")).getNetworkInfo(((Network)((gftm)((fabv)object0).a).a)));
                                if(gfsx1.i() && ((NetworkInfo)gfsx1.d()).isRoaming()) {
                                    return new ezwb(0xA0B, hvzt.a.g().e());
                                }
                            }
                        }
                    }
                }
                else {
                    hwdj.c();
                }
            }
            ezwc.h(context0);
            if(hwcb.f() && !ezwu.c(systemUpdateStatus0) && ((long)ezwj.j()) == 4L && !systemUpdateStatus0.g.c) {
                return ezwc.i(context0, systemUpdateStatus0, v1, SystemClock.elapsedRealtime(), hwcb.a.e().i(), hwcb.a.e().f(), hwcb.a.e().e(), hwcb.a.e().g()) ? new ezwb(2, 0L) : new ezwb(0xB0B, hwcb.a.e().h());
            }
            return new ezwb(2, 0L);
        }
        return ezwc.h(context0) ? new ezwb(0x90B, ((long)(((Long)ezwo.c(hvzv.c, Long.class))))) : new ezwb(0x90B, hvzt.a.g().g());
    }

    public static final List b() {
        return gfud.e(',').d().j(new gfrn(' ')).n(ezwj.s());
    }

    public static boolean c() {
        return (hvxk.a.b().a() || hvxk.a.b().b() && ezwj.d().booleanValue()) && hwda.c();
    }

    public static boolean d() {
        return ((Boolean)ezwo.d(hvzy.Q, Boolean.class)).booleanValue() && !gfta.c(ezwj.o());
    }

    public static boolean e(int v) {
        return (v & 0x1F) == 11;
    }

    public static boolean f(SystemUpdateStatus systemUpdateStatus0) {
        return ezwd.e(systemUpdateStatus0.c);
    }

    public static boolean g() {
        return !TextUtils.isEmpty(ezwj.s());
    }

    public static long h() {
        boolean z = !((Boolean)ezwo.d(hvzy.W, Boolean.class)).booleanValue();
        return ((long)(((Long)ezwo.d(hvzy.s, Long.class)))) * 1000L;
    }
}

