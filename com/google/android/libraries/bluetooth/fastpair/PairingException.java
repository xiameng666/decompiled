package com.google.android.libraries.bluetooth.fastpair;

public class PairingException extends Exception {
    public PairingException(String s, Object[] arr_object) {
        super(String.format(s, arr_object));
    }
}

