import android.content.Context;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.material.textview.MaterialTextView;

public final class yri extends MaterialTextView {
    public yri(Context context0) {
        super(context0);
        this.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    public yri(Context context0, String s) {
        this(context0);
        this.setText(s);
    }
}

