package com.google.android.gms.setupservices.item;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.setupdesign.items.Item;
import epdr;
import epfh;
import epfw;
import gaec;
import grmf;
import grmi;

public class GoogleServicesTextItem extends Item {
    public epdr a;
    private final epdr b;

    public GoogleServicesTextItem(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, epfh.b);
        this.a = epdr.c(context0, typedArray0.getResourceId(4, 0));
        this.b = epdr.c(context0, typedArray0.getResourceId(5, 0));
        typedArray0.recycle();
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final void a(View view0) {
        super.a(view0);
        View view1 = view0.findViewById(0x7F0B1625);  // id:google_services_tos
        if(view1 != null) {
            if(gaec.B(view1.getContext())) {
                epfw.a(((TextView)view0.findViewById(0x7F0B2162)), 0x7F07029C, 0x7F07029B);  // id:sud_items_title
                view0.findViewById(0x7F0B2157).setVisibility(8);  // id:sud_items_icon_container
            }
            if(gaec.t(view1.getContext())) {
                view0.setPadding(0, ((int)view1.getContext().getResources().getDimension(0x7F070295)), 0, ((int)view1.getContext().getResources().getDimension(0x7F070294)));  // dimen:bc_expressive_text_item_tos_padding_top
            }
            view1.setClickable(false);
        }
    }

    public final grmi e() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grmi.a).v_newBuilder();
        epdr epdr0 = this.a;
        if(epdr0 != null) {
            grmf grmf0 = epdr0.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grmi grmi0 = (grmi)hftp0.b_message;
            grmf0.getClass();
            grmi0.d = grmf0;
            grmi0.b |= 2;
        }
        epdr epdr1 = this.b;
        if(epdr1 != null) {
            grmf grmf1 = epdr1.d();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grmi grmi1 = (grmi)hftp0.b_message;
            grmf1.getClass();
            grmi1.e = grmf1;
            grmi1.b |= 4;
        }
        return (grmi)hftp0.N_build();
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final CharSequence k() {
        return this.a == null ? null : this.a.a;
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final CharSequence kv() {
        return this.b == null ? null : this.b.a;
    }

    @Override  // com.google.android.setupdesign.items.AbstractItem
    public final boolean kz() {
        return true;
    }
}

