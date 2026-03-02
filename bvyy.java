import android.view.View;
import android.view.ViewGroup;

final class bvyy implements icih {
    final du a;
    final ibts b;

    public bvyy(du du0, ibts ibts0) {
        this.a = du0;
        this.b = ibts0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        if(!((hgmn)object0).d) {
            View view0 = this.a.requireView();
            ViewGroup viewGroup0 = (view0 instanceof ViewGroup) ? ((ViewGroup)view0) : null;
            if(viewGroup0 != null) {
                bwdz.h(viewGroup0, 150L, false);
            }
        }
        this.b.a(((hgmn)object0));
        return ibom.a;
    }
}

