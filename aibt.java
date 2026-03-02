import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.phone.ui.BrowserConsentChimeraActivity;
import j..util.Objects;

public final class aibt implements View.OnClickListener {
    final BrowserConsentChimeraActivity a;

    public aibt(BrowserConsentChimeraActivity browserConsentChimeraActivity0) {
        Objects.requireNonNull(browserConsentChimeraActivity0);
        this.a = browserConsentChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.j.k(this.a.k, aicr.f(this.a.l, ghxn.c));
        this.a.a();
        this.a.finish();
    }
}

