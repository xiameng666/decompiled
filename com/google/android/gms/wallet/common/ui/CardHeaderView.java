package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import gdbu;
import gdcb;
import gexi;
import gfhs;

public class CardHeaderView extends LinearLayout implements View.OnClickListener {
    TextView a;
    TextView b;
    public LinearLayout c;
    public LinearLayout d;
    public ImageView e;
    public TransitionDrawable f;
    public ImageWithCaptionView g;
    boolean h;
    public boolean i;
    public gexi j;
    public gdbu k;
    public String l;
    public String m;

    public CardHeaderView(Context context0) {
        super(context0);
        this.h = true;
    }

    public CardHeaderView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h = true;
    }

    public CardHeaderView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.h = true;
    }

    public final CharSequence a() {
        return this.h ? this.l : this.m;
    }

    public final void b(String s) {
        gdcb.E(this.a, s);
    }

    public final void c(boolean z) {
        if(this.i) {
            int v = 0;
            this.e.setVisibility(0);
            this.e.setContentDescription(this.a());
            if(z) {
                v = 400;
            }
            if(this.h) {
                this.f.reverseTransition(v);
                return;
            }
            this.f.startTransition(v);
            return;
        }
        this.e.setVisibility(8);
    }

    public final void d(boolean z) {
        String s;
        int v = 8;
        this.d.setVisibility((this.h ? 0 : 8));
        LinearLayout linearLayout0 = this.c;
        if(!this.h) {
            v = 0;
        }
        linearLayout0.setVisibility(v);
        this.c(z);
        gexi gexi0 = this.j;
        if(gexi0 != null) {
            if(!this.h) {
                s = gexi0.h;
            }
            else if(gexi0.c == 2) {
                s = (String)gexi0.d;
            }
            else {
                s = "";
            }
            this.b(s);
            gdcb.E(this.b, (this.h ? this.j.f : this.j.i));
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0 == this.g) {
            gdbu gdbu0 = this.k;
            if(gdbu0 != null) {
                gdbu0.i((this.j.j == null ? gfhs.a : this.j.j));
            }
        }
    }

    @Override  // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView0 = (TextView)this.findViewById(0x7F0B22B8);  // id:title
        this.a = textView0;
        textView0.setTransitionName("excludeViewFromChangeBounds");
        this.a.setTag(0x7F0B218C, "summaryField");  // id:summary_expander_transition_name
        TextView textView1 = (TextView)this.findViewById(0x7F0B2121);  // id:subtitle
        this.b = textView1;
        textView1.setTag(0x7F0B218C, "summaryField");  // id:summary_expander_transition_name
        LinearLayout linearLayout0 = (LinearLayout)this.findViewById(0x7F0B0F2F);  // id:collapsed_image_container
        this.c = linearLayout0;
        linearLayout0.setTag(0x7F0B218C, "summaryField");  // id:summary_expander_transition_name
        LinearLayout linearLayout1 = (LinearLayout)this.findViewById(0x7F0B1342);  // id:expanded_image_container
        this.d = linearLayout1;
        linearLayout1.setTag(0x7F0B218C, "summaryField");  // id:summary_expander_transition_name
        this.e = (ImageView)this.findViewById(0x7F0B133C);  // id:expand_collapse_icon
        ImageWithCaptionView imageWithCaptionView0 = (ImageWithCaptionView)this.findViewById(0x7F0B22E7);  // id:tooltip_view
        this.g = imageWithCaptionView0;
        imageWithCaptionView0.c(gdcb.al(this.getContext(), 105, -1));
        this.g.setOnClickListener(this);
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        gdcb.N(this, z);
    }
}

