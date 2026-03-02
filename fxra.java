import android.content.Context;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.ArrayList;
import java.util.List;

public final class fxra {
    public static fxqz a;
    private static final InactiveReason b;

    static {
        fxra.b = new InactiveReason(12, "LocationDisabled");
    }

    public static int a(List list0) {
        int[] arr_v = InactiveReason.a;
        for(int v = 0; v < 9; ++v) {
            int v1 = arr_v[v];
            if(InactiveReason.a(list0, v1)) {
                return v1;
            }
        }
        fxqw.m(36, "Unknown inactive reason: " + list0);
        return 0;
    }

    public static ayvc b() {
        return fxra.p() ? new ayvc(fxra.a.a) : null;
    }

    public static ayve c(String s) {
        if(!fxra.p()) {
            return null;
        }
        try {
            return fxra.a.a.g(s);
        }
        catch(RuntimeException unused_ex) {
            return null;
        }
    }

    public static List d(AccountConfig accountConfig0) {
        List list0 = accountConfig0.d();
        if(!accountConfig0.m.d) {
            List list1 = new ArrayList(list0);
            list1.add(fxra.b);
            return list1;
        }
        return list0;
    }

    public static void e(Context context0) {
        synchronized(fxra.class) {
            if(fxra.a == null) {
                fxra.a = new fxqz(context0);
            }
        }
    }

    public static void f(String s, boolean z) {
        if(!fxra.p()) {
            return;
        }
        try {
            fxra.a.a.c(s).a((z ? 1L : 0L), 1L, ayvf.b);
        }
        catch(RuntimeException unused_ex) {
        }
        fxra.a.a();
    }

    public static void g(String s) {
        fxra.h(s, 1L);
    }

    public static void h(String s, long v) {
        if(fxra.p() && v != 0L) {
            try {
                fxra.a.a.d(s).a(0L, v, ayvf.b);
            }
            catch(RuntimeException unused_ex) {
            }
            fxra.a.a();
        }
    }

    public static void i(String s, ReportingConfig reportingConfig0) {
        try {
            fxra.h(s, ((long)reportingConfig0.c().size()));
        }
        catch(RuntimeException unused_ex) {
        }
    }

    public static void j(int v) {
        fxra.k("UlrError", v);
    }

    public static void k(String s, int v) {
        if(!fxra.p()) {
            return;
        }
        try {
            fxra.a.a.e(s).a(((long)v), 1L, ayvf.b);
        }
        catch(RuntimeException unused_ex) {
        }
        fxra.a.a();
    }

    public static void l(String s, long v) {
        if(!fxra.p()) {
            return;
        }
        try {
            ayvb ayvb0 = fxra.a.a.f(s);
            ayvb0.a(ayvb0.g.a(v), 1L, ayvf.b);
        }
        catch(RuntimeException unused_ex) {
        }
        fxra.a.a();
    }

    public static void m(String s, fxsf fxsf0) {
        if(s.isEmpty()) {
            return;
        }
        fxra.k(s, fxsf0.h);
    }

    public static void n(boolean z) {
        if(!fxra.q()) {
            return;
        }
        fxra.a.c(z);
    }

    public static void o() {
        if(fxra.p()) {
            try {
                fxra.a.f();
            }
            catch(RuntimeException unused_ex) {
            }
        }
    }

    public static boolean p() {
        return fxra.a != null && hzek.a.i().ag();
    }

    public static boolean q() {
        return fxra.a != null && hzek.a.i().ai();
    }

    public static void r(int v, int v1) {
        if(!fxra.p()) {
            return;
        }
        try {
            ayva ayva0 = fxra.a.a.e("UlrUploadStatus");
            for(int v2 = 0; v2 < v1; ++v2) {
                ayva0.a(((long)v), 1L, ayvf.b);
            }
        }
        catch(RuntimeException unused_ex) {
        }
        fxra.a.a();
    }
}

