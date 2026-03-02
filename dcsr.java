import android.content.Context;
import com.google.android.gms.chimera.modules.nearby.AppContextProvider;

public final class dcsr {
    public final byte[] a;
    public final Context b;
    public final cuud c;
    public final ibnn d;
    public final ibnn e;
    public final ibnn f;
    public final ibnn g;

    public dcsr(byte[] arr_b) {
        ibuq.f(arr_b, "sharedSecret");
        super();
        this.a = arr_b;
        Context context0 = AppContextProvider.b();
        this.b = context0;
        this.c = new cuud(context0);
        gnca.a();
        gnoy.a();
        this.d = new ibnz(new dcsm(this));
        this.e = new ibnz(new dcsn(this));
        this.f = new ibnz(new dcso(this));
        this.g = new ibnz(new dcsp(this));
    }

    public final gncc a(gmms gmms0) {
        gnez gnez0 = new gnez();
        gnez0.b(this.a.length);
        gnez0.a = gnfa.c;
        gnfb gnfb0 = gnez0.a();
        gneu gneu0 = gnet.a(gnfb0, gnsl.c(this.a));
        gncd gncd0 = gncd.c(new gnce(gnfb0, gmms0.a()), gneu0, null);
        gmmx gmmx0 = new gmmx();
        gmmv gmmv0 = gmnb.b(gncd0);
        gmmv0.a();
        gmmv0.b(1);
        gmmx0.c(gmmv0);
        return (gncc)gmmx0.a().o(gnbr.a, gncc.class);
    }
}

