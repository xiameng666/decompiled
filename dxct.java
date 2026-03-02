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
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class dxct extends tk {
    public final Context a;
    public final AccessibilityManager e;
    public List f;
    private final dsok g;
    private final fhwk h;
    private final fhvw i;
    private gvcd j;
    private View.OnClickListener k;
    private gged_interceptors l;
    private dxaj m;
    private final clht n;
    private gvby o;
    private ibts p;
    private boolean q;
    private final List r;

    public dxct(Context context0, dsok dsok0, fhwk fhwk0, fhvw fhvw0) {
        ibuq.f(context0, "context");
        ibuq.f(dsok0, "imageLoader");
        ibuq.f(fhwk0, "viewVisualElements");
        ibuq.f(fhvw0, "interactionLogger");
        super();
        this.a = context0;
        this.g = dsok0;
        this.h = fhwk0;
        this.i = fhvw0;
        Object object0 = context0.getSystemService("accessibility");
        this.e = (object0 instanceof AccessibilityManager) ? ((AccessibilityManager)object0) : null;
        this.n = new clht();
        this.r = new ArrayList();
    }

    public final int G() {
        int v = this.n();
        List list0 = this.f;
        if(list0 == null) {
            ibuq.j("customFieldList");
            list0 = null;
        }
        return v + list0.size() - 1;
    }

    public final int H() {
        int v = this.R();
        gged_interceptors gged0 = this.l;
        if(gged0 == null) {
            ibuq.j("inputFieldsEditTextList");
            gged0 = null;
        }
        return v + gged0.size() - 1;
    }

    public final int I() {
        int v8;
        int v = 1;
        List list0 = this.r;
        list0.clear();
        if(this.q || this.P() && this.N()) {
            v = -1;
        }
        gged_interceptors gged0 = this.l;
        if(gged0 == null) {
            ibuq.j("inputFieldsEditTextList");
            gged0 = null;
        }
        int v1 = gged0.size();
        int v2 = 0;
        int v3 = 0;
        int v4 = -1;
        while(v3 < v1) {
            int v5 = this.R() + v3;
            gged_interceptors gged1 = this.l;
            if(gged1 == null) {
                ibuq.j("inputFieldsEditTextList");
                gged1 = null;
            }
            Object object0 = gged1.get(v3);
            ibuq.e(object0, "get(...)");
            boolean z = this.O(((dxcw)object0));
            if(!hwfk.B()) {
                if(!z) {
                label_31:
                    if(v4 == -1) {
                        v4 = v5;
                    }
                }
            }
            else if(!z) {
                gged_interceptors gged2 = this.l;
                if(gged2 == null) {
                    ibuq.j("inputFieldsEditTextList");
                    gged2 = null;
                }
                list0.add(((dxcw)gged2.get(v3)).b);
                goto label_31;
            }
            ++v3;
        }
        if(v == -1) {
            v = v4;
        }
        List list1 = this.f;
        if(list1 == null) {
            ibuq.j("customFieldList");
            list1 = null;
        }
        int v6 = list1.size();
        int v7 = -1;
        while(v2 < v6) {
            List list2 = this.f;
            if(list2 == null) {
                ibuq.j("customFieldList");
                list2 = null;
            }
            boolean z1 = this.M(((dxcw)list2.get(v2)), v2);
            if(!hwfk.B()) {
                if(!z1) {
                label_58:
                    if(v7 == -1) {
                        v7 = this.n() + v2;
                    }
                }
            }
            else if(!z1) {
                List list3 = this.f;
                if(list3 == null) {
                    ibuq.j("customFieldList");
                    list3 = null;
                }
                list0.add(((dxcw)list3.get(v2)).b);
                goto label_58;
            }
            ++v2;
        }
        if(hwfk.B()) {
            if(v == -1) {
                if(v7 != -1) {
                    v8 = -1;
                    goto label_69;
                }
                return -1;
            }
            else {
                v8 = v;
            }
        label_69:
            AccessibilityManager accessibilityManager0 = this.e;
            if(accessibilityManager0 != null && accessibilityManager0.isEnabled()) {
                AccessibilityEvent accessibilityEvent0 = new AccessibilityEvent();
                accessibilityEvent0.setEventType(0x4000);
                Object[] arr_object = {ibpo.aK(list0, ",", null, null, null, 62)};
                this.a.getString(0x7F1522E2, arr_object);  // string:pay_ucp_required_field_missing "Please fill in all the required fields to 
                                                           // continue. The following fields are missing: %1$s"
                accessibilityManager0.sendAccessibilityEvent(accessibilityEvent0);
            }
            v = v8;
        }
        return v == -1 ? v7 : v;
    }

    public final gvcd J() {
        gvcd gvcd0 = this.j;
        List list0 = null;
        if(gvcd0 == null) {
            ibuq.j("inputForm");
            gvcd0 = null;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gvcd0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gvcd0));
        gvbg gvbg0 = gvbf.a(hftp0);
        dxaj dxaj0 = this.m;
        if(dxaj0 == null) {
            ibuq.j("passNameAndDescription");
            dxaj0 = null;
        }
        gvbg0.c(dxaj0.a);
        dxaj dxaj1 = this.m;
        if(dxaj1 == null) {
            ibuq.j("passNameAndDescription");
            dxaj1 = null;
        }
        gvbg0.b(dxaj1.b);
        gvbg0.f();
        gvbg0.e();
        gvbg0.f();
        gged_interceptors gged0 = this.l;
        if(gged0 == null) {
            ibuq.j("inputFieldsEditTextList");
            gged0 = null;
        }
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        for(Object object0: gged0) {
            ibuq.c(((dxcw)object0));
            arrayList0.add(dxct.V(((dxcw)object0)));
        }
        gvbg0.d(arrayList0);
        gvbg0.f();
        List list1 = this.f;
        if(list1 == null) {
            ibuq.j("customFieldList");
        }
        else {
            list0 = list1;
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: list0) {
            dxcw dxcw0 = (dxcw)object1;
            if(!ibzk.D(dxcw0.b) && !ibzk.D(dxcw0.c)) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList(ibpo.q(arrayList1, 10));
        for(Object object2: arrayList1) {
            arrayList2.add(dxct.V(((dxcw)object2)));
        }
        gvbg0.d(arrayList2);
        return gvbg0.a();
    }

    public final void K(gvcd gvcd0, gvby gvby0, View.OnClickListener view$OnClickListener0, ibts ibts0) {
        ibuq.f(gvcd0, "inputForm");
        this.j = gvcd0;
        this.o = gvby0;
        this.k = view$OnClickListener0;
        this.p = ibts0;
        hfuo hfuo0 = gvcd0.h;
        ibuq.e(hfuo0, "getInputFieldList(...)");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: hfuo0) {
            if(((gvcc)object0).e != 0x20) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(ibpo.q(arrayList0, 10));
        for(Iterator iterator1 = arrayList0.iterator(); iterator1.hasNext(); iterator1 = iterator1) {
            Object object1 = iterator1.next();
            gvcc gvcc0 = (gvcc)object1;
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
            gvbj gvbj0 = gvcc0.c == 10 ? ((gvbj)gvcc0.d) : gvbj.a;
            ibuq.e(gvbj0, "getLocalTimeInput(...)");
            arrayList1.add(new dxcw(s, v, s1, s2, s3, gvca0, false, false, gvcb0, gvbh0, gvbj0, 960));
        }
        this.l = ggdx.a(arrayList1);
        hfuo hfuo1 = gvcd0.h;
        ibuq.e(hfuo1, "getInputFieldList(...)");
        boolean z = false;
        if(!(hfuo1 instanceof Collection) || !hfuo1.isEmpty()) {
            for(Object object2: hfuo1) {
                int v1 = ((gvcc)object2).i;
                if((gvca.b(v1) == null ? gvca.d : gvca.b(v1)) == gvca.b || (gvca.b(v1) == null ? gvca.d : gvca.b(v1)) == gvca.c) {
                    z = true;
                    break;
                }
            }
        }
        this.q = z;
        String s4 = gvcd0.e;
        ibuq.e(s4, "getCardTitle(...)");
        String s5 = gvcd0.f;
        ibuq.e(s5, "getCardDescription(...)");
        this.m = new dxaj(s4, s5);
        hfuo hfuo2 = gvcd0.h;
        ibuq.e(hfuo2, "getInputFieldList(...)");
        ArrayList arrayList2 = new ArrayList();
        for(Object object3: hfuo2) {
            if(((gvcc)object3).e == 0x20) {
                arrayList2.add(object3);
            }
        }
        ArrayList arrayList3 = new ArrayList(ibpo.q(arrayList2, 10));
        for(Iterator iterator4 = arrayList2.iterator(); iterator4.hasNext(); iterator4 = iterator4) {
            Object object4 = iterator4.next();
            gvcc gvcc1 = (gvcc)object4;
            String s6 = UUID.randomUUID().toString();
            ibuq.e(s6, "toString(...)");
            int v2 = gvcc1.e;
            String s7 = gvcc1.f;
            ibuq.e(s7, "getLabel(...)");
            String s8 = gvcc1.g;
            ibuq.e(s8, "getValue(...)");
            String s9 = gvcc1.h;
            ibuq.e(s9, "getSuggestedValue(...)");
            gvca gvca1 = gvca.b(gvcc1.i) == null ? gvca.d : gvca.b(gvcc1.i);
            ibuq.e(gvca1, "getFieldPlacement(...)");
            gvcb gvcb1 = gvcb.a(gvcc1.c);
            ibuq.e(gvcb1, "getInputCase(...)");
            gvbh gvbh1 = gvcc1.c == 9 ? ((gvbh)gvcc1.d) : gvbh.a;
            ibuq.e(gvbh1, "getLocalDateInput(...)");
            gvbj gvbj1 = gvcc1.c == 10 ? ((gvbj)gvcc1.d) : gvbj.a;
            ibuq.e(gvbj1, "getLocalTimeInput(...)");
            arrayList3.add(new dxcw(s6, v2, s7, s8, s9, gvca1, true, false, gvcb1, gvbh1, gvbj1, 0x380));
        }
        this.f = ibpo.at(arrayList3);
    }

    public final boolean L() {
        List list0 = this.f;
        if(list0 == null) {
            ibuq.j("customFieldList");
            list0 = null;
        }
        return !list0.isEmpty();
    }

    public final boolean M(dxcw dxcw0, int v) {
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

    public final boolean N() {
        dxaj dxaj0 = this.m;
        dxaj dxaj1 = null;
        if(dxaj0 == null) {
            ibuq.j("passNameAndDescription");
            dxaj0 = null;
        }
        int v = ibzk.D(dxaj0.b);
        if(hwfk.B() && v != 0) {
            this.r.add("Pass description");
        }
        String s = v == 0 ? null : "Required";
        dxaj dxaj2 = this.m;
        if(dxaj2 == null) {
            ibuq.j("passNameAndDescription");
            dxaj2 = null;
        }
        if(!ibuq.m(s, dxaj2.d)) {
            dxaj dxaj3 = this.m;
            if(dxaj3 == null) {
                ibuq.j("passNameAndDescription");
            }
            else {
                dxaj1 = dxaj3;
            }
            dxaj1.d = s;
            this.r(1);
        }
        return v ^ 1;
    }

    public final boolean O(dxcw dxcw0) {
        int v;
        String s = null;
        if(dxcw0.e == gvca.b || dxcw0.e == gvca.c) {
            gvcb gvcb0 = dxcw0.j;
            if(gvcb0 == gvcb.b) {
                v = dxcw0.k.b & 1;
            }
            else if(gvcb0 == gvcb.c) {
                v = dxcw0.l.b & 1;
            }
            else {
                int v1 = ibzk.D(dxcw0.c);
                this.U(dxcw0, (v1 == 0 ? null : "Required"));
                v = v1 ^ 1;
            }
            if(v == 0) {
                return false;
            }
        }
        gged_interceptors gged0 = this.l;
        if(gged0 == null) {
            ibuq.j("inputFieldsEditTextList");
            gged0 = null;
        }
        int v2 = gged0.indexOf(dxcw0);
        gvcd gvcd0 = this.j;
        if(gvcd0 == null) {
            ibuq.j("inputForm");
            gvcd0 = null;
        }
        if((((gvcc)gvcd0.h.get(v2)).b & 0x40) != 0) {
            gvcd gvcd1 = this.j;
            if(gvcd1 == null) {
                ibuq.j("inputForm");
                gvcd1 = null;
            }
            if(((gvcc)gvcd1.h.get(v2)).j > 0) {
                gvcd gvcd2 = this.j;
                if(gvcd2 == null) {
                    ibuq.j("inputForm");
                    gvcd2 = null;
                }
                int v3 = ((gvcc)gvcd2.h.get(v2)).j;
                boolean z = dxcw0.c.length() <= v3;
                if(!z) {
                    s = this.a.getResources().getString(0x7F151DE4, new Object[]{v3});  // string:pay_exceeds_length "Use %1$d characters or fewer"
                }
                this.U(dxcw0, s);
                return z;
            }
        }
        return true;
    }

    public final boolean P() {
        dxaj dxaj0 = this.m;
        dxaj dxaj1 = null;
        if(dxaj0 == null) {
            ibuq.j("passNameAndDescription");
            dxaj0 = null;
        }
        int v = ibzk.D(dxaj0.a);
        if(hwfk.B() && v != 0) {
            this.r.add("Pass title");
        }
        String s = v == 0 ? null : "Required";
        dxaj dxaj2 = this.m;
        if(dxaj2 == null) {
            ibuq.j("passNameAndDescription");
            dxaj2 = null;
        }
        if(!ibuq.m(s, dxaj2.c)) {
            dxaj dxaj3 = this.m;
            if(dxaj3 == null) {
                ibuq.j("passNameAndDescription");
            }
            else {
                dxaj1 = dxaj3;
            }
            dxaj1.c = s;
            this.r(1);
        }
        return v ^ 1;
    }

    private final int Q() {
        return this.o == null ? -1 : 0;
    }

    private final int R() {
        return this.q ? this.Q() + 1 : this.T() + 1;
    }

    private final int S(int v) {
        return v - this.R();
    }

    private final int T() {
        return this.q ? -1 : this.Q() + 1;
    }

    private final void U(dxcw dxcw0, String s) {
        if(!ibuq.m(s, dxcw0.i)) {
            dxcw0.i = s;
            gged_interceptors gged0 = this.l;
            if(gged0 == null) {
                ibuq.j("inputFieldsEditTextList");
                gged0 = null;
            }
            this.r(gged0.indexOf(dxcw0) + this.R());
        }
    }

    private static final gvcc V(dxcw dxcw0) {
        gvbe gvbe0 = gvbd.a(((ProtoLiteMessage)gvcc.a).v_newBuilder());
        gvbe0.d(dxcw0.a);
        gvbe0.c(dxcw0.b);
        gvbe0.f(dxcw0.c);
        gvbe0.e(dxcw0.d);
        gvbe0.b(dxcw0.e);
        gvcb gvcb0 = dxcw0.j;
        if(gvcb0 == gvcb.b) {
            gvbh gvbh0 = dxcw0.k;
            ibuq.f(gvbh0, "value");
            ProtoLiteBuilder hftp0 = gvbe0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvcc gvcc0 = (gvcc)hftp0.b_message;
            gvbh0.getClass();
            gvcc0.d = gvbh0;
            gvcc0.c = 9;
        }
        if(gvcb0 == gvcb.a) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gvbi.a).v_newBuilder();
            String s = dxcw0.c;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gvbi gvbi0 = (gvbi)hftp1.b_message;
            s.getClass();
            gvbi0.b = s;
            ProtoLiteMessage hftv0 = hftp1.N_build();
            ibuq.e(hftv0, "build(...)");
            ibuq.f(((gvbi)hftv0), "value");
            ProtoLiteBuilder hftp2 = gvbe0.a;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gvcc gvcc1 = (gvcc)hftp2.b_message;
            ((gvbi)hftv0).getClass();
            gvcc1.d = (gvbi)hftv0;
            gvcc1.c = 8;
        }
        if(gvcb0 == gvcb.c) {
            gvbj gvbj0 = dxcw0.l;
            ibuq.f(gvbj0, "value");
            ProtoLiteBuilder hftp3 = gvbe0.a;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            gvcc gvcc2 = (gvcc)hftp3.b_message;
            gvbj0.getClass();
            gvcc2.d = gvbj0;
            gvcc2.c = 10;
        }
        return gvbe0.a();
    }

    @Override  // tk
    public final int b() {
        int v = this.R();
        gged_interceptors gged0 = this.l;
        List list0 = null;
        if(gged0 == null) {
            ibuq.j("inputFieldsEditTextList");
            gged0 = null;
        }
        int v1 = this.L() ? v + gged0.size() + 1 : v + gged0.size();
        List list1 = this.f;
        if(list1 == null) {
            ibuq.j("customFieldList");
        }
        else {
            list0 = list1;
        }
        int v2 = v1 + (list0.size() + 1);
        return this.p == null ? v2 : v2 + 1;
    }

    @Override  // tk
    public final int dx(int v) {
        int v3;
        int v1 = -1;
        gvcd gvcd0 = null;
        if(v == this.Q()) {
            return 1;
        }
        if(v == this.T()) {
            return 2;
        }
        if(v <= this.H()) {
            if(!hwuw.c()) {
                return 3;
            }
            gvcd gvcd1 = this.j;
            if(gvcd1 == null) {
                ibuq.j("inputForm");
            }
            else {
                gvcd0 = gvcd1;
            }
            Object object0 = gvcd0.h.get(this.S(v));
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
        if(this.L()) {
            int v2 = this.R();
            gged_interceptors gged0 = this.l;
            if(gged0 == null) {
                ibuq.j("inputFieldsEditTextList");
            }
            else {
                gvcd0 = gged0;
            }
            v3 = v2 + ((gged_interceptors)gvcd0).size();
        }
        else {
            v3 = -1;
        }
        if(v == v3) {
            return 6;
        }
        if(v <= this.G()) {
            return 4;
        }
        if(v == this.f()) {
            return 5;
        }
        if(this.p != null) {
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
                return new dxcm(view1, new dxco(this), new dxcp(this));
            }
            case 3: {
                View view2 = layoutInflater0.inflate(0x7F0E0D04, viewGroup0, false);  // layout:wallet_enter_user_created_pass_input_field
                ibuq.e(view2, "inflate(...)");
                return new dxcg(view2, this.n);
            }
            case 4: {
                View view3 = layoutInflater0.inflate(0x7F0E0D01, viewGroup0, false);  // layout:wallet_enter_user_created_pass_custom_field
                ibuq.e(view3, "inflate(...)");
                dxcq dxcq0 = new dxcq(this);
                dxcr dxcr0 = new dxcr(this);
                return new dxcc(view3, this.i, dxcq0, dxcr0);
            }
            case 5: {
                View view4 = layoutInflater0.inflate(0x7F0E0CFF, viewGroup0, false);  // layout:wallet_enter_user_created_pass_add_custom_field_button
                ibuq.e(view4, "inflate(...)");
                dxcs dxcs0 = new dxcs(this);
                return new dxbs(view4, this.i, this.n, dxcs0);
            }
            case 6: {
                View view5 = layoutInflater0.inflate(0x7F0E0D02, viewGroup0, false);  // layout:wallet_enter_user_created_pass_custom_field_divider
                ibuq.e(view5, "inflate(...)");
                ibuq.f(view5, "itemView");
                return new uq(view5);
            }
            case 7: {
                if(this.p == null) {
                    throw new IllegalArgumentException("disclaimer template is null.");
                }
                View view6 = layoutInflater0.inflate(0x7F0E0D07, viewGroup0, false);  // layout:wallet_enter_user_created_pass_page_disclaimer
                ibuq.e(view6, "inflate(...)");
                return new dxch(view6);
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
        return this.p == null ? this.b() - 1 : this.b() - 2;
    }

    @Override  // tk
    public final void h(uq uq0, int v) {
        boolean z3;
        View.OnClickListener view$OnClickListener1;
        ibuq.f(uq0, "viewHolder");
        List list0 = null;
        if((uq0 instanceof dxab)) {
            gvby gvby0 = this.o;
            if(gvby0 == null) {
                throw new IllegalArgumentException("Missing CategoryInfo");
            }
            Context context0 = this.a;
            fhwk fhwk0 = this.h;
            dsok dsok0 = this.g;
            View.OnClickListener view$OnClickListener0 = this.k;
            if(view$OnClickListener0 == null) {
                ibuq.j("onCategoryInfoClicked");
                view$OnClickListener1 = null;
            }
            else {
                view$OnClickListener1 = view$OnClickListener0;
            }
            ((dxab)uq0).D(context0, fhwk0, gvby0, dsok0, view$OnClickListener1);
            return;
        }
        boolean z = true;
        int v1 = 8;
        boolean z1 = false;
        if((uq0 instanceof dxcm)) {
            dxaj dxaj0 = this.m;
            if(dxaj0 == null) {
                ibuq.j("passNameAndDescription");
                dxaj0 = null;
            }
            gged_interceptors gged0 = this.l;
            if(gged0 == null) {
                ibuq.j("inputFieldsEditTextList");
            }
            else {
                list0 = gged0;
            }
            ibuq.f(dxaj0, "passNameAndDescription");
            ((dxcm)uq0).y = dxaj0;
            ((dxcm)uq0).v.setText(dxaj0.a);
            ((dxcm)uq0).t.H(dxaj0.c);
            ((dxcm)uq0).w.setText(dxaj0.b);
            ((dxcm)uq0).u.H(dxaj0.d);
            MaterialDivider materialDivider0 = ((dxcm)uq0).x;
            if(((gged_interceptors)list0).size() != 0) {
                v1 = 0;
            }
            materialDivider0.setVisibility(v1);
            return;
        }
        if((uq0 instanceof dxac)) {
            gged_interceptors gged1 = this.l;
            if(gged1 == null) {
                ibuq.j("inputFieldsEditTextList");
            }
            else {
                list0 = gged1;
            }
            Object object0 = ((gged_interceptors)list0).get(this.S(v));
            ibuq.e(object0, "get(...)");
            ((dxac)uq0).D(((dxcw)object0));
            return;
        }
        if((uq0 instanceof dxcg)) {
            gged_interceptors gged2 = this.l;
            if(gged2 == null) {
                ibuq.j("inputFieldsEditTextList");
                gged2 = null;
            }
            Object object1 = gged2.get(this.S(v));
            ibuq.e(object1, "get(...)");
            String s = "Required";
            ibuq.e("Required", "getString(...)");
            dxcn dxcn0 = new dxcn(this);
            boolean z2 = !this.L() && v == this.H();
            ibuq.f(((dxcw)object1), "ucpInputItem");
            ibuq.f("Required", "payRequiredString");
            ((dxcg)uq0).y = (dxcw)object1;
            TextInputLayout textInputLayout0 = ((dxcg)uq0).w;
            textInputLayout0.P(((dxcw)object1).b);
            EditText editText0 = ((dxcg)uq0).x;
            editText0.setText(((dxcw)object1).c);
            dxcw dxcw0 = ((dxcg)uq0).y;
            if(dxcw0 == null) {
                ibuq.j("ucpInputItem");
                dxcw0 = null;
            }
            if(dxcw0.e == gvca.b) {
                z3 = true;
            }
            else {
                dxcw dxcw1 = ((dxcg)uq0).y;
                if(dxcw1 == null) {
                    ibuq.j("ucpInputItem");
                    dxcw1 = null;
                }
                z3 = dxcw1.e == gvca.c;
            }
            ((dxcg)uq0).A = z3;
            textInputLayout0.N(z3);
            if(!((dxcg)uq0).A) {
                s = null;
            }
            textInputLayout0.L(s);
            dxcw dxcw2 = ((dxcg)uq0).y;
            if(dxcw2 == null) {
                ibuq.j("ucpInputItem");
                dxcw2 = null;
            }
            if(dxcw2.i != null) {
                z1 = true;
            }
            ((dxcg)uq0).z = z1;
            textInputLayout0.I(z1);
            dxcw dxcw3 = ((dxcg)uq0).y;
            if(dxcw3 == null) {
                ibuq.j("ucpInputItem");
            }
            else {
                list0 = dxcw3;
            }
            textInputLayout0.H(list0.i);
            LinearLayout linearLayout0 = ((dxcg)uq0).v;
            linearLayout0.setAccessibilityLiveRegion(((int)((dxcg)uq0).z));
            if(hwfk.av()) {
                edne.a(editText0, z2);
            }
            editText0.setOnFocusChangeListener(new dxcd(((dxcg)uq0), dxcn0, ((dxcw)object1)));
            if(hwfk.j()) {
                StringBuilder stringBuilder0 = new StringBuilder();
                Resources resources0 = ((dxcg)uq0).u;
                String s1 = resources0.getString(0x7F1522D6, new Object[]{((dxcg)uq0).E(), (ibzk.D(((dxcg)uq0).D()) ? "Is empty" : resources0.getString(0x7F1522D9, new Object[]{((dxcg)uq0).D()}))});  // string:pay_ucp_edit_form_field_content_description "Field label %1$s %2$s,"
                ibuq.e(s1, "getString(...)");
                stringBuilder0.append(s1);
                if(((dxcg)uq0).z) {
                    String s2 = resources0.getString(0x7F1522D5, new Object[]{(((dxcg)uq0).D().length() == 0 ? resources0.getString(0x7F1522DB, new Object[]{((dxcg)uq0).E()}) : String.valueOf(textInputLayout0.m()))});  // string:pay_ucp_edit_form_error_message_content_description "Error: %s"
                    ibuq.e(s2, "getString(...)");
                    stringBuilder0.append(s2);
                }
                else if(((dxcg)uq0).A) {
                    stringBuilder0.append(String.valueOf(textInputLayout0.n()));
                }
                linearLayout0.setContentDescription(stringBuilder0.toString());
            }
        }
        else {
            if((uq0 instanceof dxcc)) {
                fhwk fhwk1 = this.h;
                List list1 = this.f;
                if(list1 == null) {
                    ibuq.j("customFieldList");
                }
                else {
                    list0 = list1;
                }
                dxcw dxcw4 = (dxcw)list0.get(v - this.n());
                boolean z4 = v == this.G();
                ibuq.f(fhwk1, "viewVisualElements");
                ibuq.f(dxcw4, "ucpInputItem");
                ((dxcc)uq0).C = dxcw4;
                if(dxcw4.f) {
                    ((dxcc)uq0).u.setVisibility(8);
                    ((dxcc)uq0).v.setVisibility(8);
                    ((dxcc)uq0).A.setVisibility(0);
                    ((dxcc)uq0).A.P(dxcw4.b);
                    ((dxcc)uq0).B.setText(dxcw4.c);
                }
                else {
                    ((dxcc)uq0).u.setVisibility(0);
                    ((dxcc)uq0).v.setVisibility(0);
                    ((dxcc)uq0).A.setVisibility(8);
                    EditText editText1 = ((dxcc)uq0).x;
                    editText1.setText(dxcw4.b);
                    ((dxcc)uq0).w.I(dxcw4.h != null);
                    ((dxcc)uq0).w.H(dxcw4.h);
                    EditText editText2 = ((dxcc)uq0).z;
                    editText2.setText(dxcw4.c);
                    if(hwfk.av()) {
                        edne.a(editText2, z4);
                    }
                    TextInputLayout textInputLayout1 = ((dxcc)uq0).y;
                    if(dxcw4.i == null) {
                        z = false;
                    }
                    textInputLayout1.I(z);
                    textInputLayout1.H(dxcw4.i);
                    if(dxcw4.g) {
                        editText1.requestFocus();
                        if(hwfk.A()) {
                            editText1.postDelayed(new dxby(((dxcc)uq0)), 500L);
                        }
                        dxcw4.g = false;
                    }
                }
                fhvo fhvo0 = fhwk1.a.a(219409);
                fhwk1.g(((dxcc)uq0).t, fhvo0);
                return;
            }
            if((uq0 instanceof dxbs)) {
                fhwk fhwk2 = this.h;
                List list2 = this.f;
                if(list2 == null) {
                    ibuq.j("customFieldList");
                }
                else {
                    list0 = list2;
                }
                int v2 = list0.size();
                int v3 = dvkx.a();
                if(v2 >= v3) {
                    z = false;
                }
                ibuq.f(fhwk2, "viewVisualElements");
                Button button0 = ((dxbs)uq0).t;
                button0.setEnabled(z);
                TextView textView0 = ((dxbs)uq0).u;
                if(v2 >= v3) {
                    v1 = 0;
                }
                textView0.setVisibility(v1);
                fhwk2.g(button0, fhwk2.a.a(0x35910));
                return;
            }
            if((uq0 instanceof dxch)) {
                ibts ibts0 = this.p;
                if(ibts0 == null) {
                    throw new IllegalArgumentException("Missing disclaimer template");
                }
                ibts0.a(((dxch)uq0).t);
            }
        }
    }

    @Override  // tk
    public final void l(uq uq0) {
        ibuq.f(uq0, "viewHolder");
        if((uq0 instanceof dxab)) {
            ((dxab)uq0).E(this.h);
            return;
        }
        if((uq0 instanceof dxcc)) {
            ibuq.f(this.h, "viewVisualElements");
            this.h.d(((dxcc)uq0).t);
            return;
        }
        if((uq0 instanceof dxbs)) {
            ibuq.f(this.h, "viewVisualElements");
            this.h.d(((dxbs)uq0).t);
        }
    }

    public final int n() {
        int v = this.R();
        gged_interceptors gged0 = this.l;
        if(gged0 == null) {
            ibuq.j("inputFieldsEditTextList");
            gged0 = null;
        }
        int v1 = v + gged0.size();
        return this.L() ? v1 + 1 : v1;
    }
}

