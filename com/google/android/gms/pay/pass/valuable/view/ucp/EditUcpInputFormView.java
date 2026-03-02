package com.google.android.gms.pay.pass.valuable.view.ucp;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import dxad;
import dxbp;
import dxct;
import ibuq;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EditUcpInputFormView extends FrameLayout {
    private final RecyclerView a;

    public EditUcpInputFormView(Context context0) {
        ibuq.f(context0, "context");
        this(context0, null, 2, null);
    }

    public EditUcpInputFormView(Context context0, AttributeSet attributeSet0) {
        ibuq.f(context0, "context");
        this(context0, attributeSet0, 0);
    }

    public EditUcpInputFormView(Context context0, AttributeSet attributeSet0, int v) {
        ibuq.f(context0, "context");
        super(context0, attributeSet0, v);
        FrameLayout.inflate(context0, 0x7F0E0318, this);  // layout:edit_ucp_input_form_view
        View view0 = this.findViewById(0x7F0B0401);  // id:FormContainer
        ibuq.e(view0, "findViewById(...)");
        RecyclerView recyclerView0 = (RecyclerView)view0;
        this.a = recyclerView0;
        recyclerView0.ap(new LinearLayoutManager());
        recyclerView0.setOnTouchListener(new dxad(this));
    }

    public EditUcpInputFormView(Context context0, AttributeSet attributeSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            attributeSet0 = null;
        }
        this(context0, attributeSet0);
    }

    public final View a(int v) {
        return this.a.getChildAt(v);
    }

    public final void b(dxbp dxbp0) {
        ibuq.f(dxbp0, "adapter");
        this.a.an(dxbp0);
    }

    public final void c(dxct dxct0) {
        ibuq.f(dxct0, "adapter");
        this.a.an(dxct0);
    }
}

