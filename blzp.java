import j..util.Objects;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.Arrays;

public final class blzp {
    public final byte[] a;

    public blzp(blzo blzo0, byte[] arr_b) {
        gftb.check(arr_b);
        if(arr_b.length == 0x20) {
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(33);
            byteBuffer0.put(blzo0.d);
            byteBuffer0.put(arr_b);
            this.a = byteBuffer0.array();
            return;
        }
        this.a = arr_b;
    }

    public blzp(byte[] arr_b) {
        this(blzo.b, arr_b);
    }

    public final blzo a() {
        byte[] arr_b = this.a;
        if(arr_b.length != 33 && arr_b.length != 65) {
            throw new bmby("Invalid key handle");
        }
        try {
            return blzo.a(arr_b[0]);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new bmby("Invalid key handle type", illegalArgumentException0);
        }
    }

    public static byte[] b(byte b, byte[] arr_b, String s, PublicKey publicKey0) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA256");
            messageDigest0.update(s.getBytes("UTF-8"));
            messageDigest0.update(publicKey0.getEncoded());
            int v = messageDigest0.getDigestLength();
            ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 1 + v);
            byteBuffer0.put(b);
            byteBuffer0.put(arr_b);
            byteBuffer0.put(messageDigest0.digest());
            return byteBuffer0.array();
        }
        catch(NoSuchAlgorithmException | UnsupportedEncodingException exception0) {
            throw new RuntimeException("Error encoding keyHandle, broken crypto provider?", exception0);
        }
    }

    public final byte[] c() {
        return this.a.length == 33 ? Arrays.copyOfRange(this.a, 1, 33) : Arrays.copyOf(this.a, this.a.length);
    }

    public final byte[] d() {
        byte[] arr_b = this.a;
        if(arr_b.length != 33 && arr_b.length != 65) {
            throw new bmby("Invalid key handle");
        }
        return Arrays.copyOfRange(arr_b, 1, 33);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof blzp) ? Arrays.equals(this.a, ((blzp)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{Arrays.hashCode(this.a)});
    }
}

