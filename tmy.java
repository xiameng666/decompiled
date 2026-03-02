import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public final class tmy implements tcl {
    private final Map a;

    static {
    }

    public tmy() {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.put(tma.a, tma.class);
        hashMap0.put(tcg.a, tcg.class);
        hashMap0.put(tco.a, tco.class);
        hashMap0.put(tcp.a, tcp.class);
        hashMap0.put(tcq.a, tcq.class);
        hashMap0.put(tcr.a, tcr.class);
        hashMap0.put(tcs.a, tcs.class);
        hashMap0.put(tcv.a, tcv.class);
        hashMap0.put(tcw.a, tcw.class);
        hashMap0.put(tmq.a, tmq.class);
        hashMap0.put(tcx.a, tcx.class);
        hashMap0.put(tmw.a, tmw.class);
        hashMap0.put(tcy.a, tcy.class);
        hashMap0.put(tmx.a, tmx.class);
        hashMap0.put(tck.a, tck.class);
        hashMap0.put(tcf.a, tcf.class);
        hashMap0.put(tmr.a, tmr.class);
        hashMap0.put(tmu.a, tmu.class);
        hashMap0.put(tlk.a, tlk.class);
        hashMap0.put(tll.a, tll.class);
        hashMap0.put(tlm.a, tlm.class);
        hashMap0.put(tln.a, tln.class);
        hashMap0.put(tlo.a, tlo.class);
        hashMap0.put(tlp.a, tlp.class);
        hashMap0.put(tlq.a, tlq.class);
        hashMap0.put(tlr.a, tlr.class);
        hashMap0.put(tls.a, tls.class);
        hashMap0.put(tlt.a, tlt.class);
        hashMap0.put(tlu.a, tlu.class);
        hashMap0.put(tlv.a, tlv.class);
        hashMap0.put(tlw.a, tlw.class);
        hashMap0.put(tlx.a, tlx.class);
        hashMap0.put(tly.a, tly.class);
        hashMap0.put(tlz.a, tlz.class);
        hashMap0.put(tmu.a, tmu.class);
        hashMap0.put(tmv.a, tmv.class);
        hashMap0.put(tms.a, tms.class);
        hashMap0.put(tmt.a, tmt.class);
        hashMap0.put(tmb.e, tmb.class);
        hashMap0.put(tmc.e, tmc.class);
        hashMap0.put(tmd.e, tmd.class);
        hashMap0.put(tme.e, tme.class);
        hashMap0.put(tmf.e, tmf.class);
        hashMap0.put(tmg.e, tmg.class);
        hashMap0.put(tmh.e, tmh.class);
        hashMap0.put(tmi.e, tmi.class);
        hashMap0.put(tmj.e, tmj.class);
        hashMap0.put(tmk.e, tmk.class);
        hashMap0.put(tml.e, tml.class);
        hashMap0.put(tmm.e, tmm.class);
        hashMap0.put(tmn.e, tmn.class);
        hashMap0.put(tmo.e, tmo.class);
        hashMap0.put(tmp.e, tmp.class);
        hashMap0.put(tcu.a, tcu.class);
        hashMap0.put(tcn.a, tcn.class);
    }

    @Override  // tcl
    public final tar a() {
        return tar.i;
    }

    @Override  // tcl
    public final tca b(tcj tcj0, byte[] arr_b) {
        try {
            Class class0 = (Class)this.a.get(tcj0);
            if(class0 == null) {
                if(tcj0.equals(tag.a)) {
                    class0 = tag.class;
                }
                else {
                    if(tcj0.a()[0] <= 0 || tcj0.a()[0] > 20) {
                        throw new IllegalStateException(a.X(tcj0, tek.b(arr_b), "Unknown dgi ", " data "));
                    }
                    class0 = tcm.class;
                }
            }
            tek.c(arr_b, true);
            Constructor constructor0 = class0.getConstructor(tcj.class, byte[].class);
            if(constructor0 != null) {
                return (tca)constructor0.newInstance(tcj0, arr_b);
            }
            throw new IllegalStateException("Dgi class " + class0.getSimpleName() + " does not implement the expected constructor");
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException(instantiationException0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new RuntimeException(illegalAccessException0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new RuntimeException(illegalArgumentException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new RuntimeException(invocationTargetException0);
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new RuntimeException(noSuchMethodException0);
        }
        catch(SecurityException securityException0) {
            throw new RuntimeException(securityException0);
        }
    }
}

