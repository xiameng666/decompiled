import j..util.function.Function.-CC;
import java.util.function.Function;

public final class beqi implements Function {
    public final boolean a;

    public beqi(boolean z) {
        this.a = z;
    }

    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        hept hept0 = ((heqb)((ProtoLiteBuilder)object0).b_message).s;
        if(hept0 == null) {
            hept0 = hept.a;
        }
        boolean z = this.a;
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hept0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)hept0));
        hept hept1 = (hept)hftp0.b_message;
        if((hept1.b & 1) != 0) {
            heps heps0 = hept1.c == null ? heps.a : hept1.c;
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)heps0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)heps0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            heps heps1 = (heps)hftp1.b_message;
            heps1.b |= 2;
            heps1.d = z;
            heps heps2 = (heps)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hept hept2 = (hept)hftp0.b_message;
            heps2.getClass();
            hept2.c = heps2;
            hept2.b |= 1;
        }
        hept hept3 = (hept)hftp0.b_message;
        if((hept3.b & 8) != 0) {
            heps heps3 = hept3.f == null ? heps.a : hept3.f;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)heps3).jf(5, null);
            hftp2.X(((ProtoLiteMessage)heps3));
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            heps heps4 = (heps)hftp2.b_message;
            heps4.b |= 2;
            heps4.d = z;
            heps heps5 = (heps)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hept hept4 = (hept)hftp0.b_message;
            heps5.getClass();
            hept4.f = heps5;
            hept4.b |= 8;
        }
        hept hept5 = (hept)hftp0.N_build();
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        heqb heqb0 = (heqb)((ProtoLiteBuilder)object0).b_message;
        hept5.getClass();
        heqb0.s = hept5;
        heqb0.b |= 0x40000;
        return (heqb)((ProtoLiteBuilder)object0).N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

