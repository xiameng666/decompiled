import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import com.google.android.gms.mdocstore.types.ProvisioningId;
import com.google.android.gms.pay.MdocIntentArgs;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import com.google.android.gms.pay.pass.common.template.toolbar.ToolbarTemplate;
import com.google.android.libraries.tapandpay.ui.walletchip.WalletChipView;
import com.google.android.material.chip.Chip;
import dagger.internal.Preconditions;

public final class dvbe extends dokz {
    public static final bboh a;
    fshk ag;
    dspx ah;
    cqxc ai;
    Account aj;
    dtze ak;
    public gtxg al;
    public gtxo am;
    final gfsx an;
    public ProvisioningId ao;
    public ToolbarTemplate ap;
    public DetailTemplate aq;
    public DetailTemplate ar;
    public View as;
    public View at;
    public Chip au;
    azts av;
    private xni aw;
    DefaultPassInfoCallback b;
    dspu c;
    dspv d;

    static {
        dvbe.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvbe() {
        this.an = gfqx.a;
    }

    public final void A(View view0) {
        if((view0 instanceof ViewGroup)) {
            DisplayMetrics displayMetrics0 = this.requireContext().getResources().getDisplayMetrics();
            int v = (int)TypedValue.applyDimension(1, 4.0f, displayMetrics0);
            int v1 = (int)TypedValue.applyDimension(1, 16.0f, displayMetrics0);
            for(int v2 = 0; v2 < ((ViewGroup)view0).getChildCount(); ++v2) {
                View view1 = ((ViewGroup)view0).getChildAt(v2);
                if(view1.getId() == 0x7F0B02D9) {  // id:DetailListItemMessageIconStart
                    ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
                    if(viewGroup$LayoutParams0 == null) {
                        viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(v1, v1);
                    }
                    else {
                        viewGroup$LayoutParams0.height = v1;
                        viewGroup$LayoutParams0.width = v1;
                        ((jsr)viewGroup$LayoutParams0).l = -1;
                        ((jsr)viewGroup$LayoutParams0).setMargins(0, v, 0, 0);
                    }
                    view1.setLayoutParams(viewGroup$LayoutParams0);
                }
                else {
                    this.A(view1);
                }
            }
        }
    }

    public final void B(WalletChipView walletChipView0, int v, int v1, String s) {
        gze gze0 = new gze(0xDE6F23D0, true, new funo(new fujt(new fryr(v), new fujn(new fryh(v1), null, new frxo(0x7F04030C)), new dvbd(this, s))));  // attr:colorPrimary
        walletChipView0.h.a(gze0);
    }

    public static final Intent D(gtxg gtxg0) {
        return dlnf.U(gtxg0.b).putExtra("auth_on_back", true);
    }

    public static final ViewGroup E(View view0) {
        return (ViewGroup)view0.findViewById(0x7F0B0320);  // id:DetailListRowItemsContainer
    }

    public static final void F(View view0, Integer integer0, Integer integer1, Integer integer2, Integer integer3) {
        View view1 = ((ViewGroup)view0).getChildAt(0);
        view1.setPadding((integer0 == null ? view1.getPaddingLeft() : ((int)integer0)), (integer1 == null ? view1.getPaddingTop() : ((int)integer1)), (integer2 == null ? view1.getPaddingRight() : ((int)integer2)), (integer3 == null ? view1.getPaddingBottom() : ((int)integer3)));
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        doly doly0 = dolz.a(this);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        dvam dvam0 = new dvam(dolg0, dpsw.a(doly0, this.ap()), dxee.a(doly0));
        this.an.f(dvam0);
        dvam0.inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        gtxo gtxo0;
        super.onCreate(bundle0);
        xni xni0 = (xni)this.requireContext();
        this.aw = xni0;
        xni0.setTitle("");
        Bundle bundle1 = this.am();
        if(bundle1.containsKey("mdocTransactionData")) {
            try {
                byte[] arr_b = bundle1.getByteArray("mdocTransactionData");
                batl.s(arr_b);
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gtxo.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                gtxo0 = (gtxo)hftv0;
            }
            catch(NullPointerException | hfur exception0) {
                a.ae(dvbe.a.j(), "Could not parse mdoc transaction data", exception0);
                gtxo0 = gtxo.a;
            }
        }
        else {
            gtxo0 = gtxo.a;
        }
        this.am = gtxo0;
    }

    @Override  // du
    public final void onCreateOptionsMenu(Menu menu0, MenuInflater menuInflater0) {
        if(hwev.c()) {
            return;
        }
        this.ap.O();
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        String s;
        View view0;
        super.onCreate(bundle0);
        if(hwev.c()) {
            view0 = layoutInflater0.inflate(0x7F0E0570, viewGroup0, false);  // layout:mdoc_activity_details
            this.as = view0;
            Toolbar toolbar0 = (Toolbar)view0.findViewById(0x7F0B08D8);  // id:Toolbar
            toolbar0.t(0x7F151C03);  // string:pay_back "Back"
            toolbar0.x(new dvau(this));
        }
        else {
            view0 = layoutInflater0.inflate(0x7F0E058D, viewGroup0, false);  // layout:mdoc_transaction_details
            ToolbarTemplate toolbarTemplate0 = (ToolbarTemplate)view0.findViewById(0x7F0B08D8);  // id:Toolbar
            this.ap = toolbarTemplate0;
            this.aw.hG(toolbarTemplate0);
            DetailTemplate detailTemplate0 = (DetailTemplate)view0.findViewById(0x7F0B0479);  // id:HeaderTemplate
            this.aq = detailTemplate0;
            detailTemplate0.i(this, gfqx.a);
            this.au = (Chip)view0.findViewById(0x7F0B04AF);  // id:InferredActionViewCard
        }
        DetailTemplate detailTemplate1 = (DetailTemplate)view0.findViewById(0x7F0B032C);  // id:DetailTemplate
        this.ar = detailTemplate1;
        detailTemplate1.i(this, gfqx.a);
        this.at = view0.findViewById(0x7F0B00F6);  // id:BottomCard
        Bundle bundle1 = this.am();
        if(bundle1.containsKey("provisioningIdString")) {
            s = bundle1.getString("provisioningIdString");
        }
        else {
            MdocIntentArgs mdocIntentArgs0 = ednn.b(this).K;
            gftb.check(mdocIntentArgs0);
            s = mdocIntentArgs0.a;
        }
        gftb.check(s);
        ProvisioningId provisioningId0 = new ProvisioningId(s);
        this.ao = provisioningId0;
        evql evql0 = this.ai.k(provisioningId0);
        evql0.b(new dvav(this));
        evql0.A(new dvaw());
        return view0;
    }

    @Override  // du
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        if(hwev.c()) {
            return false;
        }
        if(this.aw != null && menuItem0.getItemId() == 0x102002C) {
            this.aw.onBackPressed();
            return true;
        }
        return this.ap.Q(menuItem0);
    }

    public final String y(gtxg gtxg0, hjzq hjzq0) {
        return duix.a(this.requireContext(), gtxg0, hjzq0);
    }

    public final void z(String s) {
        Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s)).addFlags(0x10000000);
        this.requireContext().startActivity(intent0);
    }
}

