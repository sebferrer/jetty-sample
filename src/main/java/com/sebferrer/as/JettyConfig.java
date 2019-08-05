package com.sebferrer.as;

/**
 * All configuration parameters relative to the Jetty runtime
 */
public class JettyConfig {
    public static final int HTTP_PORT = 8080;
    public static final int HTTPS_PORT = 9999;
    public static final boolean ENABLE_SSL = false;
    public static final String KEYSTORE_FILE = ""; // To set if ENABLE_SSL is true
    public static final String KEYSTORE_PWD = "";  // To set if ENABLE_SSL is true
    public static final String KEYSTORE_MANAGER_PWD = "";  // To set if ENABLE_SSL is true
}
