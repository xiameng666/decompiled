import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekct implements Function {
    public final ProtoLiteBuilder a;

    public ekct(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Object object1 = this.a;
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        gssk gssk0 = (gssk)object1.b_message;
        ((gdmq)object0).getClass();
        gssk0.c = (gdmq)object0;
        gssk0.b |= 1;
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

