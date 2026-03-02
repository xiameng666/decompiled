import android.util.Log;
import com.google.android.gms.wearable.PutDataRequest;
import j..util.Collection.-EL;

public final class fdbe implements evqk {
    public final fdbf a;
    public final String b;
    public final ffco c;
    public final boolean d;
    public final PutDataRequest e;

    public fdbe(fdbf fdbf0, String s, ffco ffco0, boolean z, PutDataRequest putDataRequest0) {
        this.a = fdbf0;
        this.b = s;
        this.c = ffco0;
        this.d = z;
        this.e = putDataRequest0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        boolean z = Collection.-EL.stream(((fcee)object0).b()).anyMatch(new fdaz(this.b));
        if(Log.isLoggable("wearable.ConsentRecord", 4)) {
            Log.i("wearable.ConsentRecord", "Watch has the capability to set consent per watch: " + z);
        }
        PutDataRequest putDataRequest0 = this.e;
        boolean z1 = this.d;
        fdbf fdbf0 = this.a;
        if(!z) {
            if(Log.isLoggable("wearable.ConsentRecord", 4)) {
                Log.i("wearable.ConsentRecord", "Watch does not yet support consents per watch, also updating global consent");
            }
            PutDataRequest putDataRequest1 = PutDataRequest.a("/privacy_settings");
            putDataRequest1.c = fdbf.k(this.c).toBytesArray();
            return fdbf0.h(z1, new PutDataRequest[]{putDataRequest0, putDataRequest1});
        }
        return fdbf0.h(z1, new PutDataRequest[]{putDataRequest0});
    }
}

