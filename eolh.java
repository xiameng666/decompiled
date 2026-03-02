import j..util.function.Function.-CC;
import java.util.List;
import java.util.function.Function;

public final class eolh implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = ((List)object0).get(1);
        return object1 == null ? "" : ((String)object1);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

