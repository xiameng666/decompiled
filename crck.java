import j..util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class crck {
    final String b;
    final int c;
    Boolean d;
    Boolean e;
    Long f;
    Long g;

    public crck(String s, int v) {
        this.b = s;
        this.c = v;
    }

    public abstract int a();

    public abstract boolean b();

    private static Boolean c(String s, int v, boolean z, String s1, List list0, String s2, crji crji0) {
        if(v == 7) {
            if(list0 == null || list0.isEmpty()) {
                return null;
            }
        }
        else if(s1 == null) {
            return null;
        }
        if(!z && v != 2) {
            s = s.toUpperCase(Locale.ENGLISH);
        }
        switch(v - 1) {
            case 1: {
                if(s2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(s2, (z ? 0 : 66)).matcher(s).matches());
                }
                catch(PatternSyntaxException unused_ex) {
                    if(crji0 != null) {
                        crji0.f.b("Invalid regular expression in REGEXP audience filter. expression", s2);
                    }
                    return null;
                }
            }
            case 2: {
                return Boolean.valueOf(s.startsWith(s1));
            }
            case 3: {
                return Boolean.valueOf(s.endsWith(s1));
            }
            case 4: {
                return Boolean.valueOf(s.contains(s1));
            }
            case 5: {
                return Boolean.valueOf(s.equals(s1));
            }
            case 6: {
                return list0 == null ? null : Boolean.valueOf(list0.contains(s));
            }
            default: {
                return null;
            }
        }
    }

    static Boolean d(BigDecimal bigDecimal0, crrj crrj0, double f) {
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal2;
        batl.s(crrj0);
        int v = crrj0.b;
        if((v & 1) != 0) {
            boolean z = true;
            int v1 = crrj0.c;
            if(crri.a(v1) != 0 && crri.a(v1) != 1) {
                if(crri.a(v1) == 5) {
                    if((v & 8) != 0 && (v & 16) != 0) {
                        goto label_10;
                    }
                    return null;
                }
                if((v & 4) != 0) {
                label_10:
                    int v2 = crri.a(v1) == 0 ? 1 : crri.a(v1);
                    if(crri.a(v1) == 5) {
                        if(crqt.x(crrj0.f) && crqt.x(crrj0.g)) {
                            try {
                                BigDecimal bigDecimal1 = new BigDecimal(crrj0.f);
                                bigDecimal2 = new BigDecimal(crrj0.g);
                                bigDecimal3 = bigDecimal1;
                                bigDecimal4 = null;
                                goto label_24;
                            }
                            catch(NumberFormatException unused_ex) {
                            }
                        }
                        return null;
                    }
                    else {
                        if(!crqt.x(crrj0.e)) {
                            return null;
                        }
                        try {
                            bigDecimal4 = new BigDecimal(crrj0.e);
                            bigDecimal3 = null;
                            bigDecimal2 = null;
                        }
                        catch(NumberFormatException unused_ex) {
                            return null;
                        }
                    }
                label_24:
                    if(v2 == 5) {
                        if(bigDecimal3 == null) {
                            return null;
                        }
                    }
                    else if(bigDecimal4 == null) {
                        return null;
                    }
                    switch(v2 - 1) {
                        case 1: {
                            if(bigDecimal4 == null) {
                                return null;
                            }
                            if(bigDecimal0.compareTo(bigDecimal4) >= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        case 2: {
                            if(bigDecimal4 == null) {
                                return null;
                            }
                            if(bigDecimal0.compareTo(bigDecimal4) <= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        default: {
                            switch(v2 - 1) {
                                case 3: {
                                    if(bigDecimal4 == null) {
                                        return null;
                                    }
                                    if(f != 0.0) {
                                        if(bigDecimal0.compareTo(bigDecimal4.subtract(new BigDecimal(f).multiply(new BigDecimal(2)))) <= 0 || bigDecimal0.compareTo(bigDecimal4.add(new BigDecimal(f).multiply(new BigDecimal(2)))) >= 0) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                    if(bigDecimal0.compareTo(bigDecimal4) != 0) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                                case 4: {
                                    if(bigDecimal3 != null) {
                                        if(bigDecimal0.compareTo(bigDecimal3) < 0 || bigDecimal0.compareTo(bigDecimal2) > 0) {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                    return null;
                                }
                                default: {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    static Boolean e(String s, crrn crrn0, crji crji0) {
        batl.s(crrn0);
        if(s != null) {
            int v = crrn0.b;
            if((v & 1) != 0) {
                int v1 = crrn0.c;
                if(crrm.a(v1) != 0 && crrm.a(v1) != 1) {
                    if(crrm.a(v1) == 7) {
                        if(crrn0.f.size() != 0) {
                            goto label_10;
                        }
                        return null;
                    }
                    if((v & 2) != 0) {
                    label_10:
                        int v2 = crrm.a(crrn0.c);
                        int v3 = v2 == 0 ? 1 : v2;
                        boolean z = crrn0.e;
                        String s1 = z || (v3 == 2 || v3 == 7) ? crrn0.d : crrn0.d.toUpperCase(Locale.ENGLISH);
                        if(crrn0.f.size() == 0) {
                            return v3 == 2 ? crck.c(s, 2, z, s1, null, s1, crji0) : crck.c(s, v3, z, s1, null, null, crji0);
                        }
                        List list0 = crrn0.f;
                        if(!z) {
                            ArrayList arrayList0 = new ArrayList(list0.size());
                            for(Object object0: list0) {
                                arrayList0.add(((String)object0).toUpperCase(Locale.ENGLISH));
                            }
                            list0 = DesugarCollections.unmodifiableList(arrayList0);
                        }
                        return v3 == 2 ? crck.c(s, 2, z, s1, list0, s1, crji0) : crck.c(s, v3, z, s1, list0, null, crji0);
                    }
                }
            }
        }
        return null;
    }

    static Boolean f(double f, crrj crrj0) {
        try {
            return crck.d(new BigDecimal(f), crrj0, Math.ulp(f));
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    static Boolean g(long v, crrj crrj0) {
        try {
            return crck.d(new BigDecimal(v), crrj0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    static Boolean h(String s, crrj crrj0) {
        if(!crqt.x(s)) {
            return null;
        }
        try {
            return crck.d(new BigDecimal(s), crrj0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    static Boolean i(Boolean boolean0, boolean z) {
        if(boolean0 == null) {
            return null;
        }
        return boolean0.booleanValue() == z ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

