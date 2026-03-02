import android.content.Intent;
import com.google.android.gms.googlesettings.service.attribution.FeatureStatusObserverIntentOperation;

public final class buyz extends ibsl implements ibtw {
    int a;
    final FeatureStatusObserverIntentOperation b;
    final Intent c;

    public buyz(FeatureStatusObserverIntentOperation featureStatusObserverIntentOperation0, Intent intent0, ibrl ibrl0) {
        this.b = featureStatusObserverIntentOperation0;
        this.c = intent0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buyz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buyz(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.b(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

