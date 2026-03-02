import android.util.Log;

public final class ffmz implements evpz {
    public final String a;
    public final String b;

    public ffmz() {
        this.a = "wearable.Consents";
        this.b = "Update ConsentsPerWatch capability";
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        String s = this.a;
        String s1 = this.b;
        if(evql0.n()) {
            if(Log.isLoggable(s, 4)) {
                Log.i(s, s1 + " succeeded: " + evql0.j());
            }
        }
        else if(((evqu)evql0).d) {
            if(Log.isLoggable(s, 4)) {
                Log.i(s, s1 + " cancelled");
            }
        }
        else if(Log.isLoggable(s, 5)) {
            Log.w(s, s1 + " failed", evql0.i());
        }
    }
}

