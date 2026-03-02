import android.accounts.Account;
import com.google.android.gms.pay.GetPaymentMethodActionTokensRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class dmsv {
    public static final bboh a;
    public final Map b;
    public final du c;
    private final Account d;
    private final azts e;

    static {
        dmsv.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmsv(Account account0, du du0, azts azts0) {
        this.b = new dmsu(this);
        this.d = account0;
        this.c = du0;
        this.e = azts0;
    }

    final evql a(hkhr hkhr0, hkid hkid0) {
        Map map0 = this.b;
        hkhx hkhx0 = dmsv.d(hkhr0, hkid0);
        hkgq hkgq0 = (hkgq)map0.get(hkhx0);
        if(hkgq0 != null) {
            map0.remove(hkhx0);
            return evrg.d(hkgq0);
        }
        return this.c(hkhr0, ggia.d(new hkid[]{hkid0})).g(new dmss());
    }

    public final void b(xob xob0, hkhr hkhr0, ibth ibth0) {
        hfuo hfuo0 = hkhr0.n;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hfuo0) {
            hkhs hkhs0 = (hkhs)object0;
            hkic hkic0 = hkhs0.f == null ? hkic.a : hkhs0.f;
            switch(hkib.a(hkic0.d)) {
                case 3: {
                    if(hkic0.b == 2 && hkia.a(((Integer)hkic0.c).intValue()) == 3) {
                        goto label_10;
                    }
                    continue;
                }
                case 5: {
                label_10:
                    arrayList0.add((hkid.b(hkhs0.c) == null ? hkid.z : hkid.b(hkhs0.c)));
                }
            }
        }
        evql evql0 = arrayList0.isEmpty() ? evrg.d(hkgr.a) : this.c(hkhr0, arrayList0);
        evql0.x(xob0, new dmsp(this, ibth0));
        evql0.u(xob0, new dmsq(ibth0));
    }

    private final evql c(hkhr hkhr0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            arrayList0.add(ftqe.a(((MessageLite)dmsv.d(hkhr0, ((hkid)object0)))));
        }
        GetPaymentMethodActionTokensRequest getPaymentMethodActionTokensRequest0 = new GetPaymentMethodActionTokensRequest();
        getPaymentMethodActionTokensRequest0.a = this.d;
        getPaymentMethodActionTokensRequest0.b = (ProtoSafeParcelable[])arrayList0.toArray(new ProtoSafeParcelable[0]);
        return this.e.aJ(getPaymentMethodActionTokensRequest0).g(new dmsr());
    }

    private static hkhx d(hkhr hkhr0, hkid hkid0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hkhx.a).v_newBuilder();
        hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkhx hkhx0 = (hkhx)hftp0.b_message;
        hjwt0.getClass();
        hkhx0.d = hjwt0;
        hkhx0.b |= 1;
        hjqn hjqn0 = hkhr0.e == null ? hjqn.a : hkhr0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hjqn0.getClass();
        ((hkhx)hftv0).e = hjqn0;
        ((hkhx)hftv0).b |= 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkhx hkhx1 = (hkhx)hftp0.b_message;
        hkhx1.c = hkid0.a();
        return (hkhx)hftp0.N_build();
    }
}

