import android.view.View.OnClickListener;
import android.view.View;

public final class csbm implements View.OnClickListener {
    public final cscb a;

    public csbm(cscb cscb0) {
        this.a = cscb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.finishAffinity();
    }
}

