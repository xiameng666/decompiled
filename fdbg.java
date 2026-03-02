import android.util.Log;
import java.util.HashSet;

public final class fdbg implements evpz {
    public final fdch a;
    public final HashSet b;
    public final fczq[] c;
    public final fduq d;

    public fdbg(fdch fdch0, HashSet hashSet0, fczq[] arr_fczq, fduq fduq0) {
        this.a = fdch0;
        this.b = hashSet0;
        this.c = arr_fczq;
        this.d = fduq0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(!((evqu)evql0).d) {
            HashSet hashSet0 = this.b;
            fdch fdch0 = this.a;
            if(evql0.n()) {
                ggqj ggqj0 = ((ggfp)evql0.j()).om();
                while(ggqj0.hasNext()) {
                    Object object0 = ggqj0.next();
                    String s = (String)object0;
                    if(fdch0.r(s)) {
                        if(Log.isLoggable("wearable.Consents", 3)) {
                            Log.d("wearable.Consents", "Skipping global consents for per-watch capable node: " + s);
                        }
                        hashSet0.add(s);
                    }
                }
            }
            else if(Log.isLoggable("wearable.Consents", 5)) {
                Log.w("wearable.Consents", "Capability request failed. Not not skipping any watches.", evql0.i());
            }
            fczq[] arr_fczq = this.c;
            for(int v = 0; v < arr_fczq.length; ++v) {
                String s1 = arr_fczq[v].j;
                if(s1 != null && !hashSet0.contains(s1)) {
                    fdch0.m(this.d, s1, "global", "Watch does not have capability and/or consents per watch data item");
                }
            }
        }
        else if(Log.isLoggable("wearable.Consents", 5)) {
            Log.w("wearable.Consents", "Capability request cancelled. Not propagating consents.");
        }
    }
}

