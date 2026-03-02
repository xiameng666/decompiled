import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsResponderParams;
import com.google.android.gms.nearby.internal.connection.ReadAuthMessageParams;

public final class czdi implements jqv {
    public final czdk a;
    public final ProviderAuthenticateAsResponderParams b;

    public czdi(czdk czdk0, ProviderAuthenticateAsResponderParams providerAuthenticateAsResponderParams0) {
        this.a = czdk0;
        this.b = providerAuthenticateAsResponderParams0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        czeo czeo0 = this.b.c;
        ReadAuthMessageParams readAuthMessageParams0 = new ReadAuthMessageParams();
        readAuthMessageParams0.a = new czdj(this.a, jqt0);
        czeo0.a(readAuthMessageParams0);
        return "readMessage operation";
    }
}

