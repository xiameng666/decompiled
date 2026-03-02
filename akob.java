import android.accounts.Account;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.Locale;
import java.util.function.Consumer;

public final class akob implements Runnable {
    public final akou a;
    public final String b;
    public final akok c;
    public final Consumer d;
    public final yxh e;

    public akob(akou akou0, yxh yxh0, String s, akok akok0, Consumer consumer0) {
        this.a = akou0;
        this.e = yxh0;
        this.b = s;
        this.c = akok0;
        this.d = consumer0;
    }

    @Override
    public final void run() {
        Bundle bundle1;
        int v1;
        Log.i("Auth", "requesting play install");
        Bundle bundle0 = new Bundle();
        bundle0.putInt("network_type", 1);
        bundle0.putBoolean("charging", false);
        bundle0.putBoolean("idle", false);
        boolean z = hpwf.a.b().j();
        akou akou0 = this.a;
        yxh yxh0 = this.e;
        String s = this.b;
        akok akok0 = this.c;
        Consumer consumer0 = this.d;
        String s1 = null;
        if(z) {
            Account account0 = null;
            Account[] arr_account = cchj.b(akou0.a()).p("com.google");
            if(arr_account != null && arr_account.length != 0) {
                for(int v = arr_account.length - 1; v >= 0; --v) {
                    Account account1 = arr_account[v];
                    if(account1 != null && !akqv.k(account1)) {
                        account0 = account1;
                        break;
                    }
                }
            }
            if(account0 != null) {
                bundle0.putString("account_name", account0.name);
            }
        }
        try {
            v1 = -2;
            bundle1 = yxh0.a("com.google.android.gms", s, bundle0);
        }
        catch(RemoteException remoteException0) {
            Log.e("Auth", String.format(Locale.US, "[AuthManaged, PhoneskyDpcInstallViewModel] DPC installation failed - couldn\'t connect to the install service"), remoteException0);
            akou.f(akok0, Integer.valueOf(-2), consumer0);
            return;
        }
        Log.i("Auth", "requested play install");
        int v2 = bundle1.getInt("status_code", -4);
        switch(v2) {
            case -5: {
                if(hpwj.d()) {
                    akou.f(akok0, Integer.valueOf(-1), consumer0);
                    return;
                }
                break;
            }
            case -4: {
                Bundle bundle2 = bundle1.getBundle("error");
                String s2 = bundle2 == null ? null : bundle2.getString("reason");
                if(bundle2 != null) {
                    s1 = bundle2.getString("exception_type");
                }
                Log.e("Auth", String.format(Locale.US, a.ai(s1, s2, s, "[AuthManaged, PhoneskyDpcInstallViewModel] starting ", " installation failed with STATUS_CODE_REQUEST_FAILED reason = ", " exceptionType = ")));
                if(!"transient".equals(s2)) {
                    v1 = -3;
                }
                akou.f(akok0, Integer.valueOf(v1), consumer0);
                return;
            }
            case -3: {
                Log.e("Auth", String.format(Locale.US, a.p(-3, s, "[AuthManaged, PhoneskyDpcInstallViewModel] starting ", " installation failed with status code ")));
                if(((long)(((Long)bbmq.c.i()))) != 0L) {
                    v1 = -3;
                }
                akou.f(akok0, Integer.valueOf(v1), consumer0);
                return;
            }
            case -2: 
            case -1: {
                Log.e("Auth", String.format(Locale.US, a.p(v2, s, "[AuthManaged, PhoneskyDpcInstallLoader] starting ", " installation failed with status code ")));
                akou.f(akok0, Integer.valueOf(-3), consumer0);
                return;
            }
            case 0: {
                break;
            }
            default: {
                Log.e("Auth", String.format(Locale.US, a.f(v2, "[AuthManaged, PhoneskyDpcInstallViewModel] Unknown status code ", " returned by PlayInstallService#installPackage")));
                akou.f(akok0, Integer.valueOf(-2), consumer0);
            }
        }
    }
}

