package com.google.android.gms.wallet.ui.component.instrument.creditcard;

import MessageLite;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.View;
import bata;
import ca;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import fbgn;
import fcbn;
import fcbo;
import fm;
import gciq;
import gfgo;

public class CvcHintImageView extends ImageWithCaptionView implements View.OnClickListener {
    public fm a;
    private String i;
    private String j;
    private gfgo k;
    private fcbn l;

    public CvcHintImageView(Context context0) {
        super(context0);
        this.setOnClickListener(this);
    }

    public CvcHintImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setOnClickListener(this);
    }

    public CvcHintImageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.setOnClickListener(this);
    }

    public final void a(String s, String s1, gfgo gfgo0) {
        if(bata.b(this.i, s) && bata.b(this.j, s1) && bata.b(this.k, gfgo0)) {
            return;
        }
        this.i = s;
        this.j = s1;
        this.k = gfgo0;
        if(!this.r()) {
            this.setVisibility(8);
            return;
        }
        this.o(this.k, fbgn.o(this.getContext()));
    }

    public final void b(int v, boolean z) {
        if(this.getVisibility() != v) {
            if(z) {
                if(v == 0) {
                    this.b(0, false);
                    this.setAlpha(0.0f);
                    this.animate().alpha(1.0f);
                    return;
                }
                super.setVisibility(0);
                this.setAlpha(1.0f);
                this.animate().alpha(0.0f);
                this.animate().setListener(new fcbo(this, v));
                return;
            }
            super.setVisibility(v);
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.r()) {
            fm fm0 = this.a;
            if(fm0 != null) {
                if(this.l != null) {
                    ca ca0 = new ca(fm0);
                    ca0.o(this.l);
                    ca0.a();
                }
                String s = this.i;
                String s1 = this.j;
                gfgo gfgo0 = this.k;
                fcbn fcbn0 = new fcbn();
                Bundle bundle0 = new Bundle();
                bundle0.putString("hintTitle", s);
                bundle0.putString("hintText", s1);
                gciq.j(bundle0, "hintImage", ((MessageLite)gfgo0));
                fcbn0.setArguments(bundle0);
                this.l = fcbn0;
                fcbn0.show(this.a, "cvcHintFragment");
            }
        }
    }

    private final boolean r() {
        return this.i != null && this.k != null && this.j != null;
    }

    @Override  // android.widget.ImageView
    public final void setVisibility(int v) {
        if(!this.r()) {
            v = 8;
        }
        this.b(v, true);
    }
}

