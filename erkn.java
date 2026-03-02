import android.os.AsyncTask;
import com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity;
import java.lang.ref.WeakReference;

public final class erkn extends AsyncTask {
    private final WeakReference a;

    public erkn(D2DSetupChimeraActivity d2DSetupChimeraActivity0) {
        this.a = new WeakReference(d2DSetupChimeraActivity0);
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        Void[] arr_void = (Void[])arr_object;
        D2DSetupChimeraActivity d2DSetupChimeraActivity0 = (D2DSetupChimeraActivity)this.a.get();
        if(d2DSetupChimeraActivity0 != null) {
            erqh.a();
            return erqi.a(d2DSetupChimeraActivity0);
        }
        return null;
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        D2DSetupChimeraActivity d2DSetupChimeraActivity0 = (D2DSetupChimeraActivity)this.a.get();
        if(d2DSetupChimeraActivity0 != null) {
            d2DSetupChimeraActivity0.l = (String)object0;
        }
    }
}

