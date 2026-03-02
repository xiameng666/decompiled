import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekdw implements Function {
    public final ekdx a;

    public ekdw(ekdx ekdx0) {
        this.a = ekdx0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = (String)object0;
        return new ekdy(this.a.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

