import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.HasCapabilitiesRequest;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import com.google.android.gms.auth.aang.GetAccountsResponse;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

public final class bcqe {
    public static final baun a;
    public static actv b;
    private static final String[] c;
    private static final String[] d;
    private static WeakReference e;

    static {
        bcqe.a = bcrh.a("gaia_util");
        bcqe.c = new String[]{"ge2dclldmfya"};
        bcqe.d = new String[]{"ge2dclldmfya", "guzdolldmfya"};
        bcqe.e = new WeakReference(null);
    }

    public static final bcqa a(Context context0, bcrd bcrd0, String s, Account account0, Exception exception0) {
        if(s == null) {
            s = account0.name;
        }
        bcqx.a(context0).e(bcrd0, gmfz.R, exception0);
        bcqe.a.m("Auth or IO Exception for account: " + s + ". Detail: " + exception0.getMessage(), new Object[0]);
        return new bcqa(null, account0.name);
    }

    public static final bcqa b(Context context0, bcrd bcrd0, String s, Account account0, UserRecoverableAuthException userRecoverableAuthException0) {
        if(s == null) {
            s = account0.name;
        }
        bcqx.a(context0).e(bcrd0, gmfz.Q, userRecoverableAuthException0);
        bcqe.a.m("User Recoverable Auth Exception for account: " + s + ". Detail: " + userRecoverableAuthException0.getMessage(), new Object[0]);
        userRecoverableAuthException0.a();
        return new bcqa(null, account0.name);
    }

    public static final void c(Context context0, bcrd bcrd0, gmfz gmfz0, Exception exception0) {
        bcqx.a(context0).e(bcrd0, gmfz0, exception0);
    }

    public static final bcqa d(Context context0, Account account0, String s) {
        String s1 = hrfc.c();
        Bundle bundle0 = new Bundle();
        TokenData tokenData0 = acso.n(context0, account0, s1, bundle0);
        String s2 = tokenData0.b;
        Long long0 = tokenData0.c;
        baun baun0 = bcqe.a;
        Objects.toString(long0);
        baun0.d("expirationTimeSecs: " + long0, new Object[0]);
        if(long0 != null && ((long)long0) - bcqj.a() < hrfs.b()) {
            if(adgh.c(context0)) {
                adfy adfy0 = new adfy(context0.getApplicationContext());
                try {
                    evrg.n(adfy0.b(s2));
                }
                catch(ExecutionException executionException0) {
                    if((executionException0.getCause() instanceof acse)) {
                        throw (acse)executionException0.getCause();
                    }
                    bcqe.a.f("Unexpected exception while clearing token" + executionException0.getCause(), new Object[0]);
                    throw new IOException("Unexpected exception during clearToken", executionException0);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    bcqe.a.f("Interrupted while clearing token" + interruptedException0.getCause(), new Object[0]);
                    throw new IOException("Interrupted during clearToken", interruptedException0);
                }
            }
            else {
                acso.j(context0, s2);
            }
            baun0.d(String.format("Refreshing token for account %s (Gaia ID: %s) as it was expiring in %s seconds (isCached = %b)", account0.name, s, ((long)(((long)long0) - bcqj.a())), Boolean.valueOf(tokenData0.d)), new Object[0]);
            s2 = acso.n(context0, account0, s1, bundle0).b;
        }
        return new bcqa(s2, account0.name);
    }

    public static final gfsx e(bcrd bcrd0, Context context0, gfsx gfsx0, gfsx gfsx1) {
        gfsx gfsx2;
        try {
            gfsx2 = gfqx.a;
            List list0 = ggna.a;
            if(adgh.e(context0)) {
                if(bcqe.b == null) {
                    bcqe.b = new adfy(context0.getApplicationContext());
                }
                try {
                    actv actv0 = bcqe.b;
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
                    bcqe.a.n("Unexpected exception while fetching accounts", executionException0, new Object[0]);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    throw new RemoteException(interruptedException0.toString());
                }
            }
            Account[] arr_account = adgh.e(context0) ? adgh.i(list0) : acso.m(context0);
            int v = 0;
            while(v < arr_account.length) {
                Account account0 = arr_account[v];
                if(!hres.h() || bcqe.i(bcrd0, context0, account0, gfsx1)) {
                    if(!gfsx2.i()) {
                        gfsx2 = gfsx.m(account0);
                    }
                    if(gfsx0.i()) {
                        if(account0.name.equals(gfsx0.d())) {
                            return gfsx.m(account0);
                        }
                        ++v;
                        continue;
                    }
                    break;
                }
                ++v;
            }
        }
        catch(azqj | azqi | RemoteException | acse | IOException exception0) {
            bcqe.a.g("getFirstCapableAccount fails.", exception0, new Object[0]);
        }
        return gfsx0.i() ? gfqx.a : gfsx2;
    }

    public static final Map f(bcrd bcrd0, String s, Context context0, Bundle bundle0) {
        Account[] arr_account1;
        Long long0;
        TokenData tokenData0;
        String s1;
        Account account0;
        int v;
        Map map0;
        Account[] arr_account;
        try {
            List list0 = ggna.a;
            if(adgh.e(context0)) {
                if(bcqe.b == null) {
                    bcqe.b = new adfy(context0.getApplicationContext());
                }
                try {
                    actv actv0 = bcqe.b;
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
                    bcqe.a.n("Unexpected exception while fetching accounts", executionException0, new Object[0]);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    throw new RemoteException(interruptedException0.toString());
                }
            }
            arr_account = adgh.e(context0) ? adgh.i(list0) : acso.m(context0);
            map0 = new HashMap();
            v = 0;
            while(true) {
            label_24:
                if(v >= arr_account.length) {
                    bcqe.a.j("Got tokens for %s accounts", new Object[]{map0.size()});
                    return map0;
                }
                account0 = arr_account[v];
                try {
                    s1 = acso.e(context0, account0.name);
                    tokenData0 = acso.n(context0, account0, s, bundle0);
                    long0 = tokenData0.c;
                    if(long0 != null && ((long)long0) - bcqj.a() < hrfs.b()) {
                        if(adgh.c(context0)) {
                            if(bcqe.b == null) {
                                bcqe.b = new adfy(context0.getApplicationContext());
                            }
                            try {
                                evrg.n(bcqe.b.b(tokenData0.b));
                                arr_account1 = arr_account;
                                goto label_53;
                            }
                            catch(ExecutionException executionException1) {
                            }
                            catch(InterruptedException interruptedException1) {
                                goto label_46;
                            }
                            if(!(executionException1.getCause() instanceof acse)) {
                                arr_account1 = arr_account;
                                goto label_41;
                            }
                            arr_account1 = arr_account;
                            throw (acse)executionException1.getCause();
                        }
                        else {
                            goto label_51;
                        }
                        goto label_53;
                    }
                    else {
                        goto label_56;
                    }
                    goto label_57;
                }
                catch(IOException | acse exception1) {
                    break;
                }
                try {
                label_41:
                    bcqe.a.n("Unexpected exception while clearing token", executionException1, new Object[0]);
                    goto label_53;
                }
                catch(IOException | acse exception1) {
                    goto label_60;
                }
                try {
                label_46:
                    Thread.currentThread().interrupt();
                    throw new IOException(interruptedException1);
                }
                catch(IOException | acse exception1) {
                    break;
                }
            }
        }
        catch(azqj | azqi | RemoteException exception0) {
            bcqx.a(context0).e(bcrd0, gmfz.G, exception0);
            bcqe.a.g("getGaiaIdsAndTokens fails.", exception0, new Object[0]);
            return new HashMap();
        }
        arr_account1 = arr_account;
        goto label_60;
        try {
        label_51:
            arr_account1 = arr_account;
            acso.j(context0, tokenData0.b);
        label_53:
            bcqe.a.j("Refresing token for account will expire in %s (isCached = %b)", new Object[]{long0, Boolean.valueOf(tokenData0.d)});
            tokenData0 = acso.n(context0, account0, s, bundle0);
            goto label_57;
        label_56:
            arr_account1 = arr_account;
        label_57:
            map0.put(s1, tokenData0.b);
            ++v;
            arr_account = arr_account1;
            goto label_24;
        }
        catch(IOException | acse exception1) {
            try {
            label_60:
                bcqx.a(context0).e(bcrd0, gmfz.G, exception1);
                bcqe.a.m("Account id cannot be obtained for account", new Object[0]);
                ++v;
                arr_account = arr_account1;
                goto label_24;
            }
            catch(azqj | azqi | RemoteException exception0) {
            }
            bcqx.a(context0).e(bcrd0, gmfz.G, exception0);
            bcqe.a.g("getGaiaIdsAndTokens fails.", exception0, new Object[0]);
            return new HashMap();
        }
        catch(azqj | azqi | RemoteException exception0) {
            bcqx.a(context0).e(bcrd0, gmfz.G, exception0);
            bcqe.a.g("getGaiaIdsAndTokens fails.", exception0, new Object[0]);
            return new HashMap();
        }
    }

    public static final azot g(bcrd bcrd0, Context context0, gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, gfsx gfsx3) {
        azor azor0 = new azor();
        azor0.a = (Account)gfsx1.g();
        azor0.e();
        azor0.d();
        ArrayList arrayList0 = new ArrayList();
        List list0 = ggna.a;
        try {
            if(adgh.e(context0)) {
                if(bcqe.b == null) {
                    bcqe.b = new adfy(context0.getApplicationContext());
                }
                try {
                    actv actv0 = bcqe.b;
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
                    bcqe.a.n("Unexpected exception while fetching accounts", executionException0, new Object[0]);
                }
                catch(InterruptedException interruptedException0) {
                    Thread.currentThread().interrupt();
                    throw new RemoteException(interruptedException0.toString());
                }
            }
            Account[] arr_account = adgh.e(context0) ? adgh.i(list0) : acso.m(context0);
            for(int v = 0; v < arr_account.length; ++v) {
                Account account0 = arr_account[v];
                if(!hres.h()) {
                    arrayList0.add(account0);
                }
                else if(bcqe.i(bcrd0, context0, account0, gfsx3)) {
                    arrayList0.add(account0);
                }
            }
        }
        catch(azqj | azqi | RemoteException | acse | IOException exception0) {
            bcqe.a.g("getCapableAccounts fails.", exception0, new Object[0]);
        }
        azor0.b(arrayList0);
        azor0.c(gged_interceptors.l("com.google"));
        gfsx2.f("Choose an account");
        azor0.c = "Choose an account";
        azor0.f = (int)(((Integer)gfsx0.f(Integer.valueOf(1001))));
        return azor0.a();
    }

    public static void h() {
        synchronized(bcqe.class) {
            if(((bcqe)bcqe.e.get()) == null) {
                bcqe.e = new WeakReference(new bcqe());
            }
        }
    }

    private static final boolean i(bcrd bcrd0, Context context0, Account account0, gfsx gfsx0) {
        String[] arr_s;
        if(!gfsx0.i() || !hres.g()) {
            arr_s = bcqe.c;
        }
        else if(hres.a.d().g().b.contains(gfsx0.d())) {
            arr_s = bcqe.c;
        }
        else {
            arr_s = bcqe.d;
        }
        int v = acso.c(context0, new HasCapabilitiesRequest(account0, arr_s));
        switch(v) {
            case 1: {
                return true;
            }
            case 2: {
                break;
            }
            default: {
                if(hres.g()) {
                    bcqx.a(context0).u(bcrd0, gmfz.M, String.valueOf(v));
                    return false;
                }
            }
        }
        return false;
    }
}

