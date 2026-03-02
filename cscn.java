import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.telephony.euicc.EuiccManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;
import j..time.Duration;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.Optional;
import java.util.List;

public final class cscn extends du {
    public static final bboh a;
    public Bundle ag;
    private final csle ah;
    private View ai;
    private TextView aj;
    private TextView ak;
    private long al;
    public xob b;
    public csld c;
    public final clht d;

    static {
        cscn.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public cscn() {
        this.ah = new csle();
        this.d = new clht(Looper.getMainLooper());
    }

    public final void A() {
        this.c.j(hhct.dR, 0L);
        Optional optional0 = Optional.ofNullable(qic.b(this.ag.getInt("subscription_id_type")));
        qic qic0 = qic.a;
        qic qic1 = (qic)optional0.orElse(qic0);
        String s = cscn.y(this.b, qic1);
        if(qic1 != qic0 && s.isEmpty()) {
            this.z(hhct.dx);
            return;
        }
        csar csar0 = this.c.r(true);
        String s1 = this.c.b;
        Optional optional1 = Optional.ofNullable(((MdpUpsellPlan)this.ag.getParcelable("ESIM_PLAN_DETAILS")));
        Optional optional2 = Optional.ofNullable(this.ag.getBundle("esim_entry_tags"));
        csch csch0 = new csch(this);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)qhv.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        qhv qhv0 = (qhv)hftp0.b_message;
        s1.getClass();
        qhv0.c = s1;
        if(!TextUtils.isEmpty(s) && qic1 != qic0) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)qid.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            qid qid0 = (qid)hftp1.b_message;
            qid0.b = qic1.a();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((qid)hftp1.b_message).c = s;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            qhv qhv1 = (qhv)hftp0.b_message;
            qid qid1 = (qid)hftp1.N_build();
            qid1.getClass();
            qhv1.d = qid1;
            qhv1.b |= 1;
        }
        Optional optional3 = optional1.map(new csai());
        Objects.requireNonNull(hftp0);
        optional3.ifPresent(new csaj(hftp0));
        Optional optional4 = optional1.map(new csak());
        Objects.requireNonNull(hftp0);
        optional4.ifPresent(new csal(hftp0));
        Optional optional5 = optional2.map(new csam());
        Objects.requireNonNull(hftp0);
        optional5.ifPresent(new crzt(hftp0));
        Optional optional6 = optional2.map(new crzu());
        Objects.requireNonNull(hftp0);
        optional6.ifPresent(new crzv(hftp0));
        crzw crzw0 = new crzw(csar0, ((qhv)hftp0.N_build()), csch0);
        csar0.b.execute(crzw0);
        if(hvlq.n()) {
            this.B(true);
            new crxu().o(this.ag.getInt("ESIM_ACCOUNT_NOTIFICATION"));
        }
    }

    final void B(boolean z) {
        if(z) {
            this.aj.setText(this.getString(0x7F150F57));  // string:esim_download_loading "Fetching eSIM"
            this.ak.setText(this.getString(0x7F150F58));  // string:esim_download_loading_detail "We\'re preparing your eSIM. This may take a 
                                                          // few minutes."
            this.ak.setVisibility(0);
            return;
        }
        this.aj.setText(this.getString(0x7F150F4F, new Object[]{csld.f(this.ag)}));  // string:esim_carrier_account_loading "Setting up %s account and fetching eSIM"
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.b = (xob)context0;
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        this.ai = layoutInflater0.inflate(0x7F0E0532, viewGroup0, false);  // layout:loading_caption_view
        csld csld0 = (csld)new lso(this.b, this.ah).a(csld.class);
        this.c = csld0;
        Bundle bundle1 = csld0.a();
        this.ag = bundle1;
        MobileDataPlanDetailChimeraActivity.m(this, this.b, bundle1);
        this.al = this.ag.getLong("esim_carrier_id");
        this.aj = (TextView)this.ai.findViewById(0x7F0B183A);  // id:loading_caption
        this.ak = (TextView)this.ai.findViewById(0x7F0B183E);  // id:loading_detail
        this.B(false);
        long v = (long)(((Long)Optional.ofNullable(((hglh)DesugarCollections.unmodifiableMap(hvlq.a.d().e().b).get(Long.valueOf(this.al)))).map(new csck()).orElse(Long.valueOf(300L))));
        cscl cscl0 = new cscl(this);
        long v1 = Duration.ofSeconds(v).toMillis();
        this.d.postDelayed(cscl0, v1);
        if(!hvlq.n()) {
            this.A();
        }
        return this.ai;
    }

    public static String y(xob xob0, qic qic0) {
        try {
            switch(qic0.ordinal()) {
                case 1: {
                    EuiccManager euiccManager0 = (EuiccManager)xob0.getApplicationContext().getSystemService("euicc");
                    batl.s(euiccManager0);
                    String s = euiccManager0.getEid();
                    batl.s(s);
                    return s;
                }
                case 2: {
                    List list0 = SubscriptionManager.from(xob0).getActiveSubscriptionInfoList();
                    batl.s(list0);
                    SubscriptionInfo subscriptionInfo0 = (SubscriptionInfo)Collection.-EL.stream(list0).filter(new cscm()).findFirst().orElse(null);
                    batl.s(subscriptionInfo0);
                    String s1 = subscriptionInfo0.getIccId();
                    batl.s(s1);
                    return s1;
                }
                case 3: {
                    TelephonyManager telephonyManager0 = (TelephonyManager)xob0.getApplicationContext().getSystemService("phone");
                    batl.s(telephonyManager0);
                    String s2 = telephonyManager0.getImei();
                    batl.s(s2);
                    return s2;
                }
                default: {
                    return "";
                }
            }
        }
        catch(NullPointerException unused_ex) {
            ((ggtj)cscn.a.j()).B("Failed to fetch %s subscriptionID for eSIM", qic0.name());
            return "";
        }
    }

    public final void z(hhct hhct0) {
        this.d.removeCallbacksAndMessages(null);
        cscb.B(this.b, this.ag, hhct0, this.c.b);
    }
}

