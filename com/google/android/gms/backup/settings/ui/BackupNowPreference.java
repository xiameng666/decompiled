package com.google.android.gms.backup.settings.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.preference.Preference;
import aqql;
import aqyy;
import aspm;
import asyg;
import baun;
import ghzz;
import giaq;
import hqil;
import oij;

public class BackupNowPreference extends Preference {
    public boolean a;
    public boolean b;
    public final double c;
    public boolean d;
    private static final baun e;
    private Button f;
    private Button g;
    private final aspm h;
    private boolean i;

    static {
        BackupNowPreference.e = aqql.a("BackupNowPreference");
    }

    public BackupNowPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, new aspm(context0));
    }

    public BackupNowPreference(Context context0, AttributeSet attributeSet0, aspm aspm0) {
        super(context0, attributeSet0);
        this.c = hqil.b();
        this.C = 0x7F0E055C;  // layout:material_backup_now_button
        this.w = false;
        this.N(false);
        this.h = aspm0;
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        BackupNowPreference.e.j("onBindViewHolder", new Object[0]);
        super.a(oij0);
        this.f = (Button)oij0.D(0x7F0B0C67);  // id:backup_now_button
        this.g = (Button)oij0.D(0x7F0B0C68);  // id:backup_now_button_outlined
        asyg asyg0 = new asyg(this);
        this.f.setOnClickListener(asyg0);
        this.g.setOnClickListener(asyg0);
        this.l();
    }

    public final void k(boolean z) {
        this.i = z;
        this.l();
    }

    public final void l() {
        boolean z6;
        boolean z4;
        if(this.f != null && this.g != null) {
            baun baun0 = BackupNowPreference.e;
            boolean z = false;
            baun0.d("Updating UI Button state.", new Object[0]);
            if(aqyy.a()) {
                baun0.d("isBackupInProgress [%b]", new Object[]{Boolean.valueOf(this.d)});
            }
            else {
                baun0.d("isBackupInProgress [%b]. isUnlockRequired [%b]", new Object[]{Boolean.valueOf(this.d), Boolean.valueOf(this.i)});
            }
            if(this.b) {
                this.f.setVisibility(8);
                this.g.setVisibility(0);
            }
            else {
                this.f.setVisibility(0);
                this.g.setVisibility(8);
            }
            boolean z1 = !aqyy.a() && this.i;
            if(hqil.a.j().M()) {
                baun0.d("isUserStorageFull [%b]", new Object[]{Boolean.valueOf(this.a)});
                aspm aspm0 = this.h;
                boolean z2 = this.d;
                boolean z3 = this.a;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghzz.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((ghzz)hftv0).b |= 1;
                ((ghzz)hftv0).c = z2;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp0.b_message;
                ((ghzz)hftv1).b |= 2;
                ((ghzz)hftv1).d = z1;
                if(!hftv1.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghzz ghzz0 = (ghzz)hftp0.b_message;
                ghzz0.b |= 4;
                ghzz0.e = z3;
                ghzz ghzz1 = (ghzz)hftp0.N_build();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp1.b_message;
                ghzz1.getClass();
                ((giaq)hftv2).f = ghzz1;
                ((giaq)hftv2).b |= 0x40;
                if(!hftv2.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((giaq)hftp1.b_message).e = 10;
                ((giaq)hftp1.b_message).b |= 4;
                aspm0.e(((giaq)hftp1.N_build()));
                Button button0 = this.f;
                if(this.d) {
                    z4 = false;
                }
                else if(z1) {
                    z4 = false;
                    z1 = true;
                }
                else if(!this.a) {
                    z1 = false;
                    z4 = true;
                }
                else {
                    z1 = false;
                    z4 = false;
                }
                button0.setEnabled(z4);
                Button button1 = this.g;
                if(!this.d && !z1 && !this.a) {
                    z = true;
                }
                button1.setEnabled(z);
                return;
            }
            aspm aspm1 = this.h;
            boolean z5 = this.d;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)ghzz.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((ghzz)hftv3).b |= 1;
            ((ghzz)hftv3).c = z5;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            ghzz ghzz2 = (ghzz)hftp2.b_message;
            ghzz2.b |= 2;
            ghzz2.d = z1;
            ghzz ghzz3 = (ghzz)hftp2.N_build();
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)giaq.a).v_newBuilder();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp3.b_message;
            ghzz3.getClass();
            ((giaq)hftv4).f = ghzz3;
            ((giaq)hftv4).b |= 0x40;
            if(!hftv4.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((giaq)hftp3.b_message).e = 10;
            ((giaq)hftp3.b_message).b |= 4;
            aspm1.e(((giaq)hftp3.N_build()));
            Button button2 = this.f;
            if(this.d) {
                z6 = false;
            }
            else if(!z1) {
                z1 = false;
                z6 = true;
            }
            else {
                z6 = false;
                z1 = true;
            }
            button2.setEnabled(z6);
            Button button3 = this.g;
            if(!this.d && !z1) {
                z = true;
            }
            button3.setEnabled(z);
        }
    }
}

