import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemProperties;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class erei {
    public static int a(int v) {
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 3;
                }
                case 2: {
                    return 1;
                }
                case 3: {
                    return 4;
                }
                default: {
                    return 0;
                }
            }
        }
        return 2;
    }

    public static int b(Context context0, int v) {
        int v1 = 2;
        erqc erqc0 = new erqc(new String[]{"QuickStartUtils"});
        boolean z = gfqz.e(Build.MANUFACTURER, "samsung");
        if(bbqa.d() && !erpk.a(context0) && (v == 0 || v == 2)) {
            hyis hyis0 = hyis.a;
            if(bbod.c(hyis0.k().v())) {
                boolean z1 = SystemProperties.getBoolean("ro.oem.quick_start_target_lskf", true);
                erqc0.h("oemEnablesTargetLskf: %s", new Object[]{Boolean.valueOf(z1)});
                if(bbnp.m(context0)) {
                    v1 = 3;
                }
                else if(z) {
                    if(!bbod.c(hyis0.k().w())) {
                        v1 = 0;
                    }
                }
                else if(z1) {
                    v1 = 3;
                }
                else {
                    v1 = 0;
                }
            }
            else {
                v1 = 0;
            }
        }
        else {
            v1 = 0;
        }
        if(v1 != 0 && eqwf.a(context0).c()) {
            erqc0.h("Prefer source UV due to FRP", new Object[0]);
            return 0;
        }
        return v1;
    }

    public static Bundle c(eqoc eqoc0) {
        if(eqoc0 == null) {
            return null;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("dependencyError", eqoc0.toBytesArray());
        return bundle0;
    }

    public static String d(Context context0, int v) {
        switch(v) {
            case 3: {
                return "TV";
            }
            case 7: {
                return "Chromebook";
            }
            default: {
                return "new device";
            }
        }
    }

    public static void e(ArrayList arrayList0, gmcd gmcd0) {
        erqc erqc0 = new erqc(new String[]{"QuickStartUtils"});
        try {
            gged_interceptors gged0 = (gged_interceptors)gmbu.r(gmcd0);
            if(gged0 != null) {
                erqc0.h("Loaded %d owners", new Object[]{gged0.size()});
                for(Object object0: arrayList0) {
                    BootstrapAccount bootstrapAccount0 = (BootstrapAccount)object0;
                    gfsx gfsx0 = gggq.c(gged0, new ereh(bootstrapAccount0));
                    if(gfsx0.i()) {
                        foec foec0 = (foec)gfsx0.d();
                        erqc0.d("Found matching owner for %s: %s", new Object[]{bootstrapAccount0.b, foec0.c});
                        bootstrapAccount0.q(((foec)gfsx0.d()).c);
                        bootstrapAccount0.r(((foec)gfsx0.d()).d);
                    }
                }
            }
        }
        catch(ExecutionException | CancellationException exception0) {
            erqc0.n("Failed to load owners", exception0, new Object[0]);
        }
        catch(IllegalStateException unused_ex) {
            erqc0.m("Owners took to long to load", new Object[0]);
        }
    }

    public static boolean f(Context context0, fz fz0) {
        if(!bbqa.d()) {
            return false;
        }
        fz0.B((gaec.y(context0) ? 0x7F0100B5 : 0x7F0100B4), 0x7F0100B6, (gaec.y(context0) ? 0x7F0100B2 : 0x7F0100B1), 0x7F0100B3);  // anim:shared_x_axis_activity_open_enter_dynamic_color
        return true;
    }

    public static int g(int v) {
        switch(v) {
            case 0: {
                return 2;
            }
            case 1: {
                return 5;
            }
            case 2: {
                return 6;
            }
            default: {
                return 1;
            }
        }
    }
}

