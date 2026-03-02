import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.widget.componentlayouts.dropdowns.SpinnerWithOnSetSelectionListener;
import dagger.internal.Preconditions;
import java.text.MessageFormat;

public class dxuc extends dokz implements eflx {
    protected static final bboh a;
    protected gfsx ag;
    protected gfsx ah;
    protected long ai;
    protected String aj;
    protected boolean ak;
    public dxud al;
    protected gtuw am;
    protected long an;
    protected gfsx ao;
    protected ProgressBar ap;
    public ImageView aq;
    public boolean ar;
    public dxto as;
    public static final int at;
    private SpinnerWithOnSetSelectionListener au;
    private ListView av;
    private byte[] aw;
    dxte b;
    tyb c;
    fhwk d;

    static {
        dxuc.a = bboh.b("Pay", bbcu.cZ);
    }

    public dxuc() {
        this.ag = gfqx.a;
        this.ah = gfqx.a;
        this.ao = gfqx.a;
        this.ar = false;
    }

    protected void A(gtuw gtuw0, long v) {
        if(this.aw()) {
            return;
        }
        if(this.ak) {
            this.aq.setVisibility(0);
        }
        this.ap.setVisibility(8);
        this.am = gtuw0;
        fm fm0 = this.getChildFragmentManager();
        hbzs hbzs0 = this.am.f == null ? hbzs.a : this.am.f;
        if(hbzs0 != null && hbzs0.b.size() != 0) {
            Bundle bundle0 = new Bundle();
            dxug dxug0 = new dxug();
            Bundle bundle1 = new Bundle();
            StringBuilder stringBuilder0 = new StringBuilder();
            for(Object object0: hbzs0.b) {
                hbzt hbzt0 = (hbzt)object0;
                int v1 = hbzt0.c.size();
                String[] arr_s = new String[v1];
                for(int v2 = 0; v2 < v1; ++v2) {
                    arr_s[v2] = String.format("<a href=\'%s\'>%s</a>", ((hbzu)hbzt0.c.get(v2)).c, ((hbzu)hbzt0.c.get(v2)).b);
                }
                stringBuilder0.append(new MessageFormat(hbzt0.b).format(arr_s));
                stringBuilder0.append("<br />");
            }
            bundle1.putString("legalText", stringBuilder0.toString());
            bundle1.putInt("requestCode", 10020);
            bundle1.putParcelable("tag", bundle0);
            dxug0.setArguments(bundle1);
            dxug0.ag = this;
            dxug0.show(fm0, null);
            this.aw = (this.am.f == null ? hbzs.a : this.am.f).c.toByteArray();
            this.an = this.am.d;
            return;
        }
        xob xob0 = this.an();
        gftb.check(xob0);
        dxtg.i(xob0, () -> {
            Context context0 = this.getContext();
            gftb.check(context0);
            dxtq dxtq0 = new dxtq(context0, this.am, this.c, this.aj, this.ak, true);
            int v1 = dxtq0.a(v);
            if(this.ak) {
                this.au.setAdapter(dxtq0);
                SpinnerWithOnSetSelectionListener spinnerWithOnSetSelectionListener0 = this.au;
                spinnerWithOnSetSelectionListener0.e = new dxtr(this, dxtq0);
                if(dxtq0.getCount() > 0) {
                    this.au.setSelection(v1);
                }
                return;
            }
            this.av.setAdapter(dxtq0);
            this.av.setOnItemClickListener(new dxts(this, dxtq0));
            dxtq0.e(v1);
        });
        this.al.L(this.am);
    }

    public final void B() {
        this.D(this.ai);
    }

    public final void D(long v) {
        this.aq.setVisibility(8);
        this.ap.setVisibility(0);
        dxtz dxtz0 = new dxtz(this, v);
        if(this.ah.i()) {
            dxte dxte0 = this.b;
            Object object0 = this.ah.d();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtuv.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gtuv)hftp0.b_message).d = object0;
            ((gtuv)hftp0.b_message).c = 4;
            dxte0.f(hftp0, dxtz0);
            return;
        }
        if(this.ag.i()) {
            dxte dxte1 = this.b;
            gtla gtla0 = (gtla)this.ag.d();
            gfsx gfsx0 = this.ao;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gtuv.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gtuv gtuv0 = (gtuv)hftp1.b_message;
            gtuv0.d = gtla0.a();
            gtuv0.c = 2;
            if(gfsx0.i()) {
                String s = (String)gfsx0.d();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gtuv gtuv1 = (gtuv)hftp1.b_message;
                gtuv1.b |= 1;
                gtuv1.g = s;
            }
            dxte1.f(hftp1, dxtz0);
            return;
        }
        ((ggtj)dxuc.a.i()).x("InstrumentSelectFragment: Neither TransitAgencyInfo nor BillableService were set!");
    }

    public void E() {
        throw null;
    }

    public void F(long v) {
        if(!(this.au.getAdapter() instanceof dxtq)) {
            throw new IllegalArgumentException("Unrecognized adapter.");
        }
        ((dxtq)this.au.getAdapter()).d(v);
    }

    // Detected as a lambda impl.
    protected void G(long v) {
        Context context0 = this.getContext();
        gftb.check(context0);
        dxtq dxtq0 = new dxtq(context0, this.am, this.c, this.aj, this.ak, true);
        int v1 = dxtq0.a(v);
        if(this.ak) {
            this.au.setAdapter(dxtq0);
            SpinnerWithOnSetSelectionListener spinnerWithOnSetSelectionListener0 = this.au;
            spinnerWithOnSetSelectionListener0.e = new dxtr(this, dxtq0);
            if(dxtq0.getCount() > 0) {
                this.au.setSelection(v1);
            }
            return;
        }
        this.av.setAdapter(dxtq0);
        this.av.setOnItemClickListener(new dxts(this, dxtq0));
        dxtq0.e(v1);
    }

    protected final void H() {
        xob xob0 = this.an();
        if(xob0 != null) {
            View view0 = xob0.getCurrentFocus();
            if(view0 != null) {
                ((InputMethodManager)xob0.getSystemService("input_method")).hideSoftInputFromWindow(view0.getWindowToken(), 0);
            }
        }
    }

    @Override  // eflx
    public final void g(int v, int v1, Parcelable parcelable0) {
        if(v1 != 10020) {
            return;
        }
        if(v != -1) {
            eflw eflw0 = new eflw();
            eflw0.c = this.getString(0x7F151F3B);  // string:pay_legal_message_reject_dialog_message "You must accept the terms of service 
                                                   // before selecting a payment method"
            eflw0.b = this.getString(0x7F151F3C);  // string:pay_legal_message_reject_dialog_title "Terms of Service for Payment"
            eflw0.d = this.getString(0x7F1508A8);  // string:common_ok "OK"
            eflz eflz0 = eflw0.a();
            xob xob0 = this.an();
            gftb.check(xob0);
            eflz0.show(xob0.getSupportFragmentManager(), null);
            return;
        }
        dxte dxte0 = this.b;
        byte[] arr_b = this.aw;
        gtla gtla0 = (gtla)this.ag.f(gtla.a);
        long v2 = this.an;
        dxub dxub0 = new dxub(this);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtup.a).v_newBuilder();
        ByteString hfsf0 = ByteString.copyFrom(arr_b);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gtup)hftv0).b = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gtup gtup0 = (gtup)hftp0.b_message;
        gtup0.c = gtla0.a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gtup)hftp0.b_message).d = v2;
        gtup gtup1 = (gtup)hftp0.N_build();
        dptv.l(dxte0.a, dpuj.bC, ((MessageLite)gtup1), ((MessageLite)gtuq.a), dxub0);
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(this.as == null) {
            dolg dolg0 = this.ap();
            Preconditions.b(dolg0);
            doly doly0 = dolz.a(this);
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            this.as = new dxto(dolg0, doly0, domv0);
        }
        this.as.inject(this);
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null && (this.getParentFragment() instanceof dxud)) {
            this.ag = gfsx.l(gtla.b(bundle1.getInt("billableService")));
            byte[] arr_b = bundle1.getByteArray("transitAgencyInfo");
            if(arr_b == null && !this.ag.i()) {
                ((ggtj)dxuc.a.i()).x("Either TransitAgencyInfo or BillableService must be set!");
                return;
            }
            if(arr_b != null) {
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hkug.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    this.ah = gfsx.m(((hkug)hftv0));
                }
                catch(hfur unused_ex) {
                    ((ggtj)dxuc.a.i()).x("Unable to parse TransitAgencyInfo proto");
                    return;
                }
            }
            this.ai = bundle1.getLong("defaultInstrumentId");
            this.aj = gfta.b(bundle1.getString("storedValueName"));
            this.ak = bundle1.getBoolean("collapsed", true);
            this.ao = gfsx.l(bundle1.getString("merchantIdOverride"));
            du du0 = this.getParentFragment();
            gftb.check(du0);
            this.al = (dxud)du0;
            return;
        }
        ((ggtj)dxuc.a.i()).x("Arguments cannot be null, and activity must implement InstrumentSelectListener");
    }

    @Override  // du
    public View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        View view0 = layoutInflater0.inflate(0x7F0E04F9, viewGroup0, false);  // layout:instrument_select
        this.d.f(view0, this.d.a.a(206354));
        this.ap = (ProgressBar)view0.findViewById(0x7F0B04D0);  // id:InstrumentOptionProgress
        this.aq = (ImageView)view0.findViewById(0x7F0B066A);  // id:PaymentInstrumentLogo
        this.au = (SpinnerWithOnSetSelectionListener)view0.findViewById(0x7F0B0666);  // id:PaymentInstrument
        this.av = (ListView)view0.findViewById(0x7F0B0669);  // id:PaymentInstrumentList
        if(this.ak) {
            this.au.setVisibility(0);
            this.av.setVisibility(8);
        }
        else {
            this.au.setVisibility(8);
            this.aq.setVisibility(8);
            this.av.setVisibility(0);
        }
        this.au.setOnTouchListener(new dxtt(this));
        view0.setOnTouchListener(new dxtu(this));
        this.B();
        return view0;
    }

    public final Pair y(byte[] arr_b, edtj edtj0, du du0) {
        gfsx gfsx0 = this.z();
        if(!gfsx0.i()) {
            ((ggtj)dxuc.a.i()).x("Invalid InstrumentOption: option is absent in drop down");
            return null;
        }
        Context context0 = this.getContext();
        if(context0 == null) {
            return null;
        }
        if(((dxta)gfsx0.d()).b.i()) {
            dnqd.c(context0, "Pay_Add Instrument");
            return Pair.create(null, new dxtv(this, du0, context0, edtj0, gfsx0));
        }
        if(!((dxta)gfsx0.d()).a.i()) {
            ((ggtj)dxuc.a.i()).x("Invalid InstrumentOption: neither instrument nor newInstrument are present.");
            return null;
        }
        Object object0 = ((dxta)gfsx0.d()).a.d();
        if((((gtur)object0).b & 2) != 0) {
            geom geom0 = ((gtur)object0).h;
            if(geom0 == null) {
                geom0 = geom.a;
            }
            if(geol.a(geom0.b) == 3) {
            label_23:
                if(arr_b == null) {
                    return Pair.create(object0, new dxtw(du0, edtj0, context0, ((gtur)object0)));
                }
            }
            else {
                geom geom1 = ((gtur)object0).h;
                if(geom1 == null) {
                    geom1 = geom.a;
                }
                if(geol.a(geom1.b) == 6) {
                    goto label_23;
                }
            }
        }
        hbzz hbzz0 = ((gtur)object0).f;
        if(hbzz0 == null) {
            hbzz0 = hbzz.a;
        }
        if((hbzz0.b & 1) != 0) {
            hbzz hbzz1 = ((gtur)object0).f;
            if(hbzz1 == null) {
                hbzz1 = hbzz.a;
            }
            return hbzz1.c.isEmpty() ? Pair.create(object0, null) : Pair.create(object0, new dxtx(du0, edtj0, context0, ((gtur)object0)));
        }
        return Pair.create(object0, null);
    }

    public gfsx z() {
        if(this.ak) {
            SpinnerWithOnSetSelectionListener spinnerWithOnSetSelectionListener0 = this.au;
            if(spinnerWithOnSetSelectionListener0 != null) {
                return gfsx.l(((dxta)spinnerWithOnSetSelectionListener0.getSelectedItem()));
            }
        }
        else {
            ListView listView0 = this.av;
            if(listView0 != null) {
                return gfsx.l(((dxtq)listView0.getAdapter()).c());
            }
        }
        return gfqx.a;
    }
}

