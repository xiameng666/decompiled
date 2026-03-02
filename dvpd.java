import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import com.google.android.gms.pay.pass.common.template.detail.DetailTemplate;
import dagger.internal.Preconditions;
import java.util.ArrayList;

public final class dvpd extends dokz implements ednc {
    public fuok a;
    public fshk ag;
    public fhwk ah;
    public Bitmap ai;
    public static final int aj;
    private static final bboh ak;
    private static final hjie al;
    private static final gufy am;
    private String an;
    private gucv ao;
    private DetailTemplate ap;
    private TextView aq;
    private dvoq ar;
    public DefaultPassInfoCallback b;
    public dspv c;
    public dspu d;

    static {
        dvpd.ak = bboh.b("Pay", bbcu.cZ);
        hjig hjig0 = hjif.a(((ProtoLiteMessage)hjie.a).v_newBuilder());
        hjig0.e(0.89f);
        hjig0.d(0.886f);
        hjig0.c(0.902f);
        hjie hjie0 = hjig0.a();
        dvpd.al = hjie0;
        gufn gufn0 = gufm.a(((ProtoLiteMessage)gufy.a).v_newBuilder());
        gufn0.c(gujx.i);
        ibuq.f(hjie0, "value");
        ProtoLiteBuilder hftp0 = gufn0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gufy gufy0 = (gufy)hftp0.b_message;
        hjie0.getClass();
        gufy0.e = hjie0;
        gufy0.b |= 1;
        dvpd.am = gufn0.a();
    }

    @Override  // ednc
    public final boolean F() {
        return true;
    }

    @Override  // dokz
    public final void onAttach(Context context0) {
        ibuq.f(context0, "context");
        super.onAttach(context0);
        if(this.ar == null) {
            domv domv0 = domu.a(AppContextProvider.a());
            Preconditions.b(domv0);
            Preconditions.b(this.ap());
            this.ar = new dvoq(domv0);
        }
        dvoq dvoq0 = this.ar;
        if(dvoq0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        dvoq0.inject(this);
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        fuok fuok1;
        fshk fshk1;
        dspu dspu1;
        dspv dspv1;
        DefaultPassInfoCallback defaultPassInfoCallback1;
        gged_interceptors gged2;
        DetailTemplate detailTemplate2;
        ibuq.f(layoutInflater0, "inflater");
        View view0 = layoutInflater0.inflate(0x7F0E0DE8, viewGroup0, false);  // layout:wallet_valuable_detail_image_inspection_fragment
        View view1 = view0.findViewById(0x7F0B04C0);  // id:InspectionImage
        ibuq.e(view1, "findViewById(...)");
        ((ImageView)view1).setImageBitmap(this.ai);
        View view2 = view0.findViewById(0x7F0B01D6);  // id:CloseButton
        ibuq.e(view2, "findViewById(...)");
        ((ImageView)view2).setOnClickListener(new dvpb(this));
        this.ap = (DetailTemplate)view0.findViewById(0x7F0B0361);  // id:DisclaimerTemplate
        this.aq = (TextView)view0.findViewById(0x7F0B04A4);  // id:ImageInspectionDisclaimer
        if(this.getArguments() != null && this.requireArguments().getByteArray("attachments-template-info") != null) {
            byte[] arr_b = this.requireArguments().getByteArray("attachments-template-info");
            if(arr_b == null) {
                throw new IllegalStateException("Required value was null.");
            }
            hftc hftc0 = hftc.a();
            gucv gucv0 = gucv.a;
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gucv0), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            ibuq.e(((gucv)hftv0), "parseFrom(...)");
            if(((gucv)hftv0).g.size() > 0) {
                this.ao = (gucv)hftv0;
                ((ggtj)dvpd.ak.h()).x("Setting detail template");
                gucv gucv1 = this.ao;
                if(gucv1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                hfuo hfuo0 = gucv1.g;
                ibuq.e(hfuo0, "getBottomDetailItemInfoList(...)");
                if(!hfuo0.isEmpty()) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: hfuo0) {
                        gucn gucn0 = (gucn)object0;
                        gulb gulb0 = gula.a(((ProtoLiteMessage)gucn.a).v_newBuilder());
                        guct guct0 = guct.a;
                        gulf gulf0 = gule.a(((gucs)((ProtoLiteMessage)guct0).v_newBuilder()));
                        gulf0.d();
                        ibuq.c(gucn0);
                        ArrayList arrayList1 = new ArrayList();
                        if(gucn0.b == 2) {
                            guct0 = (guct)gucn0.c;
                        }
                        for(Object object1: guct0.b) {
                            gucr gucr0 = (gucr)object1;
                            if((gucr0.b & 2) == 0) {
                                ibuq.c(gucr0);
                                arrayList1.add(gucr0);
                            }
                            else {
                                guld guld0 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
                                guhl guhl0 = gucr0.f == null ? guhl.a : gucr0.f;
                                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)guhl0).jf(5, null);
                                hftp0.X(((ProtoLiteMessage)guhl0));
                                guhj guhj0 = (guhj)hftp0;
                                gufy gufy0 = dvpd.am;
                                if(!guhj0.b_message.isImmutable()) {
                                    ((ProtoLiteBuilder)guhj0).ensureMutable();
                                }
                                guhl guhl1 = (guhl)guhj0.b_message;
                                gufy0.getClass();
                                guhl1.f = gufy0;
                                guhl1.b |= 8;
                                ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)guhj0).N_build();
                                ibuq.e(hftv1, "build(...)");
                                guld0.h(((guhl)hftv1));
                                arrayList1.add(guld0.a());
                            }
                        }
                        gulf0.b(arrayList1);
                        gulb0.b(gulf0.a());
                        arrayList0.add(gulb0.a());
                    }
                    gulh gulh0 = gulg.a(((gucu)((ProtoLiteMessage)gucv0).v_newBuilder()));
                    gulh0.g();
                    gucu gucu0 = gulh0.a;
                    if(!gucu0.b_message.isImmutable()) {
                        ((ProtoLiteBuilder)gucu0).ensureMutable();
                    }
                    gucv gucv2 = (gucv)gucu0.b_message;
                    gucv2.b();
                    hfrj.E(arrayList0, gucv2.g);
                    this.ao = gulh0.a();
                }
                DetailTemplate detailTemplate0 = this.ap;
                if(detailTemplate0 == null) {
                    ibuq.j("detailTemplate");
                    detailTemplate0 = null;
                }
                detailTemplate0.i(this, gfqx.a);
                DetailTemplate detailTemplate1 = this.ap;
                if(detailTemplate1 == null) {
                    ibuq.j("detailTemplate");
                    detailTemplate2 = null;
                }
                else {
                    detailTemplate2 = detailTemplate1;
                }
                gged_interceptors gged0 = ggna.a;
                gucv gucv3 = this.ao;
                if(gucv3 == null) {
                    gged2 = gged0;
                }
                else {
                    hfuo hfuo1 = gucv3.g;
                    if(hfuo1 == null) {
                        gged2 = gged0;
                    }
                    else {
                        gged_interceptors gged1 = ggdx.a(hfuo1);
                        gged2 = gged1 == null ? gged0 : gged1;
                    }
                }
                gubi gubi0 = guky.a(((ProtoLiteMessage)gubi.a).v_newBuilder()).a();
                DefaultPassInfoCallback defaultPassInfoCallback0 = this.b;
                if(defaultPassInfoCallback0 == null) {
                    ibuq.j("defaultPassInfoCallback");
                    defaultPassInfoCallback1 = null;
                }
                else {
                    defaultPassInfoCallback1 = defaultPassInfoCallback0;
                }
                dspv dspv0 = this.c;
                if(dspv0 == null) {
                    ibuq.j("defaultPassTargetCallback");
                    dspv1 = null;
                }
                else {
                    dspv1 = dspv0;
                }
                dspu dspu0 = this.d;
                if(dspu0 == null) {
                    ibuq.j("defaultPassSwitchCallback");
                    dspu1 = null;
                }
                else {
                    dspu1 = dspu0;
                }
                fshk fshk0 = this.ag;
                if(fshk0 == null) {
                    ibuq.j("defaultDynamicFormattedValueCallback");
                    fshk1 = null;
                }
                else {
                    fshk1 = fshk0;
                }
                detailTemplate2.m(gged0, gged2, gubi0, defaultPassInfoCallback1, dspv1, dspu1, fshk1);
                DetailTemplate detailTemplate3 = this.ap;
                if(detailTemplate3 == null) {
                    ibuq.j("detailTemplate");
                    detailTemplate3 = null;
                }
                detailTemplate3.setVisibility(0);
                TextView textView0 = this.aq;
                if(textView0 == null) {
                    ibuq.j("disclaimerView");
                    textView0 = null;
                }
                textView0.setVisibility(8);
            }
            else {
                goto label_141;
            }
        }
        else {
        label_141:
            if(this.getArguments() != null && this.requireArguments().getString("disclaimer") != null) {
                this.an = this.requireArguments().getString("disclaimer");
                TextView textView1 = this.aq;
                if(textView1 == null) {
                    ibuq.j("disclaimerView");
                    textView1 = null;
                }
                String s = this.an;
                if(s == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                funx.d(textView1, ftrm.f(s, true));
                DetailTemplate detailTemplate4 = this.ap;
                if(detailTemplate4 == null) {
                    ibuq.j("detailTemplate");
                    detailTemplate4 = null;
                }
                detailTemplate4.setVisibility(8);
            }
        }
        fuok fuok0 = this.a;
        if(fuok0 == null) {
            ibuq.j("edgeToEdgeStyler");
            fuok1 = null;
        }
        else {
            fuok1 = fuok0;
        }
        ibuq.c(view0);
        fuop.g(fuok1, view0);
        return view0;
    }

    @Override  // du
    public final void onViewCreated(View view0, Bundle bundle0) {
        ibuq.f(view0, "view");
        this.y().f(view0, this.y().a.a(0x3D1FD));
    }

    public final fhwk y() {
        fhwk fhwk0 = this.ah;
        if(fhwk0 != null) {
            return fhwk0;
        }
        ibuq.j("viewVisualElements");
        return null;
    }
}

