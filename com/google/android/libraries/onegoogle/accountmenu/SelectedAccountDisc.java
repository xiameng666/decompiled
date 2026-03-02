package com.google.android.libraries.onegoogle.accountmenu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import fnhp;
import fnjx;
import fnjy;
import fnkc;
import fnle;
import fnxf;
import gftb;
import java.lang.ref.WeakReference;

public final class SelectedAccountDisc extends FrameLayout {
    public final ImageView a;
    public final AccountParticleDisc b;
    public View.OnClickListener c;
    public View.OnTouchListener d;
    public View.OnTouchListener e;
    public fnle f;
    public fnhp g;

    public SelectedAccountDisc(Context context0) {
        this(context0, null);
    }

    public SelectedAccountDisc(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SelectedAccountDisc(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        new Rect();
        new Rect();
        new WeakReference(null);
        LayoutInflater.from(context0).inflate(0x7F0E0920, this, true);  // layout:selected_account_disc
        AccountParticleDisc accountParticleDisc0 = (AccountParticleDisc)this.findViewById(0x7F0B1B01);  // id:og_selected_account_disc_apd
        this.b = accountParticleDisc0;
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0B1704);  // id:incognito_on_image_view
        this.a = imageView0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, fnjx.a, v, 0);
        try {
            int v2 = typedArray0.getDimensionPixelSize(0, -1);
            if(v2 != -1) {
                this.a(v2);
            }
        }
        finally {
            typedArray0.recycle();
        }
        int v3 = fnxf.b(context0);
        if(v3 != 0) {
            accountParticleDisc0.setBackgroundResource(v3);
            imageView0.setBackgroundResource(v3);
        }
        super.setOnTouchListener(new fnjy(this));
    }

    public final void a(int v) {
        gftb.r(((boolean)(this.b.t() ^ 1)), "setMaxDiscContentSize is only allowed before calling initialize.");
        this.b.p(v);
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(new fnkc(this, view$OnClickListener0));
    }

    @Override  // android.view.View
    public final void setOnTouchListener(View.OnTouchListener view$OnTouchListener0) {
        this.d = view$OnTouchListener0;
    }

    public void setScale(float f) {
        AvatarView.c(f, this.b.a.e);
        this.b.a.f = f;
        this.b.a.m();
        this.b.a.invalidate();
    }
}

