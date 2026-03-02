import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class ajfk {
    private final Account a;
    private final ajje b;
    private final ajfw c;
    private final ajgg d;

    public ajfk(Context context0, Account account0) {
        ajje ajje0 = new ajje(context0);
        ajfw ajfw0 = new ajfw(context0, account0);
        ajgg ajgg0 = new ajgg(context0);
        super();
        this.a = account0;
        this.b = ajje0;
        this.c = ajfw0;
        this.d = ajgg0;
    }

    public static cllc a(long v) {
        return cllb.a(1, ((int)TimeUnit.MILLISECONDS.toSeconds(v)), ((int)TimeUnit.MILLISECONDS.toSeconds(v + hpta.e())));
    }

    public final void b(String s, gmkh gmkh0) {
        String s1;
        synchronized(this.c.a) {
            this.c.c.d("Updating clientDirective", new Object[0]);
            this.c.b.edit().putLong(this.c.d("checkinafter"), gmkh0.b).putLong(this.c.d("retryattempts"), ((long)gmkh0.c)).putLong(this.c.d("retryperiod"), gmkh0.d).putLong(this.c.d("policycreation"), gmkh0.e).putLong(this.c.d("currentretryattempt"), 0L).commit();
        }
        hfuo hfuo0 = gmkh0.f;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hfuo0) {
            gmku gmku0 = (gmku)object0;
            if(!arrayList0.contains(gmku0)) {
                arrayList0.add(gmku0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator1 = arrayList0.iterator();
        while(true) {
            s1 = null;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            gmku gmku1 = (gmku)object1;
            int v1 = 2;
            int v2 = 1;
            switch(gmku1.b) {
                case 0: {
                    break;
                }
                case 1: {
                    v1 = 3;
                    break;
                }
                case 2: {
                    v1 = 4;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
            if(v1 != 0) {
                v2 = v1;
            }
            if(v2 == 4 && !this.d.a(this.a, gmku1.c, null)) {
                arrayList1.add(gmku1);
            }
        }
        ajfw ajfw0 = this.c;
        ajfw0.c.d("Updating invokeNext", new Object[0]);
        synchronized(ajfw0.a) {
            SharedPreferences.Editor sharedPreferences$Editor0 = ajfw0.b.edit();
            String s2 = ajfw0.d("invokenext");
            if(!arrayList1.isEmpty()) {
                try {
                    s1 = Base64.encodeToString(ajfr.a(arrayList1), 0);
                }
                catch(IOException iOException0) {
                    ajfw0.c.n("Error serializing invoke next list", iOException0, new Object[0]);
                }
            }
            sharedPreferences$Editor0.putString(s2, s1).commit();
        }
        long v4 = gmkh0.b;
        cllc cllc0 = ajfk.a(gmkh0.d);
        long v5 = v4 + hpta.e();
        this.b.a(s, v4, v5, cllc0);
    }
}

