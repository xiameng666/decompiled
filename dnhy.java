import android.view.View.OnClickListener;
import android.view.View;

public final class dnhy implements View.OnClickListener {
    public final dnia a;
    public final dxev b;

    public dnhy(dnia dnia0, dxev dxev0) {
        this.a = dnia0;
        this.b = dxev0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.a.g(this.b, this.a.f, 22);
    }
}

