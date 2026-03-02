import android.text.TextUtils;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.internal.Preconditions;
import java.util.Collection;

final class ebvw extends ibsl implements ibtw {
    int a;
    final Collection b;
    final AccountInfo c;
    final ebvx d;
    final long e;
    final dyev f;

    public ebvw(Collection collection0, AccountInfo accountInfo0, ebvx ebvx0, long v, dyev dyev0, ibrl ibrl0) {
        this.b = collection0;
        this.c = accountInfo0;
        this.d = ebvx0;
        this.e = v;
        this.f = dyev0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebvw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebvw(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            if(!hwnm.a.f().O()) {
                return new Status(8, "API not enabled");
            }
            if(!this.b.contains(dygj.c)) {
                return new Status(8, "Caller not authorized to act as Octopus");
            }
            AccountInfo accountInfo0 = this.c;
            ebst ebst0 = null;
            if(accountInfo0 == null) {
                ebvx ebvx0 = this.d;
                ebst ebst1 = ebvx0.c;
                if(ebst1 == null) {
                    ibuq.j("emoneyOperationUtils");
                }
                else {
                    ebst0 = ebst1;
                }
                ebvx0.e();
                ebst.f(ebst0, 209670, System.currentTimeMillis() - this.e, 5);
                return new Status(4, "Active user account not found");
            }
            ebwc ebwc0 = new ebwc(accountInfo0, this.d.j, this.d.i);
            dyiy dyiy0 = this.f.b == 3 ? ((dyiy)this.f.c) : dyiy.a;
            ibuq.e(dyiy0, "getOctopusCardTapEvent(...)");
            this.a = 1;
            boolean z = ((Boolean)ebwc0.a.b().f(Boolean.valueOf(false))).booleanValue();
            String s = ebwc0.a.b;
            dola dola0 = new dola(s, ebwc0.a.a, z);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            edop edop0 = new edop();
            String s1 = ebwc0.b;
            new eboc(dola0, new dmgr(s1), ebwc0.c, edop0, domv0).inject(ebwc0);
            ebwc0.e();
            ebwc0.j = System.currentTimeMillis();
            edqy edqy0 = ebwc0.f;
            if(edqy0 == null) {
                ibuq.j("octopusCardEligibility");
            }
            else {
                ebst0 = edqy0;
            }
            if(ebst0.b) {
                if(ebwc0.k == null) {
                    ibuq.j("octopusSettingsProvider");
                }
                if(!ibuq.m(s1, edsl.a())) {
                    ebwc0.d(1);
                    object2 = new Status(10, "Caller is not allowed to notify Octopus card tap event.");
                }
                else if(!TextUtils.isEmpty(dyiy0.f) && !ibuq.m(dyiy0.f, s)) {
                    ebwc0.d(7);
                    object2 = new Status(5, "Provided account does not match the active account");
                }
                else {
                    object2 = ebwc0.c(dyiy0, this);
                }
            }
            else {
                ebwc0.d(4);
                object2 = new Status(10, "Feature is not available");
            }
            object0 = object2;
            if(object0 == object1) {
                return object1;
            }
        }
        return (Status)object0;
    }
}

