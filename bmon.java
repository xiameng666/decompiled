import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;

public final class bmon implements Runnable {
    public final AuthenticateChimeraActivity a;

    public bmon(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        this.a = authenticateChimeraActivity0;
    }

    @Override
    public final void run() {
        lqi lqi0 = this.a.s.a;
        bmou bmou0 = new bmou(this.a);
        lqi0.g(this.a, bmou0);
    }
}

