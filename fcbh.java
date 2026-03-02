import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationDependentEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.ui.common.FormEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class fcbh extends gdak implements gcpc, gdbh {
    public fcbl a;
    final ArrayList ag;
    private View ah;
    private View ai;
    private final gdew aj;
    private boolean ak;
    private boolean al;
    private String am;
    private String an;
    private gklu ao;
    private final gamj ap;
    public fcbf b;
    public gcwf c;
    public fcbz d;

    public fcbh() {
        this.aj = new gdew();
        this.ag = new ArrayList(3);
        this.ao = gklu.a;
        this.ap = new gamj(1650);
    }

    @Override  // gami
    public final gamj B() {
        return this.ap;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((gfak)this.aA).f;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfak.d).jf(7, null);
    }

    @Override  // gdbh
    public final void J(int v, int v1, boolean z) {
        fcbz fcbz0 = this.d;
        if(fcbz0 != null) {
            fcbz0.R(gcha.c(v));
        }
    }

    @Override  // gdcm
    protected final void M() {
        fcbl fcbl0 = this.a;
        if(fcbl0 != null) {
            boolean z = this.ca;
            fcbl0.ll(z);
            if(!this.ak) {
                this.b.ll(z);
            }
            this.c.ll(z);
            fcbz fcbz0 = this.d;
            if(fcbz0 != null) {
                fcbz0.ll(z);
            }
        }
    }

    public final int Q() {
        gfaw gfaw0 = this.a.ap;
        return gfaw0 == null ? 0 : gfaw0.i;
    }

    public final String R() {
        return this.a.d.getText().toString();
    }

    @Override  // gdak
    public final void T(int v, Bundle bundle0) {
        switch(v) {
            case 4: {
            label_3:
                if(gczs.j(this.aj.p) && !this.al) {
                    gfak gfak0 = (gfak)this.aA;
                    if((gfak0.e & 16) != 0 && (gfak0.l == null ? gfam.a : gfak0.l).k.size() > 0) {
                        int v1 = 1;
                        this.al = true;
                        gfam gfam0 = ((gfak)this.aA).l;
                        if(gfam0 == null) {
                            gfam0 = gfam.a;
                        }
                        gfaw gfaw0 = (gfaw)gfam0.k.get(0);
                        if(!this.ak && !gfaw0.h.isEmpty()) {
                            if(gfav.a(gfaw0.c) == 2) {
                                v1 = 3;
                            }
                            this.b.S(gfaw0.h, v1);
                        }
                    }
                }
                break;
            }
            case 12: {
                v = 12;
                goto label_3;
            }
        }
        super.T(v, bundle0);
    }

    @Override  // gcpc
    public final void aq(Intent intent0) {
        this.a.aq(intent0);
    }

    @Override  // gdak
    public final String lL(String s) {
        return this.lb(null) ? this.a.Q() : "";
    }

    @Override  // gdaa
    public final boolean la() {
        return this.a != null && this.a.la() && (this.b != null && this.b.la() && this.c != null);
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.ag;
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gdak
    public final void lr() {
        super.lr();
        fcbl fcbl0 = this.a;
        if(fcbl0 != null) {
            fcbl0.lr();
        }
        fcbf fcbf0 = this.b;
        if(fcbf0 != null) {
            fcbf0.lr();
        }
        gcwf gcwf0 = this.c;
        if(gcwf0 != null) {
            gcwf0.lr();
        }
        fcbz fcbz0 = this.d;
        if(fcbz0 != null) {
            fcbz0.lr();
        }
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        if(this.a != null && this.a.ly(getg0)) {
            return true;
        }
        return this.b == null || !this.b.ly(getg0) ? this.c != null && this.c.ly(getg0) : true;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.aj;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 500) {
            this.a.onActivityResult(500, v1, intent0);
            CreditCardOcrResult creditCardOcrResult0 = CreditCardOcrResult.b(intent0);
            if(creditCardOcrResult0 != null && !this.ak) {
                this.b.S(creditCardOcrResult0.e, 3);
                String[] arr_s = creditCardOcrResult0.n;
                if(arr_s != null) {
                    fcbf fcbf0 = this.b;
                    if(fcbf0 != null && this.a.at) {
                        List list0 = Arrays.asList(arr_s);
                        FormEditText formEditText0 = fcbf0.a;
                        if(formEditText0 != null) {
                            formEditText0.T(list0);
                        }
                    }
                }
            }
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.am = this.getArguments().getString("buyFlowAnalyticsId");
        this.ao = (gklu)this.getArguments().getSerializable("flowTypeArg");
        gfak gfak0 = (gfak)this.aA;
        boolean z = false;
        if(gfak0.r.size() > 0) {
            gfdx gfdx0 = gfdx.b(gfak0.r.d(0));
            if(gfdx0 == null) {
                gfdx0 = gfdx.a;
            }
            if(gfdx0 == gfdx.k && fbef.a(babh.a(), "com.google.android.gms", "android.permission.CAMERA")) {
                z = true;
            }
        }
        this.ak = z;
        if(bundle0 != null) {
            this.an = bundle0.getString("analyticsSessionId");
            this.al = bundle0.getBoolean("hasAppliedCreditCardInputResult");
            return;
        }
        this.an = CreditCardEntryLaunchedEvent.b(this.getContext(), fayh.a(this.getContext()), fayh.b(this.getContext()), this.ao);
        String s = this.am;
        String s1 = this.an;
        OrchestrationDependentEvent.a(this.getContext(), s, s1);
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        bundle0.putString("analyticsSessionId", this.an);
        bundle0.putBoolean("hasAppliedCreditCardInputResult", this.al);
    }

    @Override  // gcyg
    public final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.ah = layoutInflater0.inflate(0x7F0E0D28, viewGroup0, false);  // layout:wallet_fragment_credit_card_form
        fcbl fcbl0 = (fcbl)this.getChildFragmentManager().h("creditCardExpandedFieldFragment");
        this.a = fcbl0;
        if(fcbl0 == null) {
            gfak gfak0 = (gfak)this.aA;
            int v = this.bU;
            String s = this.an;
            fcbl fcbl1 = new fcbl();
            Bundle bundle1 = fcbl.al(v, ((MessageLite)gfak0), this.cM());
            bundle1.putString("analyticsSessionId", s);
            fcbl1.setArguments(bundle1);
            this.a = fcbl1;
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.u(0x7F0B1055, this.a, "creditCardExpandedFieldFragment");  // id:credit_card_fragment_holder
            ca0.a();
        }
        this.a.cb = this.cb;
        ArrayList arrayList0 = this.ag;
        arrayList0.add(new gczs(this.a));
        gdew gdew0 = this.aj;
        gdew0.d(this.a);
        if(!this.ak) {
            fcbf fcbf0 = (fcbf)this.getChildFragmentManager().h("cardHolderNameFragment");
            this.b = fcbf0;
            if(fcbf0 == null) {
                gfak gfak1 = (gfak)this.aA;
                String s1 = null;
                if((gfak1.e & 16) != 0 && ((gfak1.l == null ? gfam.a : gfak1.l).b & 2) != 0) {
                    gfam gfam0 = ((gfak)this.aA).l;
                    if(gfam0 == null) {
                        gfam0 = gfam.a;
                    }
                    s1 = gfam0.d;
                }
                MessageLite hfvm0 = this.aA;
                gewg gewg0 = ((gfak)hfvm0).f;
                if(gewg0 == null) {
                    gewg0 = gewg.a;
                }
                String s2 = gewg0.c;
                gewg gewg1 = ((gfak)this.aA).f;
                if(gewg1 == null) {
                    gewg1 = gewg.a;
                }
                this.b = fcbf.Q(hfvm0, s2, gewg1.d, 5, s1, this.bU, this.cM());
                ca ca1 = new ca(this.getChildFragmentManager());
                ca1.u(0x7F0B0E0F, this.b, "cardHolderNameFragment");  // id:card_holder_name_fragment_holder
                ca1.a();
            }
            this.b.cb = this.cb;
            arrayList0.add(new gczs(this.b));
            gdew0.d(this.b);
        }
        gcwf gcwf0 = (gcwf)this.getChildFragmentManager().h("addAddressExpandedFragment");
        this.c = gcwf0;
        if(gcwf0 == null) {
            geui geui0 = ((gfak)this.aA).k;
            if(geui0 == null) {
                geui0 = geui.d;
            }
            this.c = gcwf.S(geui0, this.bU, this.cM());
            ca ca2 = new ca(this.getChildFragmentManager());
            ca2.u(0x7F0B0B47, this.c, "addAddressExpandedFragment");  // id:address_fragment_holder
            ca2.a();
        }
        this.c.cb = this.cb;
        arrayList0.add(new gczs(this.c));
        gdew0.d(this.c);
        String s3 = this.am;
        gamj gamj0 = this.c.ak;
        OrchestrationViewEvent.d(this.getContext(), s3, gamj0);
        if((((gfak)this.aA).e & 0x20) != 0) {
            View view0 = this.ah.findViewById(0x7F0B105A);  // id:credit_card_legal_message_holder
            this.ai = view0;
            view0.setVisibility(0);
            fcbz fcbz0 = (fcbz)this.getChildFragmentManager().g(0x7F0B105A);  // id:credit_card_legal_message_holder
            this.d = fcbz0;
            if(fcbz0 == null) {
                gfbt gfbt0 = ((gfak)this.aA).m;
                if(gfbt0 == null) {
                    gfbt0 = gfbt.a;
                }
                this.d = fcbz.Q(gfbt0, this.bU, this.cM());
                ca ca3 = new ca(this.getChildFragmentManager());
                ca3.t(0x7F0B105A, this.d);  // id:credit_card_legal_message_holder
                ca3.a();
            }
            fcbz fcbz1 = this.d;
            fcbz1.cb = this.cb;
            String s4 = this.am;
            OrchestrationViewEvent.d(this.getContext(), s4, fcbz1.c);
        }
        this.c.ac(this);
        return this.ah;
    }
}

