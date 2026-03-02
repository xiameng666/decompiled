import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.wallet.ui.common.ProgressSpinnerView;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class fcav extends fbzh implements gcjk, gcjp, gcjs, gczo {
    TextView aj;
    final ArrayList ak;
    public gcjn al;
    public Context am;
    boolean an;
    public fcaw ao;
    private hces ap;
    private final ArrayList aq;

    public fcav() {
        this.ak = new ArrayList(2);
        this.aq = new ArrayList(2);
        this.an = false;
    }

    public final hcet F() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hcet.a).v_newBuilder();
        ByteString hfsf0 = this.ap.g;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hcet hcet0 = (hcet)hftp0.b_message;
        hfsf0.getClass();
        hcet0.b |= 1;
        hcet0.d = hfsf0;
        ArrayList arrayList0 = this.ak;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            geww geww0 = ((fcab)arrayList0.get(v1)).ao(Bundle.EMPTY);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hcet hcet1 = (hcet)hftp0.b_message;
            geww0.getClass();
            hfuo hfuo0 = hcet1.c;
            if(!hfuo0.c()) {
                hcet1.c = ProtoLiteMessage.E(hfuo0);
            }
            hcet1.c.add(geww0);
        }
        return (hcet)hftp0.N_build();
    }

    public final void H() {
        if(this.an && this.al != null) {
            ArrayList arrayList0 = this.aq;
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                this.al.c(((gcjm)arrayList0.get(v1)));
            }
            arrayList0.clear();
        }
        this.an = false;
    }

    public final boolean J() {
        return this.isResumed() && gczs.j(this.ai);
    }

    @Override  // gcjp
    public final void K(gffq gffq0, List list0) {
        int v = gfev.a(gffq0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 11) {
            Locale locale0 = Locale.US;
            int v2 = gfev.a(gffq0.e);
            if(v2 != 0) {
                v1 = v2;
            }
            throw new IllegalArgumentException(String.format(locale0, "FilterCategoryDialogFragment does not handle resulting action type %s", ((int)(v1 - 1))));
        }
        fcaw fcaw0 = this.ao;
        fcaw0.c = this.F();
        this.dismiss();
    }

    @Override  // gczo
    public final void T(int v, Bundle bundle0) {
        if(v == 4 && this.J()) {
            this.H();
        }
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        int v = gffw.a(gfga0.e);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        if(v - 1 != 6) {
            Locale locale0 = Locale.US;
            int v2 = gffw.a(gfga0.e);
            if(v2 != 0) {
                v1 = v2;
            }
            throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v1 - 1))));
        }
        return true;
    }

    @Override  // gdbw
    public final long bs() {
        throw null;
    }

    @Override  // gcjs
    public final void lk(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gcjm gcjm0 = (gcjm)arrayList0.get(v1);
            gfga gfga0 = gcjm0.a;
            int v2 = gffw.a(gfga0.e);
            int v3 = 1;
            if(v2 == 0) {
                v2 = 1;
            }
            if(v2 - 1 != 6) {
                Locale locale0 = Locale.US;
                int v4 = gffw.a(gfga0.e);
                if(v4 != 0) {
                    v3 = v4;
                }
                throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v3 - 1))));
            }
            this.aq.add(gcjm0);
        }
    }

    @Override  // gcjk
    public final void lr() {
        ArrayList arrayList0 = this.ak;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((fcab)arrayList0.get(v1)).lr();
        }
    }

    @Override  // gcjs
    public final void lt(gcjn gcjn0) {
        this.al = gcjn0;
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(1, 0);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        fcab fcab0;
        Bundle bundle1 = this.getArguments();
        this.ap = (hces)gciq.a(bundle1, "filterCategoryProto", ((Parser)((ProtoLiteMessage)hces.a).jf(7, null)));
        int v = bundle1.getInt("themeResourceId");
        String s = bundle1.getString("analyticsSessionId");
        LogContext logContext0 = (LogContext)bundle1.getParcelable("parentLogContext");
        Context context0 = this.am;
        if(context0 != null) {
            layoutInflater0 = layoutInflater0.cloneInContext(context0);
        }
        boolean z = false;
        View view0 = layoutInflater0.inflate(0x7F0E0E36, viewGroup0, false);  // layout:wallet_view_filter_category_dialog
        this.ah = (ProgressSpinnerView)view0.findViewById(0x7F0B1D4C);  // id:progress_spinner_container
        this.y();
        TextView textView0 = (TextView)view0.findViewById(0x7F0B13DD);  // id:filter_category_title
        this.aj = textView0;
        textView0.setText(this.ap.e);
        ViewGroup viewGroup1 = (ViewGroup)view0.findViewById(0x7F0B2054);  // id:simple_form_container
        ArrayList arrayList0 = this.ak;
        arrayList0.clear();
        ArrayList arrayList1 = this.ai;
        arrayList1.clear();
        for(Object object0: this.ap.h) {
            gewu gewu0 = (gewu)object0;
            if(bundle0 == null) {
                fcab0 = fcab.I(gewu0, v, s, false, logContext0);
                ca ca0 = new ca(this.getChildFragmentManager());
                ca0.u(viewGroup1.getId(), fcab0, (gewu0.c == null ? gewg.a : gewu0.c).c);
                ca0.a();
            }
            else {
                fcab0 = (fcab)this.getChildFragmentManager().h((gewu0.c == null ? gewg.a : gewu0.c).c);
            }
            fcab0.cb = this.al;
            arrayList0.add(fcab0);
            arrayList1.add(new gczs(fcab0));
        }
        gcjo.b(this, this.ap.d, this.al);
        if(bundle0 == null) {
            z = true;
        }
        this.an = z;
        if(this.J()) {
            this.H();
        }
        return view0;
    }

    @Override  // de
    public final void onDismiss(DialogInterface dialogInterface0) {
        super.onDismiss(dialogInterface0);
        this.lr();
        gcjo.c(this, this.ap.d, this.al);
    }

    @Override  // fbzh
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = this.ak;
        int v = arrayList1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(Integer.valueOf(((fcab)arrayList1.get(v1)).ah.getVisibility()));
        }
        bundle0.putIntegerArrayList("fragmentsVisibility", arrayList0);
    }

    @Override  // fbzh
    public final void onViewStateRestored(Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(bundle0 != null) {
            ArrayList arrayList0 = this.ak;
            ArrayList arrayList1 = bundle0.getIntegerArrayList("fragmentsVisibility");
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                LinearLayout linearLayout0 = ((fcab)arrayList0.get(v1)).ah;
                linearLayout0.post(new fcau(linearLayout0, ((int)(((Integer)arrayList1.get(v1))))));
            }
        }
    }

    @Override  // fbzh
    protected final void y() {
        fbgo fbgo0 = this.ah;
        if(fbgo0 != null) {
            fbgo0.Q(((boolean)(this.ag ^ 1)));
        }
        boolean z = this.ag;
        TextView textView0 = this.aj;
        if(textView0 != null) {
            textView0.setEnabled(z);
        }
        ArrayList arrayList0 = this.ak;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((fcab)arrayList0.get(v1)).ll(z);
        }
    }
}

