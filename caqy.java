import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.kids.auth.flow.KidsAuthRemoveAccountChimeraActivity;

public final class caqy extends ibsl implements ibtw {
    int a;
    final KidsAuthRemoveAccountChimeraActivity b;

    public caqy(KidsAuthRemoveAccountChimeraActivity kidsAuthRemoveAccountChimeraActivity0, ibrl ibrl0) {
        this.b = kidsAuthRemoveAccountChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((caqy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new caqy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        boolean z = false;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            if(huiu.c()) {
                return Boolean.valueOf(z);
            }
            KidsAuthRemoveAccountChimeraActivity kidsAuthRemoveAccountChimeraActivity0 = this.b;
            if(!caqd.b(kidsAuthRemoveAccountChimeraActivity0.a())) {
                goto label_14;
            }
            cbpp cbpp0 = new cbpp(kidsAuthRemoveAccountChimeraActivity0.a());
            kidsAuthRemoveAccountChimeraActivity0.a();
            this.a = 1;
            object0 = cbpp.j(cbpp0);
            if(object0 == object1) {
                return object1;
            label_14:
                ModuleManager moduleManager0 = ModuleManager.get(kidsAuthRemoveAccountChimeraActivity0.a());
                ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
                moduleManager$FeatureCheck0.checkFeatureAtAnyVersion("kids");
                if(moduleManager0.checkFeaturesAreAvailable(moduleManager$FeatureCheck0) == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return Boolean.valueOf(((Boolean)object0).booleanValue());
    }
}

