import com.google.android.gms.wearable.internal.NodeMigratedEventParcelable;

public final class fczb implements Runnable {
    public final NodeMigratedEventParcelable a;

    public fczb(NodeMigratedEventParcelable nodeMigratedEventParcelable0) {
        this.a = nodeMigratedEventParcelable0;
    }

    @Override
    public final void run() {
        new fcew(this.a.b).iz();
    }
}

