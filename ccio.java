import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.widget.Button;

public final class ccio implements DialogInterface.OnShowListener {
    public final iw a;
    public final cciv b;

    public ccio(iw iw0, cciv cciv0) {
        this.a = iw0;
        this.b = cciv0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        cciv cciv0 = this.b;
        Button button0 = this.a.b(-1);
        if(!cciv0.y()) {
            ((ggtj)cciv.ag.j()).x("Intrusion logging is not supported.");
            button0.setOnClickListener(new ccip(cciv0));
            return;
        }
        button0.setOnClickListener(new cciq(cciv0));
    }
}

