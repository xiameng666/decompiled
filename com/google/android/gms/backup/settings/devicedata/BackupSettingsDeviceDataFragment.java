package com.google.android.gms.backup.settings.devicedata;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import acp;
import adt;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.preference.TwoStatePreference;
import aqmq;
import aqqf;
import aqqh;
import asdw;
import asjm;
import asjn;
import asjo;
import asjp;
import asjq;
import asjr;
import asjs;
import asjt;
import asju;
import askd;
import aske;
import askf;
import askg;
import askh;
import aski;
import askr;
import askv;
import askw;
import asky;
import aslc;
import asmv;
import asnr;
import aspt;
import aspx;
import aspy;
import cmea;
import cmec;
import com.android.settingslib.widget.MainSwitchPreference;
import com.google.android.gms.backup.settings.devicedata.intropreference.IntroPreference;
import com.google.android.gms.backup.settings.devicedata.mainswitchpreference2.MainSwitchPreference2;
import com.google.android.gms.backup.settings.devicedata.profilepreference.ProfilePreference;
import com.google.android.gms.backup.settings.devicedata.storagemeter.StorageMeterPreference;
import grje;
import grjo;
import grjx;
import grjy;
import grjz;
import grka;
import ibnn;
import ibno;
import ibnp;
import ibnz;
import ibuk;
import ibuq;
import lsd;

public final class BackupSettingsDeviceDataFragment extends asky {
    public aqmq ag;
    public asdw ah;
    public cmec ai;
    public aspt aj;
    public final acp ak;
    private final ibnn al;
    private final ibnn am;
    private final ibnn an;
    private final ibnn ao;
    private final ibnn ap;
    private final ibnn aq;
    private final ibnn ar;
    private final ibnn as;
    public askv d;

    public BackupSettingsDeviceDataFragment() {
        this.al = new ibnz(new asjq());
        askf askf0 = new askf(new aske(this));
        ibnn ibnn0 = ibno.a(ibnp.c, askf0);
        ibuk ibuk0 = new ibuk(askr.class);
        askg askg0 = new askg(ibnn0);
        askh askh0 = new askh(ibnn0);
        this.am = new lsd(ibuk0, askg0, new aski(this, ibnn0), askh0);
        this.ak = this.registerForActivityResult(new adt(), new asjr(this));
        this.an = asnr.b(this, 0x7F1504C7);  // string:backup_settings_device_data_preference_key_intro "pref_key_intro"
        this.ao = asnr.b(this, 0x7F1504CB);  // string:backup_settings_device_data_preference_key_toggle_main_forked "pref_key_toggle_main_forked"
        this.ap = asnr.b(this, 0x7F1504CA);  // string:backup_settings_device_data_preference_key_toggle_main "pref_key_toggle_main"
        this.aq = asnr.a(this, 0x7F1504C8);  // string:backup_settings_device_data_preference_key_profile "pref_key_profile"
        this.ar = asnr.b(this, 0x7F1504C9);  // string:backup_settings_device_data_preference_key_storage_meter "pref_key_storage_meter"
        this.as = asnr.a(this, 0x7F1504CC);  // string:backup_settings_device_data_preference_key_toggle_metered_network "pref_key_toggle_metered_network"
    }

    @Override  // ohv
    public final void D(Bundle bundle0, String s) {
        this.B(0x7F19001B);  // xml:backup_settings_device_data_fragment
        this.aa().n(this.getString(0x7F1504D0));  // string:backup_settings_devicedata_description "Back up contacts, call history, device 
                                                  // settings, apps & app data, SMS & MMS messages, and SIMs to your Google Account."
        IntroPreference introPreference0 = this.aa();
        String s1 = this.getString(0x7F1504BF);  // string:backup_settings_common_data_protection_link_title "How data is protected"
        ibuq.e(s1, "getString(...)");
        ibuq.f(s1, "text");
        if(!TextUtils.equals(introPreference0.b, s1)) {
            introPreference0.b = s1;
            introPreference0.d();
        }
        IntroPreference introPreference1 = this.aa();
        asjm asjm0 = new asjm(this);
        if(!ibuq.m(introPreference1.a, asjm0)) {
            introPreference1.a = asjm0;
            introPreference1.d();
        }
        this.aa().I(0x7F080545);  // drawable:gs_devices_vd_theme_48
        this.aa().k();
        this.L().T(this.W());
        this.O().T(((boolean)(this.W() ^ 1)));
        ProfilePreference profilePreference0 = (ProfilePreference)this.S().a;
        asdw asdw0 = this.ah;
        if(asdw0 == null) {
            ibuq.j("accountParticleDiscInitializer");
            asdw0 = null;
        }
        ibuq.f(asdw0, "accountParticleDiscInitializer");
        profilePreference0.b = asdw0;
        aqmq aqmq0 = this.M();
        asjn asjn0 = new asjn(this);
        aqmq0.b.put("turn_off_backup_dialog", asjn0);
        aqmq aqmq1 = this.M();
        asjo asjo0 = new asjo(this);
        aqmq1.c.put("turn_off_backup_dialog", asjo0);
        aqmq aqmq2 = this.M();
        asjp asjp0 = new asjp(this);
        aqmq2.d.put("turn_off_backup_dialog", asjp0);
        aspy aspy0 = this.R();
        asju asju0 = new asju(this.N());
        ibuq.f(aspy0, "<this>");
        aspy0.a.n = new aspx(aspy0, asju0);
    }

    public final TwoStatePreference K() {
        return this.W() ? this.L() : this.O();
    }

    public final MainSwitchPreference L() {
        return (MainSwitchPreference)this.ap.a();
    }

    public final aqmq M() {
        aqmq aqmq0 = this.ag;
        if(aqmq0 != null) {
            return aqmq0;
        }
        ibuq.j("backupAlertDialogs");
        return null;
    }

    public final askr N() {
        return (askr)this.am.a();
    }

    public final MainSwitchPreference2 O() {
        return (MainSwitchPreference2)this.ao.a();
    }

    public final StorageMeterPreference P() {
        return (StorageMeterPreference)this.ar.a();
    }

    public final aspt Q() {
        aspt aspt0 = this.aj;
        if(aspt0 != null) {
            return aspt0;
        }
        ibuq.j("semanticLogger");
        return null;
    }

    public final aspy R() {
        return (aspy)this.as.a();
    }

    public final aspy S() {
        return (aspy)this.aq.a();
    }

    public final cmec T() {
        cmec cmec0 = this.ai;
        if(cmec0 != null) {
            return cmec0;
        }
        ibuq.j("gmsCoreMetrics");
        return null;
    }

    public final void U(boolean z) {
        this.R().g(z);
        this.P().T(z);
    }

    public final void V(aqqh aqqh0) {
        this.K().n = null;
        if(!(aqqh0 instanceof aqqf)) {
            return;
        }
        if(((asmv)((aqqf)aqqh0).a).a) {
            this.K().k(true);
            TwoStatePreference twoStatePreference0 = this.K();
            twoStatePreference0.n = new asjs(this);
            return;
        }
        this.K().k(false);
        TwoStatePreference twoStatePreference1 = this.K();
        twoStatePreference1.n = new asjt(this);
    }

    public final boolean W() {
        return ((Boolean)this.al.a()).booleanValue();
    }

    public static final grjo X(boolean z) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grjo.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        grjy grjy0 = grjy.a;
        grka grka0 = grjz.a(((grjx)((ProtoLiteMessage)grjy0).v_newBuilder()));
        grka0.c();
        grka0.b(0x7F1504C2);  // string:backup_settings_common_flavor_title_other_device_data "Other device data"
        grjy grjy1 = grka0.a();
        ibuq.f(grjy1, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grjo grjo0 = (grjo)hftp0.b_message;
        grjy1.getClass();
        grjo0.d = grjy1;
        grjo0.b |= 2;
        grka grka1 = grjz.a(((grjx)((ProtoLiteMessage)grjy0).v_newBuilder()));
        grka1.c();
        grka1.b(0x7F1504D0);  // string:backup_settings_devicedata_description "Back up contacts, call history, device 
                              // settings, apps & app data, SMS & MMS messages, and SIMs to your Google Account."
        grka1.c();
        grka1.b(0x7F1504BF);  // string:backup_settings_common_data_protection_link_title "How data is protected"
        grjy grjy2 = grka1.a();
        ibuq.f(grjy2, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grjo grjo1 = (grjo)hftp0.b_message;
        grjy2.getClass();
        grjo1.e = grjy2;
        grjo1.b |= 4;
        grka grka2 = grjz.a(((grjx)((ProtoLiteMessage)grjy0).v_newBuilder()));
        grka2.c();
        grka2.b(0x7F1504D1);  // string:backup_settings_devicedata_toggle_backup_device_data "Back up other device 
                              // data"
        grjy grjy3 = grka2.a();
        ibuq.f(grjy3, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grjo grjo2 = (grjo)hftp0.b_message;
        grjy3.getClass();
        grjo2.f = grjy3;
        grjo2.b |= 8;
        grje grje0 = askw.ag;
        ibuq.f(grje0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grjo grjo3 = (grjo)hftp0.b_message;
        grje0.getClass();
        grjo3.g = grje0;
        grjo3.b |= 16;
        if(z) {
            grje grje1 = aslc.ag;
            ibuq.f(grje1, "value");
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grjo grjo4 = (grjo)hftp0.b_message;
            grje1.getClass();
            grjo4.c = grje1;
            grjo4.b |= 1;
        }
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (grjo)hftv0;
    }

    private final IntroPreference aa() {
        return (IntroPreference)this.an.a();
    }

    @Override  // skp
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        super.onViewCreated(view0, bundle0);
        asnr.c(this, new askd(this, null));
        cmea cmea0 = this.T().a(this.getView(), 0x3FB5D);
        this.R().b(cmea0, 0x4019C);
        this.S().b(cmea0, 0x4019A);
        StorageMeterPreference storageMeterPreference0 = this.P();
        cmec cmec0 = this.T();
        ibuq.f(cmec0, "gmsCoreMetrics");
        storageMeterPreference0.c = cmec0;
        this.U(false);
    }
}

