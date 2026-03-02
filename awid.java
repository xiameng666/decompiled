import com.google.android.gms.common.Feature;

public final class awid implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)xdc.a).v_newBuilder();
        String s = ((Feature)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        xdc xdc0 = (xdc)hftp0.b_message;
        s.getClass();
        xdc0.b |= 1;
        xdc0.c = s;
        long v = ((Feature)object0).a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        xdc xdc1 = (xdc)hftp0.b_message;
        xdc1.b |= 2;
        xdc1.d = v;
        return (xdc)hftp0.N_build();
    }
}

