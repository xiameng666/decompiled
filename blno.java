import android.content.Context;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

final class blno extends clck {
    public final evqp a;
    public final Context b;
    public boolean c;
    private byte[] d;
    private int e;

    public blno(Context context0) {
        this.a = new evqp();
        this.d = new byte[0];
        this.b = context0;
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        if(clcq0.a() != 200) {
            IOException iOException0 = new IOException(a.aD(((clex)clcq0), "Non-200 HTTP status received: "));
            this.a.a(iOException0);
            return;
        }
        String s = new String(this.d, 0, this.e, StandardCharsets.UTF_8);
        this.a.b(s);
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        this.a.a(clbw0);
    }

    @Override  // clck
    public final void e(clcn clcn0, clcq clcq0) {
        clcn0.d(ByteBuffer.allocateDirect(0x1000));
    }

    @Override  // clck
    public final void f(gfsx gfsx0) {
        IOException iOException0 = new IOException("canceled");
        this.a.a(iOException0);
    }

    @Override  // clck
    public final void gg(clcn clcn0, clcq clcq0, ByteBuffer byteBuffer0) {
        byteBuffer0.flip();
        int v = byteBuffer0.limit() + this.e;
        if(v < this.e) {
            throw new IOException("overflow");
        }
        byte[] arr_b = this.d;
        if(v > arr_b.length) {
            if(v + 0x4000 >= v) {
                v += 0x4000;
            }
            this.d = Arrays.copyOf(arr_b, v);
        }
        byteBuffer0.get(this.d, this.e, byteBuffer0.limit());
        int v1 = this.e + byteBuffer0.limit();
        this.e = v1;
        if(v1 > 0x80000) {
            throw new IOException("assetlinks.json is too large to be downloaded");
        }
        byteBuffer0.clear();
        clcn0.d(byteBuffer0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        if(!s.startsWith("https://")) {
            throw new IOException("Rejecting redirect to non-HTTPS URL: " + s);
        }
        clcn0.c();
    }
}

