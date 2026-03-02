import android.text.TextUtils;
import android.util.Log;
import j..util.Objects;
import java.util.UUID;

final class ffkc extends ffee {
    final String c;
    final fdiy d;
    final fflv e;

    public ffkc(fflv fflv0, String s, fdiy fdiy0) {
        this.c = s;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("dataSynchronizationProgressTracking");
    }

    @Override  // ffee
    public final void a() {
        gmcd gmcd0;
        String s = this.c;
        if(TextUtils.isEmpty(s)) {
            Log.w("DataSyncTrackingManager", "notifyOnSyncComplete: peerNodeId cannot be empty");
            gmcd0 = gmbu.g();
        }
        else {
            String s1 = UUID.randomUUID().toString();
            fetw fetw0 = this.e.F.h.a(s, s1);
            fetw0.b("initiateDataSyncTracking");
            gmcd gmcd1 = glzd.g(glzd.g(((gmcd)fetw0.a(new feto(fetw0), "southbound tracking")), new fetp(fetw0), fetw0.d), new fetq(fetw0), fetw0.d);
            gmbu.t(gmcd1, new fetv(fetw0, "initiateDataSyncTracking"), fetw0.d);
            gmbu.t(gmcd1, new fetg(this.e.F, fetw0, "notifyOnSyncComplete"), this.e.F.c);
            gmcd0 = gmcd1;
        }
        gmbu.t(gmcd0, new ffkb(this, this.d), gmap.a);
    }
}

