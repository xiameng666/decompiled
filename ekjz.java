import android.view.View.OnClickListener;
import android.view.View;

public final class ekjz implements View.OnClickListener {
    public final ekke a;
    public final String b;

    public ekjz(ekke ekke0, String s) {
        this.a = ekke0;
        this.b = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.e.y(this.b);
    }
}

