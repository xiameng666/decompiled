import android.content.Context;
import android.provider.Settings.Global;
import android.text.TextUtils;
import com.google.android.gms.update.ExpeditedUpdateStatus;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.concurrent.TimeUnit;

public final class ezwy {
    public static final Long a;
    public static final Long b;
    public static final Long c;
    public static final Long d;
    public static final ezwf e;
    public static final Long f;
    public static final ezwf g;
    private static final ezwe h;

    static {
        ezwe ezwe0 = new ezwe("config.flag.");
        ezwy.h = ezwe0;
        ezwy.a = (long)3L;
        ezwy.b = (long)4L;
        ezwy.c = (long)6L;
        Long long0 = (long)2L;
        ezwy.d = long0;
        ezwy.e = ezwe0.c("urgency", long0, hvzy.U);
        Long long1 = (long)-1L;
        ezwy.f = long1;
        ezwy.g = ezwe0.c("expedited_update_delay", long1, hvyz.a);
    }

    public static boolean a(Context context0, SystemUpdateStatus systemUpdateStatus0, boolean z) {
        if(ezwv.a(context0, systemUpdateStatus0.n).a != 0) {
            return false;
        }
        if(!ezwy.g(context0, systemUpdateStatus0)) {
            return false;
        }
        if(ezwy.i(systemUpdateStatus0) && ezwy.h(context0)) {
            return false;
        }
        return ezwc.f() ? true : z && ((Boolean)ezwo.d(hvzy.a, Boolean.class)).booleanValue();
    }

    public static boolean b(Context context0, long v, ExpeditedUpdateStatus expeditedUpdateStatus0) {
        if(ezwy.c(context0)) {
            return true;
        }
        if(ezwv.a(context0, v).a != 0) {
            return false;
        }
        long v1 = (long)ezwj.j();
        if(v1 != 3L) {
            if(v1 != 4L) {
                return expeditedUpdateStatus0.a ? false : v1 == 2L;
            }
            return false;
        }
        return false;
    }

    public static boolean c(Context context0) {
        if(hvyo.a.b().a()) {
            return false;
        }
        return !hwdd.a.b().a() || Settings.Global.getInt(context0.getContentResolver(), "google_play_store_system_component_update", 1) == 1 ? hwdd.a.b().b() && Settings.Global.getInt(context0.getContentResolver(), "google_ota_automatic_download", 1) != 1 : true;
    }

    public static boolean d(Context context0, long v) {
        return ezwy.c(context0) ? false : ((long)ezwh.a()) >= 0L && System.currentTimeMillis() >= v + TimeUnit.DAYS.toMillis(ezwh.a().longValue());
    }

    public static boolean e(Context context0, SystemUpdateStatus systemUpdateStatus0, boolean z) {
        if(ezwv.a(context0, systemUpdateStatus0.n).a != 0) {
            return false;
        }
        if(ezwy.i(systemUpdateStatus0) && ezwy.h(context0)) {
            return false;
        }
        return ezwy.f(context0, systemUpdateStatus0, z) ? false : ((long)ezwj.j()) == 2L || ((long)ezwj.j()) == 3L;
    }

    public static boolean f(Context context0, SystemUpdateStatus systemUpdateStatus0, boolean z) {
        if(!ezwy.a(context0, systemUpdateStatus0, z)) {
            return false;
        }
        long v = (long)ezwj.j();
        return ezwc.f() ? v == 2L || v == 3L || hwbd.a.b().a() : v == 3L;
    }

    public static boolean g(Context context0, SystemUpdateStatus systemUpdateStatus0) {
        if(ezwc.f()) {
            return Settings.Global.getInt(context0.getContentResolver(), "ota_disable_automatic_update", 0) != 0 || ezwy.c(context0) ? false : !((Boolean)ezwo.d(hvzy.E, Boolean.class)).booleanValue() || ((long)ezwj.j()) == 4L || systemUpdateStatus0.h.c;
        }
        return ((Boolean)ezwo.d(hvzy.F, Boolean.class)).booleanValue();
    }

    private static boolean h(Context context0) {
        return TextUtils.isEmpty(ezwj.n()) || ((long)ezwj.j()) != 3L ? ezwu.d(context0) : true;
    }

    private static boolean i(SystemUpdateStatus systemUpdateStatus0) {
        return systemUpdateStatus0.o == 0L;
    }
}

