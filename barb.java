import android.content.ActivityNotFoundException;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

public abstract class barb implements DialogInterface.OnClickListener {
    protected abstract void a();

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        try {
            this.a();
        }
        catch(ActivityNotFoundException unused_ex) {
            String s = "Failed to start resolution intent.";
            if(Build.FINGERPRINT.contains("generic")) {
                s = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", s, activityNotFoundException0);
        }
        finally {
            dialogInterface0.dismiss();
        }
    }
}

