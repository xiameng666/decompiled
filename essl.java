import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class essl extends esqa {
    public final String e;
    public essh f;
    private static final bboh g;
    private static final ggfp h;
    private final essj i;
    private final esrz j;
    private final byte[] k;
    private final espy l;
    private final JSONObject m;
    private final esqg n;
    private essa o;
    private boolean p;
    private boolean q;

    static {
        essl.g = bboh.b("TapAndPay", bbcu.aM);
        essl.h = ggfp.L(new essc(0x9F15, 2), new essc(0x9F4E, 0x20), new essc(0x9F02, 6));
    }

    public essl(essj essj0, esrz esrz0, String s, byte[] arr_b, espy espy0, CardInfo cardInfo0, InStoreCvmConfig inStoreCvmConfig0, String s1, int v, String s2) {
        super(cardInfo0, inStoreCvmConfig0, s1, s2);
        esqg esqg0 = new esqg();
        this.n = esqg0;
        this.i = essj0;
        this.j = esrz0;
        this.e = s;
        this.m = new JSONObject(s);
        this.k = arr_b;
        this.l = espy0;
        this.f = new esrw(3);
        esqg0.k = gjuf.j;
    }

    @Override  // espz
    public final esvw a(byte[] arr_b) {
        essa essa0;
        if(!hyua.a.d().k().b.contains(this.c)) {
            if(!this.p) {
                this.p = true;
                this.q = 1 ^ this.l.c();
            }
            if(this.q) {
                this.f = new esrw(5);
                return esvw.c(glwy.h(hyvu.b()));
            }
        }
        if(this.o == null) {
            try {
                essk essk0 = new essk(this.l);
                essa0 = this.i.c(this.j, this.m, this.k, essk0, essl.h);
            }
            catch(essi essi0) {
                throw new RuntimeException("Velocity failures should be handled by CanonicalBundleAdapter.", essi0);
            }
            this.o = essa0;
            this.f = new esrw(6);
            return esvw.b(this.o.d(arr_b));
        }
        return esvw.b(this.o.d(arr_b));
    }

    @Override  // espz
    public final esvs[] d() {
        try {
            ArrayList arrayList0 = new ArrayList(2);
            for(Object object0: esvj.m(this.j.a()).l().d(new int[]{0xA5, 0xBF0C}).l().f()) {
                esvj esvj0 = (esvj)object0;
                if(esvj0.b == 97) {
                    arrayList0.add(esvs.c(esvj0.l().d(new int[]{0x4F}).s()));
                }
            }
            return (esvs[])arrayList0.toArray(new esvs[0]);
        }
        catch(esvk esvk0) {
            a.ae(essl.g.i(), "Unexpected error", esvk0);
            return new esvs[0];
        }
    }

    @Override  // esqa
    public final int f() {
        switch(this.f.a()) {
            case 0: {
                return hyua.l() ? 0x2F : 0;
            }
            case 1: {
                return -1;
            }
            case 4: {
                return 29;
            }
            case 5: {
                return 19;
            }
            case 3: 
            case 6: {
                return 11;
            }
            case 7: {
                return 26;
            }
            default: {
                return 0;
            }
        }
    }

    @Override  // esqa
    public final espy h() {
        return this.l;
    }

    @Override  // esqa
    public final esqg i() {
        return this.n;
    }

    @Override  // esqa
    public final List j() {
        return esvb.b(this.j.a());
    }

    @Override  // esqa
    public final void k() {
        essa essa0 = this.o;
        if(essa0 != null) {
            this.f = essa0.a();
        }
        this.n.h = bbqr.c(this.f.b());
    }

    @Override  // esqa
    public final void l() {
    }
}

