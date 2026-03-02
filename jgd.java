import java.util.List;

public final class jgd {
    public jhk a;
    public jge b;

    public jgd() {
        this.a = new jhk(iwm.a, jbk.a, null);
        this.b = new jge(this.a.b, this.a.c);
    }

    public final jhk a(List list0) {
        jga jga2;
        Exception exception1;
        jga jga1;
        jbk jbk0 = null;
        int v = list0.size();
        int v1 = 0;
        jga jga0 = null;
        while(v1 < v) {
            try {
                jga1 = (jga)list0.get(v1);
            }
            catch(Exception exception0) {
                exception1 = exception0;
                jga2 = jga0;
                goto label_18;
            }
            try {
                jga1.a(this.b);
                ++v1;
                jga0 = jga1;
                continue;
            }
            catch(Exception exception2) {
                exception1 = exception2;
                jga2 = jga1;
            }
        label_18:
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Error while applying EditCommand batch to buffer (length=" + this.b.c() + ", composition=" + this.b.e() + ", selection=" + jbk.f(this.b.d()) + "):");
            stringBuilder0.append('\n');
            ibpo.aM(list0, stringBuilder0, "\n", new jgc(jga2), 60);
            throw new RuntimeException(stringBuilder0.toString(), exception1);
        }
        iwj iwj0 = new iwj(this.b.toString());
        long v2 = this.b.d();
        jbk jbk1 = new jbk(v2);
        if(!jbk.k(this.a.c)) {
            jbk0 = jbk1;
        }
        jhk jhk0 = new jhk(iwj0, (jbk0 == null ? jbl.a(jbk.c(v2), jbk.d(v2)) : jbk0.b), this.b.e());
        this.a = jhk0;
        return jhk0;
    }
}

