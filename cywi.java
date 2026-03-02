import android.content.IntentFilter;

public final class cywi implements Runnable {
    public final cyww a;

    public cywi(cyww cyww0) {
        this.a = cyww0;
    }

    @Override
    public final void run() {
        this.a.k.h();
        this.a.b.j(this.a);
        cywf cywf0 = new cywf(this.a);
        this.a.g.execute(cywf0);
        this.a.h = icbb.b(iccl.b(cclv.a(this.a.g)), null, null, new cywv(this.a, null), 3);
        IntentFilter intentFilter0 = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.a.a.registerReceiver(this.a.n, intentFilter0, 2);
    }
}

