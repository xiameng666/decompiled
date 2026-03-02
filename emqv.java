import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class emqv implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        elyf elyf0 = (elyf)object0;
        emrg emrg0 = new emrg();
        emrg0.c(hfyn.a);
        emrg0.b(hfyn.a);
        emrg0.d(Instant.MIN);
        return emrg0.a();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

