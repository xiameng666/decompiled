import java.util.ArrayList;

public final class hmde {
    public hmgz a;
    public hmgz b;
    private final hmdi c;
    private final hmdj d;
    private hmgz e;
    private hmgz f;
    private hmgz g;

    public hmde(hmdi hmdi0, hmdj hmdj0) {
        this.c = hmdi0;
        this.d = hmdj0;
    }

    public final hmgz a(int v) {
        hmgz hmgz0;
        this.e = this.d.a().c;
        this.f = this.d.d.b();
        this.g = this.d.a.a();
        if(this.e.b() != 2) {
            throw new hmdd("Application Interchange Profile has incorrect length: " + this.e.b());
        }
        if(this.f.b() != 2) {
            throw new hmdd("Application Transaction Counter has incorrect length: " + this.f.b());
        }
        if(this.g.b() != 6) {
            throw new hmdd("Card VerificationResults has incorrect length: " + this.g.b());
        }
        ArrayList arrayList0 = new ArrayList();
        if(v == 0) {
            throw null;
        }
        if(v - 1 == 0) {
            arrayList0 = new ArrayList();
            arrayList0.add(((hmdu)this.c.e(hmdu.class)).b);
            arrayList0.add(((hmds)this.c.e(hmds.class)).b);
            arrayList0.add(((hmep)this.c.e(hmep.class)).b);
            arrayList0.add(((hmev)this.c.e(hmev.class)).b);
            arrayList0.add(((hmex)this.c.e(hmex.class)).b);
            arrayList0.add(((hmez)this.c.e(hmez.class)).b);
            arrayList0.add(((hmfb)this.c.e(hmfb.class)).b);
            arrayList0.add(((hmfd)this.c.e(hmfd.class)).b);
            arrayList0.add(this.e);
            arrayList0.add(this.f);
            arrayList0.add(this.g);
        }
        else if(v - 1 == 1 || v - 1 == 2) {
            arrayList0 = new ArrayList();
            arrayList0.add(((hmdu)hmdi.o(hmdu.class)).b);
            arrayList0.add(((hmds)hmdi.o(hmds.class)).b);
            arrayList0.add(((hmep)hmdi.o(hmep.class)).b);
            arrayList0.add(((hmev)hmdi.o(hmev.class)).b);
            arrayList0.add(((hmex)hmdi.o(hmex.class)).b);
            arrayList0.add(((hmez)hmdi.o(hmez.class)).b);
            arrayList0.add(((hmfb)hmdi.o(hmfb.class)).b);
            arrayList0.add(((hmfd)this.c.e(hmfd.class)).b);
            arrayList0.add(this.e);
            arrayList0.add(this.f);
            arrayList0.add(this.g);
        }
        else if(v - 1 == 3) {
            arrayList0 = new ArrayList();
            try {
                hmgz0 = this.b.c(0, this.b.b());
            }
            catch(hmdl hmdl0) {
                throw new hmdd("Error during calculating amount authorized: " + hmdl0.getMessage());
            }
            hmgz0.v(this.a);
            hmgz0.r(0);
            arrayList0.add(hmgz0);
            arrayList0.add(((hmds)hmdi.o(hmds.class)).b);
            arrayList0.add(((hmep)hmdi.o(hmep.class)).b);
            arrayList0.add(((hmev)hmdi.o(hmev.class)).b);
            arrayList0.add(((hmex)hmdi.o(hmex.class)).b);
            arrayList0.add(((hmez)hmdi.o(hmez.class)).b);
            arrayList0.add(((hmfb)hmdi.o(hmfb.class)).b);
            arrayList0.add(((hmfd)this.c.e(hmfd.class)).b);
            arrayList0.add(this.e);
            arrayList0.add(this.f);
            arrayList0.add(this.g);
        }
        hmgz hmgz1 = hmgw.e(arrayList0);
        if(hmgz1.b() == 39) {
            return hmgz1;
        }
        hmgz1.k();
        throw new hmdd("Incomplete Cryptogram Input. Length: " + hmgz1.b() + ", Expected: 39");
    }
}

