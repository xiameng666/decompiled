import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;

public final class ducl implements DialogInterface.OnCancelListener {
    public final ducp a;

    public ducl(ducp ducp0) {
        this.a = ducp0;
    }

    @Override  // android.content.DialogInterface$OnCancelListener
    public final void onCancel(DialogInterface dialogInterface0) {
        this.a.B();
        this.a.ag.g(this.a.at, 5, 0, 10, 0, this.a.al);
        this.a.D(0, null);
    }
}

