import android.net.Uri;

public final class bwhs extends clid {
    final bwht a;

    public bwhs(bwht bwht0, clht clht0) {
        this.a = bwht0;
        super("home_stub", "DeviceProvisionedObserver", clht0);
    }

    @Override  // clid
    protected final void a(boolean z, Uri uri0) {
        bwht bwht0 = this.a;
        if(bwhr.a(bwht0.b)) {
            bboh bboh0 = bwht.a;
            ((ggtj)bboh0.h()).x("device provisioned");
            synchronized(bwht0) {
                if(bwht0.c == null) {
                    bwht0.a();
                    return;
                }
                ((ggtj)bboh0.h()).x("Calling provision listener");
                bwhp bwhp0 = bwht0.c;
                ibuq.c(bwhp0);
                bwhp0.a();
            }
            return;
        }
        ((ggtj)bwht.a.h()).x("device not yet provisioned");
    }
}

