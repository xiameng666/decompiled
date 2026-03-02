import java.io.ByteArrayOutputStream;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class bmcj {
    public final List a;
    public final int b;
    public final int c;
    public final byte d;
    public int e;
    public byte f;

    public bmcj(int v, bmcf bmcf0, byte[] arr_b) {
        gftb.check(arr_b);
        byte[] arr_b2;
        gftb.check(bmcf0);
        this.d = bmcf0.i;
        if(arr_b.length > 7609) {
            throw new InvalidParameterException("Data size cannot be larger than 7609");
        }
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        this.c = v;
        this.b = arr_b.length;
        int v1 = 57;
        byte[] arr_b1 = arr_b.length <= 57 ? arr_b : Arrays.copyOf(arr_b, 57);
        int v2 = arr_b.length - 57;
        arrayList0.add(new bmci(v, bmcf0, arr_b1, arr_b.length));
        this.f = 0;
        while(v2 > 0) {
            if(v2 > 59) {
                arr_b2 = Arrays.copyOfRange(arr_b, v1, v1 + 59);
                v2 += -59;
                v1 += 59;
            }
            else {
                int v3 = v2 + v1;
                arr_b2 = Arrays.copyOfRange(arr_b, v1, v3);
                v1 = v3;
                v2 = 0;
            }
            int v4 = this.f;
            this.f = (byte)(v4 + 1);
            bmcg bmcg0 = new bmcg(this.c, ((byte)v4), arr_b2);
            this.a.add(bmcg0);
        }
    }

    public bmcj(byte[] arr_b) {
        bmci bmci0;
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        try {
            bmci0 = new bmci(arr_b);
        }
        catch(bmcl unused_ex) {
            throw new InvalidParameterException("Data array is not a valid HidInputPacket");
        }
        this.d = bmci0.a;
        this.c = bmci0.d;
        this.b = bmci0.b;
        arrayList0.add(bmci0);
        this.e = bmci0.c.length;
    }

    public final List a() {
        return gged_interceptors.i(this.a);
    }

    public final boolean b() {
        return this.b - this.e == 0;
    }

    public final byte[] c() {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        for(Object object0: this.a()) {
            byteArrayOutputStream0.write(((bmck)object0).c);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bmcj) ? this.a.equals(((bmcj)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "HidMessage{packetList=" + this.a.toString() + ", payloadLength=" + this.b + ", channelId=" + this.c + ", payloadRead=" + this.e + ", sequence=" + this.f + "}";
    }
}

