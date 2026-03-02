import android.app.Activity;
import android.view.View.OnClickListener;
import android.view.View;

public final class ekni implements View.OnClickListener {
    public final eknt a;
    public final Activity b;

    public ekni(eknt eknt0, Activity activity0) {
        this.a = eknt0;
        this.b = activity0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        eknt eknt0 = this.a;
        ekob ekob0 = eknt0.ai;
        if(ekob0 == null) {
            ibuq.j("safeBrowsingPreferenceController");
            ekob0 = null;
        }
        evql evql0 = ekob0.b.bK().g(new eknv());
        eknt.M(this.b, evql0, eknt0.d);
    }
}

