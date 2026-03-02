package com.google.autofill.detection.ml;

public final class StringMatchingSignal.Builder {
    private final DataProducer stringProducer;

    private StringMatchingSignal.Builder(DataProducer dataProducer0) {
        this.stringProducer = dataProducer0;
    }

    public StringMatchingSignal.Builder(DataProducer dataProducer0, StringMatchingSignal-IA stringMatchingSignal-IA0) {
        this(dataProducer0);
    }

    public StringMatchingSignal contains(String s) {
        return new StringMatchingSignal(this.stringProducer, StringMatchingSignal.MatchingOperation.CONTAINS, true, s, null);
    }

    public StringMatchingSignal containsWord(String s) {
        return new StringMatchingSignal(this.stringProducer, StringMatchingSignal.MatchingOperation.CONTAINS_WORD, true, s, null);
    }

    public StringMatchingSignal matches(String s) {
        return new StringMatchingSignal(this.stringProducer, StringMatchingSignal.MatchingOperation.MATCHES_ENTIRE, true, s, null);
    }
}

