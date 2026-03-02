import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockTrustAgentChimeraService;

public final class eyig {
    public final ActiveUnlockTrustAgentChimeraService a;

    public eyig(ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0) {
        this.a = activeUnlockTrustAgentChimeraService0;
    }

    public final void a(boolean z) {
        ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0 = this.a;
        if(z) {
            ((ggtj)activeUnlockTrustAgentChimeraService0.a().h()).x("Coarse proximity gained, granting trust");
            activeUnlockTrustAgentChimeraService0.n.a();
            eyis eyis0 = activeUnlockTrustAgentChimeraService0.e();
            eyis0.d = eyis0.c ^ 1;
            int v = eyis0.e;
            if(v != 1) {
                ggtj ggtj0 = (ggtj)eyis0.a.j();
                if(v == 0) {
                    throw null;
                }
                ggtj0.B("Unexpected call to onBootstrapTrust() in state %s", eyiq.a(v));
                eyis0.b();
                return;
            }
            eyis0.b();
            return;
        }
        ((ggtj)activeUnlockTrustAgentChimeraService0.a().h()).x("Coarse proximity lost, revoking trust");
        activeUnlockTrustAgentChimeraService0.n.a.revokeTrust();
        activeUnlockTrustAgentChimeraService0.e().e = 1;
    }
}

