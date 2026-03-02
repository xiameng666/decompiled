import android.accounts.Account;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ezro implements ezss {
    public final ezss a;
    public final ezss b;
    private final Map c;

    public ezro(ezss ezss0, ezss ezss1) {
        ibuq.f(ezss0, "primarySettingsStoreFactory");
        super();
        this.a = ezss0;
        this.b = ezss1;
        this.c = new LinkedHashMap();
        iccl.b(cclw.d);
    }

    @Override  // ezss
    public final gmcd a(Account account0) {
        Object object0;
        gmcd gmcd2;
        ibuq.f(account0, "account");
        synchronized(this) {
            Map map0 = this.c;
            object0 = map0.get(account0);
            if(object0 == null) {
                ezss ezss0 = this.a;
                gmcd gmcd0 = (gmcd)((ezse)ezss0).d.get(account0);
                if(gmcd0 == null) {
                    synchronized(ezss0) {
                        Map map1 = ((ezse)ezss0).d;
                        gmcd gmcd1 = (gmcd)map1.get(account0);
                        if(gmcd1 == null) {
                            ezsd ezsd0 = new ezsd(((ezse)ezss0), account0);
                            gmcd1 = ((ezse)ezss0).c.e(ezsd0);
                            map1.put(account0, gmcd1);
                        }
                        gmcd0 = gmcd1;
                    }
                }
                ezss ezss1 = this.b;
                if(ezss1 == null) {
                    gmcd2 = gmbu.i(null);
                }
                else {
                    ibuq.f(account0, "account");
                    ezre ezre0 = new ezre(((ezrg)ezss1), account0, null);
                    gmcd2 = icpu.e(((ezrg)ezss1).c, ezre0);
                    if(gmcd2 == null) {
                        gmcd2 = gmbu.i(null);
                    }
                }
                object0 = gmbu.d(new gmcd[]{gmcd0, gmcd2}).a(new ezrn(gmcd0, gmcd2), gmap.a);
                map0.put(account0, object0);
            }
        }
        return (gmcd)object0;
    }
}

