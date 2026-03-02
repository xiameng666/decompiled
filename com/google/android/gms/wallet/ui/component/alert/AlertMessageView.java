package com.google.android.gms.wallet.ui.component.alert;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.LinkView;
import gcjk;
import gcjn;
import gcjo;
import gcqy;
import gcyd;
import gczo;
import gdcb;
import gevs;
import gfgo;
import gfgr;
import hceh;
import hcei;
import hcem;
import hceo;
import hcep;

public class AlertMessageView extends LinearLayout implements View.OnClickListener, gcjk {
    View a;
    ImageWithCaptionView b;
    InfoMessageView c;
    ViewGroup d;
    LinkView e;
    public Button f;
    public gcyd g;
    public gcjn h;
    private ViewGroup i;
    private gczo j;
    private hceo k;

    public AlertMessageView(Context context0) {
        super(context0);
    }

    public AlertMessageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public AlertMessageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    public final void a(hceo hceo0, gcqy gcqy0, gczo gczo0, boolean z) {
        this.k = hceo0;
        this.j = gczo0;
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        if(!z) {
            this.a.setVisibility(0);
        }
        int v = hcem.a(hceo0.h) == 0 ? 1 : hcem.a(hceo0.h);
        if(v - 1 != 2 && v - 1 != 3) {
            this.c(hceo0, gdcb.b(this.getContext(), 0x7F040296), layoutInflater0, gcqy0);  // attr:colorAccent
            return;
        }
        if(z) {
            int v1 = this.getResources().getColor(0x106000B);
            this.c(hceo0, v1, layoutInflater0, gcqy0);
            this.c.s(v1);
            return;
        }
        this.c(hceo0, gdcb.b(this.getContext(), 0x7F040E49), layoutInflater0, gcqy0);  // attr:walletCardViewPageErrorColor
    }

    private final void c(hceo hceo0, int v, LayoutInflater layoutInflater0, gcqy gcqy0) {
        gcqy gcqy1;
        LayoutInflater layoutInflater1;
        ColorStateList colorStateList0 = v == this.getContext().getResources().getColor(0x106000B) ? gdcb.m(this.getContext()) : gdcb.j(v);
        this.b.m((hceo0.g == null ? gfgo.a : hceo0.g));
        this.b.g = colorStateList0;
        this.c.n((hceo0.c == null ? gfgr.a : hceo0.c));
        this.c.setId(gcqy0.a());
        if((hceo0.b & 16) == 0) {
            layoutInflater1 = layoutInflater0;
            gcqy1 = gcqy0;
        }
        else {
            hcei hcei0 = hceo0.e == null ? hcei.a : hceo0.e;
            if(hceh.a(hcei0.g) == 0 || hceh.a(hcei0.g) == 1) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hcei0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)hcei0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((hcei)hftp0.b_message).g = 2;
                ((hcei)hftp0.b_message).b |= 16;
                hcei0 = (hcei)hftp0.N_build();
            }
            layoutInflater1 = layoutInflater0;
            gcqy1 = gcqy0;
            LinkView linkView0 = LinkView.c(hcei0, this.getContext(), this.d, layoutInflater1, gcqy1, this.j);
            this.e = linkView0;
            linkView0.setGravity(17);
            this.e.setTextColor(colorStateList0);
            this.d.addView(this.e);
        }
        if((hceo0.b & 8) != 0) {
            Button button0 = (Button)layoutInflater1.inflate(0x7F0E0E5D, this.d, false);  // layout:wallet_view_secondary_button
            this.f = button0;
            button0.setText((hceo0.d == null ? hcep.a : hceo0.d).d);
            this.f.setId(gcqy1.a());
            this.f.setTextColor(colorStateList0);
            this.f.setOnClickListener(this);
            this.d.addView(this.f);
        }
        if((hceo0.b & 0x20) != 0) {
            gevs gevs0 = hceo0.f == null ? gevs.a : hceo0.f;
            this.g = (gcyd)layoutInflater1.inflate(0x7F0E0E72, this.d, false);  // layout:wallet_view_standard_button_basic
            if((gevs0.b & 8) == 0 || gevs0.f.isEmpty()) {
                ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gevs0).jf(5, null);
                hftp1.X(((ProtoLiteMessage)gevs0));
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gevs gevs1 = (gevs)hftp1.b_message;
                "Dismiss".getClass();
                gevs1.b |= 8;
                gevs1.f = "Dismiss";
                gevs0 = (gevs)hftp1.N_build();
            }
            this.g.i(gevs0);
            this.g.setId(gcqy1.a());
            this.g.d().setTextColor(colorStateList0);
            this.g.c().setOnClickListener(this);
            gcjo.b(this.g.c(), gevs0.c, this.h);
            this.d.addView(this.g.c());
        }
        if(this.d.getChildCount() == 0) {
            ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.i.getLayoutParams();
            viewGroup$MarginLayoutParams0.bottomMargin = viewGroup$MarginLayoutParams0.topMargin;
            this.i.setLayoutParams(viewGroup$MarginLayoutParams0);
        }
    }

    @Override  // gcjk
    public final void lr() {
        gcyd gcyd0 = this.g;
        if(gcyd0 != null) {
            gcjo.c(gcyd0.c(), (this.k.f == null ? gevs.a : this.k.f).c, this.h);
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0 == this.f) {
            hcep hcep0 = this.k.d == null ? hcep.a : this.k.d;
            String s = "";
            if(hcep0.b == 2 && ((ByteString)hcep0.c).size() > 0) {
                Bundle bundle0 = new Bundle();
                bundle0.putByteArray("EventListener.EXTRA_ALERT_ACTION_TOKEN", (hcep0.b == 2 ? ((ByteString)hcep0.c) : ByteString.b).toByteArray());
                this.j.T(22, bundle0);
                return;
            }
            if(!(hcep0.b == 3 ? ((String)hcep0.c) : "").isEmpty()) {
                Intent intent0 = new Intent("android.intent.action.VIEW");
                if(hcep0.b == 3) {
                    s = (String)hcep0.c;
                }
                Intent intent1 = intent0.setData(Uri.parse(s));
                this.getContext().startActivity(intent1);
            }
        }
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = this.findViewById(0x7F0B1184);  // id:divider
        this.i = (ViewGroup)this.findViewById(0x7F0B0FE3);  // id:content_container
        this.b = (ImageWithCaptionView)this.findViewById(0x7F0B16B9);  // id:icon
        this.c = (InfoMessageView)this.findViewById(0x7F0B10E6);  // id:description
        this.d = (ViewGroup)this.findViewById(0x7F0B0DA7);  // id:button_container
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        gdcb.N(this, z);
    }
}

