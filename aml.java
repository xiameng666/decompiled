import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;

final class aml implements DialogInterface.OnClickListener {
    final amo a;

    public aml(amo amo0) {
        this.a = amo0;
        super();
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.ai.o(true);
    }
}

