import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.wallet.service.SetupWizardTaskService;

public final class fbxu {
    public final SharedPreferences a;

    public fbxu(Context context0) {
        this.a = context0.getApplicationContext().getSharedPreferences("payments.setupWizardPrefs", 4);
    }

    public static String a(Account account0) {
        gcjc gcjc0 = new gcjc();
        gcjc0.c("initResponse");
        gcjc0.c(account0.type);
        gcjc0.c(account0.name);
        return gcjc0.toString();
    }

    public final void b(Account account0) {
        this.a.edit().remove(fbxu.a(account0)).apply();
    }

    public final void c() {
        this.a.edit().putBoolean("accountAdded", true).apply();
    }

    public final void d(Context context0, Account account0, hcdi hcdi0) {
        gcjc gcjc0 = new gcjc();
        gcjc0.b(((MessageLite)hcdi0));
        gcjc0.a(System.currentTimeMillis());
        this.a.edit().putString(fbxu.a(account0), gcjc0.toString()).apply();
        if(hzrg.a.d().s()) {
            SetupWizardTaskService.d(context0);
        }
    }
}

