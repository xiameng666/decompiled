import j..util.function.Function.-CC;
import java.util.function.Function;

public final class eusn implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((hkrk)object0).b == 4 ? ((hkrb)((hkrk)object0).c) : hkrb.a;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

