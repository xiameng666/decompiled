import android.content.Context;
import com.google.android.gms.instantapps.ui.OptInChimeraActivity;

class cacb extends du {
    protected OptInChimeraActivity ag;
    protected OptInChimeraActivity ah;
    protected OptInChimeraActivity d;

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        try {
            this.d = (OptInChimeraActivity)context0;
            this.ag = (OptInChimeraActivity)context0;
            this.ah = (OptInChimeraActivity)context0;
        }
        catch(ClassCastException unused_ex) {
            throw new ClassCastException(context0 + " must implement SetupFragment callbacks");
        }
    }
}

