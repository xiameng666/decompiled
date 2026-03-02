import j..util.function.Function.-CC;
import java.util.function.Function;

final class bhsp implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geju.a).v_newBuilder();
        if((((geiz)object0).b & 1) != 0) {
            String s = ((geiz)object0).c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geju geju0 = (geju)hftp0.b_message;
            s.getClass();
            geju0.b |= 1;
            geju0.c = s;
        }
        if((((geiz)object0).b & 2) != 0) {
            String s1 = ((geiz)object0).d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geju geju1 = (geju)hftp0.b_message;
            s1.getClass();
            geju1.b |= 2;
            geju1.d = s1;
        }
        if((((geiz)object0).b & 4) != 0) {
            String s2 = ((geiz)object0).e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geju geju2 = (geju)hftp0.b_message;
            s2.getClass();
            geju2.b |= 4;
            geju2.e = s2;
        }
        if((((geiz)object0).b & 8) != 0) {
            int v = ((geiz)object0).f;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geju geju3 = (geju)hftp0.b_message;
            geju3.b |= 8;
            geju3.f = v;
        }
        if((((geiz)object0).b & 16) != 0) {
            boolean z = ((geiz)object0).g;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geju geju4 = (geju)hftp0.b_message;
            geju4.b |= 16;
            geju4.g = z;
        }
        return (geju)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

