import android.content.Context;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportRequest;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportResponse;
import java.util.concurrent.Executor;

public final class bpcs implements bpnj {
    public static final OwnersLocationReportResponse a;
    public final Context b;
    public final bpbb c;
    private final fqxe d;
    private final Executor e;

    static {
        bboh.b("OwnersLocationRepOpPeer", bbcu.eD);
        bpcs.a = new OwnersLocationReportResponse();
    }

    public bpcs(Context context0, fqxe fqxe0, bpbb bpbb0, Executor executor0) {
        this.b = context0;
        this.d = fqxe0;
        this.c = bpbb0;
        this.e = executor0;
    }

    @Override  // bpnj
    public final gmcd a(Object object0) {
        if(bpya.a(this.b)) {
            return gdta.g(this.d.f()).i(new bpcp(this, ((OwnersLocationReportRequest)object0)), this.e).h(new bpcq(), gmap.a);
        }
        cjuh cjuh0 = new cjuh(13, "Failed handling owner\'s location report: location services are disabled.");
        cjuh0.b = true;
        throw cjuh0;
    }
}

