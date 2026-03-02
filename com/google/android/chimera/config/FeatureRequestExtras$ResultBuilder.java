package com.google.android.chimera.config;

import android.content.Intent;
import android.os.Bundle;

public class FeatureRequestExtras.ResultBuilder {
    private int a;
    private long b;
    private long c;

    public void addToIntent(Intent intent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("download_status", this.a);
        bundle0.putLong("module_download_activity_duration_millis", this.b);
        bundle0.putLong("module_download_activity_foreground_duration_millis", this.c);
        intent0.putExtra("chimera.feature_response_bundle", bundle0);
    }

    public FeatureRequestExtras.ResultBuilder setDownloadResult(int v) {
        this.a = v;
        return this;
    }

    public FeatureRequestExtras.ResultBuilder setModuleDownloadActivityDurationMillis(long v) {
        this.b = v;
        return this;
    }

    public FeatureRequestExtras.ResultBuilder setModuleDownloadActivityForegroundDurationMillis(long v) {
        this.c = v;
        return this;
    }
}

