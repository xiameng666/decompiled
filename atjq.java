import android.os.RemoteException;
import com.google.android.gms.backup.extension.download.CustomBackupDataDownloadResult;
import java.io.File;
import java.sql.Timestamp;

public final class atjq implements Runnable {
    public final atjs a;

    public atjq(atjs atjs0) {
        this.a = atjs0;
    }

    @Override
    public final void run() {
        atjs atjs0 = this.a;
        atjs0.d.b("com.android.providers.telephony").delete();
        File file0 = atjs0.d.b;
        (hrnt.i() ? new File(ccsb.a.b(file0, "restore_token_file")) : new File(file0, "restore_token_file")).delete();
        (hrnt.i() ? new File(ccsb.a.b(file0, "@pm@")) : new File(file0, "@pm@")).delete();
        asdc.a.b(atjs0.b, true);
        arua arua0 = atjs0.e;
        if(arua0 != null) {
            try {
                arua0.a(new CustomBackupDataDownloadResult(true, ""));
            }
            catch(RemoteException remoteException0) {
                atjs.a.g("Caught RemoteException while sending onComplete. %s", remoteException0, new Object[0]);
            }
        }
        long v = atjs0.f == null ? 0L : new Timestamp(System.currentTimeMillis()).getTime() - atjs0.f.getTime();
        aqys aqys0 = atjs0.c;
        ProtoLiteBuilder hftp0 = aqra.b();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gidz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gidz)hftv0).c = 3;
        ((gidz)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        gidz gidz0 = (gidz)hftp1.b_message;
        gidz0.b |= 2;
        gidz0.d = v / 1000L;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp0.b_message;
        gidz gidz1 = (gidz)hftp1.N_build();
        gidz1.getClass();
        ghys0.J = gidz1;
        ghys0.c |= 0x1000;
        aqys0.x(hftp0, ghyr.Q, aqys0.d);
        aqjk aqjk0 = new aqjk(atjs0.b);
        new aqxo(atjs0.b, aqjk0, null).a(new atjp());
    }
}

