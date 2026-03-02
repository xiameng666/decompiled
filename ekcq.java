import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekcq implements Function {
    public final ProtoLiteBuilder a;

    public ekcq(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        long v = (long)(((Long)object0));
        Object object1 = this.a;
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        ((gssj)object1.b_message).b = v;
        return object1;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

