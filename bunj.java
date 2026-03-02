import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class bunj extends ConstraintLayout {
    public final View h;
    public final TextView i;
    public final TextView j;
    public final ImageView k;
    public final ConstraintLayout l;
    public String m;
    public String n;
    private final LinearLayout o;

    public bunj(Context context0) {
        super(context0, null);
        this.h = LayoutInflater.from(context0).inflate(0x7F0E01E7, this, true);  // layout:cleanup_your_device_view
        this.i = (TextView)kfb.b(this, 0x7F0B22B8);  // id:title
        LinearLayout linearLayout0 = (LinearLayout)kfb.b(this, 0x7F0B111C);  // id:device_items_container
        this.o = linearLayout0;
        ConstraintLayout constraintLayout0 = (ConstraintLayout)LayoutInflater.from(linearLayout0.getContext()).inflate(0x7F0E01E6, linearLayout0, false);  // layout:cleanup_your_device_item
        this.l = constraintLayout0;
        this.j = (TextView)kfb.b(constraintLayout0, 0x7F0B0BC4);  // id:app_name
        this.k = (ImageView)kfb.b(constraintLayout0, 0x7F0B0BC3);  // id:app_logo
        linearLayout0.addView(constraintLayout0);
    }
}

