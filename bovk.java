import java.util.Set;

public final class bovk implements gfsi {
    public final bovs a;
    public final Set b;

    public bovk(bovs bovs0, Set set0) {
        this.a = bovs0;
        this.b = set0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        hfug hfug0 = fqzv.a;
        ggfp ggfp0 = ggfp.G(new hfuh(((fqzv)object0).d, hfug0));
        Set set0 = this.b;
        if(ggfp0.equals(set0)) {
            return (fqzv)object0;
        }
        boolean z = bovs.j(new hfuh(((fqzv)object0).d, hfug0));
        boolean z1 = bovs.j(set0);
        boolean z2 = fray.b(z1 && !z, new bovm());
        this.a.i(z1, z2, false);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fqzv)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fqzv)object0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((fqzv)hftp0.b_message).d = hfty.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fqzv fqzv0 = (fqzv)hftp0.b_message;
        fqzv0.b();
        for(Object object1: set0) {
            fqzv0.d.i(((gszv)object1).a());
        }
        return (fqzv)hftp0.N_build();
    }
}

