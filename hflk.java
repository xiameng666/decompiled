import java.util.Set;

public final class hflk implements glzm {
    public final hflo a;
    public final gmcd b;
    public final gmcd c;
    public final hhew d;
    public final hfnp e;
    public final hfnl f;

    public hflk(hflo hflo0, gmcd gmcd0, gmcd gmcd1, hhew hhew0, hfnp hfnp0, hfnl hfnl0) {
        this.a = hflo0;
        this.b = gmcd0;
        this.c = gmcd1;
        this.d = hhew0;
        this.e = hfnp0;
        this.f = hfnl0;
    }

    @Override  // glzm
    public final gmcd a() {
        Set set0 = (Set)gmbu.r(this.b);
        if(set0.size() == 1 && set0.equals(((Set)gmbu.r(this.c)))) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfns.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((hfns)hftv0).c = 1;
            ((hfns)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hfns hfns0 = (hfns)hftp0.b_message;
            hfns0.b |= 2;
            hfns0.d = 7;
            return gmbu.i(((hfns)hftp0.N_build()));
        }
        gmcd gmcd0 = this.a.b(this.f);
        gmcd gmcd1 = this.a.a(this.d, this.f);
        gmcd gmcd2 = gmbu.d(new gmcd[]{gmcd0, gmcd1}).b(new hflm(this.a, gmcd0, gmcd1, this.e), gmap.a);
        return gmbu.b(new gmcd[]{gmcd2}).a(new hflh(gmcd2), gmap.a);
    }
}

