import android.os.Bundle;
import j..util.Objects;
import java.util.EnumMap;

public final class crdk {
    public static final crdk a;
    public final int b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final EnumMap f;

    static {
        crdk.a = new crdk(100);
    }

    public crdk(int v) {
        this(null, v, null, null);
    }

    public crdk(Boolean boolean0, int v, Boolean boolean1, String s) {
        EnumMap enumMap0 = new EnumMap(crma.class);
        this.f = enumMap0;
        crly crly0 = crmb.f(boolean0);
        enumMap0.put(crma.c, crly0);
        this.b = v;
        this.c = this.e();
        this.d = boolean1;
        this.e = s;
    }

    public crdk(EnumMap enumMap0, int v, Boolean boolean0, String s) {
        EnumMap enumMap1 = new EnumMap(crma.class);
        this.f = enumMap1;
        enumMap1.putAll(enumMap0);
        this.b = v;
        this.c = this.e();
        this.d = boolean0;
        this.e = s;
    }

    public static crdk a(Bundle bundle0, int v) {
        if(bundle0 == null) {
            return new crdk(v);
        }
        EnumMap enumMap0 = new EnumMap(crma.class);
        crma[] arr_crma = crlz.b.c;
        for(int v1 = 0; v1 < arr_crma.length; ++v1) {
            crma crma0 = arr_crma[v1];
            enumMap0.put(crma0, crmb.b(bundle0.getString(crma0.e)));
        }
        return bundle0.containsKey("is_dma_region") ? new crdk(enumMap0, v, Boolean.valueOf(bundle0.getString("is_dma_region")), bundle0.getString("cps_display_str")) : new crdk(enumMap0, v, null, bundle0.getString("cps_display_str"));
    }

    public static crdk b(String s) {
        if(s != null && s.length() > 0) {
            String[] arr_s = s.split(":");
            int v = Integer.parseInt(arr_s[0]);
            EnumMap enumMap0 = new EnumMap(crma.class);
            crma[] arr_crma = crlz.b.c;
            int v2 = 0;
            for(int v1 = 1; v2 < arr_crma.length; ++v1) {
                enumMap0.put(arr_crma[v2], crmb.e(arr_s[v1].charAt(0)));
                ++v2;
            }
            return new crdk(enumMap0, v, null, null);
        }
        return crdk.a;
    }

    public final crly c() {
        crly crly0 = (crly)this.f.get(crma.c);
        return crly0 == null ? crly.a : crly0;
    }

    public static Boolean d(Bundle bundle0) {
        if(bundle0 != null) {
            crly crly0 = crmb.b(bundle0.getString("ad_personalization"));
            if(crly0 != null) {
                switch(crly0.ordinal()) {
                    case 2: {
                        return Boolean.valueOf(false);
                    }
                    case 3: {
                        return Boolean.valueOf(true);
                    }
                    default: {
                        return null;
                    }
                }
            }
        }
        return null;
    }

    private final String e() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.b);
        crma[] arr_crma = crlz.b.c;
        for(int v = 0; v < arr_crma.length; ++v) {
            crma crma0 = arr_crma[v];
            stringBuilder0.append(":");
            stringBuilder0.append(crmb.a(((crly)this.f.get(crma0))));
        }
        return stringBuilder0.toString();
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof crdk) || !this.c.equalsIgnoreCase(((crdk)object0).c) || !Objects.equals(this.d, ((crdk)object0).d) ? false : Objects.equals(this.e, ((crdk)object0).e);
    }

    @Override
    public final int hashCode() {
        Boolean boolean0 = this.d;
        if(boolean0 == null) {
            return this.e == null ? this.c.hashCode() + 0x970 : this.c.hashCode() + 87 + this.e.hashCode() * 0x89;
        }
        int v = boolean0.booleanValue() ? 7 : 13;
        return this.e == null ? this.c.hashCode() + v * 29 + 0x919 : this.c.hashCode() + v * 29 + this.e.hashCode() * 0x89;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("source=");
        stringBuilder0.append(crmb.k(this.b));
        crma[] arr_crma = crlz.b.c;
        for(int v = 0; v < arr_crma.length; ++v) {
            crma crma0 = arr_crma[v];
            stringBuilder0.append(",");
            stringBuilder0.append(crma0.e);
            stringBuilder0.append("=");
            crly crly0 = (crly)this.f.get(crma0);
            if(crly0 == null) {
                stringBuilder0.append("uninitialized");
            }
            else {
                switch(crly0.ordinal()) {
                    case 0: {
                        stringBuilder0.append("uninitialized");
                        break;
                    }
                    case 1: {
                        stringBuilder0.append("eu_consent_policy");
                        break;
                    }
                    case 2: {
                        stringBuilder0.append("denied");
                        break;
                    }
                    case 3: {
                        stringBuilder0.append("granted");
                    }
                }
            }
        }
        Boolean boolean0 = this.d;
        if(boolean0 != null) {
            stringBuilder0.append(",isDmaRegion=");
            stringBuilder0.append(boolean0);
        }
        String s = this.e;
        if(s != null) {
            stringBuilder0.append(",cpsDisplayStr=");
            stringBuilder0.append(s);
        }
        return stringBuilder0.toString();
    }
}

