import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;
import j..util.Objects;

final class cabz implements View.OnClickListener {
    final boolean a;
    final Intent b;
    final caca c;

    public cabz(caca caca0, boolean z, Intent intent0) {
        this.a = z;
        this.b = intent0;
        Objects.requireNonNull(caca0);
        this.c = caca0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.a) {
            try {
                this.c.startActivity(this.b);
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.e("SetupFailureFragment", "Exception: ", activityNotFoundException0);
            }
        }
        this.c.ah.l((this.a ? "SetupFailureFragment.OpenInWeb" : "SetupFailureFragment.Cancel"));
        OptInChimeraActivity optInChimeraActivity0 = this.c.ah;
        optInChimeraActivity0.setResult(1);
        optInChimeraActivity0.g();
    }
}

