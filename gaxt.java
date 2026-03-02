import android.util.SparseArray;
import android.util.SparseIntArray;

public final class gaxt {
    private static final SparseArray a;

    static {
        SparseArray sparseArray0 = new SparseArray();
        gaxt.a = sparseArray0;
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        sparseIntArray0.put(1, 1);
        sparseIntArray0.put(2, 2);
        sparseIntArray0.put(3, 2);
        sparseIntArray0.put(4, 2);
        sparseIntArray0.put(5, 80);
        sparseIntArray0.put(6, 6);
        sparseArray0.put(0, sparseIntArray0);
        SparseIntArray sparseIntArray1 = new SparseIntArray();
        sparseIntArray1.put(2, 2);
        sparseIntArray1.put(3, 2);
        sparseIntArray1.put(4, 2);
        sparseIntArray1.put(5, 2);
        sparseIntArray1.put(6, 2);
        sparseArray0.put(1, sparseIntArray1);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1, 5);
        sparseIntArray2.put(3, 3);
        sparseIntArray2.put(4, 0x40);
        sparseIntArray2.put(5, 5);
        sparseIntArray2.put(6, 5);
        sparseArray0.put(2, sparseIntArray2);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(1, 4);
        sparseIntArray3.put(2, 4);
        sparseIntArray3.put(4, 4);
        sparseIntArray3.put(5, 4);
        sparseIntArray3.put(6, 4);
        sparseArray0.put(3, sparseIntArray3);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        sparseIntArray4.put(1, 5);
        sparseIntArray4.put(2, 5);
        sparseIntArray4.put(3, 3);
        sparseIntArray4.put(5, 5);
        sparseIntArray4.put(6, 5);
        sparseArray0.put(4, sparseIntArray4);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        sparseIntArray5.put(1, 1);
        sparseIntArray5.put(2, 1);
        sparseIntArray5.put(3, 1);
        sparseIntArray5.put(4, 1);
        sparseIntArray5.put(6, 6);
        sparseArray0.put(5, sparseIntArray5);
    }

    public static void a(gaxs gaxs0, int v) {
        int v1;
        while((v1 = gaxs0.u) != v) {
            int v2 = ((SparseIntArray)gaxt.a.get(v1)).get(v, -1);
            if(v2 == -1) {
                throw new IllegalArgumentException(String.format("Cannot transit to target state %s from current state %s.", v, ((int)gaxs0.u)));
            }
            switch(v2) {
                case 0: {
                    break;
                }
                case 1: {
                    gaxs0.ba();
                    break;
                }
                case 2: {
                    gaxs0.bd();
                    break;
                }
                case 3: {
                    gaxs0.bb();
                    break;
                }
                case 4: {
                    gaxs0.aZ();
                    break;
                }
                case 5: {
                    gaxs0.be();
                    break;
                }
                case 6: {
                    gaxs0.aY();
                    break;
                }
                default: {
                    gaxs0.bi(v2 >> 4);
                }
            }
            continue;
        }
    }
}

