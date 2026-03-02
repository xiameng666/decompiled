import android.view.View;
import android.widget.TextView;

public final class bewx implements ibts {
    public final String a;
    public final bezu b;

    public bewx(String s, bezu bezu0) {
        this.a = s;
        this.b = bezu0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$SingleViewAdapter");
        ((TextView)view0.findViewById(0x7F0B1DB1)).setText(this.a);  // id:pwm_import_status_file_name
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1DB4);  // id:pwm_import_status_valid_passwords_count
        textView0.setText(textView0.getResources().getQuantityString(0x7F13005A, this.b.a.size(), new Object[]{this.b.a.size()}));  // plurals:pwm_import_preview_valid_passwords_count
        textView0.setVisibility(0);
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1DB2);  // id:pwm_import_status_invalid_passwords_count
        textView1.setText(textView1.getResources().getQuantityString(0x7F130059, this.b.b.size(), new Object[]{this.b.b.size()}));  // plurals:pwm_import_preview_invalid_passwords_count
        textView1.setVisibility(0);
        view0.findViewById(0x7F0B1DB5).setVisibility(0);  // id:pwm_import_status_warning_icon
        return ibom.a;
    }
}

