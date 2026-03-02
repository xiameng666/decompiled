import java.util.LinkedHashMap;

public final class hmbt extends hmbi {
    private static final hmgz h;

    static {
        hmbt.h = new hmgz("325041592E5359532E4444463031");
        hmbd.b(((byte)-92), hmbt.class);
    }

    public hmbt() {
        this.e(0);
        this.g(4);
        this.h(0);
        this.f(5, 16);
        this.j();
        this.c = null;
    }

    @Override  // hmbi
    protected final hmbe c(byte[] arr_b) {
        return new hmbs(arr_b);
    }

    @Override  // hmbi
    protected final hmbg d() {
        hmcs hmcs0 = this.f.a.p;
        hmct hmct0 = hmcs0.b;
        hmcr hmcr0 = hmct0.b;
        hmcr hmcr1 = hmct0.c;
        hmgi hmgi0 = this.f.b;
        hmgh hmgh0 = hmgh.a;
        hmgi0.c(hmgh0);
        hmgz hmgz0 = ((hmbs)this.e).c;
        hmgz hmgz1 = hmcr0.e;
        hmgz hmgz2 = hmcr1 == null ? null : hmcr1.e;
        int v = 4;
        if(!hmgz0.p()) {
            if(hmgz0.q(hmbt.h)) {
                v = 3;
            }
            else {
                hmda hmda0 = hmcs0.a;
                if(hmgz1 != null && !hmgz1.p() && hmgz0.q(hmgz1) && (hmda0.a || hmda0.f)) {
                    v = 1;
                }
                else if(hmgz2 != null && !hmgz2.p() && hmgz0.q(hmgz2) && hmda0.b) {
                    v = 2;
                }
            }
        }
        this.g.e();
        hmft hmft0 = (hmft)this.f.a.i;
        hmft0.a = v == 2;
        switch(v - 1) {
            case 0: {
                hmbg hmbg0 = this.l(hmct0.b);
                hmgi0.c(hmgh.b);
                return hmbg0;
            }
            case 1: {
                hmbg hmbg1 = this.l(hmct0.c);
                hmgi0.c(hmgh.b);
                return hmbg1;
            }
            case 2: {
                hmgi0.c(hmgh0);
                hmbg hmbg2 = new hmby();
                this.g.e();
                hmbg2.c = hmgz.d(hmct0.a);
                return hmbg2;
            }
            default: {
                hmgi0.c(hmgh0);
                throw new hmfn(hmfl.Z);
            }
        }
    }

    private final hmbg l(hmcr hmcr0) {
        hmbg hmbg0 = new hmby();
        this.g.e();
        LinkedHashMap linkedHashMap0 = hmcr0.a.b;
        hmbg0.a = hmcr0.a.a;
        hmbg0.b = linkedHashMap0;
        return hmbg0;
    }
}

