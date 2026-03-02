package com.google.android.gms.app.phone.settings.licenses;

import abto;
import abtp;
import abuh;
import abui;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import du;
import gfuy;
import lps;
import lso;
import nry;
import nxw;

public final class LicenseFragment extends du {
    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        return layoutInflater0.inflate(0x7F0E0517, viewGroup0, false);  // layout:license_fragment
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        Application application0 = ((Activity)this.requireContext()).getApplication();
        LicenseWrapper licenseWrapper0 = (LicenseWrapper)this.getArguments().getParcelable("license");
        gfuy.e(licenseWrapper0);
        abui abui0 = (abui)new lso(this, new abuh(application0, licenseWrapper0)).a(abui.class);
        TextView textView0 = (TextView)view0.findViewById(0x1020014);
        lps lps0 = this.getViewLifecycleOwner();
        abto abto0 = new abto(textView0);
        abui0.a.g(lps0, abto0);
        nry nry0 = nxw.a(this);
        lps lps1 = this.getViewLifecycleOwner();
        abtp abtp0 = new abtp(nry0);
        abui0.b.g(lps1, abtp0);
    }
}

