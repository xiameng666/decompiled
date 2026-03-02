import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.RegistrationInfo;

public class einq extends azts {
    public static final int a;

    static {
        Pair.create(new einv(), evrg.d(null));
    }

    public einq(Context context0) {
        super(context0, eimn.a, azsx.s, aztr_settings.a);
    }

    public einq(azxv azxv0) {
        super(azxv0, eimn.a, azsx.s, aztr_settings.a);
    }

    public final evql cA(int[] arr_v, String s, String s1) {
        azzc azzc0 = new azzc();
        azzc0.a = new einm(s, s1, arr_v);
        return this.iG(azzc0.a());
    }

    public final evql cB(String s, gobv gobv0) {
        azzc azzc0 = new azzc();
        azzc0.a = new eink(this, s, gobv0);
        azzc0.c = new Feature[]{eimg.h};
        azzc0.b = false;
        return this.iG(azzc0.a());
    }

    public final evql cC(String s, gobv gobv0, byte[] arr_b) {
        evql evql0 = this.cB(s, gobv0);
        eimy eimy0 = new eimy(this, s, arr_b);
        return evql0.f(gmap.a, eimy0);
    }

    public final evql cD(String s) {
        if(!this.cG()) {
            return einq.j();
        }
        azzc azzc0 = new azzc();
        azzc0.a = new eind(s);
        return this.iG(azzc0.a());
    }

    public final evql cE(String s, int v, String[] arr_s, byte[] arr_b, String s1) {
        azzc azzc0 = new azzc();
        azzc0.a = new eims(s, v, arr_s, arr_b, s1);
        return this.iG(azzc0.a());
    }

    public final void cF(String s, String s1) {
        this.h("com.google.android.gms.crisisalerts#com.google.android.gms", "*", new Flag[]{new Flag(s, s1, 2, 0)});
    }

    public final boolean cG() {
        return azpn.d.m(this.v) == 0;
    }

    public final evql cz(String s, int v, String[] arr_s, byte[] arr_b) {
        azzc azzc0 = new azzc();
        azzc0.a = new eine(s, v, arr_s, arr_b);
        return this.iG(azzc0.a());
    }

    public evql e(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new einf(s);
        return this.iG(azzc0.a());
    }

    public evql f(String s, String s1, String s2) {
        azzc azzc0 = new azzc();
        azzc0.a = new eimr(s, s1, s2);
        return this.iG(azzc0.a());
    }

    public evql g(String s, byte[] arr_b) {
        if(!this.cG()) {
            return einq.j();
        }
        azzc azzc0 = new azzc();
        azzc0.a = new eimx(s, arr_b);
        return this.iG(azzc0.a());
    }

    public evql h(String s, String s1, Flag[] arr_flag) {
        if(!this.cG()) {
            return einq.j();
        }
        azzc azzc0 = new azzc();
        azzc0.a = new eimq(s, s1, arr_flag);
        return this.iG(azzc0.a());
    }

    public evql i(String s, int v, String[] arr_s, int[] arr_v) {
        azzc azzc0 = new azzc();
        azzc0.a = new eimp(s, v, arr_s, arr_v);
        return this.iG(azzc0.a());
    }

    public static evql j() {
        return evrg.c(new aztb(new Status(16)));
    }

    public final evql k(RegistrationInfo[] arr_registrationInfo) {
        if(!this.cG()) {
            return einq.j();
        }
        azzc azzc0 = new azzc();
        azzc0.a = new eimt(arr_registrationInfo);
        return this.iG(azzc0.a());
    }

    public final evql l(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new eimw(s);
        return this.iG(azzc0.a());
    }

    public final evql m(String s) {
        azzc azzc0 = new azzc();
        azzc0.a = new eimu(s);
        return this.iG(azzc0.a());
    }

    @Deprecated
    public final evql n(String s, String s1) {
        return this.o(s, s1, "com.google.android.gms");
    }

    @Deprecated
    public final evql o(String s, String s1, String s2) {
        azzc azzc0 = new azzc();
        azzc0.a = new eimz(s, s1, s2);
        azzc0.c = new Feature[]{eimg.c};
        azzc0.b = false;
        return this.iG(azzc0.a());
    }
}

