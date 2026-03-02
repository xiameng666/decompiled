import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.DogfoodsToken;
import jeb.synthetic.TWR;

public final class eirp extends eiqt {
    private final eiqg a;

    public eirp(eiqg eiqg0) {
        super("GetDogfoodsTokenOperationCall", hlse.l);
        batl.s(eiqg0);
        this.a = eiqg0;
    }

    @Override  // eiqt
    public final hlrh b() {
        return null;
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        byte[] arr_b = null;
        eiog eiog0 = eiox0.a().a();
        try {
            if(eiog0.f()) {
                eiok eiok0 = ((eioh)eiog0).g("SELECT token FROM dogfood_token WHERE token_key = 0;").i();
                if(eiok0 != null) {
                    try {
                        arr_b = eiok0.j(0);
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(eiok0, throwable1);
                        throw throwable1;
                    }
                }
                if(eiok0 != null) {
                    eiok0.close();
                }
            }
            else {
                eiok eiok1 = ((eioh)eiog0).g("SELECT token FROM DogfoodsToken").d().i();
                if(eiok1 != null) {
                    try {
                        arr_b = eiok1.j(0);
                    }
                    catch(Throwable throwable2) {
                        TWR.safeClose$NT(eiok1, throwable2);
                        throw throwable2;
                    }
                }
                if(eiok1 != null) {
                    eiok1.close();
                }
            }
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(eiog0, throwable0);
            throw throwable0;
        }
        eiog0.close();
        DogfoodsToken dogfoodsToken0 = new DogfoodsToken(arr_b);
        this.a.b(Status.b, dogfoodsToken0);
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.b(status0, null);
    }
}

