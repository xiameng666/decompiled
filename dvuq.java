import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvuq implements View.OnClickListener {
    public final dvuz a;
    public final String b;
    public final gged_interceptors c;

    public dvuq(dvuz dvuz0, String s, gged_interceptors gged0) {
        this.a = dvuz0;
        this.b = s;
        this.c = gged0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dvuz dvuz0 = this.a;
        gged_interceptors gged0 = this.c;
        gmcd gmcd0 = dvuz0.h.d(this.b, gged0);
        dvuz0.T.add(gmcd0);
        if(!gged0.isEmpty()) {
            dvtg dvtg0 = dvuz0.l;
            int v = 0;
            String s = (String)gged0.get(0);
            if(((dvxj)dvtg0).aS.i()) {
                ValuableGroup valuableGroup0 = (ValuableGroup)((dvxj)dvtg0).aS.d();
                if(valuableGroup0.b(s).i()) {
                    v = (int)(((Integer)valuableGroup0.b(s).d()));
                }
                else if(valuableGroup0.c(s).i()) {
                    v = (int)(((Integer)valuableGroup0.c(s).d()));
                }
            }
            ((dvxj)dvtg0).aB.j(v, true);
        }
        dvuz0.d.setVisibility(8);
        dvuz0.B.l(((Valuable)dvuz0.r.d()), 8, 4);
    }
}

