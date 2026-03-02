import android.content.Intent;
import com.google.android.chimera.android.Activity;
import java.util.List;

final class detm extends ibsl implements ibtw {
    Object a;
    int b;
    final Activity c;
    final Intent d;
    final gui e;

    public detm(Activity activity0, Intent intent0, gui gui0, ibrl ibrl0) {
        this.c = activity0;
        this.d = intent0;
        this.e = gui0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((detm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new detm(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        List list0;
        Object object1 = ibrx.a;
        if(this.b == 0) {
            ibnx.b(object0);
            Activity activity0 = this.c;
            Object object3 = devo.e(this.e);
            if(activity0 == null) {
                list0 = ibps.a;
                object2 = object3;
            }
            else {
                this.a = object3;
                this.b = 1;
                Object object4 = devo.c(activity0, this.d, this);
                if(object4 == object1) {
                    return object1;
                }
                object0 = object4;
                object2 = object3;
            label_15:
                list0 = (List)object0;
                if(list0 == null) {
                    list0 = ibps.a;
                    object2 = object2;
                    ((ibts)object2).a(new demw(list0));
                    return ibom.a;
                }
            }
        }
        else {
            object2 = this.a;
            ibnx.b(object0);
            goto label_15;
        }
        ((ibts)object2).a(new demw(list0));
        return ibom.a;
    }
}

