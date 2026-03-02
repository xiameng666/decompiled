import j..util.function.Function.-CC;
import java.util.function.Function;

class bhsn implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gejb.a).v_newBuilder();
        if((((geip)object0).b & 1) != 0) {
            String s = ((geip)object0).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gejb gejb0 = (gejb)hftp0.b_message;
            s.getClass();
            gejb0.b |= 1;
            gejb0.c = s;
        }
        if((((geip)object0).b & 2) != 0) {
            String s1 = ((geip)object0).d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gejb gejb1 = (gejb)hftp0.b_message;
            s1.getClass();
            gejb1.b |= 2;
            gejb1.d = s1;
        }
        for(Object object1: ((geip)object0).e) {
            geju geju0 = (geju)bhsv.a.apply(((geiz)object1));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gejb gejb2 = (gejb)hftp0.b_message;
            geju0.getClass();
            hfuo hfuo0 = gejb2.e;
            if(!hfuo0.c()) {
                gejb2.e = ProtoLiteMessage.E(hfuo0);
            }
            gejb2.e.add(geju0);
        }
        return (gejb)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

