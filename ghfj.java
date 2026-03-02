import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public abstract class ghfj extends ghff {
    @Override  // ghff
    public final ghfy c(CharSequence charSequence0, Charset charset0) {
        return this.a(charSequence0.toString().getBytes(charset0));
    }

    @Override  // ghff
    public final ghfy d(CharSequence charSequence0) {
        int v = charSequence0.length();
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(v + v).order(ByteOrder.LITTLE_ENDIAN);
        for(int v1 = 0; v1 < v; ++v1) {
            byteBuffer0.putChar(charSequence0.charAt(v1));
        }
        return this.a(byteBuffer0.array());
    }

    @Override  // ghff
    public final ghga e(int v) {
        gftb.checkTrue(v >= 0);
        return new ghfh(this, v);
    }

    @Override  // ghfz
    public final ghga h() {
        return this.e(0x20);
    }
}

