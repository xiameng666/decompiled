import j..util.function.Function.-CC;
import java.util.List;
import java.util.function.Function;

public final class fbrs implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return (String)((List)object0).get(1);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

