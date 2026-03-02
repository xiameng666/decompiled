import android.accounts.Account;
import com.google.android.gms.auth.folsom.operation.KeySyncIntentOperation;
import com.google.android.gms.auth.folsom.service.FolsomGcmTaskChimeraService;

public final class ajwd implements Runnable {
    public final KeySyncIntentOperation a;

    public ajwd(KeySyncIntentOperation keySyncIntentOperation0) {
        this.a = keySyncIntentOperation0;
    }

    @Override
    public final void run() {
        KeySyncIntentOperation keySyncIntentOperation0 = this.a;
        Account[] arr_account = cchj.b(keySyncIntentOperation0).p("com.google");
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(KeySyncIntentOperation.a(account0, 18) == 1) {
                ((ggtj)KeySyncIntentOperation.b.h()).x("Scheduling a retry after failed newSnapshot sync");
                FolsomGcmTaskChimeraService.h(keySyncIntentOperation0, account0.name, hput.a.c().m(), hput.a.c().l());
            }
        }
    }
}

