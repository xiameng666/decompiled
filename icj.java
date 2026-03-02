final class icj extends ibur implements ibth {
    final icq a;

    public icj(icq icq0) {
        this.a = icq0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        iag iag0 = this.a.a();
        ify ify0 = iag0.a;
        int v = ify0.z().size();
        if(iag0.i != v) {
            Object[] arr_object = iag0.l.c;
            long[] arr_v = iag0.l.a;
            int v1 = arr_v.length - 2;
            if(v1 >= 0) {
                int v2 = 0;
                while(true) {
                    long v3 = arr_v[v2];
                    if((~v3 << 7 & v3 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_20;
                    }
                    for(int v4 = 0; true; ++v4) {
                        int v5 = 8 - (~(v2 - v1) >>> 0x1F);
                        if(v4 >= v5) {
                            break;
                        }
                        if((0xFFL & v3) < 0x80L) {
                            ((hzw)arr_object[(v2 << 3) + v4]).c = true;
                        }
                        v3 >>= 8;
                    }
                    if(v5 == 8) {
                    label_20:
                        if(v2 != v1) {
                            ++v2;
                            continue;
                        }
                    }
                    goto label_23;
                }
            }
            else {
            label_23:
                if(ify0.i != null) {
                    if(!ify0.ak()) {
                        ify.av(ify0, false, 7);
                        return ibom.a;
                    }
                }
                else if(!ify0.al()) {
                    ify.ax(ify0, false, 7);
                }
            }
        }
        return ibom.a;
    }
}

