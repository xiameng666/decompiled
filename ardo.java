import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ardo implements Function {
    public final long a;
    public final asbo b;

    public ardo(long v, asbo asbo0) {
        this.a = v;
        this.b = asbo0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((asbw)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((asbw)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbw asbw0 = (asbw)hftp0.b_message;
        asbw0.b |= 1;
        asbw0.c = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        asbw asbw1 = (asbw)hftp0.b_message;
        this.b.getClass();
        asbw1.d = this.b;
        asbw1.b |= 4;
        return (asbw)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

