import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class ermi implements View.OnClickListener {
    final ermn a;

    public ermi(ermn ermn0) {
        Objects.requireNonNull(ermn0);
        this.a = ermn0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.b.F(this.a.y(null));
    }
}

