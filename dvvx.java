import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;

public final class dvvx implements evqf {
    public final ValuableDetailUnifiedFragment a;

    public dvvx(ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0) {
        this.a = valuableDetailUnifiedFragment0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0;
        gged_interceptors gged0 = fsig.b(((ProtoSafeParcelable)object0));
        int v = gged0.size();
        for(int v1 = 0; true; ++v1) {
            valuableDetailUnifiedFragment0 = this.a;
            if(v1 >= v) {
                ((ggtj)ValuableDetailUnifiedFragment.a.j()).B("No group found with matching ID. Valuable ID: %s;", ((Valuable)valuableDetailUnifiedFragment0.av.d()).b);
                break;
            }
            ValuableGroup valuableGroup0 = (ValuableGroup)gged0.get(v1);
            if(!((Valuable)valuableDetailUnifiedFragment0.av.d()).b.isEmpty()) {
                gfsx gfsx0 = valuableGroup0.b(((Valuable)valuableDetailUnifiedFragment0.av.d()).b);
                if(gfsx0.i()) {
                    valuableDetailUnifiedFragment0.av = gfsx.m(((Valuable)valuableGroup0.a.get(((Integer)gfsx0.d()).intValue())));
                    break;
                }
            }
        }
        gucv gucv0 = ((Valuable)valuableDetailUnifiedFragment0.av.d()).q.j;
        if(gucv0 == null) {
            gucv0 = gucv.a;
        }
        valuableDetailUnifiedFragment0.at = gucv0.f == null ? gucj.a : gucv0.f;
        valuableDetailUnifiedFragment0.aw.l(gged_interceptors.i(valuableDetailUnifiedFragment0.at.c), valuableDetailUnifiedFragment0.au, valuableDetailUnifiedFragment0, valuableDetailUnifiedFragment0, valuableDetailUnifiedFragment0, valuableDetailUnifiedFragment0.d);
    }
}

