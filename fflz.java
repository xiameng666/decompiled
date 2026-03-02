import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ui.WearableManageSpaceChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fflz extends AsyncTask {
    final WeakReference a;

    public fflz(WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity0) {
        this.a = new WeakReference(wearableManageSpaceChimeraActivity0);
    }

    protected final Status a() {
        WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity0 = (WearableManageSpaceChimeraActivity)this.a.get();
        if(this.isCancelled()) {
            return null;
        }
        try {
            fcer fcer0 = fcfo.c(wearableManageSpaceChimeraActivity0);
            fdgp fdgp0 = new fdgp(fcer0.a, fcer0.D);
            fcer0.D.c(fdgp0);
            evrg.o(batf.c(fdgp0), 5L, TimeUnit.SECONDS);
            return Status.b;
        }
        catch(ExecutionException | TimeoutException | InterruptedException unused_ex) {
            return Status.d;
        }
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        return this.a();
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        if(this.isCancelled()) {
            return;
        }
        WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity0 = (WearableManageSpaceChimeraActivity)this.a.get();
        if(!((Status)object0).e()) {
            Log.w("WearableSpaceActivity", "Error while clearing storage: " + ((Status)object0).toString());
        }
        wearableManageSpaceChimeraActivity0.a();
    }
}

