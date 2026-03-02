import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import java.util.Locale;

public final class fvvu extends uq {
    public final Context t;

    public fvvu(View view0, EAlertUxArgs eAlertUxArgs0) {
        super(view0);
        Context context0 = view0.getContext();
        this.t = context0;
        ((TextView)view0.findViewById(0x7F0B0A2A)).setText(String.format(Locale.getDefault(), "Earthquake alerts and info are provided by %1$s.", context0.getString((eAlertUxArgs0.m == 2 ? 0x7F151468 : 0x7F152B51))));  // id:about_details
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0A2B);  // id:about_details_link
        textView0.setClickable(true);
        textView0.setPaintFlags(textView0.getPaintFlags() | 8);
        textView0.setOnClickListener(new fvvt(this, eAlertUxArgs0));
    }
}

