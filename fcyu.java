import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j..util.Optional;

public final class fcyu implements Runnable {
    public final fcyw a;
    public final Context b;
    public final ViewGroup c;
    public final boolean d;
    public final int e;
    public final fcys f;

    public fcyu(fcyw fcyw0, Context context0, ViewGroup viewGroup0, boolean z, int v, fcys fcys0) {
        this.a = fcyw0;
        this.b = context0;
        this.c = viewGroup0;
        this.d = z;
        this.e = v;
        this.f = fcys0;
    }

    @Override
    public final void run() {
        Optional optional0 = Optional.of(LayoutInflater.from(this.b).inflate(0x7F0E0EB3, null));  // layout:wearable_bugreport_consent_snackbar
        fcyw fcyw0 = this.a;
        fcyw0.b = optional0;
        Log.d("SnackbarHandlerProvider", "showSnackbar ");
        Object object0 = fcyw0.b.get();
        fcyw0.a = Optional.of(new fyxk(this.c.getContext(), this.c, ((View)object0), fcyw0));
        ((fyxk)fcyw0.a.get()).l = -2;
        ((fyxk)fcyw0.a.get()).i();
        if(this.d) {
            Object object1 = fcyw0.a.get();
            if(Log.isLoggable("BugreportConsentSnackb", 3)) {
                Log.d("BugreportConsentSnackb", "showProgress");
            }
            ((fyxk)object1).j.findViewById(0x7F0B1D41).setVisibility(0);  // id:progress_circular
            ((fyxk)object1).j.findViewById(0x7F0B0E9E).setVisibility(8);  // id:check_image
            TextView textView0 = (TextView)((fyxk)object1).j.findViewById(0x7F0B0F95);  // id:connecting_text
            textView0.setText(this.e);
            textView0.setVisibility(0);
            View view0 = ((fyxk)object1).j.findViewById(0x7F0B0DFE);  // id:cancel_image
            view0.setVisibility(0);
            view0.setOnClickListener(new fcyj(this.f));
            ((fyxk)object1).j.findViewById(0x7F0B0F92).setVisibility(8);  // id:connected_text
            return;
        }
        Object object2 = fcyw0.a.get();
        if(Log.isLoggable("BugreportConsentSnackb", 3)) {
            Log.d("BugreportConsentSnackb", "stopProgress");
        }
        ((fyxk)object2).j.findViewById(0x7F0B1D41).setVisibility(8);  // id:progress_circular
        ((fyxk)object2).j.findViewById(0x7F0B0E9E).setVisibility(0);  // id:check_image
        ((fyxk)object2).j.findViewById(0x7F0B0F95).setVisibility(8);  // id:connecting_text
        ((fyxk)object2).j.findViewById(0x7F0B0F92).setVisibility(0);  // id:connected_text
        ((fyxk)object2).j.findViewById(0x7F0B0DFE).setVisibility(8);  // id:cancel_image
    }
}

