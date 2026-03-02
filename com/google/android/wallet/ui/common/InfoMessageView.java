package com.google.android.wallet.ui.common;

import MessageLite;
import Parser;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.wallet.shared.common.ClickSpan;
import gamj;
import gcil;
import gciq;
import gcjh;
import gcqq;
import gcqu;
import gcqy;
import gczo;
import gdaj;
import gdao;
import gdap;
import gdaz;
import gdcb;
import gdgb;
import gfev;
import gffq;
import gfgq;
import gfgr;
import gfgt;
import gfgw;
import gfgy;
import gfhl;
import gftb;
import ggna;
import hfuo;
import java.util.List;
import java.util.Locale;
import kfe;

public class InfoMessageView extends LinearLayout implements gcqu, gdao {
    protected ViewGroup a;
    public TextView b;
    public TextView c;
    public TextView d;
    public boolean e;
    public int f;
    public gfgr g;
    public gcqu h;
    public gczo i;
    public gdaz j;
    public gcqq k;
    public gcqq l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public ColorStateList p;
    public int q;
    private boolean r;
    private boolean s;
    private gdaj t;
    private int u;

    public InfoMessageView(Context context0) {
        super(context0, null);
        this.r = true;
        this.s = true;
        this.e = true;
        this.o();
    }

    public InfoMessageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.r = true;
        this.s = true;
        this.e = true;
        this.o();
        this.w(context0, attributeSet0);
    }

    public InfoMessageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.r = true;
        this.s = true;
        this.e = true;
        this.o();
        this.w(context0, attributeSet0);
    }

    @Override  // gami
    public final gamj B() {
        throw null;
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        int v2 = 0;
        switch(v - 1) {
            case 1: {
                this.setVisibility(0);
                return;
            }
            case 11: {
                this.setVisibility(8);
                return;
            }
            case 27: {
                if(this.getVisibility() == 0) {
                    v2 = 8;
                }
                this.setVisibility(v2);
                return;
            }
            case 35: {
                this.j = null;
                this.b.setText("");
                this.y();
                return;
            }
            default: {
                Locale locale0 = Locale.US;
                int v3 = gfev.a(gffq0.e);
                if(v3 != 0) {
                    v1 = v3;
                }
                throw new IllegalArgumentException(String.format(locale0, "Unsupported resulting action type: %s", ((int)(v1 - 1))));
            }
        }
    }

    @Override  // gdaj
    public final gdaj aV() {
        return this.t;
    }

    @Override  // gdaj
    public final String aX(String s) {
        return "";
    }

    @Override  // gdao
    public final View b() {
        return this;
    }

    @Override  // gdao
    public final gfgr c() {
        return this.g;
    }

    public final float d() {
        return this.b.getVisibility() == 0 ? this.b.getTextSize() : this.c.getTextSize();
    }

    @Override  // android.view.ViewGroup
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent0) {
        gcqq gcqq0 = this.k;
        return gcqq0 == null || this.l == null ? super.dispatchHoverEvent(motionEvent0) : gcqq0.t(motionEvent0) || this.l.t(motionEvent0) || super.dispatchHoverEvent(motionEvent0);
    }

    public static InfoMessageView f(LayoutInflater layoutInflater0, gfgr gfgr0, ViewGroup viewGroup0, gcqy gcqy0) {
        InfoMessageView infoMessageView0 = (InfoMessageView)layoutInflater0.inflate(0x7F0E0C4A, viewGroup0, false);  // layout:view_info_message_text_basic
        infoMessageView0.p(gfgr0);
        infoMessageView0.setId(gcqy0.a());
        return infoMessageView0;
    }

    public final String g() {
        boolean z = true;
        boolean z1 = this.b.getVisibility() == 0 && !TextUtils.isEmpty(this.b.getText());
        if(this.c.getVisibility() != 0 || TextUtils.isEmpty(this.c.getText())) {
            z = false;
        }
        if(z1 && z) {
            return String.format("%s\n%s", this.b.getText(), this.c.getText());
        }
        if(z1) {
            return this.b.getText().toString();
        }
        return z ? this.c.getText().toString() : "";
    }

    @Override  // android.widget.LinearLayout
    public final int getBaseline() {
        int v = this.getPaddingTop();
        int v1 = super.getBaseline();
        if(this.b.getVisibility() == 0) {
            return v + this.b.getBaseline();
        }
        return this.c.getVisibility() == 0 ? v + this.c.getBaseline() : v1;
    }

    @Override  // gczt
    public final CharSequence getError() {
        return "";
    }

    public static void h(TextView textView0, ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            textView0.setTextColor(InfoMessageView.v(colorStateList0));
        }
    }

    public static void i(TextView textView0, ColorStateList colorStateList0) {
        if(colorStateList0 != null) {
            textView0.setLinkTextColor(InfoMessageView.v(colorStateList0));
        }
    }

    @Override  // gami
    public final List li() {
        return ggna.a;
    }

    @Override  // gcqu
    public final void ls(View view0, String s) {
        gfgt gfgt0;
        if("expandInfoText".equals(s)) {
            if(!this.s) {
                this.s = true;
                this.y();
            }
            return;
        }
        if(((Boolean)gcjh.K.a()).booleanValue() && !TextUtils.isEmpty(s)) {
            String s1 = Uri.parse(s).getScheme();
            if(gdap.a.equals(s1)) {
                gczo gczo0 = this.i;
                gftb.check(gczo0);
                hfuo hfuo0 = this.g.p;
                String s2 = Uri.parse(s).getLastPathSegment();
                gftb.f(((boolean)(1 ^ TextUtils.isEmpty(s2))), "Unable to get the last path segment from URL: %s", s);
                gftb.check(s2);
                int v = Integer.parseInt(s2);
                for(Object object0: hfuo0) {
                    gfgt0 = (gfgt)object0;
                    if(gfgt0.d != v) {
                        continue;
                    }
                    goto label_22;
                }
                gfgt0 = null;
            label_22:
                gftb.A(gfgt0, "Unable to find the corresponding LinkAction with link ID: %s.", v);
                Bundle bundle0 = new Bundle();
                gciq.j(bundle0, "EventListener.EXTRA_LINK_ACTION_PROTO", ((MessageLite)gfgt0));
                gczo0.T(28, bundle0);
                return;
            }
        }
        gcqu gcqu0 = this.h;
        if(gcqu0 != null) {
            gcqu0.ls(this, s);
            return;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW").setData(Uri.parse(s));
        this.getContext().startActivity(intent0);
    }

    @Override  // gami
    public final void lu() {
    }

    public final void n(gfgr gfgr0) {
        if(gfgr0 != null && !((ProtoLiteMessage)gfgr0).equals(gfgr.a)) {
            this.setVisibility(0);
            this.p(gfgr0);
            return;
        }
        this.setVisibility(8);
    }

    @Override  // gczt
    public final void nT(CharSequence charSequence0, boolean z) {
    }

    @Override  // gczt
    public final boolean nW() {
        return true;
    }

    @Override  // gczt
    public final boolean nX() {
        if(this.hasFocus() || !this.requestFocus()) {
            gdcb.G(this);
        }
        return this.hasFocus();
    }

    @Override  // gczt
    public final boolean nY() {
        return true;
    }

    @Override  // gczt
    public final boolean nZ(Object object0) {
        return (object0 instanceof gfgr) && TextUtils.equals(((gfgr)object0).f, this.g.f) && TextUtils.equals(((gfgr)object0).g, this.g.g);
    }

    protected final void o() {
        this.setOrientation(0);
        this.setImportantForAccessibility(2);
        LayoutInflater.from(this.getContext()).inflate(0x7F0E0C4B, this);  // layout:view_info_message_view
        this.a = (ViewGroup)this.findViewById(0x7F0B18FC);  // id:message_views_container
        this.b = (TextView)this.findViewById(0x7F0B18F0);  // id:message
        this.c = (TextView)this.findViewById(0x7F0B10FC);  // id:detailed_message
        this.setVisibility(this.getVisibility());
    }

    @Override  // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable0) {
        if((parcelable0 instanceof Bundle)) {
            gdaz gdaz0 = null;
            this.g = (gfgr)gciq.a(((Bundle)parcelable0), "infoMessage", ((Parser)((ProtoLiteMessage)gfgr.a).jf(7, null)));
            this.s = ((Bundle)parcelable0).getBoolean("expanded");
            this.f = ((Bundle)parcelable0).getInt("requestedVisibility");
            Bundle bundle0 = ((Bundle)parcelable0).getBundle("messageBuilder");
            if(bundle0 != null && bundle0.containsKey("messageBuilder.messageTemplate")) {
                gfgy gfgy0 = (gfgy)gciq.a(bundle0, "messageBuilder.messageTemplate", ((Parser)((ProtoLiteMessage)gfgy.a).jf(7, null)));
                if(gfgy0 != null) {
                    gdaz0 = new gdaz(gfgy0);
                    gdaz0.b = bundle0.getStringArray("messageBuilder.componentValues");
                    for(int v = 0; v < gdaz0.b.length; ++v) {
                        if(gdaz0.b[v] != null) {
                            Long long0 = gfgy0.c.a(v);
                            gdaz0.c.remove(long0);
                        }
                    }
                }
            }
            this.j = gdaz0;
            super.onRestoreInstanceState(((Bundle)parcelable0).getParcelable("parentState"));
            this.y();
            this.m = (ColorStateList)((Bundle)parcelable0).getParcelable("messageSavedTextColors");
            this.n = (ColorStateList)((Bundle)parcelable0).getParcelable("messageSavedLinkTextColors");
            this.o = (ColorStateList)((Bundle)parcelable0).getParcelable("detailedMessageSavedTextColors");
            this.p = (ColorStateList)((Bundle)parcelable0).getParcelable("detailedMessageSavedLinkTextColors");
            ColorStateList colorStateList0 = this.m;
            if(colorStateList0 != null) {
                InfoMessageView.h(this.b, colorStateList0);
                InfoMessageView.i(this.b, this.n);
                InfoMessageView.h(this.c, this.o);
                InfoMessageView.i(this.c, this.p);
            }
            return;
        }
        super.onRestoreInstanceState(parcelable0);
    }

    @Override  // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new Bundle();
        ((Bundle)parcelable0).putParcelable("messageSavedTextColors", this.m);
        ((Bundle)parcelable0).putParcelable("messageSavedLinkTextColors", this.n);
        ((Bundle)parcelable0).putParcelable("detailedMessageSavedTextColors", this.o);
        ((Bundle)parcelable0).putParcelable("detailedMessageSavedLinkTextColors", this.p);
        ((Bundle)parcelable0).putParcelable("parentState", super.onSaveInstanceState());
        gciq.j(((Bundle)parcelable0), "infoMessage", ((MessageLite)this.g));
        ((Bundle)parcelable0).putBoolean("expanded", this.s);
        ((Bundle)parcelable0).putInt("requestedVisibility", this.f);
        gdaz gdaz0 = this.j;
        if(gdaz0 != null) {
            Bundle bundle0 = new Bundle();
            gciq.j(bundle0, "messageBuilder.messageTemplate", ((MessageLite)gdaz0.a));
            bundle0.putStringArray("messageBuilder.componentValues", gdaz0.b);
            ((Bundle)parcelable0).putBundle("messageBuilder", bundle0);
        }
        return parcelable0;
    }

    public final void p(gfgr gfgr0) {
        this.q(gfgr0, true);
    }

    public final void q(gfgr gfgr0, boolean z) {
        if(z) {
            gcqq gcqq0 = new gcqq(this.b);
            this.k = gcqq0;
            kfe.j(this.b, gcqq0);
            gcqq gcqq1 = new gcqq(this.c);
            this.l = gcqq1;
            kfe.j(this.c, gcqq1);
        }
        if(gfgr0 != null && !((ProtoLiteMessage)gfgr0).equals(gfgr.a) && (!gfgr0.f.isEmpty() && (gfgr0.b & 2) != 0)) {
            throw new IllegalArgumentException("Info message cannot contain both messageHtml and messageTemplate.");
        }
        this.g = gfgr0;
        this.s = false;
        this.j = null;
        this.y();
    }

    public final void r(gdaj gdaj0) {
        this.t = gdaj0;
        if(this.g != null && this.j != null) {
            this.y();
        }
    }

    public final void s(int v) {
        this.b.setTextColor(v);
        this.c.setTextColor(v);
    }

    @Override  // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView0 = this.d;
        if(textView0 != null) {
            textView0.setEnabled(z);
        }
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        this.c.setEnabled(z);
    }

    @Override  // android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        super.setOnClickListener(view$OnClickListener0);
        this.b.setOnClickListener(view$OnClickListener0);
        this.c.setOnClickListener(view$OnClickListener0);
    }

    @Override  // android.view.View
    public final void setVisibility(int v) {
        this.f = v;
        if(TextUtils.isEmpty(this.b.getText()) && TextUtils.isEmpty(this.c.getText())) {
            super.setVisibility(8);
            return;
        }
        super.setVisibility(v);
    }

    public final void t() {
        TextView textView0 = this.b;
        int v = gfhl.a(this.g.o);
        int v1 = 2;
        if(v == 0) {
            v = 2;
        }
        this.z(textView0, v);
        TextView textView1 = this.c;
        int v2 = gfhl.a(this.g.o);
        if(v2 != 0) {
            v1 = v2;
        }
        this.z(textView1, v1);
    }

    public final void u(TextView textView0, int v) {
        int v1;
        TypedValue typedValue0;
        switch(v - 1) {
            case 1: 
            case 16: {
                typedValue0 = new TypedValue();
                v1 = this.getContext().getTheme().resolveAttribute(0x7F04068E, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicDefaultDisplayType
                break;
            }
            case 18: {
                typedValue0 = new TypedValue();
                v1 = this.getContext().getTheme().resolveAttribute(0x7F0406DC, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicLargeCodeDisplayDisplayType
                break;
            }
            case 27: {
                typedValue0 = new TypedValue();
                v1 = this.getContext().getTheme().resolveAttribute(0x7F0406C6, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicHeadline5DisplayType
                break;
            }
            case 45: {
                v1 = 0x7F160FFD;  // style:UicInfoMessageMaterial1Body4
                break;
            }
            case 0x30: {
                typedValue0 = new TypedValue();
                v1 = this.getContext().getTheme().resolveAttribute(0x7F0406C5, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicHeaderRegularDisplayType
                break;
            }
            case 49: {
                typedValue0 = new TypedValue();
                v1 = this.getContext().getTheme().resolveAttribute(0x7F040718, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicSubtitle2DisplayType
                break;
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        typedValue0 = new TypedValue();
                        v1 = this.getContext().getTheme().resolveAttribute(0x7F04069B, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicEmphasisDisplayType
                        break;
                    }
                    case 4: {
                        typedValue0 = new TypedValue();
                        v1 = this.getContext().getTheme().resolveAttribute(0x7F04069D, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicErrorDisplayType
                        break;
                    }
                    case 5: {
                        typedValue0 = new TypedValue();
                        v1 = this.getContext().getTheme().resolveAttribute(0x7F0406C4, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicHeaderDisplayType
                        break;
                    }
                    case 6: {
                        typedValue0 = new TypedValue();
                        v1 = this.getContext().getTheme().resolveAttribute(0x7F040716, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicSubHeaderDisplayType
                        break;
                    }
                    case 7: {
                        typedValue0 = new TypedValue();
                        v1 = this.getContext().getTheme().resolveAttribute(0x7F040691, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicDetailDisplayType
                        break;
                    }
                    case 8: {
                        typedValue0 = new TypedValue();
                        v1 = this.getContext().getTheme().resolveAttribute(0x7F0406CB, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicInfoDisplayType
                        break;
                    }
                    case 9: {
                        typedValue0 = new TypedValue();
                        v1 = this.getContext().getTheme().resolveAttribute(0x7F040692, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicDetailInfoDisplayType
                        break;
                    }
                    default: {
                        switch(v - 1) {
                            case 12: {
                                typedValue0 = new TypedValue();
                                v1 = this.getContext().getTheme().resolveAttribute(0x7F040701, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicScoreCardDisplayType
                                break;
                            }
                            case 13: {
                                typedValue0 = new TypedValue();
                                v1 = this.getContext().getTheme().resolveAttribute(0x7F0406F6, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicPendingDisplayType
                                break;
                            }
                            case 14: {
                                typedValue0 = new TypedValue();
                                v1 = this.getContext().getTheme().resolveAttribute(0x7F0406DA, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicInputDisplayType
                                break;
                            }
                            default: {
                                switch(v - 1) {
                                    case 33: {
                                        typedValue0 = new TypedValue();
                                        v1 = this.getContext().getTheme().resolveAttribute(0x7F040717, typedValue0, true) ? typedValue0.data : this.u;  // attr:internalUicSubHeaderPrimaryDisplayType
                                        break;
                                    }
                                    case 34: {
                                        v1 = 0x7F160FFE;  // style:UicInfoMessageMaterial1Headline1
                                        break;
                                    }
                                    case 35: {
                                        v1 = 0x7F160FFF;  // style:UicInfoMessageMaterial1Headline2
                                        break;
                                    }
                                    case 36: {
                                        v1 = 0x7F161000;  // style:UicInfoMessageMaterial1Headline3
                                        break;
                                    }
                                    case 37: {
                                        v1 = 0x7F161001;  // style:UicInfoMessageMaterial1Headline3Secondary
                                        break;
                                    }
                                    case 38: {
                                        v1 = 0x7F160FF8;  // style:UicInfoMessageMaterial1Body1
                                        break;
                                    }
                                    default: {
                                        switch(v - 1) {
                                            case 40: {
                                                v1 = 0x7F160FF9;  // style:UicInfoMessageMaterial1Body2
                                                break;
                                            }
                                            case 41: {
                                                v1 = 0x7F160FFA;  // style:UicInfoMessageMaterial1Body2Secondary
                                                break;
                                            }
                                            case 42: {
                                                v1 = 0x7F160FFB;  // style:UicInfoMessageMaterial1Body3
                                                break;
                                            }
                                            case 43: {
                                                v1 = 0x7F160FFC;  // style:UicInfoMessageMaterial1Body3Secondary
                                                break;
                                            }
                                            default: {
                                                v1 = this.u;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(v1 > 0) {
            textView0.setTextAppearance(v1);
        }
        if(v == 17) {
            textView0.setAutoSizeTextTypeWithDefaults(1);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)textView0.getLayoutParams();
            linearLayout$LayoutParams0.width = -1;
            linearLayout$LayoutParams0.height = this.getResources().getDimensionPixelSize(0x7F071492);  // dimen:wallet_external_display_auto_size_text_height
        }
    }

    private static int v(ColorStateList colorStateList0) {
        int v = colorStateList0.getDefaultColor();
        return colorStateList0.getColorForState(new int[]{0xFEFEFF62}, v);
    }

    private final void w(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(new int[]{0x7F040DD1});  // attr:uicAlwaysInlineExpandLabel
        boolean z = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, gdgb.g);
        this.r = z ? true : typedArray1.getBoolean(4, true);
        this.u = typedArray1.getResourceId(0, -1);
        this.q = typedArray1.getInt(1, -1);
        boolean z1 = typedArray1.getBoolean(2, true);
        this.b.setIncludeFontPadding(z1);
        this.c.setIncludeFontPadding(z1);
        if(typedArray1.hasValue(3)) {
            float f = typedArray1.getDimension(3, 0.0f);
            this.b.setLineSpacing(f, this.b.getLineSpacingMultiplier());
            this.c.setLineSpacing(f, this.c.getLineSpacingMultiplier());
        }
        typedArray1.recycle();
    }

    private final void x(TextView textView0, String s) {
        if(this.e) {
            ClickSpan.b(textView0, s, this, ((Boolean)gcjh.D.a()).booleanValue());
            return;
        }
        textView0.setText(s);
    }

    private final void y() {
        gfgw gfgw0;
        int v = 1;
        if(this.g != null && !((ProtoLiteMessage)this.g).equals(gfgr.a) && (!this.g.f.isEmpty() || (this.g.b & 2) != 0)) {
            gfgr gfgr0 = this.g;
            if((gfgr0.b & 2) == 0) {
                this.x(this.b, gfgr0.f);
                this.b.setVisibility(0);
                if(this.g.g.isEmpty()) {
                    this.c.setText("");
                    this.c.setVisibility(8);
                    this.s = true;
                }
                else {
                    this.x(this.c, this.g.g);
                    if(this.g.h.isEmpty()) {
                        this.c.setVisibility(0);
                        this.s = true;
                    }
                    else if(this.s) {
                        this.c.setVisibility(0);
                        this.b.setVisibility(8);
                    }
                    else if(this.r) {
                        if(!this.e) {
                            throw new IllegalArgumentException("InfoMessageView inline expand label can only be used when linkify is true");
                        }
                        this.c.setVisibility(8);
                        this.x(this.b, String.format("%s <a href=\"%s\">%s</a>", this.g.f, "expandInfoText", this.g.h));
                    }
                    else {
                        this.c.setVisibility(8);
                    }
                }
            }
            else {
                this.c.setText("");
                this.c.setVisibility(8);
                this.s = true;
                if(this.j == null) {
                    this.j = new gdaz((this.g.e == null ? gfgy.a : this.g.e));
                }
                if(!this.j.c()) {
                    gdaj gdaj0 = this.t;
                    if(gdaj0 != null) {
                        gcil.j(gdaj0, this.j, true);
                    }
                }
                if(this.j.c()) {
                    this.x(this.b, this.j.a());
                }
            }
            this.u(this.b, (gfgq.a(this.g.i) == 0 ? 1 : gfgq.a(this.g.i)));
            TextView textView0 = this.c;
            int v1 = gfgq.a(this.g.j);
            if(v1 != 0) {
                v = v1;
            }
            this.u(textView0, v);
            this.t();
            if(this.g.k) {
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.getLayoutParams();
                if(viewGroup$MarginLayoutParams0 != null) {
                    viewGroup$MarginLayoutParams0.topMargin = 0;
                    viewGroup$MarginLayoutParams0.bottomMargin = 0;
                }
            }
            Context context0 = this.getContext();
            gfgr gfgr1 = this.g;
            if((gfgr1.b & 0x100) == 0) {
                gfgw0 = null;
            }
            else {
                gfgw0 = gfgr1.l;
                if(gfgw0 == null) {
                    gfgw0 = gfgw.a;
                }
            }
            gdcb.A(context0, gfgw0, this);
            if(this.g.m) {
                TextView textView1 = this.d;
                if(textView1 == null) {
                    this.d = (TextView)((ViewStub)this.findViewById(0x7F0B0D79)).inflate();  // id:bullet
                }
                else {
                    textView1.setVisibility(0);
                }
                if(!this.g.n.isEmpty()) {
                    this.d.setText(this.g.n);
                }
            }
            else {
                TextView textView2 = this.d;
                if(textView2 != null) {
                    textView2.setText("");
                    this.d.setVisibility(8);
                }
            }
        }
        else {
            this.b.setText("");
            this.b.setVisibility(8);
            this.c.setText("");
            this.c.setVisibility(8);
            TextView textView3 = this.d;
            if(textView3 != null) {
                textView3.setText("");
                this.d.setVisibility(8);
            }
            this.s = true;
        }
        this.setVisibility(this.f);
    }

    private final void z(TextView textView0, int v) {
        int v1 = this.q;
        if(v1 == -1) {
            switch(v - 1) {
                case 2: {
                    v1 = 0x800015;
                    break;
                }
                case 3: {
                    v1 = 17;
                    break;
                }
                default: {
                    v1 = 0x800013;
                }
            }
        }
        textView0.setGravity(v1);
    }
}

