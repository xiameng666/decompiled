import com.google.android.wallet.bender3.framework.client.ParcelableKeyValue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class gauw implements ibth {
    public final gavf a;
    public final hckt b;
    public final List c;

    public gauw(gavf gavf0, hckt hckt0, List list0) {
        this.a = gavf0;
        this.b = hckt0;
        this.c = list0;
    }

    @Override  // ibth
    public final Object a() {
        hckt hckt0 = this.b;
        ibuq.f(hckt0, "actionToken");
        List list0 = this.c;
        if(list0 != null && !list0.isEmpty()) {
            hdvf hdvf0 = hckt0.c == null ? hdvf.a : hckt0.c;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hdvf0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hdvf0));
            ibuq.e(hftp0, "toBuilder(...)");
            gaym gaym0 = this.a.b.g;
            ibuq.e(gaym0, "getEventLogger(...)");
            hcst hcst0 = gawz.a(((hdve)hftp0), this.a.b.e, gaym0, this.a.b.f);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hcst0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)hcst0));
            ibuq.e(hftp1, "toBuilder(...)");
            hcst hcst1 = (hcst)hftp1.b_message;
            hcsw hcsw0 = hcst1.c == 2 ? ((hcsw)hcst1.d) : hcsw.a;
            ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hcsw0).jf(5, null);
            hftp2.X(((ProtoLiteMessage)hcsw0));
            ibuq.e(hftp2, "toBuilder(...)");
            hfuo hfuo0 = hckt0.e;
            ibuq.e(hfuo0, "getDataSecureFieldReferenceList(...)");
            hfuo hfuo1 = hckt0.f;
            ibuq.e(hfuo1, "getDataValueSecureFieldReferenceList(...)");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
            for(Object object0: list0) {
                linkedHashMap1.put(Integer.valueOf(((ParcelableKeyValue)object0).a), ((ParcelableKeyValue)object0).b);
            }
            ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
            for(Object object1: hfuo0) {
                Object object2 = linkedHashMap1.get(Integer.valueOf(((hcox)object1).b));
                ibuq.c(object2);
                arrayList0.add(new gbja(((String)object2), ((hcox)object1)));
            }
            for(Object object3: arrayList0) {
                Long long0 = (long)((gbja)object3).b.c;
                Object object4 = linkedHashMap0.get(long0);
                if(object4 == null) {
                    object4 = new gbjb();
                    linkedHashMap0.put(long0, object4);
                }
                ((gbjb)object4).a().add(((gbja)object3));
            }
            ArrayList arrayList1 = new ArrayList(ibpo.q(hfuo1, 10));
            for(Object object5: hfuo1) {
                Object object6 = linkedHashMap1.get(Integer.valueOf(((hcox)object5).b));
                ibuq.c(object6);
                arrayList1.add(new gbja(((String)object6), ((hcox)object5)));
            }
            for(Object object7: arrayList1) {
                Long long1 = (long)((gbja)object7).b.c;
                Object object8 = linkedHashMap0.get(long1);
                if(object8 == null) {
                    object8 = new gbjb();
                    linkedHashMap0.put(long1, object8);
                }
                ((gbjb)object8).b().add(((gbja)object7));
            }
            hdul hdul0 = ((hcsw)hftp2.b_message).c;
            if(hdul0 == null) {
                hdul0 = hdul.a;
            }
            ibuq.e(hdul0, "getNewPage(...)");
            hfuo hfuo2 = hdul0.e;
            ibuq.e(hfuo2, "getDataList(...)");
            ArrayList arrayList2 = new ArrayList(ibpo.q(hfuo2, 10));
            for(Object object9: hfuo2) {
                hcos hcos0 = ((hcnu)object9).c;
                if(hcos0 == null) {
                    hcos0 = hcos.a;
                }
                gbjb gbjb0 = (gbjb)linkedHashMap0.get(Long.valueOf(hcos0.c));
                if(gbjb0 == null) {
                    gbjb0 = new gbjb();
                }
                arrayList2.add(gbpa.a(((hcnu)object9), gbjb0.a(), gbjb0.b()));
            }
            ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)hdul0).jf(5, null);
            hftp3.X(((ProtoLiteMessage)hdul0));
            if(!((hduk)hftp3).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hduk)hftp3))).ensureMutable();
            }
            ((hdul)((hduk)hftp3).b_message).e = hfvv.a;
            ((hduk)hftp3).a(arrayList2);
            ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)(((hduk)hftp3))).N_build();
            ibuq.e(hftv0, "build(...)");
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            hcsw hcsw1 = (hcsw)hftp2.b_message;
            ((hdul)hftv0).getClass();
            hcsw1.c = (hdul)hftv0;
            hcsw1.b |= 1;
            hcsw hcsw2 = (hcsw)hftp2.N_build();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hcst hcst2 = (hcst)hftp1.b_message;
            hcsw2.getClass();
            hcst2.d = hcsw2;
            hcst2.c = 2;
            hcst hcst3 = (hcst)hftp1.N_build();
            if(!((hdve)hftp0).b_message.isImmutable()) {
                ((ProtoLiteBuilder)(((hdve)hftp0))).ensureMutable();
            }
            hdvf hdvf1 = (hdvf)((hdve)hftp0).b_message;
            hcst3.getClass();
            hdvf1.c = hcst3;
            hdvf1.b = 2;
            ProtoLiteMessage hftv1 = ((ProtoLiteBuilder)(((hdve)hftp0))).N_build();
            ibuq.c(hftv1);
            return (hdvf)hftv1;
        }
        Object object10 = hckt0.c == null ? hdvf.a : hckt0.c;
        ibuq.c(object10);
        return object10;
    }
}

