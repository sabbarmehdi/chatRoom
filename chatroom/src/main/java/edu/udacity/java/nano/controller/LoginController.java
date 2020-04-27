package edu.udacity.java.nano.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class LoginController {

    /**
     * Login Page
     */
    @GetMapping("/")
    public ModelAndView login() {

        return new ModelAndView("/login");
    }

    /**
     * Chatroom Page
     */
    @GetMapping("/index")
    public ModelAndView index(String username, HttpServletRequest request) throws UnknownHostException {
     System.out.println(String.format("Logging in by username"));
     if (username == null || username.isEmpty())
         username = "GUEST" + System.currentTimeMillis();
     ModelAndView chatMav = new ModelAndView("chat");
     chatMav.addObject("username", username);
     chatMav.addObject("webSocketUrl", String.format("ws://%s:%s%s/chat", InetAddress.getLocalHost().getHostAddress(),
             request.getContextPath(), username));
     return chatMav;
    }
}
