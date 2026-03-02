import com.google.android.chimera.android.Activity;
import com.google.android.gms.feedback.FeedbackOptions;
import java.util.ArrayList;
import java.util.List;

public final class bvkk extends lsb {
    public static final ltw a;
    public static final ltw b;
    public final bvlp c;
    public final bvly d;
    public final buus e;
    public String f;
    public cmfb g;
    public final boolean h;
    public final icnj i;
    public final clnn j;
    public final icmn k;
    public final icig l;
    public final icig m;
    public final icig n;
    public final icig o;
    public final bvlm p;
    public final bvle q;
    public final clnw r;
    public final buyb s;
    public final icnl t;
    private final cmhi u;
    private final cmki v;

    static {
        bvkk.a = new bvif();
        bvkk.b = new bvig();
    }

    public bvkk(clou clou0, clni clni0, bvlp bvlp0, bvly bvly0, buus buus0, bvlm bvlm0, bvle bvle0, clnw clnw0, buyb buyb0, cmki cmki0, buwj buwj0, cmhi cmhi0) {
        ibuq.f(buus0, "selectedAccountRepository");
        ibuq.f(buyb0, "oneGoogleWrapper");
        ibuq.f(cmhi0, "gmsCoreMetrics");
        super();
        this.c = bvlp0;
        this.d = bvly0;
        this.e = buus0;
        this.p = bvlm0;
        this.q = bvle0;
        this.r = clnw0;
        this.s = buyb0;
        this.v = cmki0;
        this.u = cmhi0;
        htva htva0 = htva.a;
        this.h = htva0.b().o();
        bvhk bvhk0 = new bvhk(this);
        bvii bvii0 = new bvii(this);
        ibuq.f(buyb0, "oneGoogleBinder");
        String s = clnw0.b(0x7F1514C2);  // string:gs_screen_title "@com.google.android.gms:string/common_google_services"
        cmhx cmhx0 = bvhi.d(0x3047B, null, null, null, 14);
        ibqm ibqm0 = new ibqm(null);
        String s1 = clnw0.b(0x7F1508AD);  // string:common_open_source_licenses "Open source licenses"
        bvkm bvkm0 = new bvkm(buwj0);
        ibqm0.add(new bvfy(s1, cmeu.c, bvkm0));
        String s2 = clnw0.b(0x7F15087B);  // string:common_list_apps_menu_help "Help"
        bvkn bvkn0 = new bvkn(buwj0);
        ibqm0.add(new bvfy(s2, cmeu.d, bvkn0));
        ibqm0.add(bvkp.a(clnw0.b(0x7F1514B9), cmeu.e, bvhk0));  // string:gs_feedback_give_feedback "@com.google.android.gms:string/common_give_feedback"
        List list0 = ibpo.a(ibqm0);
        ibwm ibwm0 = ibpo.k(list0);
        ArrayList arrayList0 = new ArrayList(ibpo.q(ibwm0, 10));
        ibpw ibpw0 = ibwm0.e();
        while(((ibwl)ibpw0).a) {
            int v = ibpw0.a();
            arrayList0.add(bvhi.b(((bvfy)list0.get(v)), v));
        }
        bvgd bvgd0 = new bvgd(s, new bvgc(cmhx0, arrayList0));
        cmhx cmhx1 = bvih.a(null, cmew.a, null);
        icnl icnl0 = icnm.a(new bvgx(bvgd0, bvky.a, null, cmhx1, bvii0));
        this.t = icnl0;
        this.i = new icmp(icnl0);
        this.j = new clnn(clni0);
        icmn icmn0 = icmu.e(1, 0, 2, 2);
        this.k = icmn0;
        bvjb bvjb0 = new bvjb(icmn0);
        icmq icmq0 = this.i(icjj.a(new icoj(new bvji(null, this), bvjb0)));
        this.l = icmq0;
        icmq icmq1 = this.i(new icoj(new bvjj(bvkv.a, null, this), icmq0));
        this.m = icmq1;
        icig icig0 = icky.b(new icig[]{new bvjo(new bvje(new bvka(icmq1))), new bvjr(new bvkd(icmn0))});
        this.n = new icoj(new bvjk(new bvgv(this.r.b(0x7F1514C6), this.r.b(0x7F1514C3)), null, clou0, this), icig0);  // string:gs_services_tab_title "All services"
        icig icig1 = icky.b(new icig[]{new bvju(new bvjh(new bvkg(icmq1))), new bvjx(new bvkj(icmn0))});
        this.o = new icoj(new bvjl(new bvgo(this.r.b(0x7F1514C1), this.r.b(0x7F1514BE)), null, this), icig1);  // string:gs_recommended_tab_title "Recommended"
        icbb.b(lsc.a(this), null, null, new bvhn(this, null), 3);
        icbb.b(lsc.a(this), null, null, new bvhp(this, null), 3);
        icbb.b(lsc.a(this), null, null, new bvhr(this, null), 3);
        icbb.b(lsc.a(this), null, null, new bvht(this, null), 3);
        icbb.b(lsc.a(this), null, null, new bvhv(this, null), 3);
        this.s.f = new bvhw(this);
        if(htva0.b().q()) {
            icbb.b(lsc.a(this), null, null, new bvib(this, null), 3);
        }
        if(htva0.b().r()) {
            icbb.b(lsc.a(this), null, null, new bvid(this, null), 3);
        }
    }

    public final cmai a(String s, cmkg cmkg0) {
        return new cmai(this.r.b(0x7F1514B9), new bvhj(this, cmkg0, s));  // string:gs_feedback_give_feedback "@com.google.android.gms:string/common_give_feedback"
    }

    public final Object b(ibrl ibrl0) {
        return buvd.a(this.e, ibrl0);
    }

    public static final List c(List list0, bvkk bvkk0) {
        bvfs bvfs0;
        bvfq bvfq0;
        bvfp bvfp0;
        bvga bvga0;
        Integer integer1;
        Integer integer0;
        int v;
        List list1 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            clmu clmu0 = ((clnf)object0).a;
            boolean z = clmu0 == clmu.f || clmu0 == clmu.g || clmu0 == clmu.h;
            boolean z1 = clmu0 == clmu.h;
            String s = bvkk0.f;
            ibuq.f(((clnf)object0), "<this>");
            String s1 = ((clnf)object0).b;
            String s2 = ((clnf)object0).c;
            ccow ccow0 = ((clnf)object0).d;
            ibuq.f(clmu0, "cardId");
            ibuq.f(ccow0, "cardState");
            switch(clmu0.ordinal()) {
                case 1: {
                    integer0 = (int)0x7F0804C3;  // drawable:gs_android_find_my_device_vd_theme_24
                    break;
                }
                case 2: {
                    if(ccow0 == ccow.g) {
                        v = 0x7F0805EA;  // drawable:gs_password_manager_vd_theme_24
                    }
                    else {
                        v = hqal.y() ? 0x7F08025D : 0x7F0804DD;  // drawable:autofill_icon
                    }
                    integer0 = v;
                    break;
                }
                case 3: {
                    integer0 = (int)0x7F080675;  // drawable:gs_wallet_vd_theme_24
                    break;
                }
                case 4: {
                    integer0 = (int)0x7F080612;  // drawable:gs_quick_share_vd_theme_24
                    break;
                }
                case 5: {
                    if(httz.d()) {
                        switch(ccow0.ordinal()) {
                            case 8: 
                            case 9: 
                            case 10: 
                            case 24: 
                            case 25: 
                            case 26: 
                            case 28: 
                            case 29: 
                            case 30: 
                            case 0x20: 
                            case 33: 
                            case 34: {
                                integer0 = (int)0x7F080519;  // drawable:gs_cloud_off_vd_theme_24
                                break;
                            }
                            case 11: 
                            case 27: 
                            case 0x1F: 
                            case 35: 
                            case 36: 
                            case 37: {
                                integer0 = (int)0x7F08051C;  // drawable:gs_cloud_upload_vd_theme_24
                                break;
                            }
                            case 38: {
                                integer0 = (int)0x7F08051E;  // drawable:gs_cloud_vd_theme_24
                                break;
                            }
                            default: {
                                integer0 = null;
                            }
                        }
                    }
                    else {
                        integer0 = (int)0x7F08051C;  // drawable:gs_cloud_upload_vd_theme_24
                    }
                    break;
                }
                case 6: {
                    integer0 = (int)0x7F080587;  // drawable:gs_google_vd_theme_24
                    break;
                }
                case 8: {
                    integer0 = (int)0x7F080576;  // drawable:gs_family_home_vd_theme_24
                    break;
                }
                case 9: {
                    integer0 = (int)0x7F080542;  // drawable:gs_devices_other_vd_theme_24
                    break;
                }
                default: {
                    integer0 = null;
                }
            }
            ibuq.f(clmu0, "cardId");
            ibuq.f(ccow0, "cardState");
            if(clmu0.ordinal() == 7) {
                switch(ccow0.ordinal()) {
                    case 20: {
                        integer1 = (int)0x7F080F29;  // drawable:speaker_icon_highlighted
                        goto label_57;
                    }
                    case 21: {
                        integer1 = (int)0x7F080F28;  // drawable:speaker_icon
                        goto label_57;
                    }
                }
            }
            integer1 = null;
        label_57:
            ccoq ccoq0 = ((clnf)object0).g;
            if(ccoq0 == null) {
                bvga0 = null;
            }
            else {
                ccou ccou0 = ccoq0.c;
                if((ccou0 instanceof ccos)) {
                    bvga0 = new bvga(((float)ccoq0.a), (ccoq0.b == null ? "" : ccoq0.b), bvgg.a);
                }
                else if((ccou0 instanceof ccot)) {
                    bvga0 = new bvga(((float)ccoq0.a), (ccoq0.b == null ? "" : ccoq0.b), bvgh.a);
                }
                else {
                    if(!(ccou0 instanceof ccor)) {
                        throw new ibnq();
                    }
                    bvga0 = new bvga(((float)ccoq0.a), (ccoq0.b == null ? "" : ccoq0.b), bvgf.a);
                }
            }
            ccmy ccmy0 = ((clnf)object0).e;
            ibts ibts0 = ccmy0 == null ? null : bvhi.c(ccmy0);
            ccnf ccnf0 = ((clnf)object0).f;
            if((ccnf0 instanceof ccnd)) {
                bvfp0 = bvfp.a;
            }
            else {
                if((ccnf0 instanceof ccne)) {
                    bvfq0 = new bvfq(bvhi.a(((ccne)ccnf0).a, s));
                }
                else {
                    if(!(ccnf0 instanceof ccnc)) {
                        throw new ibnq();
                    }
                    bvfq0 = new bvfo(bvhi.a(((ccnc)ccnf0).a, s), bvhi.a(((ccnc)ccnf0).b, s));
                }
                bvfp0 = bvfq0;
            }
            cmhx cmhx0 = bvhi.d(0x30479, null, null, new bvhh(((clnf)object0), s), 6);
            switch(((clnf)object0).h.ordinal()) {
                case 0: {
                    bvfs0 = bvfs.a;
                    break;
                }
                case 1: {
                    bvfs0 = bvfs.b;
                    break;
                }
                default: {
                    throw new ibnq();
                }
            }
            list1.add(new bvgk(s1, s2, z1, integer0, integer1, bvga0, ibts0, bvfp0, z, cmhx0, bvfs0));
            continue;
        }
        return list1;
    }

    public final void e(Activity activity0, cmkg cmkg0, String s) {
        String s1 = htvh.a.b().b();
        ibuq.f(activity0, "activity");
        bkyf bkyf0 = new bkyf(activity0);
        bkyf0.d = s1;
        if(s != null) {
            bkyf0.b = s;
        }
        bkyf0.e(new cmkh(cmkg0), true);
        bkyf0.a = azts.Z(activity0.getContainerActivity());
        FeedbackOptions feedbackOptions0 = bkyf0.a();
        this.v.a.ab(feedbackOptions0);
    }

    public final void f(String s, String s1, clmw clmw0) {
        clmv clmv0;
        if(s == null && s1 != null) {
            clmv0 = clmv.c;
            goto label_5;
        }
        else if(s != null && s1 == null) {
            clmv0 = clmv.d;
        label_5:
            cmhi cmhi0 = this.u;
            cmgo cmgo0 = cmgn.a(((ProtoLiteMessage)cmft.a).v_newBuilder());
            cmgf cmgf0 = cmge.a(((ProtoLiteMessage)cmfe.a).v_newBuilder());
            clna clna0 = clmz.a(((ProtoLiteMessage)clmy.a).v_newBuilder());
            clna0.c();
            clnc clnc0 = clnb.a(((ProtoLiteMessage)clmx.a).v_newBuilder());
            clnc0.c(clmw0);
            clnc0.b(clmv0);
            clna0.b(clnc0.a());
            cmgf0.d(clna0.a());
            cmfe cmfe0 = cmgf0.a();
            ibuq.f(cmfe0, "value");
            ProtoLiteBuilder hftp0 = cmgo0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            cmft cmft0 = (cmft)hftp0.b_message;
            cmfe0.getClass();
            cmft0.e = cmfe0;
            cmft0.b |= 4;
            cmft cmft1 = cmgo0.a();
            if(!htva.c()) {
                s1 = null;
            }
            cmhi0.a(0x36304, cmft1, s1);
        }
    }

    public final void g() {
        icbb.b(lsc.a(this), null, null, new bviu(this, null), 3);
    }

    public final void h() {
        icbb.b(lsc.a(this), null, null, new bviv(this, null), 3);
    }

    private final icmq i(icig icig0) {
        return iclp.a(icig0, lsc.a(this), icmy.a(0L, 3), 1);
    }

    @Override  // lsb
    protected final void km() {
        this.s.f = null;
    }
}

