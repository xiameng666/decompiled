public final class szq implements esrz {
    public final tao a;
    public final szk b;

    static {
    }

    public szq(tao tao0, szk szk0) {
        this.a = tao0;
        this.b = szk0;
    }

    @Override  // esrz
    public final byte[] a() {
        tnh tnh0;
        tax tax0;
        tdu tdu0;
        try {
            tdu0 = this.a.b;
            tae tae0 = new tae();
            tax0 = tdw.a(this.a, tae0, taq.a);
        }
        catch(taa taa0) {
            throw new RuntimeException(taa0);
        }
        tna tna0 = new tna(tdu0);
        Byte byte0 = (byte)-92;
        if(byte0.equals(byte0)) {
            tnh0 = new tnh(tna0.b);
            return tnh0.d(tax0, tnh0.f(tax0.c)).a();
        }
        if(byte0.equals(Byte.valueOf(((byte)-78)))) {
            tnh0 = new tng(tna0.b);
            return tnh0.d(tax0, tnh0.f(tax0.c)).a();
        }
        if(byte0.equals(Byte.valueOf(((byte)-88)))) {
            tnh0 = new tnb(tna0.b);
            return tnh0.d(tax0, tnh0.f(tax0.c)).a();
        }
        if(byte0.equals(Byte.valueOf(((byte)-82)))) {
            tnh0 = new tnc(tna0.b);
            return tnh0.d(tax0, tnh0.f(tax0.c)).a();
        }
        if(!byte0.equals(Byte.valueOf(((byte)-54)))) {
            throw new syl("Sw Ins Not Supported", syn.h);
        }
        tnh0 = new tnd(tna0.b);
        return tnh0.d(tax0, tnh0.f(tax0.c)).a();
    }

    @Override  // esrz
    public final byte[] b(int v) {
        teh teh0 = new teh(0x5F28);
        byte[] arr_b = teh0.b();
        for(int v1 = 0; v1 < arr_b.length; ++v1) {
            if(arr_b[v1] != 0) {
                int v2 = arr_b.length - v1;
                byte[] arr_b1 = new byte[v2];
                System.arraycopy(teh0.a, v1, arr_b1, 0, v2);
                return this.a.b().h(arr_b1);
            }
        }
        return this.a.b().h(new byte[]{0});
    }
}

