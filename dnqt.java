import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.googlesettings.features.status.PayFeatureStatusIntentOperation;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

public final class dnqt extends ibsl implements ibtw {
    int a;
    final PayFeatureStatusIntentOperation b;
    final Context c;

    public dnqt(PayFeatureStatusIntentOperation payFeatureStatusIntentOperation0, Context context0, ibrl ibrl0) {
        this.b = payFeatureStatusIntentOperation0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dnqt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dnqt(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            evql evql0 = this.b.a.a(this.c).j();
            this.a = 1;
            object2 = fsdk.a(evql0, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        return ibnw.a(object2) == null && ((AccountInfo)object2) != null ? new Account(((AccountInfo)object2).b, "com.google") : null;
    }
}

