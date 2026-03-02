import j..util.Objects;
import java.util.List;

public final class dxyd implements gfsi {
    public final List a;

    public dxyd(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfuo hfuo0 = ((fsym)object0).b;
        fsyl fsyl0 = (fsyl)((ProtoLiteMessage)fsym.a).v_newBuilder();
        for(Object object1: this.a) {
            long v = ((gtkg)object1).f;
            fsyk fsyk0 = (fsyk)Objects.requireNonNull(((fsyk)gggq.l(hfuo0, new dxyc(v), dxye.f(v))));
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fsyk0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)fsyk0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fsyk fsyk1 = (fsyk)hftp0.b_message;
            ((gtkg)object1).getClass();
            fsyk1.e = (gtkg)object1;
            fsyk1.b |= 1;
            fsyl0.k(((fsyk)hftp0.N_build()));
        }
        return (fsym)((ProtoLiteBuilder)fsyl0).N_build();
    }
}

