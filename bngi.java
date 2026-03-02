import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import j..util.Objects;

final class bngi implements DialogInterface.OnClickListener {
    final bngk a;

    public bngi(bngk bngk0) {
        Objects.requireNonNull(bngk0);
        this.a = bngk0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        NfcViewOptions nfcViewOptions0 = new NfcViewOptions(false, true);
        this.a.a.r(nfcViewOptions0);
    }
}

