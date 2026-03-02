import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;

public final class ereo implements evpo {
    public final Challenge a;
    public final byte[] b;

    public ereo(Challenge challenge0, byte[] arr_b) {
        this.a = challenge0;
        this.b = arr_b;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        byte[] arr_b = ((SignCryptedBlob)evql0.j()).c;
        return new Assertion(this.a.c, this.b, arr_b, this.a.f, this.a.e);
    }
}

