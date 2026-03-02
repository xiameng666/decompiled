import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import com.google.android.material.button.MaterialButton;
import java.util.Set;

public final class bwci {
    public static final Set a;

    static {
        bwci.a = ibqg.c(new bwcj[]{bwcj.d, bwcj.e});
    }

    public static final View a(Activity activity0, ViewGroup viewGroup0, int v, int v1, int v2) {
        View view0 = activity0.getLayoutInflater().inflate(0x7F0E0333, viewGroup0, false);  // layout:error_page
        ((TextView)view0.findViewById(0x7F0B1297)).setText(view0.getResources().getString(v));  // id:error_page_title
        ((TextView)view0.findViewById(0x7F0B1296)).setText(view0.getResources().getString(v1));  // id:error_page_subtitle
        ((MaterialButton)view0.findViewById(0x7F0B1295)).setText(view0.getResources().getString(v2));  // id:error_page_retry_button
        return view0;
    }

    public static final bwcj b(Exception exception0) {
        if((exception0 instanceof acse)) {
            return bwcj.b;
        }
        if((exception0 instanceof iapl)) {
            switch(((iapl)exception0).a.t.ordinal()) {
                case 3: {
                    return bwcj.e;
                }
                case 5: {
                    return bwcj.d;
                }
                case 14: {
                    return bwcj.c;
                }
                default: {
                    return bwcj.a;
                }
            }
        }
        return bwcj.a;
    }

    public static View c(Activity activity0, ViewGroup viewGroup0, int v, int v1) {
        if((v1 & 2) != 0) {
            v = 0x7F153470;  // string:uiflow_general_error_title "Can\'t open page"
        }
        return bwci.a(activity0, viewGroup0, v, 0x7F15346F, 0x7F1508F2);  // string:uiflow_general_error_subtitle "Try again or check back in a few minutes"
    }
}

