import android.content.Intent;

public final class dumu implements ibth {
    public final duoa a;

    public dumu(duoa duoa0) {
        this.a = duoa0;
    }

    @Override  // ibth
    public final Object a() {
        duoa duoa0 = this.a;
        acp acp0 = duoa0.aj;
        edse edse0 = null;
        if(acp0 == null) {
            ibuq.j("installWalletLauncher");
            acp0 = null;
        }
        edse edse1 = duoa0.c;
        if(edse1 == null) {
            ibuq.j("walletInstallManager");
        }
        else {
            edse0 = edse1;
        }
        Intent intent0 = edse0.a("IdProvisioningStatusFragment");
        ibuq.e(intent0, "getInstallWalletIntent(...)");
        acp0.b(intent0);
        return ibom.a;
    }
}

