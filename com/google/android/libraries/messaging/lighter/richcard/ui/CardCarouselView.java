package com.google.android.libraries.messaging.lighter.richcard.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.libraries.messaging.lighter.model.AccountContext;
import fmfz;
import fmga;
import fmid;
import fmly;
import fmlz;
import fmmp;
import fmmq;
import fmnn;
import fmqf;
import fmro;
import fmrq;
import iaea;
import java.util.Collections;
import rf;

public class CardCarouselView extends RecyclerView implements fmnn {
    public int ac;
    private final int ad;
    private final int ae;
    private final int af;
    private final rf ag;
    private boolean ah;

    public CardCarouselView(Context context0) {
        this(context0, null);
    }

    public CardCarouselView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public CardCarouselView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.ah = true;
        this.ac = 0x800003;
        this.setPadding(this.getResources().getDimensionPixelSize(0x7F070FC5), 0, 0, 0);  // dimen:rich_card_start_end_padding
        this.setClipToPadding(false);
        rf rf0 = new rf(this.getContext(), 0);
        this.ag = rf0;
        Drawable drawable0 = this.getContext().getDrawable(0x7F080E5A);  // drawable:rich_card_divider
        if(drawable0 == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        rf0.a = drawable0;
        if(!iaea.i()) {
            this.A(rf0);
        }
        this.setNestedScrollingEnabled(false);
        if(iaea.i()) {
            this.ad = fmro.a(this.getContext(), ((float)iaea.f()));
            this.ae = fmro.a(this.getContext(), ((float)iaea.e()));
            this.af = this.getContext().getResources().getDimensionPixelSize(0x7F0702EA);  // dimen:bubble_cell_content_start_end_padding
            return;
        }
        this.ad = 0;
        this.ae = 0;
        this.af = 0;
    }

    @Override  // fmnn
    public final void a(fmlz fmlz0, fmqf fmqf0, fmrq fmrq0, fmid fmid0, AccountContext accountContext0, fmga fmga0) {
        fmmp fmmp0 = new fmmp(fmqf0, fmrq0, fmid0, this.i(), accountContext0, fmga0);
        this.an(fmmp0);
        rf rf0 = this.ag;
        this.ah(rf0);
        int v = fmlz0.b().ordinal();
        boolean z = true;
        if(v == 0 || v == 1) {
            fmly fmly0 = fmlz0.b();
            fmly fmly1 = fmly.a;
            if(fmly0.equals(fmly1) && ((int)(((Integer)fmlz0.c().b.f(Integer.valueOf(0))))) > 0) {
                this.setPadding(this.af, 0, this.af, 0);
            }
            else {
                this.setPadding(0, 0, 0, 0);
            }
            fmmp0.f(Collections.singletonList((fmlz0.b().equals(fmly1) ? fmlz0.c() : fmlz0.d().a)));
            fmmp0.G((fmga0.k.a().equals(fmfz.c) ? -1 : this.ad));
        }
        else if(v == 2) {
            this.setPadding(this.getResources().getDimensionPixelSize(0x7F070FC5), 0, 0, 0);  // dimen:rich_card_start_end_padding
            fmmp0.f(fmlz0.a().b);
            fmmp0.G(fmro.a(this.getContext(), ((float)fmlz0.a().a)));
            this.A(rf0);
        }
        fmmp0.n(this.ae);
        fmmp0.a = this.ah;
        this.getContext();
        fmmq fmmq0 = new fmmq(this, fmmp0, fmlz0);
        if(fmlz0.b() != fmly.a && fmlz0.b() != fmly.b || this.ac != 0x800005) {
            z = false;
        }
        fmmq0.s(z);
        fmmq0.ab(0);
        this.ap(fmmq0);
    }

    @Override  // fmnn
    public final void aK(int v) {
        this.ac = v;
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    @Override  // fmnn, android.view.ViewGroup
    public final void removeAllViews() {
    }
}

