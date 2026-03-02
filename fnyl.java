import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;

public final class fnyl implements Runnable {
    public final ExpressSignInLayout a;
    public final fnyo b;

    public fnyl(ExpressSignInLayout expressSignInLayout0, fnyo fnyo0) {
        this.a = expressSignInLayout0;
        this.b = fnyo0;
    }

    @Override
    public final void run() {
        gftb.z(this.a.a, "Internal layout should not be null after Express Sign In Layout was initialized()");
        this.b.a(this.a.a);
    }
}

