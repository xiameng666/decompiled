package com.google.android.libraries.messaging.lighter.richcard.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import fmfz;
import fmga;
import fmid;
import fmlj;
import fmly;
import fmlz;
import fmmp;
import fmmr;
import fmnn;
import fmog;
import fmoj;
import fmqf;
import fmro;
import fmrq;
import iaea;

public class RichCardContentView extends FrameLayout implements fmnn {
    public boolean a;
    private final int b;
    private final int c;
    private final int d;
    private int e;

    public RichCardContentView(Context context0) {
        this(context0, null);
    }

    public RichCardContentView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public RichCardContentView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = fmro.a(this.getContext(), ((float)iaea.f()));
        this.c = fmro.a(this.getContext(), ((float)iaea.e()));
        this.d = this.getContext().getResources().getDimensionPixelSize(0x7F0702EA);  // dimen:bubble_cell_content_start_end_padding
        this.a = true;
        this.e = 0x800003;
    }

    @Override  // fmnn
    public final void a(fmlz fmlz0, fmqf fmqf0, fmrq fmrq0, fmid fmid0, AccountContext accountContext0, fmga fmga0) {
        int v = fmlz0.b().ordinal();
        Integer integer0 = (int)0;
        if(v != 0 && v != 1) {
            if(v != 2) {
                return;
            }
            CardCarouselView cardCarouselView0 = new CardCarouselView(this.getContext());
            fmlj fmlj0 = fmlz0.a();
            boolean z = this.a;
            fmmp fmmp0 = new fmmp(fmqf0, fmrq0, fmid0, null, accountContext0, fmga0);
            cardCarouselView0.an(fmmp0);
            fmmp0.f(fmlj0.b);
            fmmp0.G(fmro.a(cardCarouselView0.getContext(), ((float)fmlj0.a)));
            fmmp0.n(this.c);
            fmmp0.a = z;
            cardCarouselView0.getContext();
            fmmr fmmr0 = new fmmr(cardCarouselView0, fmmp0);
            fmmr0.ab(0);
            cardCarouselView0.ap(fmmr0);
            this.addView(cardCarouselView0);
            return;
        }
        if(iaea.i()) {
            fmoj fmoj0 = new fmoj(this.getContext());
            fmoj0.i = this.a;
            fmly fmly0 = fmlz0.b();
            fmly fmly1 = fmly.a;
            fmoj0.a((fmly0.equals(fmly1) ? fmlz0.c() : fmlz0.d().a), fmqf0, fmrq0, fmid0, accountContext0, fmga0);
            if(!fmga0.k.a().equals(fmfz.c)) {
                fmoj0.g = this.b;
            }
            fmoj0.h = this.c;
            fmoj0.setClipChildren(true);
            this.addView(fmoj0);
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = (FrameLayout.LayoutParams)fmoj0.getLayoutParams();
            if(fmlz0.b().equals(fmly1) && ((int)(((Integer)fmlz0.c().b.f(integer0)))) > 0) {
                frameLayout$LayoutParams0.setMargins(this.d, 0, this.d, 0);
            }
            frameLayout$LayoutParams0.gravity = this.e;
            return;
        }
        fmog fmog0 = new fmog(this.getContext());
        fmog0.d = this.a;
        fmly fmly2 = fmlz0.b();
        fmly fmly3 = fmly.a;
        fmog0.a((fmly2.equals(fmly3) ? fmlz0.c() : fmlz0.d().a), fmqf0, fmrq0, fmid0, accountContext0, fmga0);
        if(!fmga0.k.a().equals(fmfz.c)) {
            fmog0.b = this.b;
        }
        fmog0.c = this.c;
        fmog0.setClipChildren(true);
        this.addView(fmog0);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = (FrameLayout.LayoutParams)fmog0.getLayoutParams();
        if(fmlz0.b().equals(fmly3) && ((int)(((Integer)fmlz0.c().b.f(integer0)))) > 0) {
            frameLayout$LayoutParams1.setMargins(this.d, 0, this.d, 0);
        }
        frameLayout$LayoutParams1.gravity = this.e;
    }

    @Override  // fmnn
    public final void aK(int v) {
        this.e = v;
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }
}

