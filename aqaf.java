import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class aqaf extends uq {
    public final ImageView t;
    public final ImageView u;
    public final TextView v;
    public final TextView w;

    public aqaf(View view0) {
        super(view0);
        this.t = (ImageView)view0.findViewById(0x1020007);
        this.u = (ImageView)view0.findViewById(0x1020008);
        this.v = (TextView)view0.findViewById(0x1020014);
        this.w = (TextView)view0.findViewById(0x1020015);
    }

    public final void D(boolean z) {
        this.a.setEnabled(z);
        this.v.setEnabled(z);
        this.w.setEnabled(z);
    }
}

