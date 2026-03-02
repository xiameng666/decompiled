package com.google.android.gms.usagereporting.ui;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.widget.Button;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import faky;
import fakz;
import xob;

@GmsCoreVeId(0x3FEA6)
public class UsageReportingDebugChimeraActivity extends xob {
    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0E0C22);  // layout:usage_reporting_debug_settings
        Button button0 = (Button)this.findViewById(0x7F0B1017);  // id:crash_button
        button0.getBackground().setColorFilter(0xFFFF0000, PorterDuff.Mode.MULTIPLY);
        button0.setOnClickListener(new faky(this));
        ((Button)this.findViewById(0x7F0B1E61)).setOnClickListener(new fakz(this));  // id:reset_button
        this.setTitle(0x7F1534BE);  // string:usage_reporting_debug_title "Usage Reporting debug"
    }
}

