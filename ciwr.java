import j..util.Collection.-EL;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ciwr implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hfki hfki0 = (hfki)object0;
        ggfn ggfn0 = new ggfn();
        ggfn0.k(hfki0.a);
        ggfn0.k(((Iterable)Collection.-EL.stream(hfki0.b).map(new hfkf()).flatMap(new hfkg()).collect(ggaf.b)));
        return Collection.-EL.stream(ggfn0.h());
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

