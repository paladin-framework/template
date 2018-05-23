import com.example.myproject.http.*

import java.util.concurrent.TimeUnit

/**
 * The Application Configuration
 *
 * Here is defined the application core parameters, such as
 * the server port or the classes used in your app.
 * > See https://paladin-framework.github.io/paladin-docs/Configuration.html
 */

[
    sessionDuration: TimeUnit.DAYS.toMillis(61), // 2 Months

    /**
     * The app controllers, call them whatever you want to
     */
    controllers: [
        hello: HelloController,
        auth: AuthController
    ],

    /**
     * Route middlewares (applied on selected routes in /routes.groovy )
     */
    routeMiddlewares: [
        example: ExampleMiddleware
    ],

    /**
     * Global middlewares (applied on all routes)
     */
    globalMiddlewares: [
        // Remove comment if you want your API to be callable from any website
        // AcceptCrossOriginRequestsMiddleware
    ]
]