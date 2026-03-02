import j..util.function.Function.-CC;
import java.util.ArrayList;
import java.util.function.Function;

public final class ghak implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ghab ghab0 = (ghab)object0;
        return new ArrayList();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

