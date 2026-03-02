import j..util.function.Function.-CC;
import java.util.function.Function;

public final class enmi implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hgun hgun0 = ((hguu)object0).c;
        if(hgun0 == null) {
            hgun0 = hgun.a;
        }
        return (long)hgun0.c;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

