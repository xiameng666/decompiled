import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;
import com.google.android.gms.auth.authzen.EncryptionKey;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aihy extends aihu {
    private final AuthzenPublicKey a;
    private final aijm b;

    public aihy(aijm aijm0, AuthzenPublicKey authzenPublicKey0) {
        super("PerformKeyAgreementForProximity");
        batl.s(aijm0);
        this.b = aijm0;
        this.a = authzenPublicKey0;
    }

    @Override  // aihu
    protected final void b(Context context0) {
        EncryptionKey encryptionKey0;
        Account[] arr_account = cchj.b(context0).p("com.google");
        if(arr_account.length <= 0) {
            throw new cjuh(8, "No account found");
        }
        try {
            Account account0 = arr_account[0];
            encryptionKey0 = new EncryptionKey(1, ((ExportedSymmetricKey)aihk.a(new ajes(context0).h(account0, new ClientPublicKey(this.a.b)))).b);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            throw new cjuh(8, exception0.getMessage());
        }
        Bundle bundle0 = new aijp(Status.b, encryptionKey0).b();
        this.b.a(bundle0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Bundle bundle0 = new aijp(status0, null).b();
        this.b.a(bundle0);
    }
}

