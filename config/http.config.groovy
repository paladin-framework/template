import com.auth0.jwt.algorithms.Algorithm

/**
 * The HTTP Server configuration
 *
 * Here is defined the HTTP server configuration.
 * Paladin uses Apache HTTP (NIO) Components as HTTP 1.1 Server.
 * > See https://paladin-framework.github.io/paladin-docs/HTTP.html
 */

[
    /**
     * Change to 443 if using https
     */
    port: 80,

    /**
     * HTTPS Settings
     */
    https: false,
    httpsKeystore: 'keystore.jks',
    httpsKeystoreSecret: 'my-secret',

    /**
     * The hashing algorithm used in JWT, please change YOUR_SECRET
     */
    authAlgorithm: Algorithm.HMAC256('YOUR_SECRET')
]