import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.material.textfield.TextInputLayout;

public final class dxum extends dxuc {
    public TextInputLayout au;
    public static final int av;
    private View aw;
    private AutoCompleteTextView ax;

    @Override  // dxuc
    protected final void A(gtuw gtuw0, long v) {
        super.A(gtuw0, v);
        if(this.ak) {
            this.aw.setVisibility(8);
        }
    }

    @Override  // dxuc
    public final void E() {
        dxtq dxtq0 = (dxtq)this.ax.getAdapter();
        int v = dxtq0.a(this.ai);
        if(dxtq0.b(v).b.i()) {
            return;
        }
        dxtq0.e(v);
    }

    @Override  // dxuc
    public final void F(long v) {
        if(!(this.ax.getAdapter() instanceof dxtq)) {
            throw new IllegalArgumentException("Unrecognized adapter.");
        }
        ((dxtq)this.ax.getAdapter()).d(v);
    }

    @Override  // dxuc
    protected final void G(long v) {
        Context context0 = this.getContext();
        gftb.check(context0);
        dxtq dxtq0 = new dxtq(context0, this.am, this.c, this.aj, this.ak, false);
        int v1 = dxtq0.a(v);
        if(this.ak) {
            this.ax.setAdapter(dxtq0);
            this.au.ar();
            this.au.aq();
            ImageView imageView0 = (ImageView)this.au.findViewById(0x7F0B2279);  // id:text_input_start_icon
            gftb.check(imageView0);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
            gftb.check(viewGroup$LayoutParams0);
            Resources resources0 = this.requireContext().getResources();
            int v2 = resources0.getDimensionPixelSize(0x7F0714A6);  // dimen:wallet_gm3_instrument_logo_size
            int v3 = resources0.getDimensionPixelSize(0x7F0714A5);  // dimen:wallet_gm3_instrument_logo_padding_horizontal
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).height = -2;
            ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).width = v2 + (v3 + v3);
            imageView0.setAdjustViewBounds(false);
            imageView0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
            imageView0.setPadding(v3, 0, v3, 0);
            this.ax.setOnItemClickListener(new dxuj(this, dxtq0));
            if(dxtq0.getCount() > 0) {
                dxtq0.e(v1);
                this.J(v1);
            }
            return;
        }
        dxtq0.e(v1);
    }

    public static dxum I(int v, hkug hkug0, long v1, String s, boolean z, gfsx gfsx0) {
        dxum dxum0 = new dxum();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("billableService", v);
        bundle0.putLong("defaultInstrumentId", v1);
        bundle0.putString("storedValueName", s);
        bundle0.putBoolean("collapsed", z);
        if(gfsx0.i()) {
            bundle0.putString("merchantIdOverride", ((String)gfsx0.d()));
        }
        if(hkug0 != null) {
            bundle0.putByteArray("transitAgencyInfo", hkug0.toBytesArray());
        }
        dxum0.setArguments(bundle0);
        return dxum0;
    }

    public final void J(int v) {
        dxtq dxtq0 = (dxtq)this.ax.getAdapter();
        if(dxtq0.b(v).b.i()) {
            this.au.aa(null);
        }
        else {
            int v1 = dxtq0.b(v).c;
            if(v1 > 0) {
                this.au.aa(kv.a(this.au.getContext(), v1));
            }
            else if(dxtq0.b(v).d.i()) {
                ((txx)dxtq0.b(v).d.d()).p(new dxul(this));
            }
        }
        if(dxtq0.b(v).b.i()) {
            this.ax.setText(((gtux)dxtq0.b(v).b.d()).d, false);
            return;
        }
        this.ax.setText(((gtur)dxtq0.b(v).a.d()).d, false);
    }

    @Override  // dxuc
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E04A0, viewGroup0, false);  // layout:gm3_instrument_select
        this.ap = (ProgressBar)view0.findViewById(0x7F0B04D0);  // id:InstrumentOptionProgress
        this.aq = (ImageView)view0.findViewById(0x7F0B066A);  // id:PaymentInstrumentLogo
        this.aw = view0.findViewById(0x7F0B054A);  // id:LogoContainer
        this.ax = (AutoCompleteTextView)view0.findViewById(0x7F0B057C);  // id:MaterialPaymentInstrumentDropDown
        this.au = (TextInputLayout)view0.findViewById(0x7F0B057D);  // id:MaterialPaymentInstrumentDropDownContainer
        view0.setOnTouchListener(new dxuk(this));
        this.B();
        return view0;
    }

    @Override  // dxuc
    public final gfsx z() {
        return this.ax != null && this.ax.getAdapter() != null ? gfsx.l(((dxtq)this.ax.getAdapter()).c()) : gfqx.a;
    }
}

