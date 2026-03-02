import android.view.View.OnClickListener;
import android.view.View;

public final class dmny implements View.OnClickListener {
    public final dmoc a;

    public dmny(dmoc dmoc0) {
        this.a = dmoc0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dmoc dmoc0 = this.a;
        dmpe dmpe0 = dmoc0.y();
        dmnc dmnc0 = dmoc0.d;
        edon edon0 = null;
        if(dmnc0 == null) {
            ibuq.j("factoryResetWizardCardAdapter");
            dmnc0 = null;
        }
        dmpe0.g(dmnc0.f());
        edon edon1 = dmoc0.b;
        if(edon1 == null) {
            ibuq.j("networkAccessChecker");
        }
        else {
            edon0 = edon1;
        }
        if(edon0.a()) {
            dmoc0.y().f(dmov.c);
            dmoc0.y().e();
            return;
        }
        dmoc0.y().f(dmov.d);
    }
}

