package com.google.android.libraries.tapandpay.view.buttonbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import fipw;
import fuob;
import fuoc;
import ibni;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ibni
public final class ButtonBar extends ConstraintLayout {
    public int h;
    private final Button i;
    private final Button j;
    private final Button k;

    public ButtonBar(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public ButtonBar(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public ButtonBar(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        ConstraintLayout.inflate(context0, 0x7F0E01A7, this);  // layout:button_bar
        View view0 = this.findViewById(0x7F0B01BD);  // id:CenterAction
        ibuq.e(view0, "findViewById(...)");
        this.i = (Button)view0;
        View view1 = this.findViewById(0x7F0B06B1);  // id:PrimaryAction
        ibuq.e(view1, "findViewById(...)");
        this.j = (Button)view1;
        View view2 = this.findViewById(0x7F0B07C7);  // id:SecondaryAction
        ibuq.e(view2, "findViewById(...)");
        this.k = (Button)view2;
    }

    public ButtonBar(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final int g() {
        if(this.h == 0) {
            return 0;
        }
        Context context0 = this.getContext();
        return fipw.c.a(context0);
    }

    public final void h(fuob fuob0) {
        fuoc.a(this.i, fuob0);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    public final void i(fuob fuob0, fuob fuob1) {
        this.i.setVisibility(8);
        fuoc.a(this.j, fuob0);
        fuoc.a(this.k, fuob1);
    }
}

