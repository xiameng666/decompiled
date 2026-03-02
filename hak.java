import java.util.Map;

public final class hak implements ibtw {
    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        haf haf0 = (haf)object0;
        Object object2 = ((han)object1).b;
        Object[] arr_object = ((han)object1).d.b;
        Object[] arr_object1 = ((han)object1).d.c;
        long[] arr_v = ((han)object1).d.a;
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
                            int v5 = (v1 << 3) + v3;
                            ((han)object1).a(((haq)arr_object1[v5]), ((Map)object2), arr_object[v5]);
                        }
                        v2 >>= 8;
                    }
                    if(v4 == 8) {
                        goto label_20;
                    }
                    break;
                }
            label_20:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return ((Map)object2).isEmpty() ? null : object2;
    }
}

