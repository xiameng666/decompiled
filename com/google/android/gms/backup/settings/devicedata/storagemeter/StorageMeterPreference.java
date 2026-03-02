package com.google.android.gms.backup.settings.devicedata.storagemeter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import aqqd;
import aqqe;
import aqqf;
import aqqh;
import asli;
import aslk;
import asll;
import aslm;
import asln;
import asxr;
import cmeb;
import cmec;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import ibnn;
import ibnq;
import ibnz;
import ibts;
import ibuq;
import ibvr;
import java.util.Arrays;
import java.util.Locale;
import keh;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;

public final class StorageMeterPreference extends Preference {
    public aqqh a;
    public ibts b;
    public cmec c;
    private final ibnn d;

    public StorageMeterPreference(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public StorageMeterPreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public StorageMeterPreference(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public StorageMeterPreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.C = 0x7F0E0181;  // layout:backup_settings_devicedata_storagemeter_preference
        this.N(false);
        this.d = new ibnz(new aslm());
        this.a = aqqe.a;
    }

    public StorageMeterPreference(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        this(context0, attributeSet0, v, v1);
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        String s3;
        String s2;
        ibuq.f(oij0, "holder");
        super.a(oij0);
        View view0 = oij0.D(0x7F0B0C77);  // id:backup_settings_devicedata_storagemeter_progress
        ibuq.d(view0, "null cannot be cast to non-null type com.google.android.material.progressindicator.LinearProgressIndicator");
        View view1 = oij0.D(0x7F0B0C75);  // id:backup_settings_devicedata_storagemeter_button_container
        ibuq.d(view1, "null cannot be cast to non-null type android.widget.LinearLayout");
        View view2 = oij0.D(0x7F0B0C78);  // id:backup_settings_devicedata_storagemeter_summary
        ibuq.d(view2, "null cannot be cast to non-null type android.widget.TextView");
        View view3 = oij0.D(0x7F0B0C74);  // id:backup_settings_devicedata_storagemeter_button_clean_up_space
        ibuq.d(view3, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
        View view4 = oij0.D(0x7F0B0C76);  // id:backup_settings_devicedata_storagemeter_button_get_storage
        ibuq.d(view4, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
        ((LinearProgressIndicator)view0).setVisibility(0);
        ((MaterialButton)view3).setEnabled(false);
        ((MaterialButton)view4).setEnabled(false);
        aqqh aqqh0 = this.a;
        if(!(aqqh0 instanceof aqqe) && !(aqqh0 instanceof aqqd)) {
            if(!(aqqh0 instanceof aqqf)) {
                throw new ibnq();
            }
            ((MaterialButton)view3).setEnabled(true);
            ((MaterialButton)view4).setEnabled(true);
            long v = ((asli)((aqqf)aqqh0).a).b;
            long v1 = ((asli)((aqqf)aqqh0).a).c;
            Context context0 = this.j;
            int v2 = ibvr.c(((float)v) / ((float)v1) * 100.0f);
            String s = asxr.a(context0, v);
            String s1 = asxr.a(context0, v1);
            if(v1 <= 0L) {
                ((LinearProgressIndicator)view0).setVisibility(8);
                ((TextView)view2).setText(context0.getString(0x7F152F75, new Object[]{s}));  // string:storage_meter_summary_unlimited_quota "%1$s used"
            }
            else {
                if(v >= v1) {
                    s2 = context0.getString(0x7F152F74, new Object[]{s, s1});  // string:storage_meter_summary_storage_full "Your storage is full (%1$s of %2$s used)"
                }
                else {
                    if(((Boolean)this.d.a()).booleanValue()) {
                        s3 = String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{v2}, 1));
                        ibuq.e(s3, "format(...)");
                    }
                    else {
                        s3 = String.valueOf(v2);
                    }
                    s2 = context0.getString(0x7F152F73, new Object[]{s, s1, s3});  // string:storage_meter_summary "%1$s of %2$s (%3$s%%) used"
                }
                ((TextView)view2).setText(s2);
                if(v2 >= 90) {
                    this.k(((LinearProgressIndicator)view0), 0x7F060FF7);  // color:settingslib_colorBackgroundLevel_high
                }
                else if(v2 >= 80) {
                    this.k(((LinearProgressIndicator)view0), 0x7F060FF9);  // color:settingslib_colorBackgroundLevel_medium
                }
                else {
                    this.k(((LinearProgressIndicator)view0), 0x7F06106A);  // color:settingslib_materialColorPrimary
                }
                ((LinearProgressIndicator)view0).setProgress(v2, true);
            }
        }
        else {
            ((LinearProgressIndicator)view0).setProgress(0, true);
            ((TextView)view2).setText("");
        }
        StorageMeterPreference.l(((MaterialButton)view3), ((LinearLayout)view1));
        StorageMeterPreference.l(((MaterialButton)view4), ((LinearLayout)view1));
        cmec cmec0 = this.c;
        if(cmec0 == null) {
            throw new IllegalStateException("Unable to instrument storage meter without GMS Core metrics.");
        }
        cmeb cmeb0 = cmec0.b(((MaterialButton)view3), 0x4019E);
        cmeb0.g();
        cmeb cmeb1 = cmec0.b(((MaterialButton)view4), 0x4019F);
        cmeb1.g();
        asli asli0 = (asli)this.a.b();
        String s4 = asli0 == null ? null : asli0.a;
        ((MaterialButton)view3).setOnClickListener(new aslk(cmeb0, this, s4));
        ((MaterialButton)view4).setOnClickListener(new asll(cmeb1, this, s4));
    }

    private final void k(LinearProgressIndicator linearProgressIndicator0, int v) {
        linearProgressIndicator0.f(new int[]{this.j.getColor(v)});
    }

    private static final void l(MaterialButton materialButton0, LinearLayout linearLayout0) {
        keh.b(materialButton0, new asln(materialButton0, linearLayout0));
    }
}

