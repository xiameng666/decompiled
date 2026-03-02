package com.google.android.gms.multidevice.ui.enrollment;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import bboh;
import cudo;
import cueg;
import cueh;
import cume;
import ibuk;
import ibuq;
import xoc;

public final class InviteCompleteFragment extends cudo {
    public static final bboh an;

    static {
        InviteCompleteFragment.an = cume.a(new ibuk(InviteCompleteFragment.class));
    }

    public InviteCompleteFragment() {
        super(Integer.valueOf(0x7F150F0C), null, 0x7F150820, 0x7F1508D9, true, 2, null);  // string:enrollment_complete_tile "This device is all set"
    }

    @Override  // cudo
    protected final void A() {
        xoc.b(this).finish();
    }

    @Override  // cudo
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.ai = (int)0x7F150F26;  // string:enrollment_invite_complete_description "You can now share things like video 
                                    // calls across your devices. You\'ll get new cross-device features as soon as they\'re 
                                    // released."
        this.ak = 0x7F081002;  // drawable:v_illustration_tidepool_complete
        super.onViewCreated(view0, bundle0);
    }

    @Override  // cudo
    protected final View.OnClickListener y() {
        return new cueg(this);
    }

    @Override  // cudo
    protected final View.OnClickListener z() {
        return new cueh(this);
    }
}

