import android.view.View;
import android.widget.TextView;

public final class beyo implements ibts {
    public final String a;

    public beyo(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$SingleViewAdapter");
        ((TextView)view0.findViewById(0x7F0B1DB0)).setText(view0.getResources().getString(0x7F152707, new Object[]{this.a}));  // id:pwm_import_status_file_hint
        return ibom.a;
    }
}

