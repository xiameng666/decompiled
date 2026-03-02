import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.pay.SecureElementPrepaidTosSection;
import com.google.android.libraries.tapandpay.ui.callout.Callout;
import j..util.DesugarCollections;
import j..util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class uq {
    public final View a;
    public WeakReference b;
    public int c;
    public int d;
    public long e;
    public int f;
    int g;
    public uq h;
    public uq i;
    int j;
    List k;
    List l;
    uf m;
    boolean n;
    public int o;
    public int p;
    RecyclerView q;
    public tk r;
    public static final int s;
    private static final List t;
    private int u;

    static {
        uq.t = Collections.EMPTY_LIST;
    }

    public uq(View view0) {
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.f = -1;
        this.g = -1;
        this.h = null;
        this.i = null;
        this.k = null;
        this.l = null;
        this.u = 0;
        this.m = null;
        this.n = false;
        this.o = 0;
        this.p = -1;
        if(view0 == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.a = view0;
    }

    public uq(View view0, View.OnClickListener view$OnClickListener0) {
        this(view0);
        view0.setOnClickListener(view$OnClickListener0);
    }

    public uq(View view0, SecureElementPrepaidTosSection secureElementPrepaidTosSection0) {
        this(view0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B08BD);  // id:Title
        if(TextUtils.isEmpty(secureElementPrepaidTosSection0.a)) {
            textView0.setVisibility(8);
        }
        else {
            textView0.setText(secureElementPrepaidTosSection0.a);
        }
        TextView textView1 = (TextView)view0.findViewById(0x7F0B00E0);  // id:Body
        if(!TextUtils.isEmpty(secureElementPrepaidTosSection0.b)) {
            Spannable spannable0 = (Spannable)Html.fromHtml(((String)Objects.requireNonNull(secureElementPrepaidTosSection0.b)));
            URLSpan[] arr_uRLSpan = (URLSpan[])spannable0.getSpans(0, spannable0.length(), URLSpan.class);
            for(int v = 0; v < arr_uRLSpan.length; ++v) {
                URLSpan uRLSpan0 = arr_uRLSpan[v];
                spannable0.setSpan(new UnderlineSpan(), spannable0.getSpanStart(uRLSpan0), spannable0.getSpanEnd(uRLSpan0), 0);
            }
            textView1.setText(spannable0);
            textView1.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        textView1.setVisibility(8);
    }

    public uq(View view0, byte[] arr_b) {
        this(view0);
        view0.setVisibility(8);
    }

    public uq(View view0, char[] arr_c) {
        this(view0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B1A44);  // id:notification_link_title
        TextView textView1 = (TextView)view0.findViewById(0x7F0B1A43);  // id:notification_link_description
    }

    public uq(View view0, float[] arr_f) {
        this(view0);
        edpo edpo0 = new edpo(view0.getContext());
        funx.d(((TextView)view0.findViewById(0x7F0B086D)), ftrm.a(edpo0.a("%1$sTerms%2$s and %3$sPrivacy Policy%4$s"), true));  // id:TOS
        funx.d(((TextView)view0.findViewById(0x7F0B0574)), ftrm.a(Html.fromHtml(String.format("Learn more about <a href=%1$s>passes added from Gmail</a>.", hwkw.a.b().a()), 0x3F), true));  // id:ManageValuablesLearnMore
        edqf.b(((TextView)view0.findViewById(0x7F0B0575)), 0x7F152490, "manage passes data", new dwsx(view0), true);  // id:ManageValuablesMessage
    }

    public uq(View view0, int[] arr_v) {
        ibuq.f(view0, "itemView");
        this(view0);
        View view1 = view0.findViewById(0x7F0B1F4D);  // id:se_tap_balance
        ibuq.c(view1);
        TextView textView0 = (TextView)view1;
    }

    public uq(View view0, short[] arr_v) {
        ibuq.f(view0, "itemView");
        this(view0);
        View view1 = view0.findViewById(0x7F0B0748);  // id:SandboxMessage
        ibuq.e(view1, "findViewById(...)");
        Callout callout0 = (Callout)view1;
    }

    public uq(View view0, boolean[] arr_z) {
        this(view0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B2121);  // id:subtitle
    }

    public uq(View view0, byte[][] arr2_b) {
        this(view0);
        view0.setVisibility(8);
    }

    public uq(View view0, char[][] arr2_c) {
        this(view0);
        TextView textView0 = (TextView)view0.findViewById(0x7F0B2259);  // id:text
    }

    public uq(View view0, short[][] arr2_v) {
        ibuq.f(view0, "itemView");
        this(view0);
    }

    public uq(eeyp eeyp0, View view0) {
        Objects.requireNonNull(eeyp0);
        this(view0);
        view0.setOnClickListener(new eeyo(eeyp0));
    }

    public uq(eeys eeys0, View view0) {
        Objects.requireNonNull(eeys0);
        this(view0);
        eeyq eeyq0 = eeys0.a;
        Objects.requireNonNull(eeyq0);
        view0.setOnClickListener(new eeyr(eeyq0));
    }

    public uq(eezf eezf0, View view0) {
        Objects.requireNonNull(eezf0);
        this(view0);
        if(eezf0.a != null) {
            ((TextView)view0.findViewById(0x7F0B03C3)).setText(eezf0.a);  // id:ExistingCardsHeaderLabel
        }
    }

    public final boolean A() {
        return (this.j & 0x80) != 0;
    }

    final boolean B() {
        return (this.j & 0x20) != 0;
    }

    public final FrameLayout C() {
        return (FrameLayout)this.a;
    }

    public final int c() {
        return this.g == -1 ? this.c : this.g;
    }

    public final List d() {
        return (this.j & 0x400) != 0 || (this.k == null || this.k.size() == 0) ? uq.t : this.l;
    }

    public final void e(Object object0) {
        if(object0 == null) {
            this.f(0x400);
            return;
        }
        if((0x400 & this.j) == 0) {
            if(this.k == null) {
                ArrayList arrayList0 = new ArrayList();
                this.k = arrayList0;
                this.l = DesugarCollections.unmodifiableList(arrayList0);
            }
            this.k.add(object0);
        }
    }

    public final void f(int v) {
        this.j |= v;
    }

    public final int fp() {
        return this.q == null ? -1 : this.q.mg(this);
    }

    public final int fq() {
        if(this.r != null) {
            RecyclerView recyclerView0 = this.q;
            if(recyclerView0 != null) {
                tk tk0 = recyclerView0.m;
                if(tk0 != null) {
                    int v = recyclerView0.mg(this);
                    return v == -1 ? -1 : tk0.hD(this.r, this, v);
                }
            }
        }
        return -1;
    }

    public final void g() {
        this.d = -1;
        this.g = -1;
    }

    final void h() {
        List list0 = this.k;
        if(list0 != null) {
            list0.clear();
        }
        this.j &= 0xFFFFFBFF;
    }

    final void i() {
        this.j &= -33;
    }

    public final void j() {
        this.j &= 0xFFFFFEFF;
    }

    public final void k(int v, boolean z) {
        if(this.d == -1) {
            this.d = this.c;
        }
        int v1 = this.g;
        if(v1 == -1) {
            v1 = this.c;
            this.g = v1;
        }
        if(z) {
            this.g = v1 + v;
        }
        this.c += v;
        View view0 = this.a;
        if(view0.getLayoutParams() != null) {
            ((ty)view0.getLayoutParams()).e = true;
        }
    }

    final void l() {
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.u = 0;
        this.h = null;
        this.i = null;
        this.h();
        this.o = 0;
        this.p = -1;
        RecyclerView.F(this);
    }

    public final void m(int v, int v1) {
        this.j = v & v1 | this.j & ~v1;
    }

    public final void n(boolean z) {
        int v1;
        int v = z ? this.u - 1 : this.u + 1;
        this.u = v;
        if(v < 0) {
            this.u = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this.toString());
            return;
        }
        if(!z && v == 1) {
            v1 = this.j | 16;
            goto label_11;
        }
        if(z && v == 0) {
            v1 = this.j & -17;
        label_11:
            this.j = v1;
        }
    }

    final void o(uf uf0, boolean z) {
        this.m = uf0;
        this.n = z;
    }

    final void p() {
        this.m.o(this);
    }

    public final boolean q(int v) {
        return (this.j & v) != 0;
    }

    final boolean r() {
        return this.a.getParent() != null && this.a.getParent() != this.q;
    }

    public final boolean s() {
        return (this.j & 1) != 0;
    }

    public final boolean t() {
        return (this.j & 4) != 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder((this.getClass().isAnonymousClass() ? "ViewHolder" : this.getClass().getSimpleName()) + "{" + Integer.toHexString(this.hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if(this.w()) {
            stringBuilder0.append(" scrap ");
            stringBuilder0.append((this.n ? "[changeScrap]" : "[attachedScrap]"));
        }
        if(this.t()) {
            stringBuilder0.append(" invalid");
        }
        if(!this.s()) {
            stringBuilder0.append(" unbound");
        }
        if(this.z()) {
            stringBuilder0.append(" update");
        }
        if(this.v()) {
            stringBuilder0.append(" removed");
        }
        if(this.A()) {
            stringBuilder0.append(" ignored");
        }
        if(this.x()) {
            stringBuilder0.append(" tmpDetached");
        }
        if(!this.u()) {
            stringBuilder0.append(" not recyclable(" + this.u + ")");
        }
        if((this.j & 0x200) != 0 || this.t()) {
            stringBuilder0.append(" undefined adapter position");
        }
        if(this.a.getParent() == null) {
            stringBuilder0.append(" no parent");
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    public final boolean u() {
        return (this.j & 16) == 0 && !this.a.hasTransientState();
    }

    public final boolean v() {
        return (this.j & 8) != 0;
    }

    final boolean w() {
        return this.m != null;
    }

    public final boolean x() {
        return (this.j & 0x100) != 0;
    }

    public final boolean y() {
        return (this.j & 2) != 0;
    }

    final boolean z() {
        return (this.j & 2) != 0;
    }
}

