import j..util.function.Function.-CC;
import java.util.function.Function;

public final class bjpm implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((bjwz)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((bjwz)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bjwz bjwz0 = (bjwz)hftp0.b_message;
        bjwz0.b &= -65;
        bjwz0.i = 0L;
        return (bjwz)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

