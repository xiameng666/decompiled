import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;

public final class arcy implements Runnable {
    public final arem a;

    public arcy(arem arem0) {
        this.a = arem0;
    }

    @Override
    public final void run() {
        ProtoLiteBuilder hftp3;
        ProtoLiteBuilder hftp2;
        int v1;
        arem arem0 = this.a;
        arem0.d = SystemClock.elapsedRealtime();
        ProtoLiteBuilder hftp0 = arem0.e;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        boolean z = true;
        if(((hkyf)hftv0).c == -10) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            hkyf hkyf0 = (hkyf)hftp0.b_message;
            hkyf0.b |= 1;
            hkyf0.c = -1;
        }
        Context context0 = arem0.b;
        int v = ModuleManager.get(context0).getCurrentModuleApk().apkVersionCode;
        arem.a.d("Apk version: %d", new Object[]{v});
        ProtoLiteBuilder hftp1 = arem0.l;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hkyg hkyg0 = (hkyg)hftp1.b_message;
        hkyg0.b |= 2;
        hkyg0.e = v;
        if(hqhq.q()) {
            try {
                try {
                    v1 = new adgg(context0).e(context0).length;
                    hftp2 = arem0.l;
                    goto label_41;
                }
                catch(RemoteException | azqj | azqi exception0) {
                }
                arem.a.g("Unable to get number of accounts", exception0, new Object[0]);
                hftp3 = arem0.l;
                if(!hftp3.b_message.isImmutable()) {
                    goto label_28;
                }
                goto label_29;
            }
            catch(Throwable throwable0) {
                goto label_34;
            }
        label_28:
            hftp3.ensureMutable();
        label_29:
            hkyg hkyg1 = (hkyg)hftp3.b_message;
            hkyg1.b |= 8;
            hkyg1.j = -1;
            goto label_46;
        label_34:
            ProtoLiteBuilder hftp4 = arem0.l;
            if(!hftp4.b_message.isImmutable()) {
                hftp4.ensureMutable();
            }
            hkyg hkyg2 = (hkyg)hftp4.b_message;
            hkyg2.b |= 8;
            hkyg2.j = -1;
            throw throwable0;
        label_41:
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hkyg hkyg3 = (hkyg)hftp2.b_message;
            hkyg3.b |= 8;
            hkyg3.j = v1;
        }
    label_46:
        if(hqhq.q()) {
            NetworkInfo networkInfo0 = ((ConnectivityManager)arem0.b.getSystemService("connectivity")).getActiveNetworkInfo();
            ProtoLiteBuilder hftp5 = arem0.l;
            if(networkInfo0 == null || !networkInfo0.isConnected()) {
                z = false;
            }
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            hkyg hkyg4 = (hkyg)hftp5.b_message;
            hkyg4.b |= 16;
            hkyg4.k = z;
        }
        if(hqmi.a.b().d()) {
            PowerManager powerManager0 = (PowerManager)arem0.b.getSystemService("power");
            if(powerManager0 != null) {
                ProtoLiteBuilder hftp6 = arem0.l;
                boolean z1 = powerManager0.isPowerSaveMode();
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                hkyg hkyg5 = (hkyg)hftp6.b_message;
                hkyg5.b |= 0x80;
                hkyg5.o = z1;
            }
        }
    }
}

