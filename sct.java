import android.app.Application;
import android.util.Log;
import java.util.List;

public final class sct {
    public static final int a;
    private static final String b;

    static {
        String s = Application.getProcessName();
        String s1 = null;
        if(s != null) {
            String s2 = (String)ibpo.T(ibzk.T(s, new String[]{":"}, 0, 6));
            if(s2 != null) {
                List list0 = ibzk.T(s2, new String[]{"."}, 0, 6);
                if(list0.size() > 1) {
                    ibns ibns0 = new ibns(ibpo.aI(list0), ibpo.W(list0));
                    scs scs0 = new scs();
                    s1 = ibpo.aK(((List)ibns0.a), ".", null, "." + ((String)ibns0.b), scs0, 26);
                }
                else {
                    s1 = s2;
                }
            }
        }
        sct.b = s1;
    }

    public static final void a(String s, String s1) {
        Log.e("AndroidOnboarding", sct.c(s, s1));
    }

    public static final void b(String s, String s1, Throwable throwable0) {
        Log.e("AndroidOnboarding", sct.c(s, s1), throwable0);
    }

    public static final String c(String s, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s2 = sct.b;
        if(s2 != null) {
            s = a.V(s2, s, "[", "]");
        }
        stringBuilder0.append(s);
        stringBuilder0.append(": " + s1);
        return stringBuilder0.toString();
    }

    public static final void d(String s, String s1) {
        Log.i("AndroidOnboarding", sct.c(s, s1));
    }

    public static final void e(String s, String s1) {
        Log.w("AndroidOnboarding", sct.c(s, s1));
    }

    public static final void f(String s, String s1, Throwable throwable0) {
        ibuq.f(throwable0, "tr");
        Log.w("AndroidOnboarding", sct.c(s, s1), throwable0);
    }

    public static final void g(Throwable throwable0) {
        Log.w("AndroidOnboarding", "OTMServiceBinder", throwable0);
    }

    public static final void h(String s, String s1) {
        Log.wtf("AndroidOnboarding", sct.c(s, s1));
    }
}

