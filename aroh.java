import com.google.android.gms.nearby.connection.ConnectionOptions;
import j..util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

final class aroh extends cuwp {
    public final gmcu a;
    final arot b;
    private final String c;
    private final boolean d;
    private final boolean e;

    public aroh(arot arot0, gmcu gmcu0, String s, boolean z, boolean z1) {
        Objects.requireNonNull(arot0);
        this.b = arot0;
        super();
        this.a = gmcu0;
        gftb.check(s);
        this.c = s;
        this.d = z;
        this.e = z1;
    }

    public final ConnectionOptions a(boolean z) {
        aqql aqql0 = arot.a;
        arot arot0 = this.b;
        Object object0 = arot0.f.mr();
        boolean z1 = this.e;
        boolean z2 = this.d;
        aqql0.h("ConnectionOptions - Mediums allowed(Aware=%b, Direct=%b, LAN=%b).", new Object[]{object0, Boolean.valueOf(z1), Boolean.valueOf(z2)});
        ConnectionOptions connectionOptions0 = new ConnectionOptions();
        boolean z3 = ((Boolean)arot0.f.mr()).booleanValue();
        ArrayList arrayList0 = new ArrayList();
        if(z3) {
            arrayList0.add(Integer.valueOf(6));
        }
        if(z1) {
            arrayList0.add(Integer.valueOf(8));
        }
        arrayList0.add(Integer.valueOf(3));
        if(z2) {
            arrayList0.add(Integer.valueOf(5));
        }
        aqql0.h("ConnectionOptions - upgradeMediums allowed %s.", new Object[]{arrayList0});
        connectionOptions0.o = glwy.n(arrayList0);
        aqql0.h("ConnectionOptions - KeepAlive config - interval %d, timeout %d.", new Object[]{((Long)arot0.k.mr()).intValue(), ((Long)arot0.j.mr()).intValue()});
        connectionOptions0.m = ((Long)arot0.k.mr()).intValue();
        connectionOptions0.n = ((Long)arot0.j.mr()).intValue();
        if(((Boolean)arot0.l.mr()).booleanValue()) {
            aqql0.h("Requesting initial connection just over bluetooth", new Object[0]);
            connectionOptions0.p = new int[]{2};
        }
        gful_cronetEngineProvider gful0 = arot0.h;
        aqql0.h("ConnectionOptions - ConnectionType config - disruptive allowed=%b.", new Object[]{gful0.mr()});
        if(z) {
            connectionOptions0.s = 2;
            ProtoLiteBuilder hftp0 = arot0.d.l;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkyg hkyg0 = (hkyg)hftp0.b_message;
            hkyg0.b |= 0x4000;
            hkyg0.v = true;
        }
        else if(((Boolean)gful0.mr()).booleanValue()) {
            connectionOptions0.s = 1;
        }
        if(((Boolean)arot0.n.mr()).booleanValue()) {
            aqql0.h("Setting skipPayloadInProgressUpdate for sender to true.", new Object[0]);
            connectionOptions0.x = true;
        }
        long v = Long.parseLong(this.c);
        Long long0 = v;
        aqql0.h("Setting flow Id as part of discovery on request connection state: %d", new Object[]{long0});
        long0.getClass();
        connectionOptions0.t = v;
        cuvj.b(connectionOptions0);
        return connectionOptions0;
    }

    @Override  // cuwp
    public final void b(String s, cuwf cuwf0) {
        evql evql0;
        aqql aqql0 = arot.a;
        aqql0.h("onEndpointFound(endpointId=%s, discoveredEndpointInfo=%s)", new Object[]{s, cuwf0});
        if(this.c.equals(cuwf0.a)) {
            arot arot0 = this.b;
            if(((Boolean)arot0.g.mr()).booleanValue()) {
                arot0.b.u();
            }
            if(((Boolean)arot0.i.mr()).booleanValue()) {
                azts azts0 = arot0.p;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dyfv.a).v_newBuilder();
                hfsw hfsw0 = hfsw.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyfv dyfv0 = (dyfv)hftp0.b_message;
                hfsw0.getClass();
                dyfv0.c = hfsw0;
                dyfv0.b = 18;
                evql0 = evrg.m(azts0.ba(((dyfv)hftp0.N_build()).toBytesArray()), 5L, TimeUnit.SECONDS).c(new aroe(this));
            }
            else {
                evql0 = evrg.d(this.a(false));
            }
            evql evql1 = evql0.e(new arof(this, s));
            evql1.b(new arog(this));
            evql1.A(new aror(arot0, s, this.a));
            return;
        }
        aqql0.f("Connection hint mismatch. Not requesting connection.", new Object[0]);
    }

    @Override  // cuwp
    public final void c(String s) {
        arot.a.f("onEndpointLost(endpointId=%s)", new Object[]{s});
    }
}

