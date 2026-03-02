public final class tfm implements esrz {
    public static final String a = "tfm";
    public final tgg b;
    public final tfi c;

    static {
    }

    public tfm(tgg tgg0, tfi tfi0) {
        tjk.f("--> CardProfileImpl", new Object[0]);
        this.b = tgg0;
        this.c = tfi0;
        tjk.f("<-- CardProfileImpl", new Object[0]);
    }

    @Override  // esrz
    public final byte[] a() {
        tgn tgn0;
        tjk.f("--> getPpseFci", new Object[0]);
        tjb tjb0 = this.b.b;
        try {
            tfx tfx0 = new tfx();
            tgn0 = tjd.a(this.b, tfx0, tgi.a);
        }
        catch(tfu tfu0) {
            throw new RuntimeException(tfu0);
        }
        byte[] arr_b = new ter(tiw.g(tgn0, ((tiw)new ttc(tjb0).a(Byte.valueOf(((byte)-92)))).c(tgn0.b)), tes.g).a();
        tjk.f("<-- getPpseFci", new Object[0]);
        return arr_b;
    }

    @Override  // esrz
    public final byte[] b(int v) {
        byte[] arr_b1;
        tjk.f("--> getTagValue", new Object[0]);
        tjp tjp0 = new tjp(null);
        byte[] arr_b = tjp0.c();
        for(int v1 = 0; true; ++v1) {
            if(v1 >= arr_b.length) {
                arr_b1 = new byte[]{0};
                break;
            }
            if(arr_b[v1] != 0) {
                int v2 = arr_b.length - v1;
                arr_b1 = new byte[v2];
                System.arraycopy(tjp0.a, v1, arr_b1, 0, v2);
                break;
            }
        }
        byte[] arr_b2 = this.b.a().f(arr_b1);
        tjk.f("<-- getTagValue", new Object[0]);
        return arr_b2;
    }
}

