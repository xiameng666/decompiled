import j..util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidParameterException;
import java.util.Arrays;

public final class bmci extends bmck {
    public final byte a;
    public final int b;

    public bmci(int v, bmcf bmcf0, byte[] arr_b, int v1) {
        super(arr_b);
        gftb.check(arr_b);
        this.d = v;
        this.a = bmcf0.i;
        this.b = v1;
        if(arr_b.length > 57) {
            throw new InvalidParameterException("Data size is greater than maximum of 57");
        }
        if(arr_b.length <= v1) {
            return;
        }
        throw new InvalidParameterException("Payload length cannot be less than data size");
    }

    public bmci(byte[] arr_b) {
        try {
            ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
            byte[] arr_b1 = new byte[4];
            byteArrayInputStream0.read(arr_b1);
            this.d = ByteBuffer.wrap(arr_b1).getInt();
            this.a = (byte)byteArrayInputStream0.read();
            int v = byteArrayInputStream0.read() << 8 | byteArrayInputStream0.read();
            this.b = v;
            this.c = new byte[Math.min(v, 57)];
            byteArrayInputStream0.read(this.c);
        }
        catch(IOException iOException0) {
            throw new bmcl("HidInitPacket failed to parse from byte array provided.", iOException0);
        }
    }

    @Override  // bmck
    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x40);
        try {
            byteArrayOutputStream0.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(this.d).array());
            byteArrayOutputStream0.write(((int)this.a));
            byteArrayOutputStream0.write(this.b >>> 8);
            byteArrayOutputStream0.write(this.b);
            byteArrayOutputStream0.write(this.c);
            byteArrayOutputStream0.write(new byte[0x40 - byteArrayOutputStream0.size()]);
            return byteArrayOutputStream0.toByteArray();
        }
        catch(IOException iOException0) {
            throw new bmcl("Failed to serialize HidInitPacket", iOException0);
        }
    }

    @Override  // bmck
    public final boolean equals(Object object0) {
        return (object0 instanceof bmci) ? super.equals(object0) && ((bmci)object0).d == this.d && ((bmci)object0).b == this.b : false;
    }

    @Override  // bmck
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.c);
        return Objects.hash(new Object[]{((int)this.b), ((byte)this.a), integer0, ((int)this.d)});
    }
}

