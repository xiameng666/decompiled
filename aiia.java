import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.authzen.AuthzenPublicKey;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aiia extends aihz {
    private final aijm a;

    public aiia(aijm aijm0) {
        super("GetAsymmetricPublicKey");
        this.a = aijm0;
    }

    @Override  // aihz
    protected final void b(Context context0) {
        AuthzenPublicKey authzenPublicKey0;
        Account[] arr_account = cchj.b(context0).p("com.google");
        if(arr_account.length <= 0) {
            throw new cjuh(8, "No account found");
        }
        try {
            authzenPublicKey0 = new AuthzenPublicKey(1, aihk.b(context0, arr_account[0]).b);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            throw new cjuh(8, exception0.getMessage());
        }
        Bundle bundle0 = new aijp(Status.b, authzenPublicKey0).b();
        this.a.a(bundle0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        Bundle bundle0 = new aijp(status0, null).b();
        this.a.a(bundle0);
    }
}

