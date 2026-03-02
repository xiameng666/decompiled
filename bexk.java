import android.view.View.OnClickListener;
import android.view.View;
import com.google.android.gms.credential.manager.passwordimport.ImportPreviewFragment;

public final class bexk implements View.OnClickListener {
    public final ImportPreviewFragment a;

    public bexk(ImportPreviewFragment importPreviewFragment0) {
        this.a = importPreviewFragment0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        beug beug0 = this.a.a;
        if(beug0 == null) {
            ibuq.j("navigationController");
            beug0 = null;
        }
        beug0.a();
    }
}

