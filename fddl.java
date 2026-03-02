import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;

public final class fddl implements View.OnClickListener {
    public final fdds a;

    public fddl(fdds fdds0) {
        this.a = fdds0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(Log.isLoggable("wearable.Consents", 4)) {
            Log.i("wearable.Consents", "[ConsentFragment] cancelling activity");
        }
        fdds fdds0 = this.a;
        fdak fdak0 = fdds0.a;
        if(fdak0 != null) {
            fdak0.setResult(0);
            fdds0.a.finish();
        }
    }
}

