import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fopa implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((iddc)object0).c == 3 ? new fopc(((iddc)object0), fopd.b(((iddk)((iddc)object0).d))) : new fopc(((iddc)object0), fopd.b(iddk.a));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

