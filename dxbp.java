import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.divider.MaterialDivider;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class dxbp extends tk {
    public final Context a;
    public final AccessibilityManager e;
    public final List f;
    private final gvcd g;
    private final gvby h;
    private final dsok i;
    private final fhwk j;
    private final fhvw k;
    private final ibts l;
    private final View.OnClickListener m;
    private final clht n;
    private final gged_interceptors o;
    private final boolean p;
    private final dxaj q;
    private final List r;

    public dxbp(Context context0, gvcd gvcd0, gvby gvby0, dsok dsok0, fhwk fhwk0, fhvw fhvw0, ibts ibts0, View.OnClickListener view$OnClickListener0) {
        ibuq.f(gvcd0, "inputForm");
        ibuq.f(dsok0, "imageLoader");
        ibuq.f(fhwk0, "viewVisualElements");
        ibuq.f(fhvw0, "interactionLogger");
        super();
        this.a = context0;
        this.g = gvcd0;
        this.h = gvby0;
        this.i = dsok0;
        this.j = fhwk0;
        this.k = fhvw0;
        this.l = ibts0;
        this.m = view$OnClickListener0;
        Object object0 = context0.getSystemService("accessibility");
        this.e = (object0 instanceof AccessibilityManager) ? ((AccessibilityManager)object0) : null;
        this.n = new clht();
        hfuo hfuo0 = gvcd0.h;
        ibuq.e(hfuo0, "getInputFieldList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: hfuo0) {
            if(((gvcc)object1).e != 0x20) {
                arrayList0.add(object1);
            }
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Object object2: arrayList0) {
            gvcc gvcc0 = (gvcc)object2;
            String s = UUID.randomUUID().toString();
            ibuq.e(s, "toString(...)");
            int v = gvcc0.e;
            String s1 = gvcc0.f;
            ibuq.e(s1, "getLabel(...)");
            String s2 = gvcc0.g;
            ibuq.e(s2, "getValue(...)");
            String s3 = gvcc0.h;
            ibuq.e(s3, "getSuggestedValue(...)");
            gvca gvca0 = gvca.b(gvcc0.i) == null ? gvca.d : gvca.b(gvcc0.i);
            ibuq.e(gvca0, "getFieldPlacement(...)");
            gvcb gvcb0 = gvcb.a(gvcc0.c);
            ibuq.e(gvcb0, "getInputCase(...)");
            gvbh gvbh0 = gvcc0.c == 9 ? ((gvbh)gvcc0.d) : gvbh.a;
            ibuq.e(gvbh0, "getLocalDateInput(...)");
            arrayList1.add(new dxcw(s, v, s1, s2, s3, gvca0, false, false, gvcb0, gvbh0, null, 5056));
        }
        this.o = ggdx.a(arrayList1);
        hfuo hfuo1 = this.g.h;
        ibuq.e(hfuo1, "getInputFieldList(...)");
        boolean z = false;
        if(!(hfuo1 instanceof Collection) || !hfuo1.isEmpty()) {
            for(Object object3: hfuo1) {
                int v1 = ((gvcc)object3).i;
                if((gvca.b(v1) == null ? gvca.d : gvca.b(v1)) == gvca.b || (gvca.b(v1) == null ? gvca.d : gvca.b(v1)) == gvca.c) {
                    z = true;
                    break;
                }
            }
        }
        this.p = z;
        String s4 = this.g.e;
        ibuq.e(s4, "getCardTitle(...)");
        String s5 = this.g.f;
        ibuq.e(s5, "getCardDescription(...)");
        this.q = new dxaj(s4, s5);
        hfuo hfuo2 = this.g.h;
        ibuq.e(hfuo2, "getInputFieldList(...)");
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: hfuo2) {
            if(((gvcc)object4).e == 0x20) {
                arrayList2.add(object4);
            }
        }
        ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList2, 10));
        for(Object object5: arrayList2) {
            String s6 = UUID.randomUUID().toString();
            ibuq.e(s6, "toString(...)");
            int v2 = ((gvcc)object5).e;
            String s7 = ((gvcc)object5).f;
            ibuq.e(s7, "getLabel(...)");
            String s8 = ((gvcc)object5).g;
            ibuq.e(s8, "getValue(...)");
            String s9 = ((gvcc)object5).h;
            ibuq.e(s9, "getSuggestedValue(...)");
            gvca gvca1 = gvca.b(((gvcc)object5).i);
            if(gvca1 == null) {
                gvca1 = gvca.d;
            }
            ibuq.e(gvca1, "getFieldPlacement(...)");
            arrayList3.add(new dxcw(s6, v2, s7, s8, s9, gvca1, true, false, null, null, null, 0x1F80));
        }
        this.f = ibpo.at(arrayList3);
        this.r = new ArrayList();
    }

    public final int G() {
        return this.n() + this.f.size() - 1;
    }

    public final int H() {
        return this.Q() + this.o.size() - 1;
    }

    public final int I() {
        int v8;
        int v = 1;
        List list0 = this.r;
        list0.clear();
        if(this.p || this.O() && this.M()) {
            v = -1;
        }
        gged_interceptors gged0 = this.o;
        int v1 = gged0.size();
        int v2 = 0;
        int v3 = 0;
        int v4 = -1;
        while(v3 < v1) {
            int v5 = this.Q() + v3;
            Object object0 = gged0.get(v3);
            ibuq.e(object0, "get(...)");
            boolean z = this.N(((dxcw)object0));
            if(!hwfk.B()) {
                if(!z) {
                label_20:
                    if(v4 == -1) {
                        v4 = v5;
                    }
                }
            }
            else if(!z) {
                list0.add(((dxcw)gged0.get(v3)).b);
                goto label_20;
            }
            ++v3;
        }
        if(v == -1) {
            v = v4;
        }
        List list1 = this.f;
        int v6 = list1.size();
        int v7 = -1;
        while(v2 < v6) {
            boolean z1 = this.L(((dxcw)list1.get(v2)), v2);
            if(!hwfk.B()) {
                if(!z1) {
                label_36:
                    if(v7 == -1) {
                        v7 = this.n() + v2;
                    }
                }
            }
            else if(!z1) {
                list0.add(((dxcw)list1.get(v2)).b);
                goto label_36;
            }
            ++v2;
        }
        if(hwfk.B()) {
            if(v == -1) {
                if(v7 != -1) {
                    v8 = -1;
                    goto label_47;
                }
                return -1;
            }
            else {
                v8 = v;
            }
        label_47:
            AccessibilityManager accessibilityManager0 = this.e;
            if(accessibilityManager0 != null && accessibilityManager0.isEnabled()) {
                AccessibilityEvent accessibilityEvent0 = new AccessibilityEvent();
                accessibilityEvent0.setEventType(0x4000);
                List list2 = accessibilityEvent0.getText();
                Object[] arr_object = {ibpo.aK(list0, ",", null, null, null, 62)};
                list2.add(this.a.getString(0x7F1522E2, arr_object));  // string:pay_ucp_required_field_missing "Please fill in all the required fields to 
                                                                      // continue. The following fields are missing: %1$s"
                accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
            }
            v = v8;
        }
        return v == -1 ? v7 : v;
    }

    public final gvcd J() {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.g).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.g));
        gvbg gvbg0 = gvbf.a(hftp0);
        gvbg0.c(this.q.a);
        gvbg0.b(this.q.b);
        gvbg0.f();
        gvbg0.e();
        gvbg0.f();
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.o, 10));
        for(Object object0: this.o) {
            gvbe gvbe0 = gvbd.a(((ProtoLiteMessage)gvcc.a).v_newBuilder());
            gvbe0.d(((dxcw)object0).a);
            gvbe0.c(((dxcw)object0).b);
            gvbe0.f(((dxcw)object0).c);
            gvbe0.e(((dxcw)object0).d);
            gvbe0.b(((dxcw)object0).e);
            arrayList0.add(gvbe0.a());
        }
        gvbg0.d(arrayList0);
        gvbg0.f();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: this.f) {
            dxcw dxcw0 = (dxcw)object1;
            if(!ibzk.D(dxcw0.b) && !ibzk.D(dxcw0.c)) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
        for(Object object2: arrayList1) {
            gvbe gvbe1 = gvbd.a(((ProtoLiteMessage)gvcc.a).v_newBuilder());
            gvbe1.d(((dxcw)object2).a);
            gvbe1.c(((dxcw)object2).b);
            gvbe1.f(((dxcw)object2).c);
            gvbe1.e(((dxcw)object2).d);
            gvbe1.b(((dxcw)object2).e);
            arrayList2.add(gvbe1.a());
        }
        gvbg0.d(arrayList2);
        return gvbg0.a();
    }

    public final boolean K() {
        return !this.f.isEmpty();
    }

    public final boolean L(dxcw dxcw0, int v) {
        boolean z2;
        boolean z = ibzk.D(dxcw0.b);
        boolean z1 = ibzk.D(dxcw0.c);
        String s = null;
        String s1 = !z || z1 ? null : "Title required";
        if(z1 && !z) {
            s = "Description required";
        }
        int v1 = dvkx.b();
        if(s1 == null && dxcw0.b.length() > v1) {
            s1 = this.a.getResources().getString(0x7F151DE4, new Object[]{v1});  // string:pay_exceeds_length "Use %1$d characters or fewer"
        }
        if(s == null && dxcw0.c.length() > v1) {
            s = this.a.getResources().getString(0x7F151DE4, new Object[]{v1});  // string:pay_exceeds_length "Use %1$d characters or fewer"
        }
        if(ibuq.m(s1, dxcw0.h)) {
            z2 = false;
        }
        else {
            dxcw0.h = s1;
            z2 = true;
        }
        if(!ibuq.m(s, dxcw0.i)) {
            dxcw0.i = s;
            this.r(this.n() + v);
            return s1 == null && s == null;
        }
        if(z2) {
            this.r(this.n() + v);
        }
        return s1 == null && s == null;
    }

    public final boolean M() {
        dxaj dxaj0 = this.q;
        int v = ibzk.D(dxaj0.b);
        if(hwfk.B() && v != 0) {
            this.r.add("Pass description");
        }
        String s = v == 0 ? null : "Required";
        if(!ibuq.m(s, dxaj0.d)) {
            dxaj0.d = s;
            this.r(1);
        }
        return v ^ 1;
    }

    public final boolean N(dxcw dxcw0) {
        String s = null;
        if(dxcw0.e == gvca.b || dxcw0.e == gvca.c) {
            boolean z = ibzk.D(dxcw0.c);
            this.T(dxcw0, (z ? "Required" : null));
            if(z) {
                return false;
            }
        }
        int v = this.o.indexOf(dxcw0);
        gvcd gvcd0 = this.g;
        if((((gvcc)gvcd0.h.get(v)).b & 0x40) != 0 && ((gvcc)gvcd0.h.get(v)).j > 0) {
            int v1 = ((gvcc)gvcd0.h.get(v)).j;
            boolean z1 = dxcw0.c.length() <= v1;
            if(!z1) {
                s = this.a.getResources().getString(0x7F151DE4, new Object[]{v1});  // string:pay_exceeds_length "Use %1$d characters or fewer"
            }
            this.T(dxcw0, s);
            return z1;
        }
        return true;
    }

    public final boolean O() {
        dxaj dxaj0 = this.q;
        int v = ibzk.D(dxaj0.a);
        if(hwfk.B() && v != 0) {
            this.r.add("Pass title");
        }
        String s = v == 0 ? null : "Required";
        if(!ibuq.m(s, dxaj0.c)) {
            dxaj0.c = s;
            this.r(1);
        }
        return v ^ 1;
    }

    private final int P() {
        return this.h == null ? -1 : 0;
    }

    private final int Q() {
        return this.p ? this.P() + 1 : this.S() + 1;
    }

    private final int R(int v) {
        return v - this.Q();
    }

    private final int S() {
        return this.p ? -1 : this.P() + 1;
    }

    private final void T(dxcw dxcw0, String s) {
        if(!ibuq.m(s, dxcw0.i)) {
            dxcw0.i = s;
            this.r(this.o.indexOf(dxcw0) + this.Q());
        }
    }

    @Override  // tk
    public final int b() {
        int v = (this.K() ? this.Q() + this.o.size() + 1 : this.Q() + this.o.size()) + (this.f.size() + 1);
        return this.l == null ? v : v + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        int v1 = -1;
        if(v == this.P()) {
            return 1;
        }
        if(v == this.S()) {
            return 2;
        }
        if(v <= this.H()) {
            if(!hwuw.c()) {
                return 3;
            }
            Object object0 = this.g.h.get(this.R(v));
            ibuq.e(object0, "get(...)");
            switch(gvcb.a(((gvcc)object0).c).ordinal()) {
                case 0: {
                    return 3;
                }
                case 1: {
                    return 9;
                }
                case 2: {
                    return 8;
                }
                default: {
                    return 3;
                }
            }
        }
        if(v == (this.K() ? this.Q() + this.o.size() : -1)) {
            return 6;
        }
        if(v <= this.G()) {
            return 4;
        }
        if(v == this.f()) {
            return 5;
        }
        if(this.l != null) {
            v1 = -1 + this.b();
        }
        if(v == v1) {
            return 7;
        }
        throw new IllegalArgumentException("Cannot get item view type for invalid position: " + v);
    }

    @Override  // tk
    public final uq dz(ViewGroup viewGroup0, int v) {
        LayoutInflater layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
        switch(v) {
            case 1: {
                View view0 = layoutInflater0.inflate(0x7F0E0D00, viewGroup0, false);  // layout:wallet_enter_user_created_pass_category_info
                ibuq.e(view0, "inflate(...)");
                return new dxab(view0);
            }
            case 2: {
                View view1 = layoutInflater0.inflate(0x7F0E0D06, viewGroup0, false);  // layout:wallet_enter_user_created_pass_name_section
                ibuq.e(view1, "inflate(...)");
                return new dxbi(view1, new dxbk(this), new dxbl(this));
            }
            case 3: {
                View view2 = layoutInflater0.inflate(0x7F0E0D04, viewGroup0, false);  // layout:wallet_enter_user_created_pass_input_field
                ibuq.e(view2, "inflate(...)");
                return new dxbc(view2, this.n);
            }
            case 4: {
                View view3 = layoutInflater0.inflate(0x7F0E0D01, viewGroup0, false);  // layout:wallet_enter_user_created_pass_custom_field
                ibuq.e(view3, "inflate(...)");
                dxbm dxbm0 = new dxbm(this);
                dxbn dxbn0 = new dxbn(this);
                return new dxay(view3, this.k, dxbm0, dxbn0);
            }
            case 5: {
                View view4 = layoutInflater0.inflate(0x7F0E0CFF, viewGroup0, false);  // layout:wallet_enter_user_created_pass_add_custom_field_button
                ibuq.e(view4, "inflate(...)");
                dxbo dxbo0 = new dxbo(this);
                return new dxao(view4, this.k, this.n, dxbo0);
            }
            case 6: {
                View view5 = layoutInflater0.inflate(0x7F0E0D02, viewGroup0, false);  // layout:wallet_enter_user_created_pass_custom_field_divider
                ibuq.e(view5, "inflate(...)");
                ibuq.f(view5, "itemView");
                return new uq(view5);
            }
            case 7: {
                if(this.l == null) {
                    throw new IllegalArgumentException("disclaimer template is null.");
                }
                View view6 = layoutInflater0.inflate(0x7F0E0D07, viewGroup0, false);  // layout:wallet_enter_user_created_pass_page_disclaimer
                ibuq.e(view6, "inflate(...)");
                return new dxbd(view6);
            }
            case 8: 
            case 9: {
                View view7 = layoutInflater0.inflate(0x7F0E0D03, viewGroup0, false);  // layout:wallet_enter_user_created_pass_date_time_input_field
                ibuq.e(view7, "inflate(...)");
                return new dxac(view7);
            }
            default: {
                throw new IllegalArgumentException("Unknown view type: " + v);
            }
        }
    }

    public final int f() {
        return this.l == null ? this.b() - 1 : this.b() - 2;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        boolean z3;
        ibuq.f(uq0, "viewHolder");
        if((uq0 instanceof dxab)) {
            gvby gvby0 = this.h;
            if(gvby0 == null) {
                throw new IllegalArgumentException("Missing CategoryInfo");
            }
            ((dxab)uq0).D(this.a, this.j, gvby0, this.i, this.m);
            return;
        }
        boolean z = true;
        int v1 = 8;
        boolean z1 = false;
        if((uq0 instanceof dxbi)) {
            ((dxbi)uq0).y = this.q;
            ((dxbi)uq0).v.setText(this.q.a);
            ((dxbi)uq0).t.H(this.q.c);
            ((dxbi)uq0).w.setText(this.q.b);
            ((dxbi)uq0).u.H(this.q.d);
            MaterialDivider materialDivider0 = ((dxbi)uq0).x;
            if(this.o.size() != 0) {
                v1 = 0;
            }
            materialDivider0.setVisibility(v1);
            return;
        }
        if((uq0 instanceof dxac)) {
            Object object0 = this.o.get(this.R(v));
            ibuq.e(object0, "get(...)");
            ((dxac)uq0).D(((dxcw)object0));
            return;
        }
        if((uq0 instanceof dxbc)) {
            Object object1 = this.o.get(this.R(v));
            ibuq.e(object1, "get(...)");
            String s = "Required";
            ibuq.e("Required", "getString(...)");
            dxbj dxbj0 = new dxbj(this);
            boolean z2 = !this.K() && v == this.H();
            ibuq.f(((dxcw)object1), "ucpInputItem");
            ibuq.f("Required", "payRequiredString");
            ((dxbc)uq0).y = (dxcw)object1;
            TextInputLayout textInputLayout0 = ((dxbc)uq0).w;
            textInputLayout0.P(((dxcw)object1).b);
            EditText editText0 = ((dxbc)uq0).x;
            editText0.setText(((dxcw)object1).c);
            dxcw dxcw0 = ((dxbc)uq0).y;
            dxcw dxcw1 = null;
            if(dxcw0 == null) {
                ibuq.j("ucpInputItem");
                dxcw0 = null;
            }
            if(dxcw0.e == gvca.b) {
                z3 = true;
            }
            else {
                dxcw dxcw2 = ((dxbc)uq0).y;
                if(dxcw2 == null) {
                    ibuq.j("ucpInputItem");
                    dxcw2 = null;
                }
                z3 = dxcw2.e == gvca.c;
            }
            ((dxbc)uq0).A = z3;
            textInputLayout0.N(z3);
            if(!((dxbc)uq0).A) {
                s = null;
            }
            textInputLayout0.L(s);
            dxcw dxcw3 = ((dxbc)uq0).y;
            if(dxcw3 == null) {
                ibuq.j("ucpInputItem");
                dxcw3 = null;
            }
            if(dxcw3.i != null) {
                z1 = true;
            }
            ((dxbc)uq0).z = z1;
            textInputLayout0.I(z1);
            dxcw dxcw4 = ((dxbc)uq0).y;
            if(dxcw4 == null) {
                ibuq.j("ucpInputItem");
            }
            else {
                dxcw1 = dxcw4;
            }
            textInputLayout0.H(dxcw1.i);
            LinearLayout linearLayout0 = ((dxbc)uq0).v;
            linearLayout0.setAccessibilityLiveRegion(((int)((dxbc)uq0).z));
            if(hwfk.av()) {
                edne.a(editText0, z2);
            }
            editText0.setOnFocusChangeListener(new dxba(((dxbc)uq0), dxbj0, ((dxcw)object1)));
            if(hwfk.j()) {
                StringBuilder stringBuilder0 = new StringBuilder();
                Resources resources0 = ((dxbc)uq0).u;
                String s1 = resources0.getString(0x7F1522D6, new Object[]{((dxbc)uq0).E(), (ibzk.D(((dxbc)uq0).D()) ? "Is empty" : resources0.getString(0x7F1522D9, new Object[]{((dxbc)uq0).D()}))});  // string:pay_ucp_edit_form_field_content_description "Field label %1$s %2$s,"
                ibuq.e(s1, "getString(...)");
                stringBuilder0.append(s1);
                if(((dxbc)uq0).z) {
                    String s2 = resources0.getString(0x7F1522D5, new Object[]{(((dxbc)uq0).D().length() == 0 ? resources0.getString(0x7F1522DB, new Object[]{((dxbc)uq0).E()}) : String.valueOf(textInputLayout0.m()))});  // string:pay_ucp_edit_form_error_message_content_description "Error: %s"
                    ibuq.e(s2, "getString(...)");
                    stringBuilder0.append(s2);
                }
                else if(((dxbc)uq0).A) {
                    stringBuilder0.append(String.valueOf(textInputLayout0.n()));
                }
                linearLayout0.setContentDescription(stringBuilder0.toString());
            }
        }
        else {
            if((uq0 instanceof dxay)) {
                fhwk fhwk0 = this.j;
                int v2 = v - this.n();
                dxcw dxcw5 = (dxcw)this.f.get(v2);
                boolean z4 = v == this.G();
                ibuq.f(fhwk0, "viewVisualElements");
                ibuq.f(dxcw5, "ucpInputItem");
                ((dxay)uq0).C = dxcw5;
                if(dxcw5.f) {
                    ((dxay)uq0).u.setVisibility(8);
                    ((dxay)uq0).v.setVisibility(8);
                    ((dxay)uq0).A.setVisibility(0);
                    ((dxay)uq0).A.P(dxcw5.b);
                    ((dxay)uq0).B.setText(dxcw5.c);
                }
                else {
                    ((dxay)uq0).u.setVisibility(0);
                    ((dxay)uq0).v.setVisibility(0);
                    ((dxay)uq0).A.setVisibility(8);
                    EditText editText1 = ((dxay)uq0).x;
                    editText1.setText(dxcw5.b);
                    ((dxay)uq0).w.I(dxcw5.h != null);
                    ((dxay)uq0).w.H(dxcw5.h);
                    EditText editText2 = ((dxay)uq0).z;
                    editText2.setText(dxcw5.c);
                    if(hwfk.av()) {
                        edne.a(editText2, z4);
                    }
                    TextInputLayout textInputLayout1 = ((dxay)uq0).y;
                    if(dxcw5.i == null) {
                        z = false;
                    }
                    textInputLayout1.I(z);
                    textInputLayout1.H(dxcw5.i);
                    if(dxcw5.g) {
                        editText1.requestFocus();
                        if(hwfk.A()) {
                            editText1.postDelayed(new dxap(((dxay)uq0)), 500L);
                        }
                        dxcw5.g = false;
                    }
                }
                fhvo fhvo0 = fhwk0.a.a(219409);
                fhwk0.g(((dxay)uq0).t, fhvo0);
                return;
            }
            if((uq0 instanceof dxao)) {
                fhwk fhwk1 = this.j;
                int v3 = this.f.size();
                int v4 = dvkx.a();
                if(v3 >= v4) {
                    z = false;
                }
                ibuq.f(fhwk1, "viewVisualElements");
                Button button0 = ((dxao)uq0).t;
                button0.setEnabled(z);
                TextView textView0 = ((dxao)uq0).u;
                if(v3 >= v4) {
                    v1 = 0;
                }
                textView0.setVisibility(v1);
                fhwk1.g(button0, fhwk1.a.a(0x35910));
                return;
            }
            if((uq0 instanceof dxbd)) {
                ibts ibts0 = this.l;
                if(ibts0 == null) {
                    throw new IllegalArgumentException("Missing disclaimer template");
                }
                ibts0.a(((dxbd)uq0).t);
            }
        }
    }

    @Override  // tk
    public final void l(uq uq0) {
        ibuq.f(uq0, "viewHolder");
        if((uq0 instanceof dxab)) {
            ((dxab)uq0).E(this.j);
            return;
        }
        if((uq0 instanceof dxay)) {
            ibuq.f(this.j, "viewVisualElements");
            this.j.d(((dxay)uq0).t);
            return;
        }
        if((uq0 instanceof dxao)) {
            ibuq.f(this.j, "viewVisualElements");
            this.j.d(((dxao)uq0).t);
        }
    }

    public final int n() {
        int v = this.Q() + this.o.size();
        return this.K() ? v + 1 : v;
    }
}

