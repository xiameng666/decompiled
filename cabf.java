import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;
import j..util.Objects;

public final class cabf implements View.OnClickListener {
    final OptInChimeraActivity a;

    public cabf(OptInChimeraActivity optInChimeraActivity0) {
        Objects.requireNonNull(optInChimeraActivity0);
        this.a = optInChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.q.b("OptInActivity.onEmptyPressed");
        this.a.n();
    }
}

