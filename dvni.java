import android.os.Vibrator;
import com.google.android.gms.pay.pass.valuable.ocr.barcode.BarcodeDetectorViewCameraX;
import java.util.List;

public final class dvni implements evqf {
    public final BarcodeDetectorViewCameraX a;
    public final dvnf b;

    public dvni(BarcodeDetectorViewCameraX barcodeDetectorViewCameraX0, dvnf dvnf0) {
        this.a = barcodeDetectorViewCameraX0;
        this.b = dvnf0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        if(!((List)object0).isEmpty()) {
            BarcodeDetectorViewCameraX barcodeDetectorViewCameraX0 = this.a;
            if(barcodeDetectorViewCameraX0.c.i()) {
                ((Vibrator)barcodeDetectorViewCameraX0.c.d()).vibrate(50L);
            }
            if(hwln.a.c().h()) {
                fhwb fhwb0 = barcodeDetectorViewCameraX0.g;
                fhvz fhvz0 = fhwa.a(253016);
                fhvz0.c(fhwp.b(barcodeDetectorViewCameraX0.h));
                fhwb0.a(fhvz0.a());
            }
            hbsn hbsn0 = (hbsn)((List)object0).get(0);
            this.b.a(hbsn0);
            barcodeDetectorViewCameraX0.a.a();
        }
    }
}

