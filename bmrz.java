import android.view.View.OnClickListener;
import android.view.View;

public final class bmrz implements View.OnClickListener {
    public final bmsd a;
    public final blhf b;

    public bmrz(bmsd bmsd0, blhf blhf0) {
        this.a = bmsd0;
        this.b = blhf0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.l(this.b);
        this.a.a.z(Boolean.valueOf(true));
    }
}

