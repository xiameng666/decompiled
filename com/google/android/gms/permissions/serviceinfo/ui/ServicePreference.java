package com.google.android.gms.permissions.serviceinfo.ui;

import ProtoLiteMessage;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.Preference;
import cmeb;
import cmec;
import cmfp;
import cmfs;
import cmgj;
import cmgk;
import cmgl;
import cmgm;
import ehne;
import hgiq;
import ibuq;
import oij;

public final class ServicePreference extends Preference {
    public View.OnClickListener a;
    public cmeb b;
    public cmeb c;
    private final cmec d;
    private final String e;
    private final ehne f;
    private final hgiq g;
    private final boolean h;

    public ServicePreference(Context context0, cmec cmec0, String s, ehne ehne0, hgiq hgiq0, boolean z) {
        ibuq.f(context0, "context");
        ibuq.f(cmec0, "gmsCoreMetrics");
        ibuq.f(s, "widgetIconContentDescription");
        ibuq.f(hgiq0, "serviceId");
        super(context0);
        this.d = cmec0;
        this.a = null;
        this.e = s;
        this.f = ehne0;
        this.g = hgiq0;
        this.h = z;
        this.D = 0x7F0E04E0;  // layout:image_view_with_divider
        this.K(false);
        this.w = false;
    }

    @Override  // androidx.preference.Preference
    public final void a(oij oij0) {
        ibuq.f(oij0, "holder");
        super.a(oij0);
        ehne ehne0 = this.f;
        if(ehne0 != null) {
            ehne0.a(oij0);
        }
        View view0 = oij0.a;
        view0.setPaddingRelative(view0.getPaddingStart(), view0.getPaddingTop(), 0, view0.getPaddingBottom());
        View view1 = oij0.D(0x7F0B2502);  // id:widget_frame
        if(view1 == null) {
            throw new IllegalArgumentException("Unable to find the View for the widget frame");
        }
        TextView textView0 = (TextView)oij0.D(0x1020010);
        this.c = this.k(view1, 158300);
        ImageView imageView0 = (ImageView)view1.findViewById(0x7F0B16B9);  // id:icon
        if(imageView0 != null) {
            imageView0.setContentDescription(this.e);
            imageView0.setOnClickListener(this.a);
        }
        this.b = this.k(view0, 0x26668);
        if(this.h) {
            if(textView0 == null) {
                throw new IllegalArgumentException("Unable to find summary text view");
            }
            cmeb cmeb0 = this.d.b(textView0, 0x2A44E);
            cmgm cmgm0 = cmgl.a(((ProtoLiteMessage)cmfs.a).v_newBuilder());
            cmgk cmgk0 = cmgj.a(((ProtoLiteMessage)cmfp.a).v_newBuilder());
            cmgk0.b(this.g);
            cmgm0.c(cmgk0.a());
            cmeb0.d(cmgm0.a());
            cmeb0.f();
        }
    }

    private final cmeb k(View view0, int v) {
        cmeb cmeb0 = this.d.b(view0, v);
        cmgm cmgm0 = cmgl.a(((ProtoLiteMessage)cmfs.a).v_newBuilder());
        cmgk cmgk0 = cmgj.a(((ProtoLiteMessage)cmfp.a).v_newBuilder());
        cmgk0.b(this.g);
        cmgm0.c(cmgk0.a());
        cmeb0.d(cmgm0.a());
        cmeb0.f();
        return cmeb0;
    }
}

