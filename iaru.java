import android.content.IntentFilter;

public final class iaru implements Runnable {
    public final iasc a;

    public iaru(iasc iasc0) {
        this.a = iasc0;
    }

    @Override
    public final void run() {
        gftb.r(this.a.h == null, "Already registered!");
        this.a.h = new iasb(this.a);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addDataScheme("package");
        intentFilter0.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter0.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter0.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter0.addAction("android.intent.action.PACKAGE_REPLACED");
        this.a.d.registerReceiver(this.a.h, intentFilter0);
        iasb iasb0 = this.a.h;
        IntentFilter intentFilter1 = new IntentFilter("android.intent.action.USER_UNLOCKED");
        this.a.d.registerReceiver(iasb0, intentFilter1);
    }
}

