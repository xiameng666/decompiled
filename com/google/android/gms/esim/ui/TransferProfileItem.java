package com.google.android.gms.esim.ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import bbqr;
import bkbd;
import com.google.android.gms.esim.ProfileTransferData;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.setupdesign.items.Item;

public class TransferProfileItem extends Item implements Comparable {
    public final ProfileTransferData a;
    public boolean b;
    public final int c;
    public boolean d;
    private final Context f;

    public TransferProfileItem(Context context0, int v, ProfileTransferData profileTransferData0) {
        this.f = context0;
        this.c = v;
        this.a = profileTransferData0;
        if(profileTransferData0.b.d == 2 && bkbd.n(profileTransferData0.b.g)) {
            this.d = true;
        }
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final void a(View view0) {
        MaterialRadioButton materialRadioButton0 = (MaterialRadioButton)view0.findViewById(0x7F0B215B);  // id:sud_items_radio_button
        TextView textView0 = (TextView)view0.findViewById(0x7F0B215A);  // id:sud_items_profile_name
        TextView textView1 = (TextView)view0.findViewById(0x7F0B2159);  // id:sud_items_phone_numbers
        TextView textView2 = (TextView)view0.findViewById(0x7F0B2150);  // id:sud_items_description
        textView0.setText(bkbd.g(this.a.b));
        String s = this.a.b.f;
        if(bbqr.d(s)) {
            textView1.setVisibility(8);
        }
        else {
            textView1.setText(s);
        }
        materialRadioButton0.setChecked(this.b);
        if(!this.d) {
            textView1.setEnabled(false);
            textView0.setEnabled(false);
            materialRadioButton0.setEnabled(false);
            textView2.setText("Can\'t transfer this SIM");
            textView2.setVisibility(0);
        }
    }

    @Override
    public final int compareTo(Object object0) {
        if(this.d) {
            return ((TransferProfileItem)object0).d ? 0 : -1;
        }
        return ((TransferProfileItem)object0).d ? 1 : 0;
    }

    @Override  // com.google.android.setupdesign.items.Item
    protected final int d() {
        return 0x7F0E0BDF;  // layout:transfer_profile_item
    }
}

