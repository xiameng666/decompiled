import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcjh implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        int v = 1;
        if((((fezg)object0).b & 1) != 0) {
            baun baun0 = fcji.a;
            int v1 = fexp.b(((fezg)object0).c);
            if(v1 == 0) {
                v1 = 1;
            }
            baun0.m("enable_backup error: %s", new Object[]{fexp.a(v1)});
            int v2 = fexp.b(((fezg)object0).c);
            if(v2 != 0) {
                v = v2;
            }
            return evrg.c(new fcjj(v));
        }
        return evrg.d(null);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

