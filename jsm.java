import java.util.ArrayList;
import java.util.Arrays;

public final class jsm {
    static int a;
    final ArrayList b;
    final int c;
    public int d;
    ArrayList e;
    private int f;

    static {
    }

    public jsm(int v) {
        this.b = new ArrayList();
        this.e = null;
        this.f = -1;
        int v1 = jsm.a;
        jsm.a = v1 + 1;
        this.c = v1;
        this.d = v;
    }

    public final int a(jrd jrd0, int v) {
        int v4;
        int v3;
        ArrayList arrayList0 = this.b;
        if(arrayList0.size() == 0) {
            return 0;
        }
        jro jro0 = ((jro)arrayList0.get(0)).V;
        jrd0.k();
        jro0.b(jrd0, false);
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            ((jro)arrayList0.get(v2)).b(jrd0, false);
        }
        if(v == 0 && ((jrp)jro0).av > 0) {
            jrl.a(((jrp)jro0), jrd0, arrayList0, 0);
        }
        if(v == 1 && ((jrp)jro0).aw > 0) {
            jrl.a(((jrp)jro0), jrd0, arrayList0, 1);
        }
        try {
            jrd0.j();
        }
        catch(Exception exception0) {
            System.err.println(exception0.toString() + "\n" + Arrays.toString(exception0.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            jsl jsl0 = new jsl(((jro)arrayList0.get(v1)));
            this.e.add(jsl0);
        }
        if(v == 0) {
            v3 = jrd.o(((jrp)jro0).K);
            v4 = jrd.o(((jrp)jro0).M);
            jrd0.k();
            return v4 - v3;
        }
        v3 = jrd.o(((jrp)jro0).L);
        v4 = jrd.o(((jrp)jro0).N);
        jrd0.k();
        return v4 - v3;
    }

    public final void b(ArrayList arrayList0) {
        int v = this.b.size();
        if(this.f != -1 && v > 0) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                jsm jsm0 = (jsm)arrayList0.get(v1);
                if(this.f == jsm0.c) {
                    this.c(this.d, jsm0);
                }
            }
        }
        if(v == 0) {
            arrayList0.remove(this);
        }
    }

    public final void c(int v, jsm jsm0) {
        ArrayList arrayList0 = this.b;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            jro jro0 = (jro)arrayList0.get(v2);
            jsm0.d(jro0);
            if(v == 0) {
                jro0.ap = jsm0.c;
            }
            else {
                jro0.aq = jsm0.c;
            }
        }
        this.f = jsm0.c;
    }

    public final boolean d(jro jro0) {
        ArrayList arrayList0 = this.b;
        if(arrayList0.contains(jro0)) {
            return false;
        }
        arrayList0.add(jro0);
        return true;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.d;
        if(v == 0) {
            s = "Horizontal";
        }
        else {
            s = v == 1 ? "Vertical" : "Both";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" [");
        stringBuilder0.append(this.c);
        stringBuilder0.append("] <");
        String s1 = stringBuilder0.toString();
        ArrayList arrayList0 = this.b;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            s1 = s1 + " " + ((jro)arrayList0.get(v2)).aj;
        }
        return s1 + " >";
    }
}

