import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eirw extends eiqt {
    private final eiqg a;
    private final eirx b;

    public eirw(eiqg eiqg0, String s) {
        super("GetServingVersionOperationCall", hlse.A, ((boolean)(s.equals("com.google.android.gms") ^ 1)));
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eirx(s);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        eirx eirx0 = this.b;
        String s = eirx0.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        long v = eirx0.b;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh1 = (hlrh)hlrg0.b_message;
        hlrh1.b |= 0x80;
        hlrh1.i = v;
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        long v = eiow.a(eiox0);
        this.b.b = v;
        Long.valueOf(v).getClass();
        this.a.h(Status.b, v);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.h(status0, -1L);
    }
}

