import android.accounts.Account;
import com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation;
import java.util.List;

public final class buyx {
    public final Object a(ccpr ccpr0, List list0, Account account0, long v, ibrl ibrl0) {
        long v3;
        Object object2;
        buyw buyw0;
        if((ibrl0 instanceof buyw)) {
            buyw0 = (buyw)ibrl0;
            int v1 = buyw0.e;
            if((v1 & 0x80000000) == 0) {
                buyw0 = new buyw(this, ibrl0);
            }
            else {
                buyw0.e = v1 - 0x80000000;
            }
        }
        else {
            buyw0 = new buyw(this, ibrl0);
        }
        Object object0 = buyw0.c;
        Object object1 = ibrx.a;
        switch(buyw0.e) {
            case 0: {
                ibnx.b(object0);
                long v2 = icac.a();
                buyw0.a = list0;
                buyw0.b = v2;
                buyw0.e = 1;
                object0 = iccl.a(new buyv(list0, account0, v, ccpr0, null), buyw0);
                if(object0 != object1) {
                    object2 = list0;
                    v3 = v2;
                    break;
                }
                return object1;
            }
            case 1: {
                v3 = buyw0.b;
                object2 = buyw0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        icae icae0 = new icae(((List)object0), icad.b(v3));
        ggtj ggtj0 = (ggtj)FeatureStatusObserverIntentOperation.a.h();
        ibzw ibzw0 = new ibzw(icae0.b);
        ggtj0.X("gathered %s/%s features in %s", new Integer(((List)icae0.a).size()), new Integer(((List)object2).size()), ibzw0);
        return (List)icae0.a;
    }
}

