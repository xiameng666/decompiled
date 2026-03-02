import android.content.Context;
import android.content.Intent;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode;
import com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public final class eiqo implements evqf {
    public final Context a;
    public final Intent b;

    public eiqo(Context context0, Intent intent0) {
        this.a = context0;
        this.b = intent0;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        gocg gocg0 = (gocg)object0;
        bboh bboh0 = FlagOverrideChimeraReceiver.b;
        ((ggtj)bboh0.j()).x("Successfully extracted device state");
        Intent intent0 = this.b;
        StrictMode.ThreadPolicy strictMode$ThreadPolicy0 = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file0 = new File(this.a.getCacheDir(), "ph_troubleshooter");
            if(!file0.exists() && !file0.mkdir()) {
                ((ggtj)FlagOverrideChimeraReceiver.b.j()).B("Failed to create temp directory: %s", file0.getAbsolutePath());
                return;
            }
            String[] arr_s = intent0.getStringArrayExtra("flags");
            if(arr_s != null && arr_s.length > 0) {
                ggfp ggfp0 = ggfp.H(arr_s);
                List list0 = FlagOverrideChimeraReceiver.a(gocg0.d, ggfp0);
                List list1 = FlagOverrideChimeraReceiver.a(gocg0.g, ggfp0);
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gocg0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gocg0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hfvv hfvv0 = hfvv.a;
                ((gocg)hftp0.b_message).d = hfvv0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gocg gocg1 = (gocg)hftp0.b_message;
                gocg1.b();
                hfrj.E(list0, gocg1.d);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gocg)hftp0.b_message).g = hfvv0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gocg gocg2 = (gocg)hftp0.b_message;
                gocg2.c();
                hfrj.E(list1, gocg2.g);
                gocg0 = (gocg)hftp0.N_build();
            }
            ((ggtj)bboh0.j()).x("Writing device state file");
            try(FileOutputStream fileOutputStream0 = new FileOutputStream(File.createTempFile(String.format("device-state-%s-", intent0.getStringExtra("invocation_identifier")), ".binarypb", file0))) {
                gocg0.writeToStream(fileOutputStream0);
                ((ggtj)bboh0.j()).x("Wrote device state file");
            }
        }
        catch(IOException iOException0) {
            a.ae(FlagOverrideChimeraReceiver.b.j(), "Failed to write device state", iOException0);
        }
        finally {
            StrictMode.setThreadPolicy(strictMode$ThreadPolicy0);
        }
    }
}

