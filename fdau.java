import android.util.Log;

public final class fdau implements evqk {
    public final fdbf a;
    public final boolean b;

    public fdau(fdbf fdbf0, boolean z) {
        this.a = fdbf0;
        this.b = z;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        Void void0 = (Void)object0;
        boolean z = this.b;
        if(fdci.b() && hzuz.s() && !z) {
            if(Log.isLoggable("wearable.ConsentRecord", 4)) {
                Log.i("wearable.ConsentRecord", "Request for cloud sync opt out and removing cloud sync opt out disabled, ignoring request");
            }
            return evrg.d(null);
        }
        if(!z && Log.isLoggable("wearable.ConsentRecord", 5)) {
            Log.w("wearable.ConsentRecord", "Cloud sync opted out");
        }
        fdga fdga0 = new fdga(this.a.c.a, this.a.c.D, z);
        this.a.c.D.c(fdga0);
        return batf.c(fdga0);
    }
}

