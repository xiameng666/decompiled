import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.mlkit.vision.barcode.aidls.BarcodeScannerOptionsParcel;

public final class dxdt {
    public static final bboh a;
    public static final icta b;
    public hbsd c;
    private static final Context d;

    static {
        dxdt.a = bboh.b(new ibuk(dxdt.class).c(), bbcu.cZ);
        dxdt.d = AppContextProvider.a();
        dxdt.b = new icta();
    }

    public dxdt() {
        if(hwvi.e()) {
            try {
                this.b();
            }
            catch(bjhw bjhw0) {
                a.ae(dxdt.a.j(), "Unable to preload the barcode scanner", bjhw0);
            }
        }
    }

    public final hbsd a() {
        hbsd hbsd0 = this.c;
        if(hbsd0 != null) {
            return hbsd0;
        }
        ibuq.j("barcodeScanner");
        return null;
    }

    public final hbsd b() {
        hbse hbse0;
        icta icta0 = dxdt.b;
        if(icta0.c()) {
            if(this.c == null) {
                Context context0 = dxdt.d;
                IBinder iBinder0 = bjia.f(context0, bjia.a, "com.google.android.gms.vision.barcode").e("com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
                if(iBinder0 == null) {
                    hbse0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
                    hbse0 = (iInterface0 instanceof hbse) ? ((hbse)iInterface0) : new hbse(iBinder0);
                }
                hbsd hbsd0 = hbse0.a(new ObjectWrapper(context0), new BarcodeScannerOptionsParcel(0, false));
                ibuq.f(hbsd0, "<set-?>");
                this.c = hbsd0;
                this.a().a();
            }
            icta0.d();
        }
        return this.c == null ? null : this.a();
    }
}

