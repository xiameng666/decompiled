import android.content.Context;
import com.google.android.gms.semanticlocationhistory.db.backup.OdlhBackupService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.batchactivity.CyclingProcessingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.HistoricalBusynessProcessingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.historicalbusyness.TransientHistoricalBusynessProcessingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.pulptraining.PulpTrainingService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.wifi.WifiPlaceVisitProcessingService;
import com.google.android.gms.semanticlocationhistory.edit.EditUploadJob;
import com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedJobHistoryService;
import com.google.android.gms.semanticlocationhistory.federated.FederatedTaskIdentityDataService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddDownloadScheduleService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddMaintenanceService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpInferenceService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpMddDownloadScheduleService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpMddMaintenanceService;
import com.google.android.gms.semanticlocationhistory.reinference.PassiveWifiReinferenceService;
import com.google.android.gms.semanticlocationhistory.topplace.TopPlaceProcessingService;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public final class eoax {
    public static void a(Context context0) {
        if(hyac.S()) {
            clkq clkq0 = new clkq();
            clkq0.w("com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits.StoreVisitsProcessingService");
            clkq0.t("StoreVisitsProcessing");
            clkq0.j(clkm.a(TimeUnit.HOURS.toSeconds(hyac.a.o().u())));
            clkq0.v(2);
            clkq0.x(0, 1);
            clkq0.y(0, 1);
            elza.b(context0, clkq0.a());
        }
        if(WifiPlaceVisitProcessingService.d()) {
            if(hrwa.h()) {
                clks clks0 = new clks();
                clks0.w(WifiPlaceVisitProcessingService.a);
                clks0.t("WifiPlaceVisit");
                clks0.a = clkz.j;
                clks0.l(true);
                clks0.v(2);
                elza.c(context0, clks0.a());
            }
            else {
                clkq clkq1 = new clkq();
                clkq1.w(WifiPlaceVisitProcessingService.a);
                clkq1.t("WifiPlaceVisit");
                clkq1.j(clkm.h);
                clkq1.v((hyac.Z() ? 2 : 1));
                clkq1.x(0, 1);
                clkq1.y(0, 1);
                elza.b(context0, clkq1.a());
            }
        }
        clkq clkq2 = new clkq();
        clkq2.w("com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads.BatchDeidentifiedDataUploadService");
        clkq2.t("BatchDeidentifiedDataUpload");
        clkq2.j(clkm.a(TimeUnit.HOURS.toSeconds(hyac.a.o().g())));
        clkq2.v((hyac.Z() ? 2 : 1));
        clkq2.x(0, 1);
        clkq2.y(0, 1);
        elza.b(context0, clkq2.a());
        clks clks1 = new clks();
        clks1.w(TransientHistoricalBusynessProcessingService.b);
        clks1.t("TransientHistoricalBusyness");
        clks1.m(((int)hybb.a.b().b()));
        clks1.l(true);
        clks1.v(2);
        elza.c(context0, clks1.a());
        if(hybb.a.b().f() && HistoricalBusynessProcessingService.f()) {
            if(hrwa.h()) {
                clks clks2 = new clks();
                clks2.w(HistoricalBusynessProcessingService.b);
                clks2.t("HistoricalBusyness");
                clks2.a = clkz.j;
                clks2.l(true);
                clks2.v(2);
                elza.c(context0, clks2.a());
            }
            else {
                clkq clkq3 = new clkq();
                clkq3.w(HistoricalBusynessProcessingService.b);
                clkq3.t("HistoricalBusyness");
                clkq3.j(clkm.h);
                clkq3.v((hyac.Z() ? 2 : 1));
                clkq3.x(0, 1);
                clkq3.y(0, 1);
                elza.b(context0, clkq3.a());
            }
        }
        if(CyclingProcessingService.g()) {
            if(hrwa.h()) {
                clks clks3 = new clks();
                clks3.w(CyclingProcessingService.a);
                clks3.t("CyclingActivity");
                clks3.a = clkz.j;
                clks3.l(true);
                clks3.v(2);
                elza.c(context0, clks3.a());
            }
            else {
                clkq clkq4 = new clkq();
                clkq4.w(CyclingProcessingService.a);
                clkq4.t("CyclingActivity");
                clkq4.j(clkm.h);
                clkq4.v((hyac.Z() ? 2 : 1));
                clkq4.x(0, 1);
                clkq4.y(0, 1);
                elza.b(context0, clkq4.a());
            }
        }
        if(PulpInferenceService.j()) {
            clkq clkq5 = new clkq();
            clkq5.t("PulpInference");
            clkq5.w(PulpInferenceService.g);
            clkm clkm0 = clkm.h;
            clkq5.j(clkm0);
            clkq5.v(0);
            clkq5.r(true);
            clkq5.g(1);
            clkq5.f(0, 1);
            elza.b(context0, clkq5.a());
            if(hrwa.h()) {
                clks clks4 = new clks();
                clks4.w(PulpMddDownloadScheduleService.a);
                clks4.t("PulpMddRefreshDownloadTask");
                clks4.a = clkz.j;
                clks4.l(true);
                clks4.v(2);
                clks4.k();
                elza.c(context0, clks4.a());
                clks clks5 = new clks();
                clks5.w(PulpMddMaintenanceService.a);
                clks5.t("PulpMddMaintenanceTask");
                clks5.a = clkz.j;
                clks5.l(true);
                clks5.v(2);
                clks5.k();
                elza.c(context0, clks5.a());
            }
            else {
                clkq clkq6 = new clkq();
                clkq6.w(PulpMddDownloadScheduleService.a);
                clkq6.t("PulpMddRefreshDownloadTask");
                clkq6.j(clkm0);
                clkq6.v((hyac.Z() ? 2 : 1));
                clkq6.g(1);
                clkq6.x(0, 1);
                elza.b(context0, clkq6.a());
                clkq clkq7 = new clkq();
                clkq7.w(PulpMddMaintenanceService.a);
                clkq7.t("PulpMddMaintenanceTask");
                clkq7.j(clkm0);
                clkq7.v((hyac.Z() ? 2 : 1));
                clkq7.g(1);
                clkq7.x(0, 1);
                elza.b(context0, clkq7.a());
            }
            if(hxzo.c()) {
                clkq clkq8 = new clkq();
                clkq8.w(PulpTrainingService.b);
                clkq8.t("PulpTraining");
                clkq8.j(clkm.l);
                clkq8.v((hyac.Z() ? 2 : 1));
                clkq8.x(0, 1);
                clkq8.y(0, 1);
                elza.b(context0, clkq8.a());
            }
        }
        if(TopPlaceProcessingService.h()) {
            clkq clkq9 = new clkq();
            clkq9.t("TopPlaceProcessing");
            clkq9.w(TopPlaceProcessingService.b);
            clkq9.j(clkm.k);
            clkq9.v(0);
            clkq9.r(true);
            clkq9.g(1);
            clkq9.f(0, 1);
            elza.b(context0, clkq9.a());
        }
        if(hxya.z()) {
            if(hrwa.h()) {
                clks clks6 = new clks();
                clks6.t("FederatedLocation");
                clks6.w("com.google.android.gms.semanticlocationhistory.federated.FederatedScheduleService");
                clks6.a = clkz.j;
                clks6.l(false);
                clks6.v(2);
                elza.c(context0, clks6.a());
            }
            else {
                clkq clkq10 = new clkq();
                clkq10.t("FederatedLocation");
                clkq10.w("com.google.android.gms.semanticlocationhistory.federated.FederatedScheduleService");
                clkq10.j(clkm.h);
                clkq10.v((hyac.Z() ? 2 : 1));
                clkq10.r(false);
                clkq10.g(2);
                clkq10.f(0, 1);
                elza.b(context0, clkq10.a());
            }
        }
        if(hxya.z()) {
            if(hrwa.h()) {
                clks clks7 = new clks();
                clks7.t("FederatedTaskIdentityDataService");
                clks7.w(FederatedTaskIdentityDataService.a);
                clks7.v(2);
                clks7.a = clkz.j;
                clks7.l(false);
                clks7.j();
                elza.c(context0, clks7.a());
            }
            else {
                clkq clkq11 = new clkq();
                clkq11.t("FederatedTaskIdentityDataService");
                clkq11.w(FederatedTaskIdentityDataService.a);
                clkq11.j(clkm.h);
                clkq11.v((hyac.Z() ? 2 : 1));
                clkq11.r(false);
                clkq11.g(2);
                clkq11.f(1, 1);
                elza.b(context0, clkq11.a());
            }
        }
        if(hxya.z()) {
            if(hrwa.h()) {
                clks clks8 = new clks();
                clks8.t("FederatedJobHistoryService");
                clks8.w(FederatedJobHistoryService.a);
                clks8.v(2);
                clks8.a = clkz.j;
                clks8.l(false);
                clks8.j();
                elza.c(context0, clks8.a());
            }
            else {
                clkq clkq12 = new clkq();
                clkq12.t("FederatedJobHistoryService");
                clkq12.w(FederatedJobHistoryService.a);
                clkq12.j(clkm.h);
                clkq12.v((hyac.Z() ? 2 : 1));
                clkq12.r(false);
                clkq12.g(2);
                clkq12.f(1, 1);
                elza.b(context0, clkq12.a());
            }
        }
        boolean z = hxya.u();
        boolean z1 = hxya.s();
        boolean z2 = hxya.t();
        clkq clkq13 = new clkq();
        clkq13.t("BrellaFrequentInvocationService");
        clkq13.w("com.google.android.gms.semanticlocationhistory.federated.BrellaFrequentInvocationService");
        clkq13.j(clkm.a(hxya.a.g().b()));
        clkq13.v((hyac.Z() ? 2 : 1));
        clkq13.x(((int)z1), 1);
        clkq13.y(((int)z), 1);
        clkq13.f(((int)z2), 1);
        elza.b(context0, clkq13.a());
        if(hrwa.h()) {
            ArrayList arrayList0 = new ArrayList();
            int v = hxya.H();
            BrellaInvocationService.e(context0, ((boolean)(v ^ 1)));
            gged_interceptors gged0 = BrellaInvocationService.d(((boolean)v));
            int v1 = ((ggna)gged0).c;
            for(int v2 = 0; v2 < v1; ++v2) {
                String s = (String)gged0.get(v2);
                clks clks9 = new clks();
                clks9.t(s);
                clks9.w("com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService");
                clks9.a = clkz.j;
                clks9.l(true);
                clks9.v(2);
                if(hxya.x()) {
                    clks9.k();
                }
                if(hxya.v()) {
                    clks9.e();
                }
                if(hxya.w()) {
                    clks9.j();
                }
                arrayList0.add(clks9.a());
            }
            for(Object object0: arrayList0) {
                elza.c(context0, ((clla)object0));
            }
        }
        else {
            boolean z3 = hxya.x();
            boolean z4 = hxya.v();
            boolean z5 = hxya.w();
            ArrayList arrayList1 = new ArrayList();
            int v3 = hxya.H();
            BrellaInvocationService.e(context0, ((boolean)(v3 ^ 1)));
            gged_interceptors gged1 = BrellaInvocationService.d(((boolean)v3));
            int v4 = ((ggna)gged1).c;
            for(int v5 = 0; v5 < v4; ++v5) {
                String s1 = (String)gged1.get(v5);
                clkq clkq14 = new clkq();
                clkq14.t(s1);
                clkq14.w("com.google.android.gms.semanticlocationhistory.federated.BrellaInvocationService");
                clkq14.j(clkm.h);
                clkq14.v((hyac.Z() ? 2 : 1));
                clkq14.x(((int)z4), 1);
                clkq14.y(((int)z3), 1);
                clkq14.f(((int)z5), 1);
                arrayList1.add(clkq14.a());
            }
            for(Object object1: arrayList1) {
                elza.b(context0, ((clkr)object1));
            }
        }
        if(hxzv.d()) {
            if(hrwa.h()) {
                clks clks10 = new clks();
                clks10.w(RegionMddMaintenanceService.a);
                clks10.t("RegionMddMaintenanceTask");
                clks10.v(2);
                clks10.a = clkz.j;
                clks10.l(false);
                elza.c(context0, clks10.a());
            }
            else {
                clkq clkq15 = new clkq();
                clkq15.w(RegionMddMaintenanceService.a);
                clkq15.t("RegionMddMaintenanceTask");
                clkq15.j(clkm.h);
                clkq15.v((hyac.Z() ? 2 : 1));
                clkq15.g(2);
                clkq15.x(0, 1);
                elza.b(context0, clkq15.a());
            }
        }
        if(hxzv.d()) {
            clkq clkq16 = new clkq();
            clkq16.w(RegionMddDownloadScheduleService.a);
            clkq16.t("RegionMddRefreshDownloadTask");
            clkq16.j(clkm.c);
            clkq16.v((hyac.Z() ? 2 : 1));
            clkq16.g(0);
            clkq16.x(0, 1);
            elza.b(context0, clkq16.a());
        }
        if(hyac.S() && hxwv.e()) {
            if(hrwa.h()) {
                clks clks11 = new clks();
                clks11.w(OdlhBackupService.a);
                clks11.t("OdlhBackup");
                clks11.a = clkz.j;
                clks11.l(true);
                clks11.v(2);
                if(hxwv.h()) {
                    clks11.e();
                }
                elza.c(context0, clks11.a());
            }
            else {
                clkq clkq17 = new clkq();
                clkq17.w(OdlhBackupService.a);
                clkq17.t("OdlhBackup");
                clkq17.j(clkm.h);
                clkq17.v(0);
                clkq17.r(hxwv.h());
                clkq17.g(0);
                clkq17.f(0, 1);
                clkq17.t = cllb.a(0, ((int)hxwv.a.b().a()), ((int)hxwv.a.b().b()));
                elza.b(context0, clkq17.a());
            }
        }
        if(hyac.S()) {
            if(hrwa.h()) {
                clks clks12 = new clks();
                clks12.w(EditUploadJob.a);
                clks12.t("EditUploadJob");
                clks12.a = clkz.j;
                clks12.v(2);
                clks12.l(true);
                clks12.e();
                elza.c(context0, clks12.a());
            }
            else {
                clkq clkq18 = new clkq();
                clkq18.t("EditUploadJob");
                clkq18.w(EditUploadJob.a);
                clkq18.j(clkm.h);
                clkq18.v(0);
                clkq18.r(true);
                clkq18.g(0);
                clkq18.f(0, 1);
                elza.b(context0, clkq18.a());
            }
        }
        if(hxzf.d()) {
            clkq clkq19 = new clkq();
            clkq19.w(PassiveWifiReinferenceService.a);
            clkq19.t("PassiveWifiReinference");
            clkq19.j(clkm.e);
            clkq19.v((hyac.Z() ? 2 : 1));
            clkq19.r(true);
            clkq19.g(1);
            clkq19.f(0, 1);
            elza.b(context0, clkq19.a());
        }
        if(hxxq.d()) {
            if(hrwa.h()) {
                clks clks13 = new clks();
                clks13.w("com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelRefreshTokensJob");
                clks13.t("ParcelRefreshTokenJob");
                clks13.a = clkz.j;
                clks13.v(2);
                clks13.l(true);
                if(hxxq.e()) {
                    clks13.k();
                    clks13.e();
                }
                elza.c(context0, clks13.a());
            }
            else {
                clkq clkq20 = new clkq();
                clkq20.t("ParcelRefreshTokenJob");
                clkq20.w("com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelRefreshTokensJob");
                clkq20.j(clkm.h);
                clkq20.v(0);
                clkq20.f(0, 1);
                if(hxxq.e()) {
                    clkq20.r(true);
                    clkq20.g(1);
                }
                elza.b(context0, clkq20.a());
            }
        }
        if(hxxq.d()) {
            if(hrwa.h()) {
                clks clks14 = new clks();
                clks14.w("com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelSynchronizePersonalizationJob");
                clks14.t("ParcelSynchronizePersonalizationJob");
                clks14.a = clkz.j;
                clks14.v(2);
                clks14.l(true);
                if(hxxq.f()) {
                    clks14.k();
                    clks14.e();
                }
                elza.c(context0, clks14.a());
                return;
            }
            clkq clkq21 = new clkq();
            clkq21.t("ParcelSynchronizePersonalizationJob");
            clkq21.w("com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelSynchronizePersonalizationJob");
            clkq21.j(clkm.h);
            clkq21.v(0);
            clkq21.f(0, 1);
            if(hxxq.f()) {
                clkq21.r(true);
                clkq21.g(1);
            }
            elza.b(context0, clkq21.a());
        }
    }
}

