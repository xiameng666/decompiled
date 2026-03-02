package com.google.android.gms.location.density;

import bbcu;
import bbdg;
import bboh;
import ccmq;
import cllr;
import cmrj;
import cmrl;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import fjcv;
import ggtj;
import glzd;
import gmap;
import gmbt;
import gmbu;
import gmcd;
import huvv;

public class PopulationDensityMddDownloadMaintenanceService extends GmsTaskBoundService {
    public static final int a;
    private static final bboh b;
    private final fjcv c;

    static {
        PopulationDensityMddDownloadMaintenanceService.b = bboh.b("PopulationDensityMddDownloadMaintenanceService", bbcu.g);
    }

    public PopulationDensityMddDownloadMaintenanceService() {
        cmrl.b(AppContextProvider.a());
        this.c = cmrl.a();
    }

    public PopulationDensityMddDownloadMaintenanceService(fjcv fjcv0) {
        this.c = fjcv0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.jn);
        Integer integer0 = (int)2;
        if(huvv.f()) {
            if(!cllr0.a.equals("PopulationDensityMddDownloadMaintenanceService")) {
                ((ggtj)PopulationDensityMddDownloadMaintenanceService.b.j()).x("MDD maintenance task failed: tag mismatch");
                return gmbu.i(integer0);
            }
            return glzd.f(gmbt.h(this.c.h()), new cmrj(), gmap.a);
        }
        return gmbu.i(integer0);
    }
}

