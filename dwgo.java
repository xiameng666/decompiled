import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.pay.UserCreatedPassAttachmentMetadata;
import com.google.android.gms.pay.UserCreatedPassVerticalMetadata;
import com.google.mlkit.vision.barcode.aidls.BarcodeParcel;
import com.google.mlkit.vision.barcode.aidls.BarhopperAdvancedConfigParcel;
import com.google.mlkit.vision.barcode.aidls.MultiScaleDecodingOptionsParcel;
import com.google.mlkit.vision.barcode.aidls.MultiScaleDetectionOptionsParcel;
import com.google.mlkit.vision.common.aidls.ImageMetadataParcel;
import j..util.DesugarCollections;
import j..util.Map.-EL;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class dwgo extends lsb implements lom {
    private final dsjx B;
    private final ibnf C;
    private dxdy D;
    private ggeo E;
    private boolean F;
    private UserCreatedPassVerticalMetadata G;
    private final gfsx H;
    public static final bboh a;
    public final frxn b;
    public final String c;
    public final Context d;
    public final dmgi e;
    public final bbng f;
    public final ibrt g;
    public final dvlb h;
    public final fhwb i;
    public final domj j;
    public Bundle k;
    public gged_interceptors l;
    public boolean m;
    public gged_interceptors n;
    public gged_interceptors o;
    public int p;
    public boolean q;
    public int r;
    public guwr s;
    public acp t;
    public int u;
    public final dwrf v;
    private final dvlp w;
    private final dvgq x;
    private final dxdl y;
    private final boolean z;

    static {
        dwgo.a = bboh.b(new ibuk(dwgo.class).c(), bbcu.cZ);
    }

    public dwgo(String s, Context context0, dvlp dvlp0, dmgi dmgi0, bbng bbng0, ibrt ibrt0, dvlb dvlb0, fhwb fhwb0, dvgq dvgq0, domj domj0, dwrf dwrf0, dxdl dxdl0, boolean z, dsjx dsjx0, ibnf ibnf0) {
        this.b = new frxn();
        this.c = s;
        this.d = context0;
        this.w = dvlp0;
        this.e = dmgi0;
        this.f = bbng0;
        this.g = ibrt0;
        this.h = dvlb0;
        this.i = fhwb0;
        this.x = dvgq0;
        this.j = domj0;
        this.v = dwrf0;
        this.y = dxdl0;
        this.z = z;
        this.B = dsjx0;
        this.C = ibnf0;
        this.E = ggnf.a;
        ibuq.e(ggna.a, "of(...)");
        this.l = ggna.a;
        ibuq.e(ggna.a, "of(...)");
        this.n = ggna.a;
        ibuq.e(ggna.a, "of(...)");
        this.o = ggna.a;
        this.H = gfqx.a;
    }

    public final dxdy a() {
        dxdy dxdy1;
        synchronized(this) {
            if(this.D == null) {
                dxdy dxdy0 = new dxdy(dxdu.a(this.d));
                this.H.f(dxdy0);
                this.D = dxdy0;
            }
            dxdy1 = this.D;
            ibuq.c(dxdy1);
        }
        return dxdy1;
    }

    public final evql b(gged_interceptors gged0) {
        evqp evqp0 = new evqp();
        guwc guwc0 = guwc.b(this.r);
        int v = this.p;
        dwgd dwgd0 = new dwgd(evqp0);
        dwge dwge0 = new dwge(evqp0);
        if(guwc0 == null) {
            guwc0 = guwc.a;
        }
        guwl guwl0 = (guwl)((ProtoLiteMessage)guwm.b).v_newBuilder();
        guwl0.k(gged0);
        if(!guwl0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)guwl0).ensureMutable();
        }
        dvgq dvgq0 = this.x;
        ((guwm)guwl0.b_message).d = v;
        guwl0.a(dvgq0.b);
        if(hwfk.U() && dvgq0.a.d != null) {
            String s = dvgq0.c.c();
            if(!guwl0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)guwl0).ensureMutable();
            }
            guwm guwm0 = (guwm)guwl0.b_message;
            s.getClass();
            guwm0.f = s;
        }
        if(hwfk.y()) {
            if(!guwl0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)guwl0).ensureMutable();
            }
            guwm guwm1 = (guwm)guwl0.b_message;
            guwm1.g = guwc0.a();
        }
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)guwl0).N_build();
        dptv.m(dvgq0.a, dpuj.aU, ((MessageLite)hftv0), ((MessageLite)guwn.a), dwgd0, dwge0);
        return evqp0.a;
    }

    public final gged_interceptors c() {
        gged_interceptors gged0 = this.o;
        ArrayList arrayList0 = new ArrayList(ibpo.q(gged0, 10));
        for(Object object0: gged0) {
            arrayList0.add(((dvkz)object0).c);
        }
        return ggdx.a(arrayList0);
    }

    public final Object e(gged_interceptors gged0, ibrl ibrl0) {
        ggqk ggqk0;
        dwgf dwgf0;
        if((ibrl0 instanceof dwgf)) {
            dwgf0 = (dwgf)ibrl0;
            int v = dwgf0.c;
            if((v & 0x80000000) == 0) {
                dwgf0 = new dwgf(this, ibrl0);
            }
            else {
                dwgf0.c = v - 0x80000000;
            }
        }
        else {
            dwgf0 = new dwgf(this, ibrl0);
        }
        Object object0 = dwgf0.a;
        Object object1 = ibrx.a;
        switch(dwgf0.c) {
            case 0: {
                ibnx.b(object0);
                ggqk0 = gged0.E();
                ibuq.e(ggqk0, "iterator(...)");
                goto label_21;
            }
            case 1: {
                ggqk0 = dwgf0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            if(((Boolean)object0).booleanValue()) {
                return Boolean.valueOf(true);
            }
            while(true) {
            label_21:
                if(!ggqk0.hasNext()) {
                    break alab1;
                }
                Bitmap bitmap0 = ((dvkz)ggqk0.next()).a(this.d);
                if(bitmap0 == null) {
                    ((ggtj)dwgo.a.j()).x("Could not get bitmap from cached image for Aadhaar detection");
                    continue;
                }
                dwac dwac0 = ((dwad)this.C).a();
                dwgf0.d = (ggdz)ggqk0;
                dwgf0.c = 1;
                object0 = dwac.a(dwac0, bitmap0, dwgf0);
                if(object0 != object1) {
                    break;
                }
                return object1;
            }
        }
        return Boolean.valueOf(false);
    }

    public final Object f(ibrl ibrl0) {
        ibps ibps0;
        dvkz dvkz0;
        ggqk ggqk1;
        Object object2;
        dwgg dwgg0;
        if((ibrl0 instanceof dwgg)) {
            dwgg0 = (dwgg)ibrl0;
            int v = dwgg0.d;
            if((v & 0x80000000) == 0) {
                dwgg0 = new dwgg(this, ibrl0);
            }
            else {
                dwgg0.d = v - 0x80000000;
            }
        }
        else {
            dwgg0 = new dwgg(this, ibrl0);
        }
        Object object0 = dwgg0.b;
        Object object1 = ibrx.a;
        switch(dwgg0.d) {
            case 0: {
                ibnx.b(object0);
                ggek ggek0 = new ggek();
                ggqk ggqk0 = this.o.E();
                ibuq.e(ggqk0, "iterator(...)");
                object2 = ggek0;
                ggqk1 = ggqk0;
                goto label_26;
            }
            case 1: {
                dvkz0 = dwgg0.e;
                ggqk1 = dwgg0.f;
                object2 = dwgg0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            if(!((ggfp)object0).isEmpty()) {
                ((ggek)object2).i(dvkz0, ((ggfp)object0));
            }
        label_26:
            if(!ggqk1.hasNext()) {
                break;
            }
            dvkz0 = (dvkz)ggqk1.next();
            Bitmap bitmap0 = dvkz0.a(this.d);
            dxdl dxdl0 = this.y;
            ibuq.c(bitmap0);
            dwgg0.a = object2;
            dwgg0.f = (ggdz)ggqk1;
            dwgg0.e = dvkz0;
            dwgg0.d = 1;
            if(dxdl0.c == null) {
                ggdy ggdy0 = new ggdy();
                ggdy0.k(hbro.c());
                gged_interceptors gged0 = ggdy0.h();
                ibuq.e(gged0, "build(...)");
                dxdl0.c = hawd.d(dxdl0.a, gged0);
            }
            if(hwvi.e()) {
                ((ggtj)dxdl0.d.h()).x("Fetching barcodes with updated QR barcode scanner");
                try {
                    ibuq.f(bitmap0, "bitmap");
                    try {
                        hbsd hbsd0 = dxdl0.b.b();
                        if(hbsd0 == null) {
                            ibps0 = ibps.a;
                        }
                        else {
                            ObjectWrapper objectWrapper0 = new ObjectWrapper(bitmap0);
                            ImageMetadataParcel imageMetadataParcel0 = new ImageMetadataParcel(-1, bitmap0.getWidth(), bitmap0.getHeight(), 0, SystemClock.elapsedRealtime());
                            hzhe hzhe0 = hwvi.a.b().a();
                            MultiScaleDetectionOptionsParcel multiScaleDetectionOptionsParcel0 = new MultiScaleDetectionOptionsParcel(glws.d((hzhe0.b == null ? hzhd.a : hzhe0.b).b));
                            float[] arr_f = glws.d((hzhe0.c == null ? hzhc.a : hzhe0.c).b);
                            hzhc hzhc0 = hzhe0.c;
                            int v1 = (hzhc0 == null ? hzhc.a : hzhc0).c;
                            if(hzhc0 == null) {
                                hzhc0 = hzhc.a;
                            }
                            BarhopperAdvancedConfigParcel barhopperAdvancedConfigParcel0 = new BarhopperAdvancedConfigParcel(new MultiScaleDecodingOptionsParcel(arr_f, v1, hzhc0.d), multiScaleDetectionOptionsParcel0, false, false, false, false, false);
                            Parcel parcel0 = hbsd0.jo();
                            wbz.h(parcel0, objectWrapper0);
                            wbz.f(parcel0, imageMetadataParcel0);
                            wbz.f(parcel0, barhopperAdvancedConfigParcel0);
                            Parcel parcel1 = hbsd0.hM(4, parcel0);
                            ibps0 = parcel1.createTypedArrayList(BarcodeParcel.CREATOR);
                            parcel1.recycle();
                            if(ibps0 == null) {
                                ibps0 = ibps.a;
                            }
                        }
                    }
                    catch(RemoteException remoteException0) {
                        a.ae(dxdt.a.j(), "No barcodes were detected due to API failure", remoteException0);
                        ibps0 = ibps.a;
                    }
                    ((ggtj)dxdl0.d.h()).B("Dynamite barcodes found: %s", ibps0.toString());
                    ArrayList arrayList0 = new ArrayList(ibpo.q(ibps0, 10));
                    for(Object object3: ibps0) {
                        arrayList0.add(dxdi.a.apply(((BarcodeParcel)object3)));
                    }
                    object0 = ggdx.d(arrayList0);
                }
                catch(bjhw bjhw0) {
                    a.ae(dxdl0.d.j(), "Failed to load dynamite module, falling back to barcode extraction", bjhw0);
                    object0 = dxdl0.a(bitmap0, dwgg0);
                    if(object0 != ibrx.a) {
                        object0 = (ggfp)object0;
                    }
                }
            }
            else {
                ((ggtj)dxdl0.d.h()).x("Fetching barcodes with public barcode extractor");
                object0 = dxdl0.a(bitmap0, dwgg0);
            }
            if(object0 != object1) {
                continue;
            }
            return object1;
        }
        this.E = ((ggek)object2).b();
        return ibom.a;
    }

    public final Object g(guwn guwn0, long v, ibrl ibrl0) {
        dwgi dwgi0;
        if((ibrl0 instanceof dwgi)) {
            dwgi0 = (dwgi)ibrl0;
            int v1 = dwgi0.c;
            if((v1 & 0x80000000) == 0) {
                dwgi0 = new dwgi(this, ibrl0);
            }
            else {
                dwgi0.c = v1 - 0x80000000;
            }
        }
        else {
            dwgi0 = new dwgi(this, ibrl0);
        }
        Object object0 = dwgi0.a;
        Object object1 = ibrx.a;
        switch(dwgi0.c) {
            case 0: {
                ibnx.b(object0);
                long v2 = SystemClock.elapsedRealtime() - v;
                long v3 = hwkt.a.g().i();
                if(v2 >= v3) {
                    this.q(guwn0);
                    return ibom.a;
                }
                dwgi0.d = guwn0;
                dwgi0.c = 1;
                if(iccv.c(v3 - v2, dwgi0) == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                guwn0 = dwgi0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        this.q(guwn0);
        return ibom.a;
    }

    public final Object h(gged_interceptors gged0, ibrl ibrl0) {
        Object object4;
        ByteString hfsf0;
        Object object2;
        long v1;
        dwgl dwgl0;
        if((ibrl0 instanceof dwgl)) {
            dwgl0 = (dwgl)ibrl0;
            int v = dwgl0.e;
            if((v & 0x80000000) == 0) {
                dwgl0 = new dwgl(this, ibrl0);
            }
            else {
                dwgl0.e = v - 0x80000000;
            }
        }
        else {
            dwgl0 = new dwgl(this, ibrl0);
        }
        Object object0 = dwgl0.c;
        Object object1 = ibrx.a;
        switch(dwgl0.e) {
            case 0: {
                ibnx.b(object0);
                v1 = SystemClock.elapsedRealtime();
                this.v.d();
                dwgl0.a = gged0;
                dwgl0.b = v1;
                dwgl0.e = 1;
                if(this.f(dwgl0) == object1) {
                    return object1;
                }
                object2 = gged0;
                goto label_25;
            }
            case 1: {
                v1 = dwgl0.b;
                object2 = dwgl0.a;
                ibnx.b(object0);
            label_25:
                ggdy ggdy0 = new ggdy();
                ggqk ggqk0 = this.o.E();
                ibuq.e(ggqk0, "iterator(...)");
                while(ggqk0.hasNext()) {
                    dvkz dvkz0 = (dvkz)ggqk0.next();
                    try {
                        ibuq.c(dvkz0);
                        Context context0 = this.d;
                        byte[] arr_b = dvkz0.d(context0);
                        if(arr_b.length == 0) {
                            hfsf0 = dvkz0.b(context0);
                            ibuq.e(hfsf0, "getByteString(...)");
                        }
                        else {
                            hfsf0 = ByteString.copyFrom(this.w.a(arr_b));
                        }
                        if(hfsf0.isEmpty()) {
                            continue;
                        }
                        Set set0 = (Set)Map.-EL.getOrDefault(this.E, dvkz0, ibpu.a);
                        gvcf gvcf0 = gvce.a(((ProtoLiteMessage)guwv.a).v_newBuilder());
                        gvbv gvbv0 = gvbu.a(((ProtoLiteMessage)guwt.a).v_newBuilder());
                        gvbv0.c(hfsf0);
                        gvbv0.b(hwvf.c());
                        gvcf0.b(gvbv0.a());
                        ProtoLiteBuilder hftp0 = gvcf0.a;
                        List list0 = DesugarCollections.unmodifiableList(((guwv)hftp0.b_message).d);
                        ibuq.e(list0, "getFeatureOverridesList(...)");
                        new hfxu(list0);
                        ArrayList arrayList0 = new ArrayList(ibpo.q(set0, 10));
                        for(Iterator iterator0 = set0.iterator(); iterator0.hasNext(); iterator0 = iterator0) {
                            Object object3 = iterator0.next();
                            hfir hfir0 = (hfir)object3;
                            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)guwu.a).v_newBuilder();
                            ibuq.f(hftp1, "builder");
                            ibuq.f(hfir0, "value");
                            if(!hftp1.b_message.isImmutable()) {
                                hftp1.ensureMutable();
                            }
                            guwu guwu0 = (guwu)hftp1.b_message;
                            hfir0.getClass();
                            guwu0.c = hfir0;
                            guwu0.b = 1;
                            ProtoLiteMessage hftv0 = hftp1.N_build();
                            ibuq.e(hftv0, "build(...)");
                            arrayList0.add(((guwu)hftv0));
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        guwv guwv0 = (guwv)hftp0.b_message;
                        hfuo hfuo0 = guwv0.d;
                        if(!hfuo0.c()) {
                            guwv0.d = ProtoLiteMessage.E(hfuo0);
                        }
                        hfrj.E(arrayList0, guwv0.d);
                        ggdy0.i(gvcf0.a());
                    }
                    catch(IOException iOException0) {
                        ((ggtj)((ggtj)dwgo.a.j()).s(iOException0)).B("Unable to retrieve image data for cached image with URI: %s", dvkz0.c);
                    }
                }
                gged_interceptors gged1 = ggdy0.h();
                ibuq.e(gged1, "build(...)");
                evql evql0 = this.b(gged1);
                dwgl0.a = object2;
                dwgl0.b = v1;
                dwgl0.e = 2;
                object4 = fsdk.a(evql0, dwgl0);
                if(object4 == object1) {
                    return object1;
                }
                goto label_93;
            }
            case 2: {
                v1 = dwgl0.b;
                object2 = dwgl0.a;
                ibnx.b(object0);
                object4 = ((ibnw)object0).a;
            label_93:
                if(ibnw.b(object4)) {
                    guwn guwn0 = guwn.a;
                    if((object4 instanceof ibnv)) {
                        object4 = guwn0;
                    }
                    dwgl0.a = null;
                    dwgl0.e = 3;
                    return this.g(((guwn)object4), v1, dwgl0) != object1 ? ibom.a : object1;
                }
                a.ae(dwgo.a.j(), "Detect and transform pass failed", ibnw.a(object4));
                dwgo.o(this, ibnw.a(object4), ((gged_interceptors)object2), null, 4);
                return ibom.a;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public final void i() {
        icck icck0 = lsc.a(this);
        dwgh dwgh0 = new dwgh(this, null);
        icbb.b(icck0, this.g, null, dwgh0, 2);
    }

    public final void j() {
        this.r(gkay.e);
    }

    public final void k(Bundle bundle0) {
        String s;
        gged_interceptors gged0;
        this.p = bundle0.getInt("PASS_CATEGORY_HINT", 0);
        this.F = bundle0.getBoolean("IS_UPDATING_CATEGORY", false);
        this.q = bundle0.getBoolean("UCP_RETURN_WHEN_COMPLETE", false);
        this.r = bundle0.getInt("USER_CREATED_PASS_ORIGIN");
        this.u = bundle0.getInt("USER_CREATED_PASS_VERSION", 0);
        UserCreatedPassVerticalMetadata userCreatedPassVerticalMetadata0 = null;
        if(hwvf.f()) {
            ArrayList arrayList0 = bundle0.getStringArrayList("ORIGINAL_IMAGE_HASHES");
            if(arrayList0 == null) {
                gged0 = ggna.a;
                ibuq.e(gged0, "of(...)");
            }
            else {
                gged0 = ggdx.a(arrayList0);
                if(gged0 == null) {
                    gged0 = ggna.a;
                    ibuq.e(gged0, "of(...)");
                }
            }
            if(gged0.size() != this.c().size()) {
                gftb.g(gged0.isEmpty(), "The count of provided originial image hashes doesn\'t match the count of images", new Object[0]);
                ((ggtj)dwgo.a.h()).x("Original hash is not provided, generating");
                gged_interceptors gged1 = this.c();
                ArrayList arrayList1 = new ArrayList(ibpo.q(gged1, 10));
                for(Object object0: gged1) {
                    Uri uri0 = (Uri)object0;
                    ibuq.c(uri0);
                    try {
                        InputStream inputStream0 = dvlx.a(this.d, uri0);
                        try {
                            byte[] arr_b = ghjj.g(inputStream0);
                            ibuq.e(arr_b, "toByteArray(...)");
                            ibuq.f(arr_b, "imageBytes");
                            s = ghgz.a.a(arr_b).toString();
                        }
                        catch(Throwable throwable0) {
                            ibsx.a(inputStream0, throwable0);
                            throw throwable0;
                        }
                        ibsx.a(inputStream0, null);
                    }
                    catch(IOException iOException0) {
                        a.ae(dwgo.a.j(), "Could not generate image hash", iOException0);
                        s = "";
                    }
                    arrayList1.add(s);
                }
                gged0 = ggdx.a(arrayList1);
            }
            gged_interceptors gged2 = this.c();
            Iterator iterator1 = gged2.iterator();
            Iterator iterator2 = gged0.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(ibpo.q(gged2, 10), ibpo.q(gged0, 10)));
            while(iterator1.hasNext() && iterator2.hasNext()) {
                Object object1 = iterator1.next();
                Object object2 = iterator2.next();
                UserCreatedPassAttachmentMetadata userCreatedPassAttachmentMetadata0 = new UserCreatedPassAttachmentMetadata();
                userCreatedPassAttachmentMetadata0.a = (Uri)object1;
                userCreatedPassAttachmentMetadata0.b = (String)object2;
                arrayList2.add(userCreatedPassAttachmentMetadata0);
            }
            this.l = ggdx.a(arrayList2);
        }
        if(hwfk.z()) {
            byte[] arr_b1 = bundle0.getByteArray("UCP_VERTICAL_METADATA");
            if(arr_b1 != null) {
                userCreatedPassVerticalMetadata0 = (UserCreatedPassVerticalMetadata)bauc.a(arr_b1, UserCreatedPassVerticalMetadata.CREATOR);
            }
            this.G = userCreatedPassVerticalMetadata0;
        }
    }

    @Override  // lsb
    protected final void km() {
        this.p();
        if(hwvi.e()) {
            dxdl dxdl0 = this.y;
            icta icta0 = dxdt.b;
            if(icta0.c()) {
                dxdt dxdt0 = dxdl0.b;
                if(dxdt0.c != null) {
                    dxdt0.a().b();
                }
                icta0.d();
            }
        }
    }

    public final void l(icck icck0, frxf[] arr_frxf) {
        this.b.b(icck0, arr_frxf);
    }

    public final void m(guok guok0) {
        guwr guwr0 = this.s;
        guwr guwr1 = null;
        if(guwr0 == null) {
            ibuq.j("ucpManualInputAction");
            guwr0 = null;
        }
        this.v(gvbx.a((guwr0.b == null ? gvcd.a : guwr0.b).c));
        icck icck0 = lsc.a(this);
        frxf[] arr_frxf = new frxf[1];
        guwr guwr2 = this.s;
        if(guwr2 == null) {
            ibuq.j("ucpManualInputAction");
            guwr2 = null;
        }
        gvcd gvcd0 = guwr2.b == null ? gvcd.a : guwr2.b;
        guwr guwr3 = this.s;
        if(guwr3 == null) {
            ibuq.j("ucpManualInputAction");
            guwr3 = null;
        }
        gvby gvby0 = guwr3.c == null ? gvby.a : guwr3.c;
        guwr guwr4 = this.s;
        if(guwr4 == null) {
            ibuq.j("ucpManualInputAction");
            guwr4 = null;
        }
        gvbz gvbz0 = guwr4.d == null ? gvbz.a : guwr4.d;
        gged_interceptors gged0 = this.c();
        int v = this.p;
        guwr guwr5 = this.s;
        if(guwr5 == null) {
            ibuq.j("ucpManualInputAction");
        }
        else {
            guwr1 = guwr5;
        }
        Intent intent0 = dlnf.bz(gvcd0, gvby0, gvbz0, gged0, v, (guwr1.e == null ? guwj.a : guwr1.e), "com.google.android.gms.pay.pass.valuable.view.mutate.enter.VIEW_VALUABLE_ENTER_USER_CREATED_PASS", guok0, this.F, this.l, this.q, this.r, this.G).setFlags(0x6000000);
        ibuq.e(intent0, "setFlags(...)");
        arr_frxf[0] = new frxg(intent0);
        this.l(icck0, arr_frxf);
    }

    public final void n() {
        this.j();
        this.v.g();
        this.l(lsc.a(this), new frxf[]{dwgb.a});
    }

    static void o(dwgo dwgo0, Throwable throwable0, gged_interceptors gged0, gged_interceptors gged1, int v) {
        String s3;
        String s2;
        Throwable throwable1 = throwable0 == null ? null : throwable0.getCause();
        if((throwable1 instanceof dpuk)) {
            gtli gtli0 = ((dpuk)throwable1).a;
            if(gtli0.b == 7) {
                if((v & 2) != 0) {
                    gged0 = null;
                }
                bboh bboh0 = dwgo.a;
                ((ggtj)bboh0.h()).x("Fall back to UCP V1 flow");
                dwgo0.u = 1;
                fhvz fhvz0 = fhwa.a(0x33AC3);
                fhvz0.c(fhwp.b(dwgo0.c));
                gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
                String s = dwgo0.j.a();
                gjca0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
                fhvz0.b(douc.a(gjca0.a()));
                fhwa fhwa0 = fhvz0.a();
                dwgo0.i.a(fhwa0);
                if(gged0 != null) {
                    Object object0 = dwgo0.o.get(0);
                    ibuq.e(object0, "get(...)");
                    icck icck0 = lsc.a(dwgo0);
                    dwgm dwgm0 = new dwgm(dwgo0, ((dvkz)object0), null);
                    icbb.b(icck0, dwgo0.g, null, dwgm0, 2);
                    return;
                }
                if((v & 4) != 0) {
                    gged1 = null;
                }
                if(gged1 != null) {
                    Object object1 = gged1.get(0);
                    ibuq.e(object1, "get(...)");
                    dsjx dsjx0 = dwgo0.B;
                    String s1 = ((hfir)object1).d.toStringUtf8();
                    hfit hfit0 = hfit.b(((hfir)object1).c);
                    if(hfit0 == null) {
                        hfit0 = hfit.a;
                    }
                    ibuq.e(hfit0, "getFormat(...)");
                    gfsx gfsx0 = dsjx0.a(s1, dwbz.a(hfit0), (dwgo0.z ? hwkt.b() : hwkt.c()));
                    if(!gfsx0.i()) {
                        ((ggtj)bboh0.j()).x("Failed to build the payload for the boarding pass.");
                        dwgo0.n();
                        return;
                    }
                    icck icck1 = lsc.a(dwgo0);
                    frxf[] arr_frxf = new frxf[1];
                    Intent intent0 = dlnf.bB(null, ((JSONObject)gfsx0.d()).toString(), 12, dwgo0.q, "com.google.android.gms").setFlags(0x6000000);
                    ibuq.e(intent0, "setFlags(...)");
                    arr_frxf[0] = new frxg(intent0);
                    dwgo0.l(icck1, arr_frxf);
                }
                return;
            }
            s2 = gtli0.c;
            ibuq.e(s2, "getTitle(...)");
            s3 = gtli0.d;
            ibuq.e(s3, "getContent(...)");
        }
        else {
            s2 = "";
            s3 = "";
        }
        dwgo0.v.g();
        icck icck2 = lsc.a(dwgo0);
        frxf[] arr_frxf1 = new frxf[1];
        Intent intent1 = dlnf.aX(s2, s3).setFlags(0x6000000);
        ibuq.e(intent1, "setFlags(...)");
        arr_frxf1[0] = new frxg(intent1);
        dwgo0.l(icck2, arr_frxf1);
    }

    @Override  // lom
    public final void onCreate(lps lps0) {
        lol.a(lps0);
    }

    @Override  // lom
    public final void onDestroy(lps lps0) {
        lol.b(lps0);
    }

    @Override  // lom
    public final void onPause(lps lps0) {
        lol.c(lps0);
    }

    @Override  // lom
    public final void onResume(lps lps0) {
        lol.d(lps0);
    }

    @Override  // lom
    public final void onStart(lps lps0) {
        lol.e(lps0);
    }

    @Override  // lom
    public final void onStop(lps lps0) {
        lol.f(lps0);
    }

    private final void p() {
        synchronized(this) {
            dxdy dxdy0 = this.D;
            if(dxdy0 != null) {
                try {
                    dxdy0.close();
                }
                catch(IOException unused_ex) {
                }
                finally {
                    this.D = null;
                }
            }
        }
    }

    private final void q(guwn guwn0) {
        int v = guwn0.b;
        guwr guwr0 = null;
        if(v == 6) {
            this.v.b();
            guwr guwr1 = guwn0.b == 6 ? ((guwr)guwn0.c) : guwr.a;
            this.s = guwr1;
            if(guwr1 == null) {
                ibuq.j("ucpManualInputAction");
                guwr1 = null;
            }
            if(guwr1.f) {
                this.r(gkay.f);
                acp acp0 = this.t;
                if(acp0 == null) {
                    ibuq.j("editCategoryActivityResultLauncher");
                    acp0 = null;
                }
                Context context0 = this.d;
                guwr guwr2 = this.s;
                if(guwr2 == null) {
                    ibuq.j("ucpManualInputAction");
                    guwr2 = null;
                }
                gvbz gvbz0 = guwr2.d == null ? gvbz.a : guwr2.d;
                guwr guwr3 = this.s;
                if(guwr3 == null) {
                    ibuq.j("ucpManualInputAction");
                }
                else {
                    guwr0 = guwr3;
                }
                Intent intent0 = dlnf.H(context0, gvbz0, (guwr0.c == null ? gvby.a : guwr0.c), true, this.r);
                ibuq.e(intent0, "newEditPassCategoryIntent(...)");
                acp0.b(intent0);
                return;
            }
            if(hwvi.d()) {
                guwr guwr4 = this.s;
                if(guwr4 == null) {
                    ibuq.j("ucpManualInputAction");
                    guwr4 = null;
                }
                gvcd gvcd0 = guwr4.b == null ? gvcd.a : guwr4.b;
                ibuq.e(gvcd0, "getUcpInputForm(...)");
                hfuo hfuo0 = gvcd0.h;
                ibuq.e(hfuo0, "getInputFieldList(...)");
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: hfuo0) {
                    gvcc gvcc0 = (gvcc)object0;
                    if((gvcc0.b & 0x20) != 0 && ((gvca.b(gvcc0.i) == null ? gvca.d : gvca.b(gvcc0.i)) == gvca.b || (gvca.b(gvcc0.i) == null ? gvca.d : gvca.b(gvcc0.i)) == gvca.c)) {
                        arrayList0.add(object0);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    for(Object object1: arrayList0) {
                        if((((gvcc)object1).b & 4) == 0) {
                            this.m((guwn0.d == null ? guok.a : guwn0.d));
                            return;
                        }
                        String s = ((gvcc)object1).g;
                        ibuq.e(s, "getValue(...)");
                        if(s.length() <= 0 || (((gvcc)object1).b & 2) == 0) {
                            this.m((guwn0.d == null ? guok.a : guwn0.d));
                            return;
                        }
                        String s1 = ((gvcc)object1).f;
                        ibuq.e(s1, "getLabel(...)");
                        if(s1.length() > 0) {
                            continue;
                        }
                        this.m((guwn0.d == null ? guok.a : guwn0.d));
                        return;
                    }
                }
                guwr guwr5 = this.s;
                if(guwr5 == null) {
                    ibuq.j("ucpManualInputAction");
                    guwr5 = null;
                }
                gvcd gvcd1 = guwr5.b == null ? gvcd.a : guwr5.b;
                ibuq.e(gvcd1, "getUcpInputForm(...)");
                guwr guwr6 = this.s;
                if(guwr6 == null) {
                    ibuq.j("ucpManualInputAction");
                    guwr6 = null;
                }
                gvby gvby0 = guwr6.c == null ? gvby.a : guwr6.c;
                ibuq.e(gvby0, "getCategoryInfo(...)");
                guwr guwr7 = this.s;
                if(guwr7 == null) {
                    ibuq.j("ucpManualInputAction");
                    guwr7 = null;
                }
                gvbz gvbz1 = guwr7.d == null ? gvbz.a : guwr7.d;
                ibuq.e(gvbz1, "getCategorySelectionOptions(...)");
                gged_interceptors gged0 = this.c();
                int v1 = this.p;
                guwr guwr8 = this.s;
                if(guwr8 == null) {
                    ibuq.j("ucpManualInputAction");
                }
                else {
                    guwr0 = guwr8;
                }
                guwj guwj0 = guwr0.e == null ? guwj.a : guwr0.e;
                ibuq.e(guwj0, "getConsentInfo(...)");
                guok guok0 = guwn0.d == null ? guok.a : guwn0.d;
                ibuq.e(guok0, "getPreviewTemplate(...)");
                icck icck0 = lsc.a(this);
                frxf[] arr_frxf = new frxf[1];
                Intent intent1 = dlnf.bz(gvcd1, gvby0, gvbz1, gged0, v1, guwj0, "com.google.android.gms.pay.pass.valuable.view.mutate.enter.VIEW_VALUABLE_PREVIEW_USER_CREATED_PASS", guok0, this.F, this.l, this.q, this.r, this.G).setFlags(0x6000000);
                ibuq.e(intent1, "setFlags(...)");
                arr_frxf[0] = new frxg(intent1);
                this.l(icck0, arr_frxf);
                return;
            }
            this.m((guwn0.d == null ? guok.a : guwn0.d));
            return;
        }
        switch(v) {
            case 7: {
                this.v(gvbx.a(((guwo)guwn0.c).c));
                String s2 = (guwn0.b == 7 ? ((guwo)guwn0.c) : guwo.a).b;
                ibuq.e(s2, "getJsonPayload(...)");
                Intent intent3 = dlnf.bB(null, s2, (this.m ? 12 : 11), this.q, "com.google.android.gms").setFlags(0x6000000);
                ibuq.e(intent3, "setFlags(...)");
                this.v.b();
                this.l(lsc.a(this), new frxf[]{new frxg(intent3)});
                return;
            }
            case 8: {
                this.j();
                this.v.g();
                icck icck2 = lsc.a(this);
                frxf[] arr_frxf2 = new frxf[1];
                Intent intent4 = dlnf.aX((guwn0.b == 8 ? ((guwp)guwn0.c) : guwp.a).b, (guwn0.b == 8 ? ((guwp)guwn0.c) : guwp.a).c).setFlags(0x6000000);
                ibuq.e(intent4, "setFlags(...)");
                arr_frxf2[0] = new frxg(intent4);
                this.l(icck2, arr_frxf2);
                return;
            }
            default: {
                ((ggtj)dwgo.a.j()).x("Failed to find valid action in the response.");
                this.j();
                this.v.g();
                icck icck1 = lsc.a(this);
                frxf[] arr_frxf1 = new frxf[1];
                Intent intent2 = dlnf.aW().setFlags(0x6000000);
                ibuq.e(intent2, "setFlags(...)");
                arr_frxf1[0] = new frxg(intent2);
                this.l(icck1, arr_frxf1);
            }
        }
    }

    private final void r(gkay gkay0) {
        fhvz fhvz0 = fhwa.a(0x33AC4);
        fhvz0.c(fhwp.b(this.c));
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjzs gjzs0 = gjzr.a(((ProtoLiteMessage)gkbe.a).v_newBuilder());
        gjiw gjiw0 = gjiv.a(((ProtoLiteMessage)gkaz.a).v_newBuilder());
        ibuq.f(gkay0, "value");
        ProtoLiteBuilder hftp0 = gjiw0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gkaz)hftp0.b_message).f = gkay0.g;
        ((gkaz)hftp0.b_message).b |= 8;
        gjzs0.c(gjiw0.a());
        gjca0.f(gjzs0.a());
        String s = this.j.a();
        gjca0.b(ghfs.a.c(s, StandardCharsets.UTF_8).c());
        fhvz0.b(douc.a(gjca0.a()));
        fhwa fhwa0 = fhvz0.a();
        this.i.a(fhwa0);
    }

    private final void v(int v) {
        gkay gkay0;
        if(v == 0) {
            gkay0 = gkay.a;
        }
        else {
            switch(v - 2) {
                case 1: {
                    gkay0 = gkay.c;
                    break;
                }
                case 2: {
                    gkay0 = gkay.d;
                    break;
                }
                default: {
                    gkay0 = gkay.b;
                }
            }
        }
        this.r(gkay0);
    }
}

