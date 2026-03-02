import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class acdj implements View.OnClickListener {
    final acdn a;

    public acdj(acdn acdn0) {
        Objects.requireNonNull(acdn0);
        this.a = acdn0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.f.J(true);
    }
}

