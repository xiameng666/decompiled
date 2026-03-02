import android.view.View.OnClickListener;
import android.view.View;

public final class csbi implements View.OnClickListener {
    public final cscb a;

    public csbi(cscb cscb0) {
        this.a = cscb0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.getSupportFragmentManager().U();
    }
}

