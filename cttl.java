import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.presence.PresenceDevice;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.Arrays;
import java.util.List;

public final class cttl implements ctox {
    public final cuvm a;
    public final ibrt b;
    public final PresenceDevice c;
    public final bboh d;
    public final icmn e;
    public icck f;
    public final yjk g;
    public final cttk h;
    public final icnl i;
    public static final int j;
    private static final List k;
    private final icnj l;
    private final String m;
    private final String n;
    private final ctti o;

    static {
        cttl.k = ibpo.g(new Integer[]{((int)5), ((int)9)});
    }

    @AssistedInject
    public cttl(cuvm cuvm0, ibrt ibrt0, @Assisted PresenceDevice presenceDevice0) {
        ibuq.f(presenceDevice0, "presenceDevice");
        super();
        this.a = cuvm0;
        this.b = ibrt0;
        this.c = presenceDevice0;
        this.d = ctnb.a("DeviceLink", new ibuk(this.getClass()));
        icnl icnl0 = icnm.a(ctot.a);
        this.i = icnl0;
        icmn icmn0 = icmu.e(0, 0, 0, 7);
        this.e = icmn0;
        this.l = new icmp(icnl0);
        String s = String.valueOf(presenceDevice0.a);
        this.m = s;
        String s1 = presenceDevice0.b == null ? "Unknown" : presenceDevice0.b;
        this.n = s1;
        this.g = new yjk(s, s1, icmn0);
        this.h = new cttk(this);
        this.o = new ctti(this);
    }

    @Override  // ykf
    public final Object a(String s, String s1, byte[] arr_b, ibrl ibrl0) {
        return this.g.a(s, s1, arr_b, ibrl0);
    }

    @Override  // ctox
    public final icnj b() {
        return this.l;
    }

    @Override  // ctox
    public final void c() {
        ((ggtj)this.d.h()).x("Connecting to device");
        icnl icnl0 = this.i;
        if(ibuq.m(icnl0.b(), ctot.a)) {
            do {
                Object object0 = icnl0.b();
                ctow ctow0 = (ctow)object0;
            }
            while(!icnl0.h(object0, ctos.a));
            ConnectionOptions connectionOptions0 = new ConnectionOptions();
            connectionOptions0.r = Strategy.a;
            int[] arr_v = ibpo.aF(cttl.k);
            connectionOptions0.o = Arrays.copyOf(arr_v, arr_v.length);
            connectionOptions0.s = 2;
            cuvj.b(connectionOptions0);
            evql evql0 = this.a.g("DeviceLink", this.c, this.o, connectionOptions0);
            evql0.b(new ctte(new cttd(this)));
            evql0.A(new cttf(this));
        }
    }

    @Override  // ctox
    public final void d() {
        PresenceDevice presenceDevice0 = this.c;
        icnl icnl0 = this.i;
        if(!ibuq.m(icnl0.b(), ctot.a)) {
            ctou ctou0 = ctou.a;
            if(!ibuq.m(icnl0.b(), ctou0)) {
                do {
                    Object object0 = icnl0.b();
                    ctow ctow0 = (ctow)object0;
                }
                while(!icnl0.h(object0, ctou0));
                this.a.q(presenceDevice0);
            }
        }
    }

    @Override  // ykf
    public final String f() {
        return this.n;
    }

    @Override  // ykf
    public final String g() {
        return this.m;
    }

    @Override  // ykf
    public final icig h(String s, String s1, byte[] arr_b) {
        return this.g.h(s, s1, arr_b);
    }

    @Override  // ykf
    public final icig j(icig icig0) {
        return this.g.j(icig0);
    }
}

