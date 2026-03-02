import j..util.function.Function.-CC;
import java.util.Map.Entry;
import java.util.function.Function;

public final class feph implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbc.a).v_newBuilder();
        String s = ((feoy)((Map.Entry)object0).getKey()).b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbc ffbc0 = (ffbc)hftp0.b_message;
        ffbc0.b |= 2;
        ffbc0.d = s;
        int v = (int)(((Integer)((Map.Entry)object0).getValue()));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbc ffbc1 = (ffbc)hftp0.b_message;
        ffbc1.b |= 4;
        ffbc1.e = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fexh.a).v_newBuilder();
        String s1 = ((feoy)((Map.Entry)object0).getKey()).a.b;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fexh fexh0 = (fexh)hftp1.b_message;
        s1.getClass();
        fexh0.b |= 1;
        fexh0.c = s1;
        ByteString hfsf0 = ByteString.B(((feoy)((Map.Entry)object0).getKey()).a.d);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        fexh fexh1 = (fexh)hftp1.b_message;
        fexh1.b |= 2;
        fexh1.d = hfsf0;
        fexh fexh2 = (fexh)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffbc ffbc2 = (ffbc)hftp0.b_message;
        fexh2.getClass();
        ffbc2.c = fexh2;
        ffbc2.b |= 1;
        return (ffbc)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

