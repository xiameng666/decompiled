import android.service.timezone.TimeZoneProviderSuggestion;

public interface btdi {
    void reportPermanentFailure(Throwable arg1);

    void reportSuggestion(TimeZoneProviderSuggestion arg1);

    void reportUncertain();
}

