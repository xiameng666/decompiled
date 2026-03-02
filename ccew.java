import java.util.concurrent.TimeUnit;

public final class ccew implements gfsi {
    public final long a;
    public final String b;

    public ccew(long v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fnaq fnaq0 = (fnaq)object0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fnaq.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfwn.a).v_newBuilder();
        long v = TimeUnit.MILLISECONDS.toSeconds(this.a);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hfwn)hftp1.b_message).b = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        String s = this.b;
        fnaq fnaq1 = (fnaq)hftp0.b_message;
        hfwn hfwn0 = (hfwn)hftp1.N_build();
        hfwn0.getClass();
        fnaq1.c = hfwn0;
        fnaq1.b |= 1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fnaq)hftp0.b_message).d = gfta.b(s);
        return (fnaq)hftp0.N_build();
    }
}

