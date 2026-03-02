import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ener implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hfwn hfwn0 = ((gzrd)object0).c;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        return hfyg.d(hfwn0);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

