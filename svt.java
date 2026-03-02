import java.util.LinkedHashMap;
import java.util.Map;

public abstract class svt {
    public abstract srt a();

    public abstract srt b();

    public abstract ssd d();

    public abstract ssr e();

    public abstract svt f(ssp arg1);

    public abstract sxd g(ssg arg1);

    public abstract sxd h(ssg arg1);

    public abstract sxd i(ssy arg1);

    public abstract sxd j(ssg arg1);

    public abstract Map k();

    public final int l(ssy ssy0) {
        int v = 0;
        for(Object object0: this.k().values()) {
            if(((stb)object0).d().a == ssy0.a) {
                return v;
            }
            ++v;
        }
        return -1;
    }

    public final sxd m() {
        sxd sxd0 = this.i(srw.a);
        return !sxd0.d() || ((stb)sxd0.b()).a().length != 1 ? sxd.a : new sxd(((stb)sxd0.b()).a());
    }

    public final boolean n(ssy ssy0) {
        return this.i(ssy0).d();
    }

    public final boolean o(Iterable iterable0) {
        int v = 0;
        for(Object object0: iterable0) {
            v |= this.p(((ssr)object0));
        }
        return v != 0;
    }

    public final boolean p(ssr ssr0) {
        byte[] arr_b;
        if(ssr0.e == ssq.b) {
            arr_b = sto.e(new byte[][]{sts.a(), ssr0.a()});
            return sto.d(this.e().a(), arr_b);
        }
        arr_b = ssr0.a();
        return sto.d(this.e().a(), arr_b);
    }

    public final boolean q(sxd sxd0) {
        ssy ssy0 = ssl.a;
        sxd sxd1 = this.i(ssy0);
        if(!sxd1.d()) {
            return true;
        }
        if(sxd0.d()) {
            stb stb0 = (stb)sxd0.b();
            ssy ssy1 = stb0.d();
            if(this.n(ssy1) && this.l(ssy1) < this.l(ssy0)) {
                return true;
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(this.k());
            linkedHashMap0.put(ssy1, stb0);
            this = new svr(linkedHashMap0);
        }
        return swq.b(this).length <= ((ssl)sxd1.b()).b;
    }

    public final boolean r() {
        return this.l(swv.a) == 2;
    }
}

