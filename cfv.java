final class cfv extends ibur implements ibth {
    final cfz a;

    public cfv(cfz cfz0) {
        this.a = cfz0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        Object[] arr_object = this.a.f.b;
        Object[] arr_object1 = this.a.f.c;
        long[] arr_v = this.a.f.a;
        int v = arr_v.length - 2;
        if(v >= 0) {
            int v1 = 0;
        alab1:
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 0;
                    while(true) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v3;
                            Object object0 = arr_object[v5];
                            if(!((cfj)arr_object1[v5]).e()) {
                                goto label_15;
                            }
                            break alab1;
                        }
                    label_15:
                        v2 >>= 8;
                        ++v3;
                    }
                    if(v4 == 8) {
                        goto label_19;
                    }
                    break;
                }
            label_19:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return ibom.a;
    }
}

