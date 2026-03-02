import android.util.SparseArray;

final class czvd {
    public final SparseArray a;
    private static final int[] b;

    static {
        czvd.b = new int[0];
    }

    public czvd() {
        int[] arr_v1;
        this.a = new SparseArray();
        this.e(2, czvd.b, czvd.b, czvd.b, new int[]{1, 23, 24, 36, 37, 38});
        this.e(1, czvd.b, czvd.b, czvd.b, czvd.b);
        this.e(3, czvd.b, czvd.b, czvd.b, czvd.b);
        this.e(21, new int[]{1, 2}, new int[]{1}, new int[]{2}, czvd.b);
        this.e(22, new int[]{1, 2, 23, 36, 37}, new int[]{1}, new int[]{2, 23, 36, 37}, czvd.b);
        this.e(23, czvd.b, czvd.b, new int[]{2, 36, 37}, new int[]{1});
        this.e(24, czvd.b, czvd.b, czvd.b, new int[]{1});
        this.e(0x1F, new int[]{1, 2}, new int[]{1}, new int[]{2}, czvd.b);
        int[] arr_v = czvd.b;
        if(hvol.y()) {
            arr_v1 = arr_v;
            this.e(35, new int[]{3, 2, 23, 36, 37}, new int[]{3}, new int[]{2, 23, 36, 37}, arr_v1);
        }
        else {
            arr_v1 = arr_v;
            this.e(35, new int[]{1, 2, 23, 36, 37}, new int[]{1}, new int[]{2, 23, 36, 37}, arr_v1);
        }
        this.e(0x20, new int[]{1, 2}, new int[]{1}, new int[]{2}, arr_v1);
        this.e(33, new int[]{1, 2}, new int[]{1}, new int[]{2}, arr_v1);
        this.e(34, new int[]{1, 2}, new int[]{1}, new int[]{2}, arr_v1);
        this.e(36, arr_v1, arr_v1, new int[]{2, 23, 37}, new int[]{1});
        this.e(37, arr_v1, arr_v1, new int[]{2, 23, 36}, new int[]{1});
        this.e(38, arr_v1, arr_v1, arr_v1, new int[]{1});
        this.e(13, arr_v1, arr_v1, arr_v1, new int[]{13, 11, 12, 43, 44});
        this.e(12, arr_v1, arr_v1, arr_v1, new int[]{11, 43, 44, 53, 54, 0x3F, 61, 62, 0x40, 66, 65, 71, 72, 73, 74});
        this.e(11, arr_v1, arr_v1, arr_v1, arr_v1);
        this.e(41, new int[]{13, 11, 12, 0x3F, 62, 0x40, 66}, new int[]{11}, new int[]{12}, arr_v1);
        this.e(42, new int[]{11, 12, 0x3F, 62, 0x40, 66}, new int[]{11}, new int[]{12}, arr_v1);
        this.e(43, arr_v1, arr_v1, new int[]{12}, new int[]{11, 0x3F, 62, 0x40, 66, 65});
        this.e(44, arr_v1, arr_v1, arr_v1, new int[]{11});
        this.e(51, new int[]{11, 12, 0x3F, 61, 62, 71, 72, 73, 74}, new int[]{11}, new int[]{12}, arr_v1);
        this.e(52, new int[]{11, 12, 0x3F, 61, 62, 71, 72, 73}, new int[]{11, 74}, new int[]{12}, arr_v1);
        this.e(53, arr_v1, new int[]{74}, new int[]{12}, new int[]{11, 0x3F, 61, 62, 71, 72, 73});
        this.e(54, arr_v1, arr_v1, arr_v1, new int[]{11});
        this.e(0x3F, arr_v1, arr_v1, new int[]{12}, new int[]{43, 44, 53, 54, 61, 62, 0x40, 66, 65, 71, 72, 73});
        this.e(61, arr_v1, arr_v1, new int[]{12}, new int[]{11, 53, 54, 0x3F, 62, 71, 72, 73});
        this.e(62, arr_v1, arr_v1, new int[]{12}, new int[]{43, 44, 53, 54, 0x3F, 61, 71, 72, 73});
        this.e(0x40, arr_v1, arr_v1, new int[]{12}, new int[]{11, 43, 44, 0x3F});
        this.e(66, arr_v1, arr_v1, new int[]{12}, new int[]{11, 43, 0x3F});
        this.e(65, arr_v1, arr_v1, arr_v1, arr_v1);
        this.e(71, arr_v1, arr_v1, new int[]{12}, new int[]{11, 53, 54});
        this.e(72, arr_v1, arr_v1, new int[]{12}, new int[]{11, 53, 54, 0x3F, 61, 62});
        this.e(73, arr_v1, arr_v1, new int[]{12}, new int[]{11, 53, 54, 0x3F, 61, 62});
        this.e(74, arr_v1, arr_v1, arr_v1, arr_v1);
        this.e(81, arr_v1, arr_v1, arr_v1, arr_v1);
        this.e(82, arr_v1, arr_v1, arr_v1, arr_v1);
        this.e(83, arr_v1, arr_v1, arr_v1, arr_v1);
        this.e(91, arr_v1, arr_v1, arr_v1, arr_v1);
        this.e(92, arr_v1, arr_v1, arr_v1, arr_v1);
    }

    public final boolean a(czvg czvg0, czvg czvg1) {
        return czvd.d(((czvc)this.a.get(czvg0.n)).b, czvg1.n);
    }

    public final boolean b(czvg czvg0, czvg czvg1) {
        return czvd.d(((czvc)this.a.get(czvg0.n)).d, czvg1.n);
    }

    public final boolean c(czvg czvg0, czvg czvg1) {
        return czvd.d(((czvc)this.a.get(czvg0.n)).a, czvg1.n);
    }

    public static final boolean d(int[] arr_v, int v) {
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                return true;
            }
        }
        return false;
    }

    private final void e(int v, int[] arr_v, int[] arr_v1, int[] arr_v2, int[] arr_v3) {
        czvc czvc0 = new czvc(arr_v, arr_v1, arr_v2, arr_v3);
        this.a.put(v, czvc0);
    }
}

