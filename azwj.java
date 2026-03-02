import com.google.android.gms.common.ConnectionResult;
import j..util.Objects;

final class azwj extends azwy {
    final ConnectionResult a;
    final azwl b;

    public azwj(azwl azwl0, azwx azwx0, ConnectionResult connectionResult0) {
        this.a = connectionResult0;
        Objects.requireNonNull(azwl0);
        this.b = azwl0;
        super(azwx0);
    }

    @Override  // azwy
    public final void a() {
        this.b.a.j(this.a);
    }
}

