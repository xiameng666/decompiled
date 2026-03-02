import j..util.function.Function.-CC;
import java.util.function.Function;

public final class etul implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((etnc)((ProtoLiteBuilder)object0).b_message).j = 0L;
        return (ProtoLiteBuilder)object0;
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

