import android.view.View.OnClickListener;
import android.view.View;

public final class akpx implements View.OnClickListener {
    public final akqa a;
    public final akqh b;

    public akpx(akqa akqa0, akqh akqh0) {
        this.a = akqa0;
        this.b = akqh0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.b.a(this.a.a, 2);
    }
}

