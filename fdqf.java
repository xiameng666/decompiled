import j..util.function.Function.-CC;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.function.Function;

public final class fdqf implements Function {
    public final Comparator a;

    public fdqf(Comparator comparator0) {
        this.a = comparator0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        fdyo fdyo0 = (fdyo)object0;
        return new TreeMap(this.a);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

