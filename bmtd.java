import android.view.View.OnClickListener;
import android.view.View;

public final class bmtd implements View.OnClickListener {
    public final bmtj a;

    public bmtd(bmtj bmtj0) {
        this.a = bmtj0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.d.b(new bmtb(this.a));
    }
}

