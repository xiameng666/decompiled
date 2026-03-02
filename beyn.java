import android.view.View;
import android.widget.TextView;

public final class beyn implements ibts {
    public final String a;
    public final bezx b;

    public beyn(String s, bezx bezx0) {
        this.a = s;
        this.b = bezx0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$SingleViewAdapter");
        ((TextView)view0.findViewById(0x7F0B1DB1)).setText(this.a);  // id:pwm_import_status_file_name
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1DB4);  // id:pwm_import_status_valid_passwords_count
        textView0.setText(textView0.getResources().getQuantityString(0x7F13005B, this.b.a, new Object[]{((int)this.b.a)}));  // plurals:pwm_import_result_imported_passwords_count
        textView0.setVisibility(0);
        view0.findViewById(0x7F0B1DB3).setVisibility(0);  // id:pwm_import_status_ok_icon
        return ibom.a;
    }
}

