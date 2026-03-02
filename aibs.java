import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import com.google.android.gms.auth.api.phone.ui.BrowserConsentChimeraActivity;
import j..util.Objects;

public final class aibs implements DialogInterface.OnCancelListener {
    final BrowserConsentChimeraActivity a;

    public aibs(BrowserConsentChimeraActivity browserConsentChimeraActivity0) {
        Objects.requireNonNull(browserConsentChimeraActivity0);
        this.a = browserConsentChimeraActivity0;
        super();
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.a.j.k(this.a.k, aicr.f(this.a.l, ghxn.a));
        this.a.a();
        this.a.finish();
    }
}

