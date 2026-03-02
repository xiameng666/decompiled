package com.google.android.wallet.imageprocessing.processors;

import com.google.android.wallet.imageprocessing.base.Boundaries;
import com.google.android.wallet.imageprocessing.base.Quadrilateral;

public class StrictCardDetector.Result {
    public final Boundaries a;
    public final Quadrilateral b;

    public StrictCardDetector.Result(Boundaries boundaries0, Quadrilateral quadrilateral0) {
        this.a = boundaries0;
        this.b = quadrilateral0;
    }
}

