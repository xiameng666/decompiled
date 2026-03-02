import j..util.function.Function.-CC;
import java.util.function.Function;

public final class amvl implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        return ((heoq)object0).b == 2 ? ((long)((heop)((heoq)object0).c).b) : ((long)heop.a.b);
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

