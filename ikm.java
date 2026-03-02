import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

final class ikm extends ibuo implements ibth {
    public ikm(Object object0) {
        super(0, object0, imd.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
    }

    @Override  // ibth
    public final Object a() {
        View view0 = (View)this.e;
        view0.setImportantForContentCapture(1);
        ContentCaptureSession contentCaptureSession0 = view0.getContentCaptureSession();
        return contentCaptureSession0 == null ? null : new isc(contentCaptureSession0, view0);
    }
}

