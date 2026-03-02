import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;

public final class eisv extends eiqt {
    private final eiqg a;
    private final byte[] b;
    private final hlrs c;

    public eisv(eiqg eiqg0, byte[] arr_b) {
        super("SetDogfoodsTokenOperationCall", hlse.m);
        this.c = (hlrs)((ProtoLiteMessage)hlrv.a).v_newBuilder();
        batl.s(eiqg0);
        this.a = eiqg0;
        this.b = arr_b;
    }

    @Override  // eiqt
    public final hlrh b() {
        return null;
    }

    @Override  // eiqt
    public final hlrv c() {
        return (hlrv)((ProtoLiteBuilder)this.c).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        try(eiop eiop0 = eiox0.a().b()) {
            if(eiop0.f()) {
                eiop0.c("INSERT OR REPLACE INTO dogfood_token (token_key, token) VALUES (0, ?1);").g(new Object[]{this.b}).d();
            }
            else {
                eiop0.c("INSERT OR REPLACE INTO DogfoodsToken (\"key\", token) VALUES (0, ?)").g(new Object[]{this.b}).d();
            }
            eiop0.e();
        }
        try {
            HeterodyneSyncTaskChimeraService heterodyneSyncTaskChimeraService0 = new HeterodyneSyncTaskChimeraService();
            heterodyneSyncTaskChimeraService0.f(context0);
            heterodyneSyncTaskChimeraService0.d(gnzv.k, null, this.c, "Mobdog");
        }
        catch(Exception exception0) {
            throw new eipa(0x7340, "Sync failed", exception0);
        }
        switch(hlru.b(((hlrv)this.c.b_message).h)) {
            case 0: 
            case 1: {
                this.a.c(Status.b);
                return;
            }
            default: {
                throw new eipa(0x7340, "Sync failed");
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.c(status0);
    }
}

