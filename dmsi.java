import android.content.Intent;
import android.view.View;

public final class dmsi implements evqf {
    public final View a;
    public final Intent b;

    public dmsi(View view0, Intent intent0) {
        this.a = view0;
        this.b = intent0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.getContext().startActivity(this.b);
    }
}

