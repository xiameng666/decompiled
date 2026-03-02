package org.webrtc;

import java.util.Arrays;

public class IceCandidate {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final PeerConnection.AdapterType e;

    public IceCandidate(String s, int v, String s1) {
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = "";
        this.e = PeerConnection.AdapterType.a;
    }

    IceCandidate(String s, int v, String s1, String s2, PeerConnection.AdapterType peerConnection$AdapterType0) {
        this.a = s;
        this.b = v;
        this.c = s1;
        this.d = s2;
        this.e = peerConnection$AdapterType0;
    }

    private static boolean a(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof IceCandidate) ? IceCandidate.a(this.a, ((IceCandidate)object0).a) && this.b == ((IceCandidate)object0).b && IceCandidate.a(this.c, ((IceCandidate)object0).c) : false;
    }

    String getSdp() {
        return this.c;
    }

    int getSdpMLineIndex() {
        return this.b;
    }

    String getSdpMid() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c});
    }

    @Override
    public final String toString() {
        return this.a + ":" + this.b + ":" + this.c + ":" + this.d + ":" + this.e.toString();
    }
}

