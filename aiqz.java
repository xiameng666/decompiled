import android.accounts.Account;
import android.content.Context;
import android.os.Binder;

public final class aiqz {
    public static aiqy a(Context context0, String s) {
        if(s != null) {
            bblp bblp0 = new bblp(0x7FFFFFFF, 10);
            if(hpsg.a.d().f()) {
                return new aiqa(bblp0);
            }
            aiqw aiqw0 = new aiqw(context0, bblp0, new ayud(context0, aiqw.a, s));
            return new airq(bblp0, faih.a(context0), aiqw0);
        }
        return new aiqx();
    }

    public static bboh b(String s) {
        return bboh.c("Blockstore", bbcu.eh, s);
    }

    public static String c(Context context0) {
        Account account0;
        aqee aqee0 = new aqee(context0);
        long v = Binder.clearCallingIdentity();
        try {
            account0 = aqee0.a();
        }
        finally {
            Binder.restoreCallingIdentity(v);
        }
        if(account0 != null) {
            return account0.name;
        }
        Account[] arr_account = cchj.b(context0).p("com.google");
        return arr_account == null || arr_account.length <= 0 ? null : arr_account[0].name;
    }
}

