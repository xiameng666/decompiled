import com.google.android.gms.smartdevice.quickstart.SourceQuickStartChimeraService;

public final class eqye implements evpz {
    public final eqwk a;

    public eqye(eqwk eqwk0) {
        this.a = eqwk0;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        if(evql0.n()) {
            SourceQuickStartChimeraService.a.d("startDiscovery succeed.", new Object[0]);
            return;
        }
        Exception exception0 = evql0.i();
        if((exception0 instanceof aztb)) {
            int v = ((aztb)exception0).b();
            SourceQuickStartChimeraService.a.m("startDiscovery failed with: %d", new Object[]{v});
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eqoc.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((eqoc)hftv0).c = 1;
            ((eqoc)hftv0).b |= 1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            eqoc eqoc0 = (eqoc)hftp0.b_message;
            eqoc0.b |= 2;
            eqoc0.d = v;
            eqoc eqoc1 = (eqoc)hftp0.N_build();
            this.a.a.f.g(10806, eqoc1);
            this.a.a.g.a(10806, eqoc1);
        }
    }
}

