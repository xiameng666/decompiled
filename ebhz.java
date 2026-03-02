import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ebhz implements Function {
    public final gtxl a;

    public ebhz(gtxl gtxl0) {
        this.a = gtxl0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gtxo gtxo0 = (gtxo)((ProtoLiteBuilder)object0).b_message;
        this.a.getClass();
        gtxo0.d = this.a;
        gtxo0.c = 3;
        return (ProtoLiteBuilder)object0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

