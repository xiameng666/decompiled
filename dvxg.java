import android.content.Context;
import android.os.CancellationSignal;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import j..util.Objects;

final class dvxg implements edoh {
    final boolean a;
    final dvxj b;

    public dvxg(dvxj dvxj0, boolean z) {
        this.a = z;
        Objects.requireNonNull(dvxj0);
        this.b = dvxj0;
        super();
    }

    @Override  // edoh
    public final void a() {
        if(this.a) {
            this.b.c.c(false);
        }
        dvxj dvxj0 = this.b;
        Context context0 = dvxj0.getContext();
        if(context0 != null) {
            if(!dvxj0.ai.a()) {
                goto label_30;
            }
            gged_interceptors gged0 = ((ValuableGroup)dvxj0.aS.d()).a;
            int v = gged0.size();
            boolean z = false;
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = ((Valuable)gged0.get(v1)).B() - 2;
                if(v2 != -1 && v2 != 0 && (v2 != 1 && v2 != 2)) {
                    z = true;
                }
            }
            if(!z) {
                ((ggtj)dvxj.a.h()).x("No user authentication required.");
                dvxj0.aC.setVisibility(8);
                dvxj0.aD.setVisibility(8);
                dvxj0.aI = false;
                return;
            }
            dvxj0.O(context0);
            ((ggtj)dvxj.a.h()).x("Awaiting user authentication.");
            dvxj0.aP.cancel();
            dvxj0.aP = new CancellationSignal();
            xob xob0 = dvxj0.an();
            if(xob0 != null) {
                dvxj0.aj.b(xob0, dvxj0.aP, dvxj0.aX);
                return;
            label_30:
                dvxj0.startActivityForResult(dlnf.bb(context0, dvxj0.getString(0x7F152356)), 1003);  // string:pay_valuable_view_create_screen_lock_title "Secure your phone with a screen 
                                                                                                     // lock to view this card"
                dvxj0.O(context0);
                ((ggtj)dvxj.a.h()).x("Awaiting user to set up device lock.");
                dvxj0.aI = false;
            }
        }
    }

    @Override  // edoh
    public final void b() {
        if(this.a) {
            this.b.c.c(true);
        }
        this.b.aC.setVisibility(8);
        this.b.aD.setVisibility(8);
        dvxj.W(this.b);
    }
}

