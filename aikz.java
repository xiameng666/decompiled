import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class aikz {
    public static final baun a;

    static {
        aikz.a = new baun(new String[]{"TransactionBackend"});
    }

    public static boolean a(int v) {
        return (hpqx.a.c().a() & ((long)v)) != 0L;
    }

    public static void b() {
        try {
            Thread.sleep(500L);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    public static final void c(Context context0, int v, Exception exception0, byte[] arr_b) {
        aiju aiju0 = new aiju(context0);
        aiju0.b(arr_b);
        aiju0.d = 4;
        aiju0.c = (long)v;
        aiju0.a();
        aikz.a.g("Error sending message to server. Try " + (v + 1), exception0, new Object[0]);
    }

    public static final void d(int v, Context context0, byte[] arr_b, int v1) {
        aiju aiju0 = new aiju(context0);
        aiju0.b(arr_b);
        aiju0.e = v;
        aiju0.f = v1;
        aiju0.a();
    }

    public static final String e(hhts hhts0, String s, Context context0, byte[] arr_b, int v) {
        aikz.d(21, context0, arr_b, v);
        Account account0 = new Account(s, "com.google");
        try {
            String s1 = bbmu.c(aihk.c(context0, hhts0.a, hhts0.b, account0));
            aikz.d(22, context0, arr_b, v);
            return s1;
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception0) {
            aikz.a.g("Error while signcrypting payload", exception0, new Object[0]);
            aikz.d(23, context0, arr_b, v);
            return null;
        }
    }
}

