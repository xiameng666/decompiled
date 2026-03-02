import android.content.Intent;
import com.google.android.chimera.android.Activity;
import java.util.List;

final class deuf extends ibsl implements ibtw {
    Object a;
    int b;
    final dixi c;
    final Activity d;
    final Intent e;

    public deuf(dixi dixi0, Activity activity0, Intent intent0, ibrl ibrl0) {
        this.c = dixi0;
        this.d = activity0;
        this.e = intent0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deuf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deuf(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            ((dixi)object2).a(new demw(((List)object0)));
            return ibom.a;
        }
        ibnx.b(object0);
        dixi dixi0 = this.c;
        this.a = dixi0;
        this.b = 1;
        Object object3 = devo.c(this.d, this.e, this);
        if(object3 != object1) {
            object0 = object3;
            object2 = dixi0;
            ((dixi)object2).a(new demw(((List)object0)));
            return ibom.a;
        }
        return object1;
    }
}

