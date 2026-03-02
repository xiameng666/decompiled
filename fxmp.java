import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager.LayoutParams;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public final class fxmp {
    public static final int a;
    private static final ggfp b;

    static {
        fxmp.b = ggfp.N("US", "UK", "GB", "MM", "LR");
        fxmp.a = 0x280000;
    }

    public static double a(double f) {
        return f * 0.621371;
    }

    public static EAlertUxArgs b(Bundle bundle0) {
        return bundle0 == null || bundle0.get("EALERT_TAKE_ACTION_ARGS") == null ? null : ((EAlertUxArgs)bundle0.get("EALERT_TAKE_ACTION_ARGS"));
    }

    public static String c(double f, Locale locale0) {
        return fxmp.g(locale0) ? String.format(locale0, "%.1f miles", ((double)(f * 0.621371))) : String.format(locale0, "%.1f km", f);
    }

    public static void d(Intent intent0, Supplier supplier0) {
        Set set0 = (Set)supplier0.get();
        if(!set0.isEmpty()) {
            intent0.putStringArrayListExtra("TALK_TO_NODE_IDS_ARG", new ArrayList(set0));
        }
    }

    public static void e(xni xni0) {
        WindowManager.LayoutParams windowManager$LayoutParams0 = xni0.getWindow().getAttributes();
        windowManager$LayoutParams0.layoutInDisplayCutoutMode = 3;
        xni0.getWindow().setAttributes(windowManager$LayoutParams0);
    }

    public static void f(Context context0, List list0, String s, byte[] arr_b, bboh bboh0) {
        for(Object object0: list0) {
            String s1 = (String)object0;
            try {
                ((ggtj)bboh0.h()).R("talking to node %s with path %s", s1, s);
                evrg.n(fcfo.d(context0).h(s1, s, arr_b));
            }
            catch(ExecutionException | InterruptedException exception0) {
                a.e(bboh0.i(), "failed to talk to node %s", s1, exception0);
            }
        }
    }

    public static boolean g(Locale locale0) {
        String s = locale0.getCountry();
        return fxmp.b.contains(s);
    }

    public static Intent h(EAlertUxArgs eAlertUxArgs0) {
        if(eAlertUxArgs0.k == 7) {
            return new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/android?p=android_earthquakealerts"));
        }
        Intent intent0 = new Intent("com.google.android.location.ealert.ux.EALERT_SAFETY_INFO");
        intent0.putExtra("EALERT_UX_EXTRA", "EALERT_SAFETY_RT");
        intent0.putExtra("EALERT_TAKE_ACTION_ARGS", eAlertUxArgs0);
        intent0.setFlags(0x10008000);
        intent0.setClassName("com.google.android.gms", "com.google.android.location.ealert.ux.EAlertSafetyInfoActivity");
        return intent0;
    }
}

