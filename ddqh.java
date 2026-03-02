import com.google.android.gms.nearby.sharing.internal.UnregisterStateObserverParams;

public final class ddqh implements azys {
    public final ddph a;

    public ddqh(ddph ddph0) {
        this.a = ddph0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ddot ddot0 = (ddot)((ddub)object0).H();
        UnregisterStateObserverParams unregisterStateObserverParams0 = new UnregisterStateObserverParams();
        unregisterStateObserverParams0.a = this.a;
        unregisterStateObserverParams0.b = new ddru(((evqp)object1));
        ddot0.ah(unregisterStateObserverParams0);
        this.a.c();
    }
}

