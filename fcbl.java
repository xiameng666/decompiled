import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryValidationEvent;
import com.google.android.gms.wallet.analytics.events.OcrActivityLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.OcrEnabledStateEvent;
import com.google.android.gms.wallet.analytics.events.OcrResultReceivedEvent;
import com.google.android.gms.wallet.ui.component.instrument.creditcard.CreditCardImagesView;
import com.google.android.gms.wallet.ui.component.instrument.creditcard.CvcHintImageView;
import com.google.android.wallet.ui.common.DateEditText;
import com.google.android.wallet.ui.common.FifeNetworkImageView;
import com.google.android.wallet.ui.common.FormEditText;
import com.google.android.wallet.ui.common.MaterialFieldLayout;
import com.google.android.wallet.ui.creditcard.CreditCardNumberEditText;
import com.google.android.wallet.ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class fcbl extends gdak implements View.OnClickListener, View.OnFocusChangeListener, AdapterView.OnItemClickListener, gcpc, gcpd {
    View a;
    private Drawable aG;
    private View aH;
    private View aI;
    private Intent aJ;
    private final ArrayList aK;
    private final ArrayList aL;
    private TextView aM;
    private gfhb aN;
    private gcpe aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    public DateEditText ag;
    ImageView ah;
    public FormEditText ai;
    View aj;
    LinearLayout ak;
    ImageView al;
    View am;
    MaterialFieldLayout an;
    boolean ao;
    public gfaw ap;
    public CvcHintImageView aq;
    boolean ar;
    public boolean as;
    public boolean at;
    public String au;
    public static final int av;
    private final gamj aw;
    private final gdew ax;
    private SummaryExpanderWrapper ay;
    private RelativeLayout az;
    public CreditCardNumberEditText b;
    public CreditCardImagesView c;
    public FormEditText d;

    public fcbl() {
        this.aw = new gamj(4);
        this.ax = new gdew();
        this.ao = false;
        this.aK = new ArrayList(3);
        this.aL = new ArrayList(3);
        this.aN = gfhb.a;
        this.aP = false;
        this.ar = true;
        this.aQ = false;
        this.at = false;
        this.aR = false;
        this.aS = false;
        this.aT = false;
    }

    @Override  // gami
    public final gamj B() {
        return this.aw;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((gfak)this.aA).f;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)gfak.d).jf(7, null);
    }

    @Override  // gdcm
    protected final void M() {
        if(this.aH != null) {
            boolean z = this.ca;
            ImageView imageView0 = this.al;
            if(imageView0 != null) {
                bbqv.b(imageView0, z);
            }
            bbqv.b(this.aH, z);
            bbqv.b(this.aI, z);
            this.ay.setEnabled(z);
        }
    }

    public final String Q() {
        gfag gfag0 = this.b.f();
        return gfag0 == null ? "" : (gfag0.e == null ? gfgo.a : gfag0.e).k + " - " + this.b.h();
    }

    final void R(boolean z) {
        AppCompatImageView appCompatImageView0;
        boolean z1;
        CreditCardImagesView creditCardImagesView0 = this.c;
        if(creditCardImagesView0 != null) {
            creditCardImagesView0.setVisibility(8);
        }
        CreditCardImagesView creditCardImagesView1 = (CreditCardImagesView)this.a.findViewById((z ? 0x7F0B1057 : 0x7F0B1056));  // id:credit_card_images_inline
        this.c = creditCardImagesView1;
        creditCardImagesView1.setVisibility(0);
        if(this.c.getChildCount() == 0) {
            CreditCardImagesView creditCardImagesView2 = this.c;
            hfuo hfuo0 = ((gfak)this.aA).g;
            creditCardImagesView2.removeAllViews();
            creditCardImagesView2.c = z;
            ArrayList arrayList0 = new ArrayList(hfuo0.size());
            int v = creditCardImagesView2.a().a();
            int v1 = creditCardImagesView2.getResources().getDimensionPixelSize(0x7F071566);  // dimen:wallet_uic_credit_card_icon_width
            int v2 = creditCardImagesView2.getResources().getDimensionPixelSize(0x7F071565);  // dimen:wallet_uic_credit_card_icon_height
            Iterator iterator0 = hfuo0.iterator();
            int v3 = -1;
            while(true) {
                z1 = true;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                gfag gfag0 = (gfag)object0;
                if(gcio.k((gfag0.e == null ? gfgo.a : gfag0.e).d)) {
                    appCompatImageView0 = new AppCompatImageView(creditCardImagesView2.getContext());
                    appCompatImageView0.setScaleType(ImageView.ScaleType.FIT_XY);
                    appCompatImageView0.setImageResource(gdcb.ah(creditCardImagesView2.getContext(), (gfag0.e == null ? gfgo.a : gfag0.e).d));
                }
                else {
                    appCompatImageView0 = new FifeNetworkImageView(creditCardImagesView2.getContext());
                }
                appCompatImageView0.setLayerType(2, null);
                appCompatImageView0.setId(v);
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v1, v2);
                if(v3 != -1) {
                    if(creditCardImagesView2.c) {
                        relativeLayout$LayoutParams0.addRule(16, v3);
                    }
                    else {
                        relativeLayout$LayoutParams0.addRule(17, v3);
                    }
                }
                else if(creditCardImagesView2.c) {
                    relativeLayout$LayoutParams0.addRule(21);
                }
                relativeLayout$LayoutParams0.addRule(15, -1);
                creditCardImagesView2.addView(appCompatImageView0, relativeLayout$LayoutParams0);
                if((appCompatImageView0 instanceof FifeNetworkImageView)) {
                    ((FifeNetworkImageView)appCompatImageView0).g();
                    ((FifeNetworkImageView)appCompatImageView0).f((gfag0.e == null ? gfgo.a : gfag0.e).d, gcio.c(creditCardImagesView2.getContext().getApplicationContext()), true, (gfag0.e == null ? gfgo.a : gfag0.e).e);
                    ((FifeNetworkImageView)appCompatImageView0).d(0x7F08102C);
                }
                if(!(gfag0.e == null ? gfgo.a : gfag0.e).k.isEmpty()) {
                    appCompatImageView0.setContentDescription((gfag0.e == null ? gfgo.a : gfag0.e).k);
                }
                appCompatImageView0.setTag(gfag0);
                arrayList0.add(appCompatImageView0);
                v3 = v;
                v = creditCardImagesView2.a().a();
            }
            creditCardImagesView2.a = (ImageView[])arrayList0.toArray(new ImageView[arrayList0.size()]);
            ImageView[] arr_imageView = creditCardImagesView2.a;
            if(!creditCardImagesView2.c && creditCardImagesView2.getContext().getResources().getConfiguration().getLayoutDirection() != 1) {
                z1 = false;
            }
            creditCardImagesView2.b = new fcbi(arr_imageView, z1);
            CreditCardNumberEditText creditCardNumberEditText0 = this.b;
            if(creditCardNumberEditText0 != null) {
                this.c.b(creditCardNumberEditText0.i);
                if(z) {
                    this.b.setOnFocusChangeListener(this);
                    return;
                }
                this.b.M(this);
            }
        }
    }

    private final TextView S() {
        CreditCardNumberEditText creditCardNumberEditText0 = this.b;
        if(creditCardNumberEditText0 != null) {
            if(!creditCardNumberEditText0.nW()) {
                return this.b;
            }
            if(!this.ag.nW()) {
                return this.ag;
            }
            if(!this.d.nW()) {
                return this.d;
            }
            if(this.as && !this.ai.nW()) {
                return this.ai;
            }
        }
        return null;
    }

    private final void U(String s) {
        du du0 = this.getFragmentManager().h(s);
        if(du0 != null) {
            ca ca0 = new ca(this.getFragmentManager());
            ca0.o(du0);
            ca0.a();
        }
    }

    private final void V(String s) {
        if(this.getFragmentManager().h("tagNfcErrorDialog") != null) {
            return;
        }
        String s1 = this.getString(0x7F1535B4);  // string:wallet_uic_nfc_error_title "Your card info wasn\'t read"
        int v = this.bU;
        gdci.a(s1, s, this.getString(0x104000A), v).show(this.getFragmentManager(), "tagNfcErrorDialog");
    }

    private final void W() {
        View view0 = ((ViewStub)this.a.findViewById(0x7F0B2053)).inflate();  // id:simple_card_form_stub
        this.b = (CreditCardNumberEditText)view0.findViewById(0x7F0B105D);  // id:credit_card_number
        this.ag = (DateEditText)view0.findViewById(0x7F0B1337);  // id:exp_date
        this.an = (MaterialFieldLayout)view0.findViewById(0x7F0B105F);  // id:credit_card_number_layout
        this.d = (FormEditText)view0.findViewById(0x7F0B1086);  // id:cvc
        this.R(true);
    }

    private final void Z() {
        this.ll(false);
        TextView[] arr_textView = {this.b, this.ag, this.d};
        for(int v = 0; v < 3; ++v) {
            TextView textView0 = arr_textView[v];
            if(textView0.isFocused()) {
                textView0.clearFocus();
                fcbl.ad(textView0);
            }
        }
        fcbl.ad(this.b);
        du du0 = this.getParentFragment();
        if((du0 instanceof fcbh)) {
            du0.startActivityForResult(this.aJ, 500);
        }
        else {
            this.startActivityForResult(this.aJ, 500);
        }
        fbpb.a(this.getContext(), new OcrActivityLaunchedEvent(this.au));
    }

    @Override  // gdak
    public final ArrayList aY() {
        return this.aK;
    }

    private final void aa() {
        TextView textView0 = this.aM;
        if(textView0 != null) {
            textView0.requestFocus();
            TextView textView1 = this.aM;
            if((textView1 instanceof EditText)) {
                ((EditText)textView1).setSelection(textView1.getText().length());
            }
            gdcb.ak(this.aM, true);
            fcbl.ad(this.aM);
            CreditCardNumberEditText creditCardNumberEditText0 = this.b;
            if(this.aM == creditCardNumberEditText0) {
                creditCardNumberEditText0.ab();
            }
            this.aM = null;
        }
    }

    private final void ab() {
        gdff.E(this.bU, this.aO.h()).show(this.getFragmentManager(), "tagNfcInfoDialog");
    }

    private final boolean ac() {
        return this.aN != gfhb.a;
    }

    private static final void ad(TextView textView0) {
        if(textView0.getError() != null && textView0.length() == 0) {
            textView0.setError(null);
        }
    }

    private final void ae(String s, int v, int v1, String s1, int v2) {
        gdcb.D(((Activity)this.getContext()).getWindow().getDecorView());
        if(!TextUtils.isEmpty(s)) {
            this.b.k(s, v2);
            this.b.nY();
            this.c.setVisibility((this.b.nV() ? 0 : 8));
        }
        if(v != 0 && v1 != 0) {
            this.ag.n(Integer.toString(v), Integer.toString(v1), v2);
            this.ag.nY();
        }
        fcbl.ad(this.d);
        if(this.as && !TextUtils.isEmpty(s1)) {
            this.ai.k(s1, v2);
        }
    }

    @Override  // gcpc
    public final void aq(Intent intent0) {
        if(this.ac() && !this.aO.i()) {
            gdff gdff0 = (gdff)this.getFragmentManager().h("tagNfcInfoDialog");
            this.ll(false);
            if(gdff0 == null) {
                this.U("tagNfcErrorDialog");
                if(this.al != null) {
                    this.aP = true;
                    TypedArray typedArray0 = this.bV.obtainStyledAttributes(new int[]{0x7F040E12, 0x7F040E11});  // attr:uicNfcInProgressDrawable
                    Drawable drawable0 = typedArray0.getDrawable(0);
                    this.aG = typedArray0.getDrawable(1);
                    typedArray0.recycle();
                    this.al.setImageDrawable(drawable0);
                }
            }
            else {
                gdff0.F();
            }
            this.aO.d(intent0);
        }
    }

    @Override  // gdak
    public final long bs() {
        return 0L;
    }

    @Override  // gcpd
    public final void h(int v, gcpb gcpb0, long v1) {
        this.U("tagNfcInfoDialog");
        this.ll(true);
        if(this.aP) {
            this.aP = false;
            this.al.setImageDrawable(this.aG);
        }
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: 
            case 4: {
                this.V(this.getString(0x7F1535BB));  // string:wallet_uic_nfc_unsupported_error_message "This card isn\'t supported by NFC 
                                                     // yet. Please manually type in the card number."
                break;
            }
            case 5: {
                this.V(this.getString(0x7F1535BA));  // string:wallet_uic_nfc_transceive_error_message "Keep your card still while it\'s 
                                                     // being read."
                break;
            }
            case 6: {
                this.V(this.getString(0x7F1535B9));  // string:wallet_uic_nfc_timeout_error_message "Tap your card again or type your card 
                                                     // number."
                break;
            }
            case 7: {
                this.V(this.getString(0x7F1535B8));  // string:wallet_uic_nfc_rate_limit_error_message "You scanned the same card twice 
                                                     // in a row, please wait a few minutes to scan this card again."
                break;
            }
            default: {
                throw new IllegalStateException("Unknown NFC result code: " + v);
            }
        }
        if(gcpb0 != null) {
            this.ae(gcpb0.a, gcpb0.b, gcpb0.c, null, 4);
            this.aM = this.S();
            this.aa();
        }
    }

    @Override  // gdak
    public final String lL(String s) {
        String s1 = this.Q();
        return !this.lb(null) || TextUtils.isEmpty(s1) ? "" : String.format("%1$s, Expires %2$s", s1, this.ag.getText().toString());
    }

    @Override  // gdak
    public final void lW(int v) {
        View view0 = this.aH;
        if(view0 != null) {
            view0.setVisibility(v);
        }
        View view1 = this.aI;
        if(view1 != null) {
            view1.setVisibility(v);
        }
        if(this.ap == null) {
            LinearLayout linearLayout0 = this.ak;
            if(linearLayout0 != null) {
                linearLayout0.setVisibility(v);
            }
        }
        if(this.as) {
            if(this.aj != null) {
                ((LinearLayout)this.a.findViewById(0x7F0B0C48)).setVisibility(v);  // id:background_ocr_button_image_and_text
                this.aj.setVisibility(v);
            }
            ((LinearLayout)this.a.findViewById(0x7F0B1052)).setVisibility(v);  // id:credit_card_background_shape
        }
    }

    @Override  // gdaa
    public final boolean la() {
        return this.lb(null);
    }

    @Override  // gdak
    public final boolean ld(List list0) {
        boolean z = super.ld(list0);
        int v = TextUtils.isEmpty(this.b.getError()) ^ 1;
        int v1 = TextUtils.isEmpty(this.ag.getError()) ^ 1;
        fbpb.a(this.getContext(), new CreditCardEntryValidationEvent(((boolean)v), ((boolean)v1), this.au));
        return z;
    }

    @Override  // gczu
    public final ArrayList lh() {
        return this.aL;
    }

    @Override  // gami
    public final List li() {
        return null;
    }

    @Override  // gdcm
    protected final long lq() {
        gewg gewg0 = ((gfak)this.aA).f;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        return gewg0.d;
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        String s = (getg0.b == null ? gesr.a : getg0.b).b;
        gewg gewg0 = ((gfak)this.aA).f;
        if(gewg0 == null) {
            gewg0 = gewg.a;
        }
        if(s.equals(gewg0.c)) {
            gesr gesr0 = getg0.b;
            switch((gesr0 == null ? gesr.a : gesr0).c) {
                case 1: {
                    this.b.nT(getg0.c, true);
                    return true;
                }
                case 2: {
                    this.d.nT(getg0.c, true);
                    return true;
                }
                case 3: 
                case 4: {
                    this.ag.nT(getg0.c, true);
                    return true;
                }
                case 5: {
                    if(this.as) {
                        this.ai.nT(getg0.c, true);
                        return true;
                    }
                    return false;
                }
                default: {
                    if(gesr0 == null) {
                        gesr0 = gesr.a;
                    }
                    throw new IllegalArgumentException("Unknown FormFieldMessage fieldId: " + gesr0.c);
                }
            }
        }
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ax;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        boolean z1;
        boolean z;
        if(v == 500) {
            CreditCardOcrResult creditCardOcrResult0 = CreditCardOcrResult.b(intent0);
            Bundle bundle0 = intent0 == null ? null : intent0.getExtras();
            int v2 = gdcb.f(v1);
            if(v1 == -1) {
                gfaw gfaw0 = gcio.f(creditCardOcrResult0, -1);
                this.ap = gfaw0;
                int v3 = gfaw0.e.isEmpty() ^ 1;
                int v4 = this.ap.f;
                this.ae(this.ap.e, v4, this.ap.g, this.ap.h, 3);
                if(this.aQ) {
                    DateEditText dateEditText0 = this.ag;
                    int[] arr_v = creditCardOcrResult0.l;
                    int[] arr_v1 = creditCardOcrResult0.m;
                    if(arr_v != null && arr_v1 != null && arr_v.length == arr_v1.length) {
                        ArrayList arrayList0 = new ArrayList(arr_v.length);
                        for(int v5 = 0; v5 < arr_v.length; ++v5) {
                            arrayList0.add(dateEditText0.l.b("", Integer.toString(arr_v[v5]), Integer.toString(arr_v1[v5])));
                        }
                        dateEditText0.T(arrayList0);
                    }
                }
                if(this.at) {
                    FormEditText formEditText0 = this.ai;
                    if(formEditText0 != null) {
                        formEditText0.T(Arrays.asList(creditCardOcrResult0.n));
                    }
                }
                if(this.aR) {
                    CreditCardNumberEditText creditCardNumberEditText0 = this.b;
                    if(creditCardNumberEditText0 != null) {
                        creditCardNumberEditText0.T(Arrays.asList(creditCardOcrResult0.o));
                    }
                }
                this.aM = this.S();
                this.aa();
                z = v3;
                z1 = v4 != 0;
            }
            else {
                this.aM = this.b;
                z = false;
                z1 = false;
            }
            boolean z2 = bundle0 != null && bundle0.getBoolean("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED");
            String s = this.au;
            OcrResultReceivedEvent.a(this.getContext(), fbdz.a(v2), z2, z, z1, s);
            this.ll(true);
            return;
        }
        super.onActivityResult(v, v1, intent0);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(view0 != null && view0 != this.ah && view0 != this.ak && view0 != this.aj || this.aJ == null) {
            if(view0 == this.al && this.getFragmentManager().h("tagNfcInfoDialog") == null) {
                this.ab();
            }
            return;
        }
        this.Z();
    }

    @Override  // gdak
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Activity activity0 = (Activity)this.getContext();
        this.au = this.getArguments().getString("analyticsSessionId");
        for(Object object0: new hfuh(((gfak)this.aA).t, gfak.c)) {
            switch(((gfer)object0).ordinal()) {
                case 1: {
                    this.aS = true;
                    break;
                }
                case 2: {
                    this.aT = true;
                    break;
                }
                case 3: {
                    this.aQ = true;
                    break;
                }
                case 4: {
                    this.at = true;
                    break;
                }
                case 5: {
                    this.aR = true;
                }
            }
        }
        dkhl dkhl0 = fbed.a(activity0);
        dkhl0.c(this.cP());
        dkhl0.d(this.aS);
        dkhl0.f(this.aT);
        if(((gfak)this.aA).r.size() > 0) {
            gfdx gfdx0 = gfdx.b(((gfak)this.aA).r.d(0));
            if(gfdx0 == null) {
                gfdx0 = gfdx.a;
            }
            gcio.h(dkhl0, gfdx0, ((gfak)this.aA).u);
        }
        this.aJ = dkhl0.a();
        if(NfcAdapter.getDefaultAdapter(activity0) != null) {
            for(Object object1: new hfuh(((gfak)this.aA).s, gfak.b)) {
                gfhb gfhb0 = (gfhb)object1;
                if(gfhb0 == gfhb.b || gfhb0 == gfhb.c || gfhb0 == gfhb.d) {
                    this.aN = gfhb0;
                    break;
                }
            }
        }
        if(this.ac()) {
            fcbk fcbk0 = new fcbk(this);
            gcpj gcpj0 = new gcpj(activity0.getContainerActivity());
            gcpj0.a = fcbk0;
            gcpk gcpk0 = gcpj0.a();
            this.aO = gcpk0;
            gcpk0.a(new gcpa(this.aO, gged_interceptors.l(this), new gcqh(), fcbk0, new fcbj(activity0)));
        }
        else {
            this.aO = new gcpm();
        }
        if(bundle0 != null) {
            this.ap = (gfaw)gciq.a(bundle0, "creditCardInputResult", ((Parser)((ProtoLiteMessage)gfaw.a).jf(7, null)));
        }
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        int v = 8;
        if(view0 != this.d) {
            CreditCardNumberEditText creditCardNumberEditText0 = this.b;
            if(view0 == creditCardNumberEditText0) {
                CreditCardImagesView creditCardImagesView0 = this.c;
                if(z || creditCardNumberEditText0.nV()) {
                    v = 0;
                }
                creditCardImagesView0.setVisibility(v);
            }
        }
        else if(!this.as) {
            CvcHintImageView cvcHintImageView0 = this.aq;
            if(z) {
                v = 0;
            }
            cvcHintImageView0.setVisibility(v);
        }
        if(z && (view0 instanceof TextView)) {
            fbgn.T(((TextView)view0).getContext());
            gdcb.ak(((TextView)view0), true);
        }
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        if(((gczc)this.b.getAdapter().getItem(v)).c == 1) {
            this.Z();
            return;
        }
        if(this.getFragmentManager().h("tagNfcInfoDialog") != null) {
            throw new IllegalArgumentException("Unknown DropDownItem event type: 2");
        }
        this.ab();
    }

    @Override  // gdcm
    public final void onPause() {
        super.onPause();
        this.ar = this.aO.h();
        this.aO.b();
    }

    @Override  // gdcm
    public final void onResume() {
        super.onResume();
        this.aO.e();
        boolean z = this.aO.h();
        if(!this.aO.i() && !this.ar && z) {
            this.U("tagNfcInfoDialog");
            this.ab();
        }
        this.aa();
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        gciq.j(bundle0, "creditCardInputResult", ((MessageLite)this.ap));
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        fcbl fcbl0;
        int v1;
        if(bundle0 == null) {
            gfak gfak0 = (gfak)this.aA;
            if((gfak0.e & 16) != 0 && (gfak0.l == null ? gfam.a : gfak0.l).k.size() > 0) {
                gfam gfam0 = ((gfak)this.aA).l;
                if(gfam0 == null) {
                    gfam0 = gfam.a;
                }
                gfaw gfaw0 = (gfaw)gfam0.k.get(0);
                int v = 1;
                switch(gfav.a(gfaw0.c)) {
                    case 0: {
                        v1 = 1;
                        break;
                    }
                    case 2: {
                        v1 = 3;
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
                fcbl0 = this;
                fcbl0.ae(gfaw0.e, gfaw0.f, gfaw0.g, gfaw0.h, v1);
                if(gfav.a(gfaw0.c) == 2) {
                    int v2 = gfaw0.e.isEmpty() ^ 1;
                    boolean z = gfaw0.f != 0;
                    Context context0 = fcbl0.getContext();
                    int v3 = gfat.a(gfaw0.d);
                    if(v3 != 0) {
                        v = v3;
                    }
                    OcrResultReceivedEvent.a(context0, fbdz.a(v - 1), true, ((boolean)v2), z, fcbl0.au);
                }
            }
            else {
                fcbl0 = this;
            }
        }
        else {
            fcbl0 = this;
        }
        if(fcbl0.as) {
            Activity activity0 = (Activity)fcbl0.getContext();
            View view1 = activity0.findViewById(0x7F0B174E);  // id:instrument_manager_container
            if(view1 == null) {
                view1 = activity0.findViewById(0x7F0B174A);  // id:instrument_form_holder
            }
            fbgn.U(fcbl0.am.getParent(), view1);
        }
    }

    @Override  // gcyg
    public final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ProtoLiteBuilder hftp1;
        View view0 = layoutInflater0.inflate(0x7F0E0D29, viewGroup0, false);  // layout:wallet_fragment_credit_card_info
        this.a = view0;
        this.ay = (SummaryExpanderWrapper)view0.findViewById(0x7F0B1054);  // id:credit_card_details_wrapper
        RelativeLayout relativeLayout0 = (RelativeLayout)layoutInflater0.inflate(0x7F0E0C5D, null, false);  // layout:view_ocr_and_error
        this.az = relativeLayout0;
        this.ak = (LinearLayout)relativeLayout0.findViewById(0x7F0B0CAB);  // id:below_card_number_ocr_button
        this.am = this.a.findViewById(0x7F0B1060);  // id:credit_card_ocr_fragment
        this.ao = true;
        gfdx gfdx0 = gfdx.a;
        if(((gfak)this.aA).r.size() > 0 && this.aJ != null) {
            gfdx gfdx1 = gfdx.b(((gfak)this.aA).r.d(0));
            if(gfdx1 != null) {
                gfdx0 = gfdx1;
            }
        }
        int v = gfdx0.ordinal();
        if(v == 1) {
            this.W();
            this.R(false);
            ImageView imageView0 = (ImageView)this.a.findViewById(0x7F0B1A64);  // id:ocr_icon
            this.ah = imageView0;
            imageView0.setOnClickListener(this);
            this.ah.setVisibility(0);
        }
        else {
            switch(v) {
                case 6: {
                    this.W();
                    this.b.o(1);
                    this.b.setOnItemClickListener(this);
                    break;
                }
                case 7: {
                    this.W();
                    this.b.o(2);
                    this.b.setOnItemClickListener(this);
                    break;
                }
                case 10: {
                    View view1 = ((ViewStub)this.a.findViewById(0x7F0B1062)).inflate();  // id:credit_card_shape_input_stub
                    this.b = (CreditCardNumberEditText)view1.findViewById(0x7F0B105D);  // id:credit_card_number
                    this.ag = (DateEditText)view1.findViewById(0x7F0B1337);  // id:exp_date
                    this.an = (MaterialFieldLayout)view1.findViewById(0x7F0B105F);  // id:credit_card_number_layout
                    LinearLayout linearLayout0 = (LinearLayout)view1.findViewById(0x7F0B1052);  // id:credit_card_background_shape
                    this.R(true);
                    linearLayout0.setBackgroundResource(0x7F08103D);  // drawable:wallet_credit_card_input_background
                    linearLayout0.setElevation(((float)this.getResources().getDimensionPixelSize(0x7F071478)));  // dimen:wallet_credit_card_input_background_elevation
                    ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.ag.getLayoutParams();
                    viewGroup$MarginLayoutParams0.setMarginEnd(0);
                    this.ag.setLayoutParams(viewGroup$MarginLayoutParams0);
                    View view2 = this.a.findViewById(0x7F0B0C46);  // id:background_ocr_button
                    this.aj = view2;
                    view2.setOnClickListener(this);
                    this.aj.setVisibility(0);
                    TypedArray typedArray0 = this.bV.obtainStyledAttributes(new int[]{0x7F040E05});  // attr:uicFormStartEndMargin
                    float f = -typedArray0.getDimension(0, 0.0f);
                    typedArray0.recycle();
                    int v1 = (int)f;
                    ((RelativeLayout.LayoutParams)this.aj.getLayoutParams()).setMargins(v1, 0, v1, 0);
                    this.as = true;
                    break;
                }
                default: {
                    if(v == 8) {
                        this.W();
                        this.an.l(this.az);
                        this.ak.setOnClickListener(this);
                    }
                    else {
                        this.ao = false;
                        this.W();
                    }
                }
            }
        }
        fbpb.a(this.getContext(), new OcrEnabledStateEvent(this.ao, gfdx0.o, this.au));
        int v2 = this.aN.ordinal();
        switch(v2) {
            case 1: {
                this.R(false);
                ImageView imageView1 = (ImageView)this.a.findViewById(0x7F0B1A14);  // id:nfc_icon
                this.al = imageView1;
                imageView1.setOnClickListener(this);
                this.al.setVisibility(0);
                break;
            }
            case 2: {
                this.b.n(1);
                this.b.setOnItemClickListener(this);
                break;
            }
            default: {
                if(v2 == 3) {
                    this.b.n(2);
                    this.b.setOnItemClickListener(this);
                }
            }
        }
        this.ay.f(this, 0x7F0B1059, 0x7F0B1064);  // id:credit_card_info_summary_image
        this.aH = this.a.findViewById(0x7F0B105E);  // id:credit_card_number_container
        this.aI = this.a.findViewById(0x7F0B1338);  // id:exp_date_and_cvc
        this.b.R(this.cM());
        this.b.V(this.cL(1));
        CreditCardNumberEditText creditCardNumberEditText0 = this.b;
        creditCardNumberEditText0.h = ((gfak)this.aA).g;
        creditCardNumberEditText0.k = ((gfak)this.aA).j;
        creditCardNumberEditText0.d = ((gfak)this.aA).h;
        creditCardNumberEditText0.e = ((gfak)this.aA).i;
        creditCardNumberEditText0.E(creditCardNumberEditText0, creditCardNumberEditText0, false);
        this.b.q = this;
        gfak gfak0 = (gfak)this.aA;
        ArrayList arrayList0 = this.aL;
        arrayList0.add(new gczs(0L, this.b, ((gfak0.e & 16) == 0 ? null : (gfak0.l == null ? gfam.a : gfak0.l).e)));
        DateEditText dateEditText0 = (DateEditText)this.a.findViewById(0x7F0B1337);  // id:exp_date
        this.ag = dateEditText0;
        dateEditText0.R(this.cM());
        MaterialFieldLayout materialFieldLayout0 = (MaterialFieldLayout)this.a.findViewById(0x7F0B1339);  // id:exp_date_material_field_container
        gfjj gfjj0 = fbed.b(this.getContext(), ((gfak)this.aA).n, ((gfak)this.aA).o, ((gfak)this.aA).p, ((gfak)this.aA).q);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gfjj0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gfjj0));
        long v3 = this.cL(7);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gfjj gfjj1 = (gfjj)hftp0.b_message;
        gfjj1.b |= 2;
        gfjj1.f = v3;
        gdcd.d(((gfjj)hftp0.N_build()), this.ag);
        materialFieldLayout0.h();
        this.ag.E(this.ag, this.ag, true);
        if((((gfak)this.aA).e & 16) == 0) {
            hftp1 = null;
        }
        else {
            hftp1 = ((ProtoLiteMessage)gepn.a).v_newBuilder();
            gfam gfam0 = ((gfak)this.aA).l;
            if(gfam0 == null) {
                gfam0 = gfam.a;
            }
            int v4 = gfam0.g;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((gepn)hftv0).b |= 2;
            ((gepn)hftv0).d = v4;
            gfam gfam1 = ((gfak)this.aA).l;
            if(gfam1 == null) {
                gfam1 = gfam.a;
            }
            int v5 = gfam1.h;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            gepn gepn0 = (gepn)hftp1.b_message;
            gepn0.b |= 1;
            gepn0.c = v5;
        }
        arrayList0.add(new gczs(0L, this.ag, (hftp1 == null ? null : hftp1.N_build())));
        FormEditText formEditText0 = (FormEditText)this.a.findViewById(0x7F0B1086);  // id:cvc
        this.d = formEditText0;
        formEditText0.R(this.cM());
        this.d.V(this.cL(2));
        FormEditText formEditText1 = this.d;
        gcxy gcxy0 = new gcxy(formEditText1, this.b);
        formEditText1.B(gcxy0);
        this.d.E(gcxy0, this.d, true);
        this.d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.d.setOnFocusChangeListener(this);
        arrayList0.add(new gczs(0L, this.d, null));
        CvcHintImageView cvcHintImageView0 = (CvcHintImageView)this.a.findViewById(0x7F0B1088);  // id:cvc_hint_image
        this.aq = cvcHintImageView0;
        cvcHintImageView0.a = this.getFragmentManager();
        if(this.as) {
            FormEditText formEditText2 = (FormEditText)this.a.findViewById(0x7F0B0E0D);  // id:card_holder_name
            this.ai = formEditText2;
            formEditText2.R(this.cM());
            this.ai.V(this.cL(5));
            FormEditText formEditText3 = this.ai;
            gfam gfam2 = ((gfak)this.aA).l;
            if(gfam2 == null) {
                gfam2 = gfam.a;
            }
            arrayList0.add(new gczs(0L, formEditText3, gfam2.d));
        }
        this.aK.add(this.aH);
        this.aK.add(this.aI);
        this.b.setNextFocusDownId(0x7F0B1337);  // id:exp_date
        this.ag.setNextFocusDownId(0x7F0B1086);  // id:cvc
        this.d.setNextFocusUpId(0x7F0B1337);  // id:exp_date
        this.ag.setNextFocusUpId(0x7F0B105D);  // id:credit_card_number
        if(this.as) {
            this.d.setNextFocusDownId(0x7F0B0E0D);  // id:card_holder_name
            this.ai.setNextFocusUpId(0x7F0B1086);  // id:cvc
        }
        gfak gfak1 = (gfak)this.aA;
        if((gfak1.e & 16) != 0 && bundle0 == null) {
            gfam gfam3 = gfak1.l == null ? gfam.a : gfak1.l;
            String s = "";
            if(gfam3.e.isEmpty()) {
                this.b.k("", 1);
            }
            else {
                this.b.k(gfam3.e, 6);
            }
            String s1 = gfam3.g == 0 ? "" : Integer.toString(gfam3.g);
            int v6 = gfam3.h;
            if(v6 != 0) {
                s = Integer.toString(v6 - 2000);
            }
            if(gfam3.g != 0 || gfam3.h != 0) {
                this.ag.n(s1, s, 6);
            }
            if(!gfam3.d.isEmpty() && this.as) {
                this.ai.k(gfam3.d, 6);
            }
        }
        this.ay.a.s(this.as);
        return this.a;
    }
}

