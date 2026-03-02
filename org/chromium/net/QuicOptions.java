package org.chromium.net;

import j..util.DesugarCollections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class QuicOptions {
    private final Set mClientConnectionOptions;
    private final Boolean mCloseSessionsOnIpChange;
    private final Set mConnectionOptions;
    private final Long mCryptoHandshakeTimeoutSeconds;
    private final Boolean mDelayJobsWithAvailableSpdySession;
    private final Boolean mEnableTlsZeroRtt;
    private final Set mEnabledQuicVersions;
    private final Set mExtraQuicheFlags;
    private final Boolean mGoawaySessionsOnIpChange;
    private final String mHandshakeUserAgent;
    private final Long mIdleConnectionTimeoutSeconds;
    private final Integer mInMemoryServerConfigsCacheSize;
    private final Boolean mIncreaseBrokenServicePeriodExponentially;
    private final Long mInitialBrokenServicePeriodSeconds;
    private final Long mPreCryptoHandshakeIdleTimeoutSeconds;
    private final Set mQuicHostAllowlist;
    private final Long mRetransmittableOnWireTimeoutMillis;
    private final Boolean mRetryWithoutAltSvcOnQuicErrors;

    public QuicOptions(QuicOptions.Builder quicOptions$Builder0) {
        this.mQuicHostAllowlist = DesugarCollections.unmodifiableSet(new LinkedHashSet(quicOptions$Builder0.mQuicHostAllowlist));
        this.mEnabledQuicVersions = DesugarCollections.unmodifiableSet(new LinkedHashSet(quicOptions$Builder0.mEnabledQuicVersions));
        this.mConnectionOptions = DesugarCollections.unmodifiableSet(new LinkedHashSet(quicOptions$Builder0.mConnectionOptions));
        this.mClientConnectionOptions = DesugarCollections.unmodifiableSet(new LinkedHashSet(quicOptions$Builder0.mClientConnectionOptions));
        this.mInMemoryServerConfigsCacheSize = quicOptions$Builder0.mInMemoryServerConfigsCacheSize;
        this.mHandshakeUserAgent = quicOptions$Builder0.mHandshakeUserAgent;
        this.mRetryWithoutAltSvcOnQuicErrors = quicOptions$Builder0.mRetryWithoutAltSvcOnQuicErrors;
        this.mEnableTlsZeroRtt = quicOptions$Builder0.mEnableTlsZeroRtt;
        this.mPreCryptoHandshakeIdleTimeoutSeconds = quicOptions$Builder0.mPreCryptoHandshakeIdleTimeoutSeconds;
        this.mCryptoHandshakeTimeoutSeconds = quicOptions$Builder0.mCryptoHandshakeTimeoutSeconds;
        this.mIdleConnectionTimeoutSeconds = quicOptions$Builder0.mIdleConnectionTimeoutSeconds;
        this.mRetransmittableOnWireTimeoutMillis = quicOptions$Builder0.mRetransmittableOnWireTimeoutMillis;
        this.mCloseSessionsOnIpChange = quicOptions$Builder0.mCloseSessionsOnIpChange;
        this.mGoawaySessionsOnIpChange = quicOptions$Builder0.mGoawaySessionsOnIpChange;
        this.mInitialBrokenServicePeriodSeconds = quicOptions$Builder0.mInitialBrokenServicePeriodSeconds;
        this.mIncreaseBrokenServicePeriodExponentially = quicOptions$Builder0.mIncreaseBrokenServicePeriodExponentially;
        this.mDelayJobsWithAvailableSpdySession = quicOptions$Builder0.mDelayJobsWithAvailableSpdySession;
        this.mExtraQuicheFlags = DesugarCollections.unmodifiableSet(new LinkedHashSet(quicOptions$Builder0.mExtraQuicheFlags));
    }

    public static QuicOptions.Builder builder() {
        return new QuicOptions.Builder();
    }

    public Set getClientConnectionOptions() {
        return this.mClientConnectionOptions;
    }

    public Boolean getCloseSessionsOnIpChange() {
        return this.mCloseSessionsOnIpChange;
    }

    public Set getConnectionOptions() {
        return this.mConnectionOptions;
    }

    public Long getCryptoHandshakeTimeoutSeconds() {
        return this.mCryptoHandshakeTimeoutSeconds;
    }

    public Boolean getDelayJobsWithAvailableSpdySession() {
        return this.mDelayJobsWithAvailableSpdySession;
    }

    public Boolean getEnableTlsZeroRtt() {
        return this.mEnableTlsZeroRtt;
    }

    public Set getEnabledQuicVersions() {
        return this.mEnabledQuicVersions;
    }

    public Set getExtraQuicheFlags() {
        return this.mExtraQuicheFlags;
    }

    public Boolean getGoawaySessionsOnIpChange() {
        return this.mGoawaySessionsOnIpChange;
    }

    public String getHandshakeUserAgent() {
        return this.mHandshakeUserAgent;
    }

    public Long getIdleConnectionTimeoutSeconds() {
        return this.mIdleConnectionTimeoutSeconds;
    }

    public Integer getInMemoryServerConfigsCacheSize() {
        return this.mInMemoryServerConfigsCacheSize;
    }

    public Boolean getIncreaseBrokenServicePeriodExponentially() {
        return this.mIncreaseBrokenServicePeriodExponentially;
    }

    public Long getInitialBrokenServicePeriodSeconds() {
        return this.mInitialBrokenServicePeriodSeconds;
    }

    public Long getPreCryptoHandshakeIdleTimeoutSeconds() {
        return this.mPreCryptoHandshakeIdleTimeoutSeconds;
    }

    public Set getQuicHostAllowlist() {
        return this.mQuicHostAllowlist;
    }

    public Long getRetransmittableOnWireTimeoutMillis() {
        return this.mRetransmittableOnWireTimeoutMillis;
    }

    public Boolean getRetryWithoutAltSvcOnQuicErrors() {
        return this.mRetryWithoutAltSvcOnQuicErrors;
    }
}

