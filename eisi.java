import android.content.Context;
import com.google.android.gms.common.api.Status;

public final class eisi extends eiqt {
    public static final int a;
    private final eiqg b;
    private final String c;
    private final boolean d;
    private final eisj e;

    public eisi(eiqg eiqg0, String s, int v, String[] arr_s, int[] arr_v, byte[] arr_b, boolean z, String s1) {
        super("RegisterOperationCall", (z ? hlse.c : hlse.b));
        batl.s(eiqg0);
        this.b = eiqg0;
        this.c = s;
        this.d = z;
        this.e = new eisj(s, v, arr_s, arr_v, arr_b, z, s1);
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        eisj eisj0 = this.e;
        gocn gocn0 = eisj0.a;
        String s = gocn0.g;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh0 = (hlrh)hlrg0.b_message;
        s.getClass();
        hlrh0.b |= 1;
        hlrh0.c = s;
        int v = gocn0.c == 2 ? ((int)(((Integer)gocn0.d))) : 0;
        if(!hlrg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hlrg0).ensureMutable();
        }
        hlrh hlrh1 = (hlrh)hlrg0.b_message;
        hlrh1.b |= 2;
        hlrh1.d = v;
        hlrg0.a(gocn0.i);
        hlrg0.k(gocn0.j);
        eisn eisn0 = eisj0.b;
        if(eisn0 != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh2 = (hlrh)hlrg0.b_message;
            hlrh2.b |= 0x100;
            hlrh2.j = eisn0.b.x;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        this.e.b = eisq.b(context0, eiox0, this.e.a, null);
        gnzv gnzv0 = this.e.b.b;
        String s = this.c;
        if(eish.a(s, gnzv0)) {
            eitp.b(context0, gnzv0, s);
        }
        this.m(Status.b);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.m(status0);
    }

    private final void m(Status status0) {
        eiqg eiqg0 = this.b;
        if(this.d) {
            eiqg0.n(status0);
            return;
        }
        eiqg0.j(status0);
    }
}

