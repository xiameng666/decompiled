import android.content.Context;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import j..util.Optional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Callable;
import jeb.synthetic.TWR;

public final class ffqj implements Callable {
    public final ParcelFileDescriptor a;
    public final UUID b;
    public final Context c;

    public ffqj(ParcelFileDescriptor parcelFileDescriptor0, UUID uUID0, Context context0) {
        this.a = parcelFileDescriptor0;
        this.b = uUID0;
        this.c = context0;
    }

    @Override
    public final Object call() {
        Object object0;
        boolean z;
        gdqb gdqb0;
        ParcelFileDescriptor parcelFileDescriptor0;
        UUID uUID0;
        Context context0;
        try {
            context0 = this.c;
            uUID0 = this.b;
            parcelFileDescriptor0 = this.a;
            gdqb0 = gdsp.e("com/google/android/gms/westworld/perfetto/PerfettoUploader", "scheduleTraceUploadCheckedPlatformVersion", 0x89, "ScheduleTraceUpload");
        }
        catch(IOException unused_ex) {
            goto label_77;
        }
        try {
            z = true;
            ehks.a(1, uUID0);
            ffqk.a();
            ehkj ehkj0 = new ehkj(ehkt.c(context0));
            cljp cljp0 = cljp.a(context0);
            if(iaby.k()) {
                Optional optional0 = ehkt.a(context0);
                if(optional0.isEmpty()) {
                    ehks.a(71, uUID0);
                    if(!iacm.h()) {
                        ehkj0.c(74);
                    }
                    goto label_63;
                }
                else if(!((Boolean)optional0.get()).booleanValue()) {
                    ehks.a(0x4F, uUID0);
                    ehkj0.c(73);
                    goto label_63;
                }
                else if(!ehkj.i(parcelFileDescriptor0.getStatSize())) {
                    ehks.a(7, uUID0);
                    goto label_63;
                }
                else if(!ehkj0.d()) {
                    ehks.a(5, uUID0);
                    goto label_63;
                }
                else {
                    File file0 = ehkj0.a(uUID0);
                    if(file0 == null) {
                        ehks.a(6, uUID0);
                        goto label_63;
                    }
                    else {
                        try(ParcelFileDescriptor.AutoCloseInputStream parcelFileDescriptor$AutoCloseInputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor0); FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
                            ghjj.b(parcelFileDescriptor$AutoCloseInputStream0, fileOutputStream0);
                        }
                        catch(IOException unused_ex) {
                            if(file0.delete()) {
                                ehks.a(8, uUID0);
                            }
                            else {
                                ehks.a(9, uUID0);
                                ehkj0.c(21);
                            }
                            goto label_63;
                        }
                        if(ehkj0.e()) {
                            ehks.a(2, uUID0);
                            clkn clkn0 = new clkn();
                            clkn0.t("com.google.android.gms.westworld.perfetto.PerfettoScheduledUploadService");
                            clkn0.w("com.google.android.gms.westworld.perfetto.PerfettoScheduledUploadService");
                            clkn0.p = true;
                            clkn0.v(1);
                            clkn0.e(0L, 1L);
                            clkn0.r(iaby.a.g().y());
                            clkn0.g(((int)iaby.l()));
                            clkn0.i(iaby.a.g().z());
                            cljp0.f(clkn0.a());
                        }
                        else {
                            ehkj0.c(24);
                            goto label_63;
                        }
                    }
                }
            }
            else {
                ehks.a(69, uUID0);
                ehkj0.c(72);
            label_63:
                z = false;
            }
            goto label_68;
        }
        catch(Throwable throwable0) {
            try {
                TWR.safeClose$NT(parcelFileDescriptor0, throwable0);
                throw throwable0;
            label_68:
                object0 = Boolean.valueOf(z);
                if(parcelFileDescriptor0 != null) {
                    parcelFileDescriptor0.close();
                }
                goto label_75;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
            TWR.safeClose$NT(gdqb0, throwable1);
            throw throwable1;
        label_75:
            gdqb0.close();
            return object0;
        }
        catch(IOException unused_ex) {
        label_77:
            ffqk.a();
            return Boolean.valueOf(false);
        }
    }
}

