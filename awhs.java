import j..util.function.Function.-CC;
import java.util.function.Function;

public final class awhs implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        xez xez0 = (xez)object0;
        return new wzp(xez0.d, xez0.e);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

