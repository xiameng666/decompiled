import android.view.View.OnClickListener;
import android.view.View;
import java.util.List;

public final class fcjm implements View.OnClickListener {
    public final fcjn a;
    public final List b;
    public final int c;

    public fcjm(fcjn fcjn0, List list0, int v) {
        this.a = fcjn0;
        this.b = list0;
        this.c = v;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        aqfl aqfl0 = (aqfl)this.b.get(this.c);
        this.a.f.ii(aqfl0);
    }
}

