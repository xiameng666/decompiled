import j..util.function.Function.-CC;
import java.util.function.Function;

public final class awat implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        awcb awcb0 = ((awce)object0).h;
        if(awcb0 == null) {
            awcb0 = awcb.a;
        }
        return awcb0.b;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

