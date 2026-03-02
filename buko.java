import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.material.chip.Chip;

public final class buko implements DialogInterface.OnClickListener {
    public final bukv a;
    public final Chip b;
    public final hivh c;

    public buko(bukv bukv0, Chip chip0, hivh hivh0) {
        this.a = bukv0;
        this.b = chip0;
        this.c = hivh0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.d.f();
        this.a.ai = this.b.getId();
        this.a.z(this.c);
    }
}

