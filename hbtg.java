import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image.Plane;
import android.media.Image;
import android.os.SystemClock;
import android.util.Size;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.nio.ByteBuffer;

public final class hbtg implements bbc {
    public final hbtk a;

    public hbtg(hbtk hbtk0) {
        this.a = hbtk0;
    }

    @Override  // bbc
    public final void a(bcn bcn0) {
        hbtp hbtp0;
        int v2;
        boolean z;
        hbtk.a.f("start analyzing");
        int v = ((bdo)bcn0).b.b();
        hbtk hbtk0 = this.a;
        if(hbtk0.i == null) {
            hbtk0.i = new Size(((bdo)bcn0).c, ((bdo)bcn0).d);
        }
        hbtl hbtl0 = hbtk0.e;
        Image image0 = bcn0.d();
        batl.s(image0);
        long v1 = SystemClock.elapsedRealtime();
        hbtp.c(v);
        switch(image0.getFormat()) {
            case 35: 
            case 0x100: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        batl.c(z, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] arr_image$Plane = image0.getPlanes();
        if(image0.getFormat() == 0x100) {
            v2 = image0.getPlanes()[0].getBuffer().limit();
            batl.c(image0.getFormat() == 0x100, "Only JPEG is supported now");
            Image.Plane[] arr_image$Plane1 = image0.getPlanes();
            if(arr_image$Plane1 == null || arr_image$Plane1.length != 1) {
                throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
            }
            ByteBuffer byteBuffer0 = arr_image$Plane1[0].getBuffer();
            byteBuffer0.rewind();
            int v3 = byteBuffer0.remaining();
            byte[] arr_b = new byte[v3];
            byteBuffer0.get(arr_b);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, v3);
            hbtp0 = new hbtp(hbtt.a(bitmap0, v, bitmap0.getWidth(), bitmap0.getHeight()));
        }
        else {
            for(int v4 = 0; v4 < arr_image$Plane.length; ++v4) {
                Image.Plane image$Plane0 = arr_image$Plane[v4];
                if(image$Plane0.getBuffer() != null) {
                    image$Plane0.getBuffer().rewind();
                }
            }
            hbtp0 = new hbtp(image0, image0.getWidth(), image0.getHeight(), v);
            v2 = image0.getPlanes()[0].getBuffer().limit() * 3 / 2;
        }
        hbtp.a(image0.getFormat(), 5, v1, image0.getHeight(), image0.getWidth(), v2, v);
        evql evql0 = ((MobileVisionBase)hbtl0.a).c(hbtp0);
        evql0.b(new dvni(hbtl0.b.a, hbtl0.b.b));
        evql0.z(new hbth(bcn0));
    }
}

