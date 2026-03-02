import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsInitiatorParams;
import com.google.android.gms.nearby.internal.connection.ReadAuthMessageParams;

public final class czde implements jqv {
    public final czdg a;
    public final ProviderAuthenticateAsInitiatorParams b;

    public czde(czdg czdg0, ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams0) {
        this.a = czdg0;
        this.b = providerAuthenticateAsInitiatorParams0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        czeo czeo0 = this.b.e;
        ReadAuthMessageParams readAuthMessageParams0 = new ReadAuthMessageParams();
        readAuthMessageParams0.a = new czdf(this.a, jqt0);
        czeo0.a(readAuthMessageParams0);
        return "readMessage operation";
    }
}

