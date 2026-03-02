import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ibzg {
    public static final void a(Appendable appendable0, Object object0, ibts ibts0) {
        if(ibts0 != null) {
            appendable0.append(((CharSequence)ibts0.a(object0)));
            return;
        }
        if(object0 != null && !(object0 instanceof CharSequence)) {
            if((object0 instanceof Character)) {
                appendable0.append(((Character)object0).charValue());
                return;
            }
            appendable0.append(object0.toString());
            return;
        }
        appendable0.append(((CharSequence)object0));
    }

    public static String b(String s) {
        Comparable comparable0;
        int v;
        List list0 = ibzk.A(s);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(!ibzk.D(((String)object0))) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        Iterator iterator1 = arrayList0.iterator();
        while(true) {
            v = 0;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            String s1 = (String)object1;
            int v1 = s1.length();
            while(true) {
                if(v < v1) {
                    if(ibyn.a(s1.charAt(v))) {
                        ++v;
                        continue;
                    }
                    else {
                        break;
                    }
                }
                v = -1;
                break;
            }
            if(v == -1) {
                v = s1.length();
            }
            arrayList1.add(Integer.valueOf(v));
        }
        Iterator iterator2 = arrayList1.iterator();
        if(iterator2.hasNext()) {
            Object object2 = iterator2.next();
            comparable0 = (Comparable)object2;
            while(iterator2.hasNext()) {
                Object object3 = iterator2.next();
                Comparable comparable1 = (Comparable)object3;
                if(comparable0.compareTo(comparable1) > 0) {
                    comparable0 = comparable1;
                }
            }
        }
        else {
            comparable0 = null;
        }
        int v2 = ((Integer)comparable0) == null ? 0 : ((int)(((Integer)comparable0)));
        int v3 = s.length();
        ibts ibts0 = ibzg.h();
        int v4 = ibpo.d(list0);
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: list0) {
            if(v < 0) {
                ibpo.m();
            }
            String s2 = (String)object4;
            if((v == 0 || v == v4) && ibzk.D(s2)) {
                s2 = null;
            }
            else {
                String s3 = ibzk.Z(s2, v2);
                if(s3 != null) {
                    String s4 = (String)ibts0.a(s3);
                    if(s4 != null) {
                        s2 = s4;
                    }
                }
            }
            if(s2 != null) {
                arrayList2.add(s2);
            }
            ++v;
        }
        StringBuilder stringBuilder0 = new StringBuilder(v3);
        ibpo.aM(arrayList2, stringBuilder0, "\n", null, 0x7C);
        return stringBuilder0.toString();
    }

    public static String c(String s) {
        return ibxv.m(new ibym(ibzk.B(s), new ibzh()), "\n");
    }

    public static String d(String s) {
        if(ibzk.D("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List list0 = ibzk.A(s);
        int v = s.length();
        ibts ibts0 = ibzg.h();
        int v1 = ibpo.d(list0);
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = list0.iterator();
        int v2 = 0;
        while(true) {
            Object object0 = null;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object1 = iterator0.next();
            if(v2 < 0) {
                ibpo.m();
            }
            if(v2 != 0 && v2 != v1 || !ibzk.D(((String)object1))) {
                int v3 = ((String)object1).length();
                int v4 = 0;
                while(true) {
                    if(v4 < v3) {
                        if(ibyn.a(((String)object1).charAt(v4))) {
                            ++v4;
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                    v4 = -1;
                    break;
                }
                if(v4 != -1 && ibzk.V(((String)object1), "|", v4)) {
                    ibuq.d(((String)object1), "null cannot be cast to non-null type java.lang.String");
                    object0 = ((String)object1).substring(v4 + 1);
                    ibuq.e(object0, "substring(...)");
                }
                if(object0 != null) {
                    Object object2 = (String)ibts0.a(object0);
                    if(object2 != null) {
                        object0 = object2;
                        goto label_32;
                    }
                }
                object0 = (String)object1;
            }
        label_32:
            if(object0 != null) {
                arrayList0.add(object0);
            }
            ++v2;
        }
        StringBuilder stringBuilder0 = new StringBuilder(v);
        ibpo.aM(arrayList0, stringBuilder0, "\n", null, 0x7C);
        return stringBuilder0.toString();
    }

    public static Double e(String s) {
        String s1;
        boolean z1;
        int v6;
        boolean z;
        int v4;
        Double double1;
        ibuq.f(s, "<this>");
        int v = s.length() - 1;
        int v1;
        for(v1 = 0; v1 <= v && s.charAt(v1) <= 0x20; ++v1) {
        }
        if(v1 > v) {
            return null;
        }
        while(v > v1 && s.charAt(v) <= 0x20) {
            --v;
        }
        if(s.charAt(v1) == 43 || s.charAt(v1) == 45) {
            ++v1;
        }
        if(v1 > v) {
            return null;
        }
        if(s.charAt(v1) == 0x30) {
            if(v1 + 1 > v) {
                double1 = null;
                return Double.parseDouble(s);
            }
            if((s.charAt(v1 + 1) | 0x20) == 120) {
                int v2;
                for(v2 = v1 + 2; v2 <= v; ++v2) {
                    int v3 = s.charAt(v2);
                    if(((char)(v3 - 0x30)) >= 10 && ((char)((v3 | 0x20) - 97)) >= 6) {
                        break;
                    }
                }
                if(v2 > v) {
                    double1 = null;
                    v1 = -1;
                }
                else {
                    if(s.charAt(v2) == 46) {
                        v4 = v2 + 1;
                        for(Double double0 = null; true; double0 = double1) {
                            if(v4 > v) {
                                double1 = double0;
                                break;
                            }
                            int v5 = s.charAt(v4);
                            double1 = double0;
                            if(((char)(v5 - 0x30)) >= 10 && ((char)((v5 | 0x20) - 97)) >= 6) {
                                break;
                            }
                            ++v4;
                        }
                        z = v2 + 1 != v4;
                    }
                    else {
                        double1 = null;
                        z = false;
                        v4 = v2;
                    }
                    v1 = v1 + 2 == v2 && !z ? -1 : v4;
                }
                if(v1 != -1) {
                    if(v1 > v) {
                        return double1;
                    }
                    v6 = 1;
                    goto label_62;
                }
                return double1;
            }
            else {
                double1 = null;
                v6 = 0;
            }
        }
        else {
            double1 = null;
            v6 = 0;
        }
    label_62:
        if(v6 == 0) {
            int v7 = v1;
            try {
                while(v7 <= v && ((char)(s.charAt(v7) - 0x30)) < 10) {
                    ++v7;
                }
                if(v7 <= v) {
                    if(s.charAt(v7) == 46) {
                        int v8;
                        for(v8 = v7 + 1; v8 <= v && ((char)(s.charAt(v8) - 0x30)) < 10; ++v8) {
                        }
                        z1 = v7 + 1 != v8;
                    }
                    else {
                        z1 = false;
                        v8 = v7;
                    }
                    if(v1 == v7 && !z1) {
                        if(v == v8 + 2) {
                            s1 = "NaN";
                        }
                        else if(v == v8 + 7) {
                            s1 = "Infinity";
                        }
                        else {
                            s1 = double1;
                        }
                        if(s1 == null) {
                            v1 = -1;
                        }
                        else if(ibzk.q(s, s1, v8, false) == v8) {
                            v1 = v + 1;
                        }
                        else {
                            v1 = -1;
                        }
                    }
                    else {
                        v1 = v8;
                    }
                }
                else {
                    v1 = v7;
                }
                if(v1 == -1) {
                    return double1;
                }
                if(v1 > v) {
                    return Double.parseDouble(s);
                }
            label_103:
                int v9 = v1 + 1;
                int v10 = s.charAt(v1) | 0x20;
                if(v10 != (1 == v6 ? 0x70 : 101)) {
                    if(v6 == 0) {
                        if(v10 != 100 && v10 != 102) {
                            return double1;
                        }
                        return v9 > v ? Double.parseDouble(s) : double1;
                    }
                    return double1;
                }
                if(v9 > v) {
                    return double1;
                }
                if(s.charAt(v9) == 43 || s.charAt(v9) == 45) {
                    v9 = v1 + 2;
                    if(v9 > v) {
                        return double1;
                    }
                }
                while(v9 <= v && ((char)(s.charAt(v9) - 0x30)) < 10) {
                    ++v9;
                }
                return v9 > v || v9 == v && ((s.charAt(v9) | 0x20) == 100 || (s.charAt(v9) | 0x20) == 102) ? Double.parseDouble(s) : double1;
            }
            catch(NumberFormatException unused_ex) {
                return double1;
            }
        }
        goto label_103;
    }

    public static Integer f(String s) {
        boolean z;
        ibuq.f(s, "<this>");
        ibuq.f(s, "<this>");
        int v = s.length();
        if(v == 0) {
            return null;
        }
        int v1 = 1;
        int v2 = 0;
        int v3 = s.charAt(0);
        int v4 = 0x80000001;
        if(ibuq.a(v3, 0x30) < 0) {
            if(v == 1) {
                return null;
            }
            switch(v3) {
                case 43: {
                    z = false;
                    break;
                }
                case 45: {
                    v4 = 0x80000000;
                    z = true;
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        else {
            z = false;
            v1 = 0;
        }
        int v5 = 0xFC71C71D;
        while(v1 < v) {
            int v6 = ibyn.c(s.charAt(v1));
            if(v6 < 0) {
                return null;
            }
            if(v2 < v5) {
                if(v5 != 0xFC71C71D) {
                    return null;
                }
                v5 = 0xF3333334;
                if(v2 < 0xF3333334) {
                    return null;
                }
            }
            if(v2 * 10 < v4 + v6) {
                return null;
            }
            v2 = v2 * 10 - v6;
            ++v1;
        }
        return z ? v2 : ((int)(-v2));
    }

    public static Long g(String s) {
        ibuq.f(s, "<this>");
        ibuq.f(s, "<this>");
        int v = s.length();
        if(v == 0) {
            return null;
        }
        int v1 = 1;
        boolean z = false;
        int v2 = s.charAt(0);
        long v3 = 0x8000000000000001L;
        if(ibuq.a(v2, 0x30) < 0) {
            if(v == 1) {
                return null;
            }
            switch(v2) {
                case 43: {
                    break;
                }
                case 45: {
                    v3 = 0x8000000000000000L;
                    z = true;
                    break;
                }
                default: {
                    return null;
                }
            }
        }
        else {
            v1 = 0;
        }
        long v4 = 0L;
        long v5 = -256204778801521550L;
        while(v1 < v) {
            int v6 = ibyn.c(s.charAt(v1));
            if(v6 < 0) {
                return null;
            }
            if(v4 < v5) {
                if(v5 != -256204778801521550L) {
                    return null;
                }
                v5 = -922337203685477580L;
                if(v4 < -922337203685477580L) {
                    return null;
                }
            }
            if(v4 * 10L < v3 + ((long)v6)) {
                return null;
            }
            v4 = v4 * 10L - ((long)v6);
            ++v1;
        }
        return z ? v4 : ((long)(-v4));
    }

    private static ibts h() {
        return "".length() == 0 ? new ibzi() : new ibzj();
    }
}

