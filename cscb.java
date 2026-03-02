import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;
import j..util.Optional;

public final class cscb extends du {
    public xob a;
    private TextView ag;
    private TextView ah;
    private Button ai;
    private Button aj;
    private String ak;
    public Bundle b;
    private static final bboh c;
    private View d;

    static {
        cscb.c = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cscb() {
        this.ak = "uninitialized";
    }

    // Detected as a lambda impl.
    public static void A(xob xob0, Bundle bundle0, int v, hhct hhct0, String s) {
        cscb cscb0 = new cscb();
        bundle0.putInt("ESIM_ERROR_KEY", hhct0.es);
        bundle0.putString("ESIM_ERROR_SESSION_KEY", s);
        cscb0.setArguments(bundle0);
        ca ca0 = new ca(xob0.getSupportFragmentManager());
        ca0.C();
        ca0.z(v, cscb0, "ESIM_ERROR_KEY");
        ca0.w(null);
        ca0.a();
        xob0.getSupportFragmentManager().aq();
    }

    public static void B(xob xob0, Bundle bundle0, hhct hhct0, String s) {
        new clht(Looper.getMainLooper()).post(() -> {
            cscb cscb0 = new cscb();
            bundle0.putInt("ESIM_ERROR_KEY", hhct0.es);
            bundle0.putString("ESIM_ERROR_SESSION_KEY", s);
            cscb0.setArguments(bundle0);
            ca ca0 = new ca(xob0.getSupportFragmentManager());
            ca0.C();
            ca0.z(0x7F0B0FCE, cscb0, "ESIM_ERROR_KEY");  // id:container
            ca0.w(null);
            ca0.a();
            xob0.getSupportFragmentManager().aq();
        });
    }

    final void C(String s, CharSequence charSequence0, int v, String s1) {
        this.F(s, charSequence0, this.getString(v), s1);
    }

    private final SpannableString D() {
        String s = this.b.getString("esim_carrier_help");
        if(s == null) {
            ((ggtj)cscb.c.j()).x("Could not link to eSIM FAQ page.");
            return new SpannableString(this.getString(0x7F150F69));  // string:esim_error_faq_description " Head to our FAQ page for more details. "
        }
        this.ah.setMovementMethod(LinkMovementMethod.getInstance());
        return cslm.b(((SpannedString)this.a.getText(0x7F150F69)), new URLSpan(s), "link");  // string:esim_error_faq_description " Head to our FAQ page for more details. "
    }

    private final qhp E(String s) {
        try {
            Bundle bundle0 = this.b;
            hftc hftc0 = hftc.a();
            return (qhp)hfxk.d(bundle0, s, ((MessageLite)qhp.a), hftc0);
        }
        catch(hfur | NullPointerException exception0) {
            a.ae(cscb.c.j(), "Failed to parse eSIM error page config", exception0);
            return qhp.a;
        }
    }

    private final void F(String s, CharSequence charSequence0, String s1, String s2) {
        this.ag.setText(s);
        if(charSequence0 != null) {
            this.ah.setVisibility(0);
            this.ah.setText(charSequence0);
        }
        this.ai.setText(s1);
        if(s2 != null) {
            this.aj.setVisibility(0);
            this.aj.setText(s2);
        }
    }

    private final void G(String s) {
        if(!this.b.getBoolean("esim_link_to_store")) {
            return;
        }
        Button button0 = (Button)this.d.findViewById(0x7F0B129E);  // id:error_second_button
        button0.setText(this.getString(0x7F150F6D, new Object[]{s}));  // string:esim_find_store "Find a %s store"
        button0.setContentDescription(this.getString(0x7F150F6E, new Object[]{s}));  // string:esim_find_store_accessibility "Find the closest %s store near you"
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.a = (xob)context0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        hhct hhct0;
        View view0 = layoutInflater0.inflate(0x7F0E0336, viewGroup0, false);  // layout:esim_error_fragment
        this.d = view0;
        this.ag = (TextView)view0.findViewById(0x7F0B12A6);  // id:error_title_portrait
        this.ah = (TextView)this.d.findViewById(0x7F0B1287);  // id:error_description_portrait
        this.ai = (Button)this.d.findViewById(0x7F0B1284);  // id:error_default_action_button
        this.aj = (Button)this.d.findViewById(0x7F0B129E);  // id:error_second_button
        Button button0 = (Button)this.d.findViewById(0x7F0B12A3);  // id:error_third_button
        Bundle bundle1 = new Bundle();
        this.b = bundle1;
        try {
            if(bundle0 == null) {
                Bundle bundle3 = this.getArguments();
                batl.s(bundle3);
                this.b = bundle3;
            }
            else {
                Bundle bundle2 = bundle0.getBundle("esim_bundle_args");
                batl.s(bundle2);
                bundle1.putAll(bundle2);
            }
            switch(this.b.getInt("ESIM_ERROR_KEY")) {
                case 0: {
                    hhct0 = hhct.a;
                    break;
                }
                case 1: {
                    hhct0 = hhct.b;
                    break;
                }
                case 2: {
                    hhct0 = hhct.d;
                    break;
                }
                case 3: {
                    hhct0 = hhct.f;
                    break;
                }
                case 4: {
                    hhct0 = hhct.h;
                    break;
                }
                case 5: {
                    hhct0 = hhct.i;
                    break;
                }
                case 6: {
                    hhct0 = hhct.j;
                    break;
                }
                case 7: {
                    hhct0 = hhct.k;
                    break;
                }
                case 8: {
                    hhct0 = hhct.l;
                    break;
                }
                case 9: {
                    hhct0 = hhct.m;
                    break;
                }
                case 10: {
                    hhct0 = hhct.n;
                    break;
                }
                case 11: {
                    hhct0 = hhct.o;
                    break;
                }
                case 12: {
                    hhct0 = hhct.p;
                    break;
                }
                case 13: {
                    hhct0 = hhct.q;
                    break;
                }
                case 14: {
                    hhct0 = hhct.r;
                    break;
                }
                case 15: {
                    hhct0 = hhct.s;
                    break;
                }
                case 16: {
                    hhct0 = hhct.t;
                    break;
                }
                case 17: {
                    hhct0 = hhct.u;
                    break;
                }
                case 18: {
                    hhct0 = hhct.v;
                    break;
                }
                case 19: {
                    hhct0 = hhct.x;
                    break;
                }
                case 20: {
                    hhct0 = hhct.y;
                    break;
                }
                case 21: {
                    hhct0 = hhct.z;
                    break;
                }
                case 22: {
                    hhct0 = hhct.A;
                    break;
                }
                case 23: {
                    hhct0 = hhct.B;
                    break;
                }
                case 24: {
                    hhct0 = hhct.C;
                    break;
                }
                case 25: {
                    hhct0 = hhct.D;
                    break;
                }
                case 26: {
                    hhct0 = hhct.E;
                    break;
                }
                case 27: {
                    hhct0 = hhct.J;
                    break;
                }
                case 28: {
                    hhct0 = hhct.ad;
                    break;
                }
                case 29: {
                    hhct0 = hhct.ae;
                    break;
                }
                case 30: {
                    hhct0 = hhct.af;
                    break;
                }
                case 0x1F: {
                    hhct0 = hhct.ag;
                    break;
                }
                case 0x20: {
                    hhct0 = hhct.ah;
                    break;
                }
                case 33: {
                    hhct0 = hhct.ai;
                    break;
                }
                case 34: {
                    hhct0 = hhct.aj;
                    break;
                }
                case 35: {
                    hhct0 = hhct.ak;
                    break;
                }
                case 36: {
                    hhct0 = hhct.at;
                    break;
                }
                case 37: {
                    hhct0 = hhct.au;
                    break;
                }
                case 38: {
                    hhct0 = hhct.av;
                    break;
                }
                case 39: {
                    hhct0 = hhct.aw;
                    break;
                }
                case 40: {
                    hhct0 = hhct.ax;
                    break;
                }
                case 41: {
                    hhct0 = hhct.ay;
                    break;
                }
                case 42: {
                    hhct0 = hhct.az;
                    break;
                }
                case 43: {
                    hhct0 = hhct.aA;
                    break;
                }
                case 44: {
                    hhct0 = hhct.aB;
                    break;
                }
                case 45: {
                    hhct0 = hhct.aC;
                    break;
                }
                case 46: {
                    hhct0 = hhct.aD;
                    break;
                }
                case 0x2F: {
                    hhct0 = hhct.aE;
                    break;
                }
                case 0x30: {
                    hhct0 = hhct.aF;
                    break;
                }
                case 49: {
                    hhct0 = hhct.aG;
                    break;
                }
                case 50: {
                    hhct0 = hhct.aH;
                    break;
                }
                case 51: {
                    hhct0 = hhct.aI;
                    break;
                }
                case 52: {
                    hhct0 = hhct.aJ;
                    break;
                }
                case 53: {
                    hhct0 = hhct.aK;
                    break;
                }
                case 54: {
                    hhct0 = hhct.aL;
                    break;
                }
                case 55: {
                    hhct0 = hhct.aM;
                    break;
                }
                case 56: {
                    hhct0 = hhct.aN;
                    break;
                }
                case 57: {
                    hhct0 = hhct.aO;
                    break;
                }
                case 58: {
                    hhct0 = hhct.aP;
                    break;
                }
                case 59: {
                    hhct0 = hhct.aQ;
                    break;
                }
                case 60: {
                    hhct0 = hhct.aR;
                    break;
                }
                case 61: {
                    hhct0 = hhct.aS;
                    break;
                }
                case 62: {
                    hhct0 = hhct.aT;
                    break;
                }
                case 0x3F: {
                    hhct0 = hhct.aU;
                    break;
                }
                case 0x40: {
                    hhct0 = hhct.aV;
                    break;
                }
                case 65: {
                    hhct0 = hhct.aW;
                    break;
                }
                case 66: {
                    hhct0 = hhct.aX;
                    break;
                }
                case 67: {
                    hhct0 = hhct.aY;
                    break;
                }
                case 68: {
                    hhct0 = hhct.aZ;
                    break;
                }
                case 69: {
                    hhct0 = hhct.ba;
                    break;
                }
                case 70: {
                    hhct0 = hhct.be;
                    break;
                }
                case 71: {
                    hhct0 = hhct.bf;
                    break;
                }
                case 72: {
                    hhct0 = hhct.bg;
                    break;
                }
                case 73: {
                    hhct0 = hhct.K;
                    break;
                }
                case 74: {
                    hhct0 = hhct.bh;
                    break;
                }
                case 75: {
                    hhct0 = hhct.bi;
                    break;
                }
                case 76: {
                    hhct0 = hhct.bj;
                    break;
                }
                case 77: {
                    hhct0 = hhct.bk;
                    break;
                }
                case 78: {
                    hhct0 = hhct.bl;
                    break;
                }
                case 0x4F: {
                    hhct0 = hhct.bm;
                    break;
                }
                case 80: {
                    hhct0 = hhct.bn;
                    break;
                }
                case 81: {
                    hhct0 = hhct.bo;
                    break;
                }
                case 82: {
                    hhct0 = hhct.bp;
                    break;
                }
                case 83: {
                    hhct0 = hhct.bq;
                    break;
                }
                case 84: {
                    hhct0 = hhct.L;
                    break;
                }
                case 85: {
                    hhct0 = hhct.M;
                    break;
                }
                case 86: {
                    hhct0 = hhct.N;
                    break;
                }
                case 87: {
                    hhct0 = hhct.O;
                    break;
                }
                case 88: {
                    hhct0 = hhct.br;
                    break;
                }
                case 89: {
                    hhct0 = hhct.P;
                    break;
                }
                case 90: {
                    hhct0 = hhct.Q;
                    break;
                }
                case 91: {
                    hhct0 = hhct.bs;
                    break;
                }
                case 92: {
                    hhct0 = hhct.bC;
                    break;
                }
                case 93: {
                    hhct0 = hhct.bD;
                    break;
                }
                case 94: {
                    hhct0 = hhct.bE;
                    break;
                }
                case 0x5F: {
                    hhct0 = hhct.bF;
                    break;
                }
                case 0x60: {
                    hhct0 = hhct.R;
                    break;
                }
                case 97: {
                    hhct0 = hhct.w;
                    break;
                }
                case 100: {
                    hhct0 = hhct.bt;
                    break;
                }
                case 101: {
                    hhct0 = hhct.bu;
                    break;
                }
                case 102: {
                    hhct0 = hhct.bv;
                    break;
                }
                case 103: {
                    hhct0 = hhct.bw;
                    break;
                }
                case 104: {
                    hhct0 = hhct.bx;
                    break;
                }
                case 105: {
                    hhct0 = hhct.by;
                    break;
                }
                case 106: {
                    hhct0 = hhct.bz;
                    break;
                }
                case 107: {
                    hhct0 = hhct.bA;
                    break;
                }
                case 108: {
                    hhct0 = hhct.bB;
                    break;
                }
                case 120: {
                    hhct0 = hhct.al;
                    break;
                }
                case 0x79: {
                    hhct0 = hhct.am;
                    break;
                }
                case 0x7A: {
                    hhct0 = hhct.an;
                    break;
                }
                case 0x7B: {
                    hhct0 = hhct.ao;
                    break;
                }
                case 0x7C: {
                    hhct0 = hhct.ap;
                    break;
                }
                case 0x7D: {
                    hhct0 = hhct.aq;
                    break;
                }
                case 0x7E: {
                    hhct0 = hhct.ar;
                    break;
                }
                case 0x7F: {
                    hhct0 = hhct.as;
                    break;
                }
                case 140: {
                    hhct0 = hhct.bG;
                    break;
                }
                case 0x8D: {
                    hhct0 = hhct.bH;
                    break;
                }
                case 0x8E: {
                    hhct0 = hhct.bI;
                    break;
                }
                case 0x8F: {
                    hhct0 = hhct.bJ;
                    break;
                }
                case 0x90: {
                    hhct0 = hhct.bK;
                    break;
                }
                case 0x91: {
                    hhct0 = hhct.bL;
                    break;
                }
                case 0x92: {
                    hhct0 = hhct.bM;
                    break;
                }
                case 0x93: {
                    hhct0 = hhct.bN;
                    break;
                }
                case 0x94: {
                    hhct0 = hhct.bO;
                    break;
                }
                case 0x95: {
                    hhct0 = hhct.bP;
                    break;
                }
                case 150: {
                    hhct0 = hhct.bQ;
                    break;
                }
                case 0x97: {
                    hhct0 = hhct.bR;
                    break;
                }
                case 0x98: {
                    hhct0 = hhct.bS;
                    break;
                }
                case 0x99: {
                    hhct0 = hhct.bT;
                    break;
                }
                case 0x9A: {
                    hhct0 = hhct.bY;
                    break;
                }
                case 0x9B: {
                    hhct0 = hhct.bZ;
                    break;
                }
                case 0xA0: {
                    hhct0 = hhct.ca;
                    break;
                }
                case 0xA1: {
                    hhct0 = hhct.cb;
                    break;
                }
                case 0xA2: {
                    hhct0 = hhct.cc;
                    break;
                }
                case 0xA3: {
                    hhct0 = hhct.cd;
                    break;
                }
                case 170: {
                    hhct0 = hhct.ce;
                    break;
                }
                case 0xAB: {
                    hhct0 = hhct.cf;
                    break;
                }
                case 0xAC: {
                    hhct0 = hhct.cg;
                    break;
                }
                case 190: {
                    hhct0 = hhct.ch;
                    break;
                }
                case 0xBF: {
                    hhct0 = hhct.ci;
                    break;
                }
                case 0xC0: {
                    hhct0 = hhct.cj;
                    break;
                }
                case 0xC1: {
                    hhct0 = hhct.ck;
                    break;
                }
                case 0xC2: {
                    hhct0 = hhct.cl;
                    break;
                }
                case 0xC3: {
                    hhct0 = hhct.cm;
                    break;
                }
                case 0xC4: {
                    hhct0 = hhct.cn;
                    break;
                }
                case 200: {
                    hhct0 = hhct.co;
                    break;
                }
                case 201: {
                    hhct0 = hhct.cp;
                    break;
                }
                case 202: {
                    hhct0 = hhct.cq;
                    break;
                }
                case 203: {
                    hhct0 = hhct.cs;
                    break;
                }
                case 204: {
                    hhct0 = hhct.ct;
                    break;
                }
                case 205: {
                    hhct0 = hhct.cu;
                    break;
                }
                case 206: {
                    hhct0 = hhct.cv;
                    break;
                }
                case 0xCF: {
                    hhct0 = hhct.cw;
                    break;
                }
                case 0xD0: {
                    hhct0 = hhct.cx;
                    break;
                }
                case 209: {
                    hhct0 = hhct.cr;
                    break;
                }
                case 220: {
                    hhct0 = hhct.S;
                    break;
                }
                case 0xDD: {
                    hhct0 = hhct.T;
                    break;
                }
                case 0xDE: {
                    hhct0 = hhct.U;
                    break;
                }
                case 0xDF: {
                    hhct0 = hhct.V;
                    break;
                }
                case 0xE0: {
                    hhct0 = hhct.W;
                    break;
                }
                case 0xE1: {
                    hhct0 = hhct.X;
                    break;
                }
                case 0xE2: {
                    hhct0 = hhct.Y;
                    break;
                }
                case 0xE3: {
                    hhct0 = hhct.Z;
                    break;
                }
                case 0xE4: {
                    hhct0 = hhct.aa;
                    break;
                }
                case 0xE5: {
                    hhct0 = hhct.ab;
                    break;
                }
                case 230: {
                    hhct0 = hhct.ac;
                    break;
                }
                case 0xEB: {
                    hhct0 = hhct.F;
                    break;
                }
                case 0xEC: {
                    hhct0 = hhct.G;
                    break;
                }
                case 0xED: {
                    hhct0 = hhct.H;
                    break;
                }
                case 0xEE: {
                    hhct0 = hhct.I;
                    break;
                }
                case 0xF0: {
                    hhct0 = hhct.cy;
                    break;
                }
                case 0xF1: {
                    hhct0 = hhct.cz;
                    break;
                }
                case 0xF2: {
                    hhct0 = hhct.cA;
                    break;
                }
                case 0xF3: {
                    hhct0 = hhct.cB;
                    break;
                }
                case 0xF4: {
                    hhct0 = hhct.cC;
                    break;
                }
                case 0xF5: {
                    hhct0 = hhct.cD;
                    break;
                }
                case 0xF6: {
                    hhct0 = hhct.cE;
                    break;
                }
                case 0xF7: {
                    hhct0 = hhct.cF;
                    break;
                }
                case 0xF8: {
                    hhct0 = hhct.cG;
                    break;
                }
                case 0xF9: {
                    hhct0 = hhct.cH;
                    break;
                }
                case 260: {
                    hhct0 = hhct.cI;
                    break;
                }
                case 0x105: {
                    hhct0 = hhct.cJ;
                    break;
                }
                case 0x106: {
                    hhct0 = hhct.cL;
                    break;
                }
                case 0x107: {
                    hhct0 = hhct.cM;
                    break;
                }
                case 0x108: {
                    hhct0 = hhct.cN;
                    break;
                }
                case 0x109: {
                    hhct0 = hhct.cO;
                    break;
                }
                case 0x10A: {
                    hhct0 = hhct.cK;
                    break;
                }
                case 0x10B: {
                    hhct0 = hhct.cP;
                    break;
                }
                case 280: {
                    hhct0 = hhct.cQ;
                    break;
                }
                case 281: {
                    hhct0 = hhct.cR;
                    break;
                }
                case 282: {
                    hhct0 = hhct.cS;
                    break;
                }
                case 283: {
                    hhct0 = hhct.cT;
                    break;
                }
                case 300: {
                    hhct0 = hhct.cX;
                    break;
                }
                case 301: {
                    hhct0 = hhct.cY;
                    break;
                }
                case 302: {
                    hhct0 = hhct.cZ;
                    break;
                }
                case 303: {
                    hhct0 = hhct.da;
                    break;
                }
                case 304: {
                    hhct0 = hhct.db;
                    break;
                }
                case 305: {
                    hhct0 = hhct.dc;
                    break;
                }
                case 306: {
                    hhct0 = hhct.dd;
                    break;
                }
                case 307: {
                    hhct0 = hhct.de;
                    break;
                }
                case 308: {
                    hhct0 = hhct.df;
                    break;
                }
                case 320: {
                    hhct0 = hhct.dg;
                    break;
                }
                case 321: {
                    hhct0 = hhct.dh;
                    break;
                }
                case 323: {
                    hhct0 = hhct.dj;
                    break;
                }
                case 324: {
                    hhct0 = hhct.dk;
                    break;
                }
                case 325: {
                    hhct0 = hhct.dl;
                    break;
                }
                case 326: {
                    hhct0 = hhct.dm;
                    break;
                }
                case 327: {
                    hhct0 = hhct.dn;
                    break;
                }
                case 328: {
                    hhct0 = hhct.do;
                    break;
                }
                case 329: {
                    hhct0 = hhct.dp;
                    break;
                }
                case 330: {
                    hhct0 = hhct.dw;
                    break;
                }
                case 331: {
                    hhct0 = hhct.dx;
                    break;
                }
                case 332: {
                    hhct0 = hhct.dy;
                    break;
                }
                case 333: {
                    hhct0 = hhct.dz;
                    break;
                }
                case 334: {
                    hhct0 = hhct.dA;
                    break;
                }
                case 0x14F: {
                    hhct0 = hhct.dB;
                    break;
                }
                case 0x150: {
                    hhct0 = hhct.dC;
                    break;
                }
                case 337: {
                    hhct0 = hhct.dD;
                    break;
                }
                case 338: {
                    hhct0 = hhct.dE;
                    break;
                }
                case 339: {
                    hhct0 = hhct.dF;
                    break;
                }
                case 340: {
                    hhct0 = hhct.dG;
                    break;
                }
                case 341: {
                    hhct0 = hhct.eq;
                    break;
                }
                case 342: {
                    hhct0 = hhct.dK;
                    break;
                }
                case 343: {
                    hhct0 = hhct.dL;
                    break;
                }
                case 344: {
                    hhct0 = hhct.dM;
                    break;
                }
                case 345: {
                    hhct0 = hhct.dN;
                    break;
                }
                case 346: {
                    hhct0 = hhct.ea;
                    break;
                }
                case 347: {
                    hhct0 = hhct.eb;
                    break;
                }
                case 348: {
                    hhct0 = hhct.ed;
                    break;
                }
                case 349: {
                    hhct0 = hhct.ee;
                    break;
                }
                case 350: {
                    hhct0 = hhct.ef;
                    break;
                }
                case 0x15F: {
                    hhct0 = hhct.eg;
                    break;
                }
                case 0x160: {
                    hhct0 = hhct.eh;
                    break;
                }
                case 353: {
                    hhct0 = hhct.ei;
                    break;
                }
                case 354: {
                    hhct0 = hhct.el;
                    break;
                }
                case 355: {
                    hhct0 = hhct.em;
                    break;
                }
                case 356: {
                    hhct0 = hhct.en;
                    break;
                }
                case 357: {
                    hhct0 = hhct.eo;
                    break;
                }
                case 358: {
                    hhct0 = hhct.ep;
                    break;
                }
                case 359: {
                    hhct0 = hhct.dH;
                    break;
                }
                case 360: {
                    hhct0 = hhct.dO;
                    break;
                }
                case 361: {
                    hhct0 = hhct.dP;
                    break;
                }
                case 362: {
                    hhct0 = hhct.dR;
                    break;
                }
                case 363: {
                    hhct0 = hhct.dS;
                    break;
                }
                case 364: {
                    hhct0 = hhct.dT;
                    break;
                }
                case 365: {
                    hhct0 = hhct.dU;
                    break;
                }
                case 366: {
                    hhct0 = hhct.dV;
                    break;
                }
                case 0x16F: {
                    hhct0 = hhct.dX;
                    break;
                }
                case 0x170: {
                    hhct0 = hhct.dY;
                    break;
                }
                case 369: {
                    hhct0 = hhct.dZ;
                    break;
                }
                case 370: {
                    hhct0 = hhct.dI;
                    break;
                }
                case 371: {
                    hhct0 = hhct.dJ;
                    break;
                }
                case 372: {
                    hhct0 = hhct.ej;
                    break;
                }
                case 373: {
                    hhct0 = hhct.ek;
                    break;
                }
                case 374: {
                    hhct0 = hhct.er;
                    break;
                }
                case 375: {
                    hhct0 = hhct.dQ;
                    break;
                }
                case 376: {
                    hhct0 = hhct.dW;
                    break;
                }
                case 377: {
                    hhct0 = hhct.ec;
                    break;
                }
                case 400: {
                    hhct0 = hhct.dq;
                    break;
                }
                case 401: {
                    hhct0 = hhct.dr;
                    break;
                }
                case 402: {
                    hhct0 = hhct.di;
                    break;
                }
                case 403: {
                    hhct0 = hhct.ds;
                    break;
                }
                case 404: {
                    hhct0 = hhct.dt;
                    break;
                }
                case 405: {
                    hhct0 = hhct.du;
                    break;
                }
                case 406: {
                    hhct0 = hhct.dv;
                    break;
                }
                case 455: {
                    hhct0 = hhct.bb;
                    break;
                }
                case 456: {
                    hhct0 = hhct.bc;
                    break;
                }
                case 457: {
                    hhct0 = hhct.bd;
                    break;
                }
                case 458: {
                    hhct0 = hhct.c;
                    break;
                }
                case 459: {
                    hhct0 = hhct.e;
                    break;
                }
                case 460: {
                    hhct0 = hhct.g;
                    break;
                }
                case 461: {
                    hhct0 = hhct.bU;
                    break;
                }
                case 462: {
                    hhct0 = hhct.bV;
                    break;
                }
                case 0x1CF: {
                    hhct0 = hhct.bW;
                    break;
                }
                case 465: {
                    hhct0 = hhct.bX;
                    break;
                }
                case 466: {
                    hhct0 = hhct.cU;
                    break;
                }
                case 467: {
                    hhct0 = hhct.cV;
                    break;
                }
                case 468: {
                    hhct0 = hhct.cW;
                    break;
                }
                default: {
                    hhct0 = null;
                }
            }
            if(hhct0 == null) {
                hhct0 = hhct.dx;
            }
            String s = this.b.getString("ESIM_ERROR_SESSION_KEY");
            batl.s(s);
            this.ak = s;
            this.z(hhct0);
        }
        catch(NullPointerException unused_ex) {
            ((ggtj)cscb.c.j()).x("EsimErrorFragment got null argument.");
            this.z(hhct.dx);
        }
        return this.d;
    }

    @Override  // du
    public final void onDestroyView() {
        super.onDestroyView();
        View view0 = this.a.findViewById(0x7F0B0FE5);  // id:content_layout
        if(view0 != null) {
            view0.setVisibility(0);
        }
    }

    // Detected as a lambda impl.
    public final void y() {
        Optional optional0 = Optional.ofNullable(this.b.getString("esim_carrier_support_url"));
        Optional optional1 = Optional.ofNullable(this.b.getString("esim_carrier_support"));
        if(optional0.isEmpty() && optional1.isEmpty()) {
            this.z(hhct.dx);
            return;
        }
        if(hvlq.q() && optional0.isPresent()) {
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String)optional0.get()))));
            return;
        }
        optional1.get();
        Intent intent0 = new Intent("android.intent.action.DIAL");
        intent0.setData(Uri.parse(("tel:" + ((String)optional1.get()))));
        this.startActivity(intent0);
    }

    public final void z(hhct hhct0) {
        hhct hhct1 = hvlq.m() ? hhct0 : hhct.dy;
        String s = null;
        switch(hhct1.ordinal()) {
            case 0xE9: {
                ((ImageView)this.d.findViewById(0x7F0B1299)).setVisibility(8);  // id:error_picture_portrait
                String s1 = this.b.getString("esim_carrier_name");
                this.C(this.getString(0x7F150F5E), this.getString(0x7F150F5F, new Object[]{s1}), 0x7F150582, this.getString(0x7F15057D));  // string:esim_error_account_exists "You look familiar!"
                this.ai.setOnClickListener(new csbg(this));
                this.aj.setOnClickListener(new csbh(this));
                MobileDataPlanDetailChimeraActivity.m(this, this.a, this.b);
                break;
            }
            case 0xEA: {
                String s2 = this.b.getString("esim_carrier_name");
                SpannableString spannableString0 = this.D();
                String s3 = this.getString(0x7F15057D);  // string:button_close "Close"
                this.ai.setOnClickListener(new csbf(this));
                if(hvlq.q() && this.b.containsKey("ESIM_ACCOUNT_ERROR_CONFIG")) {
                    qhp qhp0 = this.E("ESIM_ACCOUNT_ERROR_CONFIG");
                    if(qhp0.b) {
                        s3 = this.getString(0x7F150F53, new Object[]{s2});  // string:esim_contact_carrier "Contact %s support"
                        this.ai.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                            Optional optional0 = Optional.ofNullable(this.b.getString("esim_carrier_support_url"));
                            Optional optional1 = Optional.ofNullable(this.b.getString("esim_carrier_support"));
                            if(optional0.isEmpty() && optional1.isEmpty()) {
                                this.z(hhct.dx);
                                return;
                            }
                            if(hvlq.q() && optional0.isPresent()) {
                                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String)optional0.get()))));
                                return;
                            }
                            optional1.get();
                            Intent intent0 = new Intent("android.intent.action.DIAL");
                            intent0.setData(Uri.parse(("tel:" + ((String)optional1.get()))));
                            this.startActivity(intent0);
                        });
                        if(this.b.getBoolean("esim_link_to_store")) {
                            s3 = this.getString(0x7F150F6D, new Object[]{s2});  // string:esim_find_store "Find a %s store"
                            this.ai.setContentDescription(this.getString(0x7F150F6E, new Object[]{s2}));  // string:esim_find_store_accessibility "Find the closest %s store near you"
                        }
                    }
                    if(qhp0.c) {
                        spannableString0 = null;
                    }
                }
                this.F(this.getString(0x7F150F64, new Object[]{s2}), spannableString0, s3, null);  // string:esim_error_create_account "Can\'t set up %s account"
                MobileDataPlanDetailChimeraActivity.m(this, this.a, this.b);
                break;
            }
            case 0xEC: {
                String s8 = this.b.getString("esim_carrier_name");
                this.C(this.getString(0x7F150F60), this.getString(0x7F150F61), 0x7F15058C, this.getString(0x7F150F53, new Object[]{s8}));  // string:esim_error_activation "Your eSIM install failed"
                this.ai.setOnClickListener(new csbi(this));
                this.aj.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                    Optional optional0 = Optional.ofNullable(this.b.getString("esim_carrier_support_url"));
                    Optional optional1 = Optional.ofNullable(this.b.getString("esim_carrier_support"));
                    if(optional0.isEmpty() && optional1.isEmpty()) {
                        this.z(hhct.dx);
                        return;
                    }
                    if(hvlq.q() && optional0.isPresent()) {
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String)optional0.get()))));
                        return;
                    }
                    optional1.get();
                    Intent intent0 = new Intent("android.intent.action.DIAL");
                    intent0.setData(Uri.parse(("tel:" + ((String)optional1.get()))));
                    this.startActivity(intent0);
                });
                MobileDataPlanDetailChimeraActivity.g(this, this.a);
                if(hvlq.q()) {
                    this.ai.setContentDescription(this.getString(0x7F150F91));  // string:esim_retry_activation "Retry installing your eSIM"
                    this.G(s8);
                }
                break;
            }
            case 0xEF: {
                this.C(this.getString(0x7F150F62), this.getString(0x7F150F63), 0x7F15058C, null);  // string:esim_error_address "Your address is invalid"
                this.ai.setOnClickListener(new csbk(this));
                MobileDataPlanDetailChimeraActivity.m(this, this.a, this.b);
                break;
            }
            case 230: 
            case 0xF1: {
                this.C(this.getString(0x7F150F67), null, 0x7F15058B, this.getString(0x7F15057D));  // string:esim_error_default "Oops! Something went wrong"
                this.ai.setOnClickListener(new csbw(this));
                this.aj.setOnClickListener(new csbx(this));
                MobileDataPlanDetailChimeraActivity.m(this, this.a, this.b);
                break;
            }
            case 0xF5: {
                ((ImageView)this.d.findViewById(0x7F0B1299)).setVisibility(8);  // id:error_picture_portrait
                this.C(this.getString(0x7F150F6A), this.D(), 0x7F15057D, null);  // string:esim_error_not_supported "Your phone isn\'t eligible"
                this.ai.setOnClickListener(new csbt(this));
                break;
            }
            case 0xE8: 
            case 0xF4: 
            case 0xF6: 
            case 0xF7: {
                ((ImageView)this.d.findViewById(0x7F0B1299)).setVisibility(8);  // id:error_picture_portrait
                this.C(this.getString(0x7F150F6A), this.D(), 0x7F15057D, null);  // string:esim_error_not_supported "Your phone isn\'t eligible"
                this.ai.setOnClickListener(new csca(this));
                MobileDataPlanDetailChimeraActivity.a(this, this.a);
                break;
            }
            case 0xEE: 
            case 260: {
                this.C(this.getString(0x7F150F67), null, 0x7F15057D, null);  // string:esim_error_default "Oops! Something went wrong"
                this.ai.setOnClickListener(new csbn(this));
                MobileDataPlanDetailChimeraActivity.a(this, this.a);
                break;
            }
            case 0xED: 
            case 0x105: {
                this.C(this.getString(0x7F150F67), null, 0x7F15058B, this.getString(0x7F15057D));  // string:esim_error_default "Oops! Something went wrong"
                this.ai.setOnClickListener(new csbl(this));
                this.aj.setOnClickListener(new csbm(this));
                MobileDataPlanDetailChimeraActivity.a(this, this.a);
                break;
            }
            case 0x106: {
                String s9 = this.b.getString("esim_carrier_name");
                this.C(this.getString(0x7F150F6C), this.getString(0x7F150F61), 0x7F15058C, this.getString(0x7F150F53, new Object[]{s9}));  // string:esim_error_plan_offers "Could not fetch plans"
                this.ai.setOnClickListener(new csbu(this));
                this.aj.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                    Optional optional0 = Optional.ofNullable(this.b.getString("esim_carrier_support_url"));
                    Optional optional1 = Optional.ofNullable(this.b.getString("esim_carrier_support"));
                    if(optional0.isEmpty() && optional1.isEmpty()) {
                        this.z(hhct.dx);
                        return;
                    }
                    if(hvlq.q() && optional0.isPresent()) {
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String)optional0.get()))));
                        return;
                    }
                    optional1.get();
                    Intent intent0 = new Intent("android.intent.action.DIAL");
                    intent0.setData(Uri.parse(("tel:" + ((String)optional1.get()))));
                    this.startActivity(intent0);
                });
                if(hvlq.q()) {
                    this.ai.setContentDescription(this.getString(0x7F150F92));  // string:esim_retry_plan_offers "Retry retrieving the plans"
                    this.G(s9);
                }
                break;
            }
            case 0xEB: 
            case 0xF2: 
            case 0x107: 
            case 0x108: {
                String s4 = this.b.getString("esim_carrier_name");
                String s5 = this.getString(0x7F150F61);  // string:esim_error_activation_description "Ensure your data or Wi-Fi connection is 
                                                         // strong, then try again."
                String s6 = this.getString(0x7F15058B);  // string:button_start_over "Start over"
                String s7 = this.getString(0x7F150F53, new Object[]{s4});  // string:esim_contact_carrier "Contact %s support"
                this.ai.setOnClickListener(new csbo(this));
                this.aj.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                    Optional optional0 = Optional.ofNullable(this.b.getString("esim_carrier_support_url"));
                    Optional optional1 = Optional.ofNullable(this.b.getString("esim_carrier_support"));
                    if(optional0.isEmpty() && optional1.isEmpty()) {
                        this.z(hhct.dx);
                        return;
                    }
                    if(hvlq.q() && optional0.isPresent()) {
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String)optional0.get()))));
                        return;
                    }
                    optional1.get();
                    Intent intent0 = new Intent("android.intent.action.DIAL");
                    intent0.setData(Uri.parse(("tel:" + ((String)optional1.get()))));
                    this.startActivity(intent0);
                });
                if(hvlq.q() && this.b.containsKey("ESIM_DOWNLOAD_ERROR_CONFIG")) {
                    qhp qhp1 = this.E("ESIM_DOWNLOAD_ERROR_CONFIG");
                    if(qhp1.b) {
                        s6 = this.getString(0x7F150F53, new Object[]{s4});  // string:esim_contact_carrier "Contact %s support"
                        this.ai.setOnClickListener((/* MISSING LAMBDA PARAMETER */) -> {
                            Optional optional0 = Optional.ofNullable(this.b.getString("esim_carrier_support_url"));
                            Optional optional1 = Optional.ofNullable(this.b.getString("esim_carrier_support"));
                            if(optional0.isEmpty() && optional1.isEmpty()) {
                                this.z(hhct.dx);
                                return;
                            }
                            if(hvlq.q() && optional0.isPresent()) {
                                this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((String)optional0.get()))));
                                return;
                            }
                            optional1.get();
                            Intent intent0 = new Intent("android.intent.action.DIAL");
                            intent0.setData(Uri.parse(("tel:" + ((String)optional1.get()))));
                            this.startActivity(intent0);
                        });
                        this.aj.setOnClickListener(null);
                        if(this.b.getBoolean("esim_link_to_store")) {
                            s6 = this.getString(0x7F150F6D, new Object[]{s4});  // string:esim_find_store "Find a %s store"
                            this.ai.setContentDescription(this.getString(0x7F150F6E, new Object[]{s4}));  // string:esim_find_store_accessibility "Find the closest %s store near you"
                        }
                        s7 = null;
                    }
                    if(!qhp1.c) {
                        s = s5;
                    }
                }
                else {
                    s = s5;
                }
                this.F(this.getString(0x7F150F68), s, s6, s7);  // string:esim_error_download "Couldn\'t download your eSIM"
                MobileDataPlanDetailChimeraActivity.m(this, this.a, this.b);
                break;
            }
            default: {
                hhct1 = hhct.dx;
                this.C(this.getString(0x7F150F67), null, 0x7F15058B, this.getString(0x7F15057D));  // string:esim_error_default "Oops! Something went wrong"
                this.ai.setOnClickListener(new csby(this));
                this.aj.setOnClickListener(new csbz(this));
                MobileDataPlanDetailChimeraActivity.m(this, this.a, this.b);
            }
        }
        ((ggtj)cscb.c.j()).B("Encountered error during eSIM flow: %s.", hhct1.name());
        crxn.c().p(hhct1, this.ak, csld.c(this.b, "plan_segment_id"), csld.c(this.b, "plan_subsegment_id"), this.b.getLong("esim_carrier_id"), this.b.getLong("ESIM_RPC_STATUS_KEY"));
    }
}

