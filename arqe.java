import j..util.Optional;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class arqe implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        if(((araz)object0).c == 4) {
            fpxo fpxo0 = (fpxo)((araz)object0).d;
            if(!fpxo0.f.isEmpty()) {
                arql.a.m("Skipping backup: %s for reason: %s", new Object[]{fpxo0.c, fpxo0.f});
                return Optional.empty();
            }
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)asbs.a).v_newBuilder();
            String s = fpxo0.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((asbs)hftv0).b |= 1;
            ((asbs)hftv0).c = s;
            long v = fpxo0.e;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            asbs asbs0 = (asbs)hftp0.b_message;
            asbs0.b |= 2;
            asbs0.d = v;
            asbs asbs1 = (asbs)hftp0.N_build();
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)asby.a).v_newBuilder();
            String s1 = ((araz)object0).e;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            s1.getClass();
            ((asby)hftv1).b |= 1;
            ((asby)hftv1).e = s1;
            long v1 = fpxo0.d;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp1.b_message;
            ((asby)hftv2).b |= 2;
            ((asby)hftv2).f = v1;
            if(!hftv2.isImmutable()) {
                hftp1.ensureMutable();
            }
            asby asby0 = (asby)hftp1.b_message;
            asbs1.getClass();
            asby0.d = asbs1;
            asby0.c = 100;
            return Optional.of(((asby)hftp1.N_build()));
        }
        arql.a.m("Skipping backup: %s, because it doesn\'t have item metadata", new Object[]{((araz)object0).e});
        return Optional.empty();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

