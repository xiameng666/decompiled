import com.google.android.gms.common.Feature;
import com.google.android.gms.dtdi.core.ChannelInfo;
import com.google.android.gms.dtdi.core.RemoteDevice;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class ctrq implements ctox {
    public final RemoteDevice a;
    public final bhzg b;
    public final ibrt c;
    public final bboh d;
    public ChannelInfo e;
    public icck f;
    public final ctrn g;
    public final String h;
    public final icmn i;
    public final yjk j;
    public final icnl k;
    private final icnj l;
    private final ctrp m;
    private final String n;

    @AssistedInject
    public ctrq(@Assisted RemoteDevice remoteDevice0, bhzg bhzg0, ibrt ibrt0) {
        ibuq.f(remoteDevice0, "remoteDtdiDevice");
        super();
        this.a = remoteDevice0;
        this.b = bhzg0;
        this.c = ibrt0;
        this.d = ctnb.a("DeviceLink", new ibuk(this.getClass()));
        icnl icnl0 = icnm.a(ctot.a);
        this.k = icnl0;
        this.l = new icmp(icnl0);
        this.m = new ctrp(this);
        this.g = new ctrn(this);
        String s = remoteDevice0.a.toString();
        this.n = s;
        this.h = remoteDevice0.b;
        icmn icmn0 = icmu.e(0, 0, 0, 7);
        this.i = icmn0;
        this.j = new yjk(s, remoteDevice0.b, icmn0);
    }

    @Override  // ykf
    public final Object a(String s, String s1, byte[] arr_b, ibrl ibrl0) {
        return this.j.a(s, s1, arr_b, ibrl0);
    }

    @Override  // ctox
    public final icnj b() {
        return this.l;
    }

    @Override  // ctox
    public final void c() {
        bboh bboh0 = this.d;
        ((ggtj)bboh0.h()).x("Connecting to device");
        icnl icnl0 = this.k;
        if(ibuq.m(icnl0.b(), ctot.a)) {
            do {
                Object object0 = icnl0.b();
                ctow ctow0 = (ctow)object0;
            }
            while(!icnl0.h(object0, ctos.a));
            ibuq.f(this.a.a, "token");
            ibuq.f(this.m, "callback");
            azzc azzc0 = new azzc();
            azzc0.a = new bitw(this.a.a, this.m);
            azzc0.c = new Feature[]{bhus.c};
            azzc0.d = 0x6E9D;
            azzd azzd0 = azzc0.a();
            evql evql0 = ((azts)this.b).jn(azzd0);
            evql0.b(new ctrd(new ctrc(this)));
            evql0.A(new ctre(this));
            return;
        }
        ggtj ggtj0 = (ggtj)bboh0.i();
        Object object1 = icnl0.b();
        ggtj0.R("Cannot transition device=%s to Connecting while in state=%s", this.h, object1);
    }

    @Override  // ctox
    public final void d() {
        icnl icnl0 = this.k;
        ctot ctot0 = ctot.a;
        if(!ibuq.m(icnl0.b(), ctot0)) {
            ctou ctou0 = ctou.a;
            if(!ibuq.m(icnl0.b(), ctou0)) {
                do {
                    Object object0 = icnl0.b();
                    ctow ctow0 = (ctow)object0;
                }
                while(!icnl0.h(object0, ctou0));
                synchronized(this) {
                    ChannelInfo channelInfo0 = this.e;
                    if(channelInfo0 == null) {
                        icnl icnl1 = this.k;
                        do {
                            Object object1 = icnl1.b();
                            ctow ctow1 = (ctow)object1;
                        }
                        while(!icnl1.h(object1, ctot0));
                        return;
                    }
                    ibuq.f(this.a.a, "token");
                    azzc azzc0 = new azzc();
                    azzc0.a = new biua(channelInfo0, this.a.a);
                    azzc0.c = new Feature[]{bhus.b};
                    azzc0.d = 0x6E90;
                    azzd azzd0 = azzc0.a();
                    evql evql0 = ((azts)this.b).jn(azzd0);
                    evql0.b(new ctrg(new ctrf()));
                    evql0.A(new ctrh(this));
                }
                return;
            }
        }
        ((ggtj)this.d.j()).x("Disconnect called more than once");
    }

    @Override  // ykf
    public final String f() {
        return this.h;
    }

    @Override  // ykf
    public final String g() {
        return this.n;
    }

    @Override  // ykf
    public final icig h(String s, String s1, byte[] arr_b) {
        return this.j.h(s, s1, arr_b);
    }

    @Override  // ykf
    public final icig j(icig icig0) {
        return this.j.j(icig0);
    }
}

