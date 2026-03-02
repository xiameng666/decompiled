import android.view.View;
import android.widget.TextView;

public final class bexa implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        View view0 = (View)object0;
        ibuq.f(view0, "$this$SingleViewAdapter");
        ((TextView)view0.findViewById(0x7F0B1DB1)).setVisibility(8);  // id:pwm_import_status_file_name
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1DAF);  // id:pwm_import_status_error_message_file_name_unknown
        textView0.setText("Unable to read the import file");
        textView0.setVisibility(0);
        view0.findViewById(0x7F0B1DAD).setVisibility(0);  // id:pwm_import_status_error_icon
        return ibom.a;
    }
}

