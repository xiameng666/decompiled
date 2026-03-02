import com.google.android.gms.multidevice.XdFeatureStatusUpdate;

public final class ctcp implements azye {
    final XdFeatureStatusUpdate a;
    final String b;

    public ctcp(XdFeatureStatusUpdate xdFeatureStatusUpdate0) {
        this.a = xdFeatureStatusUpdate0;
        this.b = "XdFeatureStatusListener";
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        csrl csrl0 = (csrl)object0;
        ibuq.f(csrl0, "listener");
        csrl0.a(this.a);
    }

    @Override  // azye
    public final void b() {
        ((ggtj)ctcq.a.j()).B("onNotifyListenerFailed() for listenerType: %s", this.b);
    }
}

