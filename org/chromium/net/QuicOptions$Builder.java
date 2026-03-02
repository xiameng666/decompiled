package org.chromium.net;

import j..time.Duration;
import j..util.Objects;
import java.util.LinkedHashSet;
import java.util.Set;

public class QuicOptions.Builder {
    private final Set mClientConnectionOptions;
    private Boolean mCloseSessionsOnIpChange;
    private final Set mConnectionOptions;
    private Long mCryptoHandshakeTimeoutSeconds;
    private Boolean mDelayJobsWithAvailableSpdySession;
    private Boolean mEnableTlsZeroRtt;
    private final Set mEnabledQuicVersions;
    private final Set mExtraQuicheFlags;
    private Boolean mGoawaySessionsOnIpChange;
    private String mHandshakeUserAgent;
    private Long mIdleConnectionTimeoutSeconds;
    private Integer mInMemoryServerConfigsCacheSize;
    private Boolean mIncreaseBrokenServicePeriodExponentially;
    private Long mInitialBrokenServicePeriodSeconds;
    private Long mPreCryptoHandshakeIdleTimeoutSeconds;
    private final Set mQuicHostAllowlist;
    private Long mRetransmittableOnWireTimeoutMillis;
    private Boolean mRetryWithoutAltSvcOnQuicErrors;

    static Set -$$Nest$fgetmClientConnectionOptions(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mClientConnectionOptions;
    }

    static Boolean -$$Nest$fgetmCloseSessionsOnIpChange(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mCloseSessionsOnIpChange;
    }

    static Set -$$Nest$fgetmConnectionOptions(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mConnectionOptions;
    }

    static Long -$$Nest$fgetmCryptoHandshakeTimeoutSeconds(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mCryptoHandshakeTimeoutSeconds;
    }

    static Boolean -$$Nest$fgetmDelayJobsWithAvailableSpdySession(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mDelayJobsWithAvailableSpdySession;
    }

    static Boolean -$$Nest$fgetmEnableTlsZeroRtt(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mEnableTlsZeroRtt;
    }

    static Set -$$Nest$fgetmEnabledQuicVersions(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mEnabledQuicVersions;
    }

    static Set -$$Nest$fgetmExtraQuicheFlags(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mExtraQuicheFlags;
    }

    static Boolean -$$Nest$fgetmGoawaySessionsOnIpChange(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mGoawaySessionsOnIpChange;
    }

    static String -$$Nest$fgetmHandshakeUserAgent(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mHandshakeUserAgent;
    }

    static Long -$$Nest$fgetmIdleConnectionTimeoutSeconds(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mIdleConnectionTimeoutSeconds;
    }

    static Integer -$$Nest$fgetmInMemoryServerConfigsCacheSize(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mInMemoryServerConfigsCacheSize;
    }

    static Boolean -$$Nest$fgetmIncreaseBrokenServicePeriodExponentially(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mIncreaseBrokenServicePeriodExponentially;
    }

    static Long -$$Nest$fgetmInitialBrokenServicePeriodSeconds(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mInitialBrokenServicePeriodSeconds;
    }

    static Long -$$Nest$fgetmPreCryptoHandshakeIdleTimeoutSeconds(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mPreCryptoHandshakeIdleTimeoutSeconds;
    }

    static Set -$$Nest$fgetmQuicHostAllowlist(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mQuicHostAllowlist;
    }

    static Long -$$Nest$fgetmRetransmittableOnWireTimeoutMillis(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mRetransmittableOnWireTimeoutMillis;
    }

    static Boolean -$$Nest$fgetmRetryWithoutAltSvcOnQuicErrors(QuicOptions.Builder quicOptions$Builder0) {
        return quicOptions$Builder0.mRetryWithoutAltSvcOnQuicErrors;
    }

    public QuicOptions.Builder() {
        this.mQuicHostAllowlist = new LinkedHashSet();
        this.mEnabledQuicVersions = new LinkedHashSet();
        this.mConnectionOptions = new LinkedHashSet();
        this.mClientConnectionOptions = new LinkedHashSet();
        this.mExtraQuicheFlags = new LinkedHashSet();
    }

    public QuicOptions.Builder addAllowedQuicHost(String s) {
        this.mQuicHostAllowlist.add(s);
        return this;
    }

    public QuicOptions.Builder addClientConnectionOption(String s) {
        this.mClientConnectionOptions.add(s);
        return this;
    }

    public QuicOptions.Builder addConnectionOption(String s) {
        this.mConnectionOptions.add(s);
        return this;
    }

    public QuicOptions.Builder addEnabledQuicVersion(String s) {
        this.mEnabledQuicVersions.add(s);
        return this;
    }

    public QuicOptions.Builder addExtraQuicheFlag(String s) {
        this.mExtraQuicheFlags.add(s);
        return this;
    }

    public QuicOptions build() {
        return new QuicOptions(this);
    }

    public QuicOptions.Builder closeSessionsOnIpChange(boolean z) {
        this.mCloseSessionsOnIpChange = Boolean.valueOf(z);
        return this;
    }

    public QuicOptions.Builder delayJobsWithAvailableSpdySession(boolean z) {
        this.mDelayJobsWithAvailableSpdySession = Boolean.valueOf(z);
        return this;
    }

    public QuicOptions.Builder enableTlsZeroRtt(boolean z) {
        this.mEnableTlsZeroRtt = Boolean.valueOf(z);
        return this;
    }

    public QuicOptions.Builder goawaySessionsOnIpChange(boolean z) {
        this.mGoawaySessionsOnIpChange = Boolean.valueOf(z);
        return this;
    }

    public QuicOptions.Builder increaseBrokenServicePeriodExponentially(boolean z) {
        this.mIncreaseBrokenServicePeriodExponentially = Boolean.valueOf(z);
        return this;
    }

    public QuicOptions.Builder retryWithoutAltSvcOnQuicErrors(boolean z) {
        this.mRetryWithoutAltSvcOnQuicErrors = Boolean.valueOf(z);
        return this;
    }

    public QuicOptions.Builder setCryptoHandshakeTimeoutSeconds(long v) {
        this.mCryptoHandshakeTimeoutSeconds = v;
        return this;
    }

    public QuicOptions.Builder setHandshakeUserAgent(String s) {
        this.mHandshakeUserAgent = s;
        return this;
    }

    public QuicOptions.Builder setIdleConnectionTimeout(Duration duration0) {
        Objects.requireNonNull(duration0);
        return this.setIdleConnectionTimeoutSeconds(duration0.toSeconds());
    }

    public QuicOptions.Builder setIdleConnectionTimeoutSeconds(long v) {
        this.mIdleConnectionTimeoutSeconds = v;
        return this;
    }

    public QuicOptions.Builder setInMemoryServerConfigsCacheSize(int v) {
        this.mInMemoryServerConfigsCacheSize = v;
        return this;
    }

    public QuicOptions.Builder setInitialBrokenServicePeriodSeconds(long v) {
        this.mInitialBrokenServicePeriodSeconds = v;
        return this;
    }

    public QuicOptions.Builder setPreCryptoHandshakeIdleTimeoutSeconds(long v) {
        this.mPreCryptoHandshakeIdleTimeoutSeconds = v;
        return this;
    }

    public QuicOptions.Builder setRetransmittableOnWireTimeoutMillis(long v) {
        this.mRetransmittableOnWireTimeoutMillis = v;
        return this;
    }
}

