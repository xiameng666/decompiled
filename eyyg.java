import android.view.View;
import com.google.android.gms.trustagent.activeunlock.primary.ui.setup.ExplanationFragment;
import java.util.List;

public final class eyyg extends ibsl implements ibtw {
    int a;
    final ExplanationFragment b;
    final List c;

    public eyyg(ExplanationFragment explanationFragment0, List list0, ibrl ibrl0) {
        this.b = explanationFragment0;
        this.c = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyyg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyyg(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            eyzb eyzb0 = this.b.D();
            this.a = 1;
            object0 = eyzb0.b(exjx.f, this);
            if(object0 == object1) {
                return object1;
            }
        }
        if(((Boolean)object0).booleanValue()) {
            for(Object object2: this.c) {
                ((View)object2).setVisibility(0);
            }
            return ibom.a;
        }
        for(Object object3: this.c) {
            ((View)object3).setVisibility(8);
        }
        return ibom.a;
    }
}

