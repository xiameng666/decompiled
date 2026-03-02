import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;

public final class fcbf extends gdak {
    FormEditText a;
    private final gamj ag;
    private final gdew ah;
    private SummaryExpanderWrapper ai;
    private final ArrayList aj;
    private String ak;
    private long al;
    private int am;
    private String an;
    View b;
    View c;
    final ArrayList d;

    public fcbf() {
        this.ag = new gamj(5);
        this.ah = new gdew();
        this.aj = new ArrayList(1);
        this.d = new ArrayList(1);
    }

    @Override  // gami
    public final gamj B() {
        return this.ag;
    }

    @Override  // gdak
    protected final gewg C() {
        return null;
    }

    @Override  // gdak
    protected final Parser D() {
        return this.getArguments().getString("protoLiteType").equals("protoLiteCreditCardUpdateForm") ? ((Parser)((ProtoLiteMessage)gfaq.b).jf(7, null)) : ((Parser)((ProtoLiteMessage)gfak.d).jf(7, null));
    }

    @Override  // gdcm
    protected final void M() {
        View view0 = this.c;
        if(view0 == null) {
            return;
        }
        boolean z = this.ca;
        view0.setEnabled(z);
        this.ai.setEnabled(z);
    }

    public static fcbf Q(MessageLite hfvm0, String s, long v, int v1, String s1, int v2, LogContext logContext0) {
        fcbf fcbf0 = new fcbf();
        Bundle bundle0 = fcbf.al(v2, hfvm0, logContext0);
        bundle0.putString("formId", s);
        bundle0.putLong("formUiReference", v);
        bundle0.putInt("fieldId", v1);
        bundle0.putString("initialValue", s1);
        if(hfvm0 != null) {
            if((hfvm0 instanceof gfaq)) {
                bundle0.putString("protoLiteType", "protoLiteCreditCardUpdateForm");
            }
            else {
                if(!(hfvm0 instanceof gfak)) {
                    throw new IllegalArgumentException("CardHolderNameFragment should be called only by CreditCardUpdateForm or CreditCardForm");
                }
                bundle0.putString("protoLiteType", "protoLiteCreditCardForm");
                fcbf0.setArguments(bundle0);
                return fcbf0;
            }
        }
        fcbf0.setArguments(bundle0);
        return fcbf0;
    }

    public final String R() {
        return this.a.getText().toString();
    }

    final void S(String s, int v) {
        if(!TextUtils.isEmpty(s)) {
            this.a.k(s, v);
        }
    }

    @Override  // gdak
    public final ArrayList aY() {
        return this.aj;
    }

    @Override  // gdak
    public final long bs() {
        return 0L;
    }

    @Override  // gdak
    public final void lW(int v) {
        View view0 = this.c;
        if(view0 != null) {
            view0.setVisibility(v);
        }
    }

    @Override  // gdaa
    public final boolean la() {
        return this.lb(null);
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.d;
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gdcm
    protected final long lq() {
        return this.al;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        if((getg0.b == null ? gesr.a : getg0.b).b.equals(this.ak) && (getg0.b == null ? gesr.a : getg0.b).c == this.am) {
            this.a.nT(getg0.c, true);
            return true;
        }
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ah;
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        this.ak = bundle1.getString("formId");
        this.al = bundle1.getLong("formUiReference");
        this.am = bundle1.getInt("fieldId");
        this.an = bundle1.getString("initialValue");
    }

    @Override  // gcyg
    public final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D26, viewGroup0, false);  // layout:wallet_fragment_card_holder_name
        this.b = view0;
        SummaryExpanderWrapper summaryExpanderWrapper0 = (SummaryExpanderWrapper)view0.findViewById(0x7F0B105C);  // id:credit_card_name_wrapper
        this.ai = summaryExpanderWrapper0;
        summaryExpanderWrapper0.f(this, 0x7F0B19AC, 0x7F0B0E11);  // id:name_summary_image
        this.c = this.b.findViewById(0x7F0B0E0E);  // id:card_holder_name_container
        FormEditText formEditText0 = (FormEditText)this.b.findViewById(0x7F0B0E0D);  // id:card_holder_name
        this.a = formEditText0;
        formEditText0.R(this.cM());
        this.a.V(this.cL(5));
        gczs gczs0 = new gczs(0L, this.a, this.an);
        this.d.add(gczs0);
        if(bundle0 == null && !TextUtils.isEmpty(this.an)) {
            this.a.k(this.an, 6);
        }
        this.aj.add(this.c);
        return this.b;
    }
}

