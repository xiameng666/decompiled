package com.google.android.gms.credential.manager.passwordimport;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import beug;
import bexb;
import bexf;
import bexg;
import bexh;
import bexi;
import bexj;
import bexk;
import bexl;
import bexm;
import bexn;
import bexo;
import bexp;
import bfah;
import bfav;
import bgmo;
import bgnw;
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

public final class ImportPreviewFragment extends bfav {
    public beug a;
    public bgmo b;

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0863, viewGroup0, false);  // layout:pwm_import_preview
        du du0 = this.getParentFragmentManager().g(0x7F0B19B7);  // id:nav_host_fragment
        ibuq.c(du0);
        nry nry0 = nxe.a(du0);
        du du1 = ((xob)this.requireContext()).getSupportFragmentManager().h("PWMImportScreenFragment");
        ibuq.c(du1);
        bexl bexl0 = new bexl(new bexf(du1));
        ibnn ibnn0 = ibno.a(ibnp.c, bexl0);
        ibuk ibuk0 = new ibuk(bfah.class);
        bexm bexm0 = new bexm(ibnn0);
        bexn bexn0 = new bexn(ibnn0);
        lsd lsd0 = new lsd(ibuk0, bexm0, new bexo(this, ibnn0), bexn0);
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B1DA6);  // id:pwm_import_preview_recycler_view
        if(ImportPreviewFragment.y(lsd0).j.ij() == null) {
            nry0.i(0x7F0B04A9);  // id:ImportValidationFragment
        }
        ImportPreviewFragment.y(lsd0).j.g(this.getViewLifecycleOwner(), new bexp(new bexg(this, recyclerView0, lsd0)));
        Button button0 = (Button)view0.findViewById(0x7F0B1DA7);  // id:pwm_import_preview_start_import
        ImportPreviewFragment.y(lsd0).l.g(this.getViewLifecycleOwner(), new bexp(new bexh(button0)));
        button0.setOnClickListener(new bexi(nry0, lsd0));
        Button button1 = (Button)view0.findViewById(0x7F0B1DA0);  // id:pwm_import_preview_done
        ImportPreviewFragment.y(lsd0).n.g(this.getViewLifecycleOwner(), new bexp(new bexj(button1)));
        button1.setOnClickListener(new bexk(this));
        ibuq.c(view0);
        return view0;
    }

    public static final bfah y(ibnn ibnn0) {
        return (bfah)ibnn0.a();
    }

    public static final void z(RecyclerView recyclerView0, String s, int v) {
        recyclerView0.an(new bgnw(0x7F0E086B, new bexb(s, v)));  // layout:pwm_import_status
    }
}

