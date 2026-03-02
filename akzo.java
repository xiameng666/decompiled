import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class akzo {
    static final byte[] a(cchj cchj0, ajes ajes0, byte[] arr_b) {
        Account[] arr_account = cchj0.p("com.google");
        if(arr_account.length <= 0) {
            throw new akyq("No account to sign.");
        }
        Account account0 = arr_account[0];
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hhto.a).v_newBuilder();
        int v = hhtt.p.q;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hhto hhto0 = (hhto)hftp0.b_message;
        if(v == 0) {
            throw null;
        }
        hhto0.c = v - 1;
        hhto0.b |= 1;
        evql evql0 = ajes0.n(account0, new Payload(arr_b, ((hhto)hftp0.N_build()).toBytesArray(), new byte[0]));
        try {
            evrg.o(evql0, hpyh.b(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            throw new akyq(exception0);
        }
        SignedBlob signedBlob0 = (SignedBlob)evql0.j();
        if(signedBlob0 != null) {
            return signedBlob0.b;
        }
        throw new akyq("Signed blob is null.");
    }
}

