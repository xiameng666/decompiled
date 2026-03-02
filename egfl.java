import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.format.Time;
import android.util.Log;
import java.io.PrintWriter;
import java.util.Locale;

public final class egfl {
    public static void a(Context context0, PrintWriter printWriter0, String[] arr_s) {
        if(context0 == null) {
            try {
                printWriter0.write("Can\'t obtain Context.");
                return;
                try {
                label_3:
                    printWriter0.write(String.format("CP2 sync enabled=%s\n\n", Boolean.valueOf(efur.i(context0).a.getBoolean("cp2_sync_enabled", false))));
                    printWriter0.write("FSA2 sync enabled=true\n\n");
                    printWriter0.write("GAL2 enabled=true\n\n");
                    printWriter0.write("\n");
                }
                catch(Exception exception0) {
                    printWriter0.write("Error while dumping log: " + exception0.toString() + "\n" + Log.getStackTraceString(exception0) + "\n");
                }
                printWriter0.write("People log:\n");
                egfr egfr0 = egfr.b(context0);
                int v = 1000;
                if(arr_s != null && arr_s.length > 0) {
                    try {
                        v = Math.max(10, Integer.parseInt(arr_s[0]));
                    }
                    catch(RuntimeException unused_ex) {
                    }
                }
                Time time0 = new Time();
                SQLiteDatabase sQLiteDatabase0 = egfr0.b.getReadableDatabase();
                if(sQLiteDatabase0 != null) {
                    Cursor cursor0 = sQLiteDatabase0.rawQuery("SELECT timestamp,process_id,thread_id,log_tag,account_name,page_id,message FROM logs ORDER BY timestamp DESC LIMIT " + v, null);
                    try {
                        cursor0.moveToPosition(cursor0.getCount());
                        while(cursor0.moveToPrevious()) {
                            time0.set(cursor0.getLong(0));
                            Locale locale0 = Locale.getDefault();
                            String s = time0.format("%Y-%m-%d %H:%M:%S");
                            Integer integer0 = cursor0.getInt(1);
                            Integer integer1 = cursor0.getInt(2);
                            String s1 = cursor0.getString(3);
                            String s2 = cursor0.getString(4);
                            String s3 = cursor0.getString(5);
                            String s4 = cursor0.getString(6);
                            printWriter0.write(String.format(locale0, "%s,%d,%d,%s,%s,%s,%s\n", s, integer0, integer1, s1, s2, s3, (s4 == null ? "" : "\"" + s4.replace("\"", "\"\"") + "\"")));
                        }
                    }
                    finally {
                        cursor0.close();
                    }
                    return;
                }
                return;
            }
            catch(RuntimeException runtimeException0) {
                goto label_39;
            }
        }
        goto label_3;
    label_39:
        printWriter0.write("Can\'t dump log.  " + runtimeException0.toString());
    }
}

