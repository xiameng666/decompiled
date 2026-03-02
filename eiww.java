import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.play.integrity.api.DisplayListenerData;
import j..time.Duration;

public final class eiww extends cjtm {
    private final eiwr a;
    private final gfug b;
    private final eiwu c;

    public eiww(eiwr eiwr0, gfug gfug0, eiwu eiwu0, azug azug0) {
        super(370, "GetDisplayListenerData", azug0);
        this.a = eiwr0;
        this.b = gfug0;
        this.c = eiwu0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        DisplayListenerData displayListenerData0 = this.a.a();
        Duration duration0 = this.b.d();
        chmq chmq0 = chmq.v();
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gljs.a).v_newBuilder();
        gljr gljr0 = gljr.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gljs)hftp0.b_message).c = gljr0.c;
        ((gljs)hftp0.b_message).b |= 1;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gljp.a).v_newBuilder();
        int v = displayListenerData0.a.length;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gljp gljp0 = (gljp)hftp1.b_message;
        gljp0.b |= 1;
        gljp0.c = v;
        int v1 = (int)duration0.toMillis();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gljp gljp1 = (gljp)hftp1.b_message;
        gljp1.b |= 4;
        gljp1.e = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gljs gljs0 = (gljs)hftp0.b_message;
        gljp gljp2 = (gljp)hftp1.N_build();
        gljp2.getClass();
        gljs0.e = gljp2;
        gljs0.b |= 4;
        gljs gljs1 = (gljs)hftp0.N_build();
        glil glil0 = (glil)((ProtoLiteMessage)glim.a).v_newBuilder();
        glil0.r(gljs1);
        chmq0.j(((ProtoLiteMessage)(((glim)((ProtoLiteBuilder)glil0).N_build()))));
        ApiMetadata apiMetadata0 = cckf.d(bbdp.em);
        this.c.a(Status.b, displayListenerData0, apiMetadata0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        DisplayListenerData displayListenerData0 = new DisplayListenerData();
        this.c.a(status0, displayListenerData0, ApiMetadata.b);
    }
}

