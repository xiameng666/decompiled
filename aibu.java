import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.phone.ui.BrowserConsentChimeraActivity;
import j..util.Objects;

public final class aibu implements View.OnClickListener {
    final BrowserConsentChimeraActivity a;

    public aibu(BrowserConsentChimeraActivity browserConsentChimeraActivity0) {
        Objects.requireNonNull(browserConsentChimeraActivity0);
        this.a = browserConsentChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.j.k(this.a.k, aicr.f(this.a.l, ghxn.b));
        this.a.m.d();
        this.a.setResult(-1);
        this.a.finish();
    }
}

