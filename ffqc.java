import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.service.tracing.TraceReportService.TraceParams;
import android.service.tracing.TraceReportService;
import java.io.IOException;
import java.util.UUID;
import jeb.synthetic.TWR;

public final class ffqc extends TraceReportService {
    public final void a(Context context0) {
        super.attachBaseContext(context0);
    }

    public final void onCreate() {
        if(!bbqa.c()) {
            throw new AssertionError("Trace processing service should not be enabled pre-T.");
        }
        super.onCreate();
    }

    public final void onReportTrace(TraceReportService.TraceParams traceReportService$TraceParams0) {
        UUID uUID0;
        Context context0;
        ParcelFileDescriptor parcelFileDescriptor0;
        if(hxha.a.b().f()) {
            try {
                parcelFileDescriptor0 = traceReportService$TraceParams0.getFd();
            }
            catch(IOException unused_ex) {
                return;
            }
            try {
                context0 = this.getApplicationContext();
                uUID0 = traceReportService$TraceParams0.getUuid();
                if(hxha.c()) {
                    goto label_5;
                }
                else {
                    goto label_17;
                }
                goto label_23;
            }
            catch(Throwable throwable0) {
                goto label_21;
            }
            try {
            label_5:
                ParcelFileDescriptor parcelFileDescriptor1 = parcelFileDescriptor0.dup();
                bblp bblp0 = new bblp(1, 10);
                cljp.a(context0);
                bblp0.e(new ffqd(new ffqe(new ehkj(ehkt.b(context0))), context0, parcelFileDescriptor1, uUID0));
                goto label_13;
            }
            catch(Throwable throwable1) {
                try {
                    try {
                        TWR.safeClose$NT(parcelFileDescriptor0, throwable1);
                        throw throwable1;
                    label_13:
                        parcelFileDescriptor0.close();
                    }
                    catch(IOException unused_ex) {
                        gmbu.i(Boolean.valueOf(false));
                    }
                    goto label_23;
                    try {
                    label_17:
                        parcelFileDescriptor0.close();
                    }
                    catch(IOException unused_ex) {
                    }
                    gmbu.i(Boolean.valueOf(false));
                    goto label_23;
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_21:
                TWR.safeClose$NT(parcelFileDescriptor0, throwable0);
                throw throwable0;
            label_23:
                if(parcelFileDescriptor0 != null) {
                    parcelFileDescriptor0.close();
                }
            }
            catch(IOException unused_ex) {
            }
        }
    }
}

