import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ankf implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hfwn hfwn0 = hfyg.b(Instant.now());
        int v = ((anmg)object0).d;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((anmg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((anmg)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((anmg)hftv0).d = v + 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        anmg anmg0 = (anmg)hftp0.b_message;
        hfwn0.getClass();
        anmg0.e = hfwn0;
        anmg0.b |= 2;
        return (anmg)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

