import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatus;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusRequest;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpFlexTimeWindow;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferRequest;
import com.google.android.gms.mobiledataplan.MdpPurchaseOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferResponse;
import com.google.android.gms.mobiledataplan.MdpUpsellPlan;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.consent.ConsentStatus;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationRequest;
import com.google.android.gms.mobiledataplan.consent.GetConsentInformationResponse;
import j..util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class crxn {
    private static final bboh a;
    private final chgo b;
    private final Context c;

    static {
        crxn.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public crxn(Context context0) {
        this.c = context0;
        this.b = chgo.v();
    }

    public final void A(int v, String s, Integer integer0, Long long0) {
        gizg gizg0 = this.D(28, "Error", s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizw.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gizv.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gizv)hftp2.b_message).b = v;
        gizv gizv0 = (gizv)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gizw gizw0 = (gizw)hftp1.b_message;
        gizv0.getClass();
        gizw0.e = gizv0;
        gizw0.b |= 4;
        gizw gizw1 = (gizw)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        gizw1.getClass();
        gizg1.A = gizw1;
        gizg1.b |= 0x10000;
        long v1 = long0 == null ? 0L : ((long)long0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v1;
        this.e(((gizg)hftp0.N_build()), hhct.cS, integer0);
        if(hvlb.d()) {
            this.e(((gizg)hftp0.N_build()), hhct.cW, integer0);
        }
    }

    public final void B(gspd gspd0, String s) {
        gizg gizg0 = this.D(27, "GTAF_Server", s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizw.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gizu.a).v_newBuilder();
        long v = gspd0.c;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gizu)hftp2.b_message).b = v;
        gizu gizu0 = (gizu)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gizw gizw0 = (gizw)hftp1.b_message;
        gizu0.getClass();
        gizw0.d = gizu0;
        gizw0.b |= 2;
        gizw gizw1 = (gizw)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        gizw1.getClass();
        gizg1.A = gizw1;
        gizg1.b |= 0x10000;
        long v1 = gspd0.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v1;
        this.e(((gizg)hftp0.N_build()), hhct.cR, Integer.valueOf(gspd0.h));
        if(hvlb.d()) {
            this.e(((gizg)hftp0.N_build()), hhct.cV, Integer.valueOf(gspd0.h));
        }
    }

    public final void C(gjac gjac0, hhct hhct0, Integer integer0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizh.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizh gizh0 = (gizh)hftp0.b_message;
        gjac0.getClass();
        hfuo hfuo0 = gizh0.b;
        if(!hfuo0.c()) {
            gizh0.b = ProtoLiteMessage.E(hfuo0);
        }
        gizh0.b.add(gjac0);
        gizh gizh1 = (gizh)hftp0.N_build();
        if(gizh1 == null) {
            return;
        }
        gizg gizg0 = this.D(9, "Ui", "MDP_UiAction");
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gizg0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizg)hftp1.b_message).o = gizh1;
        ((gizg)hftp1.b_message).b |= 0x20;
        this.e(((gizg)hftp1.N_build()), hhct0, integer0);
    }

    public final gizg D(int v, String s, String s1) {
        Context context0 = this.c;
        long v1 = -1L;
        if(context0 != null) {
            String s2 = csli.g(context0);
            if(!TextUtils.isEmpty(s2)) {
                Long long0 = crvw.c().p(s2);
                if(long0 != null) {
                    v1 = (long)long0;
                }
            }
        }
        return (gizg)this.aa(v, s, s1, v1).N_build();
    }

    public final void E(long v, long v1, int v2, long v3, int v4) {
        gizg gizg0 = this.D(3, "Error", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v3;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp1.b_message;
        giyl0.c = hfyp.b(v4);
        giyl giyl1 = (giyl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyl1.getClass();
        gizg1.v = giyl1;
        gizg1.b |= 0x800;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((giyz)hftv0).c = 4;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp2.b_message;
        ((giyz)hftv1).g = v;
        if(!hftv1.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((giyz)hftp2.b_message).f = v1;
        giyz giyz0 = (giyz)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg2 = (gizg)hftp0.b_message;
        giyz0.getClass();
        gizg2.r = giyz0;
        gizg2.b |= 0x100;
        if(hvlb.d()) {
            this.e(((gizg)hftp0.N_build()), hhct.bd, Integer.valueOf(v2));
        }
        this.e(((gizg)hftp0.N_build()), hhct.ba, Integer.valueOf(v2));
    }

    public final void F(MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0, long v, int v1) {
        gizg gizg0 = this.D(3, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giza.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        mdpCarrierPlanIdResponse0.a.getClass();
        ((giza)hftv0).b = mdpCarrierPlanIdResponse0.a;
        long v2 = mdpCarrierPlanIdResponse0.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giza)hftp1.b_message).c = v2;
        giza giza0 = (giza)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giza0.getClass();
        gizg1.i = giza0;
        gizg1.b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp2.b_message;
        giyl0.c = hfyp.b(v1);
        giyl giyl1 = (giyl)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg2 = (gizg)hftp0.b_message;
        giyl1.getClass();
        gizg2.v = giyl1;
        gizg2.b |= 0x800;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((giyz)hftv1).c = 3;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((giyz)hftp3.b_message).f = v;
        giyz giyz0 = (giyz)hftp3.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg3 = (gizg)hftp0.b_message;
        giyz0.getClass();
        gizg3.r = giyz0;
        gizg3.b |= 0x100;
        if(hvlb.d()) {
            this.e(((gizg)hftp0.N_build()), hhct.bc, mdpCarrierPlanIdResponse0.i);
        }
        this.e(((gizg)hftp0.N_build()), hhct.aZ, mdpCarrierPlanIdResponse0.i);
    }

    public final void G(int v, giyy giyy0, giym giym0) {
        gizg gizg0 = this.D(17, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((giyz)hftv0).c = v - 2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyz giyz0 = (giyz)hftp1.b_message;
        giyz0.d = giyy0.a();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyz giyz1 = (giyz)hftp1.b_message;
        giym0.getClass();
        giyz1.e = giym0;
        giyz1.b |= 1;
        giyz giyz2 = (giyz)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyz2.getClass();
        gizg1.r = giyz2;
        gizg1.b |= 0x100;
        this.d(((gizg)hftp0.N_build()), hhct.bs);
    }

    public final void H(int v, Integer integer0, Long long0) {
        this.I(6, v, false, 0, "", hhct.bF, 0, 0, integer0, long0);
    }

    public final void I(int v, int v1, boolean z, int v2, String s, hhct hhct0, int v3, int v4, Integer integer0, Long long0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giys.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giys)hftv0).b = v1 - 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((giys)hftv1).c = z;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((giys)hftv2).d = v2;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        s.getClass();
        ((giys)hftv3).e = s;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((giys)hftv4).f = v3;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giys)hftp0.b_message).g = v4;
        giys giys0 = (giys)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp1.b_message;
        ((giyz)hftv5).c = v - 2;
        if(!hftv5.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyz giyz0 = (giyz)hftp1.b_message;
        giys0.getClass();
        giyz0.j = giys0;
        giyz0.b |= 8;
        giyz giyz1 = (giyz)hftp1.N_build();
        gizg gizg0 = this.D(17, (v == 6 ? "Error" : "GTAF_Server"), "MDP_PeriodicService");
        ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp2.X(((ProtoLiteMessage)gizg0));
        long v5 = (long)long0;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gizg)hftp2.b_message).t = v5;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp2.b_message;
        giyz1.getClass();
        gizg1.r = giyz1;
        gizg1.b |= 0x100;
        this.e(((gizg)hftp2.N_build()), hhct0, integer0);
    }

    public final void J(hhct hhct0, int v, String s, String s1, int v1) {
        ProtoLiteBuilder hftp0 = this.aa(v, s, s1, -1L);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).D = v1;
        this.d(((gizg)hftp0.N_build()), hhct0);
    }

    public final void K(int v, hhct hhct0) {
        gizg gizg0 = this.D(21, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizc.a).v_newBuilder();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: csli.A(this.c, 1)) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gizz.a).v_newBuilder();
            String s = ((cslv)object0).b;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((gizz)hftv0).c = s;
            boolean z = ((cslv)object0).d;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((gizz)hftv1).d = z;
            long v1 = ((cslv)object0).c;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gizz)hftp2.b_message).e = v1;
            arrayList0.add(((gizz)hftp2.N_build()));
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gizc gizc0 = (gizc)hftp1.b_message;
        hfuo hfuo0 = gizc0.c;
        if(!hfuo0.c()) {
            gizc0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, gizc0.c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizc)hftp1.b_message).b = v - 2;
        gizc gizc1 = (gizc)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        gizc1.getClass();
        gizg1.w = gizc1;
        gizg1.b |= 0x1000;
        this.d(((gizg)hftp0.N_build()), hhct0);
    }

    public final void L(int v, hhct hhct0, Integer integer0, Long long0) {
        this.Z(v, 0L, hhct0, integer0, long0);
    }

    public final void M(int v, int v1) {
        int v7;
        Throwable throwable2;
        int v5;
        ArrayList arrayList1;
        Throwable throwable1;
        gizg gizg0 = this.D(20, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        cslu cslu0 = new cslu();
        ArrayList arrayList0 = new ArrayList();
        hfyq[] arr_hfyq = hfyq.values();
        int v2 = 0;
        for(Throwable throwable0 = null; v2 < arr_hfyq.length; throwable0 = throwable2) {
            hfyq hfyq0 = arr_hfyq[v2];
            if(hfyq0 != hfyq.g && hfyq0 != hfyq.a) {
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyg.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                giyg giyg0 = (giyg)hftp1.b_message;
                giyg0.b = hfyq0.a();
                cslz cslz0 = new cslz(cslu0.c.getLong(hfyq0.name(), 0L));
                int v3 = 0;
                while(v3 < 17) {
                    int v4 = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 1}[v3];
                    if(v4 == 1) {
                        throwable1 = throwable0;
                        arrayList1 = arrayList0;
                        v5 = v2;
                    }
                    else {
                        v5 = v2;
                        long v6 = cslz0.a;
                        throwable1 = throwable0;
                        arrayList1 = arrayList0;
                        if((((long)(1 << hfyp.b(v4))) | v6) == cslz0.a) {
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            giyg giyg1 = (giyg)hftp1.b_message;
                            if(v4 == 0) {
                                throw throwable1;
                            }
                            hfuf hfuf0 = giyg1.c;
                            if(!hfuf0.c()) {
                                giyg1.c = ProtoLiteMessage.C(hfuf0);
                            }
                            giyg1.c.i(hfyp.b(v4));
                        }
                    }
                    ++v3;
                    v2 = v5;
                    throwable0 = throwable1;
                    arrayList0 = arrayList1;
                }
                throwable2 = throwable0;
                v7 = v2;
                arrayList0.add(((giyg)hftp1.N_build()));
            }
            else {
                throwable2 = throwable0;
                v7 = v2;
            }
            v2 = v7 + 1;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)giyh.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        ((giyh)hftv0).b = v - 2;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        giyh giyh0 = (giyh)hftp3.b_message;
        hfuo hfuo0 = giyh0.c;
        if(!hfuo0.c()) {
            giyh0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, giyh0.c);
        giyh giyh1 = (giyh)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp2.b_message;
        giyh1.getClass();
        giyl0.f = giyh1;
        giyl0.b |= 2;
        giyl giyl1 = (giyl)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyl1.getClass();
        gizg1.v = giyl1;
        gizg1.b |= 0x800;
        this.e(((gizg)hftp0.N_build()), hhct.bH, Integer.valueOf(v1));
    }

    public final void N(hfyq hfyq0, int v, int v1) {
        gizg gizg0 = this.D(20, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        if(hfyq0 == null) {
            hfyq0 = hfyq.a;
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp1.b_message;
        giyl0.d = hfyq0.a();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyf.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((giyf)hftp2.b_message).b = v - 2;
        giyf giyf0 = (giyf)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl1 = (giyl)hftp1.b_message;
        giyf0.getClass();
        giyl1.i = giyf0;
        giyl1.b |= 16;
        giyl giyl2 = (giyl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyl2.getClass();
        gizg1.v = giyl2;
        gizg1.b |= 0x800;
        this.e(((gizg)hftp0.N_build()), hhct.bM, Integer.valueOf(v1));
    }

    public final void O(hhct hhct0, int v, String s, String s1) {
        this.d(this.D(v, s, s1), hhct0);
    }

    public final void P(int v, String s, String s1, Long long0, hhct hhct0, long v1, Integer integer0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjac.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjac)hftv0).e = v1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjac gjac0 = (gjac)hftp0.b_message;
        gjac0.d = gjab.a(v);
        if(s != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjac)hftp0.b_message).c = s;
        }
        if(s1 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjac)hftp0.b_message).b = s1;
        }
        if(long0 != null) {
            long v2 = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjac)hftp0.b_message).f = v2;
        }
        this.C(((gjac)hftp0.N_build()), hhct0, integer0);
    }

    public final void Q(int v, String s, String s1, hhct hhct0, long v1, Integer integer0) {
        this.P(v, s, s1, null, hhct0, v1, integer0);
    }

    public final void R(int v, Integer integer0, int v1, hhct hhct0, long v2, Integer integer1) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjac.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gjac)hftv0).e = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjac gjac0 = (gjac)hftp0.b_message;
        gjac0.d = gjab.a(v);
        if(integer0 != null) {
            int v3 = (int)integer0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gjac)hftp0.b_message).g = v3;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gjac)hftp0.b_message).h = v1;
        this.C(((gjac)hftp0.N_build()), hhct0, integer1);
    }

    public final void S(hhct hhct0, int v, String s, Optional optional0, Optional optional1, long v1) {
        ProtoLiteBuilder hftp0 = this.aa(v, "Ui", "MDP_UiAction", v1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg0 = (gizg)hftp0.b_message;
        s.getClass();
        gizg0.e = s;
        if(optional0.isPresent()) {
            String s1 = (String)optional0.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            s1.getClass();
            gizg1.F = s1;
        }
        if(optional1.isPresent()) {
            String s2 = (String)optional1.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg2 = (gizg)hftp0.b_message;
            s2.getClass();
            gizg2.G = s2;
        }
        this.d(((gizg)hftp0.N_build()), hhct0);
    }

    public static void T(ProtoLiteBuilder hftp0, Bundle bundle0) {
        if(bundle0 != null) {
            giyp giyp0 = ((gizg)hftp0.b_message).f;
            if(giyp0 == null) {
                giyp0 = giyp.a;
            }
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)giyp0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)giyp0));
            if(!bundle0.getString("client_package_name", "").isEmpty()) {
                String s = bundle0.getString("client_package_name");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                giyp giyp1 = (giyp)hftp1.b_message;
                s.getClass();
                giyp1.h = s;
            }
            if(!bundle0.getString("client_version_name", "").isEmpty()) {
                String s1 = bundle0.getString("client_version_name");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                giyp giyp2 = (giyp)hftp1.b_message;
                s1.getClass();
                giyp2.i = s1;
            }
            if(bundle0.getLong("client_version_code") != 0L) {
                long v = bundle0.getLong("client_version_code");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((giyp)hftp1.b_message).j = v;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg0 = (gizg)hftp0.b_message;
            giyp giyp3 = (giyp)hftp1.N_build();
            giyp3.getClass();
            gizg0.f = giyp3;
            gizg0.b |= 1;
        }
    }

    public final void U(ProtoLiteBuilder hftp0, Bundle bundle0, hhct hhct0, long v, String s, Integer integer0, Long long0) {
        if(hvkk.h()) {
            crxn.T(hftp0, bundle0);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).h = v;
        long v1 = long0 == null ? 0L : ((long)long0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gizg)hftv0).t = v1;
        if(s == null) {
            s = "";
        }
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).e = s;
        this.e(((gizg)hftp0.N_build()), hhct0, integer0);
    }

    public final void V(String s, int v, int v1, int v2, long v3, List list0) {
        giyt giyt0 = (giyt)((ProtoLiteMessage)giyv.a).v_newBuilder();
        String s1 = cslm.k(bbqr.c(s));
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv0 = (giyv)giyt0.b_message;
        s1.getClass();
        giyv0.b = s1;
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv1 = (giyv)giyt0.b_message;
        giyv1.g = giyu.a(2);
        if(!bbnh.k(list0)) {
            giyt0.a(list0);
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giyz)hftp0.b_message).c = v - 2;
        giyv giyv2 = (giyv)((ProtoLiteBuilder)giyt0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giyz giyz0 = (giyz)hftp0.b_message;
        giyv2.getClass();
        giyz0.i = giyv2;
        giyz0.b |= 4;
        giyz giyz1 = (giyz)hftp0.N_build();
        gizg gizg0 = this.D(17, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gizg0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizg)hftp1.b_message).t = v3;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        giyz1.getClass();
        ((gizg)hftv0).r = giyz1;
        ((gizg)hftv0).b |= 0x100;
        if(v1 != 0) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizg)hftp1.b_message).h = (long)v1;
        }
        this.e(((gizg)hftp1.N_build()), hhct.be, Integer.valueOf(v2));
    }

    private static int W(long v) {
        int v1 = 0;
        if(Long.compare(v, 0L) >= 0) {
            while(v1 < hvkk.b().b.size() && v >= hvkk.b().b.a(v1)) {
                ++v1;
            }
            return v1 + 1;
        }
        return 0;
    }

    private static int X(long v) {
        int v1 = 0;
        if(Long.compare(v, 0L) >= 0) {
            while(v1 < hvkk.c().b.size()) {
                if(v < hvkk.c().b.a(v1)) {
                    return v1;
                }
                ++v1;
            }
            return v1 + 1;
        }
        return 0;
    }

    private static String Y(String s) {
        if(s == null) {
            return null;
        }
        return s.length() <= 0x20 ? s : s.substring(0, 0x20);
    }

    private final void Z(int v, long v1, hhct hhct0, Integer integer0, Long long0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((giyz)hftp0.b_message).c = v - 2;
        giyz giyz0 = (giyz)hftp0.N_build();
        gizg gizg0 = this.D(17, (v == 6 ? "Error" : "GTAF_Server"), "MDP_PeriodicService");
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gizg0));
        long v2 = long0 == null ? 0L : ((long)long0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizg)hftp1.b_message).t = v2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        giyz0.getClass();
        ((gizg)hftv0).r = giyz0;
        ((gizg)hftv0).b |= 0x100;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizg)hftp1.b_message).h = v1;
        this.e(((gizg)hftp1.N_build()), hhct0, integer0);
    }

    public static int a() {
        return UUID.randomUUID().hashCode();
    }

    private final ProtoLiteBuilder aa(int v, String s, String s1, long v1) {
        int v2;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gizg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gizg)hftv0).c = v - 2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gizg)hftv1).d = s1;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).g = s;
        Context context0 = this.c;
        if(context0 == null) {
            v2 = 2;
        }
        else if(!csli.s(context0)) {
            v2 = csli.w(context0) ? 4 : 3;
        }
        else if(!csli.w(context0)) {
            v2 = 5;
        }
        else {
            v2 = 6;
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giyp)hftp1.b_message).b = v1;
        int v3 = csln.b(context0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((giyp)hftv2).f = v3;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((giyp)hftv3).e = "MDP Module";
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giyp)hftp1.b_message).g = v2 - 2;
        if(hvkk.a.d().k()) {
            String s2 = bbqr.c(csli.k(context0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((giyp)hftp1.b_message).k = s2;
            List list0 = csli.o(context0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giyp giyp0 = (giyp)hftp1.b_message;
            hfuo hfuo0 = giyp0.l;
            if(!hfuo0.c()) {
                giyp0.l = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, giyp0.l);
        }
        giyp giyp1 = (giyp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg0 = (gizg)hftp0.b_message;
        giyp1.getClass();
        gizg0.f = giyp1;
        gizg0.b |= 1;
        return hftp0;
    }

    public static long b() {
        return UUID.randomUUID().getLeastSignificantBits();
    }

    public static crxn c() {
        return new crxn(AppContextProvider.a());
    }

    public final void d(gizg gizg0, hhct hhct0) {
        this.e(gizg0, hhct0, null);
    }

    public final void e(gizg gizg0, hhct hhct0, Integer integer0) {
        if(integer0 == null) {
            integer0 = (int)0;
        }
        chgo chgo0 = this.b;
        if(chgo0 == null) {
            ((ggtj)crxn.a.j()).R("%s: eventCode: %s logging FAILED", "CCLog", hhct0);
            return;
        }
        cczb cczb0 = chgo0.c(((ProtoLiteMessage)gizg0));
        cczb0.c = (int)hhct0.es;
        cczb0.e = (long)(((int)integer0));
        cczb0.a();
    }

    public final void f(haut haut0, gizm gizm0, String s, hhct hhct0) {
        this.g(haut0, gizm0, s, hhct0, 0L, 0L);
    }

    public final void g(haut haut0, gizm gizm0, String s, hhct hhct0, long v, long v1) {
        this.h(haut0, gizm0, s, hhct0, v, v1, -1);
    }

    public final void h(haut haut0, gizm gizm0, String s, hhct hhct0, long v, long v1, int v2) {
        if(haut0 == null) {
            haut0 = haut.a;
        }
        int v3 = 12;
        gizg gizg0 = this.D(12, "GTAF_Server", s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizo.a).v_newBuilder();
        if(gizm0 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizo gizo0 = (gizo)hftp1.b_message;
            gizo0.d = gizm0.a();
        }
        long v4 = haut0.d;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gizo)hftv0).c = v4;
        int v5 = haut0.b;
        if(haus.a(v5) == haus.a) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizo)hftp1.b_message).e = 1;
            hauw hauw0 = haut0.b == 2 ? ((hauw)haut0.c) : hauw.a;
            hfwn hfwn0 = hauw0.d == null ? hfwn.a : hauw0.d;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizo gizo1 = (gizo)hftp1.b_message;
            hfwn0.getClass();
            gizo1.i = hfwn0;
            gizo1.b |= 1;
            int v6 = haut0.b;
            if(((v6 == 2 ? ((hauw)haut0.c) : hauw.a).b & 4) != 0) {
                hauw hauw1 = v6 == 2 ? ((hauw)haut0.c) : hauw.a;
                hauq hauq0 = hauw1.e == null ? hauq.a : hauw1.e;
                String s1 = hauq0.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo2 = (gizo)hftp1.b_message;
                s1.getClass();
                gizo2.f = s1;
                String s2 = crxn.Y(hauq0.d);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                s2.getClass();
                ((gizo)hftv1).g = s2;
                int v7 = hava.b(hauq0.i) == 0 ? 1 : hava.b(hauq0.i);
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo3 = (gizo)hftp1.b_message;
                gizo3.h = hava.a(v7);
                String s3 = hauq0.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizg gizg1 = (gizg)hftp0.b_message;
                s3.getClass();
                gizg1.e = s3;
            }
        }
        else if(haus.a(v5) == haus.b) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizo)hftp1.b_message).e = 2;
            haux haux0 = haut0.b == 3 ? ((haux)haut0.c) : haux.a;
            hfwn hfwn1 = haux0.d == null ? hfwn.a : haux0.d;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizo gizo4 = (gizo)hftp1.b_message;
            hfwn1.getClass();
            gizo4.i = hfwn1;
            gizo4.b |= 1;
            int v8 = haut0.b;
            if(((v8 == 3 ? ((haux)haut0.c) : haux.a).b & 4) != 0) {
                haux haux1 = v8 == 3 ? ((haux)haut0.c) : haux.a;
                hauq hauq1 = haux1.e == null ? hauq.a : haux1.e;
                String s4 = hauq1.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo5 = (gizo)hftp1.b_message;
                s4.getClass();
                gizo5.f = s4;
                String s5 = crxn.Y(hauq1.d);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo6 = (gizo)hftp1.b_message;
                s5.getClass();
                gizo6.g = s5;
                String s6 = hauq1.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizg gizg2 = (gizg)hftp0.b_message;
                s6.getClass();
                gizg2.e = s6;
                int v9 = hava.b(hauq1.i) == 0 ? 1 : hava.b(hauq1.i);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo7 = (gizo)hftp1.b_message;
                gizo7.h = hava.a(v9);
            }
        }
        else if(haus.a(v5) == haus.c) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizo)hftp1.b_message).e = 3;
            hauu hauu0 = haut0.b == 4 ? ((hauu)haut0.c) : hauu.a;
            hfwn hfwn2 = hauu0.c == null ? hfwn.a : hauu0.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizo gizo8 = (gizo)hftp1.b_message;
            hfwn2.getClass();
            gizo8.i = hfwn2;
            gizo8.b |= 1;
            int v10 = haut0.b;
            if(((v10 == 4 ? ((hauu)haut0.c) : hauu.a).b & 2) != 0) {
                hauu hauu1 = v10 == 4 ? ((hauu)haut0.c) : hauu.a;
                hauq hauq2 = hauu1.d == null ? hauq.a : hauu1.d;
                String s7 = hauq2.c;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo9 = (gizo)hftp1.b_message;
                s7.getClass();
                gizo9.f = s7;
                String s8 = crxn.Y(hauq2.d);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo10 = (gizo)hftp1.b_message;
                s8.getClass();
                gizo10.g = s8;
                String s9 = hauq2.f;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizg gizg3 = (gizg)hftp0.b_message;
                s9.getClass();
                gizg3.e = s9;
                int v11 = hava.b(hauq2.i) == 0 ? 1 : hava.b(hauq2.i);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizo gizo11 = (gizo)hftp1.b_message;
                gizo11.h = hava.a(v11);
            }
        }
        else if(haus.a(v5) == haus.d) {
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizo)hftp1.b_message).e = 11;
            hauv hauv0 = haut0.b == 5 ? ((hauv)haut0.c) : hauv.a;
            hfwn hfwn3 = hauv0.c == null ? hfwn.a : hauv0.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizo gizo12 = (gizo)hftp1.b_message;
            hfwn3.getClass();
            gizo12.i = hfwn3;
            gizo12.b |= 1;
        }
        if(hvle.f()) {
            switch((gsoj.b(haut0.e) == null ? gsoj.q : gsoj.b(haut0.e)).ordinal()) {
                case 1: {
                    v3 = 3;
                    break;
                }
                case 2: {
                    v3 = 4;
                    break;
                }
                case 3: {
                    v3 = 5;
                    break;
                }
                case 4: {
                    v3 = 6;
                    break;
                }
                case 5: {
                    v3 = 7;
                    break;
                }
                case 6: {
                    v3 = 8;
                    break;
                }
                case 7: {
                    v3 = 9;
                    break;
                }
                case 8: {
                    v3 = 10;
                    break;
                }
                case 9: {
                    v3 = 11;
                    break;
                }
                case 10: {
                    break;
                }
                case 11: {
                    v3 = 102;
                    break;
                }
                default: {
                    v3 = 2;
                }
            }
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizo)hftp1.b_message).e = v3 - 2;
        }
        for(Object object0: haut0.g) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gizi.a).v_newBuilder();
            String s10 = ((hauy)object0).c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            s10.getClass();
            ((gizi)hftv2).c = s10;
            int v12 = hauz.b(((hauy)object0).b);
            if(v12 == 0) {
                v12 = 1;
            }
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            gizi gizi0 = (gizi)hftp2.b_message;
            gizi0.b = hauz.a(v12);
            gizi gizi1 = (gizi)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizo gizo13 = (gizo)hftp1.b_message;
            gizi1.getClass();
            hfuo hfuo0 = gizo13.l;
            if(!hfuo0.c()) {
                gizo13.l = ProtoLiteMessage.E(hfuo0);
            }
            gizo13.l.add(gizi1);
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((gizo)hftv3).m = v2;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((gizo)hftv4).j = v;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizo)hftp1.b_message).k = v1;
        gizo gizo14 = (gizo)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg4 = (gizg)hftp0.b_message;
        gizo14.getClass();
        gizg4.n = gizo14;
        gizg4.b |= 16;
        this.d(((gizg)hftp0.N_build()), hhct0);
    }

    public final void i(String s, int v, long v1) {
        gizg gizg0 = this.D(20, "GTAF_Server", "MDP_BgTask");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).e = bbqr.c(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v1;
        this.e(((gizg)hftp0.N_build()), hhct.bO, Integer.valueOf(v));
    }

    public final void j(giyo giyo0, String s, Integer integer0) {
        gizg gizg0 = this.D(19, "GTAF_Server", s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(giyo0 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).u = giyo0;
            ((gizg)hftp0.b_message).b |= 0x400;
        }
        this.e(((gizg)hftp0.N_build()), hhct.bx, integer0);
    }

    public final void k(boolean z, int v, String s, int v1, int v2, Integer integer0, Long long0) {
        this.I(5, 3, z, v, s, hhct.bE, v1, v2, integer0, long0);
    }

    public final void l(hhct hhct0, Integer integer0) {
        this.m(hhct0, new ArrayList(), null, integer0);
    }

    public final void m(hhct hhct0, List list0, hhcr hhcr0, Integer integer0) {
        gizg gizg0 = this.D(22, "Local_Cache", "MDP_BgTask");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyq.a).v_newBuilder();
        for(Object object0: list0) {
            String s = ((cslv)object0).b;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gizz.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((gizz)hftv0).c = s;
            hhcr hhcr1 = ((cslv)object0).e;
            if(hhcr1 != null) {
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gizz gizz0 = (gizz)hftp2.b_message;
                gizz0.f = hhcr1.a();
            }
            Long long0 = ((cslv)object0).f;
            if(long0 != null) {
                hfwn hfwn0 = hfyn.h(long0.longValue());
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gizz gizz1 = (gizz)hftp2.b_message;
                hfwn0.getClass();
                gizz1.g = hfwn0;
                gizz1.b |= 1;
            }
            gizz gizz2 = (gizz)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giyq giyq0 = (giyq)hftp1.b_message;
            gizz2.getClass();
            hfuo hfuo0 = giyq0.b;
            if(!hfuo0.c()) {
                giyq0.b = ProtoLiteMessage.E(hfuo0);
            }
            giyq0.b.add(gizz2);
        }
        if(hhcr0 != null) {
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giyq giyq1 = (giyq)hftp1.b_message;
            giyq1.c = hhcr0.a();
        }
        giyq giyq2 = (giyq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyq2.getClass();
        gizg1.y = giyq2;
        gizg1.b |= 0x4000;
        this.e(((gizg)hftp0.N_build()), hhct0, integer0);
    }

    public final void n(hhct hhct0, long v, String s, String s1, Integer integer0, Long long0) {
        this.o(null, hhct0, v, s, s1, integer0, long0);
    }

    public final void o(Bundle bundle0, hhct hhct0, long v, String s, String s1, Integer integer0, Long long0) {
        gizg gizg0 = this.D(3, "Error", s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        this.U(hftp0, bundle0, hhct0, v, s1, integer0, long0);
    }

    public final void p(hhct hhct0, String s, Optional optional0, Optional optional1, long v, long v1) {
        ProtoLiteBuilder hftp0 = this.aa(30, "Error", "MDP_UiAction", v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg0 = (gizg)hftp0.b_message;
        s.getClass();
        gizg0.e = s;
        if(v1 != 0L) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).h = v1;
        }
        if(optional0.isPresent()) {
            String s1 = (String)optional0.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            s1.getClass();
            gizg1.F = s1;
        }
        if(optional1.isPresent()) {
            String s2 = (String)optional1.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg2 = (gizg)hftp0.b_message;
            s2.getClass();
            gizg2.G = s2;
        }
        this.d(((gizg)hftp0.N_build()), hhct0);
    }

    public final void q(hhct hhct0, String s, Optional optional0, Optional optional1, long v, long v1) {
        ProtoLiteBuilder hftp0 = this.aa(33, "Rpc", "MDP_UiAction", v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg0 = (gizg)hftp0.b_message;
        s.getClass();
        gizg0.e = s;
        if(optional0.isPresent()) {
            String s1 = (String)optional0.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp0.b_message;
            s1.getClass();
            gizg1.F = s1;
        }
        if(optional1.isPresent()) {
            String s2 = (String)optional1.get();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gizg gizg2 = (gizg)hftp0.b_message;
            s2.getClass();
            gizg2.G = s2;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).h = v1;
        this.d(((gizg)hftp0.N_build()), hhct0);
    }

    public final void r(hhct hhct0, String s, Optional optional0, Optional optional1, long v) {
        this.S(hhct0, 0x20, s, optional0, optional1, v);
    }

    public final void s(long v, hhct hhct0, Integer integer0, Long long0) {
        this.Z(6, v, hhct0, integer0, long0);
    }

    public final void t(giyv giyv0, Integer integer0, Long long0) {
        giyt giyt0 = (giyt)((ProtoLiteMessage)giyv.a).w(((ProtoLiteMessage)giyv0));
        String s = cslm.k(bbqr.c(giyv0.b));
        if(!giyt0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)giyt0).ensureMutable();
        }
        giyv giyv1 = (giyv)giyt0.b_message;
        s.getClass();
        giyv1.b = s;
        giyv giyv2 = (giyv)((ProtoLiteBuilder)giyt0).N_build();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giyz)hftv0).c = 6;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        giyz giyz0 = (giyz)hftp0.b_message;
        giyv2.getClass();
        giyz0.i = giyv2;
        giyz0.b |= 4;
        giyz giyz1 = (giyz)hftp0.N_build();
        gizg gizg0 = this.D(17, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)gizg0));
        long v = (long)long0;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizg)hftp1.b_message).t = v;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp1.b_message;
        giyz1.getClass();
        gizg1.r = giyz1;
        gizg1.b |= 0x100;
        this.e(((gizg)hftp1.N_build()), hhct.be, integer0);
    }

    public final void u(GetConsentInformationRequest getConsentInformationRequest0, GetConsentInformationResponse getConsentInformationResponse0, String s, String s1, gfsx gfsx0) {
        gizg gizg0 = this.D(14, "GTAF_Server", s1);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hvkk.h() && getConsentInformationRequest0 != null) {
            crxn.T(hftp0, getConsentInformationRequest0.e);
        }
        String s2 = bbqr.c(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).e = s2;
        long v = getConsentInformationResponse0.e == null ? 0L : ((long)getConsentInformationResponse0.e);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizf.a).v_newBuilder();
        ConsentStatus consentStatus0 = getConsentInformationResponse0.a;
        if(consentStatus0 != null) {
            hhcr hhcr0 = hhcr.b(consentStatus0.a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizf gizf0 = (gizf)hftp1.b_message;
            gizf0.c = hhcr0.a();
        }
        Long long0 = getConsentInformationResponse0.c;
        if(long0 != null) {
            hfwn hfwn0 = hfyn.h(long0.longValue());
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizf gizf1 = (gizf)hftp1.b_message;
            hfwn0.getClass();
            gizf1.d = hfwn0;
            gizf1.b |= 1;
        }
        if(hvjq.f()) {
            int v1 = ((Status)gfsx0.f(Status.b)).i;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).h = (long)v1;
            ConsentAgreementText consentAgreementText0 = getConsentInformationResponse0.b;
            if(consentAgreementText0 != null) {
                int v2 = consentAgreementText0.g;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((gizf)hftv0).e = v2;
                String s3 = getConsentInformationResponse0.b.h;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizf gizf2 = (gizf)hftp1.b_message;
                s3.getClass();
                gizf2.f = s3;
            }
        }
        gizf gizf3 = (gizf)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        gizf3.getClass();
        gizg1.p = gizf3;
        gizg1.b |= 0x40;
        this.e(((gizg)hftp0.N_build()), hhct.r, getConsentInformationResponse0.d);
    }

    public final void v(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0, MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0, boolean z, String s) {
        gizg gizg0 = this.D(3, (z ? "Local_Cache" : "GTAF_Server"), s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hvkk.h() && mdpCarrierPlanIdRequest0 != null) {
            crxn.T(hftp0, mdpCarrierPlanIdRequest0.b);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        long v = 0L;
        ((gizg)hftp0.b_message).h = 0L;
        Long long0 = mdpCarrierPlanIdResponse0.j;
        if(long0 != null) {
            v = (long)long0;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giza.a).v_newBuilder();
        String s1 = mdpCarrierPlanIdResponse0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s1.getClass();
        ((giza)hftv0).b = s1;
        long v1 = mdpCarrierPlanIdResponse0.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((giza)hftp1.b_message).c = v1;
        giza giza0 = (giza)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giza0.getClass();
        gizg1.i = giza0;
        gizg1.b |= 2;
        if(hvlb.d()) {
            this.e(((gizg)hftp0.N_build()), hhct.e, mdpCarrierPlanIdResponse0.i);
        }
        this.e(((gizg)hftp0.N_build()), hhct.d, mdpCarrierPlanIdResponse0.i);
    }

    public final void w(MdpDataPlanStatusRequest mdpDataPlanStatusRequest0, MdpDataPlanStatusResponse mdpDataPlanStatusResponse0, boolean z, String s) {
        gizg gizg0 = this.D(5, (z ? "Local_Cache" : "GTAF_Server"), s);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hvkk.h() && mdpDataPlanStatusRequest0 != null) {
            crxn.T(hftp0, mdpDataPlanStatusRequest0.b);
        }
        String s1 = mdpDataPlanStatusResponse0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        s1.getClass();
        gizg1.e = s1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        long v = 0L;
        ((gizg)hftp0.b_message).h = 0L;
        Long long0 = mdpDataPlanStatusResponse0.g;
        if(long0 != null) {
            v = (long)long0;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gizg)hftv0).t = v;
        MdpDataPlanStatus[] arr_mdpDataPlanStatus = mdpDataPlanStatusResponse0.b;
        if(arr_mdpDataPlanStatus != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).j = hfvv.a;
            for(int v1 = 0; v1 < arr_mdpDataPlanStatus.length; ++v1) {
                MdpDataPlanStatus mdpDataPlanStatus0 = arr_mdpDataPlanStatus[v1];
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizb.a).v_newBuilder();
                String s2 = mdpDataPlanStatus0.b;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gizb gizb0 = (gizb)hftp1.b_message;
                s2.getClass();
                gizb0.b = s2;
                long v2 = csly.b(mdpDataPlanStatus0.c);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((gizb)hftv1).c = v2;
                String s3 = mdpDataPlanStatus0.d;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                s3.getClass();
                ((gizb)hftv2).d = s3;
                long v3 = mdpDataPlanStatus0.o;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((gizb)hftp1.b_message).g = v3;
                if(hvkk.a.d().g()) {
                    int v8 = gsno.b(crxn.W(mdpDataPlanStatus0.e));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gizb gizb1 = (gizb)hftp1.b_message;
                    gizb1.k = gsno.a(v8);
                    int v9 = gsno.b(crxn.X(mdpDataPlanStatus0.f));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gizb gizb2 = (gizb)hftp1.b_message;
                    gizb2.l = gsno.a(v9);
                    int v10 = gsno.b(crxn.W(mdpDataPlanStatus0.p));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gizb gizb3 = (gizb)hftp1.b_message;
                    gizb3.m = gsno.a(v10);
                    int v11 = gsno.b(crxn.X(mdpDataPlanStatus0.q));
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gizb gizb4 = (gizb)hftp1.b_message;
                    gizb4.n = gsno.a(v11);
                }
                else {
                    long v4 = mdpDataPlanStatus0.e;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp1.b_message;
                    ((gizb)hftv3).e = v4;
                    long v5 = mdpDataPlanStatus0.f;
                    if(!hftv3.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp1.b_message;
                    ((gizb)hftv4).f = v5;
                    long v6 = mdpDataPlanStatus0.p;
                    if(!hftv4.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp1.b_message;
                    ((gizb)hftv5).h = v6;
                    long v7 = mdpDataPlanStatus0.q;
                    if(!hftv5.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gizb)hftp1.b_message).i = v7;
                }
                MdpFlexTimeWindow[] arr_mdpFlexTimeWindow = mdpDataPlanStatus0.g;
                if(arr_mdpFlexTimeWindow != null) {
                    for(int v12 = 0; v12 < arr_mdpFlexTimeWindow.length; ++v12) {
                        MdpFlexTimeWindow mdpFlexTimeWindow0 = arr_mdpFlexTimeWindow[v12];
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gize.a).v_newBuilder();
                        String s4 = mdpFlexTimeWindow0.a;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        gize gize0 = (gize)hftp2.b_message;
                        s4.getClass();
                        gize0.b = s4;
                        long v13 = csly.c(mdpFlexTimeWindow0.b);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gize)hftp2.b_message).c = v13;
                        long v14 = csly.c(mdpFlexTimeWindow0.c);
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv6 = hftp2.b_message;
                        ((gize)hftv6).d = v14;
                        int v15 = mdpFlexTimeWindow0.d;
                        if(!hftv6.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((gize)hftp2.b_message).e = v15;
                        gize gize1 = (gize)hftp2.N_build();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gizb gizb5 = (gizb)hftp1.b_message;
                        gize1.getClass();
                        hfuo hfuo0 = gizb5.j;
                        if(!hfuo0.c()) {
                            gizb5.j = ProtoLiteMessage.E(hfuo0);
                        }
                        gizb5.j.add(gize1);
                    }
                }
                gizb gizb6 = (gizb)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizg gizg2 = (gizg)hftp0.b_message;
                gizb6.getClass();
                hfuo hfuo1 = gizg2.j;
                if(!hfuo1.c()) {
                    gizg2.j = ProtoLiteMessage.E(hfuo1);
                }
                gizg2.j.add(gizb6);
            }
        }
        int v16 = 2;
        if(hvlq.w()) {
            if(mdpDataPlanStatusResponse0.e == null) {
                v16 = 3;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).E = v16 - 2;
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).E = 0;
        }
        this.e(((gizg)hftp0.N_build()), hhct.i, mdpDataPlanStatusResponse0.f);
    }

    public final void x(MdpPurchaseOfferRequest mdpPurchaseOfferRequest0, MdpPurchaseOfferResponse mdpPurchaseOfferResponse0, String s, String s1) {
        gizg gizg0 = this.D(11, "GTAF_Server", s1);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hvkk.h() && mdpPurchaseOfferRequest0 != null) {
            crxn.T(hftp0, mdpPurchaseOfferRequest0.e);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gizq.a).v_newBuilder();
        String s2 = mdpPurchaseOfferResponse0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s2.getClass();
        ((gizq)hftv0).b = s2;
        String s3 = mdpPurchaseOfferResponse0.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        s3.getClass();
        ((gizq)hftv1).c = s3;
        String s4 = mdpPurchaseOfferResponse0.d;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gizq gizq0 = (gizq)hftp1.b_message;
        s4.getClass();
        gizq0.d = s4;
        long v = csly.b(mdpPurchaseOfferResponse0.g);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gizq)hftp1.b_message).f = v;
        gizq gizq1 = (gizq)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        gizq1.getClass();
        gizg1.m = gizq1;
        gizg1.b |= 8;
        String s5 = bbqr.c(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).e = s5;
        long v1 = mdpPurchaseOfferResponse0.j == null ? 0L : ((long)mdpPurchaseOfferResponse0.j);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).t = v1;
        this.e(((gizg)hftp0.N_build()), hhct.o, mdpPurchaseOfferResponse0.i);
    }

    public final void y(MdpUpsellOfferRequest mdpUpsellOfferRequest0, MdpUpsellOfferResponse mdpUpsellOfferResponse0, String s, boolean z, String s1) {
        gizg gizg0 = this.D(7, (z ? "Local_Cache" : "GTAF_Server"), s1);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        if(hvkk.h() && mdpUpsellOfferRequest0 != null) {
            crxn.T(hftp0, mdpUpsellOfferRequest0.b);
        }
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gjae.a).v_newBuilder();
        String s2 = mdpUpsellOfferResponse0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        s2.getClass();
        ((gjae)hftv0).b = s2;
        String s3 = mdpUpsellOfferResponse0.b;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        s3.getClass();
        ((gjae)hftv1).c = s3;
        String s4 = mdpUpsellOfferResponse0.c;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gjae gjae0 = (gjae)hftp1.b_message;
        s4.getClass();
        gjae0.d = s4;
        MdpUpsellPlan[] arr_mdpUpsellPlan = mdpUpsellOfferResponse0.e;
        if(arr_mdpUpsellPlan != null) {
            for(int v = 0; v < arr_mdpUpsellPlan.length; ++v) {
                MdpUpsellPlan mdpUpsellPlan0 = arr_mdpUpsellPlan[v];
                int v1 = hgky.b(mdpUpsellPlan0.k);
                switch(v1) {
                    case 0: {
                        throw null;
                    }
                    case 1: {
                        v1 = 2;
                    }
                }
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gjaf.a).v_newBuilder();
                String s5 = mdpUpsellPlan0.b;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                s5.getClass();
                ((gjaf)hftv2).c = s5;
                String s6 = mdpUpsellPlan0.a;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp2.b_message;
                s6.getClass();
                ((gjaf)hftv3).b = s6;
                String s7 = mdpUpsellPlan0.c;
                if(!hftv3.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp2.b_message;
                s7.getClass();
                ((gjaf)hftv4).d = s7;
                long v2 = mdpUpsellPlan0.d;
                if(!hftv4.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp2.b_message;
                ((gjaf)hftv5).e = v2;
                String s8 = mdpUpsellPlan0.e;
                if(!hftv5.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp2.b_message;
                s8.getClass();
                ((gjaf)hftv6).f = s8;
                String s9 = mdpUpsellPlan0.f;
                if(!hftv6.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp2.b_message;
                s9.getClass();
                ((gjaf)hftv7).g = s9;
                long v3 = mdpUpsellPlan0.g;
                if(!hftv7.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv8 = hftp2.b_message;
                ((gjaf)hftv8).h = v3;
                long v4 = mdpUpsellPlan0.h;
                if(!hftv8.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv9 = hftp2.b_message;
                ((gjaf)hftv9).i = v4;
                String s10 = mdpUpsellPlan0.i;
                if(!hftv9.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv10 = hftp2.b_message;
                s10.getClass();
                ((gjaf)hftv10).j = s10;
                if(!hftv10.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gjaf gjaf0 = (gjaf)hftp2.b_message;
                gjaf0.k = hgky.a(v1);
                gjaf gjaf1 = (gjaf)hftp2.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gjae gjae1 = (gjae)hftp1.b_message;
                gjaf1.getClass();
                hfuo hfuo0 = gjae1.e;
                if(!hfuo0.c()) {
                    gjae1.e = ProtoLiteMessage.E(hfuo0);
                }
                gjae1.e.add(gjaf1);
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gizg)hftp0.b_message).k = hfvv.a;
        gjae gjae2 = (gjae)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        gjae2.getClass();
        hfuo hfuo1 = gizg1.k;
        if(!hfuo1.c()) {
            gizg1.k = ProtoLiteMessage.E(hfuo1);
        }
        gizg1.k.add(gjae2);
        long v5 = mdpUpsellOfferResponse0.h == null ? 0L : ((long)mdpUpsellOfferResponse0.h);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv11 = hftp0.b_message;
        ((gizg)hftv11).t = v5;
        if(s != null) {
            if(!hftv11.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gizg)hftp0.b_message).e = s;
        }
        this.e(((gizg)hftp0.N_build()), hhct.l, mdpUpsellOfferResponse0.g);
    }

    public final void z(Intent intent0, gizm gizm0, String s, hhct hhct0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)haut.a).v_newBuilder();
        if(intent0 != null) {
            long v = intent0.getLongExtra("NOTIFICATION_LOGGING_NOTIFICATION_ID", 0L);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((haut)hftp0.b_message).d = v;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hauq.a).v_newBuilder();
            String s1 = intent0.getStringExtra("NOTIFICATION_LOGGING_REQUESTING_CPID") == null ? "" : intent0.getStringExtra("NOTIFICATION_LOGGING_REQUESTING_CPID");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hauq hauq0 = (hauq)hftp1.b_message;
            s1.getClass();
            hauq0.f = s1;
            int v2 = hava.b(intent0.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_GENRE", 0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hauq hauq1 = (hauq)hftp1.b_message;
            hauq1.i = hava.a(v2);
            if(hvkk.a.d().d()) {
                gsoj gsoj0 = gsoj.b(intent0.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                switch(haus.a(intent0.getIntExtra("NOTIFICATION_LOGGING_MESSAGE_CASE", haus.f.g)).ordinal()) {
                    case 0: {
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hauw.a).v_newBuilder();
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        hauw hauw0 = (hauw)hftp2.b_message;
                        hauq hauq2 = (hauq)hftp1.N_build();
                        hauq2.getClass();
                        hauw0.e = hauq2;
                        hauw0.b |= 4;
                        hauw hauw1 = (hauw)hftp2.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        haut haut0 = (haut)hftp0.b_message;
                        hauw1.getClass();
                        haut0.c = hauw1;
                        haut0.b = 2;
                        break;
                    }
                    case 1: {
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)haux.a).v_newBuilder();
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        haux haux0 = (haux)hftp3.b_message;
                        hauq hauq3 = (hauq)hftp1.N_build();
                        hauq3.getClass();
                        haux0.e = hauq3;
                        haux0.b |= 4;
                        haux haux1 = (haux)hftp3.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        haut haut1 = (haut)hftp0.b_message;
                        haux1.getClass();
                        haut1.c = haux1;
                        haut1.b = 3;
                        break;
                    }
                    case 2: {
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)hauu.a).v_newBuilder();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        hauu hauu0 = (hauu)hftp4.b_message;
                        hauq hauq4 = (hauq)hftp1.N_build();
                        hauq4.getClass();
                        hauu0.d = hauq4;
                        hauu0.b |= 2;
                        hauu hauu1 = (hauu)hftp4.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        haut haut2 = (haut)hftp0.b_message;
                        hauu1.getClass();
                        haut2.c = hauu1;
                        haut2.b = 4;
                    }
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                haut haut3 = (haut)hftp0.b_message;
                haut3.e = gsoj0.a();
            }
            else {
                int v3 = gizn.b(intent0.getIntExtra("NOTIFICATION_LOGGING_NOTIFICATION_TYPE", 0));
                if(v3 == 3) {
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)hauw.a).v_newBuilder();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    hauw hauw2 = (hauw)hftp5.b_message;
                    hauq hauq5 = (hauq)hftp1.N_build();
                    hauq5.getClass();
                    hauw2.e = hauq5;
                    hauw2.b |= 4;
                    hauw hauw3 = (hauw)hftp5.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    haut haut4 = (haut)hftp0.b_message;
                    hauw3.getClass();
                    haut4.c = hauw3;
                    haut4.b = 2;
                }
                else if(v3 == 4) {
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)haux.a).v_newBuilder();
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    haux haux2 = (haux)hftp6.b_message;
                    hauq hauq6 = (hauq)hftp1.N_build();
                    hauq6.getClass();
                    haux2.e = hauq6;
                    haux2.b |= 4;
                    haux haux3 = (haux)hftp6.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    haut haut5 = (haut)hftp0.b_message;
                    haux3.getClass();
                    haut5.c = haux3;
                    haut5.b = 3;
                }
                else if(v3 == 5) {
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)hauu.a).v_newBuilder();
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    hauu hauu2 = (hauu)hftp7.b_message;
                    hauq hauq7 = (hauq)hftp1.N_build();
                    hauq7.getClass();
                    hauu2.d = hauq7;
                    hauu2.b |= 2;
                    hauu hauu3 = (hauu)hftp7.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    haut haut6 = (haut)hftp0.b_message;
                    hauu3.getClass();
                    haut6.c = hauu3;
                    haut6.b = 4;
                }
            }
            String[] arr_s = intent0.getStringArrayExtra("NOTIFICATION_ACTION_LABELS");
            int[] arr_v = intent0.getIntArrayExtra("NOTIFICATION_ACTION_TYPES");
            if(arr_s != null && arr_v != null) {
                if(arr_s.length != arr_v.length) {
                    ((ggtj)crxn.a.j()).X("%s: Action label and action type arrays are different lengths! Labels: %s Types: %s", "CCLog", new gpnd(gpnc.a, ((int)arr_s.length)), new gpnd(gpnc.a, ((int)arr_v.length)));
                }
                for(int v1 = 0; v1 < Math.min(arr_v.length, arr_s.length); ++v1) {
                    String s2 = arr_s[v1];
                    int v4 = arr_v[v1];
                    if(s2 == null) {
                        ((ggtj)crxn.a.j()).R("%s: Null action label for type %s", "CCLog", new gpnd(gpnc.a, v4));
                    }
                    else if(hauz.b(v4) == 1) {
                        ggtj ggtj0 = (ggtj)crxn.a.j();
                        gpnd gpnd0 = new gpnd(gpnc.a, s2);
                        ggtj0.X("%s: Unrecognized action type %s for label %s", "CCLog", new gpnd(gpnc.a, v4), gpnd0);
                    }
                    else {
                        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)hauy.a).v_newBuilder();
                        if(!hftp8.b_message.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp8.b_message;
                        ((hauy)hftv0).c = s2;
                        if(!hftv0.isImmutable()) {
                            hftp8.ensureMutable();
                        }
                        ((hauy)hftp8.b_message).b = v4;
                        hauy hauy0 = (hauy)hftp8.N_build();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        haut haut7 = (haut)hftp0.b_message;
                        hauy0.getClass();
                        hfuo hfuo0 = haut7.g;
                        if(!hfuo0.c()) {
                            haut7.g = ProtoLiteMessage.E(hfuo0);
                        }
                        haut7.g.add(hauy0);
                    }
                }
            }
            this.h(((haut)hftp0.N_build()), gizm0, s, hhct0, 0L, 0L, intent0.getIntExtra("NOTIFICATION_ACTION_INDEX", -1));
            return;
        }
        this.f(((haut)hftp0.N_build()), gizm0, s, hhct0);
    }
}

