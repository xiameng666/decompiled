import java.util.ArrayList;

public final class bkw implements Runnable {
    public final bkx a;
    public final bky b;

    public bkw(bkx bkx0, bky bky0) {
        this.a = bkx0;
        this.b = bky0;
    }

    @Override
    public final void run() {
        bkx bkx0 = this.a;
        if(bkx0.a.get()) {
            blc blc0 = bkx0.b;
            Object object0 = this.b.a;
            if(object0 == bim.e || object0 == bim.c || object0 == bim.b || object0 == bim.a) {
                ((bvn)blc0).b(bvx.a);
                if(((bvn)blc0).d) {
                    ((bvn)blc0).d = false;
                    ((bvn)blc0).a();
                }
            }
            else if((object0 == bim.f || object0 == bim.g || object0 == bim.d) && !((bvn)blc0).d) {
                ((bvn)blc0).b(bvx.a);
                ArrayList arrayList0 = new ArrayList();
                ((bvn)blc0).c = bpt.f(bpt.g(bpf.a(jqy.a(new bvi(((bvn)blc0).a, arrayList0))), new bvj(((bvn)blc0)), bol.a()), new bvk(((bvn)blc0)), bol.a());
                bpt.j(((bvn)blc0).c, new bvl(((bvn)blc0), arrayList0, ((bvn)blc0).a), bol.a());
                ((bvn)blc0).d = true;
            }
        }
    }
}

