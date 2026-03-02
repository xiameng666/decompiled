final class igh extends ibur implements ibts {
    public static final igh a;

    static {
        igh.a = new igh();
    }

    public igh() {
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((ija)object0).A()) {
            igl igl0 = ((ija)object0).b;
            if(!igl0.l) {
                ibts ibts0 = ((ija)object0).a.f();
                bzk bzk0 = igl0.o;
                if(ibts0 != null) {
                    igl0.Q(((ija)object0), 0x7FFFFFFF7FFFFFFFL, 0L);
                    igl0.i = ibts0;
                }
                else if(bzk0 != null) {
                    Object[] arr_object = bzk0.c;
                    long[] arr_v = bzk0.a;
                    int v = arr_v.length - 2;
                    if(v >= 0) {
                        int v1 = 0;
                        while(true) {
                            long v2 = arr_v[v1];
                            if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                                for(int v3 = 0; true; ++v3) {
                                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                                    if(v3 >= v4) {
                                        break;
                                    }
                                    if((0xFFL & v2) < 0x80L) {
                                        igl0.V(((bzn)arr_object[(v1 << 3) + v3]));
                                    }
                                    v2 >>= 8;
                                }
                                if(v4 == 8) {
                                    goto label_23;
                                }
                                break;
                            }
                        label_23:
                            if(v1 == v) {
                                break;
                            }
                            ++v1;
                        }
                    }
                    bzk0.j();
                    return ibom.a;
                }
            }
        }
        return ibom.a;
    }
}

