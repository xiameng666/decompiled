import android.view.View.OnClickListener;
import android.view.View;
import j..util.Objects;

final class cabq implements View.OnClickListener {
    final cabs a;

    public cabq(cabs cabs0) {
        Objects.requireNonNull(cabs0);
        this.a = cabs0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.ah.l("RestoreSupervisorFragment.Restore");
        this.a.ah.a();
    }
}

