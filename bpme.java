import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportRequest;
import java.util.concurrent.Executor;

public final class bpme implements bpnj {
    public static final bboh a;
    public final fqxf b;
    private final bnvm c;
    private final bnyk d;
    private final Executor e;

    static {
        bpme.a = bboh.b("GetLskfSupportOpPeer", bbcu.eD);
    }

    public bpme(bnvm bnvm0, bnyk bnyk0, fqxf fqxf0, Executor executor0) {
        this.c = bnvm0;
        this.d = bnyk0;
        this.b = fqxf0;
        this.e = executor0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        gmcd gmcd1;
        gmcd gmcd0 = this.c.a(bnxi.b).g();
        if(((GetKeychainLockScreenKnowledgeFactorSupportRequest)object0).b) {
            gdta gdta0 = gdta.g(this.d.a()).h(new bpma(), gmap.a);
            bpmb bpmb0 = new bpmb(this);
            gmcd1 = gdta0.f(bnlq.class, bpmb0, this.e);
            return gdtd.h(new gmcd[]{gmcd0, gmcd1}).a(new bpmc(gmcd1, gmcd0), gmap.a);
        }
        gmcd1 = gmbu.i(gfqx.a);
        return gdtd.h(new gmcd[]{gmcd0, gmcd1}).a(new bpmc(gmcd1, gmcd0), gmap.a);
    }
}

