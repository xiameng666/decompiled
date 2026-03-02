import android.text.TextUtils;
import android.widget.Toast;

public final class bdcj implements ibts {
    public final bddc a;

    public bdcj(bddc bddc0) {
        this.a = bddc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Toast.makeText(this.a.requireContext(), TextUtils.expandTemplate(this.a.getResources().getText(0x7F152719), new CharSequence[]{((String)object0)}), 1).show();  // string:pwm_move_passwords_success_message "Passwords saved in your Google Account 
                                                                                                                                                                        // ^1"
        return ibom.a;
    }
}

