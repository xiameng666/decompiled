package com.google.android.nearby.presence.rust;

public abstract class V1DataElement {
    public abstract V1DataElement.Generic a();

    public static String b(byte[] arr_b, int v) {
        if(arr_b == null) {
            return "null";
        }
        if(arr_b.length == 0) {
            return "[]";
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 5 + 2);
        int v1 = 0;
        for(boolean z = true; v1 < arr_b.length; z = false) {
            int v2 = arr_b[v1];
            if(z) {
                stringBuilder0.append("[");
            }
            else {
                stringBuilder0.append(", ");
            }
            if(v - 1 == 0) {
                stringBuilder0.append(String.format("%02x", ((int)(((byte)v2) & 0xFF))));
            }
            else {
                stringBuilder0.append(((byte)v2) & 0xFF);
            }
            ++v1;
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

