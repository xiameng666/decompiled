import android.accounts.Account;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.pay.init.PayInitIntentOperation;
import java.util.concurrent.Callable;

public final class dokv implements Callable {
    public final PayInitIntentOperation a;

    public dokv(PayInitIntentOperation payInitIntentOperation0) {
        this.a = payInitIntentOperation0;
    }

    @Override
    public final Object call() {
        SQLiteDatabase sQLiteDatabase0;
        PayInitIntentOperation payInitIntentOperation0;
        try {
            payInitIntentOperation0 = this.a;
            sQLiteDatabase0 = dmhk.d(payInitIntentOperation0).c();
        }
        catch(dmhl dmhl0) {
            a.ae(dvim.a.i(), "Failed to clear valuable overrides as the database instance could not be retrieved.", dmhl0);
            return null;
        }
        String s = dmgv.d();
        for(Object object0: bbmn.h(payInitIntentOperation0, "com.google.android.gms")) {
            String s1 = ((Account)object0).name;
            String s2 = dlmj.b(payInitIntentOperation0, s1);
            if(s2 == null) {
                ((ggtj)dvim.a.h()).B("Failed to resolve account ID for account name: %s", s1);
            }
            else {
                sQLiteDatabase0.delete("SmartTapOverride", dvim.b, new String[]{s2, s});
            }
        }
        return null;
    }
}

