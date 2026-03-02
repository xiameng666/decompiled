import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekbp implements Function {
    public final ekbv a;

    public ekbp(ekbv ekbv0) {
        this.a = ekbv0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = (String)object0;
        return new ekbw(this.a.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

