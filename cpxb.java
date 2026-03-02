import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.mdd.FileGroupRequest;

public abstract class cpxb extends cjtm {
    protected final fjtv a;
    protected final FileGroupRequest b;
    protected final String c;
    protected final int d;
    protected final fkbg e;
    protected final long f;
    protected final int g;
    private volatile int h;

    public cpxb(String s, fjtv fjtv0, FileGroupRequest fileGroupRequest0, String s1, int v, int v1, fkbg fkbg0, azug azug0) {
        super(0x98, s, azug0);
        this.h = -1;
        this.a = fjtv0;
        this.b = fileGroupRequest0;
        this.c = s1;
        this.d = v;
        this.g = v1;
        this.e = fkbg0;
        this.f = SystemClock.elapsedRealtime();
    }

    protected final void b(glsl glsl0, fjbs fjbs0) {
        glnx glnx1;
        if(fjbs0 == null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)glnx.a).v_newBuilder();
            String s2 = this.b.a;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            glnx glnx2 = (glnx)hftp1.b_message;
            s2.getClass();
            glnx2.b |= 1;
            glnx2.c = s2;
            glnx1 = (glnx)hftp1.N_build();
        }
        else {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)glnx.a).v_newBuilder();
            String s = this.b.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((glnx)hftv0).b |= 1;
            ((glnx)hftv0).c = s;
            int v = fjbs0.f;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((glnx)hftv1).b |= 2;
            ((glnx)hftv1).d = v;
            long v1 = fjbs0.t;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((glnx)hftv2).b |= 0x40;
            ((glnx)hftv2).i = v1;
            String s1 = fjbs0.u;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            glnx glnx0 = (glnx)hftp0.b_message;
            s1.getClass();
            glnx0.b |= 0x80;
            glnx0.j = s1;
            glnx1 = (glnx)hftp0.N_build();
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)glor.a).v_newBuilder();
        int v2 = this.d();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((glor)hftp2.b_message).c = v2 - 2;
        ((glor)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)glng.a).v_newBuilder();
        String s3 = this.c;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp3.b_message;
        s3.getClass();
        ((glng)hftv3).b |= 1;
        ((glng)hftv3).c = s3;
        int v3 = this.d;
        if(!hftv3.isImmutable()) {
            hftp3.ensureMutable();
        }
        glng glng0 = (glng)hftp3.b_message;
        glng0.b |= 2;
        glng0.d = v3;
        glng glng1 = (glng)hftp3.N_build();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        glor glor0 = (glor)hftp2.b_message;
        glng1.getClass();
        glor0.d = glng1;
        glor0.b |= 4;
        int v4 = this.h;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp2.b_message;
        ((glor)hftv4).b |= 16;
        ((glor)hftv4).f = v4;
        if(!hftv4.isImmutable()) {
            hftp2.ensureMutable();
        }
        glor glor1 = (glor)hftp2.b_message;
        glor1.e = glsl0.a();
        glor1.b |= 8;
        long v5 = SystemClock.elapsedRealtime() - this.f;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        glor glor2 = (glor)hftp2.b_message;
        glor2.b |= 0x20;
        glor2.g = (int)v5;
        glor glor3 = (glor)hftp2.N_build();
        this.e.e(glnx1, glor3);
    }

    protected abstract void c();

    protected abstract int d();

    @Override  // cjtm
    protected final void f(Context context0) {
        this.h = (int)(SystemClock.elapsedRealtime() - this.f);
        this.c();
    }
}

