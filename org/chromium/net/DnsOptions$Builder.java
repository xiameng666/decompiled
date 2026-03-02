package org.chromium.net;

import j..time.Duration;
import j..util.Objects;

public final class DnsOptions.Builder {
    private Boolean mEnableStaleDns;
    private Boolean mPersistHostCache;
    private Long mPersistHostCachePeriodMillis;
    private Boolean mPreestablishConnectionsToStaleDnsResults;
    private DnsOptions.StaleDnsOptions mStaleDnsOptions;
    private Boolean mUseBuiltInDnsResolver;

    static Boolean -$$Nest$fgetmEnableStaleDns(DnsOptions.Builder dnsOptions$Builder0) {
        return dnsOptions$Builder0.mEnableStaleDns;
    }

    static Boolean -$$Nest$fgetmPersistHostCache(DnsOptions.Builder dnsOptions$Builder0) {
        return dnsOptions$Builder0.mPersistHostCache;
    }

    static Long -$$Nest$fgetmPersistHostCachePeriodMillis(DnsOptions.Builder dnsOptions$Builder0) {
        return dnsOptions$Builder0.mPersistHostCachePeriodMillis;
    }

    static Boolean -$$Nest$fgetmPreestablishConnectionsToStaleDnsResults(DnsOptions.Builder dnsOptions$Builder0) {
        return dnsOptions$Builder0.mPreestablishConnectionsToStaleDnsResults;
    }

    static DnsOptions.StaleDnsOptions -$$Nest$fgetmStaleDnsOptions(DnsOptions.Builder dnsOptions$Builder0) {
        return dnsOptions$Builder0.mStaleDnsOptions;
    }

    static Boolean -$$Nest$fgetmUseBuiltInDnsResolver(DnsOptions.Builder dnsOptions$Builder0) {
        return dnsOptions$Builder0.mUseBuiltInDnsResolver;
    }

    public DnsOptions build() {
        return new DnsOptions(this);
    }

    public DnsOptions.Builder enableStaleDns(boolean z) {
        this.mEnableStaleDns = Boolean.valueOf(z);
        return this;
    }

    public DnsOptions.Builder persistHostCache(boolean z) {
        this.mPersistHostCache = Boolean.valueOf(z);
        return this;
    }

    public DnsOptions.Builder preestablishConnectionsToStaleDnsResults(boolean z) {
        this.mPreestablishConnectionsToStaleDnsResults = Boolean.valueOf(z);
        return this;
    }

    public DnsOptions.Builder setPersistDelay(Duration duration0) {
        Objects.requireNonNull(duration0);
        this.setPersistHostCachePeriodMillis(duration0.toMillis());
        return this;
    }

    public DnsOptions.Builder setPersistHostCachePeriodMillis(long v) {
        this.mPersistHostCachePeriodMillis = v;
        return this;
    }

    public DnsOptions.Builder setStaleDnsOptions(DnsOptions.StaleDnsOptions.Builder dnsOptions$StaleDnsOptions$Builder0) {
        this.setStaleDnsOptions(dnsOptions$StaleDnsOptions$Builder0.build());
        return this;
    }

    public DnsOptions.Builder setStaleDnsOptions(DnsOptions.StaleDnsOptions dnsOptions$StaleDnsOptions0) {
        this.mStaleDnsOptions = dnsOptions$StaleDnsOptions0;
        return this;
    }

    public DnsOptions.Builder useBuiltInDnsResolver(boolean z) {
        this.mUseBuiltInDnsResolver = Boolean.valueOf(z);
        return this;
    }
}

