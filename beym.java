import android.view.View;
import android.widget.TextView;

public final class beym implements ibts {
    public final String a;
    public final bezy b;

    public beym(String s, bezy bezy0) {
        this.a = s;
        this.b = bezy0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$SingleViewAdapter");
        ((TextView)view0.findViewById(0x7F0B1DB1)).setText(this.a);  // id:pwm_import_status_file_name
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1DB2);  // id:pwm_import_status_invalid_passwords_count
        textView0.setText(textView0.getResources().getQuantityString(0x7F13005C, this.b.a, new Object[]{((int)this.b.a)}));  // plurals:pwm_import_result_not_imported_passwords_count
        textView0.setVisibility(0);
        view0.findViewById(0x7F0B1DAD).setVisibility(0);  // id:pwm_import_status_error_icon
        return ibom.a;
    }
}

