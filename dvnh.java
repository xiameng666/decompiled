import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.pay.pass.valuable.ocr.barcode.BarcodeDetectorViewCameraX;

public final class dvnh implements View.OnClickListener {
    public final BarcodeDetectorViewCameraX a;
    public final View.OnClickListener b;

    public dvnh(BarcodeDetectorViewCameraX barcodeDetectorViewCameraX0, View.OnClickListener view$OnClickListener0) {
        this.a = barcodeDetectorViewCameraX0;
        this.b = view$OnClickListener0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        this.a.f.a(fhvv.d(), view0);
        this.b.onClick(view0);
    }
}

