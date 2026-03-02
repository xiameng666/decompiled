import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

public final class dxui extends dxtn {
    private ftej ag;
    private int ah;
    private TextInputLayout ai;
    public AutoCompleteTextView b;
    public int c;
    private static final bboh d;

    static {
        dxui.d = bboh.b("Pay", bbcu.cZ);
    }

    public dxui() {
        this.c = -1;
    }

    public static dxui A(ftej ftej0, int v) {
        dxui dxui0 = new dxui();
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("ProcessPaymentConfig", ftej0.toBytesArray());
        bundle0.putInt("amountLabelResId", v);
        dxui0.setArguments(bundle0);
        return dxui0;
    }

    public final String B(long v) {
        return fscd.e(v, this.ag.g);
    }

    @Override  // dxtn
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            ((ggtj)dxui.d.i()).x("Arguments cannot be null.");
            return;
        }
        this.ah = bundle1.getInt("amountLabelResId");
        try {
            byte[] arr_b = bundle1.getByteArray("ProcessPaymentConfig");
            gftb.check(arr_b);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftej.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.ag = (ftej)hftv0;
        }
        catch(hfur unused_ex) {
            ((ggtj)dxui.d.i()).x("Failed to parse ProcessPaymentConfig bytes.");
        }
    }

    @Override  // dxtn
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E0D4E, viewGroup0, false);  // layout:wallet_gm3_amount_input
        TextInputLayout textInputLayout0 = (TextInputLayout)view0.findViewById(0x7F0B057B);  // id:MaterialOutlinedEntryContainer
        this.ai = textInputLayout0;
        textInputLayout0.O(0x7F152402);  // string:pay_wallet_low_balance_notification_amount_label "Send when balance is below"
        view0.findViewById(0x7F0B07D9).setVisibility(0);  // id:SelectAmountMaterialTextView
        view0.findViewById(0x7F0B0252).setVisibility(4);  // id:CurrentBalance
        AutoCompleteTextView autoCompleteTextView0 = (AutoCompleteTextView)view0.findViewById(0x7F0B07D9);  // id:SelectAmountMaterialTextView
        this.b = autoCompleteTextView0;
        autoCompleteTextView0.setVisibility(0);
        Context context0 = this.getContext();
        gftb.check(context0);
        dxuu dxuu0 = new dxuu(context0, this.ag.g, this.ag.k, this.ag.j);
        this.c = dxuu0.a;
        this.b.setAdapter(dxuu0);
        this.b.setOnItemClickListener(new dxuh(this, dxuu0));
        int v = this.ah;
        if(v > 0) {
            this.ai.O(v);
        }
        this.b.setText(this.B(dxuu0.a(this.c).longValue()), false);
        return view0;
    }

    @Override  // dxtn
    public final long y() {
        return this.c == -1 ? 0L : ((long)(((Long)this.b.getAdapter().getItem(this.c))));
    }
}

