import android.net.ConnectivityManager.OnNetworkActiveListener;
import j..util.Objects;

final class fvet implements ConnectivityManager.OnNetworkActiveListener {
    final fvev a;

    public fvet(fvev fvev0) {
        Objects.requireNonNull(fvev0);
        this.a = fvev0;
        super();
    }

    @Override  // android.net.ConnectivityManager$OnNetworkActiveListener
    public final void onNetworkActive() {
        fves fves0 = new fves(this);
        this.a.f.execute(fves0);
    }
}

