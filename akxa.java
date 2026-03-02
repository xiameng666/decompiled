import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class akxa {
    public static final int a;
    private static final baun b;

    static {
        akxa.b = new baun("ProximityAuth", new String[]{"KeyAgreementPerformer"});
    }

    public static final byte[] a(Context context0, byte[] arr_b) {
        aliu aliu0 = new aliu();
        List list0 = bbmn.h(context0.getApplicationContext(), "com.google.android.gms");
        if(list0.isEmpty()) {
            akxa.b.m("No account found", new Object[0]);
            aliu0.D(5);
            return null;
        }
        Account account0 = (Account)list0.get(0);
        evql evql0 = new ajes(context0).h(account0, new ClientPublicKey(arr_b));
        try {
            alit alit0 = aliu0.a("key_agreement_execution_time");
            evrg.o(evql0, hpyh.b(), TimeUnit.MILLISECONDS);
            aliu0.X(alit0);
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
                aliu0.D(3);
            }
            else if((exception0 instanceof TimeoutException)) {
                aliu0.D(1);
            }
            else {
                aliu0.D(2);
            }
            akxa.b.m("Failed to perform key agreement.", new Object[0]);
            return null;
        }
        ExportedSymmetricKey exportedSymmetricKey0 = (ExportedSymmetricKey)evql0.j();
        if(exportedSymmetricKey0 == null) {
            akxa.b.m("Null exported symmetric key", new Object[0]);
            aliu0.D(4);
            return null;
        }
        aliu0.D(0);
        return exportedSymmetricKey0.b;
    }
}

