import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class fdcj {
    private static actv a;

    public static String a(Context context0) {
        List list1;
        try {
            List list0 = ggna.a;
            if(adgh.e(context0)) {
                if(fdcj.a == null) {
                    fdcj.a = new adfy(context0.getApplicationContext());
                }
                try {
                    actv actv0 = fdcj.a;
                    actm actm0 = GetAccountsRequest.a();
                    actm0.b("com.google");
                    list0 = ((GetAccountsResponse)evrg.n(actv0.c(actm0.a()))).a;
                }
                catch(ExecutionException executionException0) {
                    if((executionException0.getCause() instanceof RemoteException)) {
                        throw (RemoteException)executionException0.getCause();
                    }
                    if((executionException0.getCause() instanceof azqj)) {
                        throw (azqj)executionException0.getCause();
                    }
                    if((executionException0.getCause() instanceof azqi)) {
                        throw (azqi)executionException0.getCause();
                    }
                    Log.w("GaiaUtils", "Unexpected exception while fetching accounts", executionException0);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    throw new RemoteException(interruptedException0.toString());
                }
                list1 = Arrays.asList(adgh.i(list0));
            }
            else {
                list1 = Arrays.asList(acso.m(context0));
            }
            if(list1.isEmpty()) {
                throw new IllegalStateException("No accounts found on device.");
            }
            String s = acso.e(context0, ((Account)list1.get(0)).name);
            if(!TextUtils.isEmpty(s)) {
                return s;
            }
            throw new IllegalStateException("Empty GAIA ID returned.");
        }
        catch(RemoteException | azqj | azqi | acse | IOException | IllegalStateException exception0) {
            throw new IllegalStateException("Failed to retrieve GAIA ID.", exception0);
        }
    }
}

