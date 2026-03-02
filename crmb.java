import android.os.Bundle;
import java.util.EnumMap;

public final class crmb {
    public static final crmb a;
    public final EnumMap b;
    public final int c;

    static {
        crmb.a = new crmb(100);
    }

    public crmb(int v) {
        EnumMap enumMap0 = new EnumMap(crma.class);
        this.b = enumMap0;
        crly crly0 = crmb.f(null);
        enumMap0.put(crma.a, crly0);
        crly crly1 = crmb.f(null);
        enumMap0.put(crma.b, crly1);
        this.c = v;
    }

    public crmb(EnumMap enumMap0, int v) {
        EnumMap enumMap1 = new EnumMap(crma.class);
        this.b = enumMap1;
        enumMap1.putAll(enumMap0);
        this.c = v;
    }

    static char a(crly crly0) {
        if(crly0 != null) {
            switch(crly0.ordinal()) {
                case 1: {
                    return '+';
                }
                case 2: {
                    return '0';
                }
                case 3: {
                    return '1';
                }
                default: {
                    return '-';
                }
            }
        }
        return '-';
    }

    static crly b(String s) {
        if(s == null) {
            return crly.a;
        }
        if(s.equals("granted")) {
            return crly.d;
        }
        return s.equals("denied") ? crly.c : crly.a;
    }

    public final crly c() {
        crly crly0 = (crly)this.b.get(crma.a);
        return crly0 == null ? crly.a : crly0;
    }

    public final crly d() {
        crly crly0 = (crly)this.b.get(crma.b);
        return crly0 == null ? crly.a : crly0;
    }

    static crly e(char c) {
        switch(c) {
            case 43: {
                return crly.b;
            }
            case 0x30: {
                return crly.c;
            }
            case 49: {
                return crly.d;
            }
            default: {
                return crly.a;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof crmb)) {
            return false;
        }
        crma[] arr_crma = crlz.a.c;
        for(int v = 0; v < arr_crma.length; ++v) {
            crma crma0 = arr_crma[v];
            if(this.b.get(crma0) != ((crmb)object0).b.get(crma0)) {
                return false;
            }
        }
        return this.c == ((crmb)object0).c;
    }

    static crly f(Boolean boolean0) {
        if(boolean0 == null) {
            return crly.a;
        }
        return boolean0.booleanValue() ? crly.d : crly.c;
    }

    public static crmb g(Bundle bundle0, int v) {
        if(bundle0 == null) {
            return new crmb(v);
        }
        EnumMap enumMap0 = new EnumMap(crma.class);
        crma[] arr_crma = crlz.a.c;
        for(int v1 = 0; v1 < arr_crma.length; ++v1) {
            crma crma0 = arr_crma[v1];
            enumMap0.put(crma0, crmb.b(bundle0.getString(crma0.e)));
        }
        return new crmb(enumMap0, v);
    }

    public static crmb h(String s) {
        return crmb.i(s, 100);
    }

    @Override
    public final int hashCode() {
        int v = this.c * 17;
        for(Object object0: this.b.values()) {
            v = v * 0x1F + ((crly)object0).hashCode();
        }
        return v;
    }

    public static crmb i(String s, int v) {
        EnumMap enumMap0 = new EnumMap(crma.class);
        crma[] arr_crma = crlz.a.c;
        for(int v1 = 0; v1 < arr_crma.length; ++v1) {
            String s1 = s == null ? "" : s;
            crma crma0 = arr_crma[v1];
            if(v1 + 2 < s1.length()) {
                enumMap0.put(crma0, crmb.e(s1.charAt(v1 + 2)));
            }
            else {
                enumMap0.put(crma0, crly.a);
            }
        }
        return new crmb(enumMap0, v);
    }

    public final crmb j(crmb crmb0) {
        EnumMap enumMap0 = new EnumMap(crma.class);
        crma[] arr_crma = crlz.a.c;
        for(int v = 0; v < arr_crma.length; ++v) {
            crma crma0 = arr_crma[v];
            crly crly0 = (crly)this.b.get(crma0);
            crly crly1 = (crly)crmb0.b.get(crma0);
            if(crly0 == null) {
                crly0 = crly1;
            }
            else if(crly1 != null) {
                crly crly2 = crly.a;
                if(crly0 == crly2) {
                    crly0 = crly1;
                }
                else if(crly1 != crly2) {
                    crly crly3 = crly.b;
                    if(crly0 == crly3) {
                        crly0 = crly1;
                    }
                    else if(crly1 != crly3) {
                        crly0 = crly0 == crly.c || crly1 == crly.c ? crly.c : crly.d;
                    }
                }
            }
            if(crly0 != null) {
                enumMap0.put(crma0, crly0);
            }
        }
        return new crmb(enumMap0, 100);
    }

    static String k(int v) {
        switch(v) {
            case -30: {
                return "TCF";
            }
            case -20: {
                return "API";
            }
            case -10: {
                return "MANIFEST";
            }
            case 0: {
                return "1P_API";
            }
            case 30: {
                return "1P_INIT";
            }
            case 90: {
                return "REMOTE_CONFIG";
            }
            case 100: {
                return "UNKNOWN";
            }
            default: {
                return "OTHER";
            }
        }
    }

    static String l(crly crly0) {
        switch(crly0.ordinal()) {
            case 2: {
                return "denied";
            }
            case 3: {
                return "granted";
            }
            default: {
                return null;
            }
        }
    }

    public final String m() {
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        crma[] arr_crma = crlz.a.c;
        for(int v = 0; v < arr_crma.length; ++v) {
            crly crly0 = (crly)this.b.get(arr_crma[v]);
            int v1 = 45;
            if(crly0 != null) {
                switch(crly0.ordinal()) {
                    case 2: {
                        v1 = 0x30;
                        break;
                    }
                    case 1: 
                    case 3: {
                        v1 = 49;
                    }
                }
            }
            stringBuilder0.append(((char)v1));
        }
        return stringBuilder0.toString();
    }

    public final String n() {
        StringBuilder stringBuilder0 = new StringBuilder("G1");
        crma[] arr_crma = crlz.a.c;
        for(int v = 0; v < arr_crma.length; ++v) {
            stringBuilder0.append(crmb.a(((crly)this.b.get(arr_crma[v]))));
        }
        return stringBuilder0.toString();
    }

    public final boolean o() {
        return this.p(crma.a);
    }

    public final boolean p(crma crma0) {
        return ((crly)this.b.get(crma0)) != crly.c;
    }

    public final boolean q() {
        return this.p(crma.b);
    }

    public static boolean r(int v, int v1) {
        if(v == -20) {
            if(v1 != -30) {
                v = -20;
                goto label_5;
            }
            return true;
        }
    label_5:
        if(v == -30) {
            return v1 == -20 ? true : -30 == v1 || -30 < v1;
        }
        return v == v1 || v < v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(crmb.k(this.c));
        crma[] arr_crma = crlz.a.c;
        for(int v = 0; v < arr_crma.length; ++v) {
            crma crma0 = arr_crma[v];
            stringBuilder0.append(",");
            stringBuilder0.append(crma0.e);
            stringBuilder0.append("=");
            crly crly0 = (crly)this.b.get(crma0);
            if(crly0 == null) {
                crly0 = crly.a;
            }
            stringBuilder0.append(crly0);
        }
        return stringBuilder0.toString();
    }
}

