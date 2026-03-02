import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fcjg implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if((((ffbo)object0).b & 2) != 0) {
            baun baun0 = fcji.a;
            int v = fexp.b(((ffbo)object0).d);
            int v1 = 1;
            if(v == 0) {
                v = 1;
            }
            baun0.m("refresh_backup_status error: %s", new Object[]{fexp.a(v)});
            int v2 = fexp.b(((ffbo)object0).d);
            if(v2 != 0) {
                v1 = v2;
            }
            return evrg.c(new fcjj(v1));
        }
        fext fext0 = ((ffbo)object0).c;
        if(fext0 == null) {
            fext0 = fext.a;
        }
        return evrg.d(fext0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

