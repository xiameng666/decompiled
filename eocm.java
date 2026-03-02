import j..util.function.Function.-CC;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.function.Function;

public final class eocm implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Map.Entry map$Entry0 = (Map.Entry)object0;
        Object[] arr_object = {((Long)map$Entry0.getKey()), Math.round(((float)(((Float)map$Entry0.getValue()))) * 100.0f)};
        return String.format(Locale.US, "(%d, %d%%)", arr_object);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

