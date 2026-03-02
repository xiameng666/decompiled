import android.view.View.OnClickListener;
import android.view.View;

public final class fmon implements View.OnClickListener {
    public final fmqf a;
    public final fmlm b;

    public fmon(fmqf fmqf0, fmlm fmlm0) {
        this.a = fmqf0;
        this.b = fmlm0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a(this.b.d);
    }
}

