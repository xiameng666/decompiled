import j..util.function.Function.-CC;
import java.util.function.Function;

public final class boae implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gtaa gtaa0 = ((gszo)object0).d;
        if(gtaa0 == null) {
            gtaa0 = gtaa.a;
        }
        Object object1 = gszv.b(gtaa0.g);
        return object1 == null ? gszv.h : object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

