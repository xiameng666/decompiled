import android.content.ContextWrapper;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class gass implements View.OnFocusChangeListener, View.OnLongClickListener, gasw {
    private View VW;
    public final gast a;
    public hdrl b;
    public kdl c;
    public int d;
    public gata e;
    public gasw f;
    public final ArrayList g;
    public ArrayList h;
    public View i;
    public boolean j;
    public fhvw k;
    public final gbnm l;
    public View.OnClickListener m;
    public final gbet n;
    public long o;
    public int p;
    public gafh q;
    public gatb r;
    private final bzt t;
    private boolean u;
    private boolean v;
    private fhwo w;
    private View.OnClickListener x;
    private hdtl y;
    private gasf z;

    protected gass(gast gast0) {
        this.d = 0;
        this.g = new ArrayList();
        this.t = new bzt();
        this.j = true;
        this.u = false;
        this.v = false;
        this.y = null;
        this.o = 0L;
        this.a = gast0;
        this.l = new gbnm(gast0.a.g);
        this.n = new gbet(gast0.a.e, gast0.g);
    }

    public final void A(gass gass0) {
        int v = this.g.size();
        this.g.add(v, gass0);
        gass0.an(this);
        gass0.ap(this.o);
        this.e.b(v, gass0.e);
    }

    protected void B(View view0) {
        gbfj.d(this.n, view0);
    }

    public final void C() {
        this.nr();
        for(Object object0: this.g) {
            ((gass)object0).C();
        }
    }

    public final void D() {
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((gass)arrayList0.get(v1)).D();
        }
        this.np();
    }

    protected final void E() {
        int v = 0;
        if(this.aM()) {
            ArrayList arrayList0 = this.g;
            int v1 = arrayList0.size();
            ArrayList arrayList1 = this.h;
            if(arrayList1 == null) {
                this.h = new ArrayList(v1);
            }
            else {
                arrayList1.ensureCapacity(v1);
            }
            int v2 = arrayList0.size();
            while(v < v2) {
                gass gass0 = (gass)arrayList0.get(v);
                this.a.c.e(gass0);
                this.h.add(gass0);
                gass0.H();
                ++v;
            }
            arrayList0.clear();
            return;
        }
        ArrayList arrayList2 = this.g;
        int v3 = arrayList2.size();
        while(v < v3) {
            gass gass1 = (gass)arrayList2.get(v);
            gass1.F();
            this.e.f(gass1.e);
            ++v;
        }
        arrayList2.clear();
        this.np();
    }

    public final void F() {
        this.ar();
        if(this.aF() && !this.aB()) {
            this.Q();
        }
        this.P();
        this.d = 3;
    }

    public final void G() {
        this.ar();
        gged_interceptors gged0 = gged_interceptors.i(this.g);
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gass gass0 = (gass)gged0.get(v1);
            gass0.G();
            this.ai(gass0);
        }
        if(this.aF()) {
            this.Q();
        }
        this.d = 4;
    }

    final void H() {
        View view0 = this.u();
        if(view0 != null) {
            boolean z = this.a.e.a(this).l(view0, 0) != null;
            if(this.v != z) {
                this.v = z;
                this.ns();
            }
        }
        ArrayList arrayList0 = this.g;
        int v1 = arrayList0.size();
        for(int v = 0; v < v1; ++v) {
            ((gass)arrayList0.get(v)).H();
        }
        this.a.c.e(this);
    }

    public final void I() {
        this.G();
        gasw gasw0 = this.f;
        if((gasw0 instanceof gass)) {
            ((gass)gasw0).ai(this);
        }
    }

    public final void J() {
        for(Object object0: this.g) {
            ((gass)object0).J();
        }
        if(this.VW != null && this.aH() && (this.b.b & 0x20) != 0) {
            this.nq();
        }
    }

    protected final void K(String s, String s1) {
        gavs.e(s, this.a.a.g, new gayx(this.no()), s1);
    }

    protected final void L(hdil hdil0, hdiu hdiu0) {
        this.M(-1, hdil0, hdiu0);
    }

    protected final void M(int v, hdil hdil0, hdiu hdiu0) {
        this.N(v, hdil0, hdiu0, -1, -1);
    }

    protected final void N(int v, hdil hdil0, hdiu hdiu0, int v1, int v2) {
        String s1;
        Bitmap bitmap1;
        hdih hdih0;
        Uri uri1;
        String s2;
        ghip ghip0;
        int v5;
        int v4;
        if(this.z == null) {
            this.z = new gasf(this.a, this);
        }
        gasf gasf0 = this.z;
        bzt bzt0 = gasf0.b;
        gase gase0 = (gase)bzu.a(bzt0, v);
        if(gase0 == null) {
            gase0 = new gase(gasf0, v);
            bzt0.h(v, gase0);
        }
        gase0.c();
        gase0.b = hdil0;
        gase0.c = v1;
        gase0.d = v2;
        gbdr gbdr0 = gasf0.a.g;
        hdif hdif0 = gasg.c(hdil0, gbdr0);
        boolean z = true;
        if(hdif0 == null) {
            v4 = hdik.a(hdil0.c);
        }
        else {
            int v3 = hdif0.b;
            v4 = 8;
            if(v3 == 0) {
                v5 = 8;
            }
            else {
                switch(v3) {
                    case 2: {
                        v5 = 1;
                        break;
                    }
                    case 3: {
                        v5 = 2;
                        break;
                    }
                    case 4: {
                        v5 = 3;
                        break;
                    }
                    case 5: {
                        v5 = 4;
                        break;
                    }
                    case 6: {
                        v5 = 5;
                        break;
                    }
                    case 7: {
                        v5 = 6;
                        break;
                    }
                    case 8: {
                        v5 = 7;
                        break;
                    }
                    default: {
                        v5 = 0;
                    }
                }
            }
            if(v5 == 0) {
                throw null;
            }
            switch(v5 - 1) {
                case 0: {
                    v4 = 1;
                    break;
                }
                case 1: {
                    v4 = 3;
                    break;
                }
                case 2: {
                    v4 = 4;
                    break;
                }
                case 3: {
                    v4 = 5;
                    break;
                }
                case 4: {
                    v4 = 6;
                    break;
                }
                case 5: {
                    v4 = 7;
                    break;
                }
                case 6: 
                case 7: {
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        String s = "";
        if(v4 != 0) {
            switch(v4 - 1) {
                case 0: {
                    hdif hdif4 = gasg.c(hdil0, gbdr0);
                    if(hdif4 == null) {
                        ghip0 = hdil0.c == 2 ? ((ghip)hdil0.d) : ghip.a;
                    }
                    else if(hdif4.b == 2) {
                        ghip0 = (ghip)hdif4.c;
                    }
                    else {
                        ghip0 = ghip.a;
                    }
                    gasf0.b(gase0, ghiq.a(ghip0).b);
                    return;
                }
                case 6: {
                    gast gast1 = gasf0.a;
                    hdif hdif5 = gasg.c(hdil0, gbdr0);
                    Object object0 = gast1.b.i((hdif5 == null ? (hdil0.c == 10 ? ((hdij)hdil0.d) : hdij.a).b : (hdif5.b == 7 ? ((hdij)hdif5.c) : hdij.a).b), "BE_IU_01").s(gged_interceptors.l(Integer.valueOf((hdil0.c == 10 ? ((hdij)hdil0.d) : hdij.a).c)));
                    gftb.z(object0, "Data component did not have the file identifier");
                    if((object0 instanceof List)) {
                        List list0 = gawk.c(((List)object0));
                        if(list0.size() != 1) {
                            z = false;
                        }
                        gftb.b(z, "Cannot load image from multiple files");
                        s2 = (String)gggq.r(list0);
                    }
                    else {
                        s2 = (String)object0;
                    }
                    Bitmap bitmap3 = gasg.b(gast1.a.e.getContentResolver(), Uri.parse(s2));
                    gavr.b(bitmap3, "BE_ICL_01", gast1.a.g, gavs.a, "Provided file should have valid image data");
                    gasf0.c(gase0, bitmap3);
                    return;
                }
                default: {
                    switch(v4 - 1) {
                        case 2: {
                            hdif hdif1 = gasg.c(hdil0, gbdr0);
                            if(hdif1 == null) {
                                if(hdil0.c == 4) {
                                    s = (String)hdil0.d;
                                }
                            }
                            else if(hdif1.b == 3) {
                                s = (String)hdif1.c;
                            }
                            byte[] arr_b = Base64.decode(s, 0);
                            Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
                            gftb.z(bitmap0, "ImageContent should provide valid dataUri");
                            gasf0.c(gase0, bitmap0);
                            return;
                        }
                        case 3: {
                            hdif hdif2 = gasg.c(hdil0, gbdr0);
                            if(hdif2 == null) {
                                if(hdil0.c == 5) {
                                    s = (String)hdil0.d;
                                }
                            }
                            else if(hdif2.b == 4) {
                                s = (String)hdif2.c;
                            }
                            try {
                                Uri uri0 = Uri.parse(s);
                                hfid hfid0 = gasg.d();
                                hfik hfik0 = new hfik();
                                if((hdiu0.b & 2) != 0) {
                                    hfik0.b(gasg.a(hdiu0.d));
                                }
                                if((hdiu0.b & 1) != 0) {
                                    hfik0.e(gasg.a(hdiu0.c));
                                }
                                if((hdiu0.b & 4) != 0) {
                                    hfik0.a(hdiu0.e);
                                }
                                uri1 = hfid0.j(hfik0, uri0);
                            }
                            catch(fhsm unused_ex) {
                                uri1 = Uri.EMPTY;
                            }
                            gasf0.b(gase0, uri1.toString());
                            return;
                        }
                        case 4: {
                            gast gast0 = gasf0.a;
                            hdif hdif3 = gasg.c(hdil0, gast0.g);
                            if(hdif3 == null) {
                                if(hdil0.c == 6) {
                                    hdih0 = hdih.b(((Integer)hdil0.d).intValue());
                                    if(hdih0 == null) {
                                        hdih0 = hdih.a;
                                    }
                                }
                                else {
                                    hdih0 = hdih.a;
                                }
                            }
                            else if(hdif3.b == 5) {
                                hdih0 = hdih.b(((Integer)hdif3.c).intValue());
                                if(hdih0 == null) {
                                    hdih0 = hdih.a;
                                }
                            }
                            else {
                                hdih0 = hdih.a;
                            }
                            int v6 = hdih0.B;
                            int v7 = gasg.a.get(v6);
                            if(v7 == 0) {
                                z = false;
                            }
                            gftb.d(z, "EmbeddedReferenceId %s not found.", v6);
                            ContextWrapper contextWrapper0 = gast0.a.e;
                            Drawable drawable0 = kv.a(contextWrapper0, v7);
                            if(drawable0 == null) {
                                return;
                            }
                            if(gase0.c != drawable0.getIntrinsicWidth() && gase0.c > 0 || gase0.d != drawable0.getIntrinsicHeight() && gase0.d > 0) {
                                if((drawable0 instanceof BitmapDrawable)) {
                                    bitmap1 = gasf.a(gase0, ((BitmapDrawable)drawable0).getBitmap());
                                }
                                else {
                                    Bitmap bitmap2 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                    Canvas canvas0 = new Canvas(bitmap2);
                                    drawable0.setBounds(0, 0, canvas0.getWidth(), canvas0.getHeight());
                                    drawable0.draw(canvas0);
                                    bitmap1 = gasf.a(gase0, bitmap2);
                                }
                                drawable0 = new BitmapDrawable(contextWrapper0.getResources(), bitmap1);
                            }
                            gasf0.d(gase0, drawable0);
                            return;
                        }
                        default: {
                            gaym gaym0 = gasf0.a.a.g;
                            ibts ibts0 = gavs.a;
                            switch(hdik.a(hdil0.c)) {
                                case 1: {
                                    s1 = "SAFE_URI";
                                    break;
                                }
                                case 2: {
                                    s1 = "EMBEDDED_REFERENCE";
                                    break;
                                }
                                case 3: {
                                    s1 = "DATA_URI";
                                    break;
                                }
                                case 4: {
                                    s1 = "FIFE_URL";
                                    break;
                                }
                                case 5: {
                                    s1 = "EMBEDDED_IMAGE";
                                    break;
                                }
                                case 6: {
                                    s1 = "FONT_ICON";
                                    break;
                                }
                                case 7: {
                                    s1 = "IMAGE_BY_DATA_REFERENCE";
                                    break;
                                }
                                case 8: {
                                    s1 = "SOURCE_NOT_SET";
                                    break;
                                }
                                default: {
                                    s1 = "null";
                                }
                            }
                            gavs.e("BE_ICL_02", gaym0, ibts0, String.format("Unsupported source type %s", s1));
                            return;
                        }
                    }
                }
            }
        }
        throw null;
    }

    protected void O() {
        View view0 = this.i;
        if(view0 != null) {
            view0.setImportantForAccessibility(this.q(false));
        }
    }

    protected void P() {
        this.E();
        this.l.g();
        this.l.b.clear();
        gbet gbet0 = this.n;
        gbdp gbdp0 = gbet0.c;
        if(gbdp0 != null) {
            gbet0.a.c(gbdp0);
        }
        this.a.c.e(this);
    }

    protected void Q() {
        gasf gasf0 = this.z;
        if(gasf0 != null) {
            bzt bzt0 = gasf0.b;
            int v = bzt0.c();
            for(int v1 = 0; v1 < v; ++v1) {
                ((gase)bzt0.e(v1)).c();
            }
            bzt0.g();
        }
    }

    protected void R() {
        View view0 = this.i;
        if(view0 != null) {
            view0.setEnabled(this.aC());
        }
        int v = this.aC() ^ 1;
        this.n.d(hdry.b, ((boolean)v));
        ArrayList arrayList0 = this.g;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((gass)arrayList0.get(v2)).R();
        }
    }

    protected final void S() {
        this.e.d();
    }

    public void T(int v, Drawable drawable0) {
    }

    protected void U() {
        this.e = this.z();
        this.n.h = this;
        this.ah(new gasn(this.a));
    }

    public final void V() {
        this.nr();
        for(Object object0: this.g) {
            ((gass)object0).V();
        }
    }

    protected final void W() {
        for(Object object0: this.l.c) {
            ((gbni)object0).b = true;
        }
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((gass)arrayList0.get(v1)).W();
        }
    }

    protected void X() {
        for(Object object0: this.g) {
            ((gass)object0).ag();
        }
    }

    public void Y() {
        View view0 = this.i;
        if(view0 != null) {
            this.B(view0);
        }
        this.n.c();
    }

    protected final void Z() {
        for(Object object0: this.l.c) {
            ((gbni)object0).b = false;
        }
        ArrayList arrayList0 = this.g;
        int v1 = arrayList0.size();
        for(int v = 0; v < v1; ++v) {
            ((gass)arrayList0.get(v)).Z();
        }
    }

    protected boolean aA() {
        return false;
    }

    public final boolean aB() {
        return this.d == 4;
    }

    @Override  // gasw
    public boolean aC() {
        return this.f == null || this.f.aC();
    }

    protected boolean aD() {
        return this.i != null && this.i.isFocusable() && this.j;
    }

    public boolean aE() {
        for(Object object0: this.g) {
            if(((gass)object0).aE()) {
                return true;
            }
        }
        return false;
    }

    public final boolean aF() {
        return this.d != 0;
    }

    protected boolean aG() {
        return false;
    }

    @Override  // gasw
    public boolean aH() {
        return this.f != null && this.f.aH();
    }

    public final boolean aI() {
        return this.d == 2;
    }

    public final boolean aJ() {
        return this.d == 1 || this.d == 2;
    }

    protected boolean aK(int v) {
        return false;
    }

    protected boolean aL() {
        return this.i == null ? false : this.i.requestFocus();
    }

    final boolean aM() {
        long v = this.y(this).no();
        gbmd gbmd0 = (gbmd)this.a.e.d.d(v);
        return (gbmd0 == null ? this.a.e.c.j() : gbmd0.j()) && this.j && this.aI();
    }

    public final boolean aN() {
        for(Object object0: this.g) {
            if(((gass)object0).aN()) {
                return true;
            }
        }
        return false;
    }

    public boolean aO() {
        return false;
    }

    protected final gass aP(gaso gaso0) {
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        gass gass0 = null;
        int v1 = 0;
        while(v1 < v) {
            gass0 = ((gass)arrayList0.get(v1)).aP(gaso0);
            ++v1;
            if(gass0 != null) {
                break;
            }
        }
        return gass0 != null || !this.aw() ? gass0 : this;
    }

    protected final gass aQ(gaso gaso0) {
        return this.f == null ? null : this.f.aR(this, gaso0);
    }

    @Override  // gasw
    public final gass aR(gass gass0, gaso gaso0) {
        ArrayList arrayList0 = this.g;
        int v = arrayList0.indexOf(gass0) + 1;
        gass gass1 = null;
        while(v < arrayList0.size()) {
            gass1 = ((gass)arrayList0.get(v)).aP(gaso0);
            if(gass1 != null) {
                break;
            }
            ++v;
        }
        if(gass1 == null && this.aw()) {
            gass1 = this;
        }
        if(gass1 == null) {
            return this.f == null ? null : this.f.aR(this, gaso0);
        }
        return gass1;
    }

    public final void aS() {
        View view0 = this.i;
        if(view0 != null && this.aI()) {
            view0.sendAccessibilityEvent(8);
            view0.sendAccessibilityEvent(8);
        }
    }

    public final boolean aT(int v) {
        for(Object object0: this.g) {
            if(((gass)object0).aT(v)) {
                return true;
            }
        }
        return !this.aD() || !this.aU(v) ? false : this.aL();
    }

    protected boolean aU(int v) {
        return v == 2;
    }

    protected void aa() {
    }

    protected void ab() {
        for(Object object0: this.g) {
            ((gass)object0).ar();
        }
    }

    // Detected as a lambda impl.
    public final void ac(hfta hfta0, int v) {
        gatg gatg0 = (gatg)bzu.a(this.t, hfta0.a());
        if(gatg0 != null) {
            long v1 = this.o;
            if(v1 == 0L) {
                gatg0.e(v);
            }
            else if(gatg0.f(v)) {
                hcsi hcsi0 = (hcsi)bzu.a(gatg0.b, v);
                gftb.check(hcsi0);
                gatg0.a.d.c(hcsi0, v1);
            }
        }
    }

    protected void ad(hdrl hdrl0, hdrl hdrl1) {
        int v2;
        hdrw hdrw0 = hdrl1.d == null ? hdrw.a : hdrl1.d;
        gbet gbet0 = this.n;
        gbdp gbdp0 = gbet0.c;
        if(gbdp0 != null) {
            gbet0.a.c(gbdp0);
        }
        gbdp gbdp1 = gbdp.a(gbet0.a, hdrw0);
        gbet0.a.d.add(gbdp1);
        gbet0.c = gbdp1;
        if(hdrl0 != null) {
            gatg.d(this.t);
            this.l.g();
        }
        gatg.c(this.t, hdrl1.f);
        hfta hfta0 = hdrq.d;
        if(this.ay(hfta0, 1)) {
            gasq gasq0 = (/* MISSING LAMBDA PARAMETER */) -> {
                gatg gatg0 = (gatg)bzu.a(this.t, hdrq.d.a());
                if(gatg0 != null) {
                    long v1 = this.o;
                    if(v1 == 0L) {
                        gatg0.e(1);
                    }
                    else if(gatg0.f(1)) {
                        hcsi hcsi0 = (hcsi)bzu.a(gatg0.b, 1);
                        gftb.check(hcsi0);
                        gatg0.a.d.c(hcsi0, v1);
                    }
                }
            };
            this.m = gasq0;
            this.l.d(gasq0);
        }
        else {
            View.OnClickListener view$OnClickListener0 = this.m;
            if(view$OnClickListener0 != null) {
                this.l.i(view$OnClickListener0);
                this.m = null;
            }
        }
        gbnm gbnm0 = this.l;
        gbnm0.c(this);
        if(this.ay(hfta0, 7)) {
            gbni.i(gbnm0.b(), this);
        }
        else {
            gbnm0.b().g(this);
        }
        gasv gasv0 = this.a.j;
        long v = hdrl1.c;
        long v1 = hdrl0 == null ? v : hdrl0.c;
        if(gasv0.h == null) {
            gasv0.h = new byi();
        }
        if(gasv0.g == null) {
            gasv0.g = gcqy.c();
        }
        if(gasv0.h.j(v1)) {
            Integer integer0 = (Integer)gasv0.h.d(v1);
            gavs.h(integer0, "BE_PC_02", gasv0.a.a.g, new gayx(v1));
            v2 = (int)integer0;
            gasv0.h.i(v1);
        }
        else {
            v2 = gasv0.g.a();
        }
        gasv0.h.h(v, Integer.valueOf(v2));
        this.p = v2;
    }

    protected void ae(boolean z) {
        View view0 = this.i;
        if(view0 != null) {
            this.a.e.e(this);
            view0.setVisibility((z ? 0 : 8));
            View view1 = this.u();
            gavs.h(view1, "BE_NVP_07", this.a.a.g, new gayx(this.no()));
            this.a.e.i(view1, this);
        }
        this.at(z);
    }

    public void af() {
        View view0 = this.i;
        if(view0 != null) {
            view0.performClick();
        }
    }

    public final void ag() {
        gavr.a(this.aJ(), "BE_NVP_02", this.a.a.g, new gayx(this.no()), "Can not present in non UP_TO_DATE state.");
        this.d = 2;
        this.X();
    }

    protected final void ah(gatg gatg0) {
        this.t.h(gatg0.b(), gatg0);
    }

    protected final void ai(gass gass0) {
        if(this.aM()) {
            this.g.remove(gass0);
            if(this.h == null) {
                this.h = new ArrayList(1);
            }
            this.h.add(gass0);
            gass0.H();
            return;
        }
        this.g.remove(gass0);
        gass0.an(null);
        this.e.f(gass0.e);
    }

    protected final void aj() {
        View view0 = this.i;
        gavs.h(view0, "BE_NVP_05", this.a.a.g, new gayx(this.no()));
        View view1 = this.VW;
        gavs.h(view1, "BE_NVP_08", this.a.a.g, new gayx(this.no()));
        if(this.aH() && (this.b.b & 0x20) != 0) {
            this.nq();
        }
        this.l.j(view1);
        gata gata0 = this.e;
        gavs.c(gata0.b.isEmpty() || gata0.i(), "BE_PNH_07", null, "Views can only be removed from leaf or subRoot PresenterNodeHelpers");
        gata gata1 = gata0.a;
        if(gata1 != null) {
            gata1.g(view0);
            gata0.h(-1);
        }
        kfe.j(view0, null);
        this.i = null;
    }

    public final void ak(kdl kdl0) {
        this.c = kdl0;
        View view0 = this.i;
        if(view0 != null) {
            kfe.j(view0, kdl0);
        }
    }

    public final void al(hdtl hdtl0) {
        this.y = hdtl0;
        View view0 = this.u();
        if(view0 != null) {
            view0.setTag(0x7F0B1075, this.y);  // id:custom_transition_properties
            this.a.e.i(view0, this);
        }
    }

    public final void am(boolean z) {
        if(this.u != z) {
            this.u = z;
            this.ns();
        }
    }

    protected final void an(gasw gasw0) {
        if(this.f != gasw0) {
            this.am(false);
        }
        this.f = gasw0;
        if(gasw0 != null) {
            this.ns();
            this.R();
        }
    }

    public final void ao(int v) {
        View view0 = this.i;
        if(view0 != null) {
            view0.setImportantForAccessibility(this.q(v == 4 || v == 5));
        }
        if(!this.aK(v)) {
            for(Object object0: this.g) {
                ((gass)object0).ao(v);
            }
        }
    }

    public final void ap(long v) {
        this.o = v;
        for(Object object0: this.g) {
            ((gass)object0).ap(v);
        }
        if(this.aJ()) {
            this.aa();
        }
    }

    protected final void aq(View view0, View view1) {
        gast gast0 = this.a;
        int v = 0;
        gavr.a(this.i == null, "BE_NVP_04", gast0.a.g, new gayx(this.no()), "Node view has already been set.");
        if(this.j) {
            gast0.e.e(this);
        }
        gbet gbet0 = this.n;
        gbet0.a();
        this.i = view0;
        this.VW = view1;
        gata gata0 = this.e;
        gavs.c(gata0.b.isEmpty() || gata0.i(), "BE_PNH_03", null, "Views can only be added to leaf or subRoot PresenterNodeHelpers");
        gata gata1 = gata0.a;
        if(gata1 != null) {
            gata1.c(gata0.d, this, view0);
            gata0.h(1);
        }
        this.B(view0);
        gbet0.b();
        if(!this.j) {
            v = 8;
        }
        view0.setVisibility(v);
        this.R();
        this.O();
        kdl kdl0 = this.c;
        if(kdl0 != null) {
            kfe.j(view0, kdl0);
        }
        gaxl.a();
        gaxl.a();
        this.l.f(view1);
        View view2 = this.u();
        if(view2 != null) {
            hdrl hdrl0 = this.b;
            if((hdrl0.b & 0x80) == 0) {
                view2.setTag(0x7F0B2353, null);  // id:transition_properties
            }
            else {
                view2.setTag(0x7F0B2353, (hdrl0.j == null ? hdtl.a : hdrl0.j));  // id:transition_properties
            }
            view2.setTag(0x7F0B1075, this.y);  // id:custom_transition_properties
            gast0.e.i(view2, this);
        }
        if(this.aH()) {
            this.nr();
        }
    }

    public final void ar() {
        if(this.aI()) {
            this.a.e.e(this);
            this.ab();
            this.d = 1;
        }
    }

    public final void as(hdrl hdrl0) {
        gavr.a(((boolean)(this.aI() ^ 1)), "BE_NVP_01", this.a.a.g, new gayx(this.no()), "Can not update while in PRESENTED state.");
        hdrl hdrl1 = this.b;
        this.b = hdrl0;
        this.d = 1;
        this.ad(hdrl1, hdrl0);
        this.nt(true);
        this.O();
    }

    public final void at(boolean z) {
        gafh gafh0 = this.q;
        if(gafh0 != null) {
            gafh0.f((z ? 0 : 8));
        }
    }

    public final void au() {
        ArrayList arrayList0 = this.g;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            ((gass)arrayList0.get(v2)).au();
        }
        ArrayList arrayList1 = this.h;
        if(arrayList1 != null) {
            int v3 = arrayList1.size();
            for(int v1 = 0; v1 < v3; ++v1) {
                ((gass)arrayList1.get(v1)).au();
            }
        }
        View view0 = this.u();
        if(view0 != null) {
            this.a.e.i(view0, this);
        }
    }

    protected final boolean av() {
        gass gass0 = this.aQ(new gaso());
        return gass0 != null && gass0.aL();
    }

    protected boolean aw() {
        return false;
    }

    public final boolean ax() {
        boolean z = this.aA();
        if(!z) {
            for(Object object0: this.g) {
                if(((gass)object0).ax()) {
                    return true;
                }
            }
        }
        return z;
    }

    protected final boolean ay(hfta hfta0, int v) {
        bzt bzt0 = this.t;
        if(bzt0.i(hfta0.a())) {
            gatg gatg0 = (gatg)bzu.a(bzt0, hfta0.a());
            gavs.h(gatg0, "BE_NVP_03", this.a.a.g, new gayx(this.no()));
            return gatg0.f(v);
        }
        return false;
    }

    public boolean az() {
        return true;
    }

    public final int nn() {
        hdrl hdrl0 = this.b;
        if(hdrl0 != null && (hdrl0.b & 0x20) != 0) {
            heae heae0 = hdrl0.h == null ? heae.c : hdrl0.h;
            return (heae0.d & 1) == 0 ? 0 : heae0.e;
        }
        return 0;
    }

    public final long no() {
        return this.b == null ? -1L : this.b.c;
    }

    private final void np() {
        ArrayList arrayList0 = this.h;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((gass)arrayList0.get(v1)).F();
            }
            this.h.clear();
        }
    }

    private final void nq() {
        View.OnClickListener view$OnClickListener0 = this.x;
        if(view$OnClickListener0 != null) {
            this.l.i(view$OnClickListener0);
            this.x = null;
        }
        fhwk fhwk0 = gaxn.b(this.a.a.a.b).b();
        View view0 = this.VW;
        gavs.h(view0, "BE_NVP_06", this.a.a.g, new gayx(this.no()));
        fhwk0.d(view0);
    }

    private final void nr() {
        View view0 = this.VW;
        if(view0 != null) {
            hdrl hdrl0 = this.b;
            if((hdrl0.b & 0x20) != 0) {
                heae heae0 = hdrl0.h == null ? heae.c : hdrl0.h;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gkzs.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gkzq.a).v_newBuilder();
                long v = this.no();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gkzq gkzq0 = (gkzq)hftp1.b_message;
                gkzq0.b |= 1;
                gkzq0.c = v;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gkzs gkzs0 = (gkzs)hftp0.b_message;
                gkzq gkzq1 = (gkzq)hftp1.N_build();
                gkzq1.getClass();
                gkzs0.d = gkzq1;
                gkzs0.b |= 2;
                gkzs gkzs1 = (gkzs)hftp0.N_build();
                gatj gatj0 = this.a.a;
                fhwk fhwk0 = gaxn.b(gatj0.a.b).b();
                if(this.w == null) {
                    this.w = gaxn.b(gatj0.a.b).c();
                }
                fhvo fhvo0 = this.w.a(heae0.e);
                fhvo0.d(new fhvp(gkzx.a, gkzs1));
                fhwk0.g(view0, fhvo0);
                if(new hfuh(heae0.f, heae.a).contains(gltz.e)) {
                    gasp gasp0 = new gasp(this, view0);
                    this.x = gasp0;
                    this.l.e(gasp0, true);
                }
            }
        }
    }

    private final void ns() {
        this.nt(false);
    }

    private final void nt(boolean z) {
        boolean z1 = !this.u && !this.v;
        if(z1 != this.j || z) {
            this.j = z1;
            if(this.aJ()) {
                this.ae(z1);
            }
        }
    }

    public float o() {
        for(Object object0: this.g) {
            gass gass0 = (gass)object0;
            if((gass0.o() >= 0.0f)) {
                return gass0.o();
            }
        }
        return -1.0f;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        this.n.d(hdry.c, z);
        if(this.aG() && z) {
            gast gast0 = this.a;
            gask gask0 = gast0.i;
            if(gask0.c) {
                gask0.e = false;
            }
            if((view0 instanceof EditText)) {
                InputMethodManager inputMethodManager0 = (InputMethodManager)gast0.a.e.getSystemService("input_method");
                if(inputMethodManager0 != null) {
                    inputMethodManager0.showSoftInput(view0, 1);
                }
            }
        }
        this.ac(hdrq.d, (z ? 2 : 3));
    }

    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        this.ac(hdrq.d, 7);
        return true;
    }

    protected int p() {
        return 0;
    }

    public final int q(boolean z) {
        int v;
        if(z) {
            return 4;
        }
        hdrl hdrl0 = this.b;
        if(hdrl0 != null && (hdrl0.b & 0x40) != 0) {
            v = hdpi.a((hdrl0.i == null ? hdpe.a : hdrl0.i).b);
            if(v == 0) {
                v = 1;
            }
        }
        else {
            v = 1;
        }
        int v1 = this.p();
        switch(v - 1) {
            case 1: {
                return 2;
            }
            case 2: {
                return 4;
            }
            default: {
                return v1;
            }
        }
    }

    public int r() {
        for(Object object0: this.g) {
            gass gass0 = (gass)object0;
            if(gass0.r() != -1) {
                return gass0.r();
            }
        }
        return -1;
    }

    public final View s() {
        View view0 = this.t();
        if(view0 == null) {
            for(Object object0: this.g) {
                view0 = ((gass)object0).s();
                if(view0 != null) {
                    break;
                }
            }
        }
        return view0;
    }

    protected View t() {
        return this.i == null ? null : this.i.getRootView();
    }

    @Override
    public final String toString() {
        return "[ C: " + this.getClass().getSimpleName() + " V: " + this.j + " ]";
    }

    public View u() {
        return this.i;
    }

    protected final gass v(hdrl hdrl0) {
        gass gass0 = this.a.c.c(this.a, hdrl0);
        this.A(gass0);
        this.a.c.g(hdrl0, gass0);
        return gass0;
    }

    protected final gass w(hdrl hdrl0) {
        gass gass0 = this.v(hdrl0);
        if(this.aI()) {
            gass0.ag();
        }
        return gass0;
    }

    protected final gass x(Predicate predicate0) {
        if(predicate0.test(this)) {
            return this;
        }
        return (this.f instanceof gass) ? ((gass)this.f).x(predicate0) : null;
    }

    @Override  // gasw
    public final gass y(gass gass0) {
        return this.f == null ? this : this.f.y(this);
    }

    protected gata z() {
        return new gata(null);
    }
}

