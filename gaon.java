import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class gaon implements gamu {
    private final ajes a;

    public gaon() {
        throw null;
    }

    public gaon(ajes ajes0) {
        this.a = ajes0;
    }

    @Override  // gamu
    public final ganp a(gano gano0) {
        Account account0 = gano0.f().a;
        String s = gano0.a.getStringExtra("extra_crypt_auth_client_name");
        gftb.check(s);
        String s1 = gano0.a.getStringExtra("extra_crypt_auth_key_name");
        gftb.check(s1);
        ajes ajes0 = this.a;
        KeyRegistrationResult keyRegistrationResult0 = gaon.c(ajes0, account0, s, s1);
        if(keyRegistrationResult0 == null) {
            return new ganp(ganp.d(2));
        }
        if(!ajev.c(keyRegistrationResult0.b.i)) {
            return new ganp(ganp.d(5));
        }
        KeyHandleResult keyHandleResult0 = gaon.b(ajes0, account0, s1);
        if(keyHandleResult0 == null) {
            return new ganp(ganp.d(3));
        }
        Intent intent0 = ganp.e(0);
        intent0.putExtra("extra_crypt_auth_response_key_handle", keyHandleResult0.b);
        return new ganp(intent0);
    }

    private static KeyHandleResult b(ajes ajes0, Account account0, String s) {
        try {
            return (KeyHandleResult)evrg.o(ajes0.b(s, account0), 3600000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return null;
        }
    }

    private static KeyRegistrationResult c(ajes ajes0, Account account0, String s, String s1) {
        evql evql0 = ajes0.i(1, gged_interceptors.l(s1), s, account0, null);
        try {
            return (KeyRegistrationResult)evrg.o(evql0, 3600000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return null;
        }
    }
}

