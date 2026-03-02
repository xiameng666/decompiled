import android.app.PendingIntent;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class esqi {
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public gtnf F;
    public long G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public gged_interceptors N;
    public esqo O;
    public esqo P;
    public esqo Q;
    public esqo R;
    public gjua S;
    public PendingIntent T;
    public gjxs U;
    public int V;
    public int W;
    public byte[] X;
    public long Y;
    public boolean Z;
    public final String a;
    public boolean aa;
    public boolean ab;
    public String ac;
    public gjwt ad;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    private static final bboh ak;
    private final esqq al;
    private final esqq am;
    private final esqq an;
    private final esqq ao;
    public final List b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public int l;
    public esga m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public volatile int v;
    public boolean w;
    public esqg x;
    public CardInfo y;
    public String z;

    static {
        esqi.ak = bboh.b("TapAndPay", bbcu.aM);
    }

    public esqi() {
        this.a = UUID.randomUUID().toString();
        this.b = new ArrayList();
        this.ae = 2;
        this.af = 1;
        this.m = esga.k;
        this.p = -1L;
        this.q = -1L;
        this.r = -1L;
        this.s = -1L;
        this.t = -1L;
        this.ag = 1;
        this.z = "";
        this.F = gtnf.a;
        this.N = ggna.a;
        this.al = new esqq();
        this.am = new esqq();
        this.an = new esqq();
        this.ao = new esqq();
        this.ai = 1;
        this.V = 2;
        this.W = 2;
        this.aj = 4;
    }

    public final int a() {
        return this.b.size();
    }

    public final void b(esqf esqf0) {
        esvv esvv0;
        try {
            esvv0 = esvv.b(esqf0.a);
            switch(glwn.a(esvv0.a, esvv0.b)) {
                case 0x801A: {
                    break;
                }
                case 0x802A: {
                    goto label_13;
                }
                case 0x80A8: {
                    this.O = new esqo(this.al, esqf0.a, 7, esqf0.a.length - 1);
                    goto label_20;
                }
                case 0x80AE: {
                    goto label_18;
                }
                default: {
                    goto label_20;
                }
            }
        }
        catch(NullPointerException | BufferUnderflowException | IllegalArgumentException exception0) {
            a.ae(esqi.ak.i(), "Request APDU in wrong format", exception0);
            return;
        }
        if(!this.aa && !this.ab || esqo.c(this.ao.c, esvv0.c())) {
            if(this.ab) {
                byte[] arr_b = esvv0.c();
                this.R = esqo.b(this.ao, arr_b);
            }
            if(this.aa) {
                this.S = esyx.e(this.ao.c, esvv0.c());
                goto label_20;
            label_13:
                byte[] arr_b1 = esvv0.c();
                this.Q = esqo.a(this.an, arr_b1);
                goto label_20;
            label_18:
                byte[] arr_b2 = esvv0.c();
                this.P = esqo.a(this.am, arr_b2);
            }
        }
    label_20:
        byte[] arr_b3 = esqf0.b.d();
        esvf esvf0 = null;
        if(arr_b3.length > 0 && esqf0.b.a != 0) {
            try {
                esvj esvj0 = esvj.m(arr_b3);
                if((esvj0 instanceof esvf)) {
                    esvf0 = esvj0.l();
                }
            }
            catch(esvk unused_ex) {
            }
        }
        if(esvf0 != null) {
            try {
                gfsx gfsx0 = esvf0.e(new int[]{0xA5, 40760});
                if(gfsx0.i() && esvf0.b == 0x6F) {
                    esqi.d(((esvj)gfsx0.d()), this.al);
                }
                gfsx gfsx1 = esvf0.e(new int[]{140});
                if(gfsx1.i()) {
                    esqi.d(((esvj)gfsx1.d()), this.am);
                }
                gfsx gfsx2 = esvf0.e(new int[]{40809});
                if(gfsx2.i()) {
                    esqi.d(((esvj)gfsx2.d()), this.an);
                }
                if(this.ab) {
                    gfsx gfsx3 = esvf0.e(new int[]{0xA5, 0xBF0C, 0x9F3F});
                    if(gfsx3.i()) {
                        esqi.d(((esvj)gfsx3.d()), this.ao);
                    }
                }
            }
            catch(esvm esvm0) {
                a.ae(esqi.ak.i(), "Not valid tag when extracting DOLs", esvm0);
            }
        }
    }

    public final boolean c() {
        return this.p != -1L;
    }

    private static void d(esvj esvj0, esqq esqq0) {
        try {
            esqq0.b(esvj0.s());
        }
        catch(esvk unused_ex) {
            esvj0.o();
        }
    }
}

