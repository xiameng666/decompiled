import com.google.android.gms.common.Feature;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import com.google.mlkit.vision.text.TextRecognizer;
import java.util.concurrent.Executor;

public final class hbxn extends MobileVisionBase implements TextRecognizer {
    private final hbwm a;

    public hbxn(hbxs hbxs0, Executor executor0, hbqy hbqy0, hbwm hbwm0) {
        super(hbxs0, executor0);
        this.a = hbwm0;
        hbkp hbkp0 = new hbkp();
        hbkp0.c = hbwm0.h() ? hbkm.c : hbkm.b;
        hbnx hbnx0 = new hbnx();
        hbnz hbnz0 = new hbnz();
        hbnz0.a = hbxj.a(hbwm0.b());
        hbnx0.c = new hbob(hbnz0);
        hbkp0.d = new hbny(hbnx0);
        hbqy0.e(new hbrb(hbkp0, 1), hbko.g);
    }

    @Override  // com.google.mlkit.vision.text.TextRecognizer
    public final evql a(hbtp hbtp0) {
        return super.c(hbtp0);
    }

    @Override  // azty
    public final Feature[] gm() {
        return hbxl.a(this.a);
    }
}

