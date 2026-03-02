import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dlnl implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        switch(((dyna)object0).ordinal()) {
            case 1: {
                return grml.b;
            }
            case 2: {
                return grml.c;
            }
            case 3: {
                return grml.d;
            }
            case 4: {
                return grml.e;
            }
            case 5: {
                return grml.f;
            }
            case 6: {
                return grml.g;
            }
            case 7: {
                return grml.i;
            }
            case 8: {
                return grml.j;
            }
            case 9: {
                return grml.k;
            }
            default: {
                return grml.a;
            }
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

