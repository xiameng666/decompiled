import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.auth.api.phone.ui.AutofillConsentChimeraActivity;
import j..util.Objects;

public final class aibi implements View.OnClickListener {
    final AutofillConsentChimeraActivity a;

    public aibi(AutofillConsentChimeraActivity autofillConsentChimeraActivity0) {
        Objects.requireNonNull(autofillConsentChimeraActivity0);
        this.a = autofillConsentChimeraActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        AutofillConsentChimeraActivity autofillConsentChimeraActivity0 = this.a;
        if(autofillConsentChimeraActivity0.m.b() <= 0) {
            autofillConsentChimeraActivity0.m.h(autofillConsentChimeraActivity0.m.b() + 1);
        }
        else {
            autofillConsentChimeraActivity0.j.k(autofillConsentChimeraActivity0.k, aicr.a(autofillConsentChimeraActivity0.l, ghxn.c));
            autofillConsentChimeraActivity0.m.e();
            autofillConsentChimeraActivity0.setResult(0);
        }
        autofillConsentChimeraActivity0.finish();
    }
}

