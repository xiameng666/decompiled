import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class acdk implements View.OnClickListener {
    final acdn a;

    public acdk(acdn acdn0) {
        Objects.requireNonNull(acdn0);
        this.a = acdn0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.f.J(false);
    }
}

