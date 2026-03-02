import j..util.function.Function.-CC;
import java.util.Map.Entry;
import java.util.function.Function;

public final class apbd implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        String s = ((String)((Map.Entry)object0).getKey()).substring(36);
        return new String(ghjc.e.q(s));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

