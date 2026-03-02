import android.app.Activity;

final class rjm extends ibuo implements ibth {
    public rjm(Object object0) {
        super(0, object0, Activity.class, "isFinishing", "isFinishing()Z", 0);
    }

    @Override  // ibth
    public final Object a() {
        return Boolean.valueOf(((Activity)this.e).isFinishing());
    }
}

