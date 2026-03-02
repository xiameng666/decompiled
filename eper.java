import android.content.Context;
import com.google.android.gms.usagereporting.SafetyOptions;

public final class eper {
    public static final int a;

    static {
        ggfp.K(Integer.valueOf(1), Integer.valueOf(2));
    }

    public static evql a(Context context0) {
        return faih.a(context0).co();
    }

    public static evql b(Context context0, int v) {
        return faih.a(context0).cu(new SafetyOptions(true, false, v));
    }

    public static boolean c(epet epet0) {
        return epet0.d ? true : epet0.a && epet0.b && hzfr.g();
    }

    public static boolean d(epet epet0) {
        if(!epet0.a) {
            return false;
        }
        if(epet0.e) {
            return true;
        }
        return !epet0.c || !epet0.f && !epet0.h ? epet0.g : true;
    }
}

