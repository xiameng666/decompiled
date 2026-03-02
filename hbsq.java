import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class hbsq {
    public static final SparseArray a;
    public static final SparseArray b;
    static final AtomicReference c;
    private static final Map d;

    static {
        SparseArray sparseArray0 = new SparseArray();
        hbsq.a = sparseArray0;
        SparseArray sparseArray1 = new SparseArray();
        hbsq.b = sparseArray1;
        hbsq.c = new AtomicReference();
        sparseArray0.put(-1, hbky.a);
        sparseArray0.put(1, hbky.b);
        sparseArray0.put(2, hbky.c);
        sparseArray0.put(4, hbky.d);
        sparseArray0.put(8, hbky.e);
        sparseArray0.put(16, hbky.f);
        sparseArray0.put(0x20, hbky.g);
        sparseArray0.put(0x40, hbky.h);
        sparseArray0.put(0x80, hbky.i);
        sparseArray0.put(0x100, hbky.j);
        sparseArray0.put(0x200, hbky.k);
        sparseArray0.put(0x400, hbky.l);
        sparseArray0.put(0x800, hbky.m);
        sparseArray0.put(0x1000, hbky.n);
        sparseArray1.put(0, hbkz.a);
        sparseArray1.put(1, hbkz.b);
        sparseArray1.put(2, hbkz.c);
        sparseArray1.put(3, hbkz.d);
        sparseArray1.put(4, hbkz.e);
        sparseArray1.put(5, hbkz.f);
        sparseArray1.put(6, hbkz.g);
        sparseArray1.put(7, hbkz.h);
        sparseArray1.put(8, hbkz.i);
        sparseArray1.put(9, hbkz.j);
        sparseArray1.put(10, hbkz.k);
        sparseArray1.put(11, hbkz.l);
        sparseArray1.put(12, hbkz.m);
        HashMap hashMap0 = new HashMap();
        hbsq.d = hashMap0;
        hashMap0.put(Integer.valueOf(1), hbqi.b);
        hashMap0.put(Integer.valueOf(2), hbqi.c);
        hashMap0.put(Integer.valueOf(4), hbqi.d);
        hashMap0.put(Integer.valueOf(8), hbqi.e);
        hashMap0.put(Integer.valueOf(16), hbqi.f);
        hashMap0.put(Integer.valueOf(0x20), hbqi.g);
        hashMap0.put(Integer.valueOf(0x40), hbqi.h);
        hashMap0.put(Integer.valueOf(0x80), hbqi.i);
        hashMap0.put(Integer.valueOf(0x100), hbqi.j);
        hashMap0.put(Integer.valueOf(0x200), hbqi.k);
        hashMap0.put(Integer.valueOf(0x400), hbqi.l);
        hashMap0.put(Integer.valueOf(0x800), hbqi.m);
        hashMap0.put(Integer.valueOf(0x1000), hbqi.n);
    }

    public static hbqk a(hbrq hbrq0) {
        ggdy ggdy0 = new ggdy();
        int v = hbrq0.a;
        if(v == 0) {
            ggdy0.k(hbsq.d.values());
        }
        else {
            for(Object object0: hbsq.d.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if((((int)(((Integer)map$Entry0.getKey()))) & v) != 0) {
                    ggdy0.i(((hbqi)map$Entry0.getValue()));
                }
            }
        }
        hbqj hbqj0 = new hbqj();
        hbqj0.a = ggdy0.h();
        return new hbqk(hbqj0);
    }

    public static String b() {
        return hbsq.d() ? "barcode-scanning" : "play-services-mlkit-barcode-scanning";
    }

    static void c(hbqy hbqy0, hbkn hbkn0) {
        hbqy0.c(new hbsp(hbkn0), hbko.m);
    }

    static boolean d() {
        AtomicReference atomicReference0 = hbsq.c;
        if(atomicReference0.get() != null) {
            return ((Boolean)atomicReference0.get()).booleanValue();
        }
        boolean z = hbtc.d(hawd.b().a());
        atomicReference0.set(Boolean.valueOf(z));
        return z;
    }
}

