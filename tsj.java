import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class tsj implements tid {
    private final Map a;

    public tsj() {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.put(thv.a, thv.class);
        hashMap0.put(trq.a, trq.class);
        hashMap0.put(trs.a, trs.class);
        hashMap0.put(thx.a, thx.class);
        hashMap0.put(trv.a, trv.class);
        hashMap0.put(tsd.a, tsd.class);
        hashMap0.put(tsh.a, tsh.class);
        hashMap0.put(tsi.a, tsi.class);
        hashMap0.put(tic.a, tic.class);
        hashMap0.put(thw.a, thw.class);
        hashMap0.put(thy.a, thy.class);
        hashMap0.put(tro.a, tro.class);
        hashMap0.put(trp.a, trp.class);
        hashMap0.put(tru.a, tru.class);
        hashMap0.put(trr.a, trr.class);
        hashMap0.put(trt.a, trt.class);
        hashMap0.put(tsg.a, tsg.class);
        hashMap0.put(tsf.a, tsf.class);
        hashMap0.put(try.a, try.class);
        hashMap0.put(trz.a, trz.class);
        hashMap0.put(tsb.a, tsb.class);
        hashMap0.put(tsc.a, tsc.class);
        hashMap0.put(tie.a, tie.class);
        hashMap0.put(tif.a, tif.class);
        hashMap0.put(tig.a, tig.class);
        hashMap0.put(tih.a, tih.class);
        hashMap0.put(tii.a, tii.class);
        hashMap0.put(trw.a, trw.class);
        hashMap0.put(trx.a, trx.class);
        hashMap0.put(tse.a, tse.class);
        hashMap0.put(tsa.a, tsa.class);
        hashMap0.put(tsk.a, tsk.class);
    }

    @Override  // tid
    public final tgj a() {
        return tgj.q;
    }

    @Override  // tid
    public final thp b(tib tib0, byte[] arr_b) {
        try {
            Class class0 = (Class)this.a.get(tib0);
            if(class0 == null) {
                if(tib0.equals(tfz.a)) {
                    class0 = tfz.class;
                }
                else {
                    if(!tib0.equals(tij.a)) {
                        throw new IllegalStateException(a.X(tib0, tjs.b(arr_b), "Unknown dgi ", " data "));
                    }
                    class0 = tij.class;
                }
            }
            boolean z = class0.equals(tij.class);
            Class class1 = byte[].class;
            if(z) {
                Constructor constructor0 = class0.getConstructor(tib.class, class1, tid.class);
                if(constructor0 != null) {
                    return (thp)constructor0.newInstance(tib0, arr_b, this);
                }
                throw new IllegalStateException("Dgi class " + class0.getSimpleName() + " does not implement the expected constructor");
            }
            Constructor constructor1 = class0.getConstructor(tib.class, class1);
            if(constructor1 != null) {
                return (thp)constructor1.newInstance(tib0, arr_b);
            }
            throw new IllegalStateException("Dgi class " + class0.getSimpleName() + " does not implement the expected constructor");
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("Failed to process DGI " + tib0, instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Failed to process DGI " + tib0, illegalAccessException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new RuntimeException("Failed to process DGI " + tib0, illegalArgumentException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("Failed to process DGI " + tib0, invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("Failed to process DGI " + tib0, noSuchMethodException0);
        }
        catch(SecurityException securityException0) {
            throw new RuntimeException("Failed to process DGI " + tib0, securityException0);
        }
    }
}

