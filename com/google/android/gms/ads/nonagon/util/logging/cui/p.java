package com.google.android.gms.ads.nonagon.util.logging.cui;

import hfub;

public enum p implements hfub {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);

    private final int m;

    private p(int v1) {
        this.m = v1;
    }

    @Override  // hfub
    public final int a() {
        if(this != p.k) {
            return this.m;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    @Override
    public final String toString() {
        return Integer.toString(this.m);
    }
}

