import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import j..util.Objects;
import java.util.concurrent.ExecutionException;

public class bxma extends Exception {
    public final int a;
    public final PendingIntent b;
    private static final long serialVersionUID = 1L;

    public bxma(int v, String s, Throwable throwable0, PendingIntent pendingIntent0) {
        super(s, throwable0);
        this.a = v;
        this.b = pendingIntent0;
    }

    public final Status a() {
        return new Status(this.a, this.getMessage(), this.b);
    }

    public final bxlz b() {
        bxlz bxlz0 = new bxlz(this.a, this.getMessage(), this.getCause(), this.b);
        bxlz0.setStackTrace(this.getStackTrace());
        return bxlz0;
    }

    public static bxma c(acse acse0) {
        bxly bxly0 = new bxly();
        bxly0.a = aztk.e(acse0);
        bxly0.b = "Authentication failure.";
        bxly0.c = acse0;
        return bxly0.a();
    }

    public static bxma d(aztb aztb0) {
        bxly bxly0 = new bxly();
        bxly0.a = aztb0.a.i;
        bxly0.b = aztb0.a.j;
        bxly0.d = aztb0.a.k;
        return bxly0.a();
    }

    public static bxma e(int v) {
        bxly bxly0 = new bxly();
        bxly0.a = v;
        return bxly0.a();
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && this.getClass() == object0.getClass() && Objects.equals(this.getMessage(), ((bxma)object0).getMessage()) && Objects.equals(this.getCause(), ((bxma)object0).getCause()) && this.a == ((bxma)object0).a && Objects.equals(this.b, ((bxma)object0).b);
    }

    public static bxma f(int v, String s) {
        bxly bxly0 = new bxly();
        bxly0.a = v;
        bxly0.b = s;
        return bxly0.a();
    }

    public static bxma g(int v, Throwable throwable0) {
        bxly bxly0 = new bxly();
        bxly0.a = v;
        bxly0.b = throwable0 == null ? null : bxma.j(throwable0);
        bxly0.c = throwable0;
        return bxly0.a();
    }

    public static bxma h(int v, String s, Object[] arr_object) {
        return bxma.f(v, String.format(s, arr_object));
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.getMessage(), this.getCause(), ((int)this.a), this.b});
    }

    public static bxma i(Throwable throwable0) {
        if((throwable0 instanceof bxma)) {
            return (bxma)throwable0;
        }
        if((throwable0 instanceof aztb)) {
            return bxma.d(((aztb)throwable0));
        }
        if(!(throwable0 instanceof gmdd) && !(throwable0 instanceof ExecutionException)) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.b = "Unknown error.";
            bxly0.c = throwable0;
            return bxly0.a();
        }
        return bxma.i(throwable0.getCause());
    }

    public static String j(Throwable throwable0) {
        String s = throwable0.getMessage();
        Class class0 = throwable0.getClass();
        String s1 = (String)MoreObjects.firstNonNull(class0.getCanonicalName(), class0.getName());
        return s == null ? s1 : String.format("%s: %s", s1, s);
    }

    public static String k(int v, String s) {
        return s == null ? String.format("[%s]", v) : String.format("[%s] %s", v, s);
    }
}

