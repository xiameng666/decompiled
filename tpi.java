import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class tpi implements tvk {
    private final Map a;

    public tpi() {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.put(tvc.a, tvc.class);
        hashMap0.put(tor.a, tor.class);
        hashMap0.put(tot.a, tot.class);
        hashMap0.put(tve.a, tve.class);
        hashMap0.put(tow.a, tow.class);
        hashMap0.put(tpc.a, tpc.class);
        hashMap0.put(tpg.a, tpg.class);
        hashMap0.put(tph.a, tph.class);
        hashMap0.put(tvj.a, tvj.class);
        hashMap0.put(tvd.a, tvd.class);
        hashMap0.put(tvf.a, tvf.class);
        hashMap0.put(top.a, top.class);
        hashMap0.put(toq.a, toq.class);
        hashMap0.put(tov.a, tov.class);
        hashMap0.put(tos.a, tos.class);
        hashMap0.put(tou.a, tou.class);
        hashMap0.put(tpf.a, tpf.class);
        hashMap0.put(tpe.a, tpe.class);
        hashMap0.put(tox.a, tox.class);
        hashMap0.put(toy.a, toy.class);
        hashMap0.put(tpa.a, tpa.class);
        hashMap0.put(tpb.a, tpb.class);
        hashMap0.put(tpd.a, tpd.class);
        hashMap0.put(toz.a, toz.class);
        hashMap0.put(tpj.a, tpj.class);
    }

    @Override  // tvk
    public final ttr a() {
        return ttr.q;
    }

    @Override  // tvk
    public final tuw b(tvi tvi0, byte[] arr_b) {
        try {
            Class class0 = (Class)this.a.get(tvi0);
            if(class0 == null) {
                if(tvi0.equals(tni.a)) {
                    class0 = tni.class;
                }
                else {
                    if(!tvi0.equals(tvq.a)) {
                        throw new IllegalStateException(a.X(tvi0, twz.b(arr_b), "Unknown dgi ", " data "));
                    }
                    class0 = tvq.class;
                }
            }
            boolean z = class0.equals(tvq.class);
            Class class1 = byte[].class;
            if(z) {
                Constructor constructor0 = class0.getConstructor(tvi.class, class1, tvk.class);
                if(constructor0 != null) {
                    return (tuw)constructor0.newInstance(tvi0, arr_b, this);
                }
                throw new IllegalStateException("Dgi class " + class0.getSimpleName() + " does not implement the expected constructor");
            }
            Constructor constructor1 = class0.getConstructor(tvi.class, class1);
            if(constructor1 != null) {
                return (tuw)constructor1.newInstance(tvi0, arr_b);
            }
            throw new IllegalStateException("Dgi class " + class0.getSimpleName() + " does not implement the expected constructor");
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException("Failed to process DGI " + tvi0, instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException("Failed to process DGI " + tvi0, illegalAccessException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new RuntimeException("Failed to process DGI " + tvi0, illegalArgumentException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException("Failed to process DGI " + tvi0, invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException("Failed to process DGI " + tvi0, noSuchMethodException0);
        }
        catch(SecurityException securityException0) {
            throw new RuntimeException("Failed to process DGI " + tvi0, securityException0);
        }
    }
}

