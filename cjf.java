import java.util.Arrays;

public final class cjf implements cid {
    private final cjg a;

    public cjf(cjg cjg0) {
        this.a = cjg0;
    }

    @Override  // chl
    public final cmx a(cmc cmc0) {
        return this.d(cmc0);
    }

    @Override  // cid
    public final cnc b(cmc cmc0) {
        return this.d(cmc0);
    }

    @Override  // cii
    public final cnd c(cmc cmc0) {
        return this.d(cmc0);
    }

    public final cnj d(cmc cmc0) {
        long[] arr_v3;
        Object[] arr_object1;
        int[] arr_v2;
        cjg cjg0 = this.a;
        bxv bxv0 = cjg0.c;
        bxt bxt0 = new bxt(bxv0.e + 2);
        bxv bxv1 = new bxv(bxv0.e);
        int[] arr_v = bxv0.b;
        Object[] arr_object = bxv0.c;
        long[] arr_v1 = bxv0.a;
        int v = arr_v1.length - 2;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v1[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) == 0x8080808080808080L) {
                    goto label_39;
                }
                int v3 = 0;
                while(true) {
                    int v4 = 8 - (~(v1 - v) >>> 0x1F);
                    if(v3 >= v4) {
                        break;
                    }
                    if((v2 & 0xFFL) < 0x80L) {
                        int v5 = (v1 << 3) + v3;
                        int v6 = arr_v[v5];
                        cje cje0 = (cje)arr_object[v5];
                        bxt0.g(v6);
                        arr_v2 = arr_v;
                        arr_object1 = arr_object;
                        arr_v3 = arr_v1;
                        bxv1.g(v6, new cni(((cht)cmc0.a.a(cje0.a)), cje0.b));
                    }
                    else {
                        arr_v2 = arr_v;
                        arr_object1 = arr_object;
                        arr_v3 = arr_v1;
                    }
                    v2 >>= 8;
                    ++v3;
                    arr_v = arr_v2;
                    arr_object = arr_object1;
                    arr_v1 = arr_v3;
                }
                int[] arr_v4 = arr_v;
                Object[] arr_object2 = arr_object;
                long[] arr_v5 = arr_v1;
                if(v4 == 8) {
                    goto label_42;
                label_39:
                    arr_v4 = arr_v;
                    arr_object2 = arr_object;
                    arr_v5 = arr_v1;
                label_42:
                    if(v1 != v) {
                        ++v1;
                        arr_v = arr_v4;
                        arr_object = arr_object2;
                        arr_v1 = arr_v5;
                        continue;
                    }
                }
                goto label_48;
            }
        }
        else {
        label_48:
            if(!bxv0.b(0)) {
                if(bxt0.b < 0) {
                    cad.c("Index must be between 0 and size");
                }
                bxt0.e(bxt0.b + 1);
                int[] arr_v6 = bxt0.a;
                int v7 = bxt0.b;
                if(v7 != 0) {
                    ibpg.aa(arr_v6, arr_v6, 1, 0, v7);
                }
                arr_v6[0] = 0;
                ++bxt0.b;
            }
        }
        if(!bxv0.b(cjg0.a)) {
            bxt0.g(cjg0.a);
        }
        int v8 = bxt0.b;
        if(v8 != 0) {
            int[] arr_v7 = bxt0.a;
            ibuq.f(arr_v7, "<this>");
            Arrays.sort(arr_v7, 0, v8);
        }
        return new cnj(bxt0, bxv1, cjg0.a, cjg0.b, cih.d);
    }
}

