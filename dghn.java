import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class dghn {
    public static final byte[] a(gmnb gmnb0) {
        gmmp gmmp0 = gmnb0.d().a();
        ibuq.d(gmmp0, "null cannot be cast to non-null type com.google.crypto.tink.signature.EcdsaPublicKey");
        byte[] arr_b = gnqs.p(gnqp.a, gnqr.b, ((gnjn)gmmp0).b);
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 2);
        ibuq.e(byteBuffer0, "allocate(...)");
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
        byteBuffer0.putShort(0);
        byteBuffer0.put(arr_b);
        byte[] arr_b1 = byteBuffer0.array();
        ibuq.e(arr_b1, "array(...)");
        return arr_b1;
    }
}

