package org.webrtc;

import java.util.Map;

public class RTCStatsReport {
    public final Map a;
    private final long b;

    public RTCStatsReport(long v, Map map0) {
        this.b = v;
        this.a = map0;
    }

    private static RTCStatsReport create(long v, Map map0) {
        return new RTCStatsReport(v, map0);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("{ timestampUs: ");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", stats: [\n");
        boolean z = true;
        for(Object object0: this.a.values()) {
            if(!z) {
                stringBuilder0.append(",\n");
            }
            stringBuilder0.append(((RTCStats)object0));
            z = false;
        }
        stringBuilder0.append(" ] }");
        return stringBuilder0.toString();
    }
}

