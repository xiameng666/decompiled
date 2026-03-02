final class cqc extends ibuo implements ibts {
    public cqc(Object object0) {
        super(1, object0, cqq.class, "onFocusChange", "onFocusChange(Z)V", 0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        cqq cqq0 = (cqq)this.e;
        if(((Boolean)object0).booleanValue()) {
            cqq0.k();
            return ibom.a;
        }
        if(cqq0.b != null) {
            Object[] arr_object = cqq0.k.c;
            long[] arr_v = cqq0.k.a;
            int v = arr_v.length - 2;
            if(v >= 0) {
                int v1 = 0;
                while(true) {
                    long v2 = arr_v[v1];
                    if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                        goto label_22;
                    }
                    for(int v3 = 0; true; ++v3) {
                        int v4 = 8 - (~(v1 - v) >>> 0x1F);
                        if(v3 >= v4) {
                            break;
                        }
                        if((0xFFL & v2) < 0x80L) {
                            dgj dgj0 = (dgj)arr_object[(v1 << 3) + v3];
                            icbb.b(cqq0.J(), null, null, new cqk(cqq0, dgj0, null), 3);
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                    label_22:
                        if(v1 != v) {
                            ++v1;
                            continue;
                        }
                    }
                    goto label_25;
                }
            }
            else {
            label_25:
                dgj dgj1 = cqq0.h;
                if(dgj1 != null) {
                    icbb.b(cqq0.J(), null, null, new cql(cqq0, dgj1, null), 3);
                }
            }
        }
        cqq0.k.d();
        cqq0.h = null;
        cqq0.l();
        return ibom.a;
    }
}

