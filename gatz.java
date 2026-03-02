import android.media.Image;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.ImageReader;
import android.util.Size;
import com.google.android.wallet.imageprocessing.base.CameraImage;

public final class gatz implements ImageReader.OnImageAvailableListener {
    public final gaue a;
    public final gatr b;

    public gatz(gaue gaue0, gatr gatr0) {
        this.a = gaue0;
        this.b = gatr0;
    }

    @Override  // android.media.ImageReader$OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader0) {
        gaue gaue0 = this.a;
        gatr gatr0 = this.b;
        try(Image image0 = imageReader0.acquireLatestImage()) {
            if(gaue0.l != null && image0 != null) {
                boolean z = true;
                int v = gaue0.o;
                gcon gcon0 = gaue0.p;
                if(image0.getFormat() != 35) {
                    throw new IllegalStateException("Unexpected image format: " + image0.getFormat());
                }
                if(v == gcon0.b) {
                    Size size0 = gcon0.a;
                    if(image0.getWidth() == size0.getWidth() && image0.getHeight() == size0.getHeight()) {
                        z = false;
                    }
                }
                if(gcon0.d == null || z) {
                    int v1 = image0.getWidth() * image0.getHeight();
                    int v2 = v1 / 4;
                    int v3 = image0.getWidth();
                    int v4 = image0.getHeight();
                    gcon0.d = new CameraImage(new byte[v1 + (v2 + v2)], 17, v3, v4, v);
                    gcon0.c = gcop.c(image0.getPlanes(), image0.getWidth(), image0.getHeight());
                    gcon0.a = new Size(image0.getWidth(), image0.getHeight());
                    gcon0.b = v;
                }
                if(gcon0.c) {
                    gcop.b(gcon0.a().getData(), image0.getPlanes(), image0.getWidth(), image0.getHeight());
                }
                else {
                    gcop.a(gcon0.a().getData(), image0.getPlanes(), image0.getWidth(), image0.getHeight());
                }
                gatr0.nF(gcon0.a());
            }
        }
    }
}

