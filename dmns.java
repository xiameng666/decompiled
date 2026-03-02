import android.view.View.OnClickListener;
import android.view.View;

public final class dmns implements View.OnClickListener {
    public final dmnu a;
    public final dmls b;

    public dmns(dmnu dmnu0, dmls dmls0) {
        this.a = dmnu0;
        this.b = dmls0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.y().g(this.b.c);
        this.a.y().f(dmov.c);
        this.a.y().e();
        this.a.y().d.a(hahw.g, 7);
    }
}

