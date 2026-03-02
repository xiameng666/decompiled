import com.google.android.gms.pay.pass.valuable.ocr.barcode.BarcodeDetectorViewCameraX;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

public final class dvnk implements AndroidInjector {
    private final domv a;

    public dvnk(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        BarcodeDetectorViewCameraX barcodeDetectorViewCameraX0 = (BarcodeDetectorViewCameraX)object0;
        barcodeDetectorViewCameraX0.c = edpt.a(this.a.a());
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        barcodeDetectorViewCameraX0.d = fhwk0;
        barcodeDetectorViewCameraX0.e = this.a.j();
        barcodeDetectorViewCameraX0.f = this.a.g();
        barcodeDetectorViewCameraX0.g = this.a.h();
    }
}

