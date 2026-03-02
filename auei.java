import com.google.android.gms.cast.framework.devicesuggestions.DeviceSuggestionResult;
import java.util.Map;

public final class auei {
    public final auek a;
    public aufc b;
    public final Map c;
    public DeviceSuggestionResult d;

    public auei(auek auek0, Map map0) {
        this.a = auek0;
        this.b = null;
        this.c = map0;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof auei)) {
            return false;
        }
        if(!ibuq.m(this.a, ((auei)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((auei)object0).b)) {
            return false;
        }
        return ibuq.m(this.c, ((auei)object0).c) ? ibuq.m(this.d, ((auei)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = ((this.a.hashCode() * 0x1F + (this.b == null ? 0 : this.b.hashCode())) * 0x1F + this.c.hashCode()) * 0x1F;
        DeviceSuggestionResult deviceSuggestionResult0 = this.d;
        if(deviceSuggestionResult0 != null) {
            v = deviceSuggestionResult0.hashCode();
        }
        return v1 + v;
    }

    @Override
    public final String toString() {
        return "SuggestionsMetadata(deviceSuggestionsIntentEngine=" + this.a + ", proxyRouterWrapper=" + this.b + ", routesMap=" + this.c + ", cachedDeviceSuggestion=" + this.d + ")";
    }
}

