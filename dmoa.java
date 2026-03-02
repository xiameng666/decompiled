import android.view.View;
import android.widget.Button;

public final class dmoa implements ibth {
    public final View a;
    public final dmoc b;

    public dmoa(View view0, dmoc dmoc0) {
        this.a = view0;
        this.b = dmoc0;
    }

    @Override  // ibth
    public final Object a() {
        Button button0 = (Button)this.a.findViewById(0x7F0B06B2);  // id:PrimaryActionButton
        dmnc dmnc0 = this.b.d;
        if(dmnc0 == null) {
            ibuq.j("factoryResetWizardCardAdapter");
            dmnc0 = null;
        }
        button0.setEnabled(((boolean)(dmnc0.f().isEmpty() ^ 1)));
        return ibom.a;
    }
}

