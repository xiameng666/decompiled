package com.google.android.gms.backup.settings.ui;

import android.accounts.Account;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.Toast;
import aqnk;
import aqql;
import aqsm;
import aqth;
import aqvc;
import aqvd;
import aqzl;
import asxz;
import ataf;
import atai;
import ataj;
import atak;
import atal;
import atan;
import baun;
import bbln;
import clht;
import fpth;
import fpxq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xob;

public class PhotosBackupPreference extends PhotosPreference {
    public String H;
    public boolean I;
    public String J;
    public aqnk K;
    public final aqvd L;
    private boolean M;
    private static final int N;
    public static final baun a;
    public final fpth b;
    public final aqsm c;
    public aqth d;
    public final Handler e;
    public boolean f;
    public boolean g;
    public final xob h;
    public String i;

    static {
        PhotosBackupPreference.a = aqql.a("PhotosBackupPreference");
        PhotosBackupPreference.N = 2;
    }

    public PhotosBackupPreference(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, aqsm.b(context0), aqth.a(context0), new aqnk(context0));
    }

    public PhotosBackupPreference(Context context0, AttributeSet attributeSet0, aqsm aqsm0, aqth aqth0, aqnk aqnk0) {
        super(context0, attributeSet0);
        this.b = new atai(this);
        this.f = false;
        this.g = false;
        this.M = true;
        this.i = null;
        this.H = null;
        this.I = false;
        this.c = aqsm0;
        this.d = aqth0;
        this.H(false);
        this.e = new clht(context0.getMainLooper());
        this.J = asxz.h.a(context0);
        this.K = aqnk0;
        aqvc aqvc0 = aqvd.a();
        aqvc0.c(PhotosBackupPreference.N);
        this.L = aqvc0.a();
        this.h = (xob)context0;
    }

    @Override  // androidx.preference.Preference
    protected final void E() {
        super.V();
        if(this.I) {
            new bbln(10, new ataf(this)).start();
        }
    }

    @Override  // com.google.android.gms.backup.settings.ui.PhotosPreference
    public final String ah() {
        return this.H;
    }

    public final void ai() {
        this.I(0x7F080BF6);  // drawable:quantum_gm_ic_photos_vd_theme_24
        this.q().setColorFilter(this.j.getColor(0x7F0600B7), PorterDuff.Mode.SRC_IN);  // color:backup_error_tint
    }

    public final void aj() {
        if(!this.f && !this.g) {
            String s = this.H;
            if(s == null) {
                this.l(asxz.g);
                return;
            }
            if(s.equals(this.i)) {
                this.n(this.J);
                return;
            }
            this.n(this.J + "\n" + this.H);
        }
    }

    public final void ak() {
        if(!this.f && !this.g) {
            this.I(0x7F080BF6);  // drawable:quantum_gm_ic_photos_vd_theme_24
        }
    }

    public final void al(PendingIntent pendingIntent0) {
        try {
            fpxq.a(pendingIntent0);
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            Toast.makeText(this.j, 0x7F15048A, 0).show();  // string:backup_launch_photos_settings_error "There was an error opening photos settings"
            PhotosBackupPreference.a.e("Failed to send intent", pendingIntent$CanceledException0, new Object[0]);
        }
    }

    @Override  // com.google.android.gms.backup.settings.ui.BackupPreference
    public final List k(Account account0) {
        String s = account0 == null ? null : account0.name;
        String s1 = this.M ? s : this.i;
        this.M = false;
        return new ArrayList(Arrays.asList(new aqzl[]{new ataj(this, s1, s), new atak(this), new atal(this), new atan(this)}));
    }

    @Override  // com.google.android.gms.backup.settings.ui.BackupPreference
    public final void o() {
    }
}

