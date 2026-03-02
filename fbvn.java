import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import j..util.Objects;
import java.util.ArrayList;
import java.util.List;

final class fbvn implements bboe {
    final Object a;
    final List b;
    final String c;
    final gamm d;
    final int e;
    final fbvw f;

    public fbvn(fbvw fbvw0, Object object0, List list0, String s, gamm gamm0, int v) {
        this.a = object0;
        this.b = list0;
        this.c = s;
        this.d = gamm0;
        this.e = v;
        Objects.requireNonNull(fbvw0);
        this.f = fbvw0;
        super();
    }

    @Override  // bboe
    public final Object a(Object object0) {
        Void void0 = (Void)object0;
        Object object1 = this.a;
        if(!(object1 instanceof MessageLite)) {
            throw new IllegalArgumentException("Request should be MessageLite type");
        }
        byte[] arr_b = ((MessageLite)object1).toBytesArray();
        List list0 = this.b;
        ArrayList arrayList0 = null;
        if(list0 != null && !list0.isEmpty()) {
            int v = list0.size();
            if(v % 2 != 0) {
                throw new IllegalArgumentException("Header arrays must have matching names and values");
            }
            ArrayList arrayList1 = new ArrayList(v / 2);
            int v1 = 0;
            while(v1 < v) {
                String s = (String)list0.get(v1);
                String s1 = (String)list0.get(v1 + 1);
                if(TextUtils.isEmpty(s)) {
                    throw new IllegalArgumentException("Header names must be non empty.");
                }
                arrayList1.add(new Pair(s, s1));
                v1 += 2;
                continue;
            }
            arrayList0 = arrayList1;
        }
        fbvw fbvw0 = this.f;
        String s2 = this.c;
        gamm gamm0 = this.d;
        if(arrayList0 == null) {
            arrayList0 = new ArrayList();
        }
        Object object2 = fbvw0.d.b(s2, gamm0, arr_b, arrayList0, this.e, 39);
        if(((ServerResponse)object2).d()) {
            if(((ServerResponse)object2).c() == null) {
                throw new IllegalArgumentException("ServerResponse should contain proto response");
            }
            ((ServerResponse)object2).c();
            return object2;
        }
        return object2;
    }
}

