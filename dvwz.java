import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvwz implements evqf {
    public final dvxj a;

    public dvwz(dvxj dvxj0) {
        this.a = dvxj0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        gged_interceptors gged0 = fsig.b(((ProtoSafeParcelable)object0));
        dvxj dvxj0 = this.a;
        int v = dvxj0.U(gged0, false, gfqx.a);
        if(v == 2) {
            if(dvxj0.aS.i() && ((ValuableGroup)dvxj0.aS.d()).f().i() && (dvxj0.T(guwf.i) || dvxj0.T(guwf.k))) {
                dvxj0.Q();
                return;
            }
            dvxj0.c.b(false);
            dvxj0.J();
            return;
        }
        if(v != 3 && v != 4 && v != 5) {
            return;
        }
        dvxj0.J();
    }
}

