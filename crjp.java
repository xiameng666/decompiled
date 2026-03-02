import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class crjp extends BroadcastReceiver {
    public final crqq a;
    public boolean b;
    public boolean c;

    static {
    }

    public crjp(crqq crqq0) {
        this.a = crqq0;
    }

    public final Context a() {
        return this.a.e();
    }

    public final crji b() {
        return this.a.aJ();
    }

    public final void c() {
        this.a.G();
        this.a.E();
        this.a.E();
        if(!this.b) {
            return;
        }
        this.b().k.a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        try {
            this.a().unregisterReceiver(this);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            this.b().c.b("Failed to unregister the network broadcast receiver", illegalArgumentException0);
        }
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        crqq crqq0 = this.a;
        crqq0.G();
        String s = intent0.getAction();
        this.b().k.b("NetworkBroadcastReceiver received action", s);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            boolean z = crqq0.t().f();
            if(this.c != z) {
                this.c = z;
                crqq0.aK().f(new crjo(this));
            }
            return;
        }
        this.b().f.b("NetworkBroadcastReceiver received unknown action", s);
    }
}

