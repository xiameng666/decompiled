import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;

public final class atjd extends FilterInputStream implements InputStreamRetargetInterface {
    private final gdjg a;
    private boolean b;
    private final MessageDigest c;
    private final ghga d;

    public atjd(InputStream inputStream0, gdjg gdjg0, MessageDigest messageDigest0, ghga ghga0) {
        super(inputStream0);
        this.b = false;
        this.a = gdjg0;
        this.c = messageDigest0;
        if(messageDigest0 != null) {
            messageDigest0.reset();
        }
        this.d = ghga0;
    }

    public final gdjh a() {
        if(!this.b && !hqkg.c()) {
            return null;
        }
        gdjg gdjg0 = this.a;
        int v = gdjg0.b;
        int v1 = (int)(gdjg0.c % ((long)v));
        if(v1 > 0) {
            Integer integer0 = gdjg0.d.a(v1);
            gdjd gdjd0 = new gdjd(gdjg0.c - ((long)v1), gdjg0.d.e(v1));
            return new gdjh(gdjg0.a, v, v1, integer0, gdjd0);
        }
        return new gdjh(gdjg0.a, v, v1, null, null);
    }

    @Override
    public final void close() {
        super.close();
        this.b = true;
    }

    @Override
    public final boolean markSupported() {
        return false;
    }

    @Override
    public final int read() {
        int v = super.read();
        if(v >= 0) {
            this.a.a(((byte)v));
            MessageDigest messageDigest0 = this.c;
            if(messageDigest0 != null) {
                messageDigest0.update(((byte)v));
            }
            ghga ghga0 = this.d;
            if(ghga0 != null) {
                ghga0.e(((byte)v));
            }
            return v;
        }
        this.b = true;
        return v;
    }

    @Override
    public final int read(byte[] arr_b) {
        return this.read(arr_b, 0, arr_b.length);
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v2 = super.read(arr_b, v, v1);
        if(v2 > 0) {
            gdjg gdjg0 = this.a;
            for(int v3 = v; v3 < v + v2; ++v3) {
                gdjg0.a(arr_b[v3]);
            }
            MessageDigest messageDigest0 = this.c;
            if(messageDigest0 != null) {
                messageDigest0.update(arr_b, v, v2);
            }
            ghga ghga0 = this.d;
            if(ghga0 != null) {
                ghga0.i(arr_b, v, v2);
            }
            return v2;
        }
        this.b = true;
        return v2;
    }

    @Override
    public final long skip(long v) {
        long v1;
        for(v1 = 0L; v > v1; v1 += (long)v2) {
            int v2 = this.read(new byte[0x400], 0, ((int)Math.min(0x400L, v - v1)));
            if(v2 <= 0) {
                break;
            }
        }
        return v1;
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

