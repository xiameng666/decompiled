import android.content.Intent;

final class duwi extends ibsl implements ibtw {
    final duxk a;
    final duwt b;

    public duwi(duxk duxk0, duwt duwt0, ibrl ibrl0) {
        this.a = duxk0;
        this.b = duwt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duwi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duwi(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        if(this.a.e) {
            duwt duwt0 = this.b;
            if(!duwt0.aw()) {
                acp acp0 = duwt0.ah;
                if(acp0 == null) {
                    ibuq.j("biometricPromptLauncher");
                    acp0 = null;
                }
                Intent intent0 = dlnf.u(duwt0.requireContext());
                ibuq.e(intent0, "newBiometricSetupDialogIntent(...)");
                acp0.b(intent0);
            }
        }
        return ibom.a;
    }
}

