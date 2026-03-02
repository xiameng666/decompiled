import com.google.android.gms.pay.pass.common.barcode.BarcodeView;
import j..util.Objects;

public final class duda implements lqj {
    public final duew a;

    public duda(duew duew0) {
        this.a = duew0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        duew duew0 = this.a;
        if(((guut)object0) != null && !Objects.equals(((guut)object0), guut.a)) {
            BarcodeView barcodeView0 = duew0.aU;
            if(barcodeView0 != null) {
                barcodeView0.h(((guut)object0), false);
                duew0.aU.setContentDescription("QR code");
                BarcodeView barcodeView1 = duew0.aU;
                barcodeView1.setClickable(false);
                barcodeView1.b.setImportantForAccessibility(2);
                return;
            }
        }
        if(duew0.aR != null && duew0.aR.isShowing()) {
            duew0.ai.n();
            duew0.aR.dismiss();
        }
    }
}

