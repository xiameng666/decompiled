import android.content.Context;
import android.content.Intent;

public final class crpd implements Runnable {
    public final crph a;
    public final int b;
    public final crji c;
    public final Intent d;

    public crpd(crph crph0, int v, crji crji0, Intent intent0) {
        this.a = crph0;
        this.b = v;
        this.c = crji0;
        this.d = intent0;
    }

    @Override
    public final void run() {
        Context context0 = this.a.a;
        int v = this.b;
        if(((crpg)context0).b(v)) {
            this.c.k.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(v));
            crkt.i(context0).aJ().k.a("Completed wakeful intent.");
            ((crpg)context0).iK(this.d);
        }
    }
}

