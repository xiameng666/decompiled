import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class bwiy {
    public static final String a(Context context0) {
        bwho bwho0;
        ibuq.f(context0, "context");
        int v = (int)htyb.a.d().d();
        String s = null;
        if(v == -2) {
            bwho0 = bwho.f;
        }
        else {
            switch(v) {
                case -1: {
                    bwho0 = bwho.e;
                    break;
                }
                case 0: {
                    bwho0 = bwho.a;
                    break;
                }
                case 1: {
                    bwho0 = bwho.b;
                    break;
                }
                case 2: {
                    bwho0 = bwho.c;
                    break;
                }
                case 3: {
                    bwho0 = bwho.d;
                    break;
                }
                default: {
                    bwho0 = null;
                }
            }
        }
        if(bwho0 != bwho.a) {
            if(bwho0 != null) {
                switch(bwho0.ordinal()) {
                    case 1: {
                        ((ggtj)bwiz.a.h()).x("Simulating low energy mode");
                        return "low_energy_use";
                    }
                    case 2: {
                        ((ggtj)bwiz.a.h()).x("Simulating moderate energy mode");
                        return "moderate_energy_use";
                    }
                    case 3: {
                        ((ggtj)bwiz.a.h()).x("Simulating high energy mode");
                        return "high_energy_use";
                    }
                }
            }
            ((ggtj)bwiz.a.h()).x("Simulating unknown energy mode");
            return "energy_mode_unknown";
        }
        if(Build.VERSION.SDK_INT >= 34) {
            try {
                Bundle bundle0 = context0.getContentResolver().call("com.android.tv.settings.device.eco.energymodes", "getEnergyModes", null, null);
                if(bundle0 != null) {
                    s = bundle0.getString("selected_mode");
                }
                return s == null ? "energy_mode_unknown" : s;
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return "energy_mode_not_supported";
    }

    public static final boolean b(Context context0) {
        ibuq.f(context0, "context");
        String s = bwiy.a(context0);
        return !ibuq.m(s, "energy_mode_not_supported") && !ibuq.m(s, "energy_mode_unknown");
    }

    public static final boolean c(Context context0) {
        ibuq.f(context0, "context");
        return ibuq.m(bwiy.a(context0), "high_energy_use");
    }
}

