import android.content.Context;
import android.provider.Settings.Secure;
import java.util.Arrays;

public class asdc {
    public static final asdc a;
    public static final int[] b;
    private static final ggsf c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private aqys j;

    static {
        asdc.c = ggsf.b("asdc");
        asdc.a = new asdc();
        asdc.d = new int[]{0, 1, 2};
        asdc.e = new int[]{0, 1};
        asdc.f = new int[]{0, 1};
        asdc.g = new int[]{0, 1, 2};
        asdc.b = new int[]{0, 1};
        asdc.h = new int[]{0, 1};
        asdc.i = new int[]{0, 1, 2};
    }

    public final void a(Context context0, boolean z) {
        int v = z ? 1 : 2;
        Settings.Secure.putInt(context0.getContentResolver(), "mms_backup_enabled", v);
        if(hqje.A()) {
            aqyz.e(context0, v);
        }
    }

    public final void b(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "mms_restore_complete", ((int)z));
    }

    public final void c(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "mms_restore_enabled", (z ? 1 : 2));
    }

    public final void d(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "mms_restore_started", ((int)z));
    }

    public final void e(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "photos_restore_completed", ((int)z));
    }

    public final void f(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "photos_restore_enabled", (z ? 1 : 2));
    }

    public final void g(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "photos_restore_started", ((int)z));
    }

    public final boolean h(Context context0) {
        int v = Settings.Secure.getInt(context0.getContentResolver(), "mms_backup_enabled", 0);
        if(hqje.A()) {
            if(this.j == null) {
                this.j = new aqys(context0);
            }
            aqys aqys0 = this.j;
            if(v > 0) {
                aqyz.e(context0, v);
            }
            else {
                int v1 = aqyz.d(context0, 0);
                if(v1 > 0) {
                    aqyz.a.j("mms_backup_enabled : fetched from GSF: " + v1, new Object[0]);
                    Settings.Secure.putInt(context0.getContentResolver(), "mms_backup_enabled", v1);
                    if(hqje.a.m().ai()) {
                        ProtoLiteBuilder hftp0 = aqra.b();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giga.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((giga)hftp1.b_message).c = 1;
                        ((giga)hftp1.b_message).b |= 1;
                        giga giga0 = (giga)hftp1.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ghys ghys0 = (ghys)hftp0.b_message;
                        giga0.getClass();
                        ghys0.aq = giga0;
                        ghys0.d |= 0x80000;
                        aqys0.x(hftp0, ghyr.aE, 0);
                    }
                    v = v1;
                }
            }
        }
        asdc.i("mms_backup_enabled", v, asdc.i);
        return v == 1;
    }

    public static void i(String s, int v, int[] arr_v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(v == arr_v[v1]) {
                return;
            }
        }
        ggsu ggsu0 = asdc.c.j();
        String s1 = Arrays.toString(arr_v);
        ((ggsc)((ggsc)ggsu0.r(bbop.a, Integer.valueOf(0xE5))).ar(0x5EB)).X("Found invalid value %d for setting %s. Possible values are %s", Integer.valueOf(v), s, s1);
    }

    public static final int j(Context context0) {
        int v = Settings.Secure.getInt(context0.getContentResolver(), "mms_restore_enabled", 0);
        asdc.i("mms_restore_enabled", v, asdc.d);
        return v;
    }

    public static final int k(Context context0) {
        int v = Settings.Secure.getInt(context0.getContentResolver(), "photos_restore_enabled", 0);
        asdc.i("photos_restore_enabled", v, asdc.g);
        return v;
    }

    public static final boolean l(Context context0) {
        int v = Settings.Secure.getInt(context0.getContentResolver(), "mms_restore_complete", 0);
        asdc.i("mms_restore_complete", v, asdc.f);
        return v == 1;
    }

    public static final boolean m(Context context0) {
        int v = Settings.Secure.getInt(context0.getContentResolver(), "mms_restore_started", 0);
        asdc.i("mms_restore_started", v, asdc.e);
        return v == 1;
    }

    public static final boolean n(Context context0) {
        int v = Settings.Secure.getInt(context0.getContentResolver(), "photos_restore_completed", 0);
        asdc.i("photos_restore_completed", v, asdc.h);
        return v == 1;
    }

    public static final void o(Context context0, long v) {
        Settings.Secure.putLong(context0.getContentResolver(), "mms_backup_last_completed", v);
    }

    public static final void p(Context context0, boolean z) {
        Settings.Secure.putInt(context0.getContentResolver(), "mms_backup_in_progress", ((int)z));
    }

    public static final boolean q(Context context0) {
        return asdc.j(context0) == 1;
    }
}

