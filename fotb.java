import java.util.function.Predicate;

public final class fotb {
    public final String a;
    public final boolean b;
    public final idcw c;
    public final iczv d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final fowj h;
    public final boolean i;
    public final int j;
    public final fopr k;
    public final int l;
    private final Predicate m;

    public fotb() {
        throw null;
    }

    public fotb(String s, boolean z, idcw idcw0, iczv iczv0, String s1, Long long0, boolean z1, fowj fowj0, boolean z2, int v, Predicate predicate0, fopr fopr0, int v1) {
        this.a = s;
        this.b = z;
        this.c = idcw0;
        this.d = iczv0;
        this.e = s1;
        this.f = long0;
        this.g = z1;
        this.h = fowj0;
        this.i = z2;
        this.j = v;
        this.m = predicate0;
        this.k = fopr0;
        this.l = v1;
    }

    public static fota a() {
        fota fota0 = new fota();
        fota0.c(false);
        fota0.d(false);
        fota0.b(0);
        fota0.g(false);
        fota0.e(0x7FFFFFFF);
        fota0.f = new fosz();
        return fota0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fotb)) {
            String s = this.a;
            if(s != null) {
                if(s.equals(((fotb)object0).a)) {
                label_8:
                    if(this.b == ((fotb)object0).b && ((ProtoLiteMessage)this.c).equals(((fotb)object0).c)) {
                        iczv iczv0 = this.d;
                        if(iczv0 != null) {
                            if(((ProtoLiteMessage)iczv0).equals(((fotb)object0).d)) {
                            label_14:
                                String s1 = this.e;
                                if(s1 != null) {
                                    if(s1.equals(((fotb)object0).e)) {
                                    label_19:
                                        Long long0 = this.f;
                                        if(long0 != null) {
                                            if(long0.equals(((fotb)object0).f)) {
                                            label_24:
                                                if(this.g == ((fotb)object0).g) {
                                                    if(this.h != null) {
                                                        throw null;
                                                    }
                                                    if(((fotb)object0).h == null && this.i == ((fotb)object0).i && this.j == ((fotb)object0).j && this.m.equals(((fotb)object0).m)) {
                                                        fopr fopr0 = this.k;
                                                        if(fopr0 == null) {
                                                            return ((fotb)object0).k == null ? this.l == ((fotb)object0).l : false;
                                                        }
                                                        return fopr0.equals(((fotb)object0).k) ? this.l == ((fotb)object0).l : false;
                                                    }
                                                }
                                            }
                                        }
                                        else if(((fotb)object0).f == null) {
                                            goto label_24;
                                        }
                                    }
                                }
                                else if(((fotb)object0).e == null) {
                                    goto label_19;
                                }
                            }
                        }
                        else if(((fotb)object0).d == null) {
                            goto label_14;
                        }
                    }
                }
            }
            else if(((fotb)object0).a == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v6;
        int v4;
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = 0x4D5;
        int v3 = this.b ? 0x4CF : 0x4D5;
        idcw idcw0 = this.c;
        if(((ProtoLiteMessage)idcw0).isImmutable()) {
            v4 = ((ProtoLiteMessage)idcw0).s();
        }
        else {
            int v5 = idcw0.memoizedHashCode;
            if(v5 == 0) {
                v5 = ((ProtoLiteMessage)idcw0).s();
                idcw0.memoizedHashCode = v5;
            }
            v4 = v5;
        }
        iczv iczv0 = this.d;
        if(iczv0 == null) {
            v6 = 0;
        }
        else if(((ProtoLiteMessage)iczv0).isImmutable()) {
            v6 = ((ProtoLiteMessage)iczv0).s();
        }
        else {
            int v7 = iczv0.memoizedHashCode;
            if(v7 == 0) {
                v7 = ((ProtoLiteMessage)iczv0).s();
                iczv0.memoizedHashCode = v7;
            }
            v6 = v7;
        }
        int v8 = this.e == null ? 0 : this.e.hashCode();
        int v9 = this.f == null ? 0 : this.f.hashCode();
        int v10 = this.g ? 0x4CF : 0x4D5;
        if(this.h != null) {
            throw null;
        }
        if(this.i) {
            v2 = 0x4CF;
        }
        int v11 = ((((((((((v1 ^ 1000003) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v6) * 1000003 ^ v8) * 1000003 ^ v9) * 1000003 ^ v10) * 0xD5009D89 ^ v2) * 1000003 ^ this.j) * 1000003 ^ this.m.hashCode()) * 1000003;
        fopr fopr0 = this.k;
        if(fopr0 != null) {
            v = fopr0.hashCode();
        }
        return this.l ^ (v11 ^ v) * 1000003;
    }

    @Override
    public final String toString() {
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + this.c + ", metricExtension=" + this.d + ", accountableComponentName=" + this.e + ", sampleRatePermille=" + this.f + ", isUnsampled=" + this.g + ", activeCuiId=" + this.h + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + this.m + ", debugLogsTime=" + this.k + ", debugLogsSize=" + this.l + "}";
    }
}

