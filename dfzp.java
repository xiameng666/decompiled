import j..util.function.Function.-CC;
import java.math.BigDecimal;
import java.util.function.Function;

public final class dfzp implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        dfzs dfzs0 = (dfzs)object0;
        return BigDecimal.valueOf(dfzs0.b + dfzs0.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

