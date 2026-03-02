import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsResponderParams;
import com.google.android.gms.nearby.internal.connection.SendAuthMessageParams;
import j..util.Objects;
import java.util.concurrent.ExecutionException;

final class czdk implements cuuy {
    final ProviderAuthenticateAsResponderParams a;

    public czdk(czdl czdl0, ProviderAuthenticateAsResponderParams providerAuthenticateAsResponderParams0) {
        this.a = providerAuthenticateAsResponderParams0;
        Objects.requireNonNull(czdl0);
        super();
    }

    @Override  // cuuy
    public final void a(byte[] arr_b) {
        try {
            czeo czeo0 = this.a.c;
            SendAuthMessageParams sendAuthMessageParams0 = new SendAuthMessageParams();
            sendAuthMessageParams0.a = arr_b;
            czeo0.c(sendAuthMessageParams0);
        }
        catch(RemoteException remoteException0) {
            throw new cuux(remoteException0);
        }
    }

    @Override  // cuuy
    public final byte[] b() {
        try {
            return (byte[])jqy.a(new czdi(this, this.a)).get();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new cuux(interruptedException0);
        }
        catch(ExecutionException executionException0) {
            throw new cuux(executionException0);
        }
    }
}

