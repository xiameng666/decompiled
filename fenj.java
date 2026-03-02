import java.util.concurrent.TimeUnit;

public final class fenj implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ffai)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ffai)object0))));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfwn.a).v_newBuilder();
        long v = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hfwn)hftp1.b_message).b = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ffai ffai0 = (ffai)hftp0.b_message;
        hfwn hfwn0 = (hfwn)hftp1.N_build();
        hfwn0.getClass();
        ffai0.c = hfwn0;
        ffai0.b |= 1;
        return (ffai)hftp0.N_build();
    }
}

