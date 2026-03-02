import android.view.View;
import android.widget.TextView;
import com.google.android.gms.credential.manager.passwordimport.ImportProgressFragment;

public final class bexs implements ibts {
    public final View a;
    public final ImportProgressFragment b;
    public final ibnn c;

    public bexs(View view0, ImportProgressFragment importProgressFragment0, ibnn ibnn0) {
        this.a = view0;
        this.b = importProgressFragment0;
        this.c = ibnn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            ((TextView)this.a.findViewById(0x7F0B1DA8)).setText(this.b.getResources().getString(0x7F152703, new Object[]{ImportProgressFragment.y(this.c).b()}));  // id:pwm_import_progress_description
        }
        return ibom.a;
    }
}

