import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fdmz {
    public final boolean a;
    final ScheduledExecutorService b;
    volatile boolean c;
    private ScheduledFuture d;
    private faik e;

    public fdmz(Context context0, boolean z) {
        this.b = new bbll(1, 10);
        this.a = z;
        if(z && hzzi.n()) {
            this.e = new azts(context0, new faig());
        }
    }

    // Detected as a lambda impl.
    public final void a() {
        if(hzzi.n()) {
            faik faik0 = this.e;
            if(faik0 != null) {
                fdmv fdmv0 = () -> try {
                    this.c = ((azui)evrg.o(faik0.cp(), hzzi.f(), TimeUnit.MILLISECONDS)).q();
                }
                catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                    this.g();
                }
                catch(RuntimeException runtimeException0) {
                    Log.e("WearableLogger", "Unexpected exception from getOptInOptions: ", runtimeException0);
                    throw runtimeException0;
                };
                ((bbll)this.b).d(fdmv0);
            }
        }
    }

    // Detected as a lambda impl.
    public final void b() {
        if(this.a && hzzi.n()) {
            faik faik0 = this.e;
            if(faik0 != null) {
                fdmy fdmy0 = () -> try {
                    evrg.o(faik0.ct(() -> if(hzzi.n()) {
                        faik faik0 = this.e;
                        if(faik0 != null) {
                            fdmv fdmv0 = () -> try {
                                this.c = ((azui)evrg.o(evql0, hzzi.f(), TimeUnit.MILLISECONDS)).q();
                            }
                            catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                                this.g();
                            }
                            catch(RuntimeException runtimeException0) {
                                Log.e("WearableLogger", "Unexpected exception from getOptInOptions: ", runtimeException0);
                                throw runtimeException0;
                            };
                            ((bbll)this.b).d(fdmv0);
                        }
                    }), hzzi.f(), TimeUnit.MILLISECONDS);
                    Log.d("WearableLogger", "Listening to usage opt-in changes");
                }
                catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                    this.g();
                }
                catch(RuntimeException runtimeException0) {
                    Log.e("WearableLogger", "Unexpected exception from initialize: ", runtimeException0);
                    throw runtimeException0;
                };
                ((bbll)this.b).d(fdmy0);
            }
            this.a();
        }
    }

    public final boolean e() {
        return hzzi.n() && this.c;
    }

    public final boolean f() {
        return this.a && this.e();
    }

    private final void g() {
        if(!hzzi.n()) {
            return;
        }
        synchronized(this) {
            ScheduledFuture scheduledFuture0 = this.d;
            if(scheduledFuture0 != null) {
                scheduledFuture0.cancel(false);
            }
            fdmw fdmw0 = () -> if(this.a && hzzi.n()) {
                faik faik0 = this.e;
                if(faik0 != null) {
                    fdmy fdmy0 = () -> try {
                        evrg.o(faik0.ct(() -> if(hzzi.n()) {
                            faik faik0 = this.e;
                            if(faik0 != null) {
                                fdmv fdmv0 = () -> try {
                                    this.c = ((azui)evrg.o(evql0, hzzi.f(), TimeUnit.MILLISECONDS)).q();
                                }
                                catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                                    this.g();
                                }
                                catch(RuntimeException runtimeException0) {
                                    Log.e("WearableLogger", "Unexpected exception from getOptInOptions: ", runtimeException0);
                                    throw runtimeException0;
                                };
                                ((bbll)this.b).d(fdmv0);
                            }
                        }), hzzi.f(), TimeUnit.MILLISECONDS);
                        Log.d("WearableLogger", "Listening to usage opt-in changes");
                    }
                    catch(ExecutionException | InterruptedException | TimeoutException unused_ex) {
                        this.g();
                    }
                    catch(RuntimeException runtimeException0) {
                        Log.e("WearableLogger", "Unexpected exception from initialize: ", runtimeException0);
                        throw runtimeException0;
                    };
                    ((bbll)this.b).d(fdmy0);
                }
                this.a();
            };
            long v1 = hzzi.a.i().J();
            this.d = ((bbll)this.b).g(fdmw0, v1, TimeUnit.MILLISECONDS);
        }
    }
}

