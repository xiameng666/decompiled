import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fooy implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((iddc)object0).c == 1 ? new fopc(((iddc)object0), fopb.b(((idbj)((iddc)object0).d))) : new fopc(((iddc)object0), fopb.b(idbj.a));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

