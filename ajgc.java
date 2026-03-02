import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ajgc {
    public static final List a(String s, Account account0, List list0, List list1, ajfp ajfp0, ajiy ajiy0, baun baun0) {
        byte[] arr_b;
        List list2 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            hashMap0.put(((gmjv)object0).b, ((gmjv)object0));
        }
        yhc yhc0 = ajfp0.a(s, account0.name);
        if(yhc0 == null) {
            baun0.m("Couldn\'t retrieve group key: " + s, new Object[0]);
            return new ArrayList();
        }
        PrivateKey privateKey0 = yhc0.d;
        if(privateKey0 == null) {
            baun0.m("Retrieved group key doesn\'t have a private key: " + s, new Object[0]);
            return new ArrayList();
        }
        for(Object object1: list1) {
            gmju gmju0 = (gmju)object1;
            String s1 = gmju0.b;
            gmjv gmjv0 = (gmjv)hashMap0.get(s1);
            if(gmjv0 != null) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: gmju0.c) {
                    arrayList0.add(new DeviceFeatureStatus(((gmjt)object2).b, ((gmjt)object2).c));
                }
                try {
                    arr_b = ajiy0.d(privateKey0, account0, gmjv0.c.toByteArray()).c;
                }
                catch(ajgp unused_ex) {
                    continue;
                }
                list2.add(new DeviceMetadata(1, s1, arr_b, gmjv0.f, arrayList0, account0.name));
            }
        }
        return list2;
    }
}

