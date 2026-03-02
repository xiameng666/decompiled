import j..time.Instant;
import java.util.List;

public final class cqiy implements gfsi {
    public final List a;

    public cqiy(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((elhq)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((elhq)object0))));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)elhp.a).v_newBuilder();
        hfwn hfwn0 = hfyg.b(Instant.now());
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        hfwn0.getClass();
        ((elhp)hftv0).c = hfwn0;
        ((elhp)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        elhp elhp0 = (elhp)hftp1.b_message;
        hfuo hfuo0 = elhp0.d;
        if(!hfuo0.c()) {
            elhp0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.a, elhp0.d);
        elhp elhp1 = (elhp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        elhq elhq0 = (elhq)hftp0.b_message;
        elhp1.getClass();
        elhq0.e = elhp1;
        elhq0.b |= 8;
        return (elhq)hftp0.N_build();
    }
}

