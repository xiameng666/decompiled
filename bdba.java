import android.text.method.PasswordTransformationMethod;
import android.view.View.OnClickListener;
import android.view.View;

public final class bdba implements View.OnClickListener {
    public final bdbg a;
    public final bdbf b;

    public bdba(bdbg bdbg0, bdbf bdbf0) {
        this.a = bdbg0;
        this.b = bdbf0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bdbf bdbf0 = this.b;
        if(bdbf0.B) {
            PasswordTransformationMethod passwordTransformationMethod0 = PasswordTransformationMethod.getInstance();
            bdbf0.u.setTransformationMethod(passwordTransformationMethod0);
            bdbf0.A.v(0x7F080C58);  // drawable:quantum_gm_ic_visibility_vd_theme_24
            bdbf0.A.setContentDescription("Reveal password");
            bdbf0.B = false;
            return;
        }
        bdbf0.u.setTransformationMethod(null);
        bdbf0.A.v(0x7F080C57);  // drawable:quantum_gm_ic_visibility_off_vd_theme_24
        bdbf0.A.setContentDescription("Hide password");
        bdbf0.B = true;
        this.a.h.a.c.a(true);
    }
}

