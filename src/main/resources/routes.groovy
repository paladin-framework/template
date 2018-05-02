import com.example.myproject.MyProject
import com.example.myproject.http.AuthController

/**
 * The Routes file
 *
 * Define all your routes here, using a simple scheme :
 * <method> <path>, <controller name | controller class | closure>, [options map: action, middleware]
 *
 * Route groups are also possible :
 * group <path prefix>, {
 *     <routes in the group...>
 * }
 *
 * > See https://paladin-framework.github.io/paladin-docs/Routing.html
 */

get '/hello', 'hello' // Inferred from app config controllers list

group '/auth', { // Same as defining a /auth/login and /auth/logout routes
    post '/login', AuthController // You can do this to
    post '/logout', [
        action: 'auth' // Or this too
    ]
}, [
    middleware: ['example'] // Will apply the route middleware 'example' defined in app.config.groovy on all the group routes
]

get '/version', { // This works too
    MyProject.VERSION
}
