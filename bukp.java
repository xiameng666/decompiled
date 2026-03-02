import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.material.chip.Chip;

public final class bukp implements DialogInterface.OnClickListener {
    public final bukv a;
    public final Chip b;

    public bukp(bukv bukv0, Chip chip0) {
        this.a = bukv0;
        this.b = chip0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.b.setChecked(false);
        this.a.at.a(this.a.ai);
        dialogInterface0.dismiss();
    }
}

