import android.app.Activity;

final class rjl extends ibuo implements ibth {
    public rjl(Object object0) {
        super(0, object0, Activity.class, "getComponentName", "getComponentName()Landroid/content/ComponentName;", 0);
    }

    @Override  // ibth
    public final Object a() {
        return ((Activity)this.e).getComponentName();
    }
}

