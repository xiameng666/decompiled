import android.content.Context;
import android.net.Uri;
import com.google.android.gms.chimera.modules.pay.AppContextProvider;
import com.google.android.gms.common.api.Status;
import dagger.Lazy;
import dagger.internal.Preconditions;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@cmcs(a = cmcr.c)
public final class ebfb extends ebav {
    public Lazy a;
    public Lazy b;
    public Lazy c;
    public Lazy d;
    private static final bboh e;
    private final byte[] f;
    private final donp g;
    private ebev h;

    static {
        ebfb.e = bboh.b("Pay", bbcu.cZ);
    }

    public ebfb(byte[] arr_b, String s, donp donp0, azug azug0) {
        ibuq.f(arr_b, "request");
        ibuq.f(s, "callingPackage");
        ibuq.f(donp0, "callbacks");
        super("PerformGw4Operation", s, azug0);
        this.f = arr_b;
        this.g = donp0;
    }

    @Override  // ebaw
    public final void b(Context context0) {
        dsik dsik0;
        gfnx gfnx1;
        guwn guwn0;
        String s3;
        byte[] arr_b;
        Lazy lazy2;
        String s1;
        ibuq.f(context0, "context");
        hftc hftc0 = hftc.a();
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gfnw.a), this.f, 0, this.f.length, hftc0);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        gfnw gfnw0 = (gfnw)hftv0;
        ibuq.e(gfnw0, "parseFrom(...)");
        String s = gfnw0.d;
        ibuq.e(s, "getAccountName(...)");
        try {
            s1 = acso.e(context0, s);
            goto label_16;
        }
        catch(acse acse0) {
            a.ae(ebfb.e.i(), "Failed to fetch account ID", acse0);
        }
        catch(IOException iOException0) {
            a.ae(ebfb.e.i(), "Failed to fetch account ID", iOException0);
        }
        s1 = null;
    label_16:
        if(s1 == null) {
            this.g.b(Status.d, new byte[0]);
            return;
        }
        if(this.h == null) {
            domv domv0 = domu.a(context0);
            Preconditions.b(domv0);
            Context context1 = AppContextProvider.a();
            ibuq.e(context1, "getApplicationContext(...)");
            this.h = new ebev(dlmg.a(context1, s, s1), new dmgr(this.j), domv0);
        }
        ebev ebev0 = this.h;
        if(ebev0 != null) {
            ebev0.inject(this);
        }
        int v = gfnv.a(gfnw0.b);
        if(v == 0) {
            throw null;
        }
        switch(v - 1) {
            case 0: {
                gfnx1 = ((ebez)this.c().get()).a(gfnw0);
                goto label_259;
            }
            case 1: {
                gfnx1 = ((ebez)this.c().get()).a(gfnw0);
                goto label_259;
            }
            case 2: {
                lazy2 = this.b;
                if(lazy2 == null) {
                    ibuq.j("setPassInteractionStateOperator");
                    lazy2 = null;
                }
                break;
            }
            default: {
                switch(v - 1) {
                    case 3: {
                        Lazy lazy0 = this.c;
                        if(lazy0 == null) {
                            ibuq.j("setBulkImportStateOperator");
                            lazy0 = null;
                        }
                        ebfc ebfc0 = (ebfc)lazy0.get();
                        ibuq.f(gfnw0, "request");
                        int v1 = gfnw0.b;
                        int v2 = gfnv.a(v1);
                        if(v2 == 0) {
                            throw null;
                        }
                        if(v2 - 1 == 3) {
                            try {
                                gfob gfob0 = v1 == 5 ? ((gfob)gfnw0.c) : gfob.a;
                                if((gfob0.b & 1) != 0) {
                                    dxxt dxxt0 = ebfc0.a;
                                    gfob gfob1 = gfnw0.b == 5 ? ((gfob)gfnw0.c) : gfob.a;
                                    gfoa gfoa0 = gfob1.c;
                                    if(gfoa0 == null) {
                                        gfoa0 = gfoa.a;
                                    }
                                    dxxs dxxs0 = new dxxs(new dxxr(gfoa0.b));
                                    bblp bblp0 = new bblp(1, 9);
                                    ((glyq)dxxt0.a.b(dxxs0, bblp0)).u();
                                }
                                int v3 = gfnw0.b;
                                gfob gfob2 = v3 == 5 ? ((gfob)gfnw0.c) : gfob.a;
                                if((gfob2.b & 2) == 0) {
                                    goto label_257;
                                }
                                dxxt dxxt1 = ebfc0.a;
                                gfob gfob3 = v3 == 5 ? ((gfob)gfnw0.c) : gfob.a;
                                gfnz gfnz0 = gfob3.d;
                                if(gfnz0 == null) {
                                    gfnz0 = gfnz.a;
                                }
                                dxxq dxxq0 = new dxxq(new dxxp(gfnz0.b));
                                bblp bblp1 = new bblp(1, 9);
                                ((glyq)dxxt1.a.b(dxxq0, bblp1)).u();
                                goto label_257;
                            }
                            catch(IllegalArgumentException illegalArgumentException0) {
                                throw new cjuh(13, null, null, illegalArgumentException0);
                            }
                            catch(ExecutionException executionException0) {
                                throw new cjuh(13, null, null, executionException0);
                            }
                            catch(InterruptedException interruptedException0) {
                                throw new cjuh(13, null, null, interruptedException0);
                            }
                        }
                        throw new cjuh(13, null);
                    }
                    case 4: {
                        Lazy lazy1 = this.d;
                        if(lazy1 == null) {
                            ibuq.j("detectUserCreatedPassOperator");
                            lazy1 = null;
                        }
                        ebex ebex0 = (ebex)lazy1.get();
                        ibuq.f(gfnw0, "request");
                        if(gfnv.a(gfnw0.b) != 5) {
                            throw new cjuh(13, null);
                        }
                        ArrayList arrayList0 = new ArrayList();
                        gfns gfns0 = gfnw0.b == 6 ? ((gfns)gfnw0.c) : gfns.a;
                        for(Object object0: gfns0.b) {
                            gfod gfod0 = (gfod)object0;
                            if(gfod0.b == 1) {
                                String s2 = (String)gfod0.c;
                                ibuq.e(s2, "getImageUri(...)");
                                Uri uri0 = Uri.parse(s2);
                                try {
                                    InputStream inputStream0 = dvlx.a(ebex0.b, uri0);
                                    try {
                                        arr_b = ghjj.g(inputStream0);
                                    }
                                    catch(Throwable throwable0) {
                                        ibsx.a(inputStream0, throwable0);
                                        throw throwable0;
                                    }
                                    ibsx.a(inputStream0, null);
                                }
                                catch(IOException iOException1) {
                                    a.e(ebex.a.i(), "Fail to get image bytes for image uri %s", uri0, iOException1);
                                    throw new cjuh(13, "Fail to get image bytes", null, iOException1);
                                }
                                ibuq.c(arr_b);
                                byte[] arr_b1 = ebex0.c.a(arr_b);
                                gvcf gvcf0 = gvce.a(((ProtoLiteMessage)guwv.a).v_newBuilder());
                                gvbv gvbv0 = gvbu.a(((ProtoLiteMessage)guwt.a).v_newBuilder());
                                gvbv0.c(ByteString.copyFrom(arr_b1));
                                gvbv0.b(hwvf.c());
                                gvcf0.b(gvbv0.a());
                                arrayList0.add(gvcf0.a());
                            }
                        }
                        if(arrayList0.isEmpty()) {
                            throw new cjuh(13, null);
                        }
                        gfns gfns1 = gfnw0.b == 6 ? ((gfns)gfnw0.c) : gfns.a;
                        guwc guwc0 = guwc.b(gfns1.c);
                        if(guwc0 == null) {
                            guwc0 = guwc.i;
                        }
                        ibuq.e(guwc0, "getUserCreatedPassOrigin(...)");
                        guwl guwl0 = (guwl)((ProtoLiteMessage)guwm.b).v_newBuilder();
                        ibuq.f(guwl0, "builder");
                        List list0 = DesugarCollections.unmodifiableList(((guwm)guwl0.b_message).c);
                        ibuq.e(list0, "getResourcesList(...)");
                        new hfxu(list0);
                        guwl0.k(arrayList0);
                        new hfxu(new hfuh(((guwm)guwl0.b_message).e, guwm.a));
                        guwl0.a(ebex0.d);
                        if(hwfk.y()) {
                            guwi.a(guwc0, guwl0);
                        }
                        else {
                            guwi.a(guwc.a, guwl0);
                        }
                        if(hwfk.U() && ebex0.e.d != null) {
                            s3 = ebex0.f.c();
                            ibuq.c(s3);
                        }
                        else {
                            s3 = "";
                        }
                        ibuq.f(s3, "value");
                        if(!guwl0.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)guwl0).ensureMutable();
                        }
                        guwm guwm0 = (guwm)guwl0.b_message;
                        s3.getClass();
                        guwm0.f = s3;
                        ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)guwl0).N_build();
                        ibuq.e(hftv1, "build(...)");
                        guwm guwm1 = (guwm)hftv1;
                        try {
                            MessageLite hfvm0 = dptv.e(ebex0.e, dpuj.aU, ((MessageLite)guwm1), ((MessageLite)guwn.a));
                            ibuq.c(hfvm0);
                            guwn0 = (guwn)hfvm0;
                        }
                        catch(IOException iOException2) {
                            a.ae(ebex.a.j(), "Detect user created pass failed", iOException2);
                            throw new cjuh(13, null, null, iOException2);
                        }
                        catch(dpuk dpuk0) {
                            a.ae(ebex.a.j(), "Detect user created pass failed", dpuk0);
                            throw new cjuh(13, null, null, dpuk0);
                        }
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gfnx.a).v_newBuilder();
                        ibuq.f(hftp0, "builder");
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gfnt.a).v_newBuilder();
                        ibuq.f(hftp1, "builder");
                        ibuq.f(guwn0, "value");
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gfnt gfnt0 = (gfnt)hftp1.b_message;
                        guwn0.getClass();
                        gfnt0.c = guwn0;
                        gfnt0.b |= 1;
                        ProtoLiteMessage hftv2 = hftp1.N_build();
                        ibuq.e(hftv2, "build(...)");
                        ibuq.f(((gfnt)hftv2), "value");
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gfnx gfnx0 = (gfnx)hftp0.b_message;
                        ((gfnt)hftv2).getClass();
                        gfnx0.c = (gfnt)hftv2;
                        gfnx0.b = 2;
                        ProtoLiteMessage hftv3 = hftp0.N_build();
                        ibuq.e(hftv3, "build(...)");
                        gfnx1 = (gfnx)hftv3;
                        goto label_259;
                    }
                    default: {
                        throw new cjuh(13, null);
                    }
                }
            }
        }
        ebfe ebfe0 = (ebfe)lazy2.get();
        ibuq.f(gfnw0, "request");
        int v4 = gfnw0.b;
        int v5 = gfnv.a(v4);
        if(v5 == 0) {
            throw null;
        }
        if(v5 - 1 != 2) {
            throw new cjuh(13, null);
        }
        try {
            dsio dsio0 = ebfe0.a;
            gfoc gfoc0 = v4 == 4 ? ((gfoc)gfnw0.c) : gfoc.a;
            String s4 = gfoc0.b;
            switch(s4) {
                case "barcode_image_picker_dialog": {
                    dsik0 = new dsik("barcode_image_picker_dialog");
                    break;
                }
                case "bulk_import_onboarding": {
                    dsik0 = new dsik("bulk_import_onboarding");
                    break;
                }
                case "nfc_education_bulletin": {
                    dsik0 = new dsik("nfc_education_bulletin");
                    break;
                }
                case "share_education_dialog": {
                    dsik0 = new dsik("share_education_dialog");
                    break;
                }
                case "ucp_one_time_acknowledgement": {
                    dsik0 = new dsik("ucp_one_time_acknowledgement");
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Invalid interaction state identifier: ".concat(String.valueOf(s4)));
                }
            }
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)donh.a).v_newBuilder();
            gfoc gfoc1 = gfnw0.b == 4 ? ((gfoc)gfnw0.c) : gfoc.a;
            boolean z = gfoc1.c;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((donh)hftp2.b_message).c = z;
            gfoc gfoc2 = gfnw0.b == 4 ? ((gfoc)gfnw0.c) : gfoc.a;
            hfwn hfwn0 = gfoc2.d;
            if(hfwn0 == null) {
                hfwn0 = hfwn.a;
            }
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            donh donh0 = (donh)hftp2.b_message;
            hfwn0.getClass();
            donh0.d = hfwn0;
            donh0.b |= 1;
            Void void0 = (Void)((glyq)dsio0.b(dsik0, ((donh)hftp2.N_build()))).u();
        }
        catch(IllegalArgumentException illegalArgumentException1) {
            throw new cjuh(13, null, null, illegalArgumentException1);
        }
        catch(ExecutionException executionException1) {
            throw new cjuh(13, null, null, executionException1);
        }
        catch(InterruptedException interruptedException1) {
            throw new cjuh(13, null, null, interruptedException1);
        }
    label_257:
        gfnx1 = gfnx.a;
        ibuq.e(gfnx1, "getDefaultInstance(...)");
    label_259:
        byte[] arr_b2 = gfnx1.toBytesArray();
        this.g.b(Status.b, arr_b2);
    }

    public final Lazy c() {
        Lazy lazy0 = this.a;
        if(lazy0 != null) {
            return lazy0;
        }
        ibuq.j("notificationDelegationOperator");
        return null;
    }

    @Override  // cjtm
    public final void j(Status status0) {
        ibuq.f(status0, "status");
        this.g.b(status0, null);
    }
}

