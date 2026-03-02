import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;

public final class erca implements View.OnClickListener {
    public final erce a;
    public final boolean b;

    public erca(erce erce0, boolean z) {
        this.a = erce0;
        this.b = z;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        erce erce0 = this.a;
        if(!erce0.aj && !this.b && !erce0.ak) {
            erce.d.j("Location permission denied on S+ device, continuing the flow but WiFi will not be transferred", new Object[0]);
            erce0.a.c(erce0.ah, Bundle.EMPTY);
            return;
        }
        erce.d.j("Required permissions denied, finishing activity", new Object[0]);
        erce0.a.c(erce0.ai, Bundle.EMPTY);
    }
}

