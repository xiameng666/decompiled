public final class tjy implements esrz {
    public final tto a;
    public final tju b;

    static {
    }

    public tjy(tto tto0, tju tju0) {
        this.a = tto0;
        this.b = tju0;
    }

    @Override  // esrz
    public final byte[] a() {
        try {
            twj twj0 = this.a.c;
            tkj tkj0 = new tkj();
            ttv ttv0 = twl.a(this.a, tkj0, ttq.a);
            return new sxq(twe.g(ttv0, ((twe)new tqb(twj0).a(Byte.valueOf(((byte)-92)))).c(ttv0.d)), sxr.g).a();
        }
        catch(tkg tkg0) {
            throw new RuntimeException(tkg0);
        }
    }

    @Override  // esrz
    public final byte[] b(int v) {
        tww tww0 = new tww(null);
        byte[] arr_b = tww0.c();
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            if(arr_b[v1] != 0) {
                int v2 = arr_b.length - v1;
                byte[] arr_b1 = new byte[v2];
                System.arraycopy(tww0.a, v1, arr_b1, 0, v2);
                return this.a.b().g(arr_b1);
            }
        }
        return this.a.b().g(new byte[]{0});
    }
}

