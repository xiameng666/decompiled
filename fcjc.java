import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcjc implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if((((fezl)object0).b & 2) != 0) {
            baun baun0 = fcji.a;
            int v = fexp.b(((fezl)object0).d);
            int v1 = 1;
            if(v == 0) {
                v = 1;
            }
            baun0.m("fetch_backup_size_and_time_stats error: %s", new Object[]{fexp.a(v)});
            int v2 = fexp.b(((fezl)object0).d);
            if(v2 != 0) {
                v1 = v2;
            }
            return evrg.c(new fcjj(v1));
        }
        fexq fexq0 = ((fezl)object0).c;
        if(fexq0 == null) {
            fexq0 = fexq.a;
        }
        return evrg.d(fexq0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

