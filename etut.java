import j..util.function.Function.-CC;
import java.util.function.Function;

public final class etut implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((etnc)((ProtoLiteBuilder)object0).b_message).d = etnc.a.d;
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((etnc)((ProtoLiteBuilder)object0).b_message).b().clear();
        return (ProtoLiteBuilder)object0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

