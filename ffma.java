import android.os.AsyncTask;
import android.text.format.Formatter;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.StorageInfoResponse;
import com.google.android.gms.wearable.ui.WearableManageSpaceChimeraActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ffma extends AsyncTask {
    final WeakReference a;

    public ffma(WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity0) {
        this.a = new WeakReference(wearableManageSpaceChimeraActivity0);
    }

    protected final fceq a() {
        WearableManageSpaceChimeraActivity wearableManageSpaceChimeraActivity0 = (WearableManageSpaceChimeraActivity)this.a.get();
        if(this.isCancelled()) {
            return null;
        }
        try {
            return new ffmb(((StorageInfoResponse)evrg.o(fcfo.c(wearableManageSpaceChimeraActivity0).g(), 30L, TimeUnit.SECONDS)), Status.b);
        }
        catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
            return ffmb.a;
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
        if(((fceq)object0).a().e()) {
            wearableManageSpaceChimeraActivity0.m.setAdapter(new ffly(wearableManageSpaceChimeraActivity0, ((fceq)object0)));
            wearableManageSpaceChimeraActivity0.k.setText(Formatter.formatFileSize(wearableManageSpaceChimeraActivity0.getApplicationContext(), ((fceq)object0).b().b));
        }
        else {
            Log.w("WearableSpaceActivity", "Error while retrieving storage info: " + ((fceq)object0).a());
        }
        wearableManageSpaceChimeraActivity0.l.setEnabled(true);
        wearableManageSpaceChimeraActivity0.j.setVisibility(4);
    }
}

