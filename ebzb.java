import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ebzb implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        dylc dylc0 = ((dylf)object0).d;
        if(dylc0 == null) {
            dylc0 = dylc.a;
        }
        return dypl.h((dyna.b(dylc0.c) == null ? dyna.k : dyna.b(dylc0.c)));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

