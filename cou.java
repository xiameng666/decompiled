import java.util.List;

public final class cou extends cok {
    private final int a;
    private final int b;
    private final int c;
    private final List d;
    private final int e;
    private final int f;

    public cou(int v, int v1, int v2, int v3, List list0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.f = v3;
        this.d = list0;
        this.e = v2 == -1 ? 0x7FFFFFFF : v * (v2 + 1) + v1;
    }

    @Override  // cok
    public final int a() {
        return this.e;
    }

    @Override  // cok
    public final void b(bzk bzk0, int v, int v1) {
        List list0 = this.d;
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            cpe cpe0 = (cpe)list0.get(v3);
            if(!(cpe0 instanceof cpd)) {
                if((cpe0 instanceof cpi)) {
                    String s = ((cpi)cpe0).a;
                    cos cos0 = (cos)bzk0.a(s);
                    if(cos0 == null) {
                        cos0 = new cos();
                    }
                    cpn cpn0 = new cpn(v1 + this.b, this.a, this.c, this.f, cpe0);
                    cos0.a.add(cpn0);
                    bzk0.k(s, cos0);
                }
                else if((cpe0 instanceof cpg)) {
                    String s1 = ((cpg)cpe0).a;
                    coo coo0 = (coo)bzk0.a(s1);
                    if(coo0 == null) {
                        coo0 = new coo();
                    }
                    cpn cpn1 = new cpn(v1 + this.b, this.a, this.c, this.f, cpe0);
                    coo0.a.add(cpn1);
                    bzk0.k(s1, coo0);
                }
                else if((cpe0 instanceof cpk)) {
                    String s2 = ((cpk)cpe0).a;
                    coz coz0 = (coz)bzk0.a(s2);
                    if(coz0 == null) {
                        coz0 = new coz();
                    }
                    cpn cpn2 = new cpn(v1 + this.b, this.a, this.c, this.f, cpe0);
                    coz0.a.add(cpn2);
                    bzk0.k(s2, coz0);
                }
                else if(!(cpe0 instanceof cpj)) {
                    throw new ibnq();
                }
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cou)) {
            return false;
        }
        if(this.a != ((cou)object0).a) {
            return false;
        }
        if(this.b != ((cou)object0).b) {
            return false;
        }
        if(this.c != ((cou)object0).c) {
            return false;
        }
        return this.f == ((cou)object0).f ? ibuq.m(this.d, ((cou)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        cjp.a(this.f);
        return (((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.f) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        return "ObjectAnimator(duration=" + this.a + ", startDelay=" + this.b + ", repeatCount=" + this.c + ", repeatMode=" + (this.f == 1 ? "Restart" : "Reverse") + ", holders=" + this.d + ')';
    }
}

