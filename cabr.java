import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class cabr implements View.OnClickListener {
    final boolean a;
    final Intent b;
    final cabs c;

    public cabr(cabs cabs0, boolean z, Intent intent0) {
        this.a = z;
        this.b = intent0;
        Objects.requireNonNull(cabs0);
        this.c = cabs0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.a) {
            try {
                this.c.startActivity(this.b);
            }
            catch(ActivityNotFoundException activityNotFoundException0) {
                Log.e("RestoreSupervisorFragment", "Exception: ", activityNotFoundException0);
            }
        }
        this.c.ah.l((this.a ? "RestoreSupervisorFragment.OpenInWeb" : "RestoreSupervisorFragment.Cancel"));
        this.c.ag.o();
    }
}

