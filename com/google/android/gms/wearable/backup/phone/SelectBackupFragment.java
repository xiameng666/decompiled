package com.google.android.gms.wearable.backup.phone;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.wearable.AppTheme;
import du;
import fcjn;
import fcjo;
import fcln;
import fclp;
import fclq;
import fclr;
import fczo;
import gftb;
import j..util.Objects;
import lso;
import qq;
import tk;

public final class SelectBackupFragment extends du {
    private fcln a;

    public SelectBackupFragment() {
        this.a = null;
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        this.a = (fcln)new lso(((RestoreFlowChimeraActivity)context0)).a(fcln.class);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        AppTheme appTheme0 = fczo.e(this.getArguments());
        LayoutInflater layoutInflater1 = fczo.c(appTheme0, layoutInflater0);
        View view0 = layoutInflater1.inflate((fczo.i(appTheme0) ? 0x7F0E0229 : 0x7F0E022F), viewGroup0, false);  // layout:companion_restore_expressive_select_backup_fragment
        Button button0 = (Button)view0.findViewById(0x7F0B0DFB);  // id:cancel_action
        RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0B0C65);  // id:backup_devices
        fcln fcln0 = this.a;
        gftb.check(fcln0);
        fcjn fcjn0 = new fcjn(appTheme0);
        qq qq0 = new qq(new tk[]{new fcjo(appTheme0), fcjn0});
        button0.setOnClickListener(new fclp(fcln0));
        layoutInflater1.getContext();
        recyclerView0.ap(new LinearLayoutManager());
        recyclerView0.an(qq0);
        Objects.requireNonNull(fcjn0);
        fclq fclq0 = new fclq(fcjn0);
        fcln0.g.g(this, fclq0);
        fclr fclr0 = new fclr(this, fcjn0.f, fcln0);
        fcjn0.f.g(this, fclr0);
        return view0;
    }
}

