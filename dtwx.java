import j..util.function.Function.-CC;
import java.util.function.Function;

public final class dtwx implements Function {
    public final ibts a;

    public dtwx(ibts ibts0) {
        this.a = ibts0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return this.a.a(object0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

