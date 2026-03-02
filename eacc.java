import com.google.android.gms.pay.secard.view.template.SePrepaidCardLoadingScreenTemplate;

public final class eacc implements icih {
    final eacl a;

    public eacc(eacl eacl0) {
        this.a = eacl0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        eacl eacl0 = this.a;
        if((((frxf)object0) instanceof eacn)) {
            SePrepaidCardLoadingScreenTemplate sePrepaidCardLoadingScreenTemplate0 = (SePrepaidCardLoadingScreenTemplate)eacl0.requireView().findViewById(0x7F0B0540);  // id:LoadingScreen
            if(hwev.c()) {
                dyna dyna0 = dyna.b(eacl0.y().g.c);
                if(dyna0 == null) {
                    dyna0 = dyna.k;
                }
                ibuq.e(dyna0, "getServiceProvider(...)");
                sePrepaidCardLoadingScreenTemplate0.c(dyna0);
            }
            sePrepaidCardLoadingScreenTemplate0.setVisibility(0);
            return ibom.a;
        }
        if((((frxf)object0) instanceof eacm)) {
            acp acp0 = eacl0.b;
            if(acp0 == null) {
                ibuq.j("provisionStartLauncher");
                acp0 = null;
            }
            acp0.b(((eacm)(((frxf)object0))).a);
        }
        return ibom.a;
    }
}

