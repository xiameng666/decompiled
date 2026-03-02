import j..util.function.Function.-CC;
import java.util.function.Function;

public final class duex implements Function {
    public final dufr a;

    public duex(dufr dufr0) {
        this.a = dufr0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = (ProtoLiteBuilder)object0;
        dtsy.d(this.a.an, this.a.ao, ((ProtoLiteBuilder)object1));
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

