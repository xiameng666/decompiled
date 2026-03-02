import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.ProviderAuthenticateAsInitiatorParams;
import com.google.android.gms.nearby.internal.connection.SendAuthMessageParams;
import j..util.Objects;
import java.util.concurrent.ExecutionException;

final class czdg implements cuuy {
    final ProviderAuthenticateAsInitiatorParams a;

    public czdg(czdh czdh0, ProviderAuthenticateAsInitiatorParams providerAuthenticateAsInitiatorParams0) {
        this.a = providerAuthenticateAsInitiatorParams0;
        Objects.requireNonNull(czdh0);
        super();
    }

    @Override  // cuuy
    public final void a(byte[] arr_b) {
        try {
            czeo czeo0 = this.a.e;
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
            return (byte[])jqy.a(new czde(this, this.a)).get();
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

