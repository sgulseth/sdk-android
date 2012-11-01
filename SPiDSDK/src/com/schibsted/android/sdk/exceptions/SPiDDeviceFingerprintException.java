package com.schibsted.android.sdk.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: mikaellindstrom
 * Date: 10/31/12
 * Time: 1:49 PM
 */
public class SPiDDeviceFingerprintException extends SPiDException {

    public SPiDDeviceFingerprintException(String msg) {
        super(msg);
    }

    public SPiDDeviceFingerprintException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
