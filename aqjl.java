import android.content.Context;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import java.util.Arrays;

public final class aqjl {
    public static final aqjl a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    private static final baun f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[] n;

    static {
        aqjl.f = aqql.a("BackupSettings");
        aqjl.a = new aqjl();
        aqjl.b = new int[]{0, 1};
        aqjl.g = new int[]{0, 1};
        aqjl.h = new int[]{0, 1};
        aqjl.i = new int[]{0, 1};
        aqjl.j = new int[]{0, 1};
        aqjl.c = new int[]{-1, 0, 1};
        aqjl.d = new int[]{-1, 0, 1};
        aqjl.k = new int[]{0, 1};
        aqjl.l = new int[]{0, 1};
        aqjl.e = new int[]{0, 1};
        aqjl.m = new int[]{0, 1};
        aqjl.n = new int[]{0, 1, 2};
    }

    public final int a(Context context0) {
        return aqjl.q("backup_testing_flows_type", Settings.Secure.getInt(context0.getContentResolver(), "backup_testing_flows_type", 0), aqjl.n);
    }

    public final void b(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "backup_enabled:com.android.calllogbackup", ((int)z));
        if(hqhn.g()) {
            aqyz.b(context0, "backup_enabled:com.android.calllogbackup", ((int)z));
        }
    }

    public final void c(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "backup_encryption_opt_in_displayed", ((int)z));
        if(hqhn.g()) {
            aqyz.b(context0, "backup_encryption_opt_in_displayed", ((int)z));
        }
    }

    public final void d(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "user_full_data_backup_aware", ((int)z));
        if(hqhn.g()) {
            aqyz.b(context0, "user_full_data_backup_aware", ((int)z));
        }
    }

    public final void e(Context context0, int v) {
        if(v != -1 && v != 0) {
            v = 1;
        }
        Settings.Secure.putInt(context0.getContentResolver(), "migrate_full_data_aware_original", v);
    }

    public final void f(Context context0, int v) {
        if(v != -1 && v != 0) {
            v = 1;
        }
        Settings.Secure.putInt(context0.getContentResolver(), "migrate_backup_enabled", v);
    }

    public final void g(Context context0, String s) {
        Settings.Secure.putString(context0.getContentResolver(), "packages_to_clear_data_before_full_restore", s);
    }

    public final void h(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "backup_enabled:com.android.providers.telephony", ((int)z));
        if(hqhn.g()) {
            aqyz.b(context0, "backup_enabled:com.android.providers.telephony", ((int)z));
        }
    }

    public final boolean i(Context context0) {
        return aqjl.q("backup_enable_testing_flows", Settings.Secure.getInt(context0.getContentResolver(), "backup_enable_testing_flows", 0), aqjl.m) != 0;
    }

    public final boolean j(Context context0) {
        int v = Settings.Secure.getInt(context0.getContentResolver(), "has_enabled_photos_backup_before", 0);
        aqjl.p("has_enabled_photos_backup_before", v, aqjl.i);
        return v != 0;
    }

    public final boolean k(Context context0) {
        int v = aqyz.c(Settings.Secure.getInt(context0.getContentResolver(), "backup_enabled:com.android.calllogbackup", 0), context0, "backup_enabled:com.android.calllogbackup");
        aqjl.p("backup_enabled:com.android.calllogbackup", v, aqjl.g);
        return v != 0;
    }

    public final boolean l(Context context0) {
        int v = Settings.Global.getInt(context0.getContentResolver(), "device_provisioned", 0);
        aqjl.p("device_provisioned", v, aqjl.h);
        return v != 0;
    }

    public final boolean m(Context context0) {
        int v = aqyz.c(Settings.Secure.getInt(context0.getContentResolver(), "user_full_data_backup_aware", 0), context0, "user_full_data_backup_aware");
        aqjl.p("user_full_data_backup_aware", v, aqjl.j);
        return v != 0;
    }

    public final boolean n(Context context0) {
        int v = aqyz.c(Settings.Secure.getInt(context0.getContentResolver(), "backup_enabled:com.android.providers.telephony", 0), context0, "backup_enabled:com.android.providers.telephony");
        aqjl.p("backup_enabled:com.android.providers.telephony", v, aqjl.k);
        return v != 0;
    }

    public final boolean o(Context context0) {
        int v = aqyz.c(Settings.Secure.getInt(context0.getContentResolver(), "backup_encryption_opt_in_displayed", 0), context0, "backup_encryption_opt_in_displayed");
        aqjl.p("backup_encryption_opt_in_displayed", v, aqjl.l);
        return v != 0;
    }

    public static void p(String s, int v, int[] arr_v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return;
            }
        }
        aqjl.f.m("Found invalid value %d for setting %s. Possible values are %s", new Object[]{v, s, Arrays.toString(arr_v)});
    }

    private static int q(String s, int v, int[] arr_v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return v;
            }
        }
        aqjl.f.m("Found invalid value %d for setting %s. Possible values are %s", new Object[]{v, s, Arrays.toString(arr_v)});
        return 0;
    }
}

