import android.content.BroadcastReceiver;
import android.content.IntentFilter;

abstract class jv {
    private BroadcastReceiver a;
    final ka c;

    public jv(ka ka0) {
        this.c = ka0;
        super();
    }

    public abstract IntentFilter a();

    public abstract void b();

    final void c() {
        BroadcastReceiver broadcastReceiver0 = this.a;
        if(broadcastReceiver0 != null) {
            try {
                this.c.j.unregisterReceiver(broadcastReceiver0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
            this.a = null;
        }
    }

    final void d() {
        this.c();
        IntentFilter intentFilter0 = this.a();
        if(intentFilter0.countActions() == 0) {
            return;
        }
        if(this.a == null) {
            this.a = new ju(this);
        }
        this.c.j.registerReceiver(this.a, intentFilter0);
    }
}

