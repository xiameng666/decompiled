package com.google.android.libraries.bluetooth.fastpair;

public class SignalLostException extends PairingException {
    public SignalLostException(Exception exception0) {
        super("Signal lost", new Object[0]);
        this.initCause(exception0);
    }
}

