import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class akwk {
    public static final byte[] a(byte[] arr_b, long v, byte[] arr_b1) {
        byte[] arr_b2 = arr_b1 == null ? ByteBuffer.allocate(arr_b.length + 8).put(arr_b).putLong(v).array() : ByteBuffer.allocate(arr_b.length + arr_b1.length + 8).put(arr_b).put(arr_b1).putLong(v).array();
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA-256");
            messageDigest0.update(arr_b2);
            byte[] arr_b3 = messageDigest0.digest();
            return new byte[]{arr_b3[0], arr_b3[1]};
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            akwm.a.m("Failed to generate EID. eidSeed: %s, startOfPeriodMs: %s, extraEntropy: %s, exception: %s", new Object[]{arr_b, v, arr_b1, noSuchAlgorithmException0});
            return null;
        }
    }
}

