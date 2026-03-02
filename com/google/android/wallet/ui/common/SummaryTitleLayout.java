package com.google.android.wallet.ui.common;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import gdbu;
import gdcb;
import gfhs;

public class SummaryTitleLayout extends LinearLayout implements View.OnClickListener {
    public TextView a;
    public ImageView b;
    public ImageWithCaptionView c;
    public int d;
    public boolean e;
    public SummaryExpanderWrapper f;
    private int g;
    private int h;

    public SummaryTitleLayout(Context context0) {
        super(context0);
        this.g = -1;
        this.h = -1;
        this.b(context0);
    }

    public SummaryTitleLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.g = -1;
        this.h = -1;
        this.b(context0);
    }

    public SummaryTitleLayout(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.g = -1;
        this.h = -1;
        this.b(context0);
    }

    public SummaryTitleLayout(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.g = -1;
        this.h = -1;
        this.b(context0);
    }

    public final void a() {
        this.b.setVisibility((this.e || this.d == 3 ? 8 : 0));
    }

    private final void b(Context context0) {
        this.setOrientation(0);
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E0C75, this, true);  // layout:view_summary_title_layout
        TextView textView0 = (TextView)view0.findViewById(0x7F0B218F);  // id:summary_text_title_view
        this.a = textView0;
        textView0.setOnClickListener(this);
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B22C4);  // id:title_edit_image
        this.b = imageView0;
        imageView0.setOnClickListener(this);
        ImageWithCaptionView imageWithCaptionView0 = (ImageWithCaptionView)view0.findViewById(0x7F0B22E6);  // id:tooltip_image
        this.c = imageWithCaptionView0;
        imageWithCaptionView0.setOnClickListener(this);
        this.c.c(gdcb.al(this.getContext(), 105, -1));
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        SummaryExpanderWrapper summaryExpanderWrapper0 = this.f;
        if(summaryExpanderWrapper0 != null) {
            if(view0 != this.c) {
                goto label_9;
            }
            gdbu gdbu0 = summaryExpanderWrapper0.g;
            if(gdbu0 != null) {
                gfhs gfhs0 = summaryExpanderWrapper0.h;
                if(gfhs0 != null) {
                    gdbu0.i(gfhs0);
                    return;
                label_9:
                    if(view0 == this.b && this.d == 2) {
                        summaryExpanderWrapper0.q();
                        return;
                    }
                    summaryExpanderWrapper0.e();
                }
            }
        }
    }

    @Override  // android.widget.LinearLayout
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        if(this.c != null && this.c.getVisibility() == 0) {
            int v4 = v2 - v;
            int v5 = v3 - v1;
            if(v4 != this.g || v5 != this.h) {
                this.g = v4;
                this.h = v5;
                Rect rect0 = new Rect();
                rect0.top = 0;
                rect0.bottom = this.getHeight();
                rect0.left = this.c.getLeft();
                rect0.right = this.c.getRight();
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.c.getLayoutParams();
                if((viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams)) {
                    rect0.left -= ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).leftMargin;
                    rect0.right += ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).rightMargin;
                }
                this.setTouchDelegate(new TouchDelegate(rect0, this.c));
            }
        }
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView0 = this.a;
        if(textView0 != null) {
            textView0.setEnabled(z);
        }
        ImageView imageView0 = this.b;
        if(imageView0 != null) {
            imageView0.setEnabled(z);
        }
        ImageWithCaptionView imageWithCaptionView0 = this.c;
        if(imageWithCaptionView0 != null) {
            imageWithCaptionView0.setEnabled(z);
        }
    }
}

