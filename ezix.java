import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ezix implements Function {
    public final ezjf a;

    public ezix(ezjf ezjf0) {
        this.a = ezjf0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return this.a.d.o(((Integer)object0).intValue()).r();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

