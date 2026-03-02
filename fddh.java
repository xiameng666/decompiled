import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class fddh implements CompoundButton.OnCheckedChangeListener {
    public final fdco a;
    public final fdcn b;
    public final fdcx c;

    public fddh(fdco fdco0, fdcn fdcn0, fdcx fdcx0) {
        this.a = fdco0;
        this.b = fdcn0;
        this.c = fdcx0;
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        fdcn fdcn0 = this.b;
        this.a.f(fdcn0, z);
        fdcx fdcx0 = this.c;
        if(fdcx0 != null) {
            Context context0 = compoundButton0.getContext();
            fddd fddd0 = fdcx0.a;
            if(Log.isLoggable("wearable.Privacy", 3)) {
                Log.d("wearable.Privacy", "user changed optin: " + fdcn0.toString() + ":" + z + " => " + fddd0.b.b());
            }
            fdcn fdcn1 = fdcn.b;
            if(fdcn0 == fdcn1) {
                if(z) {
                    fdbf fdbf0 = fdbf.i(context0);
                    fdco fdco0 = fddd0.b;
                    if(!fdco0.g(fdcn1)) {
                        Log.w("wearable.Privacy", "[presenter] enableCloudSync: need to opt in first");
                        fdco0.f(fdcn1, true);
                        fddd0.a(context0).g(new fdcy(fdbf0));
                        return;
                    }
                    fdbf0.d(true);
                    return;
                }
                if(!hzuz.s()) {
                    while((context0 instanceof ContextWrapper) && !(context0 instanceof xni)) {
                        context0 = ((ContextWrapper)context0).getBaseContext();
                    }
                    new fdag().show(((xni)context0).getSupportFragmentManager(), "cloudsync-off-dialog");
                    return;
                }
                ffnc.c("wearable.Privacy", "Disable cloud sync", fddd0.c(context0, 1));
                return;
            }
            fddd0.b.f(fdcn0, z);
            fddd0.a(context0);
        }
    }
}

