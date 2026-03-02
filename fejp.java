import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import j..util.Objects;

public final class fejp implements Runnable {
    public final fejs a;
    public final ffnd b;

    public fejp(fejs fejs0, ffnd ffnd0) {
        this.a = fejs0;
        this.b = ffnd0;
    }

    @Override
    public final void run() {
        long v = System.currentTimeMillis();
        String s = String.valueOf(this.a.b.j);
        if(iaae.a.b().a()) {
            Intent intent0 = new Intent().setAction("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").setComponent(ffnd.a).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_DEEPLINK_SILENT", false).putExtra("EXTRA_ISSUE_TITLE", "Bluetooth client socket stalled").putExtra("EXTRA_COMPONENT_ID", 0xED25AL).putExtra("EXTRA_REQUIRE_BUGREPORT", true).putExtra("EXTRA_HAPPENED_TIME", v).putExtra("EXTRA_ACTUALLY_HAPPENED", "The BluetoothClientThread is \'stuck\' waiting on connect()");
            if(!bbqr.d(("WearableBtClientThread for " + s))) {
                intent0.putExtra("EXTRA_ADDITIONAL_COMMENT", "WearableBtClientThread for " + s);
            }
            ffnd ffnd0 = this.b;
            Context context0 = ffnd0.b;
            if(!context0.getPackageManager().queryIntentActivities(intent0, 0).isEmpty()) {
                PendingIntent pendingIntent0 = (PendingIntent)Objects.requireNonNull(fqaw.a(context0, 0, intent0, 0x4000000));
                ffnd0.c.c(pendingIntent0, "Wear OS bug detected", "Tap to create a bug report for the Wear Connectivity team", "BugReportUtil", false, Boolean.valueOf(true));
                return;
            }
            Log.w("BugReportUtil", "triggerBugReportNotification: BetterBug is not installed. Ignoring BR request.");
            return;
        }
        Log.w("BugReportUtil", "requestBugReport: The flag has not been enabled. Ignoring BR request.");
    }
}

