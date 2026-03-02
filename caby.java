import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class caby implements View.OnClickListener {
    final caca a;

    public caby(caca caca0) {
        Objects.requireNonNull(caca0);
        this.a = caca0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.ah.l("SetupFailureFragment.Retry");
        this.a.ah.s(true);
    }
}

