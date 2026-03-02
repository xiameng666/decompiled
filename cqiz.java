import j..util.function.Function.-CC;
import java.util.function.Function;

public final class cqiz implements Function {
    public final elhq a;

    public cqiz(elhq elhq0) {
        this.a = elhq0;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.a).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.a));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((elhq)hftp0.b_message).d = null;
        ((elhq)hftp0.b_message).b &= -5;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        elhq elhq0 = (elhq)hftp0.b_message;
        ((elhs)object0).getClass();
        elhq0.c = (elhs)object0;
        elhq0.b |= 2;
        return (elhq)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

