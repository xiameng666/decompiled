import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.chimera.android.Activity;

public final class bguq implements View.OnClickListener {
    public final bgur a;
    public final bgva b;

    public bguq(bgur bgur0, bgva bgva0) {
        this.a = bgur0;
        this.b = bgva0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        bgus bgus0 = this.a.a;
        Activity activity0 = (Activity)bgus0.getContext();
        if(activity0 != null) {
            activity0.startActivity(((Intent)this.b.f.get()));
            bgus0.al.k(this.b.g);
        }
    }
}

