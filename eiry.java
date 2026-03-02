import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eiry extends eiqt {
    private final eiqd a;
    private final eirz b;

    public eiry(eiqd eiqd0, String s) {
        super("GetStorageInfoGmsOperation", hlse.B);
        this.a = eiqd0;
        this.b = new eirz(s);
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
            hlrh0.b |= 4;
            hlrh0.e = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        byte[] arr_b;
        try(eiop eiop0 = eiox0.a().b()) {
            arr_b = eitg.b(context0, eiop0, this.b.a);
            eiop0.e();
        }
        this.a.a(Status.b, arr_b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, new byte[0]);
    }
}

