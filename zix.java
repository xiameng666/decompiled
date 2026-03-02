import java.util.HashMap;

public final class zix implements foef, ziu {
    public static final baun a;
    private final foeg b;
    private final HashMap c;
    private final gmcg d;
    private boolean e;

    static {
        zix.a = new baun("AccountSettings", new String[]{"OwnerRepositoryGopImpl"});
    }

    public zix(foeg foeg0, gmcg gmcg0) {
        this.c = new HashMap();
        this.b = foeg0;
        this.d = gmcg0;
    }

    @Override  // ziu
    public final lqd a(aatb aatb0) {
        HashMap hashMap0 = this.c;
        lqd lqd0 = (lqi)hashMap0.get(aatb0);
        if(lqd0 != null) {
            gfsx gfsx0 = (gfsx)lqd0.ij();
            gftb.check(gfsx0);
            if(gfsx0.i()) {
                return lqd0;
            }
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)aatc.a).v_newBuilder();
        String s = aatb0.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aatc aatc0 = (aatc)hftp0.b_message;
        s.getClass();
        aatc0.b = s;
        lqd lqd1 = new lqi(gfsx.m(((aatc)hftp0.N_build())));
        hashMap0.put(aatb0, lqd1);
        if(!this.e) {
            this.b.d(this);
            this.e = true;
        }
        this.d(aatb0, ((lqi)lqd1));
        return lqd1;
    }

    @Override  // ziu
    public final void b(aatb aatb0) {
        lqi lqi0 = (lqi)this.c.get(aatb0);
        if(lqi0 != null) {
            gfsx gfsx0 = (gfsx)lqi0.ij();
            gftb.check(gfsx0);
            if(gfsx0.i()) {
                this.d(aatb0, lqi0);
            }
        }
    }

    @Override  // foef
    public final void c() {
        gmbu.t(this.b.c(), new ziv(this), this.d);
    }

    private final void d(aatb aatb0, lqi lqi0) {
        if(!bbqr.d(aatb0.b)) {
            gmbu.t(this.b.b(aatb0.b), new ziw(this, aatb0, lqi0), this.d);
            return;
        }
        lqi0.l(gfsx.m(aatc.a));
    }
}

