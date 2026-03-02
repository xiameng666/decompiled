import com.google.android.gms.common.Feature;
import com.google.mlkit.vision.barcode.BarcodeScanner;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.util.concurrent.Executor;

public final class hbsv extends MobileVisionBase implements BarcodeScanner {
    public static final hbrq a;
    private final boolean d;

    static {
        hbsv.a = new hbrp().a();
    }

    public hbsv(hbrq hbrq0, hbsz hbsz0, Executor executor0, hbqy hbqy0) {
        super(hbsz0, executor0);
        boolean z = hbsq.d();
        this.d = z;
        hbla hbla0 = new hbla();
        hbla0.b = hbsq.a(hbrq0);
        hblb hblb0 = new hblb(hbla0);
        hbkp hbkp0 = new hbkp();
        hbkp0.c = z ? hbkm.c : hbkm.b;
        hbkp0.f = hblb0;
        hbqy0.e(new hbrb(hbkp0, 1), hbko.k);
    }

    @Override  // com.google.mlkit.vision.barcode.BarcodeScanner
    public final evql a(hbtp hbtp0) {
        return super.c(hbtp0).g(new hbst());
    }

    @Override  // azty
    public final Feature[] gm() {
        return this.d ? hawq.a : new Feature[]{hawq.b};
    }
}

