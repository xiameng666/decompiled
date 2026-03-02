import com.google.android.gms.nearby.sharing.TransferMetadata;
import j..util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

final class dfzj extends dfzd {
    TransferMetadata A;
    final ConcurrentMap B;
    int C;
    int D;
    String a;
    String b;
    dgap c;
    dfum d;
    dcnp e;
    boolean f;
    final AtomicBoolean g;
    final AtomicBoolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    cuwu[] o;
    cuwu[] p;
    cuwu[] q;
    cuwu[] r;
    cuwu[] s;
    TransferMetadata t;
    float u;
    long v;
    int w;
    long x;
    long y;
    dcjy z;

    public dfzj() {
        this.D = 1;
        this.g = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.o = new cuwu[0];
        this.p = new cuwu[0];
        this.q = new cuwu[0];
        this.r = new cuwu[0];
        this.s = new cuwu[0];
        this.t = new dcnn(1000).a();
        this.u = 0.0f;
        this.w = 0;
        this.B = new ConcurrentHashMap();
    }

    public final void a() {
        this.D = 3;
    }

    public final boolean b() {
        return this.D == 3;
    }

    @Override
    public final String toString() {
        String s = this.a;
        boolean z = false;
        Boolean boolean0 = Boolean.valueOf(this.c != null);
        Boolean boolean1 = Boolean.valueOf(this.d != null);
        if(this.e != null) {
            z = true;
        }
        Boolean boolean2 = Boolean.valueOf(z);
        Integer integer0 = (int)this.o.length;
        Integer integer1 = (int)this.p.length;
        Integer integer2 = (int)this.q.length;
        Integer integer3 = (int)this.r.length;
        Boolean boolean3 = Boolean.valueOf(this.i.get());
        String s1 = TransferMetadata.c(this.t.a);
        Boolean boolean4 = Boolean.valueOf(this.j);
        switch(this.D) {
            case 1: {
                return String.format("OutgoingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s, hasCallback: %s, textPayloadsSize: %s, filePayloadsSize: %s, wifiCredentialPayloadsSize: %s, appPayloadsSize: %s, isCancelled: %s, status: %s, isCancellationInitiator: %s, discoveryState: %s, bandwidthQuality %s, connectionMedium %s>", s, boolean0, boolean1, boolean2, integer0, integer1, integer2, integer3, boolean3, s1, boolean4, "UNKNOWN", ((int)this.C), ((int)this.w));
            }
            case 2: {
                return String.format("OutgoingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s, hasCallback: %s, textPayloadsSize: %s, filePayloadsSize: %s, wifiCredentialPayloadsSize: %s, appPayloadsSize: %s, isCancelled: %s, status: %s, isCancellationInitiator: %s, discoveryState: %s, bandwidthQuality %s, connectionMedium %s>", s, boolean0, boolean1, boolean2, integer0, integer1, integer2, integer3, boolean3, s1, boolean4, "FOUND", ((int)this.C), ((int)this.w));
            }
            case 3: {
                return String.format("OutgoingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s, hasCallback: %s, textPayloadsSize: %s, filePayloadsSize: %s, wifiCredentialPayloadsSize: %s, appPayloadsSize: %s, isCancelled: %s, status: %s, isCancellationInitiator: %s, discoveryState: %s, bandwidthQuality %s, connectionMedium %s>", s, boolean0, boolean1, boolean2, integer0, integer1, integer2, integer3, boolean3, s1, boolean4, "LOST", ((int)this.C), ((int)this.w));
            }
            default: {
                return String.format("OutgoingShareTargetInfo<endpointId: %s, hasCertificate: %s, hasConnection: %s, hasCallback: %s, textPayloadsSize: %s, filePayloadsSize: %s, wifiCredentialPayloadsSize: %s, appPayloadsSize: %s, isCancelled: %s, status: %s, isCancellationInitiator: %s, discoveryState: %s, bandwidthQuality %s, connectionMedium %s>", s, boolean0, boolean1, boolean2, integer0, integer1, integer2, integer3, boolean3, s1, boolean4, "null", ((int)this.C), ((int)this.w));
            }
        }
    }
}

