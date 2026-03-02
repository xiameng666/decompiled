import android.util.Log;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class azhw implements gmbg {
    public azhw(azia azia0) {
        Objects.requireNonNull(azia0);
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Log.e("CCTUploader", "Error while updating session zwieback tokens.", throwable0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((Status)object0).e()) {
            Log.i("CCTUploader", "Successfully updated session zwieback tokens.");
            return;
        }
        Log.e("CCTUploader", "Error while updating session zwieback tokens: " + ((Status)object0).j);
    }
}

