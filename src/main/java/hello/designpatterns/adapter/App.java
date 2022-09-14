package hello.designpatterns.adapter;

import hello.designpatterns.adapter.security.LoginHandler;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("kkk", "kkk");
        System.out.println("login = " + login);
    }
}
