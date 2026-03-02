import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.wearable.AppTheme;

public class fdal extends du {
    fdak a;
    fdan b;
    boolean c;

    final void A(Bundle bundle0) {
        boolean z;
        if(bundle0 == null) {
            Bundle bundle1 = this.getArguments();
            z = bundle1 != null && bundle1.getBoolean("is_le_device");
        }
        else {
            z = bundle0.getBoolean("is_le_device");
        }
        this.c = z;
        if(Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", String.format("[ConsentFragment] restoreInstanceState(...) - isLeDevice: %b", Boolean.valueOf(this.c)));
        }
    }

    @Override  // du
    public final void onAttach(Context context0) {
        if(Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", String.format("[ConsentFragment] onAttach(%s)", context0));
        }
        super.onAttach(context0);
        this.a = (fdak)context0;
    }

    @Override  // du
    public void onCreate(Bundle bundle0) {
        fdan fdan0;
        super.onCreate(bundle0);
        if(bundle0 == null) {
            bundle0 = this.getArguments();
        }
        int v = fdds.B(bundle0);
        if(bundle0 == null) {
            fdam fdam0 = fdan.a();
            fdam0.b(fczo.d());
            fdam0.c(false);
            fdam0.g(v);
            fdam0.a = null;
            fdam0.b = null;
            fdam0.f(false);
            fdam0.h(false);
            fdam0.d(true);
            fdan0 = fdam0.a();
        }
        else {
            AppTheme appTheme0 = (AppTheme)jyt.a(bundle0, "theme", AppTheme.class);
            boolean z = bundle0.getBoolean("is_le_device", false);
            String s = bundle0.getString("watch_peer_id");
            String s1 = bundle0.getString("account_name");
            boolean z1 = bundle0.getBoolean("show_backup_consent", false);
            boolean z2 = bundle0.getBoolean("use_consent_per_watch", false);
            boolean z3 = bundle0.getBoolean("is_watch_connected", true);
            boolean z4 = bundle0.getBoolean("is_watch_supervised", false);
            fdam fdam1 = fdan.a();
            if(appTheme0 == null) {
                appTheme0 = fczo.d();
            }
            fdam1.b(appTheme0);
            fdam1.c(z);
            fdam1.g(v);
            fdam1.a = s;
            fdam1.b = s1;
            fdam1.f(z1);
            fdam1.h(z2);
            fdam1.d(z3);
            fdam1.e(z4);
            fdan0 = fdam1.a();
        }
        this.b = fdan0;
    }

    @Override  // du
    public final void onDetach() {
        if(Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", "[ConsentFragment] onDetach()");
        }
        super.onDetach();
    }

    final void y() {
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "[ConsentFragment] finishing activity");
        }
        fdak fdak0 = this.a;
        if(fdak0 != null) {
            fdak0.finish();
        }
    }

    public static void z(fdal fdal0, fdan fdan0) {
        if(Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", "[ConsentFragment] initialize:" + fdan0.toString());
        }
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("is_le_device", fdan0.b);
        bundle0.putInt("terms_context", fdan0.c);
        bundle0.putParcelable("theme", fdan0.a);
        bundle0.putString("watch_peer_id", fdan0.d);
        bundle0.putString("account_name", fdan0.e);
        bundle0.putBoolean("show_backup_consent", fdan0.f);
        bundle0.putBoolean("use_consent_per_watch", fdan0.g);
        bundle0.putBoolean("is_watch_connected", fdan0.h);
        bundle0.putBoolean("is_watch_supervised", fdan0.i);
        fdal0.setArguments(bundle0);
    }
}

