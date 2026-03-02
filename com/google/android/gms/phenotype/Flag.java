package com.google.android.gms.phenotype;

import a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eimh;
import eimi;
import einr;
import java.util.Arrays;
import java.util.Comparator;

public class Flag extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR;
    public static final Comparator a;
    public final String b;
    final long c;
    final boolean d;
    final double e;
    final String f;
    final byte[] g;
    public final int h;
    public final int i;
    public final int j;

    static {
        Flag.CREATOR = new eimi();
        Flag.a = new eimh();
    }

    public Flag(String s, double f, int v) {
        this(s, 0L, false, f, null, null, 3, v, 0);
    }

    public Flag(String s, long v, int v1) {
        this(s, v, false, 0.0, null, null, 1, v1, 0);
    }

    public Flag(String s, long v, boolean z, double f, String s1, byte[] arr_b, int v1, int v2, int v3) {
        this.b = s;
        this.c = v;
        this.d = z;
        this.e = f;
        this.f = s1;
        this.g = arr_b;
        this.h = v1;
        this.i = v2;
        this.j = v3;
    }

    public Flag(String s, String s1, int v) {
        this(s, 0L, false, 0.0, s1, null, 4, v, 0);
    }

    public Flag(String s, String s1, int v, int v1) {
        this(s, s1, v, v1, 0);
    }

    public Flag(String s, String s1, int v, int v1, int v2) {
        this.b = s;
        this.h = v;
        this.i = v1;
        this.j = v2;
        switch(v) {
            case 1: {
                this.c = Long.parseLong(s1);
                this.d = false;
                this.e = 0.0;
                this.f = null;
                this.g = null;
                return;
            }
            case 2: {
                if(s1.equalsIgnoreCase("true")) {
                    this.d = true;
                }
                else {
                    if(!s1.equalsIgnoreCase("false")) {
                        throw new IllegalArgumentException("Unrecognized boolean value: " + s1);
                    }
                    this.d = false;
                }
                this.c = 0L;
                this.e = 0.0;
                this.f = null;
                this.g = null;
                return;
            }
            case 3: {
                this.e = Double.parseDouble(s1);
                this.c = 0L;
                this.d = false;
                this.f = null;
                this.g = null;
                return;
            }
            case 4: {
                this.f = s1;
                this.c = 0L;
                this.d = false;
                this.e = 0.0;
                this.g = null;
                return;
            }
            case 5: {
                this.g = Base64.decode(s1, 3);
                this.c = 0L;
                this.d = false;
                this.e = 0.0;
                this.f = null;
                return;
            }
            default: {
                throw new IllegalArgumentException("Unrecognized flag type: " + v);
            }
        }
    }

    public Flag(String s, boolean z, int v) {
        this(s, 0L, z, 0.0, null, null, 2, v, 0);
    }

    public Flag(String s, byte[] arr_b, int v) {
        this(s, 0L, false, 0.0, null, arr_b, 5, v, 0);
    }

    public final double a() {
        if(this.h == 3) {
            return this.e;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final long b() {
        if(this.h == 1) {
            return this.c;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final String c() {
        int v = this.h;
        switch(v) {
            case 1: {
                return Long.toString(this.c);
            }
            case 2: {
                return this.d ? "true" : "false";
            }
            case 3: {
                return Double.toString(this.e);
            }
            case 4: {
                return String.valueOf(this.f);
            }
            case 5: {
                batl.s(this.g);
                return Base64.encodeToString(this.g, 3);
            }
            default: {
                throw new AssertionError(a.h(v, "Invalid enum value: "));
            }
        }
    }

    @Override
    public final int compareTo(Object object0) {
        int v = this.b.compareTo(((Flag)object0).b);
        if(v != 0) {
            return v;
        }
        int v2 = this.h;
        int v3 = Flag.h(v2, ((Flag)object0).h);
        if(v3 != 0) {
            return v3;
        }
        switch(v2) {
            case 1: {
                int v4 = Long.compare(this.c, ((Flag)object0).c);
                if(v4 < 0) {
                    return -1;
                }
                return v4 == 0 ? 0 : 1;
            }
            case 2: {
                boolean z = this.d;
                if(z == ((Flag)object0).d) {
                    return 0;
                }
                return z ? 1 : -1;
            }
            case 3: {
                return Double.compare(this.e, ((Flag)object0).e);
            }
            case 4: {
                String s = this.f;
                String s1 = ((Flag)object0).f;
                if(s == s1) {
                    return 0;
                }
                if(s == null) {
                    return -1;
                }
                return s1 == null ? 1 : s.compareTo(s1);
            }
            case 5: {
                byte[] arr_b = this.g;
                byte[] arr_b1 = ((Flag)object0).g;
                if(arr_b == arr_b1) {
                    return 0;
                }
                if(arr_b == null) {
                    return -1;
                }
                if(arr_b1 == null) {
                    return 1;
                }
                for(int v1 = 0; v1 < Math.min(arr_b.length, arr_b1.length); ++v1) {
                    int v5 = arr_b[v1] - arr_b1[v1];
                    if(v5 != 0) {
                        return v5;
                    }
                }
                return Flag.h(arr_b.length, arr_b1.length);
            }
            default: {
                throw new AssertionError("Invalid enum value: " + v2);
            }
        }
    }

    public final String d() {
        if(this.h != 4) {
            throw new IllegalArgumentException("Not a String type");
        }
        batl.s(this.f);
        return this.f;
    }

    final void e(StringBuilder stringBuilder0) {
        stringBuilder0.append("Flag(");
        String s = this.b;
        stringBuilder0.append(s);
        stringBuilder0.append(", ");
        int v = this.h;
        switch(v) {
            case 1: {
                stringBuilder0.append(this.c);
                break;
            }
            case 2: {
                stringBuilder0.append(this.d);
                break;
            }
            case 3: {
                stringBuilder0.append(this.e);
                break;
            }
            case 4: {
                stringBuilder0.append("\'");
                batl.s(this.f);
                stringBuilder0.append(this.f);
                stringBuilder0.append("\'");
                break;
            }
            case 5: {
                stringBuilder0.append("\'");
                batl.s(this.g);
                stringBuilder0.append(Base64.encodeToString(this.g, 3));
                stringBuilder0.append("\'");
                break;
            }
            default: {
                throw new AssertionError(a.p(v, s, "Invalid type: ", ", "));
            }
        }
        stringBuilder0.append(", ");
        stringBuilder0.append(v);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.j);
        stringBuilder0.append(")");
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof Flag) && einr.a(this.b, ((Flag)object0).b)) {
            int v = this.h;
            if(v == ((Flag)object0).h && this.i == ((Flag)object0).i && this.j == ((Flag)object0).j) {
                switch(v) {
                    case 1: {
                        return this.c == ((Flag)object0).c;
                    }
                    case 2: {
                        return this.d == ((Flag)object0).d;
                    }
                    case 3: {
                        return this.e == ((Flag)object0).e;
                    }
                    case 4: {
                        return einr.a(this.f, ((Flag)object0).f);
                    }
                    case 5: {
                        return Arrays.equals(this.g, ((Flag)object0).g);
                    }
                    default: {
                        throw new AssertionError("Invalid enum value: " + v);
                    }
                }
            }
        }
        return false;
    }

    public final boolean f() {
        if(this.h == 2) {
            return this.d;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final byte[] g() {
        if(this.h != 5) {
            throw new IllegalArgumentException("Not a bytes type");
        }
        batl.s(this.g);
        return this.g;
    }

    private static int h(int v, int v1) {
        if(v < v1) {
            return -1;
        }
        return v == v1 ? 0 : 1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        this.e(stringBuilder0);
        return stringBuilder0.toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        String s = this.b;
        int v1 = baub.a(parcel0);
        if(s != null) {
            baub.v(parcel0, 2, s, false);
        }
        long v2 = this.c;
        if(v2 != 0L) {
            baub.q(parcel0, 3, v2);
        }
        if(this.d) {
            baub.e(parcel0, 4, true);
        }
        double f = this.e;
        if(f != 0.0) {
            baub.j(parcel0, 5, f);
        }
        String s1 = this.f;
        if(s1 != null) {
            baub.v(parcel0, 6, s1, false);
        }
        byte[] arr_b = this.g;
        if(arr_b != null) {
            baub.i(parcel0, 7, arr_b, false);
        }
        int v3 = this.h;
        if(v3 != 0) {
            baub.o(parcel0, 8, v3);
        }
        int v4 = this.i;
        if(v4 != 0) {
            baub.o(parcel0, 9, v4);
        }
        int v5 = this.j;
        if(v5 != 0) {
            baub.o(parcel0, 10, v5);
        }
        baub.c(parcel0, v1);
    }
}

