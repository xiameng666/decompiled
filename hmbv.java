import java.util.ArrayList;

public final class hmbv extends hmbg {
    public hmfi a;
    public hmfg b;
    public hmgz c;
    public hmgz d;
    public hmdf e;
    public hmfk f;
    public boolean g;
    private static final hmgz h;
    private static final hmgz i;
    private static final hmgz j;

    static {
        hmbv.h = new hmgz(0x77);
        hmbv.i = hmgz.e(new byte[]{-97, 75});
        hmbv.j = hmgz.e(new byte[]{-97, 38});
    }

    public hmbv() {
        this.g = false;
    }

    @Override  // hmbg
    public final void a(hmdj hmdj0) {
        try {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(this.a.a());
            arrayList0.add(this.b.a());
            if(this.g) {
                arrayList0.add(new hmdk(hmbv.i, this.c));
            }
            else {
                arrayList0.add(new hmdk(hmbv.j, this.d));
            }
            arrayList0.add(this.e.c());
            hmfk hmfk0 = this.f;
            if(hmfk0 != null) {
                arrayList0.add(hmfk0.a());
            }
            super.d(new hmdk(hmbv.h, arrayList0));
        }
        catch(hmdm | hmdn | hmdl exception0) {
            hmhe.a().b(exception0, "Cannot parse TLV Object while building GenAC Response", new Object[0]);
            throw new hmfm(hmfl.as);
        }
    }

    @Override
    public final String toString() {
        this.getClass();
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        hmfi hmfi0 = this.a;
        if(hmfi0 != null) {
            hmfi0.b().h();
        }
        hmbb0.e();
        hmfg hmfg0 = this.b;
        if(hmfg0 != null) {
            hmfg0.b().i();
        }
        hmbb0.e();
        hmgz hmgz0 = this.c;
        if(hmgz0 != null) {
            hmgz0.i();
        }
        hmbb0.e();
        hmgz hmgz1 = this.d;
        if(hmgz1 != null) {
            hmgz1.i();
        }
        hmbb0.e();
        try {
            hmdf hmdf0 = this.e;
            if(hmdf0 != null) {
                ((hmgz)hmdf0.b).i();
            }
            hmbb0.e();
            hmfk hmfk0 = this.f;
            if(hmfk0 != null) {
                hmfk0.b().h();
            }
            hmbb0.e();
        }
        catch(hmdl | hmdm | hmdn unused_ex) {
        }
        hmbb0.e();
        return "GenerateACResponseApdu";
    }
}

