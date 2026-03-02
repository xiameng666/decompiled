import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.pay.PayApiError;
import j..util.DesugarTimeZone;
import j..util.Objects;
import j..util.Optional;
import java.util.Calendar;
import java.util.Collection;

public final class ebza {
    public static long a(long v) {
        Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("Japan"));
        calendar0.setTimeInMillis(v);
        calendar0.add(5, 1);
        calendar0.set(11, 5);
        calendar0.set(12, 0);
        calendar0.set(13, 0);
        calendar0.set(14, 0);
        return calendar0.getTimeInMillis();
    }

    static cllp b(long v, long v1) {
        if(hwsd.a.E().by()) {
            clks clks0 = new clks();
            clks0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
            clks0.q("felica.emoney.periodic.sync");
            clks0.l(false);
            clks0.a = clkz.m;
            clks0.v(2);
            return clks0.a();
        }
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkq0.q("felica.emoney.periodic.sync");
        clkq0.g(2);
        clkq0.v(2);
        clkq0.e(v, v1, cllj.a);
        clkq0.x(0, 1);
        return clkq0.a();
    }

    public static PayApiError c(String s, Optional optional0) {
        PayApiError payApiError0 = new PayApiError();
        payApiError0.b = s;
        if(optional0.isPresent() && ((fsim)optional0.get()).a.i()) {
            Object object0 = ((fsim)optional0.get()).a.d();
            payApiError0.d = glwy.l(ftqn.a(dynd.class, ((hfub)object0)));
        }
        return payApiError0;
    }

    public static Optional d(Optional optional0) {
        return optional0.isPresent() ? ((fsim)optional0.get()).b.n() : Optional.empty();
    }

    public static Optional e(Throwable throwable0) {
        return ebza.d(ebza.f(throwable0));
    }

    public static Optional f(Throwable throwable0) {
        if((throwable0 instanceof fsim)) {
            return Optional.of(((fsim)throwable0));
        }
        Throwable throwable1 = throwable0.getCause();
        return (throwable1 instanceof fsim) ? Optional.of(((fsim)throwable1)) : Optional.empty();
    }

    public static Optional g(Throwable throwable0) {
        Optional optional0 = ebza.f(throwable0);
        return optional0.isPresent() ? ((fsim)optional0.get()).a.n() : Optional.empty();
    }

    public static void h(Context context0) {
        ebza.i(cljp.a(context0));
    }

    public static void i(cljp cljp0) {
        cljp0.f(ebza.b(hwsd.h(), hwsd.g()));
    }

    public static boolean j(Context context0, String s, Collection collection0) {
        try {
            ggch ggch0 = ggch.j(bbms.d(context0, s, "SHA-256")).l(new ebyy());
            Objects.requireNonNull(collection0);
            return ggch0.s(new ebyz(collection0));
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return false;
        }
    }

    public static boolean k(Context context0, String s) {
        return azqx.c(context0, s).b;
    }

    public static int l(eczd eczd0) {
        switch((dylu.a(eczd0.c) == 0 ? 1 : dylu.a(eczd0.c)) - 2) {
            case 1: {
                return 3;
            }
            case 2: {
                return 4;
            }
            default: {
                return 2;
            }
        }
    }
}

