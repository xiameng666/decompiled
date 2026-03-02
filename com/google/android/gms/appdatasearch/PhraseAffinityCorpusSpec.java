package com.google.android.gms.appdatasearch;

import abwb;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map;

public class PhraseAffinityCorpusSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final CorpusId a;
    final Bundle b;

    static {
        PhraseAffinityCorpusSpec.CREATOR = new abwb();
    }

    public PhraseAffinityCorpusSpec(CorpusId corpusId0, Bundle bundle0) {
        this.a = corpusId0;
        this.b = bundle0;
    }

    public final Map a() {
        Map map0 = new HashMap();
        Bundle bundle0 = this.b;
        for(Object object0: bundle0.keySet()) {
            map0.put(((String)object0), Integer.valueOf(bundle0.getInt(((String)object0))));
        }
        return map0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.g(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

