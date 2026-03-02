import android.accounts.Account;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class febp implements Runnable {
    public final febq a;
    public final List b;

    public febp(febq febq0, List list0) {
        this.a = febq0;
        this.b = list0;
    }

    @Override
    public final void run() {
        febq febq0 = this.a;
        febr febr0 = febq0.c;
        feax feax0 = febr0.c;
        gged_interceptors gged0 = feax0.a();
        List list0 = this.b;
        if(list0.isEmpty()) {
            febm febm0 = febr0.b;
            ffmn.d("AccountMatchWatchSvc", "sending REMOVE_ACCOUNTS_CONFIRM", new Object[0]);
            febr0.j(6, false);
            if(febm0 != null) {
                ffmn.a("AccountMatchWatchSvc", "notifying listeners that account match is complete", new Object[0]);
                febm0.c();
            }
            febr0.i();
            return;
        }
        try {
            if(((ggna)gged0).c == list0.size()) {
                throw new feas();
            }
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = list0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    if(!arrayList0.isEmpty()) {
                        throw new feau(arrayList0);
                    }
                    febq0.c.j(6, false);
                    return;
                }
                Object object0 = iterator0.next();
                fewz fewz0 = (fewz)object0;
                try {
                    HashMap hashMap0 = feax0.b;
                    if(hashMap0.isEmpty()) {
                        feax0.b();
                    }
                    Account account0 = (Account)hashMap0.get(fewz0.d);
                    if(account0 != null) {
                        if(acso.d(feax0.a, account0).getBoolean("booleanResult")) {
                            continue;
                        }
                    }
                    else if(Log.isLoggable("AccountMatchRecordPrvdr", 6)) {
                        Log.e("AccountMatchRecordPrvdr", a.a(fewz0.d, "Account ", " not found"));
                    }
                }
                catch(IOException | acse exception0) {
                    if(Log.isLoggable("AccountMatchRecordPrvdr", 6)) {
                        Log.e("AccountMatchRecordPrvdr", "Unable to remove account " + fewz0.d, exception0);
                    }
                }
                arrayList0.add(fewz0);
            }
        }
        catch(fean fean0) {
            febq0.c.b(fean0);
        }
    }
}

