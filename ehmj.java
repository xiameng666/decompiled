import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.permissions.serviceinfo.ui.LearnMoreFooterPreference;

public final class ehmj implements View.OnClickListener {
    public final LearnMoreFooterPreference a;
    public final ehny b;
    public final ehmo c;

    public ehmj(LearnMoreFooterPreference learnMoreFooterPreference0, ehny ehny0, ehmo ehmo0) {
        this.a = learnMoreFooterPreference0;
        this.b = ehny0;
        this.c = ehmo0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        cmeb cmeb0 = this.a.c;
        if(cmeb0 == null) {
            ibuq.j("visualElement");
            cmeb0 = null;
        }
        cmeb0.a(gltz.e);
        this.b.b().a(ehnc.b(this.c));
    }
}

