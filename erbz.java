import android.content.Context;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class erbz implements View.OnClickListener {
    public final erce a;
    public final boolean b;

    public erbz(erce erce0, boolean z) {
        this.a = erce0;
        this.b = z;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        erce erce0 = this.a;
        if(this.b) {
            Context context0 = erce0.getContext();
            batl.s(context0);
            erpj.b(new azts(context0, null), new ercb(erce0), new ercc(erce0));
            return;
        }
        erce.d.j("Bluetooth and/or WiFi permission confirmed, continuing the flow", new Object[0]);
        if(erce0.ak) {
            erce0.ag.setWifiEnabled(true);
        }
        erce0.a.c(erce0.ah, Bundle.EMPTY);
    }
}

