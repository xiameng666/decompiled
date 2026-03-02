import android.view.View.OnClickListener;
import android.view.View;

public final class dnhv implements View.OnClickListener {
    public final dnhw a;
    public final dxev b;
    public final hkhs c;

    public dnhv(dnhw dnhw0, dxev dxev0, hkhs hkhs0) {
        this.a = dnhw0;
        this.b = dxev0;
        this.c = hkhs0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.v.a.g(this.b, this.c, 22);
    }
}

