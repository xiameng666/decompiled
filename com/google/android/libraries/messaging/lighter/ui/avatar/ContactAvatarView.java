package com.google.android.libraries.messaging.lighter.ui.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import fmeo;
import fmqm;
import fmqp;
import fmqr;
import fmqt;
import fmrd;
import fmrf;
import fmro;
import fmsc;
import fyho;
import iaea;

public class ContactAvatarView extends RelativeLayout implements fmrd, fmsc {
    public fmqm a;
    public ImageView b;
    public int[] c;
    public int d;
    public int e;
    public Bitmap f;
    private final fmqp g;

    public ContactAvatarView(Context context0) {
        this(context0, null);
    }

    public ContactAvatarView(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ContactAvatarView(Context context0, AttributeSet attributeSet0, int v) {
        super(fmrf.b(context0, iaea.j()), attributeSet0, v);
        this.g = fmqp.a();
        ContactAvatarView.inflate(this.getContext(), 0x7F0E017D, this);  // layout:avatar_view_layout
        this.b = (ImageView)this.findViewById(0x7F0B0C3A);  // id:avatar_icon
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0B0C34);  // id:avatar_badge
        this.setClickable(true);
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, fmqt.b, v, 0);
        this.e = typedArray0.getDimensionPixelSize(2, fmro.a(this.getContext(), 60.0f));
        int v2 = typedArray0.getResourceId(0, 0);
        TypedArray typedArray1 = v2 == 0 ? this.getResources().obtainTypedArray(0x7F030010) : this.getResources().obtainTypedArray(v2);  // array:avatar_bg_colors_default_array
        int v3 = typedArray0.getResourceId(1, 0);
        this.d = v3 == 0 ? fyho.b(this, 0x7F040332) : this.getContext().getColor(v3);  // attr:colorSurface
        this.c = new int[typedArray1.length()];
        for(int v1 = 0; v1 < typedArray1.length(); ++v1) {
            int[] arr_v = this.c;
            arr_v[v1] = typedArray1.getColor(v1, 0xFF888888);
        }
        typedArray1.recycle();
        typedArray0.recycle();
        this.a = fmqm.d();
    }

    public final void a(fmeo fmeo0) {
        int v = this.e;
        fmqr fmqr0 = new fmqr(this);
        Bitmap bitmap0 = this.g.b(fmeo0, v, fmqr0);
        this.f = bitmap0;
        this.b.setImageBitmap(bitmap0);
    }

    @Override  // fmrd
    public final void aL(Object object0) {
        throw null;
    }

    @Override  // fmsc
    public final void b() {
        this.f = null;
    }
}

