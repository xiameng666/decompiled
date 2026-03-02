import android.net.Uri;

public final class flqd {
    public final Uri a;
    public final gged_interceptors b;
    public final String c;
    public final gged_interceptors d;
    public final String e;
    public final int f;
    public final int g;

    public flqd() {
        throw null;
    }

    public flqd(Uri uri0, gged_interceptors gged0, String s, gged_interceptors gged1, String s1, int v, int v1) {
        this.a = uri0;
        this.b = gged0;
        this.c = s;
        this.d = gged1;
        this.e = s1;
        this.f = v;
        this.g = v1;
    }

    public static flqc a() {
        flqc flqc0 = new flqc();
        flqc0.b(-1);
        flqc0.c(0);
        return flqc0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof flqd) && this.a.equals(((flqd)object0).a)) {
            gged_interceptors gged0 = this.b;
            if(gged0 != null) {
                if(ggia.i(gged0, ((flqd)object0).b)) {
                label_8:
                    String s = this.c;
                    if(s != null) {
                        if(s.equals(((flqd)object0).c)) {
                        label_13:
                            gged_interceptors gged1 = this.d;
                            if(gged1 != null) {
                                if(ggia.i(gged1, ((flqd)object0).d)) {
                                label_18:
                                    String s1 = this.e;
                                    if(s1 == null) {
                                        return ((flqd)object0).e == null ? this.f == ((flqd)object0).f && this.g == ((flqd)object0).g : false;
                                    }
                                    return s1.equals(((flqd)object0).e) ? this.f == ((flqd)object0).f && this.g == ((flqd)object0).g : false;
                                }
                            }
                            else if(((flqd)object0).d == null) {
                                goto label_18;
                            }
                        }
                    }
                    else if(((flqd)object0).c == null) {
                        goto label_13;
                    }
                }
            }
            else if(((flqd)object0).b == null) {
                goto label_8;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v1 = s.hashCode();
        }
        return (this.g ^ (((((v * 1000003 ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v1) * 0xD5009D89 ^ this.f) * 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "QueryParams{tableUri=" + this.a + ", projection=" + this.b + ", selection=" + this.c + ", selectionArgs=" + this.d + ", orderBy=" + this.e + ", groupBy=null, limit=" + this.f + ", offset=" + this.g + ", filterPredicate=null}";
    }
}

