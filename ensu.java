import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ensu implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        enys enys0 = ((enyp)object0).c == 1 ? ((enys)((enyp)object0).d) : enys.a;
        return hfyg.d((enys0.f == null ? hfwn.a : enys0.f));
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

