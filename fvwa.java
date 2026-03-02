import android.view.View;
import android.widget.TextView;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;

public final class fvwa extends uq {
    final TextView t;

    public fvwa(View view0, fvvz fvvz0, EAlertUxArgs eAlertUxArgs0) {
        super(view0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B11EC);  // id:eew_feedback_survey_link
        this.t = textView0;
        textView0.setClickable(true);
        textView0.setPaintFlags(textView0.getPaintFlags() | 8);
        textView0.setOnClickListener(new fvvy(this, fvvz0, eAlertUxArgs0));
    }
}

