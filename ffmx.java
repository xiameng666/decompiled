import android.util.Log;

public final class ffmx implements evpz {
    public final String a;
    public final String b;

    public ffmx(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        String s = this.a;
        String s1 = this.b;
        if(evql0.n()) {
            if(Log.isLoggable(s, 4)) {
                Log.i(s, s1 + " succeeded");
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

