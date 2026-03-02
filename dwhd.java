import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.valuable.view.ucp.ProcessUcpAnimationView;
import com.google.android.libraries.tapandpay.ui.viewheader.ComposeViewHeader;
import dagger.internal.Preconditions;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class dwhd extends dokz implements ednc {
    public ibnf a;
    public domj ag;
    public fhwk ah;
    public fuok ai;
    public static final int aj;
    private static final bboh ak;
    private final ibnn al;
    private View am;
    public String b;
    public dvlb c;
    public fhwb d;

    static {
        dwhd.ak = bboh.b(new ibuk(dwhd.class).c(), bbcu.cZ);
    }

    public dwhd() {
        dwgy dwgy0 = new dwgy(this);
        dwha dwha0 = new dwha(new dwgz(this));
        ibnn ibnn0 = ibno.a(ibnp.c, dwha0);
        this.al = new lsd(new ibuk(dwhp.class), new dwhb(ibnn0), dwgy0, new dwhc(ibnn0));
    }

    public final fhwk A() {
        fhwk fhwk0 = this.ah;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }

    @Override  // ednc
    public final boolean F() {
        return hwik.n();
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        dolg dolg0 = this.ap();
        Preconditions.b(dolg0);
        domv domv0 = domu.a(AppContextProvider.a());
        Preconditions.b(domv0);
        new dwdg(dolg0, domv0).inject(this);
        dwhp dwhp0 = this.z();
        dwhp0.m = this.registerForActivityResult(new adt(), new dwhn(dwhp0));
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        hfit hfit0;
        byte[] arr_b;
        String s;
        super.onCreate(bundle0);
        this.y().d();
        xob xob0 = this.an();
        Intent intent0 = xob0 == null ? null : xob0.getIntent();
        if(intent0 == null) {
            ((ggtj)dwhd.ak.j()).x("No intent found");
            return;
        }
        dwhp dwhp0 = this.z();
        xob xob1 = this.an();
        if(xob1 == null) {
            s = null;
        }
        else {
            Uri uri0 = xob1.getReferrer();
            s = uri0 == null ? null : uri0.toString();
        }
        Uri uri1 = intent0.getData();
        if(uri1 == null) {
            ((ggtj)dwhp.a.j()).x("Uri is null");
            dwhp0.f();
            return;
        }
        dwhp0.h = hwvc.c() ? intent0.getIntExtra("USER_CREATED_PASS_ORIGIN", 2) : 2;
        if(hwvc.c() && dvla.b(dwhp0.c, uri1)) {
            ((ggtj)dwhp.a.h()).B("Cached uri received from intent: %s", intent0);
            gged_interceptors gged0 = gged_interceptors.l(uri1);
            ibuq.e(gged0, "of(...)");
            dwhp0.b(gged0);
            return;
        }
        if(!ibuq.m(uri1.getScheme(), "walletable-resource")) {
            ((ggtj)dwhp.a.j()).B("Invalid walletable resource intent: %s", intent0);
            dwhp0.f();
            return;
        }
        if(s == null) {
            s = "";
        }
        try {
            dwhp0.j = s;
            arr_b = Base64.decode(uri1.getHost(), 0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            a.e(dwhp.a.j(), "Failed to decode walletable resource intent: %s", intent0, illegalArgumentException0);
            dwhp0.f();
            return;
        }
        try {
            ibuq.c(arr_b);
            JSONObject jSONObject0 = new JSONObject(new String(arr_b, ibyo.a));
            if(jSONObject0.has("image")) {
                JSONObject jSONObject1 = jSONObject0.getJSONObject("image");
                ibuq.e(jSONObject1, "getJSONObject(...)");
                String s1 = jSONObject1.getString("uri");
                ibuq.e(s1, "getString(...)");
                gged_interceptors gged1 = gged_interceptors.l(Uri.parse(s1));
                ibuq.e(gged1, "of(...)");
                dwhp0.f = gged1;
                String s2 = jSONObject1.getString("category_hint");
                ibuq.e(s2, "getString(...)");
                dwhp0.i = s2;
                dwhp0.c();
                ((ggtj)dwhp.a.h()).R("Walletable resource intent category hint: %s, image uri: %s", dwhp0.i, s1);
                dwhp0.b(dwhp0.f);
                return;
            }
            if(jSONObject0.has("barcode")) {
                dwhp0.l = true;
                JSONObject jSONObject2 = jSONObject0.getJSONObject("barcode");
                ibuq.e(jSONObject2, "getJSONObject(...)");
                String s3 = jSONObject2.getString("barcode_raw_value");
                ibuq.e(s3, "getString(...)");
                String s4 = jSONObject2.getString("barcode_type");
                ibuq.e(s4, "getString(...)");
                dwhp0.k = s4;
                String s5 = jSONObject2.getString("category_hint");
                ibuq.e(s5, "getString(...)");
                dwhp0.i = s5;
                dwhp0.c();
                String s6 = dwhp0.i.toLowerCase(Locale.ROOT);
                ibuq.e(s6, "toLowerCase(...)");
                if(!ibuq.m(s6, "flight_boarding_pass")) {
                    ((ggtj)dwhp.a.j()).B("Invalid category hint for barcode: %s", dwhp0.i);
                    dwhp0.f();
                    return;
                }
                if(dxdq.a(s3).i()) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfir.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    ByteString hfsf0 = ByteString.A(s3);
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hfir hfir0 = (hfir)hftp0.b_message;
                    hfir0.b |= 2;
                    hfir0.d = hfsf0;
                    String s7 = dwhp0.k;
                    ibuq.f(s7, "barcodeType");
                    String s8 = s7.toLowerCase(Locale.ROOT);
                    ibuq.e(s8, "toLowerCase(...)");
                    switch(ibzk.Q(ibzk.Q(s8, "_", ""), " ", "")) {
                        case "aztec": {
                            hfit0 = hfit.n;
                            break;
                        }
                        case "codabar": {
                            hfit0 = hfit.e;
                            break;
                        }
                        case "code128": {
                            hfit0 = hfit.b;
                            break;
                        }
                        case "code39": {
                            hfit0 = hfit.c;
                            break;
                        }
                        case "code93": {
                            hfit0 = hfit.d;
                            break;
                        }
                        case "datamatrix": {
                            hfit0 = hfit.f;
                            break;
                        }
                        case "ean13": {
                            hfit0 = hfit.g;
                            break;
                        }
                        case "ean8": {
                            hfit0 = hfit.h;
                            break;
                        }
                        case "itf": {
                            hfit0 = hfit.i;
                            break;
                        }
                        case "itf14": {
                            hfit0 = hfit.i;
                            break;
                        }
                        case "pdf417": {
                            hfit0 = hfit.m;
                            break;
                        }
                        case "qrcode": {
                            hfit0 = hfit.j;
                            break;
                        }
                        case "upca": {
                            hfit0 = hfit.k;
                            break;
                        }
                        case "upce": {
                            hfit0 = hfit.l;
                            break;
                        }
                        default: {
                            hfit0 = hfit.a;
                        }
                    }
                    ibuq.f(hfit0, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hfir)hftp0.b_message).c = hfit0.q;
                    ((hfir)hftp0.b_message).b |= 1;
                    hfiv hfiv0 = hfiv.n;
                    ibuq.f(hfiv0, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((hfir)hftv0).f = hfiv0.o;
                    ((hfir)hftv0).b |= 16;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    hfir hfir1 = (hfir)hftp0.b_message;
                    hfir1.b |= 4;
                    hfir1.e = "";
                    ProtoLiteMessage hftv1 = hftp0.N_build();
                    ibuq.e(hftv1, "build(...)");
                    gged_interceptors gged2 = gged_interceptors.l(((hfir)hftv1));
                    int v = dwhp0.h;
                    ArrayList arrayList0 = new ArrayList();
                    int v1 = ((ggna)gged2).c;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        arrayList0.add(ftqe.a(((MessageLite)(((hfir)gged2.get(v2))))));
                    }
                    Intent intent1 = new Intent("com.google.android.gms.pay.pass.valuable.view.mutate.add.VIEW_VALUABLE_PROCESS_WALLETABLE_RESOURCE").setClassName("com.google.android.gms", "com.google.android.gms.pay.main.PayActivity").putExtra("PASS_CATEGORY_HINT", 1).putParcelableArrayListExtra("BARCODES", arrayList0).putExtra("USER_CREATED_PASS_ORIGIN", v).putExtra("IS_UPDATING_CATEGORY", false).putExtra("UCP_RETURN_WHEN_COMPLETE", true);
                    icck icck0 = lsc.a(dwhp0);
                    dwhm dwhm0 = new dwhm(dwhp0, intent1, null);
                    icbb.b(icck0, dwhp0.d, null, dwhm0, 2);
                    return;
                }
                ((ggtj)dwhp.a.j()).B("Invalid boarding pass barcode %s", s3);
                dwhp0.f();
                return;
            }
            ((ggtj)dwhp.a.j()).B("Invalid walletable resource intent type: %s", intent0);
            dwhp0.f();
        }
        catch(JSONException jSONException0) {
            a.e(dwhp.a.j(), "Failed to parse walletable resource intent: %s", intent0, jSONException0);
            dwhp0.f();
        }
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0D91, viewGroup0, false);  // layout:wallet_process_walletable_resource_intent_layout
        this.am = view0;
        if(view0 == null) {
            ibuq.j("containerView");
            view0 = null;
        }
        View view1 = view0.findViewById(0x7F0B0995);  // id:ViewHeader
        ibuq.e(view1, "findViewById(...)");
        View view2 = this.am;
        if(view2 == null) {
            ibuq.j("containerView");
            view2 = null;
        }
        View view3 = view2.findViewById(0x7F0B0942);  // id:UcpProcessingAnimation
        ibuq.e(view3, "findViewById(...)");
        if(hwfk.av()) {
            ((ComposeViewHeader)view1).setVisibility(0);
            View view4 = this.am;
            if(view4 == null) {
                ibuq.j("containerView");
                view4 = null;
            }
            ((ImageView)view4.findViewById(0x7F0B0472)).setVisibility(8);  // id:HeaderIcon
            View view5 = this.am;
            if(view5 == null) {
                ibuq.j("containerView");
                view5 = null;
            }
            ((TextView)view5.findViewById(0x7F0B08BD)).setVisibility(8);  // id:Title
            View view6 = this.am;
            if(view6 == null) {
                ibuq.j("containerView");
                view6 = null;
            }
            ((TextView)view6.findViewById(0x7F0B0222)).setVisibility(8);  // id:Content
        }
        ((ProcessUcpAnimationView)view3).a(this.aw());
        fhwk fhwk0 = this.A();
        View view7 = this.am;
        if(view7 == null) {
            ibuq.j("containerView");
            view7 = null;
        }
        fhvo fhvo0 = this.A().a.a(0x38A27);
        gjdt gjdt0 = gjds.a(((ProtoLiteMessage)gjdw.a).v_newBuilder());
        gjdt0.f(this.z().a());
        String s = this.y().a();
        gjdt0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
        fhvo0.d(douf.b(gjdt0.a()));
        fhwk0.f(view7, fhvo0);
        if(hwik.n()) {
            fuok fuok0 = this.ai;
            if(fuok0 == null) {
                ibuq.j("edgeToEdgeStyler");
                fuok0 = null;
            }
            View view8 = this.am;
            if(view8 == null) {
                ibuq.j("containerView");
                view8 = null;
            }
            fuop.g(fuok0, view8);
        }
        View view9 = this.am;
        if(view9 == null) {
            ibuq.j("containerView");
            return null;
        }
        return view9;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        icmq icmq0 = this.z().b.c;
        lps lps0 = this.getViewLifecycleOwner();
        icbb.b(lpt.a(lps0), null, null, new dwgw(lps0, icmq0, null, this), 3);
        this.getLifecycle().c(this.z());
    }

    public final domj y() {
        domj domj0 = this.ag;
        if(domj0 != null) {
            return domj0;
        }
        ibuq.j("loggingSessionIdManager");
        return null;
    }

    public final dwhp z() {
        return (dwhp)this.al.a();
    }
}

