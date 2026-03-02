import android.content.Context;
import android.provider.Settings.Secure;

public final class aren {
    public static final Object a;

    static {
        aren.a = new Object();
    }

    public static final void a(Context context0, aqjk aqjk0, aqjl aqjl0) {
        synchronized(aren.a) {
            int v1 = Settings.Secure.getInt(context0.getContentResolver(), "migrate_backup_enabled", -1);
            aqjl.p("migrate_backup_enabled", v1, aqjl.d);
            switch(v1) {
                case -1: {
                    break;
                }
                case 1: {
                    aqjk0.f(true);
                    aqjl0.f(context0, -1);
                    break;
                }
                default: {
                    aqjk0.f(false);
                    aqjl0.f(context0, -1);
                }
            }
        }
    }

    public static final void b(Context context0, aqjl aqjl0) {
        synchronized(aren.a) {
            int v1 = Settings.Secure.getInt(context0.getContentResolver(), "migrate_full_data_aware_original", -1);
            aqjl.p("migrate_full_data_aware_original", v1, aqjl.c);
            switch(v1) {
                case -1: {
                    break;
                }
                case 1: {
                    aqjl0.d(context0, true);
                    aqjl0.e(context0, -1);
                    break;
                }
                default: {
                    aqjl0.d(context0, false);
                    aqjl0.e(context0, -1);
                }
            }
        }
    }
}

