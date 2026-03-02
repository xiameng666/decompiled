import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekcy implements Function {
    public final ekde a;

    public ekcy(ekde ekde0) {
        this.a = ekde0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = (String)object0;
        return new ekdf(this.a.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

