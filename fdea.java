import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

public final class fdea implements gful_cronetEngineProvider {
    public final fded a;
    public final Context b;
    public final azts c;

    public fdea(fded fded0, Context context0, azts azts0) {
        this.a = fded0;
        this.b = context0;
        this.c = azts0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        evql evql0;
        fded fded0 = this.a;
        fdan fdan0 = (fdan)fded0.e.mr();
        String s = fdan0.d;
        if(Log.isLoggable("wearable.TOS", 3)) {
            Log.d("wearable.TOS", "Recording consent of the watch: " + s);
        }
        Context context0 = this.b;
        if(fdci.b() && fdan0.g && !TextUtils.isEmpty(s)) {
            if(Log.isLoggable("wearable.TOS", 4)) {
                Log.i("wearable.TOS", "Requesting consent update for watch: " + s);
            }
            fdbf fdbf0 = fdbf.i(context0);
            hfwn hfwn0 = hfyn.l();
            evql0 = fdbf0.e(fded0.b.d(s, hfwn0));
        }
        else {
            if(Log.isLoggable("wearable.TOS", 4)) {
                Log.i("wearable.TOS", "Updating global consent");
            }
            evql0 = fdbf.i(context0).g(fded0.b.b());
        }
        ffnc.c("wearable.TOS", "tryRecordConsent", evql0);
        return evql0.g(new fddv(this.c));
    }
}

