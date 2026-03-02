import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.telephony.TelephonyManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ajlq {
    private static final bboh a;

    static {
        ajlq.a = ajlr.a("HostValidator");
    }

    public static Set a(Context context0) {
        Account[] arr_account;
        alez alez0 = new alez(context0);
        try {
            arr_account = new adgg(context0).e(context0);
        }
        catch(RemoteException | azqj | azqi unused_ex) {
            ((ggtj)ajlq.a.j()).x("Failed to fetch account list.");
            arr_account = new Account[0];
            goto label_10;
        }
        if(arr_account == null || arr_account.length == 0) {
            ((ggtj)ajlq.a.j()).x("Invalid account list.");
            arr_account = new Account[0];
        }
    label_10:
        Set set0 = new HashSet();
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            try {
                if(((int)(((Integer)evrg.o(alez0.b(gqus.d, account0), hpue.b(), TimeUnit.SECONDS)))) == 1) {
                    set0.add(account0.name);
                }
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                a.ae(ajlq.a.j(), "Error getting feature enabled state.", exception0);
                if((exception0 instanceof InterruptedException)) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return set0;
    }

    public static boolean b(Context context0) {
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        return telephonyManager0 != null && telephonyManager0.getPhoneType() != 0 && context0.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }
}

