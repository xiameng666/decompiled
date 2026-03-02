import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class garb implements gaqb {
    public final Context a;
    private final boolean b;
    private final boolean c;
    private boolean d;
    private final ibnn e;

    public garb(Context context0) {
        ibuq.f(context0, "appContext");
        super();
        this.a = context0;
        gaxl.a();
        this.b = hzlv.a.b().v();
        gaxl.a();
        this.c = hzlv.a.b().B();
        this.e = new ibnz(new gaqx(this));
    }

    @Override  // gaqb
    public final gaqa a(gamx gamx0, long v, String s) {
        ExecutionException executionException1;
        while(true) {
            try {
                gara gara0 = this.b(gamx0, v);
                if((gara0 instanceof gaqz)) {
                    fzyb fzyb0 = fzyc.a();
                    fzyb0.a = s;
                    fzyc fzyc0 = fzyb0.a();
                    evql evql0 = ((gaqz)gara0).a.a(fzyc0);
                    gaxl.a();
                    String s1 = ((fzya)gawm.a(evql0, Long.valueOf(gaxm.m()))).a;
                    ibuq.e(s1, "token(...)");
                    return new gapz(s1);
                }
                if((gara0 instanceof gaqy)) {
                    return new gapy(((gaqy)gara0).a);
                }
                throw new ibnq();
            }
            catch(ExecutionException executionException0) {
            }
            catch(TimeoutException timeoutException0) {
                goto label_27;
            }
            catch(InterruptedException unused_ex) {
                return new gapy(17);
            }
            executionException1 = executionException0;
            if(!this.b) {
                break;
            }
            if(!garb.c(executionException1) || this.d) {
                break;
            }
            gaqv.a().a(v);
            this.d = true;
        }
        if(!this.c) {
            Throwable throwable0 = executionException1.getCause();
            fzxw fzxw0 = (throwable0 instanceof fzxw) ? ((fzxw)throwable0) : null;
            return fzxw0 == null ? new gapy(20) : new gapy(gawh.a(fzxw0.a()));
        }
        gavr.e("BE_PIA_03", gamx0.b, null, "ExecutionException in Get Token StandardPlayIntegrityAction", executionException1, 4);
        throw new ibnm();
    label_27:
        if(!this.c) {
            return new gapy(19);
        }
        gavr.e("BE_PIA_04", gamx0.b, null, "TimeoutException in Get Token StandardPlayIntegrityAction", timeoutException0, 4);
        throw new ibnm();
    }

    private final gara b(gamx gamx0, long v) {
        evql evql0;
        ExecutionException executionException1;
        while(true) {
            try {
                gaqw gaqw0 = gaqv.a();
                fzye fzye0 = (fzye)this.e.a();
                ibuq.f(fzye0, "standardIntegrityManager");
                synchronized(gaqw0) {
                    Map map0 = gaqw0.b;
                    Long long0 = v;
                    evql0 = (evql)map0.get(long0);
                    if(evql0 != null && (!evql0.m() || evql0.n())) {
                        gaxl.a();
                        if(hzji.a.d().j()) {
                            goto label_11;
                        }
                    }
                    else {
                    label_11:
                        fzxy fzxy0 = fzxz.a();
                        fzxy0.b(v);
                        evql0 = fzye0.a(fzxy0.a());
                        map0.put(long0, evql0);
                    }
                }
                gaxl.a();
                return new gaqz(((fzys)gawm.a(evql0, Long.valueOf(gaxm.m()))));
            }
            catch(ExecutionException executionException0) {
            }
            catch(TimeoutException timeoutException0) {
                goto label_34;
            }
            catch(InterruptedException unused_ex) {
                return new gaqy(17);
            }
            executionException1 = executionException0;
            if(!this.b) {
                break;
            }
            if(!garb.c(executionException1) || this.d) {
                break;
            }
            gaqv.a().a(v);
            this.d = true;
        }
        if(!this.c) {
            Throwable throwable0 = executionException1.getCause();
            fzxw fzxw0 = (throwable0 instanceof fzxw) ? ((fzxw)throwable0) : null;
            return fzxw0 == null ? new gaqy(21) : new gaqy(gawh.a(fzxw0.a()));
        }
        gavr.e("BE_PIA_05", gamx0.b, null, "ExecutionException in Warm up StandardPlayIntegrityAction", executionException1, 4);
        throw new ibnm();
    label_34:
        if(!this.c) {
            return new gaqy(23);
        }
        gavr.e("BE_PIA_06", gamx0.b, null, "TimeoutException in Warm up StandardPlayIntegrityAction", timeoutException0, 4);
        throw new ibnm();
    }

    private static final boolean c(ExecutionException executionException0) {
        Throwable throwable0 = executionException0.getCause();
        fzxw fzxw0 = (throwable0 instanceof fzxw) ? ((fzxw)throwable0) : null;
        return fzxw0 != null && fzxw0.a() == -19;
    }
}

