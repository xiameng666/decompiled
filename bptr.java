import android.content.IntentFilter;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;

public final class bptr implements jqv {
    public final bptx a;
    public final AtomicReference b;
    public final String c;

    public bptr(bptx bptx0, AtomicReference atomicReference0, String s) {
        this.a = bptx0;
        this.b = atomicReference0;
        this.c = s;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        bptk bptk0 = new bptk(jqt0);
        this.b.set(bptk0);
        Uri uri0 = bpuh.a(this.c, "/findmydevice/provisioning-state");
        baqc.c(uri0, "uri must not be null");
        IntentFilter[] arr_intentFilter = {fdlk.b("com.google.android.gms.wearable.DATA_CHANGED", uri0, 0)};
        azyf azyf0 = azyg.b(bptk0, this.a.b.B, "DataListener");
        azyq azyq0 = new azyq();
        azyq0.c = azyf0;
        azyq0.a = new fdgz(bptk0, azyf0, arr_intentFilter);
        azyq0.b = new fdha(bptk0);
        azyq0.e = 0x5DCF;
        azyr azyr0 = azyq0.a();
        this.a.b.iH(azyr0);
        return "waitForProvisioningStateChange";
    }
}

