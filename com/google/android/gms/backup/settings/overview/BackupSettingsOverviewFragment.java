package com.google.android.gms.backup.settings.overview;

import acp;
import adt;
import adv;
import android.os.Build;
import android.os.Bundle;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.preference.PreferenceCategory;
import aseu;
import asev;
import asew;
import askv;
import asnl;
import asnr;
import aspt;
import aspy;
import asst;
import assu;
import assv;
import assx;
import assy;
import assz;
import asta;
import astb;
import astc;
import astd;
import aste;
import astf;
import astg;
import asth;
import asti;
import astn;
import asud;
import asue;
import asuf;
import asug;
import asuh;
import asui;
import asuk;
import asuq;
import asuy;
import asva;
import aswb;
import bbcu;
import bboh;
import cmea;
import cmec;
import com.android.settingslib.widget.BannerMessagePreference;
import com.android.settingslib.widget.StatusBannerPreference;
import com.android.settingslib.widget.TopIntroPreference;
import fyxp;
import ibnm;
import ibnn;
import ibno;
import ibnp;
import ibnq;
import ibnx;
import ibnz;
import ibrl;
import ibrx;
import ibth;
import ibts;
import ibuk;
import ibuq;
import icbb;
import icnj;
import lsd;
import sku;
import slc;

public final class BackupSettingsOverviewFragment extends asuy {
    public askv ag;
    public asnl ah;
    public cmec ai;
    public aspt aj;
    public aswb ak;
    public final acp al;
    public final acp am;
    public final acp an;
    private final ibnn ao;
    private final ibnn ap;
    private final ibnn aq;
    private final ibnn ar;
    private final ibnn as;
    private final ibnn at;
    private final ibnn au;
    private final ibnn av;
    private final ibnn aw;
    private final ibnn ax;
    private final ibnn ay;
    public static final bboh d;

    static {
        BackupSettingsOverviewFragment.d = bboh.b("BackupSettingsOverviewFragment", bbcu.dF);
    }

    public BackupSettingsOverviewFragment() {
        asuf asuf0 = new asuf(new asue(this));
        ibnn ibnn0 = ibno.a(ibnp.c, asuf0);
        ibuk ibuk0 = new ibuk(asuq.class);
        asug asug0 = new asug(ibnn0);
        asuh asuh0 = new asuh(ibnn0);
        this.ao = new lsd(ibuk0, asug0, new asui(this, ibnn0), asuh0);
        this.ap = new ibnz(new astb());
        this.aq = new ibnz(new astc());
        this.ar = new ibnz(new astd());
        this.al = this.registerForActivityResult(new adt(), new aste());
        this.am = this.registerForActivityResult(new adt(), new astf(this));
        this.an = this.registerForActivityResult(new adt(), new astg(this));
        this.as = asnr.b(this, 0x7F1504F0);  // string:backup_settings_overview_preference_key_status_banner "pref_key_status_banner"
        this.at = asnr.b(this, 0x7F1504EC);  // string:backup_settings_overview_preference_key_backup_description "pref_key_backup_description"
        this.au = asnr.b(this, 0x7F1504EB);  // string:backup_settings_overview_preference_key_alerts_category "pref_key_alerts_category"
        this.av = asnr.b(this, 0x7F1504EA);  // string:backup_settings_overview_preference_key_alerts "pref_key_alert"
        this.aw = asnr.a(this, 0x7F1504EF);  // string:backup_settings_overview_preference_key_photos "pref_key_photos"
        this.ax = asnr.a(this, 0x7F1504EE);  // string:backup_settings_overview_preference_key_downloads "pref_key_downloads"
        this.ay = asnr.a(this, 0x7F1504ED);  // string:backup_settings_overview_preference_key_device_data "pref_key_device_data"
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.B(0x7F19001E);  // xml:backup_settings_overview_fragment
        this.V(new assu(this));
        this.P().e(new assv(this));
        if(!sku.a(this.requireContext())) {
            this.N().C = 0x7F0E0183;  // layout:backup_settings_overview_preference_statusbanner
        }
    }

    public final View.OnClickListener K(aseu aseu0) {
        if((aseu0 instanceof asew)) {
            return new assz(this, aseu0);
        }
        if((aseu0 instanceof asev)) {
            return new asta(this, aseu0);
        }
        throw new ibnq();
    }

    public final PreferenceCategory L() {
        return (PreferenceCategory)this.au.a();
    }

    public final BannerMessagePreference M() {
        return (BannerMessagePreference)this.av.a();
    }

    public final StatusBannerPreference N() {
        return (StatusBannerPreference)this.as.a();
    }

    public final aspt O() {
        aspt aspt0 = this.aj;
        if(aspt0 != null) {
            return aspt0;
        }
        ibuq.j("semanticLogger");
        return null;
    }

    public final aspy P() {
        return (aspy)this.ay.a();
    }

    public final aspy Q() {
        return (aspy)this.ax.a();
    }

    public final aspy R() {
        return (aspy)this.aw.a();
    }

    public final asuq S() {
        return (asuq)this.ao.a();
    }

    public final Object T(ibrl ibrl0) {
        asti asti0;
        if((ibrl0 instanceof asti)) {
            asti0 = (asti)ibrl0;
            int v = asti0.c;
            if((v & 0x80000000) == 0) {
                asti0 = new asti(this, ibrl0);
            }
            else {
                asti0.c = v - 0x80000000;
            }
        }
        else {
            asti0 = new asti(this, ibrl0);
        }
        Object object0 = asti0.a;
        Object object1 = ibrx.a;
        switch(asti0.c) {
            case 0: {
                ibnx.b(object0);
                StatusBannerPreference statusBannerPreference0 = this.N();
                String s = BidiFormatter.getInstance(this.requireContext().getResources().getConfiguration().locale).unicodeWrap(Build.MODEL, TextDirectionHeuristics.ANYRTL_LTR);
                ibuq.e(s, "unicodeWrap(...)");
                statusBannerPreference0.S(s);
                icnj icnj0 = this.S().i;
                astn astn0 = new astn(this);
                asti0.c = 1;
                if(icnj0.oR(astn0, asti0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new ibnm();
    }

    public final void U(asva asva0) {
        asuq asuq0 = this.S();
        ibuq.f(asva0.a, "config");
        asuk asuk0 = new asuk(asva0.a, asuq0, null);
        icbb.b(asuq0.g, null, null, asuk0, 3);
    }

    public final void V(ibts ibts0) {
        if(this.W()) {
            ibts0.a(this.Q());
        }
    }

    public final boolean W() {
        return ((Boolean)this.ar.a()).booleanValue();
    }

    public static void X(BackupSettingsOverviewFragment backupSettingsOverviewFragment0, String s, Integer integer0, int v) {
        asth asth0 = new asth();
        fyxp fyxp0 = fyxp.u(new adv(backupSettingsOverviewFragment0.requireContext(), 0x7F1600AB), backupSettingsOverviewFragment0.requireView(), s, 0);  // style:BackupSnackbarTheme
        if((v & 2) != 0) {
            integer0 = null;
        }
        if(integer0 != null) {
            fyxp0.A(0x7F1508A8, asth0);  // string:common_ok "OK"
        }
        fyxp0.i();
    }

    public static void Y(BackupSettingsOverviewFragment backupSettingsOverviewFragment0, Integer integer0, Integer integer1, Integer integer2, slc slc0, slc slc1, boolean z, ibth ibth0, int v) {
        if((v & 8) != 0) {
            slc0 = slc.e;
        }
        if((v & 16) != 0) {
            slc1 = slc.e;
        }
        if((v & 0x100) != 0) {
            ibth0 = new asst();
        }
        if(1 == (v & 1)) {
            integer0 = null;
        }
        StatusBannerPreference statusBannerPreference0 = backupSettingsOverviewFragment0.N();
        statusBannerPreference0.H((v & 0x20) != 0);
        if(integer0 == null) {
            statusBannerPreference0.n(null);
        }
        else {
            statusBannerPreference0.P(integer0.intValue());
        }
        if((v & 2) != 0) {
            integer1 = null;
        }
        if(integer1 != null) {
            statusBannerPreference0.o(integer1.intValue());
        }
        if((v & 4) != 0) {
            integer2 = null;
        }
        if(integer2 != null) {
            statusBannerPreference0.J(backupSettingsOverviewFragment0.requireContext().getDrawable(integer2.intValue()));
        }
        statusBannerPreference0.ah(slc0);
        if((v & 0x80) == 0) {
            statusBannerPreference0.l(null);
        }
        else {
            statusBannerPreference0.k(slc1);
            statusBannerPreference0.l(new assx(ibth0));
        }
        ((TopIntroPreference)backupSettingsOverviewFragment0.at.a()).T(((boolean)(((int)z) & ((v & 0x40) == 0 ? 1 : 0))));
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        if(((Boolean)this.ap.a()).booleanValue()) {
            this.S().c.b();
        }
        if(((Boolean)this.aq.a()).booleanValue()) {
            this.S().a();
        }
    }

    @Override  // skp
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        cmec cmec0 = null;
        asnr.c(this, new asud(this, null));
        cmec cmec1 = this.ai;
        if(cmec1 == null) {
            ibuq.j("gmsCoreMetrics");
        }
        else {
            cmec0 = cmec1;
        }
        cmea cmea0 = cmec0.a(this.getView(), 0x3FB5E);
        this.R().b(cmea0, 0x4019D);
        this.P().b(cmea0, 0x4019B);
        this.V(new assy(cmea0));
    }
}

