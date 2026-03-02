package org.webrtc;

import java.util.List;

public class PeerConnection.RTCConfiguration {
    public final PeerConnection.IceTransportsType a;
    public final List b;
    public final PeerConnection.BundlePolicy c;
    public final PeerConnection.RtcpMuxPolicy d;
    public final PeerConnection.TcpCandidatePolicy e;
    public final PeerConnection.CandidateNetworkPolicy f;
    public int g;
    public final PeerConnection.KeyType h;
    public final PeerConnection.ContinualGatheringPolicy i;
    public final PeerConnection.PortPrunePolicy j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public boolean o;
    public final PeerConnection.AdapterType p;
    public PeerConnection.SdpSemantics q;

    public PeerConnection.RTCConfiguration(List list0) {
        this.a = PeerConnection.IceTransportsType.d;
        this.c = PeerConnection.BundlePolicy.a;
        this.d = PeerConnection.RtcpMuxPolicy.b;
        this.e = PeerConnection.TcpCandidatePolicy.a;
        this.f = PeerConnection.CandidateNetworkPolicy.a;
        this.b = list0;
        this.g = -1;
        this.h = PeerConnection.KeyType.b;
        this.i = PeerConnection.ContinualGatheringPolicy.a;
        this.j = PeerConnection.PortPrunePolicy.a;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = PeerConnection.AdapterType.a;
        this.q = PeerConnection.SdpSemantics.b;
    }

    boolean getActiveResetSrtpParams() {
        return false;
    }

    boolean getAudioJitterBufferFastAccelerate() {
        return false;
    }

    int getAudioJitterBufferMaxPackets() {
        return 200;
    }

    PeerConnection.BundlePolicy getBundlePolicy() {
        return this.c;
    }

    PeerConnection.CandidateNetworkPolicy getCandidateNetworkPolicy() {
        return this.f;
    }

    RtcCertificatePem getCertificate() {
        return null;
    }

    PeerConnection.ContinualGatheringPolicy getContinualGatheringPolicy() {
        return this.i;
    }

    CryptoOptions getCryptoOptions() {
        return null;
    }

    boolean getDisableIPv6OnWifi() {
        return false;
    }

    boolean getEnableCpuOveruseDetection() {
        return true;
    }

    boolean getEnableDscp() {
        return this.o;
    }

    boolean getEnableImplicitRollback() {
        return false;
    }

    int getIceBackupCandidatePairPingInterval() {
        return -1;
    }

    int getIceCandidatePoolSize() {
        return 0;
    }

    Integer getIceCheckIntervalStrongConnectivity() {
        return this.k;
    }

    Integer getIceCheckIntervalWeakConnectivity() {
        return this.l;
    }

    Integer getIceCheckMinInterval() {
        return null;
    }

    int getIceConnectionReceivingTimeout() {
        return this.g;
    }

    List getIceServers() {
        return this.b;
    }

    PeerConnection.IceTransportsType getIceTransportsType() {
        return this.a;
    }

    Integer getIceUnwritableMinChecks() {
        return null;
    }

    Integer getIceUnwritableTimeout() {
        return null;
    }

    PeerConnection.KeyType getKeyType() {
        return this.h;
    }

    int getMaxIPv6Networks() {
        return 5;
    }

    PeerConnection.AdapterType getNetworkPreference() {
        return this.p;
    }

    boolean getOfferExtmapAllowMixed() {
        return true;
    }

    int getPortAllocatorFlags() {
        return 0;
    }

    int getPortAllocatorMaxPort() {
        return 0;
    }

    int getPortAllocatorMinPort() {
        return 0;
    }

    boolean getPresumeWritableWhenFullyRelayed() {
        return false;
    }

    boolean getPruneTurnPorts() {
        return false;
    }

    PeerConnection.RtcpMuxPolicy getRtcpMuxPolicy() {
        return this.d;
    }

    Integer getScreencastMinBitrate() {
        return null;
    }

    PeerConnection.SdpSemantics getSdpSemantics() {
        return this.q;
    }

    Integer getStableWritableConnectionPingIntervalMs() {
        return this.n;
    }

    Integer getStunCandidateKeepaliveInterval() {
        return this.m;
    }

    boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
        return false;
    }

    boolean getSuspendBelowMinBitrate() {
        return false;
    }

    PeerConnection.TcpCandidatePolicy getTcpCandidatePolicy() {
        return this.e;
    }

    TurnCustomizer getTurnCustomizer() {
        return null;
    }

    String getTurnLoggingId() {
        return null;
    }

    PeerConnection.PortPrunePolicy getTurnPortPrunePolicy() {
        return this.j;
    }
}

