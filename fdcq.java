import android.support.v7.widget.RecyclerView;
import android.util.Log;

public final class fdcq implements evqf {
    public final fdcv a;
    public final RecyclerView b;

    public fdcq(fdcv fdcv0, RecyclerView recyclerView0) {
        this.a = fdcv0;
        this.b = recyclerView0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        fdcv fdcv0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            fddk fddk0 = fdcv0.d.b(fdcv0.a, fdcv0.c, fdcv0.b);
            this.b.an(fddk0);
            return;
        }
        Log.e("wearable.Consents", "[PrivacySettingsFragment] not available: no consent record found");
        fdcv0.y();
    }
}

