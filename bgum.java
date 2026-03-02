import com.android.settingslib.widget.MainSwitchPreference;

public final class bgum implements Runnable {
    public final bgun a;
    public final boolean b;

    public bgum(bgun bgun0, boolean z) {
        this.a = bgun0;
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

