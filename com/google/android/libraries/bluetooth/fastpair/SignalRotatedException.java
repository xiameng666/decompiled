package com.google.android.libraries.bluetooth.fastpair;

public class SignalRotatedException extends PairingException {
    public final String a;

    public SignalRotatedException(String s, Exception exception0) {
        super("Address rotated", new Object[0]);
        this.a = s;
        this.initCause(exception0);
    }
}

