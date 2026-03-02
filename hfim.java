import j..util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.Map;

public final class hfim {
    public String a;
    public Map b;
    public Map c;

    public hfim() {
        this.b("", new EnumMap(hfih.class));
    }

    public hfim(hfip hfip0) {
        this.a = hfip0.a;
        this.b = new EnumMap(hfip0.b);
        this.c = new EnumMap(hfip0.c);
    }

    public final void a(hfih hfih0) {
        hfin hfin0 = new hfin(null);
        this.c.put(hfih0, hfin0);
    }

    public final void b(String s, EnumMap enumMap0) {
        this.a = s;
        this.b = enumMap0;
        this.c = new EnumMap(hfih.class);
    }

    public final void c(hfih hfih0) {
        long v2;
        float f;
        long v1;
        int v;
        String s1;
        Optional optional0;
        Map map0 = this.b;
        Map map1 = this.c;
        if(map1.containsKey(hfih0)) {
            hfin hfin0 = (hfin)map1.get(hfih0);
        }
        else {
            map0.containsKey(hfih0);
        }
        Map map2 = this.b;
        Map map3 = this.c;
        if(map3.containsKey(hfih0)) {
            if(((hfin)map3.get(hfih0)).a != null) {
                hfin hfin1 = (hfin)map3.get(hfih0);
            }
        }
        else if(map2.containsKey(hfih0) && ((hfii)map2.get(hfih0)).e) {
            if(this.c.containsKey(hfih0)) {
                this.c.put(hfih0, new hfin(((hfin)this.c.get(hfih0)).a));
                return;
            }
            Map map4 = this.c;
            String s = this.a;
            Map map5 = this.b;
            if(map4.containsKey(hfih0)) {
                Object object0 = ((hfin)map4.get(hfih0)).a;
                optional0 = object0 == null ? Optional.empty() : Optional.of(object0);
            }
            else if(map5.containsKey(hfih0)) {
                hfii hfii0 = (hfii)map5.get(hfih0);
                try {
                    switch(hfih0.bg.ordinal()) {
                        case 0: {
                            if(hfij.b(hfii0) == 0) {
                                throw new hfil("A FixedLengthBase64 option must have an non-empty value.");
                            }
                            s1 = glxd.c(ghjc.e.g().q(hfij.c(s, hfii0)));
                            break;
                        }
                        case 1: {
                            if(hfij.b(hfii0) > 0) {
                                throw new hfil("A Boolean option must have an empty value.");
                            }
                            s1 = Boolean.valueOf(true);
                            break;
                        }
                        case 2: {
                            if(hfij.b(hfii0) == 0) {
                                throw new hfil("A Float option must have an non-empty value.");
                            }
                            s1 = hfij.c(s, hfii0);
                            break;
                        }
                        case 3: {
                            if(hfij.b(hfii0) == 0) {
                                throw new hfil("An Integer option must have an non-empty value.");
                            }
                            try {
                                v = Integer.parseInt(hfij.c(s, hfii0));
                            }
                            catch(NumberFormatException numberFormatException0) {
                                throw new hfil(numberFormatException0);
                            }
                            s1 = v;
                            break;
                        }
                        case 4: {
                            if(hfij.b(hfii0) == 0) {
                                throw new hfil("A Long option must have an non-empty value.");
                            }
                            try {
                                v1 = Long.parseLong(hfij.c(s, hfii0));
                            }
                            catch(NumberFormatException numberFormatException1) {
                                throw new hfil(numberFormatException1);
                            }
                            s1 = v1;
                            break;
                        }
                        case 5: {
                            if(hfij.b(hfii0) == 0) {
                                throw new hfil("A Float option must have an non-empty value.");
                            }
                            try {
                                f = Float.parseFloat(hfij.c(s, hfii0));
                            }
                            catch(NumberFormatException numberFormatException2) {
                                throw new hfil(numberFormatException2);
                            }
                            s1 = f;
                            break;
                        }
                        case 6: {
                            if(hfij.b(hfii0) <= 2) {
                                throw new hfil("A PrefixHex option must have a value of at least 2 chars.");
                            }
                            String s2 = hfij.c(s, hfii0);
                            if(!"0x".equals(s2.substring(0, 2))) {
                                throw new hfil("A PrefixHex option must begin with \'0x\'.");
                            }
                            try {
                                String s3 = s2.substring(2);
                                gftb.check(s3);
                                v2 = Long.parseLong(s3, 16);
                                if((0xFFFFFFFFL & v2) != v2) {
                                    throw new NumberFormatException("Input " + s3 + " in base 16 is not in the range of an unsigned integer");
                                }
                            }
                            catch(NumberFormatException numberFormatException3) {
                                throw new hfil(numberFormatException3);
                            }
                            s1 = (int)v2;
                            break;
                        }
                        case 7: {
                            s1 = new String(ghjc.e.g().q(hfij.c(s, hfii0).replace('~', '-')), StandardCharsets.ISO_8859_1);
                            break;
                        }
                        default: {
                            throw new IllegalStateException(a.O(hfih0.bg, "OptionType ", " not handled."));
                        }
                    }
                }
                catch(hfil hfil0) {
                    throw new hfio(hfil0);
                }
                optional0 = Optional.of(s1);
            }
            else {
                optional0 = Optional.empty();
            }
            map4.put(hfih0, new hfin(optional0.get()));
        }
    }

    public final void d(hfih hfih0, Object object0) {
        hfig hfig0 = hfih0.bg;
        boolean z = false;
        switch(hfig0.ordinal()) {
            case 1: {
                z = ((Boolean)object0).booleanValue();
                goto label_16;
            }
            case 2: {
                z = ((String)object0).isEmpty() ^ 1;
                goto label_16;
            }
            case 3: {
                if(((int)(((Integer)object0))) >= 0) {
                    z = true;
                }
                goto label_16;
            }
            case 4: {
                if(((long)(((Long)object0))) >= 0L) {
                    z = true;
                }
                goto label_16;
            }
            case 5: {
                if(!((Float)object0).isNaN() && !((Float)object0).isInfinite()) {
                    z = true;
                }
            label_16:
                if(!z) {
                    this.a(hfih0);
                    return;
                }
                break;
            }
            case 0: 
            case 6: 
            case 7: {
                break;
            }
            default: {
                throw new RuntimeException("Unexpected option type: " + hfig0);
            }
        }
        hfin hfin0 = new hfin(object0);
        this.c.put(hfih0, hfin0);
    }
}

