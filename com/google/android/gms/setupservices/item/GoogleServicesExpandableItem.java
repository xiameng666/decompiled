package com.google.android.gms.setupservices.item;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.setupdesign.items.ExpandableSwitchItem;
import epdd;
import epdr;
import epel;
import epeu;
import gaea;
import gaec;
import gagw;
import gaji;
import gajm;
import grmb;
import grmf;
import grmi;
import grno;
import grnp;

public class GoogleServicesExpandableItem extends ExpandableSwitchItem implements epdd, gagw {
    public epdr a;
    public epdr b;
    public epdr c;
    public static final int d;
    private epdr r;
    private epdr s;
    private final Context t;
    private final int u;
    private final boolean v;
    private final boolean w;

    public GoogleServicesExpandableItem(Context context0, int v, boolean z, boolean z1, boolean z2) {
        super(context0, z1);
        this.u = v;
        this.v = z1;
        this.w = z2;
        this.t = context0;
        if(!gaec.t(context0)) {
            if(z2) {
                this.C((z ? 0x7F0E098B : 0x7F0E098A));  // layout:setupservices_items_expandable_compact_item_with_blue_chip
                return;
            }
            if(z1) {
                if(!z) {
                    z = false;
                    goto label_15;
                }
                this.C(0x7F0E0AA3);  // layout:sud_items_expandable_switch_with_blue_chip
                return;
            }
        label_15:
            if(!z1) {
                this.C((z ? 0x7F0E098D : 0x7F0E098C));  // layout:setupservices_items_expandable_switch_tinted_with_blue_chip
            }
        }
    }

    @Override  // com.google.android.setupdesign.items.ExpandableSwitchItem
    public final void a(View view0) {
        CharSequence charSequence0;
        super.a(view0);
        int v = 0;
        view0.setClickable(false);
        Context context0 = view0.getContext();
        epeu epeu0 = epeu.a;
        if(epeu0 == null) {
            synchronized(epeu.class) {
                epeu0 = epeu.a;
                if(epeu0 == null) {
                    epeu0 = new epeu(context0);
                    epeu.a = epeu0;
                }
            }
        }
        if(epeu0.b) {
            View view1 = view0.findViewById(0x7F0B2157);  // id:sud_items_icon_container
            if(view1 != null) {
                view1.setVisibility(8);
            }
        }
        if(!gaec.t(this.t)) {
            if(gaec.B(view0.getContext())) {
                LinearLayout linearLayout0 = (LinearLayout)view0.findViewById(0x7F0B2154).getParent();  // id:sud_items_expandable_switch_content
                int v2 = linearLayout0.getPaddingBottom();
                if(gaec.h(view0.getContext()).w(gaea.aW) && !gaec.h(view0.getContext()).n(view0.getContext(), gaea.aW, true)) {
                    v2 = view0.getResources().getDimensionPixelSize(0x7F0708CB);  // dimen:item_padding_bottom
                }
                linearLayout0.setPadding(linearLayout0.getPaddingLeft(), 0, linearLayout0.getPaddingRight(), v2);
                TextView textView0 = (TextView)view0.findViewById(0x7F0B215E);  // id:sud_items_summary
                textView0.setTextSize(0, ((float)view0.getResources().getDimensionPixelSize(0x7F07028E)));  // dimen:bc_expandable_switch_item_summary_text_size
                textView0.setLineSpacing(((float)view0.getResources().getDimensionPixelSize(0x7F07028D)), textView0.getLineSpacingMultiplier());  // dimen:bc_expandable_switch_item_summary_line_spacing_extra
                if(this.f) {
                    epdr epdr0 = this.c;
                    charSequence0 = epdr0 == null ? this.j() : TextUtils.concat(new CharSequence[]{this.b.a, epdr0.a});
                }
                else {
                    charSequence0 = this.j();
                }
                if(charSequence0 != null) {
                    textView0.setContentDescription(charSequence0);
                }
            }
            else if(this.v) {
                View view2 = view0.findViewById(0x7F0B2154);  // id:sud_items_expandable_switch_content
                int v3 = view0.getResources().getDimensionPixelSize(0x7F0708CC);  // dimen:item_padding_end
                view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), v3, view2.getPaddingBottom());
                Context context1 = view0.getContext();
                gaec gaec0 = gaec.h(context1);
                gaea gaea0 = gaea.P;
                boolean z = gaec0.w(gaea0);
                if(gajm.e(view0)) {
                    int v4 = z ? ((int)gaec.h(context1).a(context1, gaea0)) : view0.getPaddingEnd();
                    if(v4 != view0.getPaddingEnd()) {
                        TypedArray typedArray0 = view0.getContext().obtainStyledAttributes(new int[]{0x7F04080A});  // attr:listPreferredItemPaddingRight
                        int v5 = typedArray0.getDimensionPixelSize(0, 0);
                        typedArray0.recycle();
                        view0.setPaddingRelative(view0.getPaddingStart(), view0.getPaddingTop(), v4 - v5, view0.getPaddingBottom());
                    }
                }
            }
            boolean z1 = this.w;
            if(z1 || !this.v) {
                View view3 = view0.findViewById(0x7F0B2160);  // id:sud_items_switch
                if(!this.v) {
                    v = 8;
                }
                if(view3 != null) {
                    view3.setVisibility(v);
                }
                View view4 = view0.findViewById(0x7F0B2161);  // id:sud_items_switch_divider
                if(view4 != null) {
                    view4.setVisibility(v);
                }
                if(z1) {
                    TextView textView1 = (TextView)view0.findViewById(0x7F0B215C);  // id:sud_items_show_more
                    if(textView1 != null) {
                        if(this.f) {
                            textView1.setText(0x7F152B00);  // string:setupservices_google_services_item_button_show_less "Show less"
                        }
                        else {
                            textView1.setText(0x7F152B01);  // string:setupservices_google_services_item_button_show_more "Show more"
                        }
                    }
                    gaji.b(view0.findViewById(0x7F0B2155));  // id:sud_items_expandable_switch_title_container
                }
            }
        }
    }

    @Override  // epdd
    public final int b() {
        return this.u;
    }

    @Override  // epdd
    public final epel h() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grmb.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grnp.a).v_newBuilder();
        grno grno0 = this.p ? grno.b : grno.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((grnp)hftp1.b_message).c = grno0.d;
        ((grnp)hftp1.b_message).b |= 1;
        grnp grnp0 = (grnp)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grmb grmb0 = (grmb)hftp0.b_message;
        grnp0.getClass();
        grmb0.d = grnp0;
        grmb0.b |= 2;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)grmi.a).v_newBuilder();
        epdr epdr0 = this.a;
        if(epdr0 != null) {
            grmf grmf0 = epdr0.d();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grmi grmi0 = (grmi)hftp2.b_message;
            grmf0.getClass();
            grmi0.d = grmf0;
            grmi0.b |= 2;
        }
        epdr epdr1 = this.r;
        if(epdr1 != null) {
            grmf grmf1 = epdr1.d();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grmi grmi1 = (grmi)hftp2.b_message;
            grmf1.getClass();
            grmi1.e = grmf1;
            grmi1.b |= 4;
        }
        epdr epdr2 = this.s;
        if(epdr2 != null) {
            grmf grmf2 = epdr2.d();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            grmi grmi2 = (grmi)hftp2.b_message;
            grmf2.getClass();
            grmi2.f = grmf2;
            grmi2.b |= 8;
        }
        return new epel(((grmb)hftp0.N_build()), ((grmi)hftp2.N_build()));
    }

    @Override  // com.google.android.setupdesign.items.ExpandableSwitchItem
    public final CharSequence i() {
        return this.r == null ? null : this.r.a;
    }

    public final CharSequence j() {
        return this.b == null ? null : this.b.a;
    }

    @Override  // com.google.android.setupdesign.items.Item
    public final CharSequence k() {
        return this.a == null ? null : this.a.a;
    }

    public final void l(epdr epdr0) {
        this.r = epdr0;
        this.n();
    }

    public final void m(epdr epdr0) {
        this.s = epdr0;
        this.n();
    }

    public final void n() {
        epdr epdr0 = this.s;
        if(epdr0 != null) {
            this.A(TextUtils.concat(new CharSequence[]{this.i(), "\n\n", epdr0.a}));
            return;
        }
        this.A(this.i());
    }

    @Override  // gagw
    public final boolean o() {
        return true;
    }

    @Override  // gagw
    public final boolean p() {
        return true;
    }
}

