import android.accounts.Account;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class fogo implements Callable {
    public final gmcd a;
    public final gmcd b;
    public final gmcd c;

    public fogo(gmcd gmcd0, gmcd gmcd1, gmcd gmcd2) {
        this.a = gmcd0;
        this.b = gmcd1;
        this.c = gmcd2;
    }

    @Override
    public final Object call() {
        boolean z;
        List list0 = (List)fogr.h(this.a, "device accounts");
        List list1 = (List)fogr.h(this.b, "g1 accounts");
        gged_interceptors gged0 = (gged_interceptors)fogr.h(this.c, "owners");
        if(list0 == null && list1 == null && gged0 == null) {
            throw new foee();
        }
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        if(list0 == null) {
            z = false;
        }
        else {
            for(Object object0: list0) {
                fogl.a(((Account)object0).name, arrayList0, hashMap0);
            }
            z = true;
        }
        if(list1 != null) {
            for(Object object1: list1) {
                Account account0 = (Account)object1;
                if(!z) {
                    fogl.a(account0.name, arrayList0, hashMap0);
                }
                foea foea0 = (foea)hashMap0.get(account0.name);
                if(foea0 != null) {
                    foea0.c(true);
                }
            }
        }
        if(gged0 != null) {
            int v1 = gged0.size();
            for(int v = 0; v < v1; ++v) {
                foec foec0 = (foec)gged0.get(v);
                String s = foec0.a;
                if(!z) {
                    fogl.a(s, arrayList0, hashMap0);
                }
                foea foea1 = (foea)hashMap0.get(s);
                if(foea1 != null) {
                    foea1.a = foec0.c;
                    foea1.b = foec0.d;
                    foea1.c = foec0.e;
                    foea1.d = foec0.f;
                    foea1.e = foec0.h;
                    foea1.e(foec0.j);
                }
            }
        }
        ggdy ggdy0 = new ggdy();
        for(Object object2: arrayList0) {
            ggdy0.i(((foea)hashMap0.get(((String)object2))).a());
        }
        return ggdy0.h();
    }
}

