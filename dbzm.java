import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dbzm implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        switch(((int)(((Integer)object0)))) {
            case 1: {
                return dbvm.b;
            }
            case 2: {
                return dbvm.c;
            }
            case 3: {
                return dbvm.d;
            }
            case 4: {
                return dbvm.e;
            }
            case 5: {
                return dbvm.f;
            }
            default: {
                return dbvm.a;
            }
        }
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

