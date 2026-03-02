import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import j..util.Objects;

final class ezle implements DialogInterface.OnClickListener {
    final ezlh a;

    public ezle(ezlh ezlh0) {
        Objects.requireNonNull(ezlh0);
        this.a = ezlh0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.d.k(this.a.ag);
    }
}

