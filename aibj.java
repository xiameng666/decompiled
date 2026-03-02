import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.phone.ui.AutofillConsentChimeraActivity;
import j..util.Objects;

public final class aibj implements View.OnClickListener {
    final AutofillConsentChimeraActivity a;

    public aibj(AutofillConsentChimeraActivity autofillConsentChimeraActivity0) {
        Objects.requireNonNull(autofillConsentChimeraActivity0);
        this.a = autofillConsentChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.j.k(this.a.k, aicr.a(this.a.l, ghxn.b));
        this.a.m.f();
        this.a.setResult(-1);
        this.a.finish();
    }
}

