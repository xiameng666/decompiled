import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fepu implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbc.a).v_newBuilder();
        int v = ((ferh)object0).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((ffbc)hftv0).b |= 4;
        ((ffbc)hftv0).e = v;
        String s = ((ferh)object0).a;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbc ffbc0 = (ffbc)hftp0.b_message;
        ffbc0.b |= 2;
        ffbc0.d = s;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fexh.a).v_newBuilder();
        String s1 = ((ferh)object0).c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fexh fexh0 = (fexh)hftp1.b_message;
        fexh0.b |= 1;
        fexh0.c = s1;
        ByteString hfsf0 = ByteString.B(((ferh)object0).d);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fexh fexh1 = (fexh)hftp1.b_message;
        fexh1.b |= 2;
        fexh1.d = hfsf0;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbc ffbc1 = (ffbc)hftp0.b_message;
        fexh fexh2 = (fexh)hftp1.N_build();
        fexh2.getClass();
        ffbc1.c = fexh2;
        ffbc1.b |= 1;
        return (ffbc)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

