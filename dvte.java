import android.view.View.OnLongClickListener;
import android.view.View;

public final class dvte implements View.OnLongClickListener {
    public final dvtf a;

    public dvte(dvtf dvtf0) {
        this.a = dvtf0;
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        dvtf dvtf0 = this.a;
        if(dvtf0.getContext() != null) {
            dvtf0.al.c("Barcode", dvtf0.am.a());
        }
        return true;
    }
}

