import java.util.HashSet;

public final class fovx implements glzn {
    public final fowd a;

    public fovx(fowd fowd0) {
        this.a = fowd0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((gged_interceptors)object0).isEmpty()) {
            return gmbx.a;
        }
        fowd fowd0 = this.a;
        icza icza0 = (icza)fowd0.g.get();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)icyz.a).v_newBuilder();
        int v = ((gged_interceptors)object0).size();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((icyz)hftv0).b |= 2;
        ((icyz)hftv0).e = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        icyz icyz0 = (icyz)hftp0.b_message;
        icza0.getClass();
        icyz0.d = icza0;
        icyz0.b |= 1;
        HashSet hashSet0 = new HashSet();
        for(int v2 = 0; v2 < icza0.b.size(); ++v2) {
            int v3 = icyx.a(icza0.b.d(v2));
            if(v3 == 0) {
                v3 = 1;
            }
            hashSet0.add(Integer.valueOf(v3 - 1));
        }
        int v4 = ((gged_interceptors)object0).size();
        for(int v1 = 0; v1 < v4; ++v1) {
            icyy icyy0 = (icyy)((gged_interceptors)object0).get(v1);
            if(hashSet0.contains(Integer.valueOf((icyx.a(icyy0.d) == 0 ? 1 : icyx.a(icyy0.d)) - 1))) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                icyz icyz1 = (icyz)hftp0.b_message;
                icyy0.getClass();
                hfuo hfuo0 = icyz1.c;
                if(!hfuo0.c()) {
                    icyz1.c = ProtoLiteMessage.E(hfuo0);
                }
                icyz1.c.add(icyy0);
            }
        }
        icyz icyz2 = (icyz)hftp0.N_build();
        fotj fotj0 = fowd0.a;
        fota fota0 = fotb.a();
        idcv idcv0 = (idcv)((ProtoLiteMessage)idcw.a).v_newBuilder();
        if(!idcv0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)idcv0).ensureMutable();
        }
        idcw idcw0 = (idcw)idcv0.b_message;
        icyz2.getClass();
        idcw0.r = icyz2;
        idcw0.b |= 0x20000;
        fota0.f(((idcw)((ProtoLiteBuilder)idcv0).N_build()));
        return glzd.f(fotj0.b(fota0.a()), new fowb(fowd0, ((gged_interceptors)object0)), fowd0.c);
    }
}

