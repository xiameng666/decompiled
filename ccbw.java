import j..util.Objects;
import java.nio.ByteBuffer;
import java.util.Map.Entry;

public final class ccbw extends clck {
    final ccdr a;

    public ccbw(ccdr ccdr0) {
        Objects.requireNonNull(ccdr0);
        this.a = ccdr0;
        super();
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        this.a.e();
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        this.a.c("unexpected network error", clbw0);
    }

    @Override  // clck
    public final void e(clcn clcn0, clcq clcq0) {
        synchronized(this.a) {
            this.a.c = clcq0;
        }
        try {
            ccdr ccdr0 = this.a;
            ccdr0.a();
            int v = clcq0.a();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gogx.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gogx)hftp0.b_message).b = v;
            ggqj ggqj0 = clcq0.d().v().om();
            while(ggqj0.hasNext()) {
                Object object0 = ggqj0.next();
                Map.Entry map$Entry0 = (Map.Entry)object0;
                gged_interceptors gged0 = (gged_interceptors)map$Entry0.getValue();
                int v1 = gged0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    String s = (String)gged0.get(v2);
                    if(!gfqz.e("Content-Encoding", ((CharSequence)map$Entry0.getKey())) && !gfqz.e("Content-Length", ((CharSequence)map$Entry0.getKey()))) {
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gogu.a).v_newBuilder();
                        String s1 = (String)map$Entry0.getKey();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        s1.getClass();
                        ((gogu)hftv0).b = s1;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        gogu gogu0 = (gogu)hftp1.b_message;
                        s.getClass();
                        gogu0.c = s;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gogx gogx0 = (gogx)hftp0.b_message;
                        gogu gogu1 = (gogu)hftp1.N_build();
                        gogu1.getClass();
                        hfuo hfuo0 = gogx0.c;
                        if(!hfuo0.c()) {
                            gogx0.c = ProtoLiteMessage.E(hfuo0);
                        }
                        gogx0.c.add(gogu1);
                    }
                }
            }
            ccdr0.f(((gogx)hftp0.N_build()).toBytesArray());
        }
        catch(ccbv unused_ex) {
            clcn0.b();
            return;
        }
        clcn0.d(ByteBuffer.allocateDirect(this.a.b));
    }

    @Override  // clck
    public final void gg(clcn clcn0, clcq clcq0, ByteBuffer byteBuffer0) {
        try {
            this.a.a();
            byte[] arr_b = byteBuffer0.array();
            int v = byteBuffer0.arrayOffset();
            this.a.d(arr_b, v, byteBuffer0.position());
        }
        catch(ccbv unused_ex) {
            clcn0.b();
            return;
        }
        byteBuffer0.clear();
        clcn0.d(byteBuffer0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        clcn0.c();
    }
}

