import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcjd implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if((((fezn)object0).b & 2) != 0) {
            baun baun0 = fcji.a;
            int v = fexp.b(((fezn)object0).d);
            int v1 = 1;
            if(v == 0) {
                v = 1;
            }
            baun0.m("fetch_storage_quota error: %s", new Object[]{fexp.a(v)});
            int v2 = fexp.b(((fezn)object0).d);
            if(v2 != 0) {
                v1 = v2;
            }
            return evrg.c(new fcjj(v1));
        }
        fexu fexu0 = ((fezn)object0).c;
        if(fexu0 == null) {
            fexu0 = fexu.a;
        }
        return evrg.d(fexu0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

