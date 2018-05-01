import com.example.myproject.http.*

/**
 * The Application Configuration
 *
 * Here is defined the application core parameters, such as
 * the server port or the classes used in your app.
 * > See https://paladin-framework.github.io/paladin-docs/Configuration.html
 */

[
    /**
     * The app controllers, call them whatever you want to
     */
    controllers: [
        hello: HelloController,
        auth: AuthController
    ]
]