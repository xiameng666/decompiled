import java.util.LinkedHashMap;

public final class hmdj {
    public hmfh a;
    public hmfi b;
    public hmfk c;
    public hmfg d;
    private final LinkedHashMap e;
    private final hmbb f;

    public hmdj() {
        this.f = hmhe.a();
        this.e = new LinkedHashMap();
    }

    public final hmdk a() {
        return (hmdk)this.e.get(hmbw.a);
    }

    public final void b(hmdk hmdk0) {
        this.f.e();
        this.e.put(hmdk0.a, hmdk0);
    }

    public final void c(hmgz hmgz0) {
        this.a = new hmfh(hmgz0);
    }

    public final void d() {
        this.b = new hmfi();
    }

    public final void e() {
        this.c = null;
    }

    public final void f(int v, int v1, hmca hmca0) {
        hmfk hmfk0 = new hmfk();
        this.c = hmfk0;
        switch(v1 - 1) {
            case 0: {
                if(hmca0.a.contains(hmhq.a)) {
                    hmfk hmfk1 = this.c;
                    hmfk1.c(8);
                    hmbb hmbb1 = hmfk1.c;
                    ((hmgz)hmfk1.b).h();
                    hmbb1.e();
                    return;
                }
                break;
            }
            case 2: {
                if(v == 3 || v == 6) {
                    hmfk0.c(16);
                    hmbb hmbb2 = hmfk0.c;
                    ((hmgz)hmfk0.b).h();
                    hmbb2.e();
                    return;
                }
                break;
            }
            default: {
                hmfk0.c(1);
                hmbb hmbb0 = hmfk0.c;
                ((hmgz)hmfk0.b).h();
                hmbb0.e();
            }
        }
    }
}

