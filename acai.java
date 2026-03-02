import com.google.android.finsky.apperrors.AppError;
import com.google.android.finsky.apperrors.PlayAppErrorReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class acai implements gfsi {
    public final bbcp a;
    public final gfsi b;
    public final AtomicReference c;
    public final long d;

    public acai(bbcp bbcp0, gfsi gfsi0, AtomicReference atomicReference0, long v) {
        this.a = bbcp0;
        this.b = gfsi0;
        this.c = atomicReference0;
        this.d = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp2;
        int v10;
        HashMap hashMap1;
        int v8;
        bbcp bbcp1;
        ProtoLiteBuilder hftp1;
        bbco bbco0;
        long v = this.d;
        int v2 = Long.compare(v - ((abzr)object0).c, 86400000L) < 0 ? 0 : 1;
        bbcp bbcp0 = this.a;
        if(v2 == 0 && ((abzr)object0).d >= bbcp0.c) {
            return (abzr)object0;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((abzr)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((abzr)object0))));
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        for(int v1 = 0; v1 < ((abzr)object0).b.size(); ++v1) {
            abzq abzq0 = (abzq)((abzr)object0).b.get(v1);
            hashMap0.put(new acae(abzq0.b, abzq0.c, abzq0.d), Integer.valueOf(v1));
        }
        long v3 = v - bbcp0.d;
        long v4 = ((abzr)object0).e;
        if(v4 != 0L) {
            v3 = Math.max(v4, v3);
        }
        Iterator iterator0 = ((Map)this.b.apply(Long.valueOf(v3))).entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            acae acae0 = (acae)((Map.Entry)object1).getKey();
            List list0 = (List)((Map.Entry)object1).getValue();
            int v5 = acae0.c;
            for(Object object2: bbcp0.b) {
                bbco0 = (bbco)object2;
                if(!bbco0.b.contains(Integer.valueOf(v5))) {
                    continue;
                }
                goto label_32;
            }
            bbco0 = null;
        label_32:
            if(bbco0 != null) {
                Integer integer0 = (Integer)hashMap0.get(acae0);
                int v6 = list0.size();
                long v7 = ((hlwj)list0.get(list0.size() - 1)).e;
                if(integer0 == null) {
                    hftp1 = ((ProtoLiteMessage)abzq.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    bbcp1 = bbcp0;
                    ((abzq)hftv0).d = v5;
                    String s = acae0.a;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    v8 = v2;
                    ((abzq)hftv1).b = s;
                    int v9 = acae0.b;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp1.b_message;
                    ((abzq)hftv2).c = v9;
                    if(!hftv2.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp1.b_message;
                    ((abzq)hftv3).e = v7;
                    if(!hftv3.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp1.b_message;
                    ((abzq)hftv4).f = v7;
                    if(!hftv4.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp1.b_message;
                    ((abzq)hftv5).h = v6;
                    if(!hftv5.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp1.b_message;
                    ((abzq)hftv6).g = v6;
                    if(!hftv6.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((abzq)hftp1.b_message).i = v7;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    abzr abzr0 = (abzr)hftp0.b_message;
                    abzq abzq1 = (abzq)hftp1.N_build();
                    abzq1.getClass();
                    abzr0.b();
                    abzr0.b.add(abzq1);
                    hashMap1 = hashMap0;
                    v10 = v5;
                    goto label_133;
                }
                else {
                    bbcp1 = bbcp0;
                    v8 = v2;
                    abzq abzq2 = (abzq)((abzr)hftp0.b_message).b.get(integer0.intValue());
                    hashMap1 = hashMap0;
                    v10 = v5;
                    if(v - abzq2.f > bbco0.c) {
                        hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)abzq2).jf(5, null);
                        hftp2.X(((ProtoLiteMessage)abzq2));
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv9 = hftp2.b_message;
                        ((abzq)hftv9).f = v7;
                        if(!hftv9.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv10 = hftp2.b_message;
                        ((abzq)hftv10).i = v7;
                        if(!hftv10.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv11 = hftp2.b_message;
                        ((abzq)hftv11).g = 1;
                        int v13 = abzq2.h + v6;
                        if(!hftv11.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((abzq)hftp2.b_message).h = v13;
                    label_124:
                        hftp1 = hftp2;
                        int v14 = (int)integer0;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        abzr abzr1 = (abzr)hftp0.b_message;
                        abzq abzq3 = (abzq)hftp1.N_build();
                        abzq3.getClass();
                        abzr1.b();
                        abzr1.b.set(v14, abzq3);
                    label_133:
                        abzq abzq4 = (abzq)hftp1.b_message;
                        int v15 = abzq4.g;
                        if(v15 >= bbco0.d) {
                            arrayList0.add(new AppError(acae0.a, acae0.b, v10, abzq4.e, abzq4.f, abzq4.h, v15, abzq4.i));
                        }
                    }
                    else if(abzq2.g < bbco0.e) {
                        hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)abzq2).jf(5, null);
                        hftp2.X(((ProtoLiteMessage)abzq2));
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv7 = hftp2.b_message;
                        ((abzq)hftv7).i = v7;
                        int v11 = abzq2.h + v6;
                        if(!hftv7.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ProtoLiteMessage hftv8 = hftp2.b_message;
                        ((abzq)hftv8).h = v11;
                        int v12 = abzq2.g + v6;
                        if(!hftv8.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        ((abzq)hftp2.b_message).g = v12;
                        goto label_124;
                    }
                }
                hashMap0 = hashMap1;
                iterator0 = iterator0;
                bbcp0 = bbcp1;
                v2 = v8;
            }
        }
        if(!arrayList0.isEmpty()) {
            if(v2 == 0) {
                ProtoLiteMessage hftv13 = hftp0.b_message;
                int v16 = ((abzr)hftv13).d + 1;
                if(!hftv13.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((abzr)hftp0.b_message).d = v16;
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv12 = hftp0.b_message;
                ((abzr)hftv12).c = v;
                if(!hftv12.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((abzr)hftp0.b_message).d = 1;
            }
            PlayAppErrorReport playAppErrorReport0 = new PlayAppErrorReport(arrayList0, ((abzr)hftp0.b_message).d);
            this.c.set(playAppErrorReport0);
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((abzr)hftp0.b_message).e = v;
        return (abzr)hftp0.N_build();
    }
}

