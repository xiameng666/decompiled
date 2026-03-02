import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class acqs {
    static byte[] a(acrk acrk0) {
        byte[] arr_b = acrk0.e.getBytes(Charset.forName("UTF-8"));
        byte[] arr_b1 = new byte[arr_b.length + 9];
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b1);
        byteBuffer0.put(arr_b);
        byteBuffer0.put(0);
        byteBuffer0.putLong(acrk0.d);
        byteBuffer0.flip();
        return arr_b1;
    }
}

