import android.graphics.Bitmap;
import android.media.Image.Plane;
import android.media.Image;
import android.os.SystemClock;
import java.nio.ByteBuffer;

public final class hbtp {
    public volatile Bitmap a;
    public volatile ByteBuffer b;
    public volatile hbto c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public hbtp(Bitmap bitmap0) {
        batl.s(bitmap0);
        this.a = bitmap0;
        this.d = bitmap0.getWidth();
        this.e = bitmap0.getHeight();
        hbtp.c(0);
        this.f = 0;
        this.g = -1;
    }

    public hbtp(Image image0, int v, int v1, int v2) {
        this.c = new hbto(image0);
        this.d = v;
        this.e = v1;
        hbtp.c(v2);
        this.f = v2;
        this.g = 35;
    }

    public hbtp(ByteBuffer byteBuffer0, int v, int v1, int v2, int v3) {
        boolean z1;
        boolean z = false;
        switch(v3) {
            case 17: {
                v3 = 17;
                z1 = true;
                break;
            }
            case 842094169: {
                z1 = true;
                break;
            }
            default: {
                z1 = false;
            }
        }
        batl.b(z1);
        batl.s(byteBuffer0);
        this.b = byteBuffer0;
        if(byteBuffer0.limit() > v * v1) {
            z = true;
        }
        batl.c(z, "Image dimension, ByteBuffer size and format don\'t match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer0.rewind();
        this.d = v;
        this.e = v1;
        hbtp.c(v2);
        this.f = v2;
        this.g = v3;
    }

    public static void a(int v, int v1, long v2, int v3, int v4, int v5, int v6) {
        hbri.b("vision-common").c(new hbrj(v, v1, v5, v3, v4, SystemClock.elapsedRealtime() - v2, v6), hbko.bG);
    }

    public final Image.Plane[] b() {
        return this.c == null ? null : this.c.a.getPlanes();
    }

    public static void c(int v) {
        batl.c(v == 0 || v == 90 || v == 180 || v == 270, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public static hbtp d(Bitmap bitmap0) {
        long v = SystemClock.elapsedRealtime();
        hbtp hbtp0 = new hbtp(bitmap0);
        hbtp.a(-1, 1, v, bitmap0.getHeight(), bitmap0.getWidth(), bitmap0.getAllocationByteCount(), 0);
        return hbtp0;
    }
}

