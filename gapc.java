import android.content.Context;
import android.util.Base64;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class gapc implements gaqb {
    public final Context a;
    private final ibnn b;

    public gapc(Context context0) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
        this.b = new ibnz(new gapb(this));
    }

    @Override  // gaqb
    public final gaqa a(gamx gamx0, long v, String s) {
        byte[] arr_b;
        evql evql0;
        int v1 = 10;
        try {
            fzxi fzxi0 = (fzxi)this.b.a();
            fzxs fzxs0 = new fzxs(s, v);
            fzxo fzxo0 = fzxi0.a;
            if(fzxo0.d == null) {
                evql0 = evrg.c(new fzxq(-2));
            }
            else if(gacn.a(fzxo0.c) < 82380000) {
                evql0 = evrg.c(new fzxq(-14));
            }
            else {
                try {
                    arr_b = Base64.decode(fzxs0.a, 10);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    evql0 = evrg.c(new fzxq(-13, illegalArgumentException0));
                    goto label_20;
                }
                fzxo0.a.c("requestIntegrityToken(%s)", new Object[]{fzxs0});
                evqp evqp0 = new evqp();
                fzxn fzxn0 = new fzxn(fzxo0, evqp0, arr_b, fzxs0.b, evqp0, fzxs0);
                fzxo0.d.b(fzxn0, evqp0);
                evql0 = evqp0.a;
            }
        label_20:
            gaxl.a();
            String s1 = ((fzxt)gawm.a(evql0, Long.valueOf(gaxm.m()))).a;
            ibuq.e(s1, "token(...)");
            return new gapz(s1);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            fzxq fzxq0 = (throwable0 instanceof fzxq) ? ((fzxq)throwable0) : null;
            if(fzxq0 != null) {
                int v2 = fzxq0.a();
                if(v2 == -100) {
                    v1 = 18;
                }
                else {
                    switch(v2) {
                        case -17: {
                            return new gapy(18);
                        }
                        case -16: {
                            return new gapy(16);
                        }
                        case -15: {
                            return new gapy(15);
                        }
                        case -14: {
                            return new gapy(14);
                        }
                        case -13: {
                            return new gapy(13);
                        }
                        case -12: {
                            return new gapy(12);
                        }
                        case -11: {
                            return new gapy(11);
                        }
                        case -10: {
                            return new gapy(10);
                        }
                        case -9: {
                            break;
                        }
                        case -8: {
                            return new gapy(8);
                        }
                        case -7: {
                            return new gapy(7);
                        }
                        case -6: {
                            return new gapy(6);
                        }
                        case -5: {
                            return new gapy(5);
                        }
                        case -4: {
                            return new gapy(4);
                        }
                        case -3: {
                            return new gapy(3);
                        }
                        case -2: {
                            return new gapy(2);
                        }
                        case -1: {
                            return new gapy(1);
                        }
                        default: {
                            return new gapy(0);
                        }
                    }
                }
                return new gapy(v1 - 1);
            }
            return new gapy(20);
        }
        catch(TimeoutException unused_ex) {
            return new gapy(19);
        }
        catch(InterruptedException unused_ex) {
            return new gapy(17);
        }
    }
}

