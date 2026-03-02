import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.Arrays;

public final class acdc extends accz {
    public final ArrayList f;
    public int g;
    private static final int[][] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static ColorStateList m;
    private static ColorStateList n;
    private static ColorStateList o;
    private static ColorStateList p;
    private final SparseIntArray q;
    private final ArrayList r;

    static {
        acdc.h = new int[][]{new int[]{0x10100A1}, new int[0]};
        acdc.i = new int[2];
        acdc.j = new int[2];
        acdc.k = new int[2];
        acdc.l = new int[2];
    }

    public acdc() {
        this.f = new ArrayList();
        this.g = -1;
        this.q = new SparseIntArray();
        this.r = new ArrayList();
        this.B(true);
    }

    @Override  // accz
    public final CharSequence G() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            CharSequence charSequence0 = ((accz)arrayList0.get(v)).G();
            if(charSequence0 != null) {
                return charSequence0;
            }
        }
        return null;
    }

    @Override  // accz
    public final void H() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).H();
        }
    }

    @Override  // accz
    public final void I(ContactPerson contactPerson0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).I(contactPerson0);
        }
    }

    @Override  // accz
    public final void J(ContactPerson contactPerson0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).J(contactPerson0);
        }
    }

    @Override  // accz
    public final void K(ContactPerson contactPerson0, int v) {
        for(int v1 = 0; true; ++v1) {
            ArrayList arrayList0 = this.f;
            if(v1 >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v1)).K(contactPerson0, v);
        }
    }

    @Override  // accz
    protected final void L() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).Q(this.e);
        }
    }

    @Override  // accz
    public final void M(boolean z) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).T(z);
        }
    }

    @Override  // accz
    public final void N(boolean z) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).N(z);
        }
    }

    @Override  // accz
    public final void O(boolean z) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).O(z);
        }
    }

    @Override  // accz
    public final void P(boolean z) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).P(z);
        }
    }

    @Override  // accz
    public final void R(CharSequence charSequence0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).R(charSequence0);
        }
    }

    @Override  // accz
    public final void S(CharSequence charSequence0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).S(charSequence0);
        }
    }

    @Override  // accz
    public final void U(CharSequence charSequence0) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).U(charSequence0);
        }
    }

    @Override  // accz
    public final void V(boolean z) {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            ((accz)arrayList0.get(v)).V(z);
        }
    }

    public final int W() {
        return this.g < 0 ? 0x7FFFFFFF : this.Y(this.g);
    }

    public final int X(int v) {
        return (int)(((Integer)this.r.get(v)));
    }

    public final int Y(int v) {
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((accz)this.f.get(v1)).b();
        }
        return v2;
    }

    public final void Z(RecyclerView recyclerView0) {
        int v = this.b();
        if(this.r.size() != v) {
            this.aa(recyclerView0);
        }
    }

    public final void aa(RecyclerView recyclerView0) {
        ArrayList arrayList0 = this.r;
        arrayList0.clear();
        tx tx0 = recyclerView0.n;
        int v = 0;
        if((tx0 instanceof GridLayoutManager)) {
            sa sa0 = ((GridLayoutManager)tx0).g;
            int v1 = ((GridLayoutManager)tx0).b;
            int v2 = 0;
            while(v < this.b()) {
                if(sa0.a(v, v1) == 0) {
                    v2 += this.ad(recyclerView0, v);
                }
                arrayList0.add(Integer.valueOf(v2));
                ++v;
            }
            return;
        }
        int v3 = 0;
        while(v < this.b()) {
            v3 += this.ad(recyclerView0, v);
            arrayList0.add(Integer.valueOf(v3));
            ++v;
        }
    }

    static void ab(acea acea0, ContactPerson contactPerson0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, SparseIntArray sparseIntArray0, SparseIntArray sparseIntArray1, int v) {
        int v16;
        int v13;
        String s5;
        int v12;
        boolean z5;
        int v10;
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        String s4;
        String s3;
        int v3;
        String s2;
        int v1 = acea0.f;
        int v2 = z1 ? acdc.ac(v) : v;
        View view0 = acea0.a;
        Context context0 = view0.getContext();
        Resources resources0 = view0.getResources();
        ContactPerson.ContactMethod contactPerson$ContactMethod0 = contactPerson0.a();
        String s = acfd.a(context0, contactPerson0);
        String s1 = s == null ? "" : s;
        TextView textView0 = acea0.A;
        textView0.setText(s);
        TextView textView1 = acea0.B;
        if(!z) {
            s2 = s1;
            v3 = z1 ? 0 : 1;
        label_26:
            if(textView1 != null) {
                textView1.setVisibility(8);
            }
            textView0.setVisibility(0);
            if(1 == v3) {
                acdc.i[1] = resources0.getColor(0x7F060042);  // color:appinvite_dark_black
                ColorStateList colorStateList1 = acdc.ag(acdc.m, acdc.i, v2);
                acdc.m = colorStateList1;
                textView0.setTextColor(colorStateList1);
            }
            else {
                acdc.j[1] = acdc.ac(resources0.getColor(0x7F060042));  // color:appinvite_dark_black
                ColorStateList colorStateList0 = acdc.ag(acdc.n, acdc.j, v2);
                acdc.n = colorStateList0;
                textView0.setTextColor(colorStateList0);
            }
        }
        else if(textView1 != null) {
            s2 = s1;
            textView0.setVisibility(8);
            textView1.setVisibility(0);
            textView1.setText(s);
        }
        else {
            s2 = s1;
            v3 = z1 ? 0 : 1;
            goto label_26;
        }
        ehjb ehjb0 = acea0.w;
        ehjb0.b(s);
        acfa.b(ehjb0, contactPerson0, contactPerson$ContactMethod0, z2);
        if(v1 == 0x7F0E009D) {  // layout:appinvite_contextual_selection_list_item
            ehjb0.setVisibility((z ? 8 : 0));
        }
        else {
            View view1 = acea0.v;
            if(view1 != null) {
                view1.setBackgroundDrawable((z ? acfj.a(context0, 0x7F0801F6, v2, false) : null));  // drawable:appinvite_avatar_highlight
            }
        }
        if(contactPerson$ContactMethod0 == null) {
            v8 = 0;
            z5 = false;
            s3 = null;
            v9 = 0;
            s4 = null;
            v10 = 0;
        }
        else {
            int v4 = contactPerson$ContactMethod0.a;
            switch(v4) {
                case 0: {
                    v5 = 0x7F080202;  // drawable:appinvite_ic_notifications_black_36_crop
                    v6 = 0x7F080D96;
                    s3 = null;
                    s4 = null;
                    v7 = 0;
                    break;
                }
                case 1: {
                    s3 = contactPerson$ContactMethod0.b;
                    v5 = 0x7F080200;  // drawable:appinvite_ic_email_black_36_crop
                    v6 = 0x7F080D11;
                    v7 = 0x7F15019B;  // string:appinvite_contextual_selection_content_description_email "Email"
                    s4 = null;
                    break;
                }
                case 2: {
                    s3 = contactPerson$ContactMethod0.b;
                    s4 = PhoneNumberUtils.formatNumber(s3);
                    v7 = 0x7F15019C;  // string:appinvite_contextual_selection_content_description_sms "Text message"
                    v5 = 0x7F080201;  // drawable:appinvite_ic_message_black_36_crop
                    v6 = 0x7F080D7B;
                    break;
                }
                default: {
                    s3 = null;
                    s4 = null;
                    v5 = 0;
                    v6 = 0;
                    v7 = 0;
                }
            }
            if(sparseIntArray0 != null && sparseIntArray0.indexOfKey(v4) >= 0) {
                v8 = sparseIntArray0.get(v4);
                v9 = sparseIntArray1 == null ? v5 : sparseIntArray1.get(v4);
                v10 = v7;
                z5 = true;
            }
            else {
                v9 = v5;
                v8 = v6;
                v10 = v7;
                z5 = false;
            }
        }
        int v11 = v1 == 0x7F0E009B ? 1 : 0;  // layout:appinvite_contextual_selection_grid_item
        View view2 = acea0.x;
        if(view2 == null) {
            v12 = v11;
            s5 = s4;
            v13 = 8;
        }
        else if(z) {
            v12 = v11;
            view2.setVisibility(0);
            view2.setBackgroundResource(0x7F0801F8);  // drawable:appinvite_contextual_selection_check_background
            ImageView imageView0 = acea0.y;
            if(imageView0 == null) {
                s5 = s4;
            }
            else if(v12 != 0 && !z4) {
                Drawable drawable0 = acfj.a(context0, v8, resources0.getColor(0x7F060BFF), z5);  // color:material_grey_white_1000
                if(drawable0 == null) {
                    s5 = s4;
                    imageView0.setImageResource(0x7F080CCC);
                }
                else {
                    s5 = s4;
                    imageView0.setImageDrawable(drawable0);
                }
            }
            else {
                s5 = s4;
                imageView0.setImageResource(0x7F080CCC);
            }
            v13 = 8;
        }
        else {
            v12 = v11;
            s5 = s4;
            v13 = 8;
            view2.setVisibility(8);
        }
        View view3 = acea0.E;
        if(view3 != null) {
            if(z1) {
                v13 = 0;
            }
            view3.setVisibility(v13);
        }
        TextView textView2 = acea0.F;
        if(textView2 != null) {
            textView2.setText(s3);
            textView2.setVisibility((TextUtils.isEmpty(s3) ? 8 : 0));
            if(z1) {
                acdc.l[1] = acdc.ac(resources0.getColor(0x7F06004C));  // color:appinvite_medium_black
                ColorStateList colorStateList2 = acdc.ag(acdc.p, acdc.l, v2);
                acdc.p = colorStateList2;
                textView2.setTextColor(colorStateList2);
            }
            else {
                acdc.k[1] = resources0.getColor(0x7F06004C);  // color:appinvite_medium_black
                ColorStateList colorStateList3 = acdc.ag(acdc.o, acdc.k, v2);
                acdc.o = colorStateList3;
                textView2.setTextColor(colorStateList3);
            }
        }
        if(!z) {
            v2 = z1 ? acdc.ac(resources0.getColor(0x7F060BF9)) : resources0.getColor(0x7F060BF9);  // color:material_grey_600
        }
        ImageView imageView1 = acea0.z;
        if(imageView1 == null) {
            Drawable drawable2 = z4 ? null : acfj.a(context0, v8, v2, z5);
            if(drawable2 != null) {
                int v14 = resources0.getDimensionPixelSize(0x7F07012E);  // dimen:appinvite_chip_method
                drawable2.setBounds(0, 0, v14, v14);
            }
            textView0.setCompoundDrawablesRelative(null, null, drawable2, null);
        }
        else {
            Drawable drawable1 = z4 ? null : acfj.a(context0, v9, v2, z5);
            imageView1.setImageDrawable(drawable1);
            if(v12 != 0) {
                imageView1.setVisibility((z || drawable1 == null ? 8 : 0));
            }
        }
        String s6 = v10 == 0 ? s2 : s2 + " " + resources0.getString(v10);
        int v15 = 4;
        ImageView imageView2 = acea0.D;
        if(imageView2 == null) {
            v16 = 0;
        }
        else {
            if(z3 && contactPerson0.e.size() > 1) {
                v15 = 0;
            }
            imageView2.setVisibility(v15);
            v16 = 0;
            imageView2.setImageDrawable(acfj.a(context0, 0x7F080C8C, v2, false));
        }
        View view4 = acea0.C;
        if(view4 != null) {
            if(z4 || contactPerson0.e.isEmpty()) {
                v16 = 8;
            }
            view4.setVisibility(v16);
            view4.setContentDescription(s + ", " + "Contact method selector");
        }
        View view5 = acea0.u;
        if(view5 != null) {
            if(s5 != null) {
                s6 = a.r(s5, s6, " ");
            }
            else if(s3 != null) {
                s6 = a.r(s3, s6, " ");
            }
            view5.setContentDescription(s6);
        }
    }

    private static int ac(int v) {
        return jxm.e(v, -1, 0.3f);
    }

    private final int ad(ViewGroup viewGroup0, int v) {
        SparseIntArray sparseIntArray0 = this.q;
        int v1 = this.dx(v);
        int v2 = sparseIntArray0.get(v1, -1);
        if(v2 >= 0) {
            return v2;
        }
        uq uq0 = this.dz(viewGroup0, v1);
        if(uq0.fq() == -1) {
            uq0.a.measure(0, 0);
        }
        int v3 = uq0.a.getMeasuredHeight();
        sparseIntArray0.put(v1, v3);
        return v3;
    }

    private final int ae(int v) {
        ArrayList arrayList0;
        int v2 = 0;
        for(int v1 = 1; true; ++v1) {
            arrayList0 = this.f;
            if(v1 >= arrayList0.size()) {
                break;
            }
            v2 += ((accz)arrayList0.get(v1 - 1)).b();
            if(v < v2) {
                return v1 - 1;
            }
        }
        return arrayList0.size() - 1;
    }

    private final int af(int v, int v1) {
        return v1 - this.Y(v);
    }

    private static ColorStateList ag(ColorStateList colorStateList0, int[] arr_v, int v) {
        if(arr_v[0] == v && colorStateList0 != null) {
            return colorStateList0;
        }
        arr_v[0] = v;
        return new ColorStateList(acdc.h, arr_v);
    }

    @Override  // tk
    public final int b() {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            v1 += ((accz)arrayList0.get(v)).b();
        }
        return v1;
    }

    @Override  // tk
    public final int dx(int v) {
        int v1 = this.ae(v);
        return ((accz)this.f.get(v1)).dx(this.af(v1, v));
    }

    @Override  // tk
    public final long dy(int v) {
        int v1 = this.ae(v);
        return ((accz)this.f.get(v1)).dy(this.af(v1, v)) & 0xFFFFFFFFL | ((long)v1) << 0x20;
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(v, viewGroup0, false);
        if(v == 0x7F0E009F) {  // layout:appinvite_contextual_selection_recipients
            return new aced(view0);
        }
        switch(v) {
            case 0x7F0E0095: {  // layout:appinvite_anchor
                return new uq(view0);
            }
            case 0x7F0E0099: {  // layout:appinvite_contextual_selection_chip
                return new acdz(view0);
            }
            case 0x7F0E009B:   // layout:appinvite_contextual_selection_grid_item
            case 0x7F0E009D: {  // layout:appinvite_contextual_selection_list_item
                return new acea(view0);
            }
            case 0x7F0E00A0: {  // layout:appinvite_contextual_selection_search
                return new acec(view0);
            }
            case 0x7F0E009C:   // layout:appinvite_contextual_selection_header_text
            case 0x7F0E00A2: {  // layout:appinvite_contextual_selection_sub_header_text
                return new acee(view0);
            }
            default: {
                for(int v1 = 0; true; ++v1) {
                    ArrayList arrayList0 = this.f;
                    if(v1 >= arrayList0.size()) {
                        break;
                    }
                    uq uq0 = ((accz)arrayList0.get(v1)).dz(viewGroup0, v);
                    if(uq0 != null) {
                        return uq0;
                    }
                }
                return null;
            }
        }
    }

    @Override  // accz
    public final int f() {
        int v1 = 0;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.f;
            if(v >= arrayList0.size()) {
                break;
            }
            v1 += ((accz)arrayList0.get(v)).f();
        }
        return v1;
    }

    @Override  // android.widget.SectionIndexer
    public final int getPositionForSection(int v) {
        int v1 = 0;
        for(int v2 = 0; true; v2 = v3) {
            ArrayList arrayList0 = this.f;
            if(v1 >= arrayList0.size()) {
                break;
            }
            int v3 = ((accz)arrayList0.get(v1)).f() + v2;
            if(v < v3) {
                return this.Y(v1) + ((accz)arrayList0.get(v1)).getPositionForSection(v - v2);
            }
            ++v1;
        }
        return 0;
    }

    @Override  // android.widget.SectionIndexer
    public final int getSectionForPosition(int v) {
        int v1 = this.ae(v);
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += ((accz)this.f.get(v2)).f();
        }
        return v3 + ((accz)this.f.get(v1)).getSectionForPosition(v - this.Y(v1));
    }

    @Override  // android.widget.SectionIndexer
    public final Object[] getSections() {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; true; ++v) {
            ArrayList arrayList1 = this.f;
            if(v >= arrayList1.size()) {
                break;
            }
            accz accz0 = (accz)arrayList1.get(v);
            if(accz0.f() > 0) {
                arrayList0.addAll(Arrays.asList(accz0.getSections()));
            }
        }
        return arrayList0.toArray();
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        int v1 = this.ae(v);
        ((accz)this.f.get(v1)).h(uq0, this.af(v1, v));
    }

    @Override  // tk
    public final void l(uq uq0) {
        if((uq0 instanceof acea)) {
            ehjb ehjb0 = ((acea)uq0).w;
            if(ehjb0 != null) {
                ehjb0.a();
            }
        }
    }

    @Override  // accz
    public final int n(int v) {
        int v1 = this.ae(v);
        return ((accz)this.f.get(v1)).n(this.af(v1, v));
    }
}

