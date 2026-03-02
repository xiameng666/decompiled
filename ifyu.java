import java.nio.ByteBuffer;
import java.util.Locale;

public final class ifyu implements igad {
    public final ifyw a;
    public final boolean b;

    public ifyu(ifyw ifyw0, boolean z) {
        this.a = ifyw0;
        this.b = z;
    }

    @Override  // igad
    public final void a() {
        ifyw ifyw0 = this.a;
        ByteBuffer byteBuffer0 = (ByteBuffer)ifyw0.d.flip();
        if(Long.compare(ifyw0.e, -1L) != 0 && ifyw0.e - ifyw0.f < ((long)ifyw0.d.remaining())) {
            ifyw0.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", ((long)(ifyw0.f + ((long)ifyw0.d.remaining()))), ((long)ifyw0.e))));
            return;
        }
        boolean z = this.b;
        if(ifyw0.d.remaining() == 0 && !z) {
            ifyw0.g(new IllegalStateException("Bytes read can\'t be zero except for last chunk!"));
            return;
        }
        long v = ifyw0.f;
        ByteBuffer byteBuffer1 = ifyw0.d;
        int v1;
        for(v1 = 0; byteBuffer1.hasRemaining(); v1 += ifyw0.i.write(byteBuffer1)) {
        }
        ifyw0.j.flush();
        long v2 = v + ((long)v1);
        ifyw0.f = v2;
        long v3 = ifyw0.e;
        if(v2 >= v3) {
            if(v3 != -1L) {
                goto label_23;
            }
            if(z) {
                v3 = -1L;
            label_23:
                if(v3 == -1L) {
                    ifyw0.f();
                    return;
                }
                if(v3 == v2) {
                    ifyw0.f();
                    return;
                }
                ifyw0.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", ((long)ifyw0.f), ((long)ifyw0.e))));
                return;
            }
        }
        ByteBuffer byteBuffer2 = (ByteBuffer)ifyw0.d.clear();
        ifyw0.a.set(0);
        ifyw0.b();
    }
}

