import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;

public final class dxmn implements View.OnClickListener {
    public final dxna a;

    public dxmn(dxna dxna0) {
        this.a = dxna0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        dxmi dxmi0 = this.a.aq;
        if(dxmi0 == null) {
            ibuq.j("viewModel");
            dxmi0 = null;
        }
        dxmi.p(dxmi0, hagt.bf);
        dxmi0.j(lsc.a(dxmi0), new frxf[]{new frxg(new Intent("android.settings.SECURITY_SETTINGS"))});
    }
}

