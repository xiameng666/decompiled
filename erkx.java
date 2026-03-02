import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.ui.DeviceListItemView;
import com.google.android.setupdesign.items.Item;

final class erkx extends Item {
    public final D2DDevice a;

    public erkx(Context context0, D2DDevice d2DDevice0) {
        batl.s(d2DDevice0);
        this.a = d2DDevice0;
        this.E(d2DDevice0.c);
        this.B(context0.getDrawable(0x7F080BEB));
        this.C(0x7F0E09DF);  // layout:smartdevice_device_list_item_padded
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final void a(View view0) {
        DeviceListItemView deviceListItemView0 = (DeviceListItemView)view0.findViewById(0x7F0B111B);  // id:device_item
        deviceListItemView0.h((this.i == null ? "" : this.i.toString()));
        Drawable drawable0 = this.h;
        if(drawable0 != null) {
            deviceListItemView0.g.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, null, null, null);
        }
        view0.setId(this.e);
    }
}

