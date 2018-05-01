package com.example.myproject.http

import com.example.myproject.auth.User
import fr.litarvan.paladin.http.Controller

class HelloController extends Controller
{
    def hello(User user /* Automatically injected from session */ )
    {
        def name = user == null ? 'unknown user' : user.name

        [  // 'return' keyword is not required
            greeting: "Hello, ${name}"
        ] // Will be automatically translated to JSON
    }
}
