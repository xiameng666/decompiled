import j..util.function.Function.-CC;
import java.util.Locale;
import java.util.function.Function;

public final class eocu implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return String.format(Locale.getDefault(), "0x%x", ((long)((hgun)object0).c));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

