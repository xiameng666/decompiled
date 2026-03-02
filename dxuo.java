import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

public final class dxuo extends dxva {
    public AutoCompleteTextView a;
    private TextInputLayout ao;
    public int b;

    public dxuo() {
        this.b = -1;
    }

    @Override  // dxva
    protected final String A() {
        gtlg gtlg0 = edok.a(this.d.f, this.d.g);
        String s = this.d.g;
        gtlg gtlg1 = edok.a(this.d.f + this.y(), s);
        return this.y() <= 0L ? this.getString(0x7F151CCE, new Object[]{fscd.c(gtlg0)}) : this.getString(0x7F151FC6, new Object[]{fscd.c(gtlg1)});  // string:pay_current_balance_label "Current balance: %1$s"
    }

    @Override  // dxva
    protected final void B(View view0) {
        TextInputLayout textInputLayout0 = (TextInputLayout)view0.findViewById(0x7F0B0576);  // id:ManualAmount
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0252);  // id:CurrentBalance
        textView0.setTextColor(fyho.b(textView0, 0x7F0402C9));  // attr:colorOnBackground
        textInputLayout0.w(fyho.b(textView0, 0x7F04030C));  // attr:colorPrimary
        ColorStateList colorStateList0 = fyho.g(this.requireContext(), 0x7F04030C);  // attr:colorPrimary
        gftb.check(colorStateList0);
        textInputLayout0.S(colorStateList0);
    }

    @Override  // dxva
    protected final void D(View view0, String s) {
        TextInputLayout textInputLayout0 = (TextInputLayout)view0.findViewById(0x7F0B0576);  // id:ManualAmount
        TextView textView0 = (TextView)view0.findViewById(0x7F0B0252);  // id:CurrentBalance
        int v = fyho.b(textView0, 0x7F0402C1);  // attr:colorError
        textView0.setTextColor(v);
        textView0.setText(s);
        textInputLayout0.w(v);
        ColorStateList colorStateList0 = fyho.g(this.requireContext(), 0x7F0402C1);  // attr:colorError
        gftb.check(colorStateList0);
        textInputLayout0.S(colorStateList0);
    }

    @Override  // dxva
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        if(this.d.h) {
            View view0 = layoutInflater0.inflate(0x7F0E0D4F, viewGroup0, false);  // layout:wallet_gm3_amount_manual_input
            this.I(view0);
            return view0;
        }
        View view1 = layoutInflater0.inflate(0x7F0E0D4E, viewGroup0, false);  // layout:wallet_gm3_amount_input
        AutoCompleteTextView autoCompleteTextView0 = (AutoCompleteTextView)view1.findViewById(0x7F0B07D9);  // id:SelectAmountMaterialTextView
        this.a = autoCompleteTextView0;
        autoCompleteTextView0.setSaveEnabled(false);
        TextInputLayout textInputLayout0 = (TextInputLayout)view1.findViewById(0x7F0B057B);  // id:MaterialOutlinedEntryContainer
        this.ao = textInputLayout0;
        textInputLayout0.O((this.ah > 0 ? this.ah : 0x7F152455));  // string:pay_wallet_setting_autoload_amount_label "Amount to add"
        Context context0 = this.getContext();
        gftb.check(context0);
        dxuu dxuu0 = new dxuu(context0, this.d.g, this.d.i, this.d.e);
        this.a.setAdapter(dxuu0);
        this.a.setOnItemClickListener(new dxun(this, view1, dxuu0));
        if(dxuu0.getCount() > 0) {
            this.b = dxuu0.a;
            this.H(dxuu0.a(dxuu0.a).longValue());
            this.a.setText(this.F(dxuu0.a(this.b).longValue()), false);
        }
        return view1;
    }

    @Override  // dxva
    public final long y() {
        if(!this.d.h) {
            return this.b == -1 ? 0L : ((long)(((Long)this.a.getAdapter().getItem(this.b))));
        }
        return super.y();
    }

    public static dxuo z(ftej ftej0, boolean z, int v) {
        if(ftej0.h && !z) {
            ((ggtj)dxuo.c.i()).x("Manual input does not support hiding current balance yet.");
        }
        dxuo dxuo0 = new dxuo();
        Bundle bundle0 = new Bundle();
        bundle0.putByteArray("ProcessPaymentConfig", ftej0.toBytesArray());
        bundle0.putBoolean("showCurrentBalanceDisplay", z);
        bundle0.putInt("inputLabelResId", v);
        dxuo0.setArguments(bundle0);
        return dxuo0;
    }
}

