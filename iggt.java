import java.io.IOException;

public final class iggt {
    public final ighr a;
    public final ighp b;
    private final igcm c;
    private final igcw d;

    public iggt(ighr ighr0, ighp ighp0) {
        this.a = ighr0;
        this.b = ighp0;
        this.c = null;
        this.d = null;
    }

    private iggt(ighr ighr0, ighp ighp0, igcm igcm0, igcw igcw0) {
        this.a = ighr0;
        this.b = ighp0;
        this.c = igcm0;
        this.d = igcw0;
    }

    public final long a(String s) {
        String s3;
        ighp ighp0 = this.b;
        if(ighp0 == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        ighl ighl0 = new ighl(this.h(this.c));
        int v = ighp0.c(ighl0, s, 0);
        if(v < 0) {
            v = ~v;
        }
        else if(v >= s.length()) {
            return ighl0.g(s);
        }
        String s1 = s.toString();
        String s2 = s1.length() > v + 35 ? s1.substring(0, v + 0x20) + "..." : s1;
        if(v <= 0) {
            s3 = "Invalid format: \"" + s2 + "\"";
        }
        else if(v >= s1.length()) {
            s3 = "Invalid format: \"" + s2 + "\" is too short";
        }
        else {
            s3 = "Invalid format: \"" + s2 + "\" is malformed at \"" + s2.substring(v) + "\"";
        }
        throw new IllegalArgumentException(s3);
    }

    public final String b(igdk igdk0) {
        StringBuilder stringBuilder0 = new StringBuilder(this.i().b());
        try {
            long v = igct.b(igdk0);
            igcm igcm0 = igdk0.oU();
            if(igcm0 == null) {
                igcm0 = igev.Q();
            }
            this.j(stringBuilder0, v, igcm0);
        }
        catch(IOException unused_ex) {
        }
        return stringBuilder0.toString();
    }

    public final String c(igdm igdm0) {
        StringBuilder stringBuilder0 = new StringBuilder(this.i().b());
        try {
            this.i().d(stringBuilder0, igdm0, null);
        }
        catch(IOException unused_ex) {
        }
        return stringBuilder0.toString();
    }

    public final iggt d(igcm igcm0) {
        return this.c == igcm0 ? this : new iggt(this.a, this.b, igcm0, this.d);
    }

    public final iggt e() {
        return this.d == igcw.b ? this : new iggt(this.a, this.b, this.c, igcw.b);
    }

    public final void f(StringBuffer stringBuffer0, long v) {
        try {
            this.j(stringBuffer0, v, null);
        }
        catch(IOException unused_ex) {
        }
    }

    public final ighq g() {
        return ighq.b(this.b);
    }

    private final igcm h(igcm igcm0) {
        igcm igcm1 = this.c;
        igcm igcm2 = igct.d(igcm0);
        if(igcm1 == null) {
            igcm1 = igcm2;
        }
        return this.d == null ? igcm1 : igcm1.d(this.d);
    }

    private final ighr i() {
        ighr ighr0 = this.a;
        if(ighr0 != null) {
            return ighr0;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private final void j(Appendable appendable0, long v, igcm igcm0) {
        long v3;
        ighr ighr0 = this.i();
        igcm igcm1 = this.h(igcm0);
        igcw igcw0 = igcm1.B();
        int v1 = igcw0.a(v);
        long v2 = v + ((long)v1);
        if((v ^ v2) < 0L && (((long)v1) ^ v) >= 0L) {
            igcw0 = igcw.b;
            v1 = 0;
            v3 = v;
        }
        else {
            v3 = v2;
        }
        ighr0.e(appendable0, v3, igcm1.c(), v1, igcw0, null);
    }
}

