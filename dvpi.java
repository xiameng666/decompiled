import android.content.DialogInterface.OnShowListener;
import android.content.DialogInterface;
import android.view.View;

public final class dvpi implements DialogInterface.OnShowListener {
    public final fyfv a;

    public dvpi(fyfv fyfv0) {
        this.a = fyfv0;
    }

    @Override  // android.content.DialogInterface$OnShowListener
    public final void onShow(DialogInterface dialogInterface0) {
        fyfv fyfv0 = this.a;
        View view0 = fyfv0.findViewById(0x7F0B0104);  // id:BottomSheetActivationContent
        if(view0 != null) {
            fyfv0.a().J(view0.getHeight(), true);
            view0.getParent().requestLayout();
        }
    }
}

