package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.setupdesign.view.RichTextView;
import gaec;
import gagt;
import gahr;
import gajh;
import gaji;

public class Item extends AbstractItem implements gahr {
    private boolean a;
    private int b;
    private CharSequence c;
    public boolean g;
    public Drawable h;
    public CharSequence i;
    public CharSequence j;
    public Boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;

    public Item() {
        this.a = true;
        this.g = true;
        this.l = true;
        this.m = 0;
        this.n = 0;
        this.o = 16;
        this.b = this.d();
    }

    public Item(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = true;
        this.g = true;
        this.l = true;
        this.m = 0;
        this.n = 0;
        this.o = 16;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, gagt.q);
        this.g = typedArray0.getBoolean(1, true);
        this.h = typedArray0.getDrawable(0);
        this.i = typedArray0.getText(4);
        this.c = typedArray0.getText(5);
        this.j = typedArray0.getText(6);
        this.b = typedArray0.getResourceId(2, this.d());
        this.l = typedArray0.getBoolean(3, true);
        this.m = typedArray0.getColor(8, 0);
        this.o = typedArray0.getInt(7, 16);
        this.a = typedArray0.getBoolean(9, true);
        typedArray0.recycle();
    }

    public final void B(Drawable drawable0) {
        this.h = drawable0;
        this.q();
    }

    public final void C(int v) {
        this.b = v;
        this.q();
    }

    public final void D(CharSequence charSequence0) {
        this.c = charSequence0;
        this.q();
    }

    public final void E(CharSequence charSequence0) {
        this.i = charSequence0;
        this.q();
    }

    public final void F(boolean z) {
        if(this.l == z) {
            return;
        }
        this.l = z;
        if(!z) {
            this.v(0, 1);
            return;
        }
        this.u(0, 1);
    }

    @Override  // gahr
    public final void G() {
    }

    @Override  // gagz
    public void a(View view0) {
        TextView textView0 = (TextView)view0.findViewById(0x7F0B2162);  // id:sud_items_title
        textView0.setText(this.k());
        if(this.k != null) {
            view0.setClickable(false);
        }
        TextView textView1 = (TextView)view0.findViewById(0x7F0B215E);  // id:sud_items_summary
        CharSequence charSequence0 = this.kv();
        if(charSequence0 != null && charSequence0.length() > 0) {
            textView1.setText(charSequence0);
            if((textView1 instanceof RichTextView)) {
                ((RichTextView)textView1).b = this;
            }
            textView1.setVisibility(0);
        }
        else {
            textView1.setVisibility(8);
        }
        view0.setContentDescription(this.j);
        view0.setStateDescription(null);
        View view1 = view0.findViewById(0x7F0B2157);  // id:sud_items_icon_container
        Drawable drawable0 = this.h;
        if(drawable0 == null) {
            view1.setVisibility(8);
        }
        else {
            ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B2156);  // id:sud_items_icon
            imageView0.setImageDrawable(null);
            imageView0.setImageState(drawable0.getState(), false);
            imageView0.setImageLevel(drawable0.getLevel());
            imageView0.setImageDrawable(drawable0);
            int v = this.m;
            if(v == 0) {
                imageView0.clearColorFilter();
            }
            else {
                imageView0.setColorFilter(v);
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            if((viewGroup$LayoutParams0 instanceof LinearLayout.LayoutParams)) {
                ((LinearLayout.LayoutParams)viewGroup$LayoutParams0).gravity = this.o;
            }
            view1.setVisibility(0);
        }
        int v1 = this.n;
        if(v1 != 0) {
            textView0.setTextColor(v1);
        }
        view0.setId(this.e);
        if(!(this instanceof ExpandableSwitchItem) && view0.getId() != 0x7F0B216B && !gaec.t(view0.getContext())) {  // id:sud_layout_header
            gaji.b(view0);
        }
        gajh.a(view0);
    }

    protected int d() {
        return 0x7F0E0A9E;  // layout:sud_items_default
    }

    @Override  // gagz
    public boolean g() {
        return this.g;
    }

    @Override  // com.google.android.setupdesign.items.AbstractItem
    public final int hd() {
        return this.l ? 1 : 0;
    }

    public final void he(boolean z) {
        if(this.g == z) {
            return;
        }
        this.g = z;
        this.q();
    }

    public final boolean hf() {
        return this.l;
    }

    public CharSequence k() {
        return this.i;
    }

    public CharSequence kv() {
        return this.c;
    }

    @Override  // gagz
    public int kw() {
        return this.b;
    }

    @Override  // com.google.android.setupdesign.items.AbstractItem
    public final boolean s() {
        return this.a;
    }
}

