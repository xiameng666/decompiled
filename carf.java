import android.os.Bundle;
import com.google.android.gms.kids.auth.flow.KidsAuthSetupChimeraActivity;

public final class carf extends ibsl implements ibtw {
    int a;
    final KidsAuthSetupChimeraActivity b;
    final Bundle c;

    public carf(KidsAuthSetupChimeraActivity kidsAuthSetupChimeraActivity0, Bundle bundle0, ibrl ibrl0) {
        this.b = kidsAuthSetupChimeraActivity0;
        this.c = bundle0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((carf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new carf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.g(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

