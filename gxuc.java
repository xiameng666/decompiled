import java.nio.ByteBuffer;

public final class gxuc implements gxua {
    @Override  // gxua
    public final int[] a(byte[] arr_b) {
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(ghgc.a.a(arr_b).e());
        int[] arr_v = new int[8];
        for(int v = 0; v < 8; ++v) {
            arr_v[v] = byteBuffer0.getInt();
        }
        return arr_v;
    }
}

