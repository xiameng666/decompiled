import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.SetupCompleteFragment;

public final class eyzf extends ibsl implements ibtw {
    int a;
    final SetupCompleteFragment b;
    final View c;

    public eyzf(SetupCompleteFragment setupCompleteFragment0, View view0, ibrl ibrl0) {
        this.b = setupCompleteFragment0;
        this.c = view0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyzf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyzf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.C(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

