package com.google.android.gms.growth.featuredrops.activity;

import bvnd;
import bvni;
import bwef;
import gmcg;
import ibuq;

public final class FeatureDropsProofingChimeraActivity extends bvnd {
    private final int E;
    private final boolean F;
    public static final String p;

    static {
        FeatureDropsProofingChimeraActivity.p = bwef.b(FeatureDropsProofingChimeraActivity.class);
    }

    public FeatureDropsProofingChimeraActivity() {
        this.E = 0x7F0B1294;  // id:error_page_container
        this.F = true;
    }

    @Override  // bvnd
    protected final boolean t() {
        return this.F;
    }

    @Override  // bvvt
    protected final int w() {
        return this.E;
    }

    @Override  // bvvt
    protected final boolean x() {
        return true;
    }

    @Override  // bvvt
    protected final void y() {
        this.H();
        gmcg gmcg0 = this.l;
        if(gmcg0 == null) {
            ibuq.j("executor");
            gmcg0 = null;
        }
        gmcg0.execute(new bvni(this));
    }
}

