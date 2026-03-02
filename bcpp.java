import android.view.View.OnClickListener;
import android.view.View;

public final class bcpp implements View.OnClickListener {
    public final Runnable a;

    public bcpp(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.run();
    }
}

