import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.WorkSource;
import android.util.Log;
import java.util.Iterator;

public final class fffq extends clht {
    final esaa a;

    public fffq(Looper looper0, esaa esaa0) {
        super(looper0);
        this.a = esaa0;
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "handleMessage live listener: " + message0);
        }
        fflv fflv0 = (fflv)message0.obj;
        try {
            esaa esaa0 = this.a;
            if(esaa0 != null) {
                WorkSource workSource0 = fflv0.g;
                if(workSource0 != null) {
                    esaa0.k(workSource0);
                }
                esaa0.b();
            }
            if(message0.what == 1) {
                ffgn ffgn0;
                while((ffgn0 = (ffgn)fflv0.c.poll()) != null) {
                    Iterator iterator0 = fflv0.b.values().iterator();
                    boolean z = false;
                label_14:
                    if(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        ffls ffls0 = (ffls)object0;
                        if(ffgn0.d(ffls0.b, ffls0.d, ffls0.c, ffls0.e)) {
                            goto label_24;
                        }
                        else {
                            goto label_14;
                            try {
                            label_24:
                                fflv0.x.a(fflv0.e.b);
                                ffgn0.b(null, ffls0.a);
                            }
                            catch(RemoteException unused_ex) {
                                fflv0.c.clear();
                                ffls0.binderDied();
                            }
                            z = true;
                            goto label_14;
                        }
                        break;
                    }
                    if(!z && Log.isLoggable("WearableService", 2)) {
                        String s = String.valueOf(ffgn0.h.getData());
                        Log.v("WearableService", "no live listeners matched " + ffgn0.g + " " + s);
                    }
                    if(Log.isLoggable("WearableService", 3)) {
                        Log.d("WearableService", a.c(ffgn0, fflv0, "processEvents live listener: published: ", " "));
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            esaa esaa1 = this.a;
            if(esaa1 != null && esaa1.l()) {
                esaa1.g();
                WorkSource workSource1 = fflv0.g;
                if(workSource1 != null) {
                    esaa1.i(workSource1);
                }
            }
            throw throwable0;
        }
        esaa esaa2 = this.a;
        if(esaa2 != null && esaa2.l()) {
            esaa2.g();
            WorkSource workSource2 = fflv0.g;
            if(workSource2 != null) {
                esaa2.i(workSource2);
            }
        }
    }
}

