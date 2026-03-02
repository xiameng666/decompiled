package com.google.android.gms.smartdevice.d2d.ui;

import android.view.View;
import com.google.android.gms.smartdevice.d2d.owners.ParcelableDeviceOwner;
import com.google.android.gms.smartdevice.d2d.ui.accountpicker.AccountCard;
import com.google.android.setupdesign.items.Item;
import gaec;
import gaji;

public class OwnerItem extends Item {
    public final ParcelableDeviceOwner a;

    public OwnerItem(ParcelableDeviceOwner parcelableDeviceOwner0) {
        this.a = parcelableDeviceOwner0;
        this.he(parcelableDeviceOwner0.f);
    }

    public OwnerItem(ParcelableDeviceOwner parcelableDeviceOwner0, byte[] arr_b) {
        this.a = parcelableDeviceOwner0;
        this.he(false);
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final void a(View view0) {
        ((AccountCard)view0).a(this.a);
        ((AccountCard)view0).b();
        if(gaec.B(((AccountCard)view0).getContext())) {
            gaji.a(((AccountCard)view0));
        }
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final int kw() {
        return 0x7F0E09CE;  // layout:smartdevice_account_card
    }
}

