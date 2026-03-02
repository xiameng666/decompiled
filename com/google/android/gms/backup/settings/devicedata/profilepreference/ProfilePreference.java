package com.google.android.gms.backup.settings.devicedata.profilepreference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import asdu;
import asdv;
import asdw;
import bblp;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import fngs;
import fntn;
import fnub;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oij;

public final class ProfilePreference extends Preference {
    public asdv a;
    public asdw b;

    public ProfilePreference(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 0, 14, null);
    }

    public ProfilePreference(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 0, 12, null);
    }

    public ProfilePreference(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, v, 0, 8, null);
    }

    public ProfilePreference(Context context0, AttributeSet attributeSet0, int v, int v1) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.C = 0x7F0E0180;  // layout:backup_settings_devicedata_profile_preference
    }

    public ProfilePreference(Context context0, AttributeSet attributeSet0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
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
        ibuq.f(oij0, "holder");
        super.a(oij0);
        View view0 = oij0.D(0x7F0B0C72);  // id:backup_settings_devicedata_profile_preference_account_view
        ibuq.d(view0, "null cannot be cast to non-null type com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc<com.google.android.libraries.onegoogle.accountmenu.gmscommon.DeviceOwner>");
        ((AccountParticleDisc)view0).m(true);
        if(this.b == null) {
            throw new IllegalStateException("AccountParticleDiscInitializer not set in ProfilePreference.");
        }
        if(!((AccountParticleDisc)view0).t()) {
            asdw asdw0 = this.b;
            if(asdw0 != null) {
                ibuq.e(this.j, "getContext(...)");
                ibuq.f(this.j, "context");
                ibuq.f(((AccountParticleDisc)view0), "disc");
                fntn fntn0 = new fntn();
                bblp bblp0 = new bblp(0x7FFFFFFF, 9);
                fnub fnub0 = new fnub(this.j, asdw0.a);
                ((AccountParticleDisc)view0).h(new fngs(this.j, bblp0, fntn0, fnub0), fntn0);
            }
        }
        asdv asdv0 = this.a;
        if((asdv0 instanceof asdu)) {
            ((AccountParticleDisc)view0).l(((asdu)asdv0).b);
            ((AccountParticleDisc)view0).setVisibility(0);
            return;
        }
        ((AccountParticleDisc)view0).setVisibility(8);
    }
}

