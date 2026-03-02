import android.content.Context;
import android.content.Intent;

public final class dndo implements ibth {
    public final dndr a;

    public dndo(dndr dndr0) {
        this.a = dndr0;
    }

    @Override  // ibth
    public final Object a() {
        Context context0 = this.a.requireContext();
        Context context1 = this.a.requireContext();
        dxev dxev0 = this.a.aQ;
        String s = null;
        if(dxev0 != null) {
            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
            if(hkhr0 != null) {
                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                if(hjwt0 != null) {
                    hjwq hjwq0 = hjwt0.d == null ? hjwq.a : hjwt0.d;
                    if(hjwq0 != null) {
                        s = hjwq0.b;
                    }
                }
            }
        }
        context0.startActivity(new Intent().setClassName(dlng.c(context1), "com.google.android.apps.wallet.barcode.scanner.BarcodeScannerActivity").putExtra("barcode_scanner_entry_point_value", ftqn.a(hkqw.class, hkqw.f)).putExtra("bacode_scanner_client_token_id", s));
        return ibom.a;
    }
}

