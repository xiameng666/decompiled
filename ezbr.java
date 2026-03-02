import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class ezbr extends skp {
    @Override  // ohv
    public final RecyclerView kK(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        RecyclerView recyclerView0 = super.kK(layoutInflater0, viewGroup0, bundle0);
        recyclerView0.setPadding(0, 0, 0, 0);
        return recyclerView0;
    }
}

