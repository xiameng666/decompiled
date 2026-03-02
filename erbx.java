import android.os.Bundle;
import android.view.View;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import com.google.android.gms.smartdevice.d2d.ui.OwnerItem;
import com.google.android.setupdesign.GlifRecyclerLayout;
import com.google.android.setupdesign.items.ItemGroup;
import java.util.ArrayList;

public final class erbx extends eqor {
    public erbx() {
        super(0x7F0E09E4);  // layout:smartdevice_glif_recycler_fragment
    }

    @Override  // eqor
    public final void onViewCreated(View view0, Bundle bundle0) {
        super.onViewCreated(view0, bundle0);
        GlifRecyclerLayout glifRecyclerLayout0 = (GlifRecyclerLayout)view0.findViewById(0x7F0B160D);  // id:glif_layout
        glifRecyclerLayout0.d().ao(null);
        ItemGroup itemGroup0 = (ItemGroup)((gahk)glifRecyclerLayout0.c()).e.ky(0x7F0B206E);  // id:smartdevice_empty_item
        Bundle bundle1 = this.getArguments();
        batl.t(bundle1, "Arguments cannot be null!");
        ArrayList arrayList0 = bundle1.getParcelableArrayList("accounts");
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                itemGroup0.d(new OwnerItem(((ParcelableDeviceOwner)arrayList0.get(v1)), null));
            }
        }
    }
}

