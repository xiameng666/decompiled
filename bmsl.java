import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;

public final class bmsl implements Runnable {
    public final bmsp a;

    public bmsl(bmsp bmsp0) {
        this.a = bmsp0;
    }

    @Override
    public final void run() {
        this.a.b.k.ii(((BrowserPublicKeyCredentialCreationOptions)this.a.b.x));
        this.a.y();
    }
}

