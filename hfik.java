import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public final class hfik {
    public final hfim a;
    private static final gfss b;

    static {
        hfik.b = new gfss("-");
    }

    public hfik() {
        this.a = new hfim();
    }

    public hfik(hfip hfip0) {
        this.a = new hfim(hfip0);
    }

    public final void a(boolean z) {
        this.a.d(hfih.W, Boolean.valueOf(z));
        this.a.c(hfih.W);
    }

    public final void b(int v) {
        this.a.d(hfih.e, Integer.valueOf(v));
        this.a.c(hfih.e);
    }

    public final void c() {
        this.a.d(hfih.J, Boolean.valueOf(true));
        this.a.c(hfih.J);
    }

    public final void d(int v) {
        this.a.d(hfih.a, Integer.valueOf(v));
        this.a.c(hfih.a);
    }

    public final void e(int v) {
        this.a.d(hfih.b, Integer.valueOf(v));
        this.a.c(hfih.b);
    }

    public final String f() {
        String s2;
        int v3;
        boolean z1;
        Map.Entry map$Entry1;
        Map.Entry map$Entry0;
        String s = this.a.a;
        Map map0 = this.a.b;
        Map map1 = this.a.c;
        if(map1.size() == 0) {
            return s.isEmpty() ? "" : "" + s;
        }
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = map0.entrySet().iterator();
        Iterator iterator1 = map1.entrySet().iterator();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            map$Entry0 = (Map.Entry)object0;
        }
        else {
            map$Entry0 = null;
        }
        if(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            map$Entry1 = (Map.Entry)object1;
        }
        else {
            map$Entry1 = null;
        }
        boolean z = false;
        int v = 0;
        int v1 = 0;
        while(true) {
            if(map$Entry0 == null && map$Entry1 == null) {
                if(z) {
                    arrayList0.add(s.substring(v, v1));
                }
                return arrayList0.isEmpty() ? "" : "" + hfik.b.b(arrayList0);
            }
            if(map$Entry1 == null) {
                z1 = true;
            }
            else if(map$Entry0 == null) {
                z1 = false;
            }
            else {
                int v2 = ((hfih)map$Entry0.getKey()).compareTo(((hfih)map$Entry1.getKey()));
                z1 = v2 < 0;
                if(v2 == 0) {
                    map$Entry0 = null;
                }
            }
            if(z1) {
                hfii hfii0 = (hfii)map$Entry0.getValue();
                if(z) {
                    int v4 = hfii0.b;
                    if(v4 == v1 + 1) {
                        v1 = v4 + hfii0.d;
                        goto label_49;
                    }
                    else {
                        arrayList0.add(s.substring(v, v1));
                        v = hfii0.b;
                        v3 = hfii0.d;
                    }
                }
                else {
                    v = hfii0.b;
                    v3 = hfii0.d;
                }
                v1 = v3 + v;
            label_49:
                map$Entry0 = null;
                z = true;
            }
            else {
                hfih hfih0 = (hfih)map$Entry1.getKey();
                hfin hfin0 = (hfin)map$Entry1.getValue();
                if(z) {
                    arrayList0.add(s.substring(v, v1));
                }
                if(hfin0.a != null) {
                    String s1 = hfih0.bf;
                    hfig hfig0 = hfih0.bg;
                    switch(hfig0.ordinal()) {
                        case 0: {
                            s2 = ghjc.e.g().o(glxd.h(((Long)((hfin)map$Entry1.getValue()).a).longValue()));
                            break;
                        }
                        case 1: {
                            s2 = "";
                            break;
                        }
                        case 2: {
                            s2 = ((String)((hfin)map$Entry1.getValue()).a).replace(';', ':');
                            break;
                        }
                        case 3: {
                            s2 = ((Integer)((hfin)map$Entry1.getValue()).a).toString();
                            break;
                        }
                        case 4: {
                            s2 = ((Long)((hfin)map$Entry1.getValue()).a).toString();
                            break;
                        }
                        case 5: {
                            s2 = ((Float)((hfin)map$Entry1.getValue()).a).toString();
                            break;
                        }
                        case 6: {
                            s2 = "0x" + String.format("%08x", ((Integer)((hfin)map$Entry1.getValue()).a));
                            break;
                        }
                        case 7: {
                            String s3 = (String)((hfin)map$Entry1.getValue()).a;
                            s2 = ghjc.e.g().o(s3.getBytes(StandardCharsets.ISO_8859_1)).replace('-', '~');
                            break;
                        }
                        default: {
                            throw new IllegalStateException(a.O(hfig0, "OptionType ", " not handled."));
                        }
                    }
                    arrayList0.add(s1 + s2);
                }
                map$Entry1 = null;
                z = false;
            }
            if(map$Entry0 == null && iterator0.hasNext()) {
                Object object2 = iterator0.next();
                map$Entry0 = (Map.Entry)object2;
            }
            if(map$Entry1 == null && iterator1.hasNext()) {
                Object object3 = iterator1.next();
                map$Entry1 = (Map.Entry)object3;
            }
        }
    }
}

