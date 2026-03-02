@Deprecated
public final class jyv {
    public boolean a;
    public boolean b;
    public oze c;

    public final void a() {
        __monitor_enter(this);
        if(this.a) {
            __monitor_exit(this);
            return;
        }
        this.a = true;
        this.b = true;
        oze oze0 = this.c;
        __monitor_exit(this);
        if(oze0 != null) {
            try {
                oze0.a();
            }
            catch(Throwable throwable0) {
                synchronized(this) {
                    this.b = false;
                    this.notifyAll();
                }
                __monitor_exit(this);
                throw throwable0;
            }
        }
        synchronized(this) {
            this.b = false;
            this.notifyAll();
        }
        __monitor_exit(this);
    }
}

