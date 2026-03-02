final class ggyv implements ggyy {
    @Override  // ggyy
    public final Object b(ggxh ggxh0, ggxj ggxj0) {
        int v = glwy.a(ggxg.b(ggxh0, ggxj0));
        gftb.b(Long.compare(v, ggxj0.a()) <= 0, "Length too long");
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = ggxj0.a;
            ggxj0.a = 1L + v2;
            arr_b[v1] = ggxh0.a(v2);
        }
        return arr_b;
    }
}

