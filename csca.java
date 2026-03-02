import android.view.View.OnClickListener;
import android.view.View;

public final class csca implements View.OnClickListener {
    public final cscb a;

    public csca(cscb cscb0) {
        this.a = cscb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.finishAffinity();
    }
}

