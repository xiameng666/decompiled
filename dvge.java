import java.util.TimeZone;

public final class dvge implements jqv {
    public final dvgh a;
    public final String b;
    public final int c;
    public final ProtoLiteBuilder d;

    public dvge(dvgh dvgh0, String s, ProtoLiteBuilder hftp0, int v) {
        this.a = dvgh0;
        this.b = s;
        this.d = hftp0;
        this.c = v;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        dpuj dpuj0 = dpuj.cz;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guzo.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        guzo guzo0 = (guzo)hftp0.b_message;
        this.b.getClass();
        guzo0.d = this.b;
        String s = TimeZone.getDefault().getID();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((guzo)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        guzo guzo1 = (guzo)hftp0.b_message;
        gtlu gtlu0 = (gtlu)this.d.N_build();
        gtlu0.getClass();
        guzo1.c = gtlu0;
        guzo1.b |= 1;
        ProtoLiteMessage hftv1 = hftp0.N_build();
        dvgf dvgf0 = new dvgf(this.a, this.c, jqt0);
        dvgg dvgg0 = new dvgg(this.a, this.c, jqt0);
        dptv.m(this.a.b, dpuj0, ((MessageLite)hftv1), ((MessageLite)guzp.a), dvgf0, dvgg0);
        return "LinkedPassClient GetLinkedOffersResponse async to listenable future";
    }
}

