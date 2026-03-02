public final class azyc implements Runnable {
    public final azyf a;
    public final azye b;

    public azyc(azyf azyf0, azye azye0) {
        this.a = azyf0;
        this.b = azye0;
    }

    @Override
    public final void run() {
        azye azye0 = this.b;
        azyd_linstner azyd0 = this.a.listener_;
        if(azyd0 != null) {
            try {
                azye0.a(azyd0.a);
                return;
            }
            catch(RuntimeException runtimeException0) {
                azye0.b();
                throw runtimeException0;
            }
        }
        azye0.b();
    }
}

