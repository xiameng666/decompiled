package com.google.android.libraries.messaging.lighter.ui.overlay;

import ByteString;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import fmfh;
import fmfw;
import fmrd;
import fmrf;
import fmro;
import fmyp;
import gfsx;
import iaea;

public class OverlayView extends FrameLayout implements fmrd {
    public final LinearLayout a;
    public final MaterialCardView b;
    public final FrameLayout.LayoutParams c;
    public final FrameLayout.LayoutParams d;
    public final int e;
    private final ImageView f;
    private final TextView g;
    private final LinearLayout h;
    private final ImageView i;
    private final FrameLayout.LayoutParams j;

    public OverlayView(Context context0) {
        this(context0, null);
    }

    public OverlayView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public OverlayView(Context context0, AttributeSet attributeSet0, int v) {
        super(fmrf.b(context0, iaea.j()), attributeSet0, v);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
        this.j = frameLayout$LayoutParams0;
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -2);
        this.c = frameLayout$LayoutParams1;
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        this.d = frameLayout$LayoutParams2;
        OverlayView.inflate(this.getContext(), 0x7F0E0646, this);  // layout:overlay_layout
        this.f = (ImageView)this.findViewById(0x7F0B1177);  // id:display_icon
        this.g = (TextView)this.findViewById(0x7F0B22B8);  // id:title
        this.a = (LinearLayout)this.findViewById(0x7F0B1B8B);  // id:overlay_content
        this.b = (MaterialCardView)this.findViewById(0x7F0B1B89);  // id:overlay_card_view
        this.h = (LinearLayout)this.findViewById(0x7F0B1B8D);  // id:overlay_header
        this.i = (ImageView)this.findViewById(0x7F0B1173);  // id:dismiss_button
        frameLayout$LayoutParams0.setMargins(this.getResources().getDimensionPixelSize(0x7F070D80), this.getResources().getDimensionPixelSize(0x7F070D82), this.getResources().getDimensionPixelSize(0x7F070D80), this.getResources().getDimensionPixelSize(0x7F070D7E));  // dimen:overlay_card_view_left_right_margin
        frameLayout$LayoutParams0.gravity = 0;
        frameLayout$LayoutParams1.setMargins(this.getResources().getDimensionPixelSize(0x7F070D80), 0, this.getResources().getDimensionPixelSize(0x7F070D80), 0);  // dimen:overlay_card_view_left_right_margin
        frameLayout$LayoutParams1.gravity = 17;
        frameLayout$LayoutParams2.gravity = 80;
        this.e = this.getResources().getDimensionPixelSize(0x7F070D7F);  // dimen:overlay_card_view_corner_radius
    }

    public final void a(fmfw fmfw0) {
        gfsx gfsx0 = fmfw0.c;
        boolean z = gfsx0.i() && ((fmfh)gfsx0.d()).a.length != 0;
        if(z) {
            Object object0 = gfsx0.d();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.f.getLayoutParams();
            viewGroup$LayoutParams0.height = fmro.a(this.getContext(), ((float)((fmfh)object0).c));
            viewGroup$LayoutParams0.width = fmro.a(this.getContext(), ((float)((fmfh)object0).b));
            this.f.setLayoutParams(viewGroup$LayoutParams0);
            Bitmap bitmap0 = BitmapFactory.decodeByteArray(((fmfh)object0).a, 0, ((fmfh)object0).a.length);
            this.f.setImageBitmap(bitmap0);
            this.f.setContentDescription(((fmfh)object0).e);
        }
        else {
            gfsx gfsx1 = fmfw0.b;
            if(gfsx1.i()) {
                byte[] arr_b = ((ByteString)gfsx1.d()).toByteArray();
                Bitmap bitmap1 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                this.f.setImageBitmap(bitmap1);
            }
        }
        gfsx gfsx2 = fmfw0.d;
        if(OverlayView.f(gfsx2)) {
            Object object1 = gfsx2.d();
            this.g.setText(((CharSequence)object1));
        }
        OverlayView.e(this.f, z);
        OverlayView.e(this.g, OverlayView.f(gfsx2));
        OverlayView.e(this.i, ((boolean)(fmfw0.g ^ 1)));
        if(!OverlayView.g(this.f) && !OverlayView.g(this.g) && !OverlayView.g(this.i)) {
            this.h.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    public final void b(fmfw fmfw0) {
        if(fmfw0.h) {
            this.postDelayed(new fmyp(this), 100L);
            return;
        }
        this.requestFocus();
        this.sendAccessibilityEvent(0x8000);
    }

    public final void c(fmfw fmfw0, View.OnClickListener view$OnClickListener0) {
        ImageView imageView0 = this.i;
        if(OverlayView.g(imageView0)) {
            imageView0.setOnClickListener(view$OnClickListener0);
        }
        if(fmfw0.h) {
            this.setOnClickListener(view$OnClickListener0);
            this.b.setClickable(false);
            this.b.setOnClickListener(null);
            return;
        }
        this.b.setClickable(false);
        this.setOnClickListener(null);
    }

    public final void d(fmfw fmfw0, boolean z) {
        this.a.removeAllViews();
        this.a.setVisibility(8);
        this.j.topMargin = z ? this.getContext().getResources().getDimensionPixelSize(0x7F070D82) : this.getContext().getResources().getDimensionPixelSize(0x7F070D81);  // dimen:overlay_card_view_top_margin
        this.b.setLayoutParams(this.j);
        this.setClickable(false);
        this.setVisibility(0);
        this.setBackgroundColor(this.getContext().getColor(0x7F060DA4));  // color:overlay_background_transparent_color
        this.a(fmfw0);
    }

    private static void e(View view0, boolean z) {
        view0.setVisibility((z ? 0 : 4));
    }

    private static boolean f(gfsx gfsx0) {
        return gfsx0.i() && !((String)gfsx0.d()).isEmpty();
    }

    private static boolean g(View view0) {
        return view0.getVisibility() == 0;
    }
}

