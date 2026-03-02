import android.support.v7.widget.SwitchCompat;
import android.view.View;

public final class bdgh implements ibts {
    public final View a;
    public final SwitchCompat b;

    public bdgh(View view0, SwitchCompat switchCompat0) {
        this.a = view0;
        this.b = switchCompat0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        int v = (int)(((Integer)object0));
        this.a.findViewById(0x7F0B1DD9).setVisibility(v);  // id:pwm_password_alert_switch_title
        this.a.findViewById(0x7F0B1DD8).setVisibility(v);  // id:pwm_password_alert_switch_description
        this.b.setVisibility(v);
        return ibom.a;
    }
}

