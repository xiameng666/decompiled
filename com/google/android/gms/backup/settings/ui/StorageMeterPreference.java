package com.google.android.gms.backup.settings.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.Preference;
import aqql;
import arzs;
import asxr;
import baun;
import hqln;
import java.util.Locale;
import oij;

public class StorageMeterPreference extends Preference {
    public static final baun a;
    public String b;
    public arzs c;
    private static final int d;
    private static final int e;
    private TextView f;
    private TextView g;
    private ProgressBar h;
    private boolean i;

    static {
        StorageMeterPreference.a = aqql.a("StorageMeterPreference");
        StorageMeterPreference.d = 0x7F0600B7;  // color:backup_error_tint
        StorageMeterPreference.e = 0x7F0600BC;  // color:backup_warning_tint
    }

    public StorageMeterPreference(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i = false;
        this.C = 0x7F0E0A13;  // layout:storage_meter_preference
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        super.a(oij0);
        this.f = (TextView)oij0.D(0x7F0B20E6);  // id:storage_account_name
        this.h = (ProgressBar)oij0.D(0x7F0B20F5);  // id:storage_progress_bar
        this.g = (TextView)oij0.D(0x7F0B20E5);  // id:storage_account_info
        this.i = true;
        this.k();
    }

    public final void k() {
        if(this.i) {
            String s = this.b;
            if(s != null) {
                this.f.setText(s);
                if(hqln.d()) {
                    this.h.setVisibility(0);
                    this.g.setVisibility(0);
                }
                else {
                    this.h.setVisibility(8);
                    this.g.setVisibility(8);
                }
                if(this.c != null) {
                    this.h.setIndeterminate(false);
                    this.h.setMax(100);
                    ProgressBar progressBar0 = this.h;
                    double f = ((double)this.c.d) * 100.0 / ((double)this.c.c);
                    progressBar0.setProgress(((int)f));
                    Context context0 = this.j;
                    String s1 = asxr.a(context0, this.c.d);
                    long v = this.c.c;
                    if(v > 0L) {
                        String s2 = asxr.a(context0, v);
                        Locale locale0 = Locale.getDefault();
                        this.g.setText(context0.getString(0x7F152F73, new Object[]{s1, s2, String.format(locale0, "%.0f", f)}));  // string:storage_meter_summary "%1$s of %2$s (%3$s%%) used"
                        if(this.c.d >= this.c.c) {
                            this.h.setProgressTintList(ColorStateList.valueOf(this.l(StorageMeterPreference.d)));
                            this.g.setText(context0.getString(0x7F152F74, new Object[]{s1, s2}));  // string:storage_meter_summary_storage_full "Your storage is full (%1$s of %2$s used)"
                            this.g.setTextColor(this.l(StorageMeterPreference.d));
                            return;
                        }
                        if((f >= 90.0)) {
                            this.h.setProgressTintList(ColorStateList.valueOf(this.l(StorageMeterPreference.d)));
                            this.g.setTextColor(this.l(StorageMeterPreference.d));
                            return;
                        }
                        if((f >= 80.0)) {
                            this.h.setProgressTintList(ColorStateList.valueOf(this.l(StorageMeterPreference.e)));
                        }
                    }
                    else {
                        this.h.setVisibility(8);
                        this.g.setText(context0.getString(0x7F152F75, new Object[]{s1}));  // string:storage_meter_summary_unlimited_quota "%1$s used"
                    }
                }
            }
        }
    }

    private final int l(int v) {
        return this.j.getColor(v);
    }
}

