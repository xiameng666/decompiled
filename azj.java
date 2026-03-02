import android.media.Image.Plane;
import java.nio.ByteBuffer;

final class azj implements bcm {
    private final Image.Plane a;

    public azj(Image.Plane image$Plane0) {
        this.a = image$Plane0;
    }

    @Override  // bcm
    public final int a() {
        return this.a.getPixelStride();
    }

    @Override  // bcm
    public final int b() {
        return this.a.getRowStride();
    }

    @Override  // bcm
    public final ByteBuffer c() {
        return this.a.getBuffer();
    }
}

