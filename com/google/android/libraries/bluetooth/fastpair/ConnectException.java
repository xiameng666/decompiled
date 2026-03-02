package com.google.android.libraries.bluetooth.fastpair;

public class ConnectException extends PairingException {
    public final int a;

    public ConnectException(int v, String s, Object[] arr_object) {
        super(s, arr_object);
        this.a = v;
    }
}

