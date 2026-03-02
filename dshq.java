import com.google.android.gms.pay.pass.common.barcode.ScanView;
import dagger.android.AndroidInjector;

public final class dshq implements AndroidInjector {
    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ScanView)object0).b = new bblp(0x7FFFFFFF, 9);
    }
}

