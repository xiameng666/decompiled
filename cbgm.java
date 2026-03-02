import android.os.UserHandle;
import android.os.UserManager;
import java.util.ArrayList;
import java.util.List;

public final class cbgm extends ibsl implements ibtw {
    final cbgo a;

    public cbgm(cbgo cbgo0, ibrl ibrl0) {
        this.a = cbgo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbgm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbgm(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        Object object1 = this.a.a.getSystemService(UserManager.class);
        if(object1 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        List list0 = ((UserManager)object1).getUserProfiles();
        ibuq.e(list0, "getUserProfiles(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object2: list0) {
            arrayList0.add(new cbgl(((UserHandle)object2).hashCode()));
        }
        return ggdx.a(arrayList0);
    }
}

