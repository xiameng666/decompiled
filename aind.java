import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse.BlockstoreData;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import java.util.ArrayList;
import java.util.Map.Entry;

public final class aind implements gfsi {
    public final aink a;
    public final long b;
    public final RetrieveBytesRequest c;

    public aind(aink aink0, long v, RetrieveBytesRequest retrieveBytesRequest0) {
        this.a = aink0;
        this.b = v;
        this.c = retrieveBytesRequest0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        boolean z;
        int v5;
        int v4;
        int v3;
        int v2;
        gfsx gfsx0 = ((aiod)object0).a;
        if(!gfsx0.i()) {
            return new RetrieveBytesResponse(new Bundle(), new ArrayList());
        }
        Object object1 = gfsx0.d();
        Bundle bundle0 = new Bundle();
        ArrayList arrayList0 = new ArrayList();
        ggeo ggeo0 = ((ajah)object1).b;
        int v = 0;
        if(ggeo0.isEmpty()) {
            v5 = 0;
            z = false;
            v2 = 0;
            v3 = 0;
            v4 = 0;
        }
        else {
            arrayList0 = new ArrayList();
            int v1 = 0;
            v2 = 0;
            v3 = 0;
            v4 = 0;
            ggqj ggqj0 = ggeo0.v().om();
            while(ggqj0.hasNext()) {
                Object object2 = ggqj0.next();
                ajaf ajaf0 = (ajaf)((Map.Entry)object2).getValue();
                switch(aink.g(ajaf0.b, ajaf0.c) - 1) {
                    case 2: {
                        ++v4;
                        break;
                    }
                    case 3: {
                        ++v3;
                        break;
                    }
                    default: {
                        ++v2;
                    }
                }
                v1 += ajaf0.a.size();
                ajaf0.a.size();
                v |= ajca.b(((String)((Map.Entry)object2).getKey())) ^ 1;
                byte[] arr_b = ajaf0.a.toByteArray();
                batl.t(arr_b, "bytes cannot be set to null");
                String s = ajca.a(((String)((Map.Entry)object2).getKey()));
                batl.t(s, "key cannot be set to null");
                batl.r(s, "key must be set");
                arrayList0.add(new RetrieveBytesResponse.BlockstoreData(arr_b, s));
            }
            v5 = arrayList0.size();
            int v6 = v;
            v = v1;
            z = v6;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v7 = SystemClock.elapsedRealtime() - this.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aink aink0 = this.a;
        wvd wvd0 = (wvd)hftp0.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v7;
        wvd wvd1 = (wvd)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wvp.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        aink0.d.getClass();
        ((wvp)hftv0).b |= 1;
        ((wvp)hftv0).c = aink0.d;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((wvp)hftv1).b |= 2;
        ((wvp)hftv1).d = v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((wvp)hftv2).b |= 4;
        ((wvp)hftv2).e = v5;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp1.b_message;
        ((wvp)hftv3).b |= 8;
        ((wvp)hftv3).f = z;
        boolean z1 = ((ajah)object1).a;
        if(!hftv3.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvp wvp0 = (wvp)hftp1.b_message;
        wvp0.b |= 16;
        wvp0.g = z1;
        int v8 = aizr.r(((ajah)object1).c);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp1.b_message;
        ((wvp)hftv4).h = v8 - 1;
        ((wvp)hftv4).b |= 0x20;
        wvj wvj0 = ((aiod)object0).b;
        if(!hftv4.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp1.b_message;
        wvj0.getClass();
        ((wvp)hftv5).i = wvj0;
        ((wvp)hftv5).b |= 0x80;
        if(!hftv5.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvp wvp1 = (wvp)hftp1.b_message;
        wvd1.getClass();
        wvp1.j = wvd1;
        wvp1.b |= 0x100;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wvm.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv6 = hftp2.b_message;
        ((wvm)hftv6).b |= 1;
        ((wvm)hftv6).c = v4;
        if(!hftv6.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv7 = hftp2.b_message;
        ((wvm)hftv7).b |= 2;
        ((wvm)hftv7).d = v3;
        if(!hftv7.isImmutable()) {
            hftp2.ensureMutable();
        }
        wvm wvm0 = (wvm)hftp2.b_message;
        wvm0.b |= 4;
        wvm0.e = v2;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        RetrieveBytesRequest retrieveBytesRequest0 = this.c;
        wvp wvp2 = (wvp)hftp1.b_message;
        wvm wvm1 = (wvm)hftp2.N_build();
        wvm1.getClass();
        wvp2.l = wvm1;
        wvp2.b |= 0x400;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)wvk.a).v_newBuilder();
        boolean z2 = retrieveBytesRequest0.a;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        wvk wvk0 = (wvk)hftp3.b_message;
        wvk0.b |= 1;
        wvk0.c = z2;
        int v9 = retrieveBytesRequest0.a().size();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        wvk wvk1 = (wvk)hftp3.b_message;
        wvk1.b |= 2;
        wvk1.d = v9;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvp wvp3 = (wvp)hftp1.b_message;
        wvk wvk2 = (wvk)hftp3.N_build();
        wvk2.getClass();
        wvp3.m = wvk2;
        wvp3.b |= 0x800;
        wvp wvp4 = (wvp)hftp1.N_build();
        if(hpsg.e()) {
            aink0.f(wvp4);
            return new RetrieveBytesResponse(bundle0, arrayList0);
        }
        aink0.g.k(wvp4);
        return new RetrieveBytesResponse(bundle0, arrayList0);
    }
}

