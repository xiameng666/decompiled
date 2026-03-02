import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.MdpDataPlanStatusResponse;
import com.google.android.gms.mobiledataplan.MdpMoney;
import com.google.android.gms.mobiledataplan.MdpUpsellOfferRequest;
import com.google.android.gms.mobiledataplan.WalletBalanceInfo;
import j..util.Optional;
import java.util.Locale;
import java.util.logging.Level;

final class csfb implements evqf {
    final csdj a;

    public csfb(csdj csdj0) {
        this.a = csdj0;
        super();
    }

    @Override  // evqf
    public final void gw(Object object0) {
        MdpUpsellOfferRequest mdpUpsellOfferRequest0;
        glux glux0;
        Optional optional1;
        csdj csdj0 = this.a;
        csdj0.t(false);
        csdj0.s(((MdpDataPlanStatusResponse)object0), false);
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0 = csdj0.q;
        if(mdpCarrierPlanIdResponse0 != null) {
            String s = mdpCarrierPlanIdResponse0.a;
            if(!TextUtils.isEmpty(s)) {
                crvl crvl0 = new crvl();
                if(!TextUtils.isEmpty(hvko.r())) {
                    s = hvko.r();
                    if(crvl0.b == null) {
                        crvl0.b = new Bundle();
                    }
                    crvl0.b.putString("for_test", "ui_test");
                }
                crvl0.c = csfi.a();
                if(hvlq.t()) {
                    WalletBalanceInfo walletBalanceInfo0 = csdj0.r;
                    Optional optional0 = Optional.ofNullable(walletBalanceInfo0).map(new cryh());
                    if(optional0.isEmpty()) {
                        optional1 = Optional.empty();
                    }
                    else {
                        long v = csgn.b(walletBalanceInfo0);
                        try {
                            String s1 = ((String)optional0.get()).toUpperCase(Locale.getDefault());
                            glux0 = (glux)Enum.valueOf(glux.class, s1);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            a.ae(cryi.a.j(), "Invalid Wallet Currency code", illegalArgumentException0);
                            optional1 = Optional.empty();
                            goto label_49;
                        }
                        glva glva0 = glvd.e(v, glux0);
                        if(glva0 == null) {
                            optional1 = Optional.empty();
                        }
                        else {
                            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjin.a).v_newBuilder();
                            long v1 = glva0.b() / 1000000L;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hjin)hftp0.b_message).c = v1;
                            long v2 = glva0.b() % 1000000L;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hjin)hftp0.b_message).d = ((int)v2) * 1000;
                            String s2 = glva0.c().name();
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            hjin hjin0 = (hjin)hftp0.b_message;
                            s2.getClass();
                            hjin0.b = s2;
                            hjin hjin1 = (hjin)hftp0.N_build();
                            optional1 = Optional.of(new MdpMoney(hjin1.b, hjin1.c, hjin1.d));
                        }
                    }
                label_49:
                    if(optional1.isPresent()) {
                        crvl0.g = (MdpMoney)optional1.get();
                        crxn.c().Q(89, null, null, hhct.dv, System.currentTimeMillis(), csfi.a());
                        Level level0 = cslm.h();
                        csff.a.g(level0).x("Wallet balance is set for UpsellOffer.");
                    }
                }
                if(hvjq.a.c().k()) {
                    crvl0.a = s;
                }
                else {
                    crvl0.a = s;
                    if(crvl0.b == null) {
                        crvl0.b = new Bundle();
                    }
                    crvl0.b.putString("bypass_local_cache", "true");
                    crvl0.b.putString("bypass_gtaf_cache", "true");
                    crvl0.b.putString("bypass_dpa_cache", "true");
                }
                mdpUpsellOfferRequest0 = crvl0.a();
                evql evql0 = csdj0.a().g(mdpUpsellOfferRequest0);
                evql0.b(new csfd(csdj0));
                evql0.A(new cses(csdj0));
                if(hvjh.f()) {
                    csff.d(evql0, "getUpsellOffer", new cset(csdj0));
                }
                return;
            }
        }
        ((ggtj)csff.a.j()).x("GetUpsellOffer Failed due to empty carrier plan id");
    }
}

