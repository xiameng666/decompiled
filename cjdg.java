public final class cjdg implements Runnable {
    public final cjdm a;
    public final cjdh b;
    public final ibuz c;

    public cjdg(cjdm cjdm0, cjdh cjdh0, ibuz ibuz0) {
        this.a = cjdm0;
        this.b = cjdh0;
        this.c = ibuz0;
    }

    @Override
    public final void run() {
        cjdm cjdm0 = this.a;
        __monitor_enter(cjdm0);
        Object object0 = cjdm0.a;
        cjdh cjdh0 = this.b;
        __monitor_exit(cjdm0);
        Exception exception0 = null;
        boolean z = false;
        if(object0 != null) {
            try {
                cjdh0.b(object0);
                z = true;
            }
            catch(Exception exception0) {
                if((exception0 instanceof RuntimeException)) {
                    throw exception0;
                }
            }
        }
        cjdh0.a(z);
        this.c.a = true;
        if(exception0 != null) {
            cjdm0.d(exception0);
        }
    }
}

