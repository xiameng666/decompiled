import androidx.preference.Preference;

public final class cqog implements ohj {
    public final Runnable a;

    public cqog(Runnable runnable0) {
        this.a = runnable0;
    }

    @Override  // ohj
    public final boolean c(Preference preference0) {
        this.a.run();
        return true;
    }
}

