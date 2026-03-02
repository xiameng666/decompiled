import j..util.Objects;
import j..util.function.Function.-CC;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.function.Function;

public final class dqme implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ftji ftji0 = (ftji)object0;
        String s = ftji0.c;
        hkuh hkuh0 = dqjj.H(ftji0);
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(s), Objects.requireNonNull(hkuh0));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

