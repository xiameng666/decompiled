package com.google.android.gms.autofill.service.common;

import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;
import gfsx;

public interface ClientState extends Parcelable {
    MetricsContext a();

    IDetectionHistory b();

    gfsx c();

    gfsx d();

    void e(gfsx arg1);

    void f(IDetectionHistory arg1);

    void g(gfsx arg1);

    void h(MetricsContext arg1);

    void i(byte[] arg1);

    byte[] j();
}

