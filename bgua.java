import com.android.settingslib.widget.MainSwitchPreference;

public final class bgua implements Runnable {
    public final bgub a;
    public final boolean b;

    public bgua(bgub bgub0, boolean z) {
        this.a = bgub0;
        this.b = z;
    }

    @Override
    public final void run() {
        MainSwitchPreference mainSwitchPreference0 = this.a.b.ah;
        if(mainSwitchPreference0 != null) {
            mainSwitchPreference0.k(((boolean)(this.b ^ 1)));
        }
    }
}

