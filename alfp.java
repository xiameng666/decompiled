import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.MutableBoolean;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class alfp extends cjtm {
    static final long a;
    private static final baun b;
    private final alia c;
    private final ajes d;

    static {
        alfp.b = new baun("ProximityAuth", new String[]{"GetMyPublicKey"});
        alfp.a = TimeUnit.SECONDS.toMillis(5L);
    }

    public alfp(alia alia0, azug azug0) {
        ajes ajes0 = new ajes(AppContextProvider.a());
        super(0x90, "GetMyPublicKey", azug0);
        this.c = alia0;
        this.d = ajes0;
    }

    public static byte[] b(Context context0) {
        MutableBoolean mutableBoolean0 = new MutableBoolean(false);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        alfp alfp0 = new alfp(new alhz(byteArrayOutputStream0, mutableBoolean0), null);
        try {
            alfp0.f(context0);
            return mutableBoolean0.value ? byteArrayOutputStream0.toByteArray() : null;
        }
        catch(cjuh | RemoteException unused_ex) {
            alfp.b.m("Failed to fetch public key.", new Object[0]);
            return null;
        }
    }

    @Override  // cjtm
    public final void f(Context context0) {
        CryptauthPublicKey cryptauthPublicKey0;
        List list0 = bbmn.h(context0, "com.google.android.gms");
        if(list0.isEmpty()) {
            throw new cjuh(8, "No account found");
        }
        try {
            Account account0 = (Account)list0.get(0);
            evql evql0 = this.d.k(account0);
            evrg.o(evql0, alfp.a, TimeUnit.MILLISECONDS);
            cryptauthPublicKey0 = (CryptauthPublicKey)evql0.j();
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            throw new cjuh(8, exception0.getMessage());
        }
        if(cryptauthPublicKey0 == null) {
            throw new cjuh(8, "Null public key");
        }
        this.c.a(Status.b, cryptauthPublicKey0.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.c.a(status0, null);
    }
}

