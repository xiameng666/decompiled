import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.chimera.android.Activity;

public final class bguc implements View.OnClickListener {
    public final bguf a;
    public final Intent b;
    public final bgva c;

    public bguc(bguf bguf0, Intent intent0, bgva bgva0) {
        this.a = bguf0;
        this.b = intent0;
        this.c = bgva0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bgug bgug0 = this.a.a;
        Activity activity0 = (Activity)bgug0.getContext();
        if(activity0 != null) {
            activity0.startActivity(this.b);
            bgug0.ak.k(this.c.g);
        }
    }
}

