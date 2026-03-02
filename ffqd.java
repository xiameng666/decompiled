import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.config.ModuleManager.FeatureCheck;
import com.google.android.chimera.config.ModuleManager.FeatureRequest;
import com.google.android.chimera.config.ModuleManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import jeb.synthetic.TWR;

public final class ffqd implements Callable {
    public final ffqe a;
    public final Context b;
    public final ParcelFileDescriptor c;
    public final UUID d;

    public ffqd(ffqe ffqe0, Context context0, ParcelFileDescriptor parcelFileDescriptor0, UUID uUID0) {
        this.a = ffqe0;
        this.b = context0;
        this.c = parcelFileDescriptor0;
        this.d = uUID0;
    }

    @Override
    public final Object call() {
        gdqb gdqb0;
        ffqe ffqe0 = this.a;
        ParcelFileDescriptor parcelFileDescriptor0 = this.c;
        UUID uUID0 = this.d;
        if(hxha.c()) {
            try {
                gdqb0 = gdsp.e("com/google/android/gms/westworld/perfetto/PerfettoProcessor", "persistTraceAndScheduleTraceProcessingInBackground", 0x87, "ScheduleTracePersisting");
            }
            catch(IOException unused_ex) {
                goto label_59;
            }
            try {
                ehks.a(34, uUID0);
                ehkj ehkj0 = ffqe0.a;
                if(!ehkj.i(parcelFileDescriptor0.getStatSize())) {
                    goto label_47;
                }
                else if(!ehkj0.d()) {
                    ehks.a(43, uUID0);
                }
                else {
                    File file0 = ehkj0.a(uUID0);
                    if(file0 == null) {
                        ehks.a(36, uUID0);
                        goto label_52;
                    }
                    try(ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0); FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                        ghjj.b(parcelFileDescriptor$AutoCloseInputStream0, fileOutputStream0);
                        goto label_31;
                    }
                    catch(IOException unused_ex) {
                        if(file0.delete()) {
                            ehks.a(37, uUID0);
                        }
                        else {
                            ehks.a(38, uUID0);
                            ffqe0.a.c(39);
                        }
                    }
                }
                goto label_52;
            }
            catch(Throwable throwable0) {
                goto label_50;
            }
            try {
            label_31:
                parcelFileDescriptor0.close();
            }
            catch(Throwable throwable1) {
                goto label_55;
            }
            try {
                gdqb0.close();
            }
            catch(IOException unused_ex) {
                goto label_59;
            }
            Context context0 = this.b;
            ModuleManager moduleManager0 = ModuleManager.get(context0);
            ModuleManager.FeatureCheck moduleManager$FeatureCheck0 = new ModuleManager.FeatureCheck();
            moduleManager$FeatureCheck0.checkFeatureAtAnyVersion("perfetto_processor");
            if(moduleManager0.checkFeaturesAreAvailable(moduleManager$FeatureCheck0) == 0) {
                if(hxha.c()) {
                    context0.sendBroadcast(new Intent("com.google.android.gms.westworld.perfetto.ACTION_PROCESS_TRACE").setPackage("com.google.android.gms"));
                    return Boolean.valueOf(true);
                }
                ffqe0.a();
                return Boolean.valueOf(false);
            }
            ModuleManager.FeatureRequest moduleManager$FeatureRequest0 = new ModuleManager.FeatureRequest();
            moduleManager$FeatureRequest0.requestFeatureAtAnyVersion("perfetto_processor");
            moduleManager0.requestFeatures(moduleManager$FeatureRequest0);
            return Boolean.valueOf(true);
            try {
            label_47:
                ehks.a(42, uUID0);
                goto label_52;
            }
            catch(Throwable throwable0) {
                try {
                label_50:
                    TWR.safeClose$NT(parcelFileDescriptor0, throwable0);
                    throw throwable0;
                label_52:
                    parcelFileDescriptor0.close();
                    goto label_57;
                }
                catch(Throwable throwable1) {
                }
            }
            try {
            label_55:
                TWR.safeClose$NT(gdqb0, throwable1);
                throw throwable1;
            label_57:
                gdqb0.close();
                return Boolean.valueOf(false);
            }
            catch(IOException unused_ex) {
            label_59:
                ehks.a(44, uUID0);
                return Boolean.valueOf(false);
            }
        }
        try {
            parcelFileDescriptor0.close();
        }
        catch(IOException unused_ex) {
        }
        ffqe0.a();
        return Boolean.valueOf(false);
    }
}

