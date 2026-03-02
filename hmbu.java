import java.util.ArrayList;

public final class hmbu extends hmbg {
    public hmgz a;
    public hmgz b;
    public hmgz c;
    public hmfk d;
    private static final hmgz e;
    private static final hmgz f;
    private static final hmgz g;
    private static final hmgz h;

    static {
        hmbu.e = new hmgz(0x77);
        hmbu.f = hmgz.e(new byte[]{-97, 97});
        hmbu.g = hmgz.e(new byte[]{-97, 0x60});
        hmbu.h = hmgz.e(new byte[]{-97, 54});
    }

    @Override  // hmbg
    public final void a(hmdj hmdj0) {
        ArrayList arrayList0 = new ArrayList();
        try {
            hmgz hmgz0 = this.a;
            if(hmgz0 != null) {
                arrayList0.add(new hmdk(hmbu.f, hmgz0));
            }
            hmgz hmgz1 = this.b;
            if(hmgz1 != null) {
                arrayList0.add(new hmdk(hmbu.g, hmgz1));
            }
            arrayList0.add(new hmdk(hmbu.h, this.c));
            hmfk hmfk0 = this.d;
            if(hmfk0 != null) {
                arrayList0.add(hmfk0.a());
            }
            super.d(new hmdk(hmbu.e, arrayList0));
        }
        catch(hmdm | hmdn | hmdl exception0) {
            hmhe.a().b(exception0, "Cannot parse TLV Object while building CCC Response", new Object[0]);
            throw new hmfm(hmfl.as);
        }
    }

    @Override
    public final String toString() {
        this.getClass();
        hmbb hmbb0 = hmhe.a();
        hmbb0.e();
        hmgz hmgz0 = this.a;
        if(hmgz0 != null) {
            hmgz0.i();
        }
        hmbb0.e();
        hmgz hmgz1 = this.b;
        if(hmgz1 != null) {
            hmgz1.i();
        }
        hmbb0.e();
        hmgz hmgz2 = this.c;
        if(hmgz2 != null) {
            hmgz2.i();
        }
        hmbb0.e();
        try {
            hmfk hmfk0 = this.d;
            if(hmfk0 != null) {
                hmfk0.b().h();
            }
            hmbb0.e();
        }
        catch(hmdl | hmdm | hmdn unused_ex) {
        }
        hmbb0.e();
        return "ComputeCryptographicChecksumResponseApdu";
    }
}

