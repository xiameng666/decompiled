package com.google.android.gms.location.weather.collector;

import android.content.Context;
import android.content.Intent;
import bauc;
import bbrd;
import cnxt;
import cnyw;
import cnzk;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.location.internal.WeatherCollectorTestingRequest;
import j..util.Objects;

public class WeatherCollector.2 extends TracingBroadcastReceiver {
    final cnyw a;

    public WeatherCollector.2(cnyw cnyw0) {
        Objects.requireNonNull(cnyw0);
        this.a = cnyw0;
        super("WCollector");
    }

    @Override  // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void kA(Context context0, Intent intent0) {
        String s = intent0.getAction();
        if(s != null && s.equals("com.google.android.gms.location.weather.collector.intent.action.WEATHER_COLLECTOR_TESTING")) {
            byte[] arr_b = intent0.getByteArrayExtra("com.google.android.gms.location.internal.EXTRA_WEATHER_COLLECTOR_REQUEST");
            WeatherCollectorTestingRequest weatherCollectorTestingRequest0 = arr_b == null ? null : ((WeatherCollectorTestingRequest)bauc.a(arr_b, WeatherCollectorTestingRequest.CREATOR));
            if(weatherCollectorTestingRequest0 != null) {
                if(weatherCollectorTestingRequest0.a(1L)) {
                    this.a.f(cnzk.d);
                }
                if(weatherCollectorTestingRequest0.a(2L)) {
                    cnxt.d(context0, "WCollector", 0L, 0L, true, false, false, bbrd.b(context0, "com.google.android.gms"), this.a);
                }
            }
        }
    }
}

