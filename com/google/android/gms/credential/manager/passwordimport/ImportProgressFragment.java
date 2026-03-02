package com.google.android.gms.credential.manager.passwordimport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bexr;
import bexs;
import bext;
import bexu;
import bexv;
import bexw;
import bexx;
import bexy;
import bfah;
import bfaw;
import du;
import ibnn;
import ibno;
import ibnp;
import ibuk;
import ibuq;
import lsd;
import nry;
import nxe;
import xob;

public final class ImportProgressFragment extends bfaw {
    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0865, viewGroup0, false);  // layout:pwm_import_progress
        du du0 = this.getParentFragmentManager().g(0x7F0B19B7);  // id:nav_host_fragment
        ibuq.c(du0);
        nry nry0 = nxe.a(du0);
        du du1 = ((xob)this.requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        ibuq.c(du1);
        bexu bexu0 = new bexu(new bexr(du1));
        ibnn ibnn0 = ibno.a(ibnp.c, bexu0);
        ibuk ibuk0 = new ibuk(bfah.class);
        bexv bexv0 = new bexv(ibnn0);
        bexw bexw0 = new bexw(ibnn0);
        lsd lsd0 = new lsd(ibuk0, bexv0, new bexx(this, ibnn0), bexw0);
        if(ImportProgressFragment.y(lsd0).j.ij() == null) {
            nry0.i(0x7F0B04A9);  // id:ImportValidationFragment
        }
        ImportProgressFragment.y(lsd0).p.g(this.getViewLifecycleOwner(), new bexy(new bexs(view0, this, lsd0)));
        ImportProgressFragment.y(lsd0).r.g(this.getViewLifecycleOwner(), new bexy(new bext(nry0)));
        ibuq.c(view0);
        return view0;
    }

    public static final bfah y(ibnn ibnn0) {
        return (bfah)ibnn0.a();
    }
}

