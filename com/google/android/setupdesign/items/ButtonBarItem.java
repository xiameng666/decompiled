package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import gaec;
import gahd;
import gahe;
import java.util.ArrayList;

public class ButtonBarItem extends AbstractItem implements gahe {
    public boolean a;
    private final ArrayList b;

    public ButtonBarItem() {
        this.b = new ArrayList();
        this.a = true;
    }

    public ButtonBarItem(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = new ArrayList();
        this.a = true;
    }

    @Override  // gagz
    public void a(View view0) {
        ((LinearLayout)view0).removeAllViews();
        ArrayList arrayList0 = this.b;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ButtonItem buttonItem0 = (ButtonItem)arrayList0.get(v1);
            Button button0 = buttonItem0.f;
            if(button0 == null) {
                Context context0 = ((LinearLayout)view0).getContext();
                int v2 = buttonItem0.c;
                if(v2 != 0) {
                    context0 = new ContextThemeWrapper(context0, v2);
                }
                Button button1 = gaec.t(context0) ? new MaterialButton(context0, null, 0x7F040BA2) : ((Button)LayoutInflater.from(context0).inflate(0x7F0E0A19, null, false));  // attr:sucMaterialTonalButtonStyle
                buttonItem0.f = button1;
                buttonItem0.f.setOnClickListener(buttonItem0);
            }
            else if((button0.getParent() instanceof ViewGroup)) {
                ((ViewGroup)buttonItem0.f.getParent()).removeView(buttonItem0.f);
            }
            buttonItem0.f.setEnabled(buttonItem0.a);
            buttonItem0.f.setText(buttonItem0.b);
            buttonItem0.f.setId(buttonItem0.e);
            Button button2 = buttonItem0.f;
            if((button2 instanceof MaterialButton)) {
                ((MaterialButton)button2).u(buttonItem0.d);
            }
            else {
                button2.setCompoundDrawablesWithIntrinsicBounds(buttonItem0.d, null, null, null);
            }
            ((LinearLayout)view0).addView(buttonItem0.f);
        }
        view0.setId(this.e);
    }

    @Override  // gahe
    public final void d(gahd gahd0) {
        if(!(gahd0 instanceof ButtonItem)) {
            throw new UnsupportedOperationException("Cannot add non-button item to Button Bar");
        }
        this.b.add(((ButtonItem)gahd0));
    }

    @Override  // gagz
    public final boolean g() {
        return false;
    }

    @Override  // com.google.android.setupdesign.items.AbstractItem
    public final int hd() {
        return this.a ? 1 : 0;
    }

    @Override  // gagz
    public final int kw() {
        return 0x7F0E0A9C;  // layout:sud_items_button_bar
    }

    @Override  // com.google.android.setupdesign.items.AbstractItem
    public final gahd ky(int v) {
        if(this.e == v) {
            return this;
        }
        ArrayList arrayList0 = this.b;
        int v1 = arrayList0.size();
        int v2 = 0;
        while(v2 < v1) {
            gahd gahd0 = ((ButtonItem)arrayList0.get(v2)).ky(v);
            ++v2;
            if(gahd0 != null) {
                return gahd0;
            }
        }
        return null;
    }
}

