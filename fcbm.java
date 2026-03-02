import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;
import java.util.List;

public final class fcbm extends gdak {
    public fcbg a;
    public final gamj ag;
    private final ArrayList ah;
    private final gdew ai;
    private boolean aj;
    private boolean ak;
    gcwf b;
    fcbf c;
    fcbz d;

    public fcbm() {
        this.ah = new ArrayList(2);
        this.ai = new gdew();
        this.ag = new gamj(6);
    }

    @Override  // gami
    public final gamj B() {
        return this.ag;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((gfaq)this.aA).d;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfaq.b).jf(7, null);
    }

    @Override  // gdcm
    protected final void M() {
        boolean z = this.ca;
        fcbg fcbg0 = this.a;
        if(fcbg0 != null) {
            fcbg0.ll(z);
        }
        fcbf fcbf0 = this.c;
        if(fcbf0 != null) {
            fcbf0.ll(z);
        }
        gcwf gcwf0 = this.b;
        if(gcwf0 != null) {
            gcwf0.ll(z);
        }
        fcbz fcbz0 = this.d;
        if(fcbz0 != null) {
            fcbz0.ll(z);
        }
    }

    public static fcbm Q(gfaq gfaq0, int v, LogContext logContext0) {
        fcbm fcbm0 = new fcbm();
        fcbm0.setArguments(fcbm.al(v, ((MessageLite)gfaq0), logContext0));
        return fcbm0;
    }

    public final gfar R() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfar.a).v_newBuilder();
        gewg gewg0 = ((gfaq)this.aA).d;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        if(!gewg0.c.isEmpty()) {
            gewg gewg1 = ((gfaq)this.aA).d;
            if(gewg1 == null) {
                gewg1 = gewg.a;
            }
            String s = gewg1.c;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfar gfar0 = (gfar)hftp0.b_message;
            s.getClass();
            gfar0.b |= 1;
            gfar0.c = s;
        }
        gewg gewg2 = ((gfaq)this.aA).d;
        if(gewg2 == null) {
            gewg2 = gewg.a;
        }
        if(!gewg2.e.isEmpty()) {
            gewg gewg3 = ((gfaq)this.aA).d;
            if(gewg3 == null) {
                gewg3 = gewg.a;
            }
            ByteString hfsf0 = gewg3.e;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfar gfar1 = (gfar)hftp0.b_message;
            hfsf0.getClass();
            gfar1.b |= 2;
            gfar1.d = hfsf0;
        }
        if(this.aj) {
            fcbg fcbg0 = this.a;
            if(fcbg0 != null) {
                if(fcbg0.R()) {
                    int v = fcbg0.b.d();
                    int v1 = fcbg0.b.f();
                    if(v > 0) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfar gfar2 = (gfar)hftp0.b_message;
                        gfar2.b |= 4;
                        gfar2.e = v;
                    }
                    if(v1 > 0) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfar gfar3 = (gfar)hftp0.b_message;
                        gfar3.b |= 8;
                        gfar3.f = v1;
                    }
                }
                if(fcbg0.Q() && !TextUtils.isEmpty(fcbg0.c.getText().toString())) {
                    String s1 = fcbg0.c.getText().toString();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gfar gfar4 = (gfar)hftp0.b_message;
                    s1.getClass();
                    gfar4.b |= 16;
                    gfar4.g = s1;
                }
            }
        }
        if(this.ak && (this.c != null && !TextUtils.isEmpty(this.c.R()))) {
            String s2 = this.c.R();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfar gfar5 = (gfar)hftp0.b_message;
            s2.getClass();
            gfar5.b |= 0x40;
            gfar5.i = s2;
        }
        if((((gfaq)this.aA).c & 0x1000) != 0) {
            gcwf gcwf0 = this.b;
            if(gcwf0 != null) {
                geuj geuj0 = gcwf0.J(Bundle.EMPTY);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gfar gfar6 = (gfar)hftp0.b_message;
                geuj0.getClass();
                gfar6.h = geuj0;
                gfar6.b |= 0x20;
            }
        }
        fcbz fcbz0 = this.d;
        if(fcbz0 != null) {
            String s3 = fcbz0.b.i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gfar gfar7 = (gfar)hftp0.b_message;
            s3.getClass();
            gfar7.b |= 0x80;
            gfar7.j = s3;
        }
        return (gfar)hftp0.N_build();
    }

    @Override  // gdaa
    public final boolean la() {
        return this.a == null || this.a.la() ? this.c == null || this.c.la() : false;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.ah;
    }

    @Override  // gami
    public final List li() {
        List list0 = new ArrayList(2);
        fcbg fcbg0 = this.a;
        if(fcbg0 != null) {
            ((ArrayList)list0).add(fcbg0);
        }
        fcbf fcbf0 = this.c;
        if(fcbf0 != null) {
            ((ArrayList)list0).add(fcbf0);
        }
        gcwf gcwf0 = this.b;
        if(gcwf0 != null) {
            ((ArrayList)list0).add(gcwf0);
        }
        return list0;
    }

    @Override  // gdak
    public final void lr() {
        super.lr();
        fcbg fcbg0 = this.a;
        if(fcbg0 != null) {
            fcbg0.lr();
        }
        fcbf fcbf0 = this.c;
        if(fcbf0 != null) {
            fcbf0.lr();
        }
        gcwf gcwf0 = this.b;
        if(gcwf0 != null) {
            gcwf0.lr();
        }
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        if(this.a != null && this.a.ly(getg0)) {
            return true;
        }
        if(this.c != null && this.c.ly(getg0)) {
            return true;
        }
        if(this.b != null && this.b.ly(getg0)) {
            return true;
        }
        if((getg0.b == null ? gesr.a : getg0.b).b.equals(((gfaq)this.aA).e)) {
            throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + (getg0.b == null ? gesr.a : getg0.b).c);
        }
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ai;
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.aj = !new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap.b) || !new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap.c) || !new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap.d);
        this.ak = new hfuh(((gfaq)this.aA).q, gfaq.a).contains(gfap.f) ^ 1;
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D2A, viewGroup0, false);  // layout:wallet_fragment_credit_card_update
        fm fm0 = this.getChildFragmentManager();
        if(this.aj) {
            fcbg fcbg0 = (fcbg)fm0.h("creditCardExpirationDateFragment");
            this.a = fcbg0;
            if(fcbg0 == null) {
                gfaq gfaq0 = (gfaq)this.aA;
                int v = this.bU;
                fcbg fcbg1 = new fcbg();
                fcbg1.setArguments(fcbg.al(v, ((MessageLite)gfaq0), this.cM()));
                this.a = fcbg1;
                ca ca0 = new ca(fm0);
                ca0.z(0x7F0B134B, this.a, "creditCardExpirationDateFragment");  // id:expiration_date_form_holder
                ca0.a();
            }
            gczs gczs0 = new gczs(this.a);
            this.ah.add(gczs0);
            this.ai.d(this.a);
        }
        if(this.ak) {
            fcbf fcbf0 = (fcbf)fm0.h("cardHolderNameFragment");
            this.c = fcbf0;
            if(fcbf0 == null) {
                gfaq gfaq1 = (gfaq)this.aA;
                String s = (gfaq1.c & 0x2000) == 0 ? null : (gfaq1.p == null ? gfar.a : gfaq1.p).i;
                MessageLite hfvm0 = this.aA;
                String s1 = ((gfaq)hfvm0).e;
                gewg gewg0 = ((gfaq)hfvm0).d;
                if(gewg0 == null) {
                    gewg0 = gewg.a;
                }
                this.c = fcbf.Q(hfvm0, s1, gewg0.d, 4, s, this.bU, this.cM());
                ca ca1 = new ca(fm0);
                ca1.z(0x7F0B0E0F, this.c, "cardHolderNameFragment");  // id:card_holder_name_fragment_holder
                ca1.a();
            }
            gczs gczs1 = new gczs(this.c);
            this.ah.add(gczs1);
            this.ai.d(this.c);
        }
        gfaq gfaq2 = (gfaq)this.aA;
        if((gfaq2.c & 0x1000) != 0) {
            gcwf gcwf0 = (gcwf)fm0.h((gfaq2.o == null ? geui.d : gfaq2.o).g);
            this.b = gcwf0;
            if(gcwf0 == null) {
                geui geui0 = ((gfaq)this.aA).o;
                if(geui0 == null) {
                    geui0 = geui.d;
                }
                this.b = gcwf.S(geui0, this.bU, this.cM());
                ca ca2 = new ca(fm0);
                gcwf gcwf1 = this.b;
                geui geui1 = ((gfaq)this.aA).o;
                if(geui1 == null) {
                    geui1 = geui.d;
                }
                ca2.z(0x7F0B0B47, gcwf1, geui1.g);  // id:address_fragment_holder
                ca2.a();
            }
            this.ai.d(this.b);
            gczs gczs2 = new gczs(this.b);
            this.ah.add(gczs2);
        }
        if((((gfaq)this.aA).c & 0x4000) != 0) {
            view0.findViewById(0x7F0B105A).setVisibility(0);  // id:credit_card_legal_message_holder
            fcbz fcbz0 = (fcbz)this.getChildFragmentManager().g(0x7F0B105A);  // id:credit_card_legal_message_holder
            this.d = fcbz0;
            if(fcbz0 == null) {
                gfbt gfbt0 = ((gfaq)this.aA).r;
                if(gfbt0 == null) {
                    gfbt0 = gfbt.a;
                }
                this.d = fcbz.Q(gfbt0, this.bU, this.cM());
                ca ca3 = new ca(this.getChildFragmentManager());
                ca3.t(0x7F0B105A, this.d);  // id:credit_card_legal_message_holder
                ca3.a();
            }
        }
        return view0;
    }
}

