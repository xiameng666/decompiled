import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;
import j..util.Objects;

public final class eztx implements View.OnClickListener {
    final ChimeraUpdateFromSdCardActivity a;

    public eztx(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity0) {
        Objects.requireNonNull(chimeraUpdateFromSdCardActivity0);
        this.a = chimeraUpdateFromSdCardActivity0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        this.a.n.dismiss();
        this.a.b();
    }
}

