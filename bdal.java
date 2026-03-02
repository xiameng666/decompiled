import android.text.method.PasswordTransformationMethod;
import android.view.View.OnClickListener;
import android.view.View;

public final class bdal implements View.OnClickListener {
    public final bdau a;
    public final bdat b;

    public bdal(bdau bdau0, bdat bdat0) {
        this.a = bdau0;
        this.b = bdat0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bdak bdak0 = this.a.f;
        bdat bdat0 = this.b;
        if(bdat0.H) {
            bdat0.H = false;
            PasswordTransformationMethod passwordTransformationMethod0 = PasswordTransformationMethod.getInstance();
            bdat0.t.setTransformationMethod(passwordTransformationMethod0);
            bdat0.v.v(0x7F080C58);  // drawable:quantum_gm_ic_visibility_vd_theme_24
            bdat0.v.setContentDescription("Reveal password");
            bdak0.e.a(gqsm.MC);
            return;
        }
        bdat0.H = true;
        bdat0.t.setTransformationMethod(null);
        bdat0.v.v(0x7F080C57);  // drawable:quantum_gm_ic_visibility_off_vd_theme_24
        bdat0.v.setContentDescription("Hide password");
        ((xob)bdak0.d.getContext()).getWindow().setFlags(0x2000, 0x2000);
        bdak0.e.a(gqsm.MB);
    }
}

