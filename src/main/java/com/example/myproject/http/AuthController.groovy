package com.example.myproject.http

import com.example.myproject.auth.AuthService
import com.example.myproject.auth.User
import fr.litarvan.paladin.Session
import fr.litarvan.paladin.http.Controller
import fr.litarvan.paladin.http.routing.RequestParams

import javax.inject.Inject

class AuthController extends Controller
{
    @Inject
    private AuthService auth;

    @RequestParams(required = ['username', 'password']) // Request params must be method first arguments
    def login(String username, String password, Session session /* Automatically created and injected */ )
    {
        def user = auth.login(username, password)
        session[User] = user // We save it for further use !

        [ // 'return' keyword is not required
            token: session.token, // JWT token, must be sent back in header Authorization: Bearer <token>
            user: user
        ] // Will be automatically translated to JSON
    }

    def logout(Session session)
    {
        session.delete(User)
        true
    }
}
