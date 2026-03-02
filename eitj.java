import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eitj extends eiqt {
    private final eiqg a;
    private final eitk b;

    public eitj(eiqg eiqg0, String s, String s1) {
        super("UnregisterOperationCall", hlse.f);
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = new eitk(s, s1);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.b.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 1;
            hlrh0.c = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        eitk eitk0 = this.b;
        if(eitk0.a == null) {
            throw new eipa(29500, "No package name");
        }
        try(eiop eiop0 = eiox0.a().b()) {
            String s = eitk0.b;
            eitk0.a = eipn.c(eitk0.a, s);
            if(eiop0.f()) {
                eitk.b(eiox0, eiop0, eitk0.a);
            }
            else if(hxln.d()) {
                eirf.a.b(eiox0, eiop0, eitk0.a);
                eitk.a(eiop0, eitk0.a, s);
            }
            else if(eitk.a(eiop0, eitk0.a, s) > 0) {
                eirf.a.e();
            }
            eiop0.e();
        }
        this.a.m(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.m(status0);
    }
}

