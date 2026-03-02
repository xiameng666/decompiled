import android.net.Uri.Builder;
import android.util.Log;
import com.google.android.gms.wearable.internal.NodeParcelable;

public final class fdao implements evqk {
    public final fdbf a;
    public final String b;

    public fdao(fdbf fdbf0, String s) {
        this.a = fdbf0;
        this.b = s;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        batl.s(((NodeParcelable)object0));
        String s = this.b;
        if(Log.isLoggable("wearable.ConsentRecord", 3)) {
            Log.d("wearable.ConsentRecord", "Get watch specific consent URI for node: " + s);
        }
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("wear").authority(((NodeParcelable)object0).a);
        return this.a.a.f(uri$Builder0.path("/privacy_settings/" + s).build());
    }
}

