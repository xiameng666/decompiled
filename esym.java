import java.util.Arrays;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.logging.Level;

public final class esym {
    public static final bboh a;
    boolean b;
    boolean c;
    boolean d;
    private final TreeMap e;
    private final TreeMap f;
    private Map.Entry g;

    static {
        esym.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public esym(Collection collection0) {
        this.e = new TreeMap();
        this.f = new TreeMap();
        new TreeMap();
        this.b = false;
        this.c = false;
        this.d = false;
        if(hyqr.d()) {
            for(Object object0: collection0) {
                espz espz0 = (espz)object0;
                if(!esym.d(espz0)) {
                    esvs[] arr_esvs = espz0.d();
                    for(int v = 0; v < arr_esvs.length; ++v) {
                        this.e.put(arr_esvs[v], espz0);
                    }
                }
            }
            for(Object object1: collection0) {
                espz espz1 = (espz)object1;
                if(esym.d(espz1)) {
                    esvs[] arr_esvs1 = espz1.d();
                    for(int v1 = 0; v1 < arr_esvs1.length; ++v1) {
                        esvs esvs0 = arr_esvs1[v1];
                        this.f.put(esvs0, espz1);
                        if(this.e.size() == 1 && (this.e.firstEntry().getValue() instanceof esva)) {
                            this.e.put(esvs0, espz1);
                        }
                    }
                }
            }
            if(!this.f.isEmpty()) {
                for(Object object2: collection0) {
                    espz espz2 = (espz)object2;
                    if((espz2 instanceof esva)) {
                        this.c = ((esva)espz2).d;
                        this.d = ((esva)espz2).e;
                    }
                }
            }
        }
        else {
            for(Object object3: collection0) {
                espz espz3 = (espz)object3;
                esvs[] arr_esvs2 = espz3.d();
                for(int v2 = 0; v2 < arr_esvs2.length; ++v2) {
                    this.e.put(arr_esvs2[v2], espz3);
                }
            }
        }
    }

    public final espz a() {
        return this.g == null ? null : ((espz)this.g.getValue());
    }

    public final esvw b(byte[] arr_b) {
        try {
            try {
                if(glxf.b(arr_b) == 0xA4) {
                    esvs esvs0 = esvs.b(arr_b);
                    Map.Entry map$Entry0 = null;
                    if(esvs0 != null) {
                        Map.Entry map$Entry1 = this.c(esvs0, ((int)arr_b[3]));
                        if(map$Entry1 == null) {
                            ((ggtj)esym.a.j()).B("No HCE applet available for AID %s", esvs0);
                        }
                        else {
                            Level level0 = esgh.a();
                            esym.a.g(level0).R("Selecting HCE applet: %s (%s)", map$Entry1.getValue(), map$Entry1.getKey());
                            map$Entry0 = map$Entry1;
                        }
                    }
                    this.g = map$Entry0;
                    if(map$Entry0 != null) {
                        esvs esvs1 = (esvs)map$Entry0.getKey();
                        int v = arr_b[4];
                        int v1 = esvs1.a() - v;
                        if(v1 > 0) {
                            byte b = arr_b[v + 5];
                            arr_b = Arrays.copyOf(arr_b, arr_b.length + v1);
                            arr_b[3] = 0;
                            arr_b[4] = (byte)esvs1.a();
                            System.arraycopy(esvs1.m, 0, arr_b, 5, esvs1.a());
                            arr_b[esvs1.a() + 5] = b;
                        }
                    }
                }
                if(hyqr.d() && !this.f.isEmpty()) {
                    esvv esvv0 = esyx.b(arr_b);
                    if(esvv0 != null) {
                        goto label_26;
                    }
                }
                return this.g == null ? esvw.c(0x6A82) : ((espz)this.g.getValue()).a(arr_b);
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                goto label_31;
            }
            catch(NullPointerException | IllegalArgumentException exception0) {
                goto label_34;
            }
            try {
            label_26:
                if(esvv0.a == 0xFFFFFF80 && esvv0.b == 26 && esvv0.c == 0) {
                    goto label_27;
                }
                return this.g == null ? esvw.c(0x6A82) : ((espz)this.g.getValue()).a(arr_b);
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
                goto label_31;
            }
            catch(NullPointerException exception0) {
                goto label_34;
            }
            try {
            label_27:
                if(esvv0.d == 0 && esyx.f(arr_b, this.c, this.d, hyqr.c())) {
                    this.b = true;
                }
                return this.g == null ? esvw.c(0x6A82) : ((espz)this.g.getValue()).a(arr_b);
            }
            catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
            }
            catch(NullPointerException | IllegalArgumentException exception0) {
                goto label_34;
            }
        }
        catch(IllegalStateException exception0) {
            goto label_34;
        }
    label_31:
        a.ae(esym.a.j(), "Error processing command", arrayIndexOutOfBoundsException0);
        return esvw.c(0x6700);
    label_34:
        a.ae(esym.a.j(), "Error processing command", exception0);
        return esvw.c(0x6F00);
    }

    public final Map.Entry c(esvs esvs0, int v) {
        NavigableMap navigableMap0;
        byte[] arr_b = new byte[16];
        Arrays.fill(arr_b, -1);
        System.arraycopy(esvs0.m, 0, arr_b, 0, esvs0.m.length);
        esvs esvs1 = esvs.c(arr_b);
        if(hyqr.d()) {
            TreeMap treeMap0 = this.f;
            navigableMap0 = !treeMap0.isEmpty() && this.b ? treeMap0.subMap(esvs0, true, esvs1, true) : this.e.subMap(esvs0, true, esvs1, true);
        }
        else {
            navigableMap0 = this.e.subMap(esvs0, true, esvs1, true);
        }
        Map.Entry map$Entry0 = this.g;
        if(map$Entry0 == null && (v & 2) != 0) {
            v &= -3;
        }
        switch(v) {
            case 0: {
                return navigableMap0.firstEntry();
            }
            case 1: {
                return navigableMap0.lastEntry();
            }
            case 2: {
                if(map$Entry0 != null) {
                    return navigableMap0.higherEntry(((esvs)map$Entry0.getKey()));
                }
                throw new AssertionError();
            }
            case 3: {
                if(map$Entry0 != null) {
                    return navigableMap0.lowerEntry(((esvs)map$Entry0.getKey()));
                }
                throw new AssertionError();
            }
            default: {
                throw new IllegalArgumentException("unsupported p2: " + v);
            }
        }
    }

    public static boolean d(espz espz0) {
        if((espz0 instanceof esqa)) {
            gftb.check(((esqa)espz0));
            return ((esqa)espz0).a.I == 4;
        }
        return false;
    }
}

