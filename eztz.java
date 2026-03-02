import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;
import j..util.Objects;

public final class eztz implements DialogInterface.OnKeyListener {
    final ChimeraUpdateFromSdCardActivity a;

    public eztz(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity0) {
        Objects.requireNonNull(chimeraUpdateFromSdCardActivity0);
        this.a = chimeraUpdateFromSdCardActivity0;
        super();
    }

    @Override  // android.content.DialogInterface$OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface0, int v, KeyEvent keyEvent0) {
        if(keyEvent0.getAction() == 0 && v == 4) {
            ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity0 = this.a;
            if(chimeraUpdateFromSdCardActivity0.q.isEmpty()) {
                chimeraUpdateFromSdCardActivity0.n.dismiss();
                chimeraUpdateFromSdCardActivity0.finish();
                return true;
            }
            chimeraUpdateFromSdCardActivity0.h();
            chimeraUpdateFromSdCardActivity0.f();
        }
        return true;
    }
}

