import j..util.function.Function.-CC;
import java.util.function.Function;

public final class apes implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hheh hheh0 = ((hhee)object0).c;
        if(hheh0 == null) {
            hheh0 = hheh.a;
        }
        Object object1 = hheh0.e;
        return object1 == null ? hfwn.a : object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

