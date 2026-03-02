import android.view.View;
import android.widget.TextView;
import com.google.android.gms.credential.manager.passwordimport.ImportPreviewFragment;

public final class bexe implements ibts {
    public final String a;
    public final ImportPreviewFragment b;

    public bexe(String s, ImportPreviewFragment importPreviewFragment0) {
        this.a = s;
        this.b = importPreviewFragment0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((View)object0), "$this$SingleViewAdapter");
        ((TextView)((View)object0).findViewById(0x7F0B1DB1)).setText(this.a);  // id:pwm_import_status_file_name
        TextView textView0 = (TextView)((View)object0).findViewById(0x7F0B1DAE);  // id:pwm_import_status_error_message
        bgmo bgmo0 = this.b.b;
        if(bgmo0 == null) {
            ibuq.j("learnMoreUtility");
            bgmo0 = null;
        }
        ibuq.c(textView0);
        ibuq.e(bgmm.c, "PASSWORD_IMPORT_HELPCENTER_URL");
        bgmo0.a(textView0, 0x7F1526FC, bgmm.c);  // string:pwm_import_preview_unsupported_format_error "Your import file is using an 
                                                 // unsupported format. ^1"
        textView0.setVisibility(0);
        ((View)object0).findViewById(0x7F0B1DAD).setVisibility(0);  // id:pwm_import_status_error_icon
        return ibom.a;
    }
}

