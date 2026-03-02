public final class cztz implements gxua {
    @Override  // gxua
    public final int[] a(byte[] arr_b) {
        int[] arr_v = new int[5];
        long v = ghgz.a.a(arr_b).c();
        for(int v1 = 1; v1 <= 5; ++v1) {
            int v2 = ((int)(v >>> 0x20)) * v1 + ((int)v);
            arr_v[v1 - 1] = v2 >= 0 ? ((int)(v >>> 0x20)) * v1 + ((int)v) : ~v2;
        }
        return arr_v;
    }
}

