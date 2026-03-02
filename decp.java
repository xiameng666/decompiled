import android.content.Context;
import android.net.Uri;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class decp extends ibsk implements ibtw {
    Object a;
    Object b;
    int c;
    final List d;
    final List e;
    final Context f;
    final boolean g;
    private Object h;

    public decp(List list0, List list1, Context context0, boolean z, ibrl ibrl0) {
        this.d = list0;
        this.e = list1;
        this.f = context0;
        this.g = z;
        super(ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((decp)this.c(((ibxt)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new decp(this.d, this.e, this.f, this.g, ibrl0);
        ibrl1.h = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object7;
        ibxt ibxt2;
        Object object6;
        deak deak0;
        sng sng0;
        InputStream inputStream0;
        ibxt ibxt1;
        dedf dedf0;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                ibxt ibxt0 = (ibxt)this.h;
                Context context0 = this.f;
                boolean z = this.g;
                Iterator iterator0 = this.d.iterator();
                ArrayList arrayList0 = new ArrayList(ibpo.q(this.e, 10));
                for(Object object2: this.e) {
                    Attachment attachment0 = (Attachment)object2;
                    if((attachment0 instanceof WifiCredentialsAttachment)) {
                        ibuq.e(((WifiCredentialsAttachment)attachment0).a, "getSsid(...)");
                        dedf0 = new dedf(((WifiCredentialsAttachment)attachment0).a);
                        ibxt1 = ibxt0;
                    }
                    else if((attachment0 instanceof FileAttachment)) {
                        int v = ((FileAttachment)attachment0).b;
                        if(v != 1 && v != 2) {
                            switch(v) {
                                case 4: {
                                    ibxt1 = ibxt0;
                                    ibuq.e(((FileAttachment)attachment0).a, "getFileName(...)");
                                    dedf0 = new decr(((FileAttachment)attachment0).a);
                                    goto label_127;
                                }
                                case 6: {
                                    String s = ((FileAttachment)attachment0).a;
                                    ibuq.e(s, "getFileName(...)");
                                    Uri uri0 = ((FileAttachment)attachment0).d;
                                    if(uri0 == null) {
                                        ibxt1 = ibxt0;
                                    }
                                    else {
                                        ibuq.f(context0, "context");
                                        if(hvqz.a.b().au()) {
                                            deai deai0 = new deai();
                                            ibot ibot0 = new ibot(((ibow)deaj.d));
                                            while(ibot0.hasNext()) {
                                                Object object3 = ibot0.next();
                                                deaj deaj0 = (deaj)object3;
                                                if(ibuq.m(uri0.getScheme(), "file")) {
                                                    String s1 = uri0.getPath();
                                                    if(s1 == null) {
                                                        throw new IllegalArgumentException("Required value was null.");
                                                    }
                                                    ibxt1 = ibxt0;
                                                    inputStream0 = new BufferedInputStream(new FileInputStream(new File(s1)), 0x2000);
                                                }
                                                else {
                                                    ibxt1 = ibxt0;
                                                    inputStream0 = cuqf.f(context0, uri0, fqbe.b);
                                                }
                                                if(inputStream0 != null) {
                                                    try {
                                                        switch(deaj0.ordinal()) {
                                                            case 0: {
                                                                sng0 = new sng();
                                                                break;
                                                            }
                                                            case 1: {
                                                                sng0 = new snh();
                                                                break;
                                                            }
                                                            case 2: {
                                                                sng0 = new sni();
                                                                break;
                                                            }
                                                            default: {
                                                                throw new ibnq();
                                                            }
                                                        }
                                                        sng0.b(deai0);
                                                        sng0.a(inputStream0);
                                                        goto label_77;
                                                    }
                                                    catch(snu snu0) {
                                                        dcvz.a.f(snu0).b().p("Failed to parse VCard because of wrong version", new Object[0]);
                                                        deai0 = new deai();
                                                        ibxt0 = ibxt1;
                                                        continue;
                                                    }
                                                    catch(snp snp0) {
                                                        dcvz.a.f(snp0).b().p("Failed to parse VCard", new Object[0]);
                                                        deai0 = new deai();
                                                        inputStream0.reset();
                                                        ibxt0 = ibxt1;
                                                        continue;
                                                    }
                                                    catch(IOException iOException0) {
                                                        dcvz.a.f(iOException0).e().p("Failed to open VCard", new Object[0]);
                                                        deak0 = null;
                                                        dedf0 = new decs(s, deak0);
                                                        goto label_127;
                                                    }
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            ibxt1 = ibxt0;
                                        label_77:
                                            String s2 = deai0.a;
                                            List list0 = deai0.c;
                                            List list1 = deai0.b;
                                            if(s2 != null) {
                                                ArrayList arrayList1 = new ArrayList();
                                                for(Object object4: list1) {
                                                    arrayList1.add(new deaz(((String)object4)));
                                                }
                                                for(Object object5: list0) {
                                                    arrayList1.add(new deay(((String)object5)));
                                                }
                                                deak0 = new deak(s2, (deai0.e == null ? null : ibpg.J(deai0.e)), arrayList1, deai0.d);
                                                dedf0 = new decs(s, deak0);
                                                goto label_127;
                                            }
                                        }
                                        else {
                                            ibxt1 = ibxt0;
                                        }
                                    }
                                    deak0 = null;
                                    dedf0 = new decs(s, deak0);
                                    goto label_127;
                                }
                                default: {
                                    ibuq.e(((FileAttachment)attachment0).a, "getFileName(...)");
                                    dedf0 = new dect(((FileAttachment)attachment0).a);
                                    ibxt1 = ibxt0;
                                    goto label_127;
                                }
                            }
                        }
                        else {
                            ibxt1 = ibxt0;
                            Uri uri1 = ((FileAttachment)attachment0).d;
                            if(uri1 == null) {
                                ibuq.e(((FileAttachment)attachment0).a, "getFileName(...)");
                                dedf0 = new decw(((FileAttachment)attachment0).a);
                            }
                            else {
                                ibuq.e(((FileAttachment)attachment0).a, "getFileName(...)");
                                dedf0 = new decx(uri1, ((FileAttachment)attachment0).a);
                            }
                            goto label_127;
                        }
                        goto label_109;
                    }
                    else {
                    label_109:
                        ibxt1 = ibxt0;
                        if(!(attachment0 instanceof TextAttachment)) {
                            dedf0 = dede.a;
                        }
                        else if(z) {
                            ibuq.e(((TextAttachment)attachment0).a, "getTextBody(...)");
                            dedf0 = new deda(((TextAttachment)attachment0).g, ((TextAttachment)attachment0).a);
                        }
                        else {
                            switch(((TextAttachment)attachment0).b) {
                                case 1: {
                                    ibuq.e(((TextAttachment)attachment0).a, "getTextBody(...)");
                                    dedf0 = new dedc(((TextAttachment)attachment0).g, ((TextAttachment)attachment0).a);
                                    break;
                                }
                                case 2: {
                                    ibuq.e(((TextAttachment)attachment0).a, "getTextBody(...)");
                                    dedf0 = new decz(((TextAttachment)attachment0).g, ((TextAttachment)attachment0).a);
                                    break;
                                }
                                default: {
                                    ibuq.e(((TextAttachment)attachment0).a, "getTextBody(...)");
                                    dedf0 = new dedb(((TextAttachment)attachment0).g, ((TextAttachment)attachment0).a);
                                }
                            }
                        }
                    }
                label_127:
                    arrayList0.add(dedf0);
                    ibxt0 = ibxt1;
                }
                object6 = arrayList0.iterator();
                ibxt2 = ibxt0;
                object7 = iterator0;
                goto label_139;
            }
            case 1: {
                object6 = this.b;
                object7 = this.a;
                ibxt2 = (ibxt)this.h;
                ibnx.b(object0);
                break;
            }
            default: {
                ibnx.b(object0);
                return ibom.a;
            }
        }
        while(true) {
            ((Iterator)object6).next();
        label_139:
            if(!((Iterator)object7).hasNext() || !((Iterator)object6).hasNext()) {
                break;
            }
            Object object8 = ((Iterator)object7).next();
            decx decx0 = new decx(((Uri)object8), "");
            this.h = ibxt2;
            this.a = object7;
            this.b = object6;
            this.c = 1;
            if(ibxt2.a(decx0, this) == object1) {
                return object1;
            }
        }
        this.h = null;
        this.a = null;
        this.b = null;
        this.c = 2;
        return ibxt2.b(((Iterator)object6), this) == object1 ? object1 : ibom.a;
    }
}

