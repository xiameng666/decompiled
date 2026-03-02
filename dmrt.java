import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.RemoveSePostpaidTokenRequest;

public final class dmrt implements evqk {
    public final dmsn a;
    public final hkhr b;
    public final hkid c;
    public final dxev d;

    public dmrt(dmsn dmsn0, hkhr hkhr0, hkid hkid0, dxev dxev0) {
        this.a = dmsn0;
        this.b = hkhr0;
        this.c = hkid0;
        this.d = dxev0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        ProtoSafeParcelable protoSafeParcelable0 = (ProtoSafeParcelable)object0;
        hkhr hkhr0 = this.b;
        if(fscr.a(hkhr0)) {
            return evrg.d(null);
        }
        hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
        String s = (hkhh0.g == null ? hkir.a : hkhh0.g).c;
        if(this.c == hkid.l && !s.isEmpty()) {
            dmsn dmsn0 = this.a;
            if(dnpx.r(this.d)) {
                RemoveSePostpaidTokenRequest removeSePostpaidTokenRequest0 = new RemoveSePostpaidTokenRequest();
                removeSePostpaidTokenRequest0.a = s;
                removeSePostpaidTokenRequest0.b = dmsn0.b;
                evql evql0 = dmsn0.k.bk(removeSePostpaidTokenRequest0);
                evql0.b(new dmsj(dmsn0));
                return evql0;
            }
            evql evql1 = dmsn0.j.cM(s);
            evql1.b(new dmsk(dmsn0));
            return evql1;
        }
        return evrg.c(new Exception("Missing payment method action or clientTokeniD"));
    }
}

