import android.text.format.DateUtils;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import java.util.concurrent.Callable;

public final class fcne implements Callable {
    public final fcnm a;

    public fcne(fcnm fcnm0) {
        this.a = fcnm0;
    }

    @Override
    public final Object call() {
        fcnm fcnm1;
        ApplicationBackupStats[] arr_applicationBackupStats1;
        BackupStatsRequestConfig backupStatsRequestConfig0 = new BackupStatsRequestConfig(true, true);
        fcnm fcnm0 = this.a;
        ApplicationBackupStats[] arr_applicationBackupStats = fcnm0.f.a(backupStatsRequestConfig0);
        int v = 0;
        if(arr_applicationBackupStats == null) {
            fcnm.a.m("fetchBackupSizeAndTimeStats: an error occurred", new Object[0]);
            return fexq.a;
        }
        switch(arr_applicationBackupStats.length) {
            case 0: {
                fcnm.a.j("fetchBackupSizeAndTimeStats: no apps backed up", new Object[0]);
                return fexq.a;
            }
            case 1: {
                if(arr_applicationBackupStats[0].a.equals("@pm@")) {
                    fcnm.a.j("fetchBackupSizeAndTimeStats: only @pm@ backed up", new Object[0]);
                    return fexq.a;
                }
            }
        }
        baun baun0 = fcnm.a;
        baun0.j("fetchBackupSizeAndTimeStats: %d apps backed up", new Object[]{((int)(arr_applicationBackupStats.length - 1))});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexq.a).v_newBuilder();
        long v1 = 0L;
        long v2 = 0L;
        while(v < arr_applicationBackupStats.length) {
            ApplicationBackupStats applicationBackupStats0 = arr_applicationBackupStats[v];
            String s = applicationBackupStats0.a;
            if(s.equals("@pm@")) {
                arr_applicationBackupStats1 = arr_applicationBackupStats;
                fcnm1 = fcnm0;
            }
            else {
                v2 = Math.max(v2, applicationBackupStats0.d);
                fcnm1 = fcnm0;
                arr_applicationBackupStats1 = arr_applicationBackupStats;
                long v3 = ((long)(applicationBackupStats0.b + applicationBackupStats0.c)) + applicationBackupStats0.e;
                if(s.equals("com.google.wear.services")) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fexq fexq0 = (fexq)hftp0.b_message;
                    fexq0.b |= 1;
                    fexq0.c = v3;
                }
                else if(s.equals("com.android.providers.settings")) {
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    fexq fexq1 = (fexq)hftp0.b_message;
                    fexq1.b |= 2;
                    fexq1.d = v3;
                }
                else {
                    v1 += v3;
                }
            }
            ++v;
            fcnm0 = fcnm1;
            arr_applicationBackupStats = arr_applicationBackupStats1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexq fexq2 = (fexq)hftp0.b_message;
        fexq2.b |= 4;
        fexq2.e = v1;
        baun0.j("fetchBackupSizeAndTimeStats: %s last backup time", new Object[]{DateUtils.formatDateTime(fcnm0.b, v2, 17)});
        hfwn hfwn0 = hfyn.h(v2);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fexq fexq3 = (fexq)hftp0.b_message;
        hfwn0.getClass();
        fexq3.f = hfwn0;
        fexq3.b |= 8;
        return (fexq)hftp0.N_build();
    }
}

