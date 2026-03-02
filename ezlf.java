import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import j..util.Objects;

final class ezlf implements DialogInterface.OnClickListener {
    final ezlh a;

    public ezlf(ezlh ezlh0) {
        Objects.requireNonNull(ezlh0);
        this.a = ezlh0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        ezlh ezlh0 = this.a;
        ezbn ezbn0 = ezlh0.P();
        if(ezbn0 != null) {
            ezlj.f(ezbn0);
            ezlh0.ag = true;
            ezlh0.d.k(true);
        }
    }
}

