import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;

public final class eytt {
    public static final void a(eytv eytv0, CharSequence charSequence0, boolean z, CharSequence charSequence1, String s, eytc eytc0, eytc eytc1) {
        iw iw0 = (iw)eytv0.requireDialog();
        iw0.setTitle(charSequence0);
        iw0.e((z ? 0x7F08067E : 0));  // drawable:gs_watch_fill1_vd_theme_24
        TextView textView0 = (TextView)iw0.requireViewById(0x7F0B1252);  // id:enrollment_dialog_message
        textView0.setText(charSequence1);
        textView0.setVisibility(0);
        if(s != null) {
            eyzy eyzy0 = eytv0.ag;
            if(eyzy0 == null) {
                ibuq.j("googleHelpLauncherHelper");
                eyzy0 = null;
            }
            ibuq.c(textView0);
            eyzy0.b(textView0, s);
        }
        ((CircularProgressIndicator)iw0.requireViewById(0x7F0B0F0A)).setVisibility(8);  // id:circular_progress_indicator
        Button button0 = iw0.b(-2);
        if(eytc0 == null) {
            ibuq.c(button0);
            eytt.d(button0, eytv0.y());
        }
        else {
            ibuq.c(button0);
            eyth eyth0 = new eyth(eytc0);
            eytt.e(button0, eytc0.a, eyth0);
        }
        Button button1 = iw0.b(-1);
        ibuq.c(button1);
        eyti eyti0 = new eyti(eytc1);
        eytt.e(button1, eytc1.a, eyti0);
    }

    public static final void b(eytv eytv0, int v) {
        iw iw0 = (iw)eytv0.requireDialog();
        iw0.setTitle(eytv0.requireContext().getString(v));
        iw0.e(0);
        TextView textView0 = (TextView)iw0.requireViewById(0x7F0B1252);  // id:enrollment_dialog_message
        textView0.setText(null);
        textView0.setVisibility(8);
        ((CircularProgressIndicator)iw0.requireViewById(0x7F0B0F0A)).setVisibility(0);  // id:circular_progress_indicator
        Button button0 = iw0.b(-2);
        ibuq.e(button0, "getButton(...)");
        eytt.d(button0, eytv0.y());
        Button button1 = iw0.b(-1);
        ibuq.e(button1, "getButton(...)");
        eytt.d(button1, eytv0.z());
    }

    static void c(eytv eytv0, CharSequence charSequence0, boolean z, CharSequence charSequence1, eytc eytc0, eytc eytc1, int v) {
        if((v & 16) != 0) {
            eytc0 = null;
        }
        eytt.a(eytv0, charSequence0, ((boolean)(((int)z) & ((v & 2) == 0 ? 1 : 0))), charSequence1, null, eytc0, eytc1);
    }

    private static final void d(Button button0, String s) {
        button0.setText(s);
        button0.setOnClickListener(null);
        button0.setVisibility(4);
    }

    private static final void e(Button button0, int v, View.OnClickListener view$OnClickListener0) {
        String s = button0.getContext().getString(v);
        ibuq.e(s, "getString(...)");
        button0.setText(s);
        button0.setOnClickListener(view$OnClickListener0);
        button0.setVisibility(0);
    }
}

