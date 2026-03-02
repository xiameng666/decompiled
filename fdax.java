import android.net.Uri.Builder;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class fdax implements evqk {
    public final fdbf a;

    public fdax(fdbf fdbf0) {
        this.a = fdbf0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        batl.s(((NodeParcelable)object0));
        String s = ((NodeParcelable)object0).a;
        if(Log.isLoggable("wearable.ConsentRecord", 3)) {
            Log.d("wearable.ConsentRecord", "Get global consent URI for node: " + s);
        }
        Uri uri0 = new Uri.Builder().scheme("wear").authority(s).path("/privacy_settings").build();
        return this.a.a.f(uri0);
    }
}

