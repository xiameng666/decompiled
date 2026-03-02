import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

final class azyh implements evpz {
    private final azxm a;
    private final int b;
    private final azux c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;

    public azyh(azxm azxm0, int v, azux azux0, long v1, long v2, String s, String s1) {
        this.a = azxm0;
        this.b = v;
        this.c = azux0;
        this.d = v1;
        this.e = v2;
        this.f = s;
        this.g = s1;
    }

    public static ConnectionTelemetryConfiguration b(azxi azxi0, baqp baqp0, int v) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = baqp0.H == null ? null : baqp0.H.d;
        if(connectionTelemetryConfiguration0 != null && connectionTelemetryConfiguration0.b) {
            int[] arr_v = connectionTelemetryConfiguration0.d;
            if(arr_v == null) {
                if(connectionTelemetryConfiguration0.f == null || !bbmt.d(connectionTelemetryConfiguration0.f, v)) {
                    return azxi0.j >= connectionTelemetryConfiguration0.e ? null : connectionTelemetryConfiguration0;
                }
                return null;
            }
            if(bbmt.d(arr_v, v)) {
                return azxi0.j >= connectionTelemetryConfiguration0.e ? null : connectionTelemetryConfiguration0;
            }
        }
        return null;
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        int v8;
        int v7;
        int v6;
        int v14;
        String s3;
        String s2;
        long v12;
        long v11;
        int v10;
        azxm azxm0 = this.a;
        if(azxm0.l()) {
            RootTelemetryConfiguration rootTelemetryConfiguration0 = batr.a().a;
            if(rootTelemetryConfiguration0 == null || rootTelemetryConfiguration0.b) {
                azxi azxi0 = azxm0.c(this.c);
                if(azxi0 != null) {
                    azsz azsz0 = azxi0.b;
                    if((azsz0 instanceof baqp)) {
                        long v = this.d;
                        int v1 = Long.compare(v, 0L);
                        int v2 = 1;
                        int v3 = 0;
                        int v4 = v1 <= 0 ? 0 : 1;
                        int v5 = ((baqp)azsz0).C;
                        if(rootTelemetryConfiguration0 == null) {
                            v6 = 5000;
                            v8 = 0;
                            v7 = 100;
                        label_30:
                            int v9 = -1;
                            if(evql0.n()) {
                                v10 = 0;
                            }
                            else if(((evqu)evql0).d) {
                                v10 = -1;
                                v3 = 100;
                            }
                            else {
                                Exception exception0 = evql0.i();
                                if((exception0 instanceof aztb)) {
                                    v3 = ((aztb)exception0).a.i;
                                    ConnectionResult connectionResult0 = ((aztb)exception0).a.l;
                                    v10 = connectionResult0 == null ? -1 : connectionResult0.c;
                                }
                                else {
                                    v3 = 101;
                                    v10 = -1;
                                }
                            }
                            if(v4 == 0) {
                                v11 = 0L;
                                v12 = 0L;
                            }
                            else {
                                v9 = (int)(SystemClock.elapsedRealtime() - this.e);
                                v11 = v;
                                v12 = System.currentTimeMillis();
                            }
                            int v13 = this.b;
                            String s = this.f;
                            String s1 = this.g;
                            if(s1 == null) {
                                s3 = s;
                                s2 = null;
                                v14 = v3;
                            }
                            else {
                                switch(v3) {
                                    case 0: {
                                        s3 = s;
                                        s2 = null;
                                        v14 = 0;
                                        break;
                                    }
                                    case 7: {
                                        s3 = s;
                                        s2 = null;
                                        v14 = 7;
                                        break;
                                    }
                                    default: {
                                        s2 = s1;
                                        s3 = s;
                                        v14 = v3;
                                    }
                                }
                            }
                            azyi azyi0 = new azyi(new MethodInvocation(v13, v14, v10, v11, v12, s3, s2, v5, v9), v8, ((long)v6), v7);
                            Message message0 = azxm0.n.obtainMessage(18, azyi0);
                            azxm0.n.sendMessage(message0);
                        }
                        else {
                            v4 &= rootTelemetryConfiguration0.c;
                            v6 = rootTelemetryConfiguration0.d;
                            v7 = rootTelemetryConfiguration0.e;
                            v8 = rootTelemetryConfiguration0.a;
                            if(((baqp)azsz0).T() && !((baqp)azsz0).B()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = azyh.b(azxi0, ((baqp)azsz0), this.b);
                                if(connectionTelemetryConfiguration0 != null) {
                                    if(!connectionTelemetryConfiguration0.c || v1 <= 0) {
                                        v2 = 0;
                                    }
                                    v7 = connectionTelemetryConfiguration0.e;
                                    v4 = v2;
                                    goto label_30;
                                }
                            }
                            else {
                                goto label_30;
                            }
                        }
                    }
                }
            }
        }
    }
}

