import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import com.google.android.gms.common.account.SimpleDialogAccountPickerChimeraActivity;
import java.util.List;

public final class azrs implements DialogInterface.OnClickListener {
    public final SimpleDialogAccountPickerChimeraActivity a;
    public final List b;

    public azrs(SimpleDialogAccountPickerChimeraActivity simpleDialogAccountPickerChimeraActivity0, List list0) {
        this.a = simpleDialogAccountPickerChimeraActivity0;
        this.b = list0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        this.a.n.a(((bxiy)this.b.get(this.a.p)));
    }
}

