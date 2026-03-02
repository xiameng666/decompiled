import android.view.View;
import android.widget.TextView;

public final class bexb implements ibts {
    public final String a;
    public final int b;

    public bexb(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$SingleViewAdapter");
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1DB1);  // id:pwm_import_status_file_name
        textView0.setText(this.a);
        textView0.setVisibility(0);
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1DAE);  // id:pwm_import_status_error_message
        textView1.setText(textView1.getResources().getString(this.b));
        textView1.setVisibility(0);
        view0.findViewById(0x7F0B1DAD).setVisibility(0);  // id:pwm_import_status_error_icon
        return ibom.a;
    }
}

