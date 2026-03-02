import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import j..util.Objects;

final class bngj implements DialogInterface.OnShowListener {
    final bngk a;

    public bngj(bngk bngk0) {
        Objects.requireNonNull(bngk0);
        this.a = bngk0;
        super();
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        this.a.b.getButton(-1).setTextColor(this.a.a.getResources().getColor(0x7F0606C5));  // color:google_blue500
    }
}

