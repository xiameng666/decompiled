import java.util.List;
import java.util.concurrent.ExecutionException;

public final class bxme implements gfsi {
    public static final bxmg a;
    public static final bxmg b;
    private static final bxmg c;
    private final int d;
    private final gged_interceptors e;

    static {
        bxme.a = new bxlw(acse.class).a(new bxmb());
        bxme.b = new bxlw(aztb.class).a(new bxmc());
        bxme.c = new bxlw(bxma.class).a(new bxmd());
    }

    public bxme(int v, List list0) {
        this.d = v;
        ggdy ggdy0 = new ggdy();
        ggdy0.k(list0);
        ggdy0.i(bxme.c);
        this.e = ggdy0.h();
    }

    public final bxma a(Throwable throwable0) {
        Throwable throwable1 = bxme.c(throwable0);
        bxmf bxmf0 = bxmg.b(throwable1, this.e);
        if(bxmf0.a) {
            return (bxma)bxmf0.b;
        }
        bxly bxly0 = new bxly();
        bxly0.a = this.d;
        bxly0.b = "UNKNOWN EXCEPTION - " + bxma.j(throwable1);
        bxly0.c = throwable1;
        return bxly0.a();
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return this.a(((Throwable)object0));
    }

    public static Throwable b(Throwable throwable0) {
        Throwable throwable1 = bxme.c(throwable0);
        return (throwable1 instanceof bxma) && !(throwable1 instanceof bxlz) ? ((bxma)throwable1).b() : throwable1;
    }

    public static Throwable c(Throwable throwable0) {
        if((throwable0 instanceof ExecutionException) || (throwable0 instanceof gmdd)) {
            Throwable throwable1 = throwable0.getCause();
            return throwable1 == null ? throwable0 : bxme.c(throwable1);
        }
        return throwable0;
    }
}

