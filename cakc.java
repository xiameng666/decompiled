import com.google.android.gms.ipa.base.IpaGcmTaskChimeraService;
import jeb.synthetic.TWR;

public final class cakc implements Runnable {
    public final IpaGcmTaskChimeraService a;

    public cakc(IpaGcmTaskChimeraService ipaGcmTaskChimeraService0) {
        this.a = ipaGcmTaskChimeraService0;
    }

    @Override
    public final void run() {
        int v5;
        int v3;
        canh canh0 = new canh(9);
        IpaGcmTaskChimeraService ipaGcmTaskChimeraService0 = this.a;
        caop caop0 = new caop(ipaGcmTaskChimeraService0.getContentResolver(), null);
        caoi caoi0 = new caoi(caop0);
        caoj caoj0 = new caoj(caop0);
        ekyx ekyx0 = new ekyx();
        ekyx0.a = "MediastoreIndexer";
        elfw elfw0 = new elfw(ipaGcmTaskChimeraService0, new ekyy(ekyx0));
        ((ggtj)calw.a.h()).x("Starting mediastore diff logging operation");
        if(huhz.n() && huhz.o()) {
            cang cang0 = new cang();
            cang0.b(((int)(bbnj.a(ipaGcmTaskChimeraService0, "mediastore-indexer.db") >> 10)));
            caot caot0 = caoi0.a(Long.valueOf(0L), null);
            int v = caot0 == null ? -1 : caot0.a();
            if(v > 0) {
                int v1 = calw.a("internal.3p:MusicRecording", elfw0);
                if(v1 == -1) {
                    cang0.f(0x80000000);
                }
                else {
                    cang0.f(v - v1);
                }
                int v2 = calw.a("internal.3p:MusicAlbum", elfw0);
                caoq caoq0 = caoj0.a(caok.a);
                if(caoq0 == null) {
                    v3 = -1;
                }
                else {
                    try {
                        v3 = caoq0.a();
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(caoq0, throwable0);
                        throw throwable0;
                    }
                    caoq0.close();
                }
                if(v2 != -1 && v3 != -1) {
                    cang0.c(v3 - v2);
                }
                else {
                    cang0.c(0x80000000);
                }
                int v4 = calw.a("internal.3p:MusicGroup", elfw0);
                caoq caoq1 = caoj0.a(caok.b);
                if(caoq1 == null) {
                    v5 = -1;
                }
                else {
                    try {
                        v5 = caoq1.a();
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(caoq1, throwable1);
                        throw throwable1;
                    }
                    caoq1.close();
                }
                if(v4 != -1 && v5 != -1) {
                    cang0.d(v5 - v4);
                }
                else {
                    cang0.d(0x80000000);
                }
                cang0.e();
                canh0.e(cang0);
                cakj.a().d(canh0.a());
            }
        }
    }
}

