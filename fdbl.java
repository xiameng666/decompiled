import android.net.Uri.Builder;
import android.util.Log;

public final class fdbl implements evqf {
    public final fdch a;
    public final String b;
    public final fduq c;

    public fdbl(fdch fdch0, String s, fduq fduq0) {
        this.a = fdch0;
        this.b = s;
        this.c = fduq0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(((ggfp)object0).size() == 1) {
            if(!Log.isLoggable("wearable.Consents", 3)) {
                return;
            }
            Log.d("wearable.Consents", "Received request to update general consents, this watch is migrated to consents per watch, ignoring");
            return;
        }
        if(((ggfp)object0).size() > 1) {
            if(Log.isLoggable("wearable.Consents", 6)) {
                Log.e("wearable.Consents", "Received more than 1 device connected to watch with consents per watch enabled, this should never happen!");
            }
            return;
        }
        fdbf fdbf0 = fdbf.i(this.a.i);
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("wear");
        evql evql0 = fdbf0.a.e(uri$Builder0.path("/privacy_settings/" + this.b).build());
        evql0.b(new fdcd(this.a, this.c));
        evql0.A(new fdce(this.a, this.c));
        String s = this.a.n.a().a;
        this.a.m(this.c, s, "global", "Phone doesn\'t have consents per watch support");
    }
}

