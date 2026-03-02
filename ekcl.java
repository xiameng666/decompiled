import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekcl implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        gdmq gdmq0 = ((gssk)object0).c;
        if(gdmq0 == null) {
            gdmq0 = gdmq.a;
        }
        Object object1 = ((gdlq)(gdmq0.d == null ? gdmx.a : gdmq0.d).g.get(0)).e;
        return object1 == null ? hfwn.a : object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

