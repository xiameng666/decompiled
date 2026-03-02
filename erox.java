import java.util.List;

public final class erox implements gfsi {
    public final List a;

    public erox(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((eqol)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((eqol)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((eqol)hftp0.b_message).d = hfty.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eqol eqol0 = (eqol)hftp0.b_message;
        hfuf hfuf0 = eqol0.d;
        if(!hfuf0.c()) {
            eqol0.d = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(this.a, eqol0.d);
        return (eqol)hftp0.N_build();
    }
}

