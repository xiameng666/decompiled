import android.os.SystemClock;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;

public final class aing implements glzn {
    public final aink a;
    public final DeleteBytesRequest b;
    public final long c;

    public aing(aink aink0, DeleteBytesRequest deleteBytesRequest0, long v) {
        this.a = aink0;
        this.b = deleteBytesRequest0;
        this.c = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wus.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aink aink0 = this.a;
        DeleteBytesRequest deleteBytesRequest0 = this.b;
        wus wus0 = (wus)hftp0.b_message;
        String s = aink0.d;
        s.getClass();
        wus0.b |= 1;
        wus0.c = s;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wuq.a).v_newBuilder();
        boolean z = deleteBytesRequest0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wuq wuq0 = (wuq)hftp1.b_message;
        wuq0.b |= 1;
        wuq0.c = z;
        int v = deleteBytesRequest0.a().size();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wuq wuq1 = (wuq)hftp1.b_message;
        wuq1.b |= 2;
        wuq1.d = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wus wus1 = (wus)hftp0.b_message;
        wuq wuq2 = (wuq)hftp1.N_build();
        wuq2.getClass();
        wus1.f = wuq2;
        wus1.b |= 8;
        int v1 = ((aizt)object0).b - 1;
        if(((aizt)object0).b == 0) {
            throw null;
        }
        long v2 = this.c;
        if(v1 != 1) {
            ((ggtj)aink.a.j()).B("Deletion failed for package \'%s\'!", s);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((wus)hftp0.b_message).e = 0;
            ((wus)hftp0.b_message).b |= 4;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
            long v3 = SystemClock.elapsedRealtime() - v2;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            wvd wvd0 = (wvd)hftp2.b_message;
            wvd0.b |= 1;
            wvd0.c = (int)v3;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            wus wus2 = (wus)hftp0.b_message;
            wvd wvd1 = (wvd)hftp2.N_build();
            wvd1.getClass();
            wus2.g = wvd1;
            wus2.b |= 16;
            wus wus3 = (wus)hftp0.N_build();
            aink0.g.g(wus3);
            return gmbu.h(new aiml(8));
        }
        boolean z1 = ((aizt)object0).a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((wus)hftv0).b |= 2;
        ((wus)hftv0).d = z1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((wus)hftp0.b_message).e = 1;
        ((wus)hftp0.b_message).b |= 4;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v4 = SystemClock.elapsedRealtime() - v2;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        wvd wvd2 = (wvd)hftp3.b_message;
        wvd2.b |= 1;
        wvd2.c = (int)v4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wus wus4 = (wus)hftp0.b_message;
        wvd wvd3 = (wvd)hftp3.N_build();
        wvd3.getClass();
        wus4.g = wvd3;
        wus4.b |= 16;
        wus wus5 = (wus)hftp0.N_build();
        aink0.g.g(wus5);
        return gmbu.i(Boolean.valueOf(z1));
    }
}

