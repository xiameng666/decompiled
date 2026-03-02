import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class hfkf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hfkm hfkm0 = (hfkm)object0;
        ggfn ggfn0 = new ggfn();
        ggfn0.k(hfkm0.a);
        ggfn0.k(((Iterable)Collection.-EL.stream(hfkm0.b).map(new hfkj()).flatMap(new hfkk()).collect(ggaf.b)));
        return ggfn0.h();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

