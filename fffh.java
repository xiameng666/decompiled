import android.content.Intent;
import android.util.Log;

public final class fffh {
    public final ffgm a;

    public fffh(ffgm ffgm0) {
        this.a = ffgm0;
    }

    public final void a(ffco ffco0) {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "notify Consent change: " + ffco0);
        }
        ffgm ffgm0 = this.a;
        fffn fffn0 = new fffn(ffgm0, new Intent("com.google.android.gms.wearable.CONSENT_CHANGED", fdzj.a), ffco0);
        for(Object object0: ffgm0.p(1)) {
            fdpl fdpl0 = (fdpl)object0;
            if(hzvd.d()) {
                String s = fdpl0.b;
                if((ffco0.i == null ? ffcn.a : ffco0.i).b.contains(s)) {
                    if(!Log.isLoggable("WearableService", 4)) {
                        continue;
                    }
                    Log.i("WearableService", "onConsentChanged call skipped for package in block list: " + s);
                    continue;
                }
            }
            ffgm0.k(fdpl0, fffn0, true);
        }
    }
}

