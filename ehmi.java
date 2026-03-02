import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.permissions.serviceinfo.ui.LearnMoreTopIntroPreference;

public final class ehmi implements View.OnClickListener {
    public final LearnMoreTopIntroPreference a;
    public final ehny b;
    public final ehmo c;

    public ehmi(LearnMoreTopIntroPreference learnMoreTopIntroPreference0, ehny ehny0, ehmo ehmo0) {
        this.a = learnMoreTopIntroPreference0;
        this.b = ehny0;
        this.c = ehmo0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        cmeb cmeb0 = this.a.d;
        if(cmeb0 == null) {
            ibuq.j("visualElement");
            cmeb0 = null;
        }
        cmeb0.a(gltz.e);
        this.b.c().a(ehnc.b(this.c));
    }
}

