import com.google.android.gms.trustagent.activeunlock.primary.trustagent.ActiveUnlockTrustAgentChimeraService;

public final class eyin {
    public final ActiveUnlockTrustAgentChimeraService a;
    final ActiveUnlockTrustAgentChimeraService b;

    public eyin(ActiveUnlockTrustAgentChimeraService activeUnlockTrustAgentChimeraService0) {
        this.b = activeUnlockTrustAgentChimeraService0;
        super();
        this.a = activeUnlockTrustAgentChimeraService0;
    }

    public final void a() {
        this.a.grantTrust("", 0L, 12);
    }

    public final void b(boolean z) {
        this.a.setManagingTrust(z);
    }

    public final void c(CharSequence charSequence0) {
        ibuq.f(charSequence0, "error");
        ((ggtj)this.b.a().h()).B("showKeyguardErrorMessage: %s", charSequence0);
        this.a.showKeyguardErrorMessage(charSequence0);
    }
}

