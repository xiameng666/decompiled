import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;

public final class furg extends BroadcastReceiver {
    public static final String a;
    public final furs b;
    public final int c;

    static {
        furg.a = "furg";
    }

    public furg(furs furs0) {
        this.b = furs0;
        this.c = 999;
    }

    public static final void a(BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        broadcastReceiver$PendingResult0.abortBroadcast();
        broadcastReceiver$PendingResult0.finish();
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        View view1;
        View view0;
        ibuq.f(context0, "context");
        ibuq.f(intent0, "intent");
        try {
            fush fush0 = fusi.a();
            if(fush0.a == null) {
                view0 = null;
                view1 = null;
            }
            else {
                synchronized(fush0.b) {
                    view0 = null;
                    view1 = null;
                    for(Object object1: fush0.a) {
                        View view2 = (View)object1;
                        if(view2.getWindowVisibility() != 0) {
                            view1 = view2;
                            continue;
                        }
                        else if(!view2.hasWindowFocus()) {
                            view0 = view2;
                            continue;
                        }
                        else {
                            view0 = view2;
                        }
                        break;
                    }
                    if(view0 != null && !view0.hasWindowFocus()) {
                        Log.w("fusi", "Could not find a focused window, using top-most visible window instead.");
                    }
                    if(view0 == null && view1 != null) {
                        Log.w("fusi", "Could not find a visible window, using top-most non-visible window instead.");
                    }
                }
            }
            if(view0 == null && view1 == null) {
                throw new fusa("Window manager does not contain any windows for process: " + Process.myPid() + ". This means that there is no Activity in the process and that the process is likely just running a Service or BroadcastReceiver");
            }
        }
        catch(fusa unused_ex) {
            Log.e(furg.a, "Failed to snapshot hierarchy. Could not find any window to capture.");
            return;
        }
        View view3 = view0 == null ? view1 : view0;
        String s = intent0.getAction();
        if(s != null) {
            switch(s) {
                case "com.google.android.libraries.snapshot.action.CAPTURE_SNAPSHOT": {
                    Bundle bundle0 = intent0.getExtras();
                    String s3 = bundle0 == null ? null : bundle0.getString("snapshotter_id");
                    if(bundle0 != null) {
                        bundle0.getString("hsv_client_uix_version");
                    }
                    break;
                }
                case "com.google.android.libraries.snapshot.action.GET_SNAPSHOTTER_INFO": {
                    try {
                        Display display0 = view3.getDisplay();
                        if(display0 == null) {
                            return;
                        }
                        int v1 = display0.getDisplayId();
                        String s1 = TextUtils.join(",", new Object[]{furh.a(context0, v1), "com.google.android.gms", context0.getClass().getSimpleName(), v1, Process.myPid()});
                        String s2 = this.getResultData();
                        this.setResultData((s2 == null ? "" : s2 + "\n") + s1);
                        this.setResultCode(-1);
                    }
                    catch(RuntimeException runtimeException0) {
                        Log.e(furg.a, "Failed to get snapshotter info", runtimeException0);
                    }
                    return;
                }
                case "com.google.android.libraries.snapshot.action.RESET_COUNTERS": {
                    for(Object object2: this.b.c) {
                        furt furt0 = (furt)object2;
                    }
                    return;
                }
                default: {
                    goto label_68;
                }
            }
            if(s3 != null) {
                Display display1 = view3.getDisplay();
                if(display1 == null || !ibuq.m(furh.a(context0, display1.getDisplayId()), s3)) {
                    try {
                    }
                    catch(RuntimeException runtimeException0) {
                        Log.e(furg.a, "Failed to get snapshotter info", runtimeException0);
                    }
                    return;
                }
            }
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
            icbb.b(iccl.b(furs.a), null, null, new furf(this, view3, broadcastReceiver$PendingResult0, System.nanoTime(), null), 3);
            return;
        }
    label_68:
        String s4 = "Receiver does not know how to handle action: " + intent0.getAction();
        Log.e(furg.a, s4);
    }
}

