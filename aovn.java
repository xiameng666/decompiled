import j..util.function.Function.-CC;
import java.util.Map.Entry;
import java.util.function.Function;

public final class aovn implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return aoan.d(((amnm)((Map.Entry)object0).getKey()).a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

