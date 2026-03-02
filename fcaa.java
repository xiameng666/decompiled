import android.app.Dialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.Locale;

public final class fcaa extends gcya implements gcjk {
    public gcjn ag;
    public LinearLayout ah;
    public final ArrayList ai;
    public final ArrayList aj;
    public final ArrayList ak;
    private ContextThemeWrapper al;
    private gevx am;
    private gcqy an;
    private LogContext ao;

    public fcaa() {
        this.ai = new ArrayList();
        this.aj = new ArrayList();
        this.ak = new ArrayList();
    }

    @Override  // gcjk
    public final void lr() {
        ArrayList arrayList0 = this.ak;
        int v = arrayList0.size();
        for(int v2 = 0; v2 < v; ++v2) {
            gcjo.c(arrayList0.get(v2), ((gcyd)arrayList0.get(v2)).l().c, this.ag);
        }
        ArrayList arrayList1 = this.ai;
        int v3 = arrayList1.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            gcjo.c(arrayList1.get(v1), ((InfoMessageView)arrayList1.get(v1)).g.c, this.ag);
        }
        this.ag = null;
    }

    @Override  // de
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        int v = bundle1.getInt("themeResourceId");
        this.al = new ContextThemeWrapper(this.getContext(), v);
        this.ao = (LogContext)bundle1.getParcelable("parentLogContext");
        this.am = (gevx)gciq.a(this.getArguments(), "argDialogProto", ((Parser)((ProtoLiteMessage)gevx.a).jf(7, null)));
    }

    // This method was un-flattened
    @Override  // de
    public final Dialog onCreateDialog(Bundle bundle0) {
        int v7;
        LayoutInflater layoutInflater1;
        View view0;
        int v6;
        gcqy gcqy0 = gcqy.e(bundle0);
        this.an = gcqy0;
        if(gcqy0 == null) {
            this.an = gcqy.c();
        }
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(new int[]{0x7F0400B3});  // attr:alertDialogTheme
        int v = typedArray0.getResourceId(0, 0x7F160F21);  // style:Theme_Wallet_Material_Light_Alert_Dialog
        typedArray0.recycle();
        Dialog dialog0 = new kc(this.getContext(), v);
        dialog0.requestWindowFeature(1);
        dialog0.setContentView(0x7F0E0D2E);  // layout:wallet_fragment_dialog
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.getContext());
        this.ah = (LinearLayout)dialog0.findViewById(0x7F0B0FE3);  // id:content_container
        int v1 = 0;
        while(v1 < this.am.c.size()) {
            gevw gevw0 = (gevw)this.am.c.get(v1);
            LinearLayout linearLayout0 = this.ah;
            LinearLayout linearLayout1 = new LinearLayout(this.al);
            linearLayout1.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int v2 = gfhl.a(gevw0.d) == 0 ? 1 : gfhl.a(gevw0.d);
            int v3 = 0x800003;
            switch(v2 - 1) {
                case 1: {
                    break;
                }
                case 2: {
                    v3 = 0x800005;
                    break;
                }
                case 3: {
                    v3 = 17;
                    break;
                }
                default: {
                    Log.w("GcoreDialogFragment", String.format(Locale.US, "Unknown field alignment: %d", ((int)(v2 - 1))));
                }
            }
            linearLayout1.setGravity(v3);
            int v4 = this.an.a();
            int v5 = gevw0.b;
            switch(v5) {
                case 0: {
                    break;
                }
                case 1: {
                    v6 = 1;
                    break;
                }
                case 2: {
                    v6 = 2;
                    break;
                }
                case 3: {
                    v6 = 3;
                    break;
                }
                default: {
                    throw null;
                }
            }
            switch(v6 - 1) {
                case 0: {
                    view0 = fbey.a(this.ag, (v5 == 1 ? ((gfgr)gevw0.c) : gfgr.a), layoutInflater0, null, null, linearLayout1, 0, 0, v4);
                    layoutInflater1 = layoutInflater0;
                    this.ai.add(view0);
                    v7 = 0;
                    break;
                }
                case 1: {
                    layoutInflater1 = layoutInflater0;
                    gcyd gcyd0 = gcyh.a((v5 == 2 ? ((gevs)gevw0.c) : gevs.a), this.al, this.ag, this.ao, layoutInflater1, linearLayout1, v4);
                    this.ak.add(gcyd0);
                    view0 = (View)gcyd0;
                    v7 = 0x1F;
                    break;
                }
                case 2: {
                    view0 = ImageWithCaptionView.k((v5 == 3 ? ((gfgo)gevw0.c) : gfgo.a), this.al, linearLayout1, v4, 0, 0, this.ao);
                    linearLayout1.addView(view0);
                    this.aj.add(view0);
                    v7 = 11;
                    layoutInflater1 = layoutInflater0;
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Empty or unknown field in Dialog.");
                }
            }
            view0.setTag(0x7F0B13C8, Integer.valueOf(v7));  // id:field_type
            linearLayout0.addView(linearLayout1);
            ++v1;
            layoutInflater0 = layoutInflater1;
        }
        return dialog0;
    }

    @Override  // de
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.an.h(bundle0);
    }
}

