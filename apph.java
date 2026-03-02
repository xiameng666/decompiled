import j..util.function.Function.-CC;
import java.util.function.Function;

public final class apph implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return Boolean.valueOf(((hgib)object0).c.equals("RISK_BASED"));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

