package com.google.android.nearby.presence.rust;

import fzcq;

public final class DeserializeResult implements AutoCloseable {
    public final int a;
    public final fzcq b;

    public DeserializeResult(int v) {
        if(v > 0) {
            throw new IllegalArgumentException("Cannot create empty DeserializeResult with non-error kind");
        }
        this.a = v;
        this.b = null;
    }

    DeserializeResult(DeserializedV0Advertisement deserializedV0Advertisement0) {
        this.a = 1;
        this.b = deserializedV0Advertisement0;
    }

    DeserializeResult(DeserializedV1Advertisement deserializedV1Advertisement0) {
        this.a = 2;
        this.b = deserializedV1Advertisement0;
    }

    @Override
    public final void close() {
        fzcq fzcq0 = this.b;
        if(fzcq0 != null) {
            fzcq0.close();
        }
    }
}

