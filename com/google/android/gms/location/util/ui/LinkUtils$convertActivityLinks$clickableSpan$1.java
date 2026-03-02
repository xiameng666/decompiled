package com.google.android.gms.location.util.ui;

import a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.style.URLSpan;
import android.view.View;
import cnym;
import ibuq;

public final class LinkUtils.convertActivityLinks.clickableSpan.1 extends URLSpan {
    final Context a;
    final Intent b;

    public LinkUtils.convertActivityLinks.clickableSpan.1(Context context0, Intent intent0, String s) {
        this.a = context0;
        this.b = intent0;
        super(s);
    }

    @Override  // android.text.style.URLSpan
    public void onClick(View view0) {
        ibuq.f(view0, "textView");
        try {
            this.a.startActivity(this.b);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            a.ae(cnym.a.j(), "Failed to start activity", activityNotFoundException0);
        }
    }
}

