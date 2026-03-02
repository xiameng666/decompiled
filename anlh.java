import j..time.Instant;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class anlh implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        anjp anjp0 = ((anmg)object0).c;
        if(anjp0 == null) {
            anjp0 = anjp.a;
        }
        hfwn hfwn0 = hfyg.b(Instant.now());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)anjo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        anjp0.getClass();
        ((anjo)hftv0).c = anjp0;
        ((anjo)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        anjo anjo0 = (anjo)hftp0.b_message;
        hfwn0.getClass();
        anjo0.d = hfwn0;
        anjo0.b |= 2;
        return (anjo)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

